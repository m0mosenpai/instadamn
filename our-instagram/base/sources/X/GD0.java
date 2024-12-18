package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GD0 implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public GD0(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31265Don.A00().A00(this.A00, EnumC33519Ers.A0E, this.A01);
    }
}
