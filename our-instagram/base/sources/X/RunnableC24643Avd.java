package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Avd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24643Avd implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C171177k9 A01;

    public RunnableC24643Avd(C171177k9 c171177k9, int i) {
        this.A01 = c171177k9;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C171177k9 c171177k9 = this.A01;
        View view = c171177k9.A00;
        if (view != null) {
            int i = this.A00;
            C171197kB c171197kB = c171177k9.A0M;
            ViewGroup viewGroup = c171177k9.A09;
            UserSession userSession = c171177k9.A0E;
            Context context = view.getContext();
            int i2 = 2131965333;
            if (i == 0) {
                i2 = 2131965332;
            }
            c171197kB.A01(view, viewGroup, userSession, AbstractC166997dE.A0p(context, i2));
            c171177k9.A05 = true;
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(userSession));
            A0w.E7D("live_pre_live_audience_pill_tooltip_view_count", i + 1);
            A0w.apply();
        }
    }
}
