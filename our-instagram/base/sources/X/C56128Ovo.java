package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ovo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56128Ovo implements InterfaceC13000lm {
    public final UserSession A00;
    public final String A01;

    public C56128Ovo(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(C56128Ovo.class);
    }
}
