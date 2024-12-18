package X;

/* loaded from: classes4.dex */
public abstract class AE6 {
    public static Integer A00(String str) {
        if (str.equals("DEFAULT")) {
            return C05F.A00;
        }
        if (str.equals("REEL")) {
            return C05F.A01;
        }
        if (str.equals("COVER_FRAME")) {
            return C05F.A0C;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "REEL";
            case 2:
                return "COVER_FRAME";
            default:
                return "DEFAULT";
        }
    }
}
