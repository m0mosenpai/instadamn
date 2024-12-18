package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Or1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55851Or1 implements InterfaceC58277PsV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C52167N6w A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC58025PoB
    public final void Cva() {
    }

    @Override // X.InterfaceC58025PoB
    public final void Dta(boolean z) {
    }

    @Override // X.InterfaceC58023Po9
    public final void Dw0() {
    }

    public C55851Or1(Context context, Reel reel, C52167N6w c52167N6w, String str) {
        this.A02 = c52167N6w;
        this.A03 = str;
        this.A01 = reel;
        this.A00 = context;
    }

    @Override // X.InterfaceC58023Po9
    public final void CxD() {
        C52167N6w c52167N6w = this.A02;
        InterfaceC09390do interfaceC09390do = c52167N6w.A0C;
        C1571673v.A05(c52167N6w, AbstractC166987dD.A0r(interfaceC09390do), EnumC1571773w.A05, "archive_highlight_option_tap", AbstractC166987dD.A0r(interfaceC09390do).userId);
        String str = this.A03;
        AbstractC1571873x.A09(new C55829Oqf(str, c52167N6w, 2), AbstractC166987dD.A0r(interfaceC09390do), str);
    }

    @Override // X.InterfaceC57922PmS
    public final void DKl() {
        C52167N6w c52167N6w = this.A02;
        String str = this.A03;
        C52167N6w.A01(c52167N6w, str);
        Reel A0R = MSY.A0R(AbstractC166987dD.A0r(c52167N6w.A0C), str);
        if (A0R != null) {
            C52167N6w.A00(A0R, c52167N6w, 0, false);
        }
    }

    @Override // X.InterfaceC58024PoA
    public final void DlW() {
        C52167N6w c52167N6w = this.A02;
        C52167N6w.A02(c52167N6w, "add_highlight_to_main_grid_tap");
        OWI owi = OWI.A00;
        UserSession A0r = AbstractC166987dD.A0r(c52167N6w.A0C);
        ImmutableList of = ImmutableList.of((Object) this.A03);
        C14360o3.A07(of);
        owi.A00(of, A0r, new P6q(this.A00, this.A01, c52167N6w));
    }

    @Override // X.InterfaceC58024PoA
    public final void Dvz() {
        C52167N6w c52167N6w = this.A02;
        C52167N6w.A02(c52167N6w, "remove_highlight_to_main_grid_tap");
        OWI owi = OWI.A00;
        UserSession A0r = AbstractC166987dD.A0r(c52167N6w.A0C);
        String str = this.A03;
        ImmutableList of = ImmutableList.of((Object) str);
        C14360o3.A07(of);
        owi.A01(of, A0r, new ME8(this.A00, c52167N6w, this.A01, str, 18));
    }
}
