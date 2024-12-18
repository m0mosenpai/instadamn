package X;

/* renamed from: X.XNy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72104XNy extends C6D6 {
    public final C72091XNl A00;
    public final InterfaceC42061ww A01;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        XML xml = new XML(interfaceC42071wx);
        C72058XMa c72058XMa = new C72058XMa(this.A00, xml);
        xml.Dpc(c72058XMa);
        this.A01.EpF(new C72060XMc(c72058XMa, this));
        super.A00.EpF(c72058XMa);
    }

    public C72104XNy(C72091XNl c72091XNl, InterfaceC42061ww interfaceC42061ww, InterfaceC42061ww interfaceC42061ww2) {
        super(interfaceC42061ww);
        this.A00 = c72091XNl;
        this.A01 = interfaceC42061ww2;
    }
}
