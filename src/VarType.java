public class VarType {
    private boolean isDouble = false;


    public boolean isDouble() {
        return isDouble;
    }

    public void IsDouble(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                isDouble = true;
                break;
            }
        }
    }


}
