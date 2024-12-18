package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDJ implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A00, this.A01);
        A0P.A0A = "QP";
        A0P.A0D(OPZ.A00().A01(IGRevShareProductType.A04, "QP", AbstractC31172DnG.A11(uri)));
        A0P.A04();
    }

    public GDJ(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
