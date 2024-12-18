package com.instagram.urlhandler;

import X.AbstractC018607g;
import X.AbstractC12220kQ;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC58327PtK;
import X.C023409i;
import X.C06090Tz;
import X.C09Y;
import X.C0f9;
import X.C12260kU;
import X.C18U;
import X.C34685FPw;
import X.FEK;
import X.GIG;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes6.dex */
public final class IgMeMessageUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public String A00 = "";

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_ig_me_message_url_entry_point";
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        Bundle A08;
        C09Y c09y = C023409i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            return c09y.A04(A08);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(IgMeMessageUrlHandlerActivity igMeMessageUrlHandlerActivity, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(igMeMessageUrlHandlerActivity, igMeMessageUrlHandlerActivity.getSession()), "direct_ig_me_message_link_click");
        if (A0f.isSampled()) {
            A0f.AAP("url", str);
            A0f.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str2);
            A0f.Cht();
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A08;
        int A00 = C0f9.A00(-1698632355);
        super.onCreate(AbstractC58327PtK.A00(bundle));
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            if (!C18U.A06(C06090Tz.A05, getSession(), 36313927012845892L)) {
                C12260kU.A0C(this, AbstractC31176DnK.A06(this));
            }
            String A0a = AbstractC31171DnF.A0a(A08);
            this.A00 = A0a;
            if (A0a != null && A0a.length() != 0) {
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                if (AbstractC31174DnI.A04(A0B) == 2) {
                    AbstractC18680vv session = getSession();
                    if (!(session instanceof UserSession)) {
                        AbstractC35178FfV.A01(this, A08, session);
                    } else {
                        String A0l = AbstractC31176DnK.A0l(A0B, 1);
                        String str = FEK.A00;
                        UserSession userSession = (UserSession) session;
                        new C34685FPw(userSession, new GIG(userSession, this, A0B.getQueryParameter("ref")), FEK.A00).A00(this, AbstractC018607g.A00(this), A0l);
                    }
                    i = 1168578357;
                }
            }
            finish();
            i = 1168578357;
        } else {
            finish();
            i = 957383466;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
