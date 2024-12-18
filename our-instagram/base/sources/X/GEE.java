package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEE implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C1VH A00;
        C1VE c1ve = C1VE.A02;
        if (c1ve != null && (A00 = C1VE.A00(c1ve)) != null) {
            EnumC33408Epf enumC33408Epf = EnumC33408Epf.A0G;
            UserSession userSession = this.A01;
            AbstractC31177DnL.A16(A00.A01(userSession, enumC33408Epf), this.A00.requireActivity(), userSession);
        }
    }

    public GEE(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
