package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.72T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C72T implements InterfaceC13050lr {
    public final UserSession A00;
    public final HashMap A01;
    public final HashSet A02;

    public C72T(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = new HashSet();
        this.A01 = new HashMap();
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A02.clear();
    }
}
