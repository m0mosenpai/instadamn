package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11120iT {
    public static C11170iY A00;
    public static C11110iS A01;

    public static synchronized C11110iS A00() {
        C11110iS c11110iS;
        synchronized (C11120iT.class) {
            c11110iS = A01;
            if (c11110iS == null) {
                c11110iS = new C11110iS();
                A01 = c11110iS;
            }
        }
        return c11110iS;
    }

    public static synchronized InterfaceC19300xE A01(InterfaceC11230ie interfaceC11230ie, AbstractC12990ll abstractC12990ll) {
        InterfaceC19300xE interfaceC19300xE;
        synchronized (C11120iT.class) {
            interfaceC11230ie.getClass();
            C11170iY c11170iY = A00;
            if (c11170iY == null) {
                c11170iY = new C11170iY();
                A00 = c11170iY;
            }
            A00().A00 = c11170iY;
            interfaceC19300xE = (InterfaceC19300xE) interfaceC11230ie.BFT(interfaceC11230ie, abstractC12990ll);
            A00().A01.add(new WeakReference(interfaceC19300xE));
        }
        return interfaceC19300xE;
    }
}
