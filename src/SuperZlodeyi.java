public class SuperZlodeyi {
    private static  SuperZlodeyi zlodeyi = null;
    public String name;

    private SuperZlodeyi() {

    }

    public static SuperZlodeyi getZlodeyi (String name){
        if (zlodeyi == null) {
            zlodeyi = new SuperZlodeyi();
            zlodeyi.name = name;
        }
        return zlodeyi;
    }

    public static SuperZlodeyi getZlodeyi() {
        if (zlodeyi == null) {
            zlodeyi = new SuperZlodeyi();
            zlodeyi.name = "Koschey";
        }
        return zlodeyi;
    }

    public void setZlodey(String name) {
        zlodeyi.name = name;
    }

}
