package com.instagram.urlhandlers.clipslane;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C27391Ur;
import X.FC7;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ClipsLaneUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String queryParameter;
        int A00 = C0f9.A00(-415733683);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            this.A00 = AbstractC31172DnG.A0V(A07);
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a != null && A0a.length() != 0) {
                AbstractC18680vv abstractC18680vv = this.A00;
                if (!(abstractC18680vv instanceof UserSession)) {
                    A07.putBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", true);
                    C27391Ur A002 = AbstractC35178FfV.A00();
                    AbstractC18680vv abstractC18680vv2 = this.A00;
                    if (abstractC18680vv2 != null) {
                        A002.A00(this, A07, abstractC18680vv2);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    AbstractC31171DnF.A1Q(abstractC18680vv);
                    UserSession userSession = (UserSession) abstractC18680vv;
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    String queryParameter2 = A0B.getQueryParameter("media_ids");
                    if (queryParameter2 != null && (queryParameter = A0B.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) != null) {
                        FC7.A00(userSession, queryParameter2, queryParameter);
                    }
                    C0f9.A07(-876645422, A00);
                    return;
                }
            }
            finish();
            C0f9.A07(-876645422, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(-1541373784, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
