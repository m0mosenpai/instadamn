package X;

/* renamed from: X.5Hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114975Hn {
    public static Integer A00(String str) {
        if (str.equals("UNDEFINED")) {
            return C05F.A00;
        }
        if (str.equals("ORGANIC")) {
            return C05F.A01;
        }
        if (str.equals("AD")) {
            return C05F.A0C;
        }
        if (str.equals("NETEGO")) {
            return C05F.A0N;
        }
        throw new IllegalArgumentException(str);
    }

    public static final boolean A02(Integer num) {
        if (num != C05F.A0C && num != C05F.A0N) {
            return false;
        }
        return true;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ORGANIC";
            case 2:
                return "AD";
            case 3:
                return "NETEGO";
            default:
                return "UNDEFINED";
        }
    }
}
