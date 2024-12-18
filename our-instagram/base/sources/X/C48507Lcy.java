package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lcy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48507Lcy implements InterfaceC13000lm {
    public boolean A00;
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = false;
    }

    public C48507Lcy(UserSession userSession) {
        this.A01 = userSession;
    }
}
