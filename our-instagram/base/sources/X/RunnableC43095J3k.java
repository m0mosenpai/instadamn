package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.J3k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43095J3k implements Runnable {
    public final /* synthetic */ C1CI A00;

    public RunnableC43095J3k(C1CI c1ci) {
        this.A00 = c1ci;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A00.A06;
        C1P3 A00 = C1P2.A00(userSession);
        A00.A08("main_feed");
        if (C1LE.A0B(userSession)) {
            C1IA A002 = C1I9.A00(userSession);
            synchronized (A002) {
                Map map = A002.A01;
                C11Q c11q = (C11Q) map.get("clips_discover_prefetch");
                if (c11q != null) {
                    c11q.onCancel();
                    map.remove("clips_discover_prefetch");
                    ((C1IB) A002).A02.remove("clips_discover_prefetch");
                }
            }
            return;
        }
        A00.A08("clips_discover_prefetch");
    }
}
