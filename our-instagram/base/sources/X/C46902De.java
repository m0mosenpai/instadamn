package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2De, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46902De implements InterfaceC13000lm {
    public final Map A00;
    public final UserSession A01;

    public C46902De(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new LinkedHashMap();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.A03(C46902De.class);
    }
}
