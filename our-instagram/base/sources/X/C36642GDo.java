package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36642GDo implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    public C36642GDo(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31173DnH.A0u();
        Bundle A0b = AbstractC166987dD.A0b();
        C32308EKv c32308EKv = new C32308EKv();
        AbstractC31171DnF.A13(A0b, "deep_link");
        c32308EKv.setArguments(A0b);
        Bundle requireArguments = c32308EKv.requireArguments();
        UserSession userSession = this.A01;
        AbstractC31173DnH.A1C(requireArguments, userSession);
        C140966Yy A0C = AbstractC31175DnJ.A0C(this.A00, userSession);
        A0C.A0A = "BusinessObjectives";
        A0C.A0D(c32308EKv);
        A0C.A04();
    }
}
