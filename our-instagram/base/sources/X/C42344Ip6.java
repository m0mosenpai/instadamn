package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ip6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42344Ip6 implements InterfaceC13000lm {
    public final UserSession A00;
    public final java.util.Set A01 = AbstractC166987dD.A1H();

    public static C42344Ip6 A00(UserSession userSession) {
        return (C42344Ip6) userSession.A01(C42344Ip6.class, new C38190Gqv(userSession, 1));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C42344Ip6(UserSession userSession) {
        this.A00 = userSession;
    }
}
