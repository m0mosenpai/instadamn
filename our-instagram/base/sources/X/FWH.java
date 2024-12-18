package X;

/* loaded from: classes6.dex */
public abstract class FWH {
    public static final Object A01(C3NY c3ny, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        if (c3ny instanceof C3NX) {
            return ((C3NX) c3ny).A00;
        }
        if (c3ny instanceof C194848jk) {
            return interfaceC16660sJ.invoke(c3ny);
        }
        throw B4Z.A00();
    }

    public static final Object A00(C3NY c3ny, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1N(c3ny, interfaceC16660sJ);
        if (c3ny instanceof C3NX) {
            return interfaceC16660sJ.invoke(c3ny);
        }
        if (c3ny instanceof C194848jk) {
            return ((C194848jk) c3ny).A00;
        }
        throw B4Z.A00();
    }
}
