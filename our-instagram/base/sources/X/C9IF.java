package X;

/* renamed from: X.9IF, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9IF {
    public static Integer A00(String str) {
        if (str.equals("BACK_ARROW")) {
            return C05F.A00;
        }
        if (str.equals("DOWN_ARROW")) {
            return C05F.A01;
        }
        if (str.equals("CLOSE_X")) {
            return C05F.A0C;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DOWN_ARROW";
            case 2:
                return "CLOSE_X";
            default:
                return "BACK_ARROW";
        }
    }
}
