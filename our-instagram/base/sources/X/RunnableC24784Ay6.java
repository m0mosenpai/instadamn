package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ay6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24784Ay6 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C194818jh A01;
    public final /* synthetic */ boolean A02;

    public RunnableC24784Ay6(View view, C194818jh c194818jh, boolean z) {
        this.A01 = c194818jh;
        this.A00 = view;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC58132lV enumC58132lV;
        C194818jh c194818jh = this.A01;
        if (!c194818jh.A03) {
            UserSession userSession = c194818jh.A08;
            if (AbstractC209699Pf.A00()) {
                View view = this.A00;
                C5SU c5su = new C5SU(AbstractC166997dE.A0L(view), AbstractC124845kp.A01(view), new C149686oL(2131975298));
                c5su.A03(c194818jh.A09.getView());
                if (this.A02) {
                    enumC58132lV = EnumC58132lV.A02;
                } else {
                    enumC58132lV = EnumC58132lV.A03;
                }
                c5su.A05 = enumC58132lV;
                c5su.A00 = 5000;
                c5su.A04 = new C220459oV(c194818jh, 1);
                c5su.A00().A07(userSession);
            }
        }
    }
}
