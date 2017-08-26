package endrawes0.music;

import endrawes0.music.actions.Playable;
import endrawes0.music.exception.TooManyBeatsPerMeasure;
import endrawes0.music.instruments.Instrument;

import java.util.*;

/**
 * Create on 8/23/17.
 */
public class Sheet implements Iterable<Sheet.Measure> {
    private List<Measure> measures = new ArrayList<>();

    private Sheet() {}

    @Override
    public Iterator<Measure> iterator() {
        return measures.iterator();
    }

    public static class Builder {
        private Sheet sheet;

        public Builder(){
            this.sheet = new Sheet();
        }

        public Builder add(Measure measure){
            sheet.measures.add(measure);
            return this;
        }

        public static Builder instance(){
            return new Builder();
        }

        public Sheet build(){
            return sheet;
        }

        public Builder loop(Measure measure, int count) {
            for(int i = 0; i < count; ++i)
                sheet.measures.add(measure);
            return this;
        }
    }


    public static class Measure {
        private TimeSignature timeSignature;
        private Map<Instrument, List<Playable>> instrumentMap = new HashMap<>();

        private Measure(TimeSignature timeSignature){
            this.timeSignature = timeSignature;
        }

        private void newInstrument(Instrument instrument, Playable playable) {
            instrumentMap.put(instrument, new ArrayList<>(Collections.singletonList(playable)));
        }

        private boolean canAdd(Instrument instrument, Playable toAdd){
            List<Playable> playables = instrumentMap.getOrDefault(instrument, new ArrayList<>());

            //sum playables by portion of the measure
            double size = playables
                    .stream()
                    .map(playable -> playable.measurePortion(timeSignature))
                    .reduce((double) 0, (a, b)-> a + b);

            //add new portion
            size = size + toAdd.measurePortion(timeSignature);

            return size <= 1;
        }

        private void add(Instrument instrument, Playable playable){
            instrumentMap.get(instrument).add(playable);
        }

        public List<Playable> getPlayables(Instrument instrument) {
            return instrumentMap.getOrDefault(instrument, new ArrayList<>());
        }

        public TimeSignature getTimeSignature() {
            return timeSignature;
        }

        public static class Builder {
            private Measure measure;
            private Instrument instrument;

            public Builder(TimeSignature timeSignature){
                measure = new Measure(timeSignature);
            }

            public Builder add(Playable playable) throws TooManyBeatsPerMeasure {
                return add(instrument, playable);
            }

            public Builder add(Playable ... plist) throws TooManyBeatsPerMeasure {
                for (Playable p: plist) {
                    add(p);
                }
                return this;
            }

            public Builder add(Instrument instrument, Playable playable) throws TooManyBeatsPerMeasure {
                if(!measure.instrumentMap.containsKey(instrument)){
                    measure.newInstrument(instrument, playable);
                }else{
                    if(measure.canAdd(instrument, playable)){
                        measure.add(instrument, playable);
                    }else{
                        measure.canAdd(instrument, playable);
                        throw new TooManyBeatsPerMeasure();
                    }
                }
                return this;
            }

            public static Builder instance(TimeSignature timeSignature){
                return new Builder(timeSignature);
            }

            public Measure build(){
                return measure;
            }

            public Builder setInstrument(Instrument instrument) {
                this.instrument = instrument;
                return this;
            }
        }

    }

}
