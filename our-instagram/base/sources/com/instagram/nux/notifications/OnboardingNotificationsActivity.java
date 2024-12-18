package com.instagram.nux.notifications;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31177DnL;
import X.AbstractC31180DnO;
import X.C023409i;
import X.C140966Yy;
import X.C32275EJk;
import X.InterfaceC37264GbH;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class OnboardingNotificationsActivity extends BaseFragmentActivity implements InterfaceC37264GbH {
    public UserSession A00;
    public String A01;

    @Override // X.InterfaceC37264GbH
    public final void ATj() {
    }

    @Override // X.InterfaceC37264GbH
    public final boolean CUt() {
        return false;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        Bundle bundle2;
        Bundle A0b;
        Intent intent = getIntent();
        String str = null;
        if (intent != null) {
            bundle2 = intent.getExtras();
        } else {
            bundle2 = null;
        }
        this.A00 = C023409i.A0A.A07(bundle2);
        if (bundle2 != null) {
            str = bundle2.getString("extra_exit_url_host");
        }
        this.A01 = str;
        C140966Yy A0N = AbstractC31177DnL.A0N(this, this.A00);
        Intent intent2 = getIntent();
        if (intent2 == null || (A0b = intent2.getExtras()) == null) {
            A0b = AbstractC166987dD.A0b();
        }
        AbstractC31175DnJ.A0v(A0b, new C32275EJk(), A0N);
    }

    @Override // X.InterfaceC37264GbH
    public final void CnE(int i) {
        Intent A03 = AbstractC31172DnG.A0l().A03(this, 0);
        Uri.Builder scheme = new Uri.Builder().scheme("instagram");
        String str = this.A01;
        if (str == null) {
            str = "mainfeed";
        }
        AbstractC31180DnO.A0z(this, A03, scheme.authority(str));
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
