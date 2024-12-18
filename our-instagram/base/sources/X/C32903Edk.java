package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Edk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32903Edk extends AbstractC52526NLv {
    public final /* synthetic */ C32354ENb A00;

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void DAw(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        super.DAw(c47p, str, i);
        C32354ENb c32354ENb = this.A00;
        EQK eqk = c32354ENb.A00;
        if (eqk == null) {
            C14360o3.A0F("accountDiscoveryAdapter");
            throw C00O.createAndThrow();
        }
        eqk.A01(c47p);
        AbstractC31176DnK.A0Q(c32354ENb.A08).E4s(new C151746sK(c47p));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32903Edk(UserSession userSession, C32354ENb c32354ENb) {
        super(c32354ENb, c32354ENb, userSession);
        this.A00 = c32354ENb;
    }

    @Override // X.AbstractC52526NLv
    public final void A02() {
        EQK eqk = this.A00.A00;
        if (eqk == null) {
            C14360o3.A0F("accountDiscoveryAdapter");
            throw C00O.createAndThrow();
        }
        eqk.A00();
    }
}
