package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3De, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70203De implements InterfaceC13000lm {
    public int A00;
    public int A01;
    public boolean A02;
    public final Handler A03;
    public final UserSession A04;
    public final Map A05;
    public final Map A06;

    public C70203De(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = new Handler(Looper.getMainLooper());
        this.A06 = new LinkedHashMap();
        this.A05 = new LinkedHashMap();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }
}
