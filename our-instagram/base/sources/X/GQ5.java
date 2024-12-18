package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GQ5 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C85013qp A02;
    public final /* synthetic */ C31988E3q A03;

    public GQ5(Context context, UserSession userSession, C85013qp c85013qp, C31988E3q c31988E3q) {
        this.A00 = context;
        this.A02 = c85013qp;
        this.A03 = c31988E3q;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        C14360o3.A0A(context);
        Activity A01 = AbstractC13330mJ.A01(context);
        if (A01 != null) {
            C85013qp c85013qp = this.A02;
            C31988E3q c31988E3q = this.A03;
            UserSession userSession = this.A01;
            c85013qp.A02();
            C5SU A0U = AbstractC167007dF.A0U(A01, 2131956720);
            A0U.A03(c31988E3q.A08);
            A0U.A02();
            A0U.A0B = true;
            A0U.A0A = true;
            A0U.A00().A07(userSession);
        }
    }
}
