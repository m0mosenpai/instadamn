package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fmw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35544Fmw implements View.OnClickListener {
    public final /* synthetic */ C34605FMo A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC35544Fmw(C34605FMo c34605FMo, String str) {
        this.A00 = c34605FMo;
        this.A01 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.L7G, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1825230254);
        C34605FMo c34605FMo = this.A00;
        c34605FMo.A01 = null;
        ViewGroup viewGroup = c34605FMo.A00;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        FJ0 fj0 = c34605FMo.A04;
        String str = this.A01;
        C159737El c159737El = fj0.A00;
        String str2 = fj0.A01;
        C163997Vo c163997Vo = c159737El.A1i;
        AnonymousClass541 anonymousClass541 = AnonymousClass541.A0J;
        ?? obj = new Object();
        obj.A00 = 3;
        obj.A01 = null;
        obj.A02 = null;
        c163997Vo.A06(obj, str, null);
        UserSession userSession = c159737El.A1Z;
        C31294DpG c31294DpG = new C31294DpG(c159737El.A1X, userSession);
        String A0G = C159737El.A0G(c159737El);
        if (A0G != null) {
            c31294DpG.A02("dm", "power_up_bubble", str2, Long.parseLong(A0G), Long.parseLong(userSession.userId));
        }
        C0f9.A0C(625228336, A05);
    }
}
