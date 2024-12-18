package X;

/* renamed from: X.KiX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46532KiX {
    public static final void A00(C07S c07s, C07T c07t, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, C12T c12t, boolean z) {
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        C48100LRa c48100LRa = new C48100LRa(c07s, c07t, interfaceC16820sZ, A0s);
        if (z) {
            c12t.A05(new RunnableC49916M2j(c07t, c48100LRa), AnonymousClass191.A00);
        } else {
            c07t.A09(c48100LRa);
        }
        A0s.CPA(new DHZ(16, c12t, c07t, c48100LRa));
        A0s.A0E();
    }
}
