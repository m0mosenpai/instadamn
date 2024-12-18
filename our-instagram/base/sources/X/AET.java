package X;

/* loaded from: classes4.dex */
public abstract class AET {
    public static Integer A00(String str) {
        if (str.equals("IGRTC")) {
            return C05F.A00;
        }
        if (str.equals("MWRTC")) {
            return C05F.A01;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        if (1 - num.intValue() != 0) {
            return "IGRTC";
        }
        return "MWRTC";
    }
}
