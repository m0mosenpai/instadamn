package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167977es implements InterfaceC13000lm {
    public final Map A00;
    public final UserSession A01;

    public C167977es(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new LinkedHashMap();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.A03(C167977es.class);
    }
}
