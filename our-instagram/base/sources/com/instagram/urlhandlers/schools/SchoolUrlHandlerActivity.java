package com.instagram.urlhandlers.schools;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C12260kU;
import X.C18U;
import X.C73J;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class SchoolUrlHandlerActivity extends ModalActivity {
    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.modal.ModalActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String str;
        int A00 = C0f9.A00(1317374239);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && A07.getString("original_url") != null) {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (A0F instanceof UserSession) {
                C73J.A00();
                if (C18U.A06(AbstractC166997dE.A0U(A0F), A0F, 36324685906063751L) && (string = A07.getString("original_url")) != null && string.length() != 0) {
                    Uri A01 = AbstractC08820cl.A01(AbstractC31175DnJ.A0B(), string);
                    if (A01 == null || (str = A01.getQueryParameter(CacheBehaviorLogger.SOURCE)) == null) {
                        str = "deeplink";
                    }
                    C12260kU.A0C(this, AbstractC31173DnH.A09(AbstractC31176DnK.A06(this), AbstractC31174DnI.A0B(AbstractC31175DnJ.A04("instagram://add_school"), CacheBehaviorLogger.SOURCE, str)));
                }
            } else {
                AbstractC35178FfV.A01(this, A07, A0F);
                C0f9.A07(1660022415, A00);
            }
        }
        finish();
        C0f9.A07(1660022415, A00);
    }

    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
