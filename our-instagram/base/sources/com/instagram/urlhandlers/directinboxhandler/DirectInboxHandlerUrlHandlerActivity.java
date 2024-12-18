package com.instagram.urlhandlers.directinboxhandler;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C28531Zo;
import X.JR3;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class DirectInboxHandlerUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(1017706635);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        C09Y c09y = C023409i.A0A;
        if (c09y.A05(this) != null && (c09y.A05(this) instanceof UserSession)) {
            UserSession A002 = AbstractC03270Dk.A00(c09y.A05(this));
            JR3 A09 = C28531Zo.A04.A02.A09(null, null, false);
            C140966Yy A0r = AbstractC25225BEi.A0r(this, A002);
            C14360o3.A0A(A09);
            A0r.A0B(null, A09);
            A0r.A0D = false;
            A0r.A04();
        } else {
            AbstractC35178FfV.A02(this, A07, c09y);
        }
        C0f9.A07(301500098, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
