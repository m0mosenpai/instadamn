package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iw6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42768Iw6 implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        int i = 2131973869;
        if (C18U.A06(C06090Tz.A05, userSession, 36317947102828253L)) {
            i = 2131955256;
        }
        Fragment fragment = this.A00;
        String A0p = AbstractC166997dE.A0p(fragment.requireContext(), i);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0U = A0p;
        A0C.A0i = true;
        C66277U6x.A00(AbstractC111324zv.A00(825)).A04(fragment.requireActivity(), A0C);
    }

    public C42768Iw6(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
