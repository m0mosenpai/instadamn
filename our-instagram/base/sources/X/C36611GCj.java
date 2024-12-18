package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36611GCj implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C36611GCj(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        F0J.A00().A00(AbstractC166987dD.A0b(), this.A00, this.A01, "DEEPLINK_QP");
    }
}
