package com.instagram.payout.activity;

import X.AbstractC06930Yk;
import X.AbstractC104314mu;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25228BEl;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC31180DnO;
import X.AbstractC31181DnP;
import X.AbstractC33656Eu6;
import X.C06090Tz;
import X.C09530e4;
import X.C14240no;
import X.C14360o3;
import X.C18U;
import X.C1ON;
import X.C32485ESl;
import X.C72743Nv;
import X.MSV;
import X.OY3;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class PayoutOnboardingFlowActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Fragment A0I = AbstractC31177DnL.A0I(this);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        String str4 = null;
        if (A0A != null) {
            str = A0A.getString(MSV.A00(142));
        } else {
            str = null;
        }
        Bundle A0A2 = AbstractC31173DnH.A0A(this);
        if (A0A2 != null) {
            str2 = A0A2.getString("ARGUMENT_ORIGIN");
        } else {
            str2 = null;
        }
        Bundle A0A3 = AbstractC31173DnH.A0A(this);
        if (A0A3 != null) {
            str3 = A0A3.getString("ARGUMENT_DEAL_ID");
        } else {
            str3 = null;
        }
        Bundle A0A4 = AbstractC31173DnH.A0A(this);
        if (A0A4 != null) {
            str4 = A0A4.getString("ARGUMENT_FE_ID");
        }
        if (A0I == null) {
            UserMonetizationProductType A00 = AbstractC104314mu.A00(str);
            if (A00 == UserMonetizationProductType.A0E) {
                if (C18U.A06(C06090Tz.A05, AbstractC31181DnP.A08(this), 36324733150638506L)) {
                    UserSession A08 = AbstractC31181DnP.A08(this);
                    C14360o3.A0B(A08, 0);
                    C1ON A002 = AbstractC33656Eu6.A00(AbstractC25228BEl.A0q(A08), null, null, null);
                    A002.A00 = new C32485ESl(A00, this, str2, str3, str4);
                    schedule(A002);
                    return;
                }
            }
            A00(A00, AbstractC31181DnP.A08(this), this, str2, str3, str4, false);
        }
    }

    public static final void A00(UserMonetizationProductType userMonetizationProductType, UserSession userSession, PayoutOnboardingFlowActivity payoutOnboardingFlowActivity, String str, String str2, String str3, boolean z) {
        String str4;
        String valueOf = String.valueOf(AbstractC166997dE.A0Y(userSession).A03.getFbidV2());
        if (userMonetizationProductType != UserMonetizationProductType.A0E) {
            str2 = valueOf;
        }
        C09530e4 A1L = AbstractC166987dD.A1L("subtype", OY3.A00(userMonetizationProductType, z).A00);
        if (str == null) {
            str = "";
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L("entrypoint", str);
        int ordinal = userMonetizationProductType.ordinal();
        if (ordinal != 11) {
            if (ordinal != 5) {
                str4 = "native";
            } else {
                str4 = "ig_branded_content_final_screen";
            }
        } else {
            str4 = "ig_incentives_platform_onboarding";
        }
        C72743Nv A0G = AbstractC31180DnO.A0G(userSession, "com.bloks.www.payout_onboarding", AbstractC06930Yk.A06(A1L, A1L2, AbstractC166987dD.A1L("exit_destination", str4), AbstractC166987dD.A1L(MSV.A00(246), str2), AbstractC166987dD.A1L("fe_id", str3)));
        C14240no c14240no = new C14240no(payoutOnboardingFlowActivity.getSupportFragmentManager());
        c14240no.A0A(A0G, R.id.layout_container_main);
        c14240no.A00();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31181DnP.A08(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC31181DnP.A08(this);
    }
}
