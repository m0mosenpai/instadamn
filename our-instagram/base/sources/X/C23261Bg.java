package X;

/* renamed from: X.1Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23261Bg {
    public static InterfaceC216113n A00;
    public static C63188Sen A01;

    public static synchronized C63188Sen A00() {
        C63188Sen c63188Sen;
        synchronized (C23261Bg.class) {
            if (A01 == null) {
                C18C.A07(A00, "initSupplier() should get call before getInstance()");
                C63188Sen c63188Sen2 = (C63188Sen) A00.get();
                A01 = c63188Sen2;
                c63188Sen2.getClass();
            }
            c63188Sen = A01;
        }
        return c63188Sen;
    }
}
