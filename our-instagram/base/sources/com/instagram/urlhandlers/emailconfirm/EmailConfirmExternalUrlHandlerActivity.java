package com.instagram.urlhandlers.emailconfirm;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC13670mt;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C12260kU;
import X.C14H;
import X.F9T;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public class EmailConfirmExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        int i;
        int A00 = C0f9.A00(-720378091);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        A07.getClass();
        this.A00 = AbstractC31172DnG.A0V(A07);
        String A0a = AbstractC31171DnF.A0a(A07);
        if (A0a == null) {
            finish();
            i = -409785126;
        } else {
            List<String> pathSegments = AbstractC08820cl.A03(A0a).getPathSegments();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("EMAIL_NONCE", AbstractC25226BEj.A1I(pathSegments, 2));
            A0b.putString("ENCODED_EMAIL", AbstractC25226BEj.A1I(pathSegments, 3));
            A07.putAll(A0b);
            AbstractC18680vv abstractC18680vv = this.A00;
            if (!(abstractC18680vv instanceof UserSession)) {
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putBoolean("allow_confirm_email", true);
                A0b2.putString("confirm_email_nonce", F9T.A00(A07.getString("EMAIL_NONCE")));
                A0b2.putString("confirm_email_encoded_email", F9T.A00(A07.getString("ENCODED_EMAIL")));
                AbstractC35178FfV.A01(this, A0b2, abstractC18680vv);
            } else {
                Intent A03 = C14H.A00().A03(this, 0);
                A03.setData(AbstractC08820cl.A03(AbstractC13670mt.A06("https://confirm_email/?nonce=%s&encoded_email=%s", A07.getString("EMAIL_NONCE"), A07.getString("ENCODED_EMAIL"))));
                C12260kU.A0C(this, A03);
                finish();
            }
            i = -637519385;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
