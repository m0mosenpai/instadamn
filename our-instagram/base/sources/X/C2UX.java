package X;

/* renamed from: X.2UX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2UX {
    public static int A00;
    public static volatile boolean A01;
    public static volatile InterfaceC693339t A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.39t] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static InterfaceC693339t A00() {
        ?? r0;
        if (A02 == null) {
            int i = A00;
            if (i != 2 && i != 3) {
                if (i != 5) {
                    r0 = new Object();
                } else {
                    r0 = new Object();
                }
            } else {
                r0 = new Object();
            }
            A02 = r0;
        }
        return A02;
    }

    public static String A01() {
        InterfaceC693339t A002 = A00();
        int i = A00;
        if (A002 != null && i != 0) {
            if (!A002.CTj()) {
                return "loading_";
            }
            if (i != 5) {
                if (i != 2) {
                    if (i == 3) {
                        return "compatpart_";
                    }
                    throw new RuntimeException(AnonymousClass001.A0c("Illegal infra state! (", ")", i));
                }
                return "compat_";
            }
            return "fbnotopart_";
        }
        return "system_";
    }
}
