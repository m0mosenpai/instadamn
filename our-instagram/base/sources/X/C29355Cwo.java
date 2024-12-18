package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cwo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29355Cwo implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A00.requireActivity(), this.A01);
        AbstractC155756z4.A00().A01();
        A0r.A0D(new C26760Brh());
        A0r.A04();
    }

    public C29355Cwo(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
