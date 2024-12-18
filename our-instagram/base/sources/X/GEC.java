package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEC implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A00.requireActivity(), this.A01);
        A0r.A0D(AbstractC35179FfW.A00().A02(C05F.A00, false, false));
        A0r.A0A = AbstractC58410Puo.A01(19, 24, 114);
        A0r.A04();
    }

    public GEC(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
