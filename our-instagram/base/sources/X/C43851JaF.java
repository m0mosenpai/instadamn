package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.JaF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43851JaF {
    public C5SW A00;
    public Runnable A01;
    public boolean A02;
    public final Handler A03;
    public final UserSession A04;

    public final synchronized void A00(C5SW c5sw) {
        this.A02 = true;
        this.A00 = c5sw;
        M3H m3h = new M3H(this, c5sw);
        this.A03.postDelayed(m3h, 500L);
        this.A01 = m3h;
    }

    public C43851JaF(Handler handler, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = handler;
    }
}
