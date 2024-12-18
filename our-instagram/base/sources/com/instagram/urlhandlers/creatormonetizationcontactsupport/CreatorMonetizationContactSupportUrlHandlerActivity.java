package com.instagram.urlhandlers.creatormonetizationcontactsupport;

import X.AbstractC03270Dk;
import X.AbstractC12220kQ;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AnonymousClass001;
import X.C0f9;
import X.C140966Yy;
import X.C72743Nv;
import X.InterfaceC02590Ai;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CreatorMonetizationContactSupportUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(856093463);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -335449001;
        } else {
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = 37164553;
            } else {
                this.A00 = AbstractC31172DnG.A0V(A07);
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                AbstractC18680vv abstractC18680vv = this.A00;
                if (abstractC18680vv != null) {
                    UserSession A002 = AbstractC03270Dk.A00(abstractC18680vv);
                    String queryParameter = A0B.getQueryParameter("product");
                    if ("igtv_ads".equals(queryParameter) || "badges".equals(queryParameter) || "bonuses".equals(queryParameter) || "branded_content".equals(queryParameter) || "fan_club".equals(queryParameter) || "affiliate".equals(queryParameter) || "gifts".equals(queryParameter)) {
                        C72743Nv A0G = AbstractC31180DnO.A0G(A002, "com.instagram.pro_home.monetization_platform.support.contact_support_screen", new HashMap(AbstractC167007dF.A0n("product", queryParameter)));
                        C140966Yy A0C = AbstractC31180DnO.A0C(this, A002);
                        A0C.A0B(null, A0G);
                        A0C.A04();
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, A002), "ig_creator_monetization_support_inbox");
                        AbstractC31171DnF.A1A(A0f, "contact_support");
                        AbstractC31171DnF.A1C(A0f, "enter");
                        A0f.AAP("client_extra", AnonymousClass001.A0R("help_center_article_", queryParameter));
                        A0f.Cht();
                    }
                    i = -944634354;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
