package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Az1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24841Az1 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C218509lM A03;

    public RunnableC24841Az1(Context context, ViewGroup viewGroup, UserSession userSession, C218509lM c218509lM) {
        this.A00 = context;
        this.A01 = viewGroup;
        this.A03 = c218509lM;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        C14360o3.A0A(context);
        C5SU c5su = new C5SU(context, this.A01, new C149686oL(2131963350));
        c5su.A03(this.A03.A01);
        c5su.A02();
        c5su.A00().A07(this.A02);
    }
}
