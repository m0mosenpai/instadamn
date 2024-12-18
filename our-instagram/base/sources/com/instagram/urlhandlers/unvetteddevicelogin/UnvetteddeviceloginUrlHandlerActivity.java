package com.instagram.urlhandlers.unvetteddevicelogin;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC58317Pt9;
import X.C023409i;
import X.C07270a1;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class UnvetteddeviceloginUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-450290565);
        super.onCreate(bundle);
        C09Y c09y = C023409i.A0A;
        if (!(c09y.A05(this) instanceof C07270a1)) {
            finish();
            i = -1614041078;
        } else {
            Bundle A07 = AbstractC31176DnK.A07(this);
            if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
                try {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    String queryParameter = A0B.getQueryParameter("contact_point");
                    if (queryParameter != null) {
                        String queryParameter2 = A0B.getQueryParameter("token");
                        if (queryParameter2 != null) {
                            AbstractC18680vv A05 = c09y.A05(this);
                            C14360o3.A0C(A05, AbstractC58317Pt9.A00(3));
                            C14360o3.A0B(A05, 1);
                            HashMap A12 = AbstractC31174DnI.A12("contact_point", queryParameter);
                            A12.put("token", queryParameter2);
                            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A05);
                            A0C.A0R = "com.bloks.www.caa.ar.shared_phone_cp_recovery_link";
                            AbstractC31180DnO.A11(this, A0C, "com.bloks.www.caa.ar.shared_phone_cp_recovery_link", A12, AbstractC166987dD.A1G());
                        } else {
                            throw AbstractC166987dD.A12("Nonce is null!");
                        }
                    } else {
                        throw AbstractC166987dD.A12("Contact point is null!");
                    }
                } catch (IllegalArgumentException unused) {
                    finish();
                    i = 1921312405;
                } catch (SecurityException unused2) {
                    finish();
                    i = 1687303109;
                }
            }
            i = -224800954;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
