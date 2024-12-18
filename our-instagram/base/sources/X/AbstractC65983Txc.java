package X;

/* renamed from: X.Txc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65983Txc {
    public static int A00(C102884kP c102884kP) {
        String A0L = c102884kP.A0L(42);
        if (A0L != null && !A0L.equals("column")) {
            if (A0L.equals("row")) {
                return 0;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0R("Unknown direction: ", A0L));
        }
        return 1;
    }
}
