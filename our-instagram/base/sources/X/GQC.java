package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GQC implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C2056398n A03;

    public GQC(Activity activity, View view, UserSession userSession, C2056398n c2056398n) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = c2056398n;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            C5SU A0Q = AbstractC31178DnM.A0Q(activity, view, activity.getString(2131960586));
            A0Q.A02();
            A0Q.A00 = 5000;
            A0Q.A0A = true;
            EfP.A00(A0Q, this, 7).A07(this.A02);
        }
    }
}
