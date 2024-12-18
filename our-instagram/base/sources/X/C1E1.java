package X;

/* renamed from: X.1E1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1E1 {
    public static final void A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        try {
            C1E6.A00(C0eB.A00, C1E2.A02(C1E2.A01(obj, interfaceC23621Ds, interfaceC16620sF)));
        } catch (Throwable th) {
            interfaceC23621Ds.resumeWith(new C09540e5(th));
            throw th;
        }
    }

    public static final void A01(InterfaceC23621Ds interfaceC23621Ds, InterfaceC23621Ds interfaceC23621Ds2) {
        try {
            C1E6.A00(C0eB.A00, C1E2.A02(interfaceC23621Ds));
        } catch (Throwable th) {
            interfaceC23621Ds2.resumeWith(new C09540e5(th));
            throw th;
        }
    }
}
