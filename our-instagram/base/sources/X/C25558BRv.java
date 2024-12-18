package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.BRv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25558BRv implements InterfaceC30988Djn {
    public final C57112jm A00;
    public final C38321qM A01;
    public final C37870GlP A02;

    @Override // X.InterfaceC30988Djn
    public final void F9W(View view) {
        C14360o3.A0B(view, 0);
        this.A00.A04(view);
    }

    public C25558BRv(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C38321qM c38321qM) {
        this.A01 = c38321qM;
        this.A00 = c57112jm;
        this.A02 = new C37870GlP(interfaceC11380iw, userSession, c38321qM);
    }

    @Override // X.InterfaceC30988Djn
    public final void EDB(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(view, c120985dq);
        C59072n8 A00 = C59062n7.A00(c120985dq, C0eB.A00, AnonymousClass001.A0R("interest_controls_component", this.A01.getId()));
        A00.A00(this.A02);
        this.A00.A05(view, A00.A01());
    }
}
