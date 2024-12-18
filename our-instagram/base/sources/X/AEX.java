package X;

/* loaded from: classes4.dex */
public abstract class AEX {
    public static Integer A00(String str) {
        if (str.equals("ORANGE")) {
            return C05F.A00;
        }
        if (str.equals("PINK")) {
            return C05F.A01;
        }
        if (str.equals("PURPLE")) {
            return C05F.A0C;
        }
        if (str.equals("BLUE")) {
            return C05F.A0N;
        }
        if (str.equals("RAINBOW")) {
            return C05F.A0Y;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PINK";
            case 2:
                return "PURPLE";
            case 3:
                return "BLUE";
            case 4:
                return "RAINBOW";
            default:
                return "ORANGE";
        }
    }
}
