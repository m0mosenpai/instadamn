package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEL implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C140966Yy A0B = AbstractC31180DnO.A0B(fragmentActivity, userSession);
        FVI.A00();
        C32296EKj c32296EKj = new C32296EKj();
        Bundle A06 = AbstractC31178DnM.A06("origin", "QP");
        AbstractC60492pY.A04(A06, userSession);
        c32296EKj.setArguments(A06);
        A0B.A0D(c32296EKj);
        A0B.A04();
    }

    public GEL(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
