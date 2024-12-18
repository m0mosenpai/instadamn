package com.instagram.urlhandlers.directthreaddeletion;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC34142F4s;
import X.C0f9;
import X.C140966Yy;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class DirectThreadDeletionUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1266596411);
        super.onCreate(bundle);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        AbstractC18680vv abstractC18680vv = null;
        if (A0F instanceof UserSession) {
            abstractC18680vv = A0F;
        }
        C140966Yy A0r = AbstractC25225BEi.A0r(this, abstractC18680vv);
        A0r.A0B(null, AbstractC34142F4s.A00("deeplink"));
        A0r.A0D = false;
        A0r.A0F = true;
        A0r.A04();
        C0f9.A07(2064046522, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
