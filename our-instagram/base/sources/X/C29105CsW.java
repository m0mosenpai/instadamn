package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.CsW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29105CsW implements InterfaceC30988Djn {
    public final C57112jm A00;
    public final C27100BxP A01;

    public C29105CsW(UserSession userSession, C57112jm c57112jm, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c57112jm;
        this.A01 = new C27100BxP(userSession, str);
    }

    @Override // X.InterfaceC30988Djn
    public final void F9W(View view) {
        C14360o3.A0B(view, 0);
        this.A00.A04(view);
    }

    @Override // X.InterfaceC30988Djn
    public final void EDB(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167027dH.A12(view, c120985dq, c37644Ghd);
        C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, AnonymousClass001.A0R("igbio_cta_component_", c120985dq.getId()));
        A00.A00(this.A01);
        this.A00.A05(view, A00.A01());
    }
}
