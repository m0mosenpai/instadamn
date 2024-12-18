package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEQ implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        new C35233FgQ(this.A00, AbstractC31171DnF.A0D("sync_contacts_action_handler"), userSession, null, null).A05(null, EnumC33444EqG.A0I, true, false, false);
    }

    public GEQ(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
