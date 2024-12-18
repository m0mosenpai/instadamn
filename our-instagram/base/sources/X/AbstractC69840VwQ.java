package X;

/* renamed from: X.VwQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69840VwQ {
    public static Integer A00(String str) {
        if (str.equals("SHIPPING")) {
            return C05F.A00;
        }
        if (str.equals("PICKUP")) {
            return C05F.A01;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        if (1 - num.intValue() != 0) {
            return "SHIPPING";
        }
        return "PICKUP";
    }
}
