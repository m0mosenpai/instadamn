package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ckw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28648Ckw implements View.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C5SW A03;

    public ViewOnClickListenerC28648Ckw(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C5SW c5sw) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c38321qM;
        this.A03 = c5sw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1717220300);
        C47993LKk c47993LKk = C47993LKk.A00;
        UserSession userSession = this.A01;
        c47993LKk.A03(this.A00, userSession, this.A02, C05F.A0C);
        C5SW c5sw = this.A03;
        if (c5sw != null) {
            c5sw.A07(userSession);
        }
        C0f9.A0C(901245063, A05);
    }
}
