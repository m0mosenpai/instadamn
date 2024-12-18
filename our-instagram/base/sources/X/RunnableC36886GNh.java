package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GNh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36886GNh implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C31885Dzr A01;

    public RunnableC36886GNh(View view, C31885Dzr c31885Dzr) {
        this.A01 = c31885Dzr;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31885Dzr c31885Dzr = this.A01;
        Context context = c31885Dzr.A01;
        AbstractC31171DnF.A1O(context);
        C5SU A0U = AbstractC167007dF.A0U((Activity) context, 2131956720);
        A0U.A03(this.A00);
        A0U.A02();
        A0U.A00 = 5000;
        A0U.A0A = true;
        AbstractC166997dE.A1P(A0U);
        UserSession userSession = c31885Dzr.A02;
        InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
        A0e.E77("has_seen_content_note_create_tooltip", true);
        A0e.apply();
        AbstractC84973ql.A00(userSession).A02();
    }
}
