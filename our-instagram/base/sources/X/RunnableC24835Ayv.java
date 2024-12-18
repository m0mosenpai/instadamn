package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ayv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24835Ayv implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C33H A03;

    public RunnableC24835Ayv(Activity activity, View view, UserSession userSession, C33H c33h) {
        this.A00 = activity;
        this.A01 = view;
        this.A03 = c33h;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU A0U = AbstractC167007dF.A0U(this.A00, 2131956228);
        A0U.A03(this.A01);
        A0U.A02();
        A0U.A0A = false;
        A0U.A0B = false;
        A0U.A04 = this.A03;
        A0U.A00().A07(this.A02);
    }
}
