package com.instagram.urlhandlers.fbpayreferralxma;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C14360o3;
import X.C27391Ur;
import X.C66277U6x;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FbpayReferralXMAUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(232033496);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 249188393;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            if (!(A0V instanceof UserSession)) {
                C27391Ur A002 = AbstractC35178FfV.A00();
                AbstractC18680vv abstractC18680vv = this.A00;
                if (abstractC18680vv != null) {
                    A002.A00(this, A07, abstractC18680vv);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a != null && A0a.length() != 0) {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    if (A0B.getPathSegments().contains("fbpay_referral_details")) {
                        if (A0B.getQueryParameter("entrypoint") != null) {
                            AbstractC31173DnH.A1A(A0B, A07, "entrypoint");
                        }
                        AbstractC31173DnH.A1A(A0B, A07, "referral_id");
                        AbstractC31173DnH.A1A(A0B, A07, "sender_id");
                        AbstractC18680vv abstractC18680vv2 = this.A00;
                        C14360o3.A0A(abstractC18680vv2);
                        C14360o3.A0B(abstractC18680vv2, 1);
                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(abstractC18680vv2);
                        A0C.A0U = "Invite";
                        A0C.A0R = "com.bloks.www.fbpay.referral.details";
                        String string = A07.getString("referral_id");
                        String string2 = A07.getString("sender_id");
                        String string3 = A07.getString("entrypoint");
                        if (string != null && string2 != null) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            HashMap A1G2 = AbstractC166987dD.A1G();
                            HashMap A1G3 = AbstractC166987dD.A1G();
                            BitSet A0j = AbstractC31171DnF.A0j(2);
                            A1G.put("referral_id", string);
                            A0j.set(0);
                            A1G.put("sender_id", string2);
                            A0j.set(1);
                            A1G.put("entrypoint", string3);
                            if (A0j.nextClearBit(0) >= 2) {
                                C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.fbpay.referral.details", A1G, A1G2);
                                A0H.A03 = null;
                                A0H.A02 = null;
                                A0H.A04 = null;
                                A0H.A08(A1G3);
                                AbstractC31180DnO.A16(null, A0H.A03(this, A0C), this, abstractC18680vv2, false);
                            } else {
                                throw AbstractC31173DnH.A0f();
                            }
                        }
                        i = 1180726853;
                    }
                }
            }
            finish();
            i = 1180726853;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
