package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2tC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62732tC implements InterfaceC13050lr {
    public final C1BX A00;
    public final C1BX A01;

    public C62732tC(UserSession userSession) {
        C1BX A00 = C1BX.A00(AbstractC62752tE.A00(userSession, AnonymousClass001.A0g(userSession.userId, "_", "starred_view")));
        C1BX A002 = C1BX.A00(AbstractC62752tE.A00(userSession, AnonymousClass001.A0g(userSession.userId, "_", "organic_view")));
        this.A01 = A00;
        this.A00 = A002;
    }

    public static C62732tC A00(final UserSession userSession) {
        return (C62732tC) userSession.A01(C62732tC.class, new InterfaceC16820sZ() { // from class: X.2tD
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C62732tC(UserSession.this);
            }
        });
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C1BX c1bx = this.A01;
        if (z) {
            c1bx.A08();
            this.A00.A08();
        } else {
            c1bx.A09();
            this.A00.A09();
        }
    }

    public C62732tC(UserSession userSession, String str, String str2) {
        String A00 = AbstractC111324zv.A00(2527);
        String A002 = AbstractC111324zv.A00(2525);
        C1BX A01 = C1BX.A01(AnonymousClass001.A0g(userSession.userId, "_", A00));
        C1BX A012 = C1BX.A01(AnonymousClass001.A0g(userSession.userId, "_", A002));
        this.A01 = A01;
        this.A00 = A012;
    }
}
