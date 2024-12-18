package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GQi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36965GQi implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Integer A04;

    public RunnableC36965GQi(Activity activity, View view, View view2, UserSession userSession, Integer num) {
        this.A02 = view;
        this.A00 = activity;
        this.A04 = num;
        this.A01 = view2;
        this.A03 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A00;
        C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(this.A04.intValue()));
        A0f.A01();
        A0f.A03(this.A01);
        A0f.A0A = true;
        UserSession userSession = this.A03;
        EfP.A00(A0f, userSession, 3).A07(userSession);
    }
}
