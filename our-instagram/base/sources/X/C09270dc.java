package X;

/* renamed from: X.0dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09270dc {
    public static InterfaceC09280dd A00;

    public static boolean A03(String str) {
        InterfaceC09280dd interfaceC09280dd;
        synchronized (C09270dc.class) {
            interfaceC09280dd = A00;
            if (interfaceC09280dd == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC09280dd.ChX(str, 0);
    }

    public static void A00(InterfaceC09280dd interfaceC09280dd) {
        synchronized (C09270dc.class) {
            if (A00 == null) {
                A00 = interfaceC09280dd;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    public static boolean A02() {
        boolean z;
        synchronized (C09270dc.class) {
            z = false;
            if (A00 != null) {
                z = true;
            }
        }
        return z;
    }

    public static void A01(String str) {
        A03(str);
    }
}
