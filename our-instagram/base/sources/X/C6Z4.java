package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6Z4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Z4 implements InterfaceC13000lm {
    public final Map A00 = new LinkedHashMap();
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.A03(C6Z4.class);
    }

    public C6Z4(UserSession userSession) {
        this.A01 = userSession;
    }
}
