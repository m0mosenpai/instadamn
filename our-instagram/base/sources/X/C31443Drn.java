package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Drn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31443Drn {
    public final C57112jm A00;
    public final C63622uj A01 = new C63622uj();
    public final C31435Drf A02;
    public final C31442Drm A03;
    public final boolean A04;

    public C31443Drn(UserSession userSession, C57112jm c57112jm, AbstractC31433Drd abstractC31433Drd, String str, boolean z) {
        this.A00 = c57112jm;
        this.A04 = z;
        this.A02 = new C31435Drf(AbstractC62712tA.A00(userSession).A00(), abstractC31433Drd, str);
        this.A03 = new C31442Drm(AbstractC62712tA.A00(userSession).A00(), abstractC31433Drd, str);
    }
}
