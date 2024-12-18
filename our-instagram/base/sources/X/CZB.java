package X;

/* loaded from: classes5.dex */
public abstract class CZB {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 28;
            case 2:
                return 32;
            case 3:
                return 40;
            case 4:
                return 48;
            case 5:
                return 60;
            case 6:
                return 100;
            case 7:
                return 160;
            case 8:
                return 180;
            case 9:
                return 260;
            default:
                return 24;
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DP28";
            case 2:
                return "DP32";
            case 3:
                return "DP40";
            case 4:
                return "DP48";
            case 5:
                return "DP60";
            case 6:
                return "DP100";
            case 7:
                return "DP160";
            case 8:
                return "DP180";
            case 9:
                return "DP260";
            default:
                return "DP24";
        }
    }
}
