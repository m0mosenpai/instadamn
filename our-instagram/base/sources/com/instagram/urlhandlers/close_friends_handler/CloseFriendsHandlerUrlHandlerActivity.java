package com.instagram.urlhandlers.close_friends_handler;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C33149Ejs;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class CloseFriendsHandlerUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(1603620394);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        C09Y c09y = C023409i.A0A;
        if (c09y.A05(this) != null && (c09y.A05(this) instanceof UserSession)) {
            AbstractC31181DnP.A0a(new C33149Ejs(), this, AbstractC03270Dk.A00(c09y.A05(this)));
        } else {
            AbstractC35178FfV.A02(this, A07, c09y);
        }
        C0f9.A07(-1951608794, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
