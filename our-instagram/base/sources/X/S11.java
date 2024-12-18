package X;

/* loaded from: classes10.dex */
public abstract class S11 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "Unknown";
            case 1:
                return "NoNetwork";
            case 2:
                return "Wifi";
            case 3:
                return "Cell_2G";
            case 4:
                return "Cell_3G";
            case 5:
                return "Cell_4G";
            case 6:
                return "Cell_5G";
            default:
                return "Cell_other";
        }
    }
}
