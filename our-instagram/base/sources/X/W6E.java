package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteIntegrityCheckDataModel;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.List;

/* loaded from: classes11.dex */
public final class W6E {
    public C70122W4z A00;
    public C70122W4z A01;
    public final C70399WUb A02;
    public final PromoteData A03;
    public final PromoteState A04;
    public final C61972ry A07;
    public final UserSession A08;
    public final C13400mQ A09;
    public final C13400mQ A0A;
    public final FragmentActivity A0B;
    public final C1OK A06 = new C1OK();
    public final C1OK A05 = new C1OK();

    public static C9CN A00(W6E w6e, String str, String str2) {
        String str3 = str;
        BoostFlowType boostFlowType = w6e.A03.A0l;
        CallerContext A01 = CallerContext.A01("PromoteDataFetcher");
        if (str == null) {
            str3 = "";
        }
        if (boostFlowType == null) {
            boostFlowType = BoostFlowType.A07;
        }
        return new C9CN(A01, "ig_android_promote_ads_manager_ig_to_fb_boost_media", str3, boostFlowType.toString(), str2);
    }

    public final void A02(VG4 vg4, UserSession userSession) {
        String str;
        PromoteData promoteData = this.A03;
        PromoteIntegrityCheckDataModel promoteIntegrityCheckDataModel = promoteData.A0u;
        promoteIntegrityCheckDataModel.A00 = null;
        promoteIntegrityCheckDataModel.A01 = false;
        LeadForm leadForm = promoteData.A16;
        if (leadForm == null) {
            str = null;
        } else {
            str = leadForm.A03;
        }
        String str2 = promoteData.A1A;
        C70399WUb c70399WUb = this.A02;
        String str3 = c70399WUb.A03;
        String str4 = promoteData.A1S;
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        XIGIGBoostCallToAction A01 = C70172WEu.A01(promoteData);
        String str5 = promoteData.A1I;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("ads/promote/validate_integrity_v2/");
        A0M.A9s("fb_auth_token", str2);
        A0M.A9s("flow_id", str3);
        A0M.A9s("media_id", str4);
        A0M.A9s("destination", xIGIGBoostDestination.toString());
        A0M.A9s("call_to_action", A01.toString());
        A0M.A9s("is_political_ad", "false");
        A0M.A0H("lead_gen_form_id", str);
        A0M.A0H("website_url", str5);
        C1ON A0S = AbstractC31172DnG.A0S(A0M, C67825Uyy.class, C69904VxV.class);
        A0S.A00 = new V25(c70399WUb, this, vg4, WG3.A01("/api/v1/ads/promote/validate_integrity_v2/"), 0);
        this.A07.schedule(A0S);
    }

    public final String A01(String str, String str2) {
        C208059Im c208059Im;
        String str3 = this.A03.A1B;
        if (str3 == null) {
            UserSession userSession = this.A08;
            C69093Vhj c69093Vhj = (C69093Vhj) ((C97Q) C97M.A00(userSession).A00.getValue()).AuS(A00(this, str, str2));
            if (c69093Vhj != null && (c208059Im = c69093Vhj.A01) != null && c208059Im.A00(A00(this, str, str2), userSession) != null) {
                return c208059Im.A00(A00(this, str, str2), userSession);
            }
            return str3;
        }
        return str3;
    }

    public final void A03(XCM xcm) {
        String str = this.A03.A1A;
        UserSession userSession = this.A08;
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("business/account/get_linked_whatsapp_account_info/");
        A0N.A0H("fb_auth_token", str);
        C1ON A0S = AbstractC31172DnG.A0S(A0N, C67835Uz8.class, C69906VxX.class);
        if (C17060sy.A01.A01(userSession).A1a()) {
            C61972ry c61972ry = this.A07;
            A0S.A00 = new C67954V3t(5, this, xcm);
            c61972ry.schedule(A0S);
        }
    }

    public final void A04(AbstractC67958V3x abstractC67958V3x) {
        String obj;
        UserSession userSession = this.A08;
        PromoteData promoteData = this.A03;
        String str = promoteData.A1S;
        String str2 = promoteData.A1A;
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        String str3 = this.A02.A03;
        ImmutableList A03 = promoteData.A03();
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        AbstractC37301Gc2.A1M(A0M, "ads/promote/available_audiences_v2/", str);
        A0M.A9s("fb_auth_token", str2);
        A0M.A9s("flow_id", str3);
        if (xIGIGBoostDestination == null) {
            obj = null;
        } else {
            obj = xIGIGBoostDestination.toString();
        }
        A0M.A0H("destination", obj);
        A0M.A0S(C67832Uz5.class, C69899VxQ.class);
        if (A03 != null) {
            A0M.A9s("regulated_categories", AbstractC31175DnJ.A0b(A03));
        }
        C1ON A0N = A0M.A0N();
        abstractC67958V3x.A02 = WG3.A01("/api/v1/ads/promote/available_audiences_v2/");
        A0N.A00 = abstractC67958V3x;
        this.A07.schedule(A0N);
    }

    public final void A05(C1P1 c1p1, String str, List list, boolean z) {
        C1ON A05 = AbstractC70178WFd.A05(this.A08, str, this.A02.A03, list, z);
        A05.A00 = c1p1;
        this.A07.schedule(A05);
    }

    public final void A06(String str) {
        UserSession userSession = this.A08;
        AbstractC68461VRr.A00(A00(this, str, "initial_fetch"), new C70616Wdu(this, 4), userSession);
        C9CN A00 = A00(this, str, "initial_fetch");
        C70616Wdu c70616Wdu = new C70616Wdu(this, 5);
        C14360o3.A0B(userSession, 0);
        new C69552VrH(userSession).A00(A00, C97J.A00, c70616Wdu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W6E(FragmentActivity fragmentActivity, C07X c07x, UserSession userSession) {
        C70122W4z c70122W4z = C70122W4z.A02;
        this.A01 = c70122W4z;
        this.A00 = c70122W4z;
        C13400mQ c13400mQ = new C13400mQ(AbstractC167007dF.A0J(), new Wi0(this, 1), 300L);
        this.A0A = c13400mQ;
        C13400mQ c13400mQ2 = new C13400mQ(AbstractC167007dF.A0J(), new Wi0(this, 2), 300L);
        this.A09 = c13400mQ2;
        this.A08 = userSession;
        this.A0B = fragmentActivity;
        this.A07 = new C61972ry(fragmentActivity, AbstractC018607g.A00(c07x));
        this.A03 = ((InterfaceC72021XFj) fragmentActivity).BiY();
        this.A04 = ((XFZ) fragmentActivity).Bia();
        this.A02 = C70399WUb.A00(userSession);
        c13400mQ.A00 = new C70838Why(this);
        c13400mQ2.A00 = new InterfaceC13360mM() { // from class: X.Whx
            @Override // X.InterfaceC13360mM
            public final void onCancel() {
                W6E.this.A05.A00();
            }
        };
    }
}
