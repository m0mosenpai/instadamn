package X;

import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;

/* renamed from: X.8PH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PH extends AbstractC52922bZ {
    public CountDownTimer A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C05A A03;
    public final C05A A04;
    public final UserSession A05;

    public C8PH(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        C008002u c008002u = new C008002u(false);
        this.A03 = c008002u;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, c008002u);
        C008002u c008002u2 = new C008002u(0);
        this.A04 = c008002u2;
        this.A02 = AbstractC58232lf.A00(anonymousClass191, c008002u2);
    }

    public final void A00() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A03.Egh(false);
        this.A04.Egh(0);
    }
}
