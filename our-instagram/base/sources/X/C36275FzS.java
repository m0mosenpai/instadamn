package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.FzS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36275FzS implements InterfaceC13000lm {
    public String A00;
    public final ReelStore A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = null;
    }

    public C36275FzS(UserSession userSession) {
        this.A01 = C1OU.A04(userSession);
    }
}
