public enum Season {
    WINTER(-6), SPRING(0), SUMMER(+16){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },

    AUTUMN(+8);
    private final double tem;

    Season(double tem) {
        this.tem = tem;
    }

    public double getTem() {

        return tem;
    }

    public String getDescription(){
        return "Холодное время года";
    }
}
