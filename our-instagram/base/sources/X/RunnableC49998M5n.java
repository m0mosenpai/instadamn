package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.M5n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49998M5n implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ LGH A01;
    public final /* synthetic */ GZ3 A02;

    public RunnableC49998M5n(UserSession userSession, LGH lgh, GZ3 gz3) {
        this.A00 = userSession;
        this.A01 = lgh;
        this.A02 = gz3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        UserSession userSession = this.A00;
        RealtimeClientManager realtimeClientManager = RealtimeClientManager.getInstance(userSession);
        LGH lgh = this.A01;
        if (lgh.A0D.equals("mark_seen")) {
            str = null;
        } else {
            str = lgh.A0L;
        }
        String A00 = lgh.A00();
        GZ3 gz3 = this.A02;
        C14360o3.A0B(gz3, 1);
        realtimeClientManager.sendCommand(str, A00, new C31331Dpw(userSession, gz3));
    }
}
