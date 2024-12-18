package com.instagram.urlhandlers.bloksaymtigxpostingsettingpagedeeplink;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class BloksIGXPostingSettingPageDeeplinkHandler extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A08;
        int A00 = C0f9.A00(1086912739);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            AbstractC18680vv session = getSession();
            if (!(session instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A08, session);
            } else {
                String A0a = AbstractC31171DnF.A0a(A08);
                if (A0a == null) {
                    finish();
                    i = -950434789;
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    HashMap A1G = AbstractC166987dD.A1G();
                    String queryParameter = A0B.getQueryParameter("entrypoint");
                    String A0f = AbstractC31171DnF.A0f(queryParameter);
                    A1G.put("entrypoint", queryParameter);
                    String queryParameter2 = A0B.getQueryParameter("account_id");
                    C14360o3.A0C(queryParameter2, A0f);
                    A1G.put("account_id", queryParameter2);
                    AbstractC31181DnP.A0a(AbstractC31180DnO.A0G(session, "com.bloks.www.fxcal.settings.post.account", A1G), this, session);
                }
            }
            i = 1364416575;
        } else {
            finish();
            i = -771535739;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
