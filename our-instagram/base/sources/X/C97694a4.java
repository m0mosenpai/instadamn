package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97694a4 implements InterfaceC13000lm {
    public C1BX A00;
    public final UserSession A01;

    public static final C1BX A00(C97694a4 c97694a4) {
        C1BX c1bx = c97694a4.A00;
        if (c1bx == null) {
            C1BY c1by = C1BX.A03;
            UserSession userSession = c97694a4.A01;
            String A0g = AnonymousClass001.A0g(userSession.userId, "_", "video_view");
            C14360o3.A07(A0g);
            c1bx = c1by.A01(new C62762tF(userSession, A0g));
        }
        c97694a4.A00 = c1bx;
        return c1bx;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C1BX c1bx = this.A00;
        if (c1bx != null) {
            c1bx.A09();
        }
    }

    public C97694a4(UserSession userSession) {
        this.A01 = userSession;
    }
}
