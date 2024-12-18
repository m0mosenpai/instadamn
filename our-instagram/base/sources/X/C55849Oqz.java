package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Oqz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55849Oqz implements InterfaceC58277PsV {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C56532P8e A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC58025PoB
    public final void Cva() {
    }

    @Override // X.InterfaceC58025PoB
    public final void Dta(boolean z) {
    }

    @Override // X.InterfaceC58023Po9
    public final void Dw0() {
    }

    public C55849Oqz(Reel reel, C56532P8e c56532P8e, String str) {
        this.A01 = c56532P8e;
        this.A00 = reel;
        this.A02 = str;
    }

    @Override // X.InterfaceC58023Po9
    public final void CxD() {
        C56532P8e c56532P8e = this.A01;
        UserSession userSession = c56532P8e.A03;
        C1571673v.A05(c56532P8e.A02, userSession, EnumC1571773w.A05, "archive_highlight_option_tap", userSession.userId);
        String str = this.A02;
        AbstractC1571873x.A09(new C55829Oqf(str, c56532P8e, 1), userSession, str);
    }

    @Override // X.InterfaceC57922PmS
    public final void DKl() {
        C56532P8e c56532P8e = this.A01;
        Reel reel = this.A00;
        UserSession userSession = c56532P8e.A03;
        AbstractC25651Mw.A00(userSession).E4s(new C155106xz(reel, 0, false));
        AbstractC25651Mw.A00(userSession).E4s(new C55998OtV(AbstractC37301Gc2.A0i(reel)));
    }

    @Override // X.InterfaceC58024PoA
    public final void DlW() {
        C56532P8e c56532P8e = this.A01;
        C56532P8e.A00(c56532P8e, "add_highlight_to_main_grid_tap");
        OWI owi = OWI.A00;
        UserSession userSession = c56532P8e.A03;
        ImmutableList of = ImmutableList.of((Object) this.A02);
        C14360o3.A07(of);
        owi.A00(of, userSession, new C56497P6p(0, this.A00, c56532P8e));
    }

    @Override // X.InterfaceC58024PoA
    public final void Dvz() {
        C56532P8e c56532P8e = this.A01;
        C56532P8e.A00(c56532P8e, "remove_highlight_to_main_grid_tap");
        OWI owi = OWI.A00;
        UserSession userSession = c56532P8e.A03;
        String str = this.A02;
        ImmutableList of = ImmutableList.of((Object) str);
        C14360o3.A07(of);
        owi.A01(of, userSession, new C57262Pbk(this.A00, c56532P8e, str, 25));
    }
}
