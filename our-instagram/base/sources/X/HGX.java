package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HGX extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EnumC71153Hb A01;
    public final /* synthetic */ C37702Gid A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public HGX(EnumC71153Hb enumC71153Hb, C37702Gid c37702Gid, String str, String str2, int i, boolean z) {
        this.A02 = c37702Gid;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A01 = enumC71153Hb;
        this.A05 = z;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C120985dq A03;
        int A032 = C0f9.A03(1054341315);
        H93 h93 = (H93) obj;
        int A033 = C0f9.A03(2114544029);
        C14360o3.A0B(h93, 0);
        C37702Gid c37702Gid = this.A02;
        UserSession userSession = c37702Gid.A07;
        if (!C18U.A06(C06090Tz.A06, userSession, 36319209822886951L)) {
            i = -706431101;
        } else {
            EnumC74603Ws enumC74603Ws = EnumC74603Ws.A05;
            java.util.Set set = c37702Gid.A02;
            if (set != null) {
                c37702Gid.A05.FCF(enumC74603Ws, set);
                c37702Gid.A02 = null;
            }
            C38600Gy3 c38600Gy3 = h93.A01;
            if (c38600Gy3 == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            IntentAwareAdsInfo intentAwareAdsInfo = c38600Gy3.A00;
            C38604Gy7 c38604Gy7 = c38600Gy3.A01;
            if (c38604Gy7 == null) {
                i = -1223261202;
            } else {
                List list = c38604Gy7.A01;
                boolean z = this.A05;
                C37526Gfi c37526Gfi = c37702Gid.A09;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Long A0j = AbstractC25231BEo.A0j(0, ((InterfaceC43584JMs) it.next()).AZE());
                    if (A0j != null) {
                        A1E.add(A0j);
                    }
                }
                c37526Gfi.A01(intentAwareAdsInfo, Boolean.valueOf(z), A1E);
                ArrayList A0i = AbstractC167007dF.A0i(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C37471Gep Eqb = ((InterfaceC43584JMs) it2.next()).Eqb(C1DS.A00(userSession));
                    C16930sl c16930sl = C16930sl.A00;
                    C14360o3.A0B(intentAwareAdsInfo, 0);
                    C14360o3.A0B(c16930sl, 1);
                    C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
                    IntentAwareAdsInfo Evj = intentAwareAdsInfo.Evj();
                    ArrayList A0i2 = AbstractC167007dF.A0i(c16930sl);
                    Iterator it3 = c16930sl.iterator();
                    while (it3.hasNext()) {
                        AbstractC37303Gc4.A17(c1dy, A0i2, it3);
                    }
                    C1DY A0C = AbstractC37302Gc3.A0C(6);
                    IntentAwareAdsInfo Evj2 = Evj.Evj();
                    ArrayList A0i3 = AbstractC167007dF.A0i(A0i2);
                    Iterator it4 = A0i2.iterator();
                    while (it4.hasNext()) {
                        AbstractC37303Gc4.A17(A0C, A0i3, it4);
                    }
                    C38697H2i c38697H2i = new C38697H2i(Evj2, A0i3);
                    String str = Eqb.A10;
                    String str2 = Eqb.A11;
                    C5Fa c5Fa = Eqb.A0a;
                    String str3 = Eqb.A12;
                    C87703ve c87703ve = Eqb.A0E;
                    String str4 = Eqb.A13;
                    C114555Fb c114555Fb = Eqb.A02;
                    String str5 = Eqb.A14;
                    C1s4 c1s4 = Eqb.A03;
                    List list2 = Eqb.A1R;
                    String str6 = Eqb.A15;
                    AppstoreMetadataDict appstoreMetadataDict = Eqb.A04;
                    BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = Eqb.A05;
                    Long l = Eqb.A0z;
                    InterfaceC104784ni interfaceC104784ni = Eqb.A06;
                    String str7 = Eqb.A16;
                    String str8 = Eqb.A17;
                    C87883vw c87883vw = Eqb.A08;
                    C38011pl c38011pl = Eqb.A0e;
                    List list3 = Eqb.A1S;
                    List list4 = Eqb.A1T;
                    C114565Fc c114565Fc = Eqb.A0B;
                    C52r c52r = Eqb.A0C;
                    C114575Fd c114575Fd = Eqb.A07;
                    InterfaceC39301sB interfaceC39301sB = Eqb.A09;
                    IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = Eqb.A0H;
                    Boolean bool = Eqb.A0f;
                    String str9 = Eqb.A18;
                    Boolean bool2 = Eqb.A0g;
                    String str10 = Eqb.A19;
                    Integer num = Eqb.A0u;
                    List list5 = Eqb.A1U;
                    DynamicProductAdDisplayOption dynamicProductAdDisplayOption = Eqb.A0D;
                    Boolean bool3 = Eqb.A0h;
                    Boolean bool4 = Eqb.A0i;
                    String str11 = Eqb.A1A;
                    String str12 = Eqb.A1B;
                    AdFormatType adFormatType = Eqb.A01;
                    C114595Ff c114595Ff = Eqb.A0F;
                    C38891rO c38891rO = Eqb.A0Y;
                    int i2 = Eqb.A00;
                    String str13 = Eqb.A1C;
                    List list6 = Eqb.A1V;
                    JJE jje = Eqb.A0G;
                    C39411sM c39411sM = Eqb.A0I;
                    String str14 = Eqb.A1D;
                    InterfaceC104884nz interfaceC104884nz = Eqb.A0K;
                    IGRFSurveyInfoDict iGRFSurveyInfoDict = Eqb.A0L;
                    InterfaceC104904o2 interfaceC104904o2 = Eqb.A0N;
                    String str15 = Eqb.A1E;
                    C38211qB c38211qB = Eqb.A0b;
                    List list7 = Eqb.A1W;
                    Boolean bool5 = Eqb.A0j;
                    Boolean bool6 = Eqb.A0k;
                    Boolean bool7 = Eqb.A0l;
                    boolean z2 = Eqb.A1Y;
                    Boolean bool8 = Eqb.A0m;
                    Boolean bool9 = Eqb.A0n;
                    Boolean bool10 = Eqb.A0o;
                    Boolean bool11 = Eqb.A0p;
                    Boolean bool12 = Eqb.A0q;
                    Boolean bool13 = Eqb.A0r;
                    Boolean bool14 = Eqb.A0s;
                    Integer num2 = Eqb.A0v;
                    List list8 = Eqb.A1X;
                    String str16 = Eqb.A1F;
                    H4L h4l = Eqb.A0O;
                    InterfaceC104914o3 interfaceC104914o3 = Eqb.A0J;
                    String str17 = Eqb.A1G;
                    String str18 = Eqb.A1H;
                    C102724k9 c102724k9 = Eqb.A0T;
                    String str19 = Eqb.A1I;
                    Integer num3 = Eqb.A0w;
                    String str20 = Eqb.A1J;
                    C114615Fj c114615Fj = Eqb.A0V;
                    C51L c51l = Eqb.A0P;
                    String str21 = Eqb.A1K;
                    String str22 = Eqb.A1L;
                    C5G3 c5g3 = Eqb.A0Q;
                    String str23 = Eqb.A1M;
                    String str24 = Eqb.A1N;
                    JJF jjf = Eqb.A0S;
                    InterfaceC104944o7 interfaceC104944o7 = Eqb.A0R;
                    String str25 = Eqb.A1O;
                    String str26 = Eqb.A1P;
                    C5Fk c5Fk = Eqb.A0c;
                    C5Fl c5Fl = Eqb.A0d;
                    Boolean bool15 = Eqb.A0t;
                    boolean z3 = Eqb.A1Z;
                    C106594rE c106594rE = Eqb.A0U;
                    C38891rO c38891rO2 = Eqb.A0Z;
                    TestimonialDict testimonialDict = Eqb.A0W;
                    Integer num4 = Eqb.A0x;
                    InterfaceC104994oF interfaceC104994oF = Eqb.A0M;
                    String str27 = Eqb.A1Q;
                    C114625Fm c114625Fm = Eqb.A0X;
                    Integer num5 = Eqb.A0y;
                    C14360o3.A0B(str2, 1);
                    AbstractC167007dF.A1G(str3, 3, str4);
                    C14360o3.A0B(list2, 9);
                    C14360o3.A0B(list3, 19);
                    C14360o3.A0B(list6, 42);
                    C14360o3.A0B(list7, 51);
                    C14360o3.A0B(list8, 64);
                    C14360o3.A0B(str16, 65);
                    C14360o3.A0B(str17, 68);
                    C14360o3.A0B(str27, 95);
                    A0i.add(AbstractC128065qa.A04(new C37471Gep(adFormatType, c114555Fb, c1s4, appstoreMetadataDict, brandedContentAdsPaidPartnershipLabelRemovalOption, interfaceC104784ni, c114575Fd, c87883vw, interfaceC39301sB, c38697H2i, c114565Fc, c52r, dynamicProductAdDisplayOption, c87703ve, c114595Ff, jje, iGCTMessagingAdsInfoDict, c39411sM, interfaceC104914o3, interfaceC104884nz, iGRFSurveyInfoDict, interfaceC104994oF, interfaceC104904o2, h4l, c51l, c5g3, interfaceC104944o7, jjf, c102724k9, c106594rE, c114615Fj, testimonialDict, c114625Fm, c38891rO, c38891rO2, c5Fa, c38211qB, c5Fk, c5Fl, c38011pl, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, num, num2, num3, num4, num5, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, list2, list3, list4, list5, list6, list7, list8, i2, z2, z3)));
                }
                if (A0i.isEmpty()) {
                    c37526Gfi.A02(intentAwareAdsInfo, "pae_returns_zero_ads");
                    i = 393582441;
                } else if (C37702Gid.A0C) {
                    c37526Gfi.A02(intentAwareAdsInfo, "clips_async_ads_request_in_flight");
                    i = -1265641713;
                } else {
                    C38011pl c38011pl2 = c38604Gy7.A00;
                    if (c38011pl2 != null) {
                        C38011pl F7F = c38011pl2.F7F();
                        String BVL = intentAwareAdsInfo.BVL();
                        if (C14360o3.A0K(BVL, "0") || BVL == null) {
                            BVL = AbstractC167017dG.A0j();
                        }
                        int size = A0i.size();
                        if (size != 1) {
                            if (size != 4) {
                                i = -376209643;
                            } else {
                                A03 = C128085qc.A01(new C9C2(intentAwareAdsInfo, BVL, A0i), (C40971v4) A0i.get(0));
                            }
                        } else {
                            A03 = C128085qc.A03((C40971v4) A0i.get(0));
                        }
                        C206239Bg c206239Bg = new C206239Bg(A03, new C671831j(null, F7F, null, 0, 0, 0, 0, 0, 16382, false, false, false, false));
                        InterfaceC670130s interfaceC670130s = c37702Gid.A00;
                        if (interfaceC670130s != null) {
                            interfaceC670130s.DnX(C05F.A00, AbstractC166987dD.A1J(c206239Bg));
                        }
                        i = 1666706937;
                    } else {
                        i = -610293795;
                    }
                }
            }
        }
        C0f9.A0A(i, A033);
        C0f9.A0A(-2111608170, A032);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 352955111);
        super.onFail(abstractC115105If);
        C37702Gid c37702Gid = this.A02;
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
        java.util.Set set = c37702Gid.A02;
        if (set != null) {
            c37702Gid.A05.FCF(enumC74603Ws, set);
            c37702Gid.A02 = null;
        }
        C0f9.A0A(-957558655, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-2118693967);
        this.A02.A01 = C05F.A00;
        C0f9.A0A(496971506, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1604625673);
        C37702Gid c37702Gid = this.A02;
        c37702Gid.A03.invoke();
        C37526Gfi c37526Gfi = c37702Gid.A09;
        String str = this.A03;
        String str2 = this.A04;
        int i = this.A00;
        EnumC71153Hb enumC71153Hb = this.A01;
        boolean z = C37702Gid.A0C;
        boolean z2 = this.A05;
        C14360o3.A0B(enumC71153Hb, 3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c37526Gfi.A01, AbstractC111324zv.A00(2552));
        if (A0f.isSampled()) {
            C37526Gfi.A00(A0f, c37526Gfi, 0L);
            AbstractC37301Gc2.A15(A0f, c37526Gfi.A00);
            A0f.AAP("trigger_type", enumC71153Hb.A00);
            A0f.A9K("multi_ads_type_number", 9L);
            A0f.A9K("hscroll_seed_ad_id", AbstractC166997dE.A0j(str));
            A0f.AAP("hscroll_seed_ad_tracking_token", str2);
            A0f.A7v("is_seed_ad_multi_ads_eligible", AbstractC31173DnH.A0d(A0f, AbstractC37300Gc1.A0P(A0f, AbstractC31171DnF.A0V(i), "hscroll_seed_ad_position", z), "is_clips_async_ads_in_flight", z2));
            A0f.Cht();
        }
        c37702Gid.A01 = C05F.A01;
        C0f9.A0A(1102483425, A03);
    }
}
