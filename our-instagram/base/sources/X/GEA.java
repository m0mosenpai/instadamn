package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEA implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("order");
        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A05;
        UserSession userSession = this.A01;
        FYE.A00(this.A00.getActivity(), userSession, AbstractC31565Dtq.A00(enumC31556Dtg, userSession.userId, queryParameter, false), false).A04();
    }

    public GEA(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
