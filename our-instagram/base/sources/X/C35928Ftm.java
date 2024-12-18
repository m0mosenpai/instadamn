package X;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Ftm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35928Ftm implements InterfaceC37191Ga2 {
    public final /* synthetic */ C35150Fes A00;

    public C35928Ftm(C35150Fes c35150Fes) {
        this.A00 = c35150Fes;
    }

    @Override // X.InterfaceC37191Ga2
    public final void Dfz() {
        C35150Fes c35150Fes = this.A00;
        AbstractC59962oe abstractC59962oe = c35150Fes.A02;
        FragmentActivity activity = abstractC59962oe.getActivity();
        C56342iS c56342iS = C56352iT.A0t;
        c56342iS.A03(activity).EkH(null, false);
        AbstractC31177DnL.A18(abstractC59962oe, c56342iS, false);
        c35150Fes.A00 = false;
    }

    @Override // X.InterfaceC37191Ga2
    public final void DgF() {
        C35150Fes c35150Fes = this.A00;
        c35150Fes.A00 = true;
        AbstractC59962oe abstractC59962oe = c35150Fes.A02;
        FragmentActivity activity = abstractC59962oe.getActivity();
        C56342iS c56342iS = C56352iT.A0t;
        c56342iS.A03(activity).EkH(null, true);
        AbstractC31177DnL.A18(abstractC59962oe, c56342iS, true);
    }

    @Override // X.InterfaceC37191Ga2
    public final void DgQ(EnumC222416a enumC222416a) {
        int i = 2131975063;
        if (enumC222416a == EnumC222416a.A06) {
            i = 2131975064;
        }
        C35150Fes c35150Fes = this.A00;
        AbstractC59962oe abstractC59962oe = c35150Fes.A02;
        C9GR.A0F(abstractC59962oe.getContext(), "switch_to_business_failed", i);
        c35150Fes.A03.Clu(new Y7A("switch_professional_account_type", "setting", "continue", null, null, null, null, null));
        C34932FaI.A01.A02(c35150Fes.A07);
        if (abstractC59962oe instanceof C33232ElR) {
            Handler A0J = AbstractC167007dF.A0J();
            C33232ElR c33232ElR = (C33232ElR) abstractC59962oe;
            c33232ElR.getClass();
            A0J.post(new RunnableC36860GMh(c33232ElR));
        }
    }

    @Override // X.InterfaceC37191Ga2
    public final void Dfs(String str, String str2, String str3) {
        C9GR.A0G(str);
        this.A00.A03.Clv(new Y7A("switch_professional_account_type", "setting", "continue", str2, str3, null, null, null));
    }
}
