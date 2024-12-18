package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GQM implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC1569372x A03;

    public GQM(Activity activity, View view, UserSession userSession, InterfaceC1569372x interfaceC1569372x) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = interfaceC1569372x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            C5SU A0f = AbstractC167017dG.A0f(activity, activity.getResources().getString(2131953811));
            A0f.A04(view, 0, ((-view.getHeight()) / 2) - 8, true);
            A0f.A02();
            A0f.A07(C5SV.A06);
            A0f.A0B = false;
            A0f.A0A = true;
            UserSession userSession = this.A02;
            A0f.A04 = new NMB(4, this.A03, userSession);
            A0f.A00().A07(userSession);
        }
    }
}
