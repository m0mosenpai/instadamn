package X;

/* renamed from: X.6BK, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BK {
    public static int A00(C6FG c6fg, C102884kP c102884kP, int i) {
        try {
            if (c6fg.A05) {
                String A0L = c102884kP.A0L(35);
                if (A0L != null) {
                    return C6BE.A03(A0L);
                }
                return i;
            }
            String A0L2 = c102884kP.A0L(36);
            if (A0L2 != null) {
                return C6BE.A03(A0L2);
            }
            return i;
        } catch (C41M unused) {
            AbstractC25241Le.A02("ThemedColorUtils", "Error parsing themed color");
            return i;
        }
    }
}
