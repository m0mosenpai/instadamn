package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GQr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36974GQr implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;

    public RunnableC36974GQr(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = c38321qM;
        this.A00 = activity;
        this.A02 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C193328hC A0I = AbstractC31171DnF.A0I(this.A01);
        A0I.A0A(2131972355);
        A0I.A09(2131972353);
        UserSession userSession = this.A03;
        C38321qM c38321qM = this.A04;
        Activity activity = this.A00;
        A0I.A0J(new DialogInterfaceOnClickListenerC35450Fk7(31, activity, userSession, c38321qM), 2131972354);
        A0I.A0H(new DialogInterfaceOnClickListenerC35450Fk7(32, activity, userSession, this.A02), 2131972352);
        AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC35445Fk2.A00, A0I, 2131960994);
    }
}
