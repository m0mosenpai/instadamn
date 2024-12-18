package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.CsX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29106CsX implements InterfaceC30988Djn {
    public final C57112jm A00;
    public final C39119HJr A01;

    @Override // X.InterfaceC30988Djn
    public final void F9W(View view) {
        C14360o3.A0B(view, 0);
        this.A00.A04(view);
    }

    public C29106CsX(UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A00 = c57112jm;
        this.A01 = new C39119HJr(userSession, interfaceC60442pS, str);
    }

    @Override // X.InterfaceC30988Djn
    public final void EDB(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167027dH.A12(view, c120985dq, c37644Ghd);
        C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, AnonymousClass001.A0R("shopping_cta_component_", c120985dq.getId()));
        A00.A00(this.A01);
        this.A00.A05(view, A00.A01());
    }
}
