package com.instagram.urlhandlers.encryptedbackups;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC46742Klz;
import X.C05F;
import X.C140966Yy;
import X.C14360o3;
import X.C46054Ka9;
import X.C48519LdH;
import X.C6CE;
import X.C6CF;
import X.DUN;
import X.EnumC46149Kbn;
import X.MSV;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes8.dex */
public final class EncrypteddBackupsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, bundle2);
        String string = bundle2.getString(MSV.A00(244));
        if (string != null && string.length() != 0) {
            Uri A0B = AbstractC25227BEk.A0B(string);
            if (C14360o3.A0K(A0B.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "settings")) {
                C140966Yy A0r = AbstractC25225BEi.A0r(this, userSession);
                A0r.A0D(new C46054Ka9());
                A0r.A0D = false;
                A0r.A04();
                return;
            }
            Bundle A0b = AbstractC166987dD.A0b();
            Integer num = C05F.A15;
            A0b.putString("BUNDLE_ENTRY_POINT", "UNKNOWN");
            A0b.putString("BUNDLE_SURFACE", EnumC46149Kbn.A04.toString());
            C6CF A00 = C6CE.A00(userSession);
            C48519LdH A002 = AbstractC46742Klz.A00(userSession, num);
            A002.A06(new DUN(6, A0B, this, A00, A0b, userSession, A002));
            return;
        }
        finish();
    }
}
