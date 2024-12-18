package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GD8 implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public GD8(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31177DnL.A16(AbstractC31364DqT.A02().A04("quick_promotion"), this.A00, this.A01);
    }
}
