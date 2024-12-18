package X;

/* renamed from: X.Inm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42262Inm implements InterfaceC41501vz {
    public final /* synthetic */ C38P A00;

    public C42262Inm(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1782528354);
        C42251Inb c42251Inb = (C42251Inb) obj;
        int A0N = AbstractC167017dG.A0N(c42251Inb, 1559690968);
        C65823Tug c65823Tug = this.A00.A06;
        if (c65823Tug == null) {
            AbstractC37300Gc1.A0a();
            throw C00O.createAndThrow();
        }
        String id = c42251Inb.A00.getId();
        if (id != null) {
            c65823Tug.A08(id);
            C0f9.A0A(-2030496692, A0N);
            C0f9.A0A(196523172, A03);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0A(2139443637, A0N);
            throw A0g;
        }
    }
}
