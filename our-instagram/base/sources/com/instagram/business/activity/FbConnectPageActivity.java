package com.instagram.business.activity;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.C14360o3;
import X.C38K;
import X.InterfaceC09390do;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class FbConnectPageActivity extends BaseFragmentActivity {
    public final InterfaceC09390do A00 = AbstractC31180DnO.A0u(this, 36);
    public final InterfaceC09390do A01 = AbstractC31180DnO.A0u(this, 37);

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC166987dD.A0o(this.A01);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        AbstractC31173DnH.A0u();
        Bundle bundle2 = (Bundle) this.A00.getValue();
        C14360o3.A0B(bundle2, 0);
        C38K c38k = new C38K();
        c38k.setArguments(bundle2);
        AbstractC31179DnN.A0y(c38k, this, this.A01);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }
}
