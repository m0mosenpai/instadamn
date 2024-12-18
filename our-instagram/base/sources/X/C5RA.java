package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.5RA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RA implements InterfaceC13000lm {
    public long A00;
    public C38321qM A01;
    public final UserSession A02;
    public final HashSet A03;
    public final C13920nI A04;

    public C5RA(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = C13920nI.A00;
        this.A03 = new HashSet();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01 = null;
        this.A00 = 0L;
        this.A03.clear();
    }
}
