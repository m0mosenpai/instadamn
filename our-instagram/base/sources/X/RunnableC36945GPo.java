package X;

import android.app.Activity;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.GPo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36945GPo implements Runnable {
    public final /* synthetic */ EVQ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public RunnableC36945GPo(EVQ evq, String str, String str2) {
        this.A00 = evq;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EVQ evq = this.A00;
        CallerContext callerContext = EVQ.A0B;
        Activity activity = evq.A04;
        C07270a1 c07270a1 = evq.A08;
        String str = this.A02;
        C1ON A0C = AbstractC35276FhB.A0C(c07270a1, null, null, str, null, null, C16030qx.A00(activity), AbstractC31172DnG.A10(activity), "sign_up_continue_button", true, true, false, false, true);
        String str2 = this.A01;
        C4JK c4jk = C4JK.A00;
        AbstractC59962oe abstractC59962oe = evq.A06;
        C6WQ A0T = AbstractC31180DnO.A0T(abstractC59962oe);
        A0T.A00(AbstractC31174DnI.A0w(abstractC59962oe, abstractC59962oe.getString(2131962025), 2131956634));
        A0C.A00 = new C32546EUw(c4jk, c07270a1, evq, A0T, str, str2, null, false, false, true);
        abstractC59962oe.schedule(A0C);
    }
}
