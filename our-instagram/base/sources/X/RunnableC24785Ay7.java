package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ay7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24785Ay7 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C80S A02;

    public RunnableC24785Ay7(View view, View view2, C80S c80s) {
        this.A02 = c80s;
        this.A01 = view;
        this.A00 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C80S c80s = this.A02;
        if (!c80s.A02) {
            UserSession userSession = c80s.A05;
            if (AbstractC209699Pf.A00()) {
                View view = this.A01;
                C5SU c5su = new C5SU(AbstractC166997dE.A0L(view), AbstractC124845kp.A01(view), new C149686oL(2131975298));
                c5su.A03(this.A00);
                c5su.A02();
                c5su.A00 = 5000;
                c5su.A04 = new C220459oV(c80s, 2);
                c5su.A00().A07(userSession);
            }
        }
    }
}
