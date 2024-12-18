package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36625GCx implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (AbstractC2051396d.A01(userSession)) {
            C140966Yy A0P = AbstractC31173DnH.A0P(this.A00, userSession);
            A0P.A0A = "QP";
            A0P.A0D(new EJ6());
            A0P.A04();
        }
    }

    public C36625GCx(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
