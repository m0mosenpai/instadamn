package X;

import java.util.List;

/* renamed from: X.Cps, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28944Cps implements C2Z1 {
    public final C2XE A00;
    public final C168937gS A01;
    public final List A02 = AbstractC166987dD.A1E();

    public final void A00(AbstractC50812Vc abstractC50812Vc) {
        this.A02.add(new C29460Cya(abstractC50812Vc));
    }

    public C28944Cps(C2XE c2xe) {
        this.A00 = c2xe;
        this.A01 = new C168937gS(c2xe);
    }

    @Override // X.C2Z1
    public final C2XE ArD() {
        return this.A00;
    }

    @Override // X.C2YS
    public final C2XH BoZ() {
        return AbstractC25229BEm.A0b(this);
    }
}
