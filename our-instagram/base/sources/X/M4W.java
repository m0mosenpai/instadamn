package X;

import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class M4W implements Runnable {
    public final /* synthetic */ C42090Ikx A00;
    public final /* synthetic */ C47665L2y A01;

    public M4W(C42090Ikx c42090Ikx, C47665L2y c47665L2y) {
        this.A00 = c42090Ikx;
        this.A01 = c47665L2y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42090Ikx c42090Ikx = this.A00;
        c42090Ikx.A0J.dismiss();
        C47665L2y c47665L2y = this.A01;
        FragmentActivity fragmentActivity = c42090Ikx.A05;
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        A0H.A0k(new BitmapDrawable(fragmentActivity.getResources(), c47665L2y.A01));
        A0H.A0e(new DialogInterfaceOnClickListenerC48021LMq(c42090Ikx, c47665L2y, 24), AbstractC166997dE.A0p(fragmentActivity, 2131973727));
        A0H.A0H(new DialogInterfaceOnClickListenerC48021LMq(c42090Ikx, c47665L2y, 25), 2131972762);
        A0H.A0I(null, 2131968687);
        A0H.A0t(true);
        AbstractC166987dD.A1W(A0H);
    }
}
