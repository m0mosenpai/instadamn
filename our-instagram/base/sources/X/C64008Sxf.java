package X;

/* renamed from: X.Sxf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64008Sxf implements InterfaceC48192Ji {
    public final /* synthetic */ SCF A00;

    public C64008Sxf(SCF scf) {
        this.A00 = scf;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        InterfaceC23621Ds interfaceC23621Ds;
        Object um0;
        AbstractC907342m A00;
        AbstractC907342m abstractC907342m = (AbstractC907342m) anonymousClass436.Bos();
        if (abstractC907342m != null && (A00 = abstractC907342m.A00(C58897QHh.class, "ar_ads_context")) != null) {
            interfaceC23621Ds = this.A00.A00;
            um0 = new C66544ULz(A00);
        } else {
            interfaceC23621Ds = this.A00.A00;
            um0 = new UM0(null);
        }
        interfaceC23621Ds.resumeWith(um0);
    }
}
