package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDA implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public GDA(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31364DqT.A03();
        UserSession userSession = this.A01;
        Bundle A0b = AbstractC166987dD.A0b();
        C32287EJz c32287EJz = new C32287EJz();
        c32287EJz.setArguments(A0b);
        AbstractC31178DnM.A0y(c32287EJz, this.A00, userSession);
    }
}
