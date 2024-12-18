package com.instagram.urlhandlers.hackedaccountsupport;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.C023409i;
import X.C05F;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C36697GFs;
import X.C66277U6x;
import X.C72743Nv;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class HackedAccountSupportUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String A0a;
        int A00 = C0f9.A00(597402918);
        super.onCreate(bundle);
        C023409i.A0A.A03(new C36697GFs(7));
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            AbstractC31171DnF.A12(A07, "IgSessionManager.LOGGED_OUT_TOKEN");
        }
        HashMap A1G = AbstractC166987dD.A1G();
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
            AbstractC31180DnO.A15(AbstractC25227BEk.A0B(A0a), CacheBehaviorLogger.SOURCE, A1G);
        }
        C66277U6x A01 = C66277U6x.A01("com.instagram.account_security.hacked_accounts_support.support_form", A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(getSession());
        A0C.A0k = false;
        A0C.A0P = C05F.A01;
        C72743Nv A03 = A01.A03(this, A0C);
        C140966Yy A0B = AbstractC31180DnO.A0B(this, getSession());
        C14360o3.A0A(A03);
        A0B.A0D(A03);
        A0B.A04();
        C0f9.A07(1502984438, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
