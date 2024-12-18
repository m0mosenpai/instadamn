package com.instagram.urlhandlers.resolveadaccount;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC155756z4;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC31176DnK;
import X.AbstractC68460VRq;
import X.AbstractC68552VVf;
import X.AbstractC68640VYv;
import X.C023409i;
import X.C05F;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C1QF;
import X.C69798Vvi;
import X.CJT;
import X.InterfaceC08100bW;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* loaded from: classes11.dex */
public final class ResolveAdAccountNotificationUrlHandlerActivity extends BaseFragmentActivity {
    public final InterfaceC08100bW A00 = new C1QF("IgSecureUriParser").A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return C023409i.A0A.A05(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A00 = C0f9.A00(786940199);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1801966060;
        } else {
            String string = A07.getString("original_url");
            if (string == null) {
                finish();
                i = -1150885713;
            } else {
                Uri A01 = AbstractC08820cl.A01(this.A00, string);
                if (A01 == null) {
                    finish();
                    i = -1672312694;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A01.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                    A07.putAll(bundle2);
                    C09Y c09y = C023409i.A0A;
                    if (c09y.A05(this) instanceof UserSession) {
                        UserSession A06 = c09y.A06(A07);
                        String string2 = A07.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        Integer num = C05F.A15;
                        if (string2 != null) {
                            Set set = AbstractC68640VYv.A00;
                            num = CJT.A00(string2);
                        }
                        if (num != C05F.A01) {
                            if (num == C05F.A0u) {
                                str = "instagram_push_notification_for_ad_account";
                            } else {
                                C69798Vvi A02 = AbstractC155756z4.A00().A02();
                                ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(AbstractC68552VVf.A00(num));
                                if (errorIdentifier == null) {
                                    errorIdentifier = ErrorIdentifier.A19;
                                }
                                AbstractC25229BEm.A18(A02.A09(errorIdentifier, A06), new C140966Yy(this, c09y.A05(this)));
                                i = -1097208829;
                            }
                        } else {
                            str = "instagram_push_notification_for_business";
                        }
                        AbstractC68460VRq.A00(this, A06, str);
                    }
                    finish();
                    i = -1097208829;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return C023409i.A0A.A05(this);
    }
}
