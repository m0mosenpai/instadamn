package com.instagram.direct.avatar.socialstickers.ui;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31178DnM;
import X.C1XM;
import X.C33219El7;
import X.InterfaceC09390do;
import X.MHS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class AvatarOptionsActivity extends BaseFragmentActivity {
    public final InterfaceC09390do A00 = C1XM.A00(new MHS(this, 43));

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        AbstractC31178DnM.A0y(new C33219El7(), this, AbstractC166987dD.A0o(this.A00));
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC166987dD.A0o(this.A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }
}
