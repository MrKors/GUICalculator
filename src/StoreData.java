public class StoreData {
    private String resultStore;
    private double resultDouble;
    private int resultInt;
    private boolean typeDouble;

    public boolean isTypeDouble() {
        return typeDouble;
    }

    public void setTypeDouble(boolean typeDouble) {
        this.typeDouble = typeDouble;
    }

    public double getResultDouble() {
        return resultDouble;
    }

    public void setResultDouble(double resultDouble) {
        this.resultDouble = resultDouble;
    }

    public int getResultInt() {
        return resultInt;
    }

    public void setResultInt(int resultInt) {
        this.resultInt = resultInt;
    }

    public String getResultStore() {
        return resultStore;
    }

    public void setResultStore(String resultStore) {
        if (this.resultStore != null) {
            this.resultStore += "\n" + resultStore;
        } else {
            this.resultStore = resultStore;
        }
    }
}
