package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OCD {
    public final ViewGroup A00;
    public final OMR A01;
    public final InterfaceC09390do A02;
    public final Activity A03;

    public OCD(Activity activity, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ) {
        Activity parent = activity.getParent();
        parent = parent == null ? activity : parent;
        this.A03 = parent;
        View A08 = AbstractC43592JPx.A08(parent);
        AbstractC43592JPx.A1T(A08);
        ViewGroup viewGroup = (ViewGroup) A08;
        this.A00 = viewGroup;
        this.A02 = C1XM.A00(new C57536PgA(28, activity, this));
        C57553PgR c57553PgR = new C57553PgR(this, 42);
        C14360o3.A0B(viewGroup, 4);
        C56139Ovz A00 = MWJ.A00(AbstractC166987dD.A0O(activity), userSession);
        OJM ojm = new OJM();
        C55177Odh c55177Odh = new C55177Odh(null, null, 1);
        OI6 oi6 = new OI6(userSession);
        ojm.A00(new NT8(new PCE(activity, viewGroup, c57553PgR)));
        ojm.A00(new NTG(activity, userSession, c55177Odh, new PC4(c57553PgR), interfaceC16660sJ));
        this.A01 = new OMR(oi6, A00.A0B, c55177Odh, ojm, A00.A06);
    }
}
