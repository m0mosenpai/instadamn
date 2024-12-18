package com.instagram.urlhandlers.smbsupportlinksetup;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.AbstractC59962oe;
import X.C0f9;
import X.C14360o3;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class SmbSupportLinkSetupUrlHandlerActivity extends BaseFragmentActivity {
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
        IllegalStateException A14;
        int i;
        int A00 = C0f9.A00(-1530529355);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            String A0j = AbstractC167017dG.A0j();
            String stringExtra = getIntent().getStringExtra("entrypoint");
            if (!(A0V instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, A0V);
            } else if (stringExtra != null) {
                C14360o3.A0B(A0V, 0);
                AbstractC31173DnH.A0u();
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC31176DnK.A19(A0b, stringExtra, A0j);
                AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                abstractC59962oe.setArguments(A0b);
                AbstractC31180DnO.A1C(abstractC59962oe, this, A0V);
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 1363828683;
            }
            C0f9.A07(-810881708, A00);
            return;
        }
        A14 = AbstractC166987dD.A14("Required value was null.");
        i = -2022586262;
        C0f9.A07(i, A00);
        throw A14;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
