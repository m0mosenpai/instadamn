package com.instagram.urlhandlers.promotionpayments;

import X.AbstractC018607g;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C00O;
import X.C023409i;
import X.C0f9;
import X.C14360o3;
import X.C70187WFq;
import X.C70659Wef;
import X.VG4;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class PromotionPaymentsUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(914105282);
        super.onCreate(bundle);
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        this.A00 = A05;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (!(A05 instanceof UserSession)) {
            AbstractC35178FfV.A00().A00(this, A07, A05);
        } else {
            VG4 vg4 = VG4.A1G;
            UserSession userSession = (UserSession) A05;
            C14360o3.A0B(userSession, 3);
            C70187WFq.A01(this, AbstractC018607g.A00(this), new C70659Wef(this, vg4, userSession, "promoted_posts"), userSession);
        }
        C0f9.A07(1473740195, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
