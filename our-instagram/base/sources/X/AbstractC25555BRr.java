package X;

/* renamed from: X.BRr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25555BRr {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = "unknown";
            } else {
                str2 = "rate";
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C05F.A00;
    }
}
