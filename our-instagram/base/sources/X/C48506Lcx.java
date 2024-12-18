package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Lcx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48506Lcx implements InterfaceC13000lm {
    public final java.util.Set A00;
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this) {
            this.A00.clear();
        }
    }

    public C48506Lcx(UserSession userSession) {
        this.A01 = userSession;
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        C14360o3.A07(newKeySet);
        this.A00 = newKeySet;
    }
}
