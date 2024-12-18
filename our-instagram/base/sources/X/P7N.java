package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7N implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public P7N(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC111324zv.A00(16), C82R.A00(C81S.A00, new C81W[0]));
        A0b.putSerializable("camera_entry_point", C22P.A4V);
        AbstractC31176DnK.A0w(this.A00, A0b, this.A01, AbstractC111324zv.A00(31));
    }
}
