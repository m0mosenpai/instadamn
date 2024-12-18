package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GQq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36973GQq implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C23031Ai A03;
    public final /* synthetic */ String A04;

    public RunnableC36973GQq(Activity activity, View view, UserSession userSession, C23031Ai c23031Ai, String str) {
        this.A01 = view;
        this.A04 = str;
        this.A03 = c23031Ai;
        this.A00 = activity;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            C149686oL c149686oL = new C149686oL(this.A04);
            EfP efP = new EfP(this, 19);
            C5SU c5su = new C5SU(this.A00, c149686oL);
            c5su.A03(view);
            c5su.A01();
            c5su.A07(C5SV.A06);
            c5su.A04 = efP;
            c5su.A00().A07(this.A02);
        }
    }
}
