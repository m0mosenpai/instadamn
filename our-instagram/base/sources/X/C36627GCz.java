package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36627GCz implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (AbstractC31268Doq.A08(userSession)) {
            AbstractC31265Don.A00();
            AbstractC35257Fgr.A01(this.A00, userSession, EnumC33333EoS.A02, EnumC33519Ers.A0E.toString(), null, false);
        }
    }

    public C36627GCz(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
