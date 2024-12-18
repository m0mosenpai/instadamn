package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FzT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36276FzT implements InterfaceC13000lm {
    public List A00;
    public final UserSession A01;

    public C36276FzT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
