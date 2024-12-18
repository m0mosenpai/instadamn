package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Jm5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44499Jm5 extends AbstractC52922bZ {
    public final C2GT A00;
    public final YE3 A01;
    public final C05A A02;
    public final C05A A03;
    public final C05A A04;
    public final C47272Kuj A05;
    public final UserSession A06;

    public C44499Jm5(C47272Kuj c47272Kuj, UserSession userSession, String str) {
        AbstractC167007dF.A1D(userSession, 1, str);
        this.A06 = userSession;
        this.A05 = c47272Kuj;
        C008002u A00 = C10E.A00(null);
        this.A03 = A00;
        C008002u A002 = C10E.A00(null);
        this.A02 = A002;
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A04 = A1A;
        this.A01 = AbstractC151606s6.A02(userSession);
        C15230pd A003 = C10Q.A00(C50126MCa.A00, A1A, A00, A002);
        this.A00 = AbstractC43594JPz.A0J(new C47608L0t(null, null, true), AbstractC141776au.A00(this), A003, C10I.A00);
        C25621Ms A0q = AbstractC25228BEl.A0q(c47272Kuj.A00);
        A0q.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0q.A06();
        A0q.A0B("business/account/get_content_inspiration_medias/");
        AbstractC25232BEp.A1J(this, new MC5(this, null, 42), JX4.A01(new MCC(41, null), JX4.A00(new MCC(40, null), AbstractC25227BEk.A0e(A0q, K8A.class, LBD.class).A03(1994055631))));
    }
}
