package com.instagram.urlhandlers.saved;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.ENX;
import X.FB5;
import X.FB6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class SavedUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-685439384);
        super.onCreate(bundle);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        AbstractC31171DnF.A1Q(A0F);
        FB6.A00();
        C14360o3.A0B(A0F, 0);
        ENX A002 = FB5.A00(A0F, null, false, false, true);
        C140966Yy A0r = AbstractC25225BEi.A0r(this, A0F);
        A0r.A0D = false;
        A0r.A0B(null, A002);
        A0r.A04();
        C0f9.A07(1731044410, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
