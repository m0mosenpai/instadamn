package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class M5G implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;

    public M5G(Activity activity, View view, UserSession userSession) {
        this.A00 = activity;
        this.A01 = view;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU A0U = AbstractC167007dF.A0U(this.A00, 2131964469);
        A0U.A03(this.A01);
        A0U.A02();
        A0U.A0A = true;
        UserSession userSession = this.A02;
        KYR.A00(A0U, userSession, 8).A07(userSession);
    }
}
