package com.instagram.urlhandlers.smsrecovery;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C0BQ;
import X.C0f9;
import X.C27391Ur;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* loaded from: classes6.dex */
public class SMSRecoveryUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(2063933571);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 1409521070;
        } else {
            this.A00 = AbstractC31172DnG.A0V(A07);
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = 1985950037;
            } else {
                Uri A03 = AbstractC08820cl.A03(A0a);
                Bundle A0b = AbstractC166987dD.A0b();
                Set<String> queryParameterNames = A03.getQueryParameterNames();
                if (queryParameterNames.contains("token") && queryParameterNames.contains("utm_medium")) {
                    AbstractC31173DnH.A1A(A03, A0b, "token");
                }
                A07.putAll(A0b);
                A07.putBoolean("smsrecovery", true);
                AbstractC18680vv abstractC18680vv = this.A00;
                if (abstractC18680vv instanceof UserSession) {
                    UserSession userSession = (UserSession) abstractC18680vv;
                    Bundle bundle2 = C0BQ.A00(userSession).AEY(this, null, userSession, "settings", false).A00;
                    if (bundle2 != null) {
                        bundle2.putAll(A07);
                    }
                    AbstractC35178FfV.A00().A00(this, bundle2, this.A00);
                } else {
                    C27391Ur A002 = AbstractC35178FfV.A00();
                    AbstractC18680vv abstractC18680vv2 = this.A00;
                    abstractC18680vv2.getClass();
                    A002.A00(this, A07, abstractC18680vv2);
                }
                i = -167142681;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
