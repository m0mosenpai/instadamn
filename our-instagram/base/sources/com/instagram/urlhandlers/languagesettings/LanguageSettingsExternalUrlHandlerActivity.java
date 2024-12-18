package com.instagram.urlhandlers.languagesettings;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.C023409i;
import X.C06090Tz;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C18U;
import X.C33199Ekm;
import X.EJR;
import X.FBN;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class LanguageSettingsExternalUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        Fragment ejr;
        int A00 = C0f9.A00(977308490);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
            String host = AbstractC25227BEk.A0B(A0a).getHost();
            C09Y c09y = C023409i.A0A;
            UserSession A002 = AbstractC03270Dk.A00(c09y.A05(this));
            if (C14360o3.A0K(host, "app_language_setting")) {
                ejr = FBN.A00(A002);
            } else {
                if (C18U.A06(C06090Tz.A05, A002, 36318453908379799L)) {
                    if (C14360o3.A0K(host, "languages_settings")) {
                        ejr = new C33199Ekm();
                    } else if (C14360o3.A0K(host, "content_language_settings")) {
                        C14360o3.A0B(A002, 0);
                        ejr = new EJR();
                        ejr.setArguments(AbstractC31174DnI.A0D(A002));
                    }
                }
                i = -1454337972;
            }
            C140966Yy A0C = AbstractC31180DnO.A0C(this, c09y.A05(this));
            A0C.A0D(ejr);
            A0C.A04();
            i = -1403628920;
        } else {
            i = 420338447;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
