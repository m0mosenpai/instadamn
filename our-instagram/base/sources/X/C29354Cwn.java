package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cwn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29354Cwn implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A00.requireActivity(), this.A01);
        A0r.A0D(new AbstractC60672pq());
        A0r.A04();
    }

    public C29354Cwn(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
