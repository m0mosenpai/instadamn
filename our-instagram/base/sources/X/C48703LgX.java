package X;

import com.facebook.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.LgX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48703LgX implements InterfaceC50457MPl {
    public final /* synthetic */ L4U A00;

    public C48703LgX(L4U l4u) {
        this.A00 = l4u;
    }

    @Override // X.InterfaceC50457MPl
    public final C7IK Auw() {
        return this.A00.A03.A0A;
    }

    @Override // X.InterfaceC50457MPl
    public final void DE1() {
        C47933LFf c47933LFf = this.A00.A03.A0J.A00.A00;
        if (c47933LFf != null) {
            C47326Kvb c47326Kvb = c47933LFf.A00.A07;
            c47326Kvb.getClass();
            KCW kcw = c47326Kvb.A00;
            C14240no A0F = AbstractC43593JPy.A0F(kcw);
            A0F.A0I(null);
            UserSession A0r = AbstractC166987dD.A0r(kcw.A0G);
            C14360o3.A0B(A0r, 0);
            EnumC1810381f enumC1810381f = EnumC1810381f.A05;
            String A0j = AbstractC167017dG.A0j();
            A0F.A0A(OPX.A01(null, AbstractC43594JPz.A0M(), MusicProduct.A0K, A0r, null, enumC1810381f, A0j, null), R.id.fragment_container);
            A0F.A00();
        }
    }
}
