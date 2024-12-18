package com.instagram.urlhandlers.igredirect;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31178DnM;
import X.C0f9;
import X.C6XJ;
import X.InterfaceC11380iw;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.ModalActivity;

/* loaded from: classes10.dex */
public final class IGRedirectHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_redirect_url_handler_activity";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(975137088);
        super.onCreate(bundle);
        C6XJ c6xj = new C6XJ(this, AbstractC31178DnM.A06("redirected_from_deeplink", true), AbstractC31171DnF.A0F(this), ModalActivity.class, "open_trustly_lightbox");
        c6xj.A0E = true;
        c6xj.A09 = true;
        c6xj.A0C(this);
        finish();
        C0f9.A07(458957037, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
