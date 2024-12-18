package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GD1 implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public GD1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31265Don.A00();
        AbstractC31266Doo.A00(this.A01).A01(this.A00, new G1M(this));
    }
}
