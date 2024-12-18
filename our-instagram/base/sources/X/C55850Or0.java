package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Or0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55850Or0 implements InterfaceC58277PsV {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C156136zh A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC58023Po9
    public final void CxD() {
    }

    @Override // X.InterfaceC58023Po9
    public final void Dw0() {
    }

    public C55850Or0(Reel reel, C156136zh c156136zh, String str) {
        this.A01 = c156136zh;
        this.A02 = str;
        this.A00 = reel;
    }

    @Override // X.InterfaceC58025PoB
    public final void Cva() {
        C156136zh c156136zh = this.A01;
        C22P c22p = C22P.A40;
        C81K c81k = C81K.A07;
        AbstractC35094Fd5.A01(c156136zh.A05, c22p, c156136zh.A0A, c81k, null, null);
    }

    @Override // X.InterfaceC57922PmS
    public final void DKl() {
        C156136zh c156136zh = this.A01;
        String str = this.A02;
        C155306yJ c155306yJ = c156136zh.A07;
        c155306yJ.A07(str);
        if (c155306yJ.A0G.isEmpty()) {
            C156136zh.A02(c156136zh);
        }
    }

    @Override // X.InterfaceC58024PoA
    public final void DlW() {
        C156136zh c156136zh = this.A01;
        C156136zh.A03(c156136zh, "add_highlight_to_main_grid_tap");
        OWI owi = OWI.A00;
        UserSession userSession = c156136zh.A0A;
        ImmutableList of = ImmutableList.of((Object) this.A02);
        C14360o3.A07(of);
        owi.A00(of, userSession, new C56497P6p(1, this.A00, c156136zh));
    }

    @Override // X.InterfaceC58025PoB
    public final void Dta(boolean z) {
        C156136zh c156136zh = this.A01;
        PZW.A01(c156136zh, AbstractC25235BEs.A0S(c156136zh.A0C), 39, z);
    }

    @Override // X.InterfaceC58024PoA
    public final void Dvz() {
        C156136zh c156136zh = this.A01;
        C156136zh.A03(c156136zh, "remove_highlight_to_main_grid_tap");
        OWI owi = OWI.A00;
        UserSession userSession = c156136zh.A0A;
        ImmutableList of = ImmutableList.of((Object) this.A02);
        C14360o3.A07(of);
        owi.A01(of, userSession, new C57257Pbf(3, this.A00, c156136zh));
    }
}
