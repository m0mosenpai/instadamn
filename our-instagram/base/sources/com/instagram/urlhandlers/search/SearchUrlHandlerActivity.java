package com.instagram.urlhandlers.search;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31180DnO;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C65918TwP;
import X.U04;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class SearchUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return C023409i.A0A.A05(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.U29, java.lang.Object] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(2123990378);
        super.onCreate(bundle);
        C09Y c09y = C023409i.A0A;
        AbstractC18680vv A05 = c09y.A05(this);
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        U04.A00();
        C65918TwP A02 = new Object().A02((UserSession) A05);
        C140966Yy A0C = AbstractC31180DnO.A0C(this, c09y.A05(this));
        A0C.A0D(A02);
        A0C.A04();
        C0f9.A07(-603874631, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return C023409i.A0A.A05(this);
    }
}
