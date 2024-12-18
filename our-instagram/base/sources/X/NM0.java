package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NM0 extends OGm {
    public OGm A00;

    @Override // X.OGm
    public final C60930Rbk createGooglePlayLocationSettingsController(Activity activity, UserSession userSession, InterfaceC65454TkQ interfaceC65454TkQ, String str, String str2) {
        C14360o3.A0B(activity, 0);
        AbstractC167027dH.A0a(1, userSession, interfaceC65454TkQ, str, str2);
        OGm oGm = this.A00;
        if (oGm == null) {
            return null;
        }
        return oGm.createGooglePlayLocationSettingsController(activity, userSession, interfaceC65454TkQ, str, str2);
    }
}
