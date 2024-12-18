package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36650GDw implements GYB {
    public final Ef3 A00;
    public final C31341Dq6 A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        synchronized (C36650GDw.class) {
            C31341Dq6 c31341Dq6 = this.A01;
            synchronized (c31341Dq6) {
                C1L2.A02(c31341Dq6.A00, false);
            }
            this.A00.A06("ig_fb_reauth", null);
        }
    }

    public C36650GDw(Fragment fragment, UserSession userSession) {
        this.A01 = new C31341Dq6(userSession);
        this.A00 = AbstractC34213F7l.A00().A01(fragment, userSession, new C36780GJd(5));
    }
}
