package com.instagram.leadads.activity;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC41071vF;
import X.AbstractC75103Za;
import X.C006802i;
import X.C00O;
import X.C14360o3;
import X.C172077lc;
import X.C1XM;
import X.C38321qM;
import X.C3K8;
import X.C3T1;
import X.C50164MDr;
import X.C50902MeX;
import X.C54689ODp;
import X.C56132Ovs;
import X.C56352iT;
import X.C57378Pdc;
import X.C57534Pg8;
import X.C71313Hs;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC58051Poc;
import X.InterfaceC60122ou;
import X.OZD;
import X.P4V;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class LeadAdsActivity extends BaseFragmentActivity implements InterfaceC11380iw, InterfaceC58051Poc {
    public P4V A00;
    public SpinnerImageView A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC09390do A0A = C1XM.A00(new C50164MDr(this, 36));
    public final InterfaceC09390do A0B = AbstractC25225BEi.A0a(new C50164MDr(this, 37), new C50164MDr(this, 38), C57534Pg8.A00(this, null, 1), AbstractC25225BEi.A1D(C50902MeX.class));

    public static final void A00(UserSession userSession, LeadAdsActivity leadAdsActivity, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(userSession, 2);
        OZD.A01(new C54689ODp(userSession, str, str2, str3, AbstractC16960so.A1M(AbstractC25225BEi.A16(leadAdsActivity)), z));
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        if (r11.A08 != false) goto L56;
     */
    @Override // X.InterfaceC58051Poc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dpx(X.OLJ r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.activity.LeadAdsActivity.Dpx(X.OLJ, boolean):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    @Override // com.instagram.base.activity.IgFragmentActivity
    public final C172077lc getGnvGestureHandler() {
        InterfaceC09390do interfaceC09390do = this.A0A;
        if (!C3K8.A02(AbstractC166987dD.A0o(interfaceC09390do))) {
            return null;
        }
        C172077lc A00 = C172077lc.A00(AbstractC166987dD.A0o(interfaceC09390do));
        C14360o3.A07(A00);
        C71313Hs A002 = C71313Hs.A00(AbstractC166987dD.A0o(interfaceC09390do));
        C14360o3.A07(A002);
        A00.A03(A002);
        A00.A02(A002);
        return A00;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC166987dD.A0o(this.A0A);
    }

    @Override // X.InterfaceC58051Poc
    public final void onFailure() {
        SpinnerImageView spinnerImageView = this.A01;
        if (spinnerImageView == null) {
            C14360o3.A0F("spinnerImageView");
            throw C00O.createAndThrow();
        }
        spinnerImageView.setLoadingStatus(C3T1.FAILED);
        P4V p4v = this.A00;
        if (p4v != null) {
            P4V.A00(p4v, "lead_gen_form_fetch", "form_fetch_response_on_demand", RealtimeConstants.SEND_FAIL).Cht();
        }
    }

    public static final void A01(C38321qM c38321qM, LeadAdsActivity leadAdsActivity) {
        Bundle A0A = AbstractC31173DnH.A0A(leadAdsActivity);
        if (A0A != null) {
            InterfaceC09390do interfaceC09390do = leadAdsActivity.A0A;
            User A2E = c38321qM.A2E(AbstractC166987dD.A0r(interfaceC09390do));
            boolean z = false;
            if (A2E != null) {
                A0A.putString("igUserName", A2E.getUsername());
                if (!A2E.A2N()) {
                    A0A.putString("igUserId", A2E.getId());
                }
                A0A.putInt("advertiserFollowerCount", AbstractC167017dG.A0K(A2E.A03.B7S()));
                A0A.putParcelable("profilePicURI", A2E.Bhu());
            }
            String A07 = AbstractC41071vF.A07(AbstractC166987dD.A0r(interfaceC09390do), c38321qM);
            if (A07 != null) {
                A0A.putString("adID", A07);
                A0A.putBoolean("submitted", AbstractC75103Za.A0H(AbstractC166987dD.A0r(interfaceC09390do), A07));
            }
            String CAR = c38321qM.CAR();
            if (CAR != null) {
                A0A.putString("trackingToken", CAR);
            }
            A0A.putString("ad_creation_source", AbstractC41071vF.A09(AbstractC166987dD.A0r(interfaceC09390do), c38321qM));
            if (c38321qM.A5v() || c38321qM.A5m()) {
                z = true;
            }
            A0A.putBoolean("is_sensitive_vertical_ad", z);
            A0A.putBoolean("is_pharma_vertical_ad", c38321qM.A5w());
            A0A.putBoolean("should_always_allow_phone_zip_ui", c38321qM.A6M());
            A0A.putBoolean("is_partnership_ad", c38321qM.A5t());
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final int A0X() {
        return R.layout.lead_ads_activity;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0Z() {
        InterfaceC60122ou interfaceC60122ou;
        InterfaceC08430c6 A0I = AbstractC31177DnL.A0I(this);
        C56352iT AYT = AYT();
        if (AYT != null) {
            if (A0I instanceof InterfaceC60122ou) {
                interfaceC60122ou = (InterfaceC60122ou) A0I;
            } else {
                interfaceC60122ou = null;
            }
            AYT.A0X(interfaceC60122ou);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        InterfaceC09390do interfaceC09390do = this.A0A;
        C56132Ovs c56132Ovs = (C56132Ovs) AbstractC31178DnM.A0M(interfaceC09390do).A01(C56132Ovs.class, C57378Pdc.A00);
        String str = this.A02;
        if (str == null) {
            C14360o3.A0F("formId");
            throw C00O.createAndThrow();
        }
        c56132Ovs.A02.remove(str);
        c56132Ovs.A00.remove(str);
        c56132Ovs.A01.remove(str);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null && !A0A.getBoolean("submitted")) {
            interfaceC09390do.getValue();
            C006802i.A0p.markerEnd(830542724, (short) 4);
        }
        boolean z = this.A09;
        int i = R.anim.bottom_out;
        if (z) {
            i = R.anim.right_out;
        }
        overridePendingTransition(R.anim.fade_in, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        if (r6.A00.A00 == null) goto L20;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.activity.LeadAdsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }
}
