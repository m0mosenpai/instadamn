package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.D1p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29588D1p implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C3EW A01;

    public RunnableC29588D1p(FragmentActivity fragmentActivity, C3EW c3ew) {
        this.A01 = c3ew;
        this.A00 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3EW c3ew = this.A01;
        c3ew.A02(true);
        UserSession userSession = c3ew.A03;
        if (!userSession.isStopped()) {
            C140966Yy A0r = AbstractC25225BEi.A0r(this.A00, userSession);
            A0r.A0D(AbstractC27703CJw.A00(userSession, true, false));
            A0r.A04();
        }
    }
}
