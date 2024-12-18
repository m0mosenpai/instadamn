package com.instagram.urlhandlers.bloksigbasupportflow;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C16920sk;
import X.C66277U6x;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class IGBASupportFlowRedirectActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;
    public UserSession A01;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(513789876);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 2064099731;
        } else {
            C09Y c09y = C023409i.A0A;
            AbstractC18680vv A04 = c09y.A04(A07);
            this.A00 = A04;
            if (A04 == null) {
                finish();
                i = 420394724;
            } else if (!(A04 instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, A04);
                i = -1590953790;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = -906609009;
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("ad_account_id", A0B.getQueryParameter("ad_account_id"));
                    A1G.put("ref", A0B.getQueryParameter("ref"));
                    HashMap A01 = AbstractC191768eY.A01(A1G);
                    UserSession A06 = c09y.A06(A07);
                    this.A01 = A06;
                    C14360o3.A0A(A06);
                    IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A06);
                    A0C.A0R = "com.bloks.www.care.ads_payment_support";
                    C16920sk c16920sk = C16920sk.A00;
                    C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    C66277U6x A02 = C66277U6x.A02("com.bloks.www.care.ads_payment_support", A01, c16920sk);
                    A02.A00 = 719983200;
                    A02.A04(this, A0C);
                    i = -1157916470;
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
