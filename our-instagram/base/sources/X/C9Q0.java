package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.9Q0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Q0 implements InterfaceC13000lm {
    public ArrayList A00 = AbstractC166987dD.A1E();
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public C9Q0(UserSession userSession) {
        this.A01 = userSession;
    }
}
