package com.instagram.urlhandlers.igredirect;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25228BEl;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC61636Rr0;
import X.C0f9;
import X.InterfaceC11380iw;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes10.dex */
public final class TrustlyRedirectionActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public UserSession A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "trustly_redirection_activity";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(949515333);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            finish();
            i = 2007588067;
        } else {
            String string = bundleExtra.getString("original_url");
            if (string == null) {
                finish();
                i = -1684974028;
            } else {
                String queryParameter = AbstractC25227BEk.A0B(string).getQueryParameter("establishData");
                if (queryParameter == null) {
                    finish();
                    i = 1226521263;
                } else {
                    UserSession A0G = AbstractC31171DnF.A0G(bundleExtra);
                    this.A00 = A0G;
                    if (A0G == null) {
                        finish();
                        i = 288564358;
                    } else {
                        AbstractC25228BEl.A1G(this, AbstractC61636Rr0.A00(AbstractC25229BEm.A1b("IgSessionManager.SESSION_TOKEN_KEY", A0G.token, AbstractC166987dD.A1L("establishData", queryParameter))), this.A00, ModalActivity.class, "open_trustly_lightbox");
                        finish();
                        i = 2127593727;
                    }
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
