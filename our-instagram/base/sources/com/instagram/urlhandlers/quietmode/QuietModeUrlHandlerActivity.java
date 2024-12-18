package com.instagram.urlhandlers.quietmode;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C1VE;
import X.EnumC33408Epf;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class QuietModeUrlHandlerActivity extends BaseFragmentActivity {
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
        Uri A01;
        int A00 = C0f9.A00(-1903474680);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 1855730406;
        } else {
            C09Y c09y = C023409i.A0A;
            if ((c09y.A05(this) instanceof UserSession) && (A0a = AbstractC31171DnF.A0a(A07)) != null && (A01 = AbstractC08820cl.A01(AbstractC31175DnJ.A0B(), A0a)) != null) {
                String A12 = AbstractC31172DnG.A12(A01);
                if (A12 == null) {
                    A12 = "url";
                }
                UserSession A06 = c09y.A06(A07);
                C1VE c1ve = C1VE.A02;
                if (c1ve != null) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("entrypoint", A12);
                    AbstractC31180DnO.A16(A0b, C1VE.A00(c1ve).A00(A06, EnumC33408Epf.A0B), this, c09y.A05(this), false);
                    i = 744478757;
                }
            }
            finish();
            i = 744478757;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
