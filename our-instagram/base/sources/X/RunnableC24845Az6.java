package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Az6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24845Az6 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C23031Ai A03;

    public RunnableC24845Az6(Activity activity, View view, UserSession userSession, C23031Ai c23031Ai) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = c23031Ai;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131955109));
            A0f.A03(view);
            A0f.A01();
            A0f.A07(C5SV.A07);
            A0f.A0A = true;
            A0f.A04 = new C220479oX(2, this.A03, this.A02);
            AbstractC166997dE.A1P(A0f);
        }
    }
}
