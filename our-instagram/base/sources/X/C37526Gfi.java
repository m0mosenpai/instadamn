package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gfi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37526Gfi {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final C1M1 A03;

    public final void A01(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, Boolean bool, List list) {
        Long l;
        C14360o3.A0B(intentAwareAdsInfoIntf, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, AbstractC111324zv.A00(2550));
        Long l2 = null;
        if (A0f.isSampled()) {
            A00(A0f, this, 0L);
            AbstractC37301Gc2.A15(A0f, this.A00);
            AbstractC37302Gc3.A0v(A0f, intentAwareAdsInfoIntf);
            Integer BVJ = intentAwareAdsInfoIntf.BVJ();
            if (BVJ != null) {
                l = AbstractC25229BEm.A0n(BVJ);
            } else {
                l = null;
            }
            A0f.A9K("multi_ads_type_number", l);
            A0f.A9K("hscroll_seed_ad_id", AbstractC37302Gc3.A0W(intentAwareAdsInfoIntf.Brx()));
            Integer Bry = intentAwareAdsInfoIntf.Bry();
            if (Bry != null) {
                l2 = AbstractC25229BEm.A0n(Bry);
            }
            A0f.A9K("hscroll_seed_ad_position", l2);
            A0f.AAk("ad_ids", list);
            A0f.AAP("multi_ads_id", intentAwareAdsInfoIntf.BVL());
            AbstractC37301Gc2.A14(A0f, intentAwareAdsInfoIntf);
            A0f.AAP("insertion_mechanism", intentAwareAdsInfoIntf.BIG());
            A0f.A7v("is_seed_ad_multi_ads_eligible", intentAwareAdsInfoIntf.CcZ());
            A0f.AAP("hscroll_seed_ad_tracking_token", intentAwareAdsInfoIntf.Brz());
            A0f.A7v("is_seed_ad_multi_ads_eligible", bool);
            A0f.Cht();
        }
    }

    public final void A02(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, String str) {
        C14360o3.A0B(intentAwareAdsInfoIntf, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, AbstractC111324zv.A00(1017));
        Long l = null;
        if (A0f.isSampled()) {
            A0f.A9K("hscroll_seed_ad_position", Long.valueOf(AbstractC37302Gc3.A04(intentAwareAdsInfoIntf.Bry())));
            A0f.AAP("client_session_id", this.A03.getSessionId());
            A0f.AAP("contextual_ads_category", "");
            A0f.A9K("chaining_position", AbstractC167007dF.A0d());
            AbstractC37300Gc1.A0r(A0f, "");
            AbstractC37301Gc2.A15(A0f, this.A00);
            AbstractC37302Gc3.A0v(A0f, intentAwareAdsInfoIntf);
            A0f.AAP("invalidation_reason", str);
            Integer BVJ = intentAwareAdsInfoIntf.BVJ();
            if (BVJ != null) {
                l = AbstractC25229BEm.A0n(BVJ);
            }
            A0f.A9K("multi_ads_type_number", l);
            AbstractC37303Gc4.A0d(A0f, intentAwareAdsInfoIntf, AbstractC37302Gc3.A0V(intentAwareAdsInfoIntf.Brx()));
            A0f.Cht();
        }
    }

    public final void A03(C120985dq c120985dq, Integer num, int i) {
        Long l;
        String str;
        Long l2;
        C14360o3.A0B(c120985dq, 2);
        if (c120985dq.A0G()) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, AbstractC111324zv.A00(2548));
            if (A0f.isSampled()) {
                IntentAwareAdsInfoIntf A00 = C42159Im7.A00(c120985dq);
                AbstractC37303Gc4.A0i(A0f, c120985dq.A06());
                A00(A0f, this, i);
                Long A0d = AbstractC167007dF.A0d();
                Integer A0B = c120985dq.A0B();
                String str2 = null;
                if (A0B != null) {
                    l = AbstractC25229BEm.A0n(A0B);
                } else {
                    l = null;
                }
                A0f.AAk("position", AbstractC16960so.A1N(A0d, l));
                switch (num.intValue()) {
                    case 0:
                        str = "card";
                        break;
                    case 1:
                        str = "cta";
                        break;
                    case 2:
                        str = AbstractC111324zv.A00(1190);
                        break;
                    case 3:
                        str = AbstractC111324zv.A00(261);
                        break;
                    default:
                        str = "detached_headline";
                        break;
                }
                A0f.AAP(AbstractC111324zv.A00(799), str);
                AbstractC37301Gc2.A14(A0f, A00);
                AbstractC37302Gc3.A0v(A0f, A00);
                Integer BVJ = A00.BVJ();
                if (BVJ != null) {
                    l2 = AbstractC25229BEm.A0n(BVJ);
                } else {
                    l2 = null;
                }
                A0f.A9K("multi_ads_type_number", l2);
                AbstractC37301Gc2.A15(A0f, this.A00);
                A0f.A9K("hscroll_seed_ad_id", AbstractC37302Gc3.A0W(A00.Brx()));
                A0f.A7v("is_seed_ad_multi_ads_eligible", A00.CcZ());
                AbstractC37300Gc1.A0o(A0f, c120985dq.BzL(this.A02));
                Integer A2T = AbstractC25226BEj.A0y(c120985dq).A2T();
                if (A2T != null) {
                    str2 = A2T.toString();
                }
                A0f.AAP("imp_signature", str2);
                A0f.Cht();
                return;
            }
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public C37526Gfi(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1M1 c1m1) {
        AbstractC167027dH.A13(userSession, c1m1, interfaceC11380iw);
        this.A02 = userSession;
        this.A03 = c1m1;
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC37302Gc3.A0I(interfaceC11380iw, userSession);
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C37526Gfi c37526Gfi, long j) {
        interfaceC02590Ai.A9K("chaining_position", Long.valueOf(j));
        C1M1 c1m1 = c37526Gfi.A03;
        interfaceC02590Ai.AAP("chaining_session_id", c1m1.getSessionId());
        interfaceC02590Ai.AAP("client_session_id", c1m1.getSessionId());
        interfaceC02590Ai.AAP("contextual_ads_category", "");
    }
}
