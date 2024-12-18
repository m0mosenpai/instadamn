package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDQ implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        EnumC55212gM enumC55212gM = EnumC55212gM.A1N;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (enumC55212gM.A00(userSession, obj)) {
            AbstractC34265F9l.A00(this.A00, AbstractC31176DnK.A0q(userSession), true);
        }
    }

    public GDQ(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
