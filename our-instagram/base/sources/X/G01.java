package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G01 implements InterfaceC13050lr {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final UserSession A03;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = false;
        this.A02 = false;
        this.A01 = false;
    }

    public G01(UserSession userSession) {
        this.A03 = userSession;
    }
}
