package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.J0f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43014J0f implements InterfaceC1119153d {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C3G2 A01;
    public final /* synthetic */ C143536ds A02;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C43014J0f(C41181vS c41181vS, C3G2 c3g2, C143536ds c143536ds) {
        this.A02 = c143536ds;
        this.A00 = c41181vS;
        this.A01 = c3g2;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C37947Gmp c37947Gmp = C37947Gmp.A00;
        C143536ds c143536ds = this.A02;
        UserSession userSession = c143536ds.A01;
        String str = this.A00.A0k;
        str.getClass();
        C3G2 c3g2 = this.A01;
        AbstractC167017dG.A1O(userSession, c3g2);
        C18920wW A01 = AbstractC12220kQ.A01(c37947Gmp, userSession);
        String A0j = AbstractC167017dG.A0j();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_story_standouts_eligible_bottom_sheet_dismiss");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0o(A0f, A0j);
            A0f.AAP("reel_id_type", "superlativeReel");
            A0f.AAP("reel_id", str);
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C37947Gmp.A00(c3g2).name());
            A0f.Cht();
        }
        c143536ds.A00 = false;
        C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
        if (c145726hV != null) {
            c145726hV.A00();
        }
    }
}
