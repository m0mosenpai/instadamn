package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.BQf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25517BQf implements InterfaceC13000lm {
    public final UserSession A00;
    public final Map A01 = Collections.synchronizedMap(AbstractC166987dD.A1G());

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C25517BQf(UserSession userSession) {
        this.A00 = userSession;
    }
}
