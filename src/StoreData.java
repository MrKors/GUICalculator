public class StoreData {
    private String resultStore;

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
