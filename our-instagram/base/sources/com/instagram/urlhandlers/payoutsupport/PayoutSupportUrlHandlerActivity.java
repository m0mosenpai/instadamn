package com.instagram.urlhandlers.payoutsupport;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C66277U6x;
import X.InterfaceC11380iw;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class PayoutSupportUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "payment_support_url_handler_activity";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1604272144);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            C09Y c09y = C023409i.A0A;
            if (c09y.A05(this) != null) {
                if (!(c09y.A05(this) instanceof UserSession)) {
                    AbstractC35178FfV.A02(this, A07, c09y);
                    finish();
                    i = -831819146;
                } else {
                    String A0a = AbstractC31171DnF.A0a(A07);
                    if (A0a != null) {
                        AbstractC18680vv A05 = c09y.A05(this);
                        Uri A0B = AbstractC25227BEk.A0B(A0a);
                        HashMap A1G = AbstractC166987dD.A1G();
                        HashMap A1G2 = AbstractC166987dD.A1G();
                        HashMap A1G3 = AbstractC166987dD.A1G();
                        BitSet A0j = AbstractC31171DnF.A0j(1);
                        String queryParameter = A0B.getQueryParameter("ref");
                        String queryParameter2 = A0B.getQueryParameter("financial_entity_id");
                        String queryParameter3 = A0B.getQueryParameter("payout_batch_id");
                        String queryParameter4 = A0B.getQueryParameter("transaction_id");
                        if (queryParameter != null) {
                            A1G.put("ref", queryParameter);
                        }
                        if (queryParameter2 != null) {
                            A1G.put("financial_entity_id", queryParameter2);
                        }
                        if (queryParameter3 != null) {
                            A1G.put("payout_batch_id", queryParameter3);
                        }
                        if (queryParameter4 != null) {
                            A1G.put("transaction_id", queryParameter4);
                        }
                        boolean A1Y = AbstractC31180DnO.A1Y("logging_session_id", A0B.getQueryParameter("logging_session_id"), A1G, A0j);
                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A05);
                        A0C.A0U = null;
                        C140966Yy A0r = AbstractC25225BEi.A0r(this, A05);
                        if (A0j.nextClearBit(A1Y ? 1 : 0) >= 1) {
                            C66277U6x A02 = C66277U6x.A02("com.bloks.www.fbpay.care.receipt_help", AbstractC191768eY.A01(A1G), A1G2);
                            AbstractC31178DnM.A1M(A02, 719983200);
                            A02.A03 = null;
                            A02.A02 = null;
                            A02.A04 = null;
                            A02.A08(A1G3);
                            A0r.A0B(null, A02.A03(this, A0C));
                            A0r.A0D = A1Y;
                            A0r.A04();
                            i = -542570362;
                        } else {
                            throw AbstractC31173DnH.A0f();
                        }
                    } else {
                        finish();
                        i = -221081408;
                    }
                }
                C0f9.A07(i, A00);
            }
        }
        finish();
        i = -1166148510;
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
