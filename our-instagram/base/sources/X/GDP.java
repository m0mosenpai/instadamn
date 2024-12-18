package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDP implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        EnumC55212gM enumC55212gM = EnumC55212gM.A1M;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (enumC55212gM.A00(userSession, obj)) {
            AbstractC86593tX.A0b(this.A00.requireActivity(), userSession, C05F.A0Y);
        }
    }

    public GDP(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
