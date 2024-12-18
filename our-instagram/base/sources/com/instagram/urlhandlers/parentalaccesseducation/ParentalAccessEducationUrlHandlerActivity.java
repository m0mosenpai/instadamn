package com.instagram.urlhandlers.parentalaccesseducation;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31180DnO;
import X.C0f9;
import X.C140966Yy;
import X.C32265EJa;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ParentalAccessEducationUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-693727510);
        super.onCreate(bundle);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        AbstractC18680vv abstractC18680vv = null;
        if (A0F instanceof UserSession) {
            abstractC18680vv = A0F;
        }
        C140966Yy A0C = AbstractC31180DnO.A0C(this, abstractC18680vv);
        A0C.A0B(null, new C32265EJa());
        A0C.A04();
        C0f9.A07(-1297950089, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
