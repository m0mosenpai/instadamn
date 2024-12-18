package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class N9Q extends C1P1 {
    public final /* synthetic */ C105824pt A00;
    public final /* synthetic */ C105824pt A01;
    public final /* synthetic */ C147716kw A02;
    public final /* synthetic */ C55012OVx A03;

    public N9Q(C105824pt c105824pt, C105824pt c105824pt2, C147716kw c147716kw, C55012OVx c55012OVx) {
        this.A02 = c147716kw;
        this.A00 = c105824pt;
        this.A03 = c55012OVx;
        this.A01 = c105824pt2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C138376Ot c138376Ot;
        int A03 = C0f9.A03(106153332);
        C105824pt c105824pt = (C105824pt) obj;
        int A032 = C0f9.A03(1016796295);
        C14360o3.A0B(c105824pt, 0);
        C147716kw c147716kw = this.A02;
        if (C147716kw.A04(c147716kw)) {
            String str = c105824pt.A0X;
            str.getClass();
            String str2 = this.A00.A0X;
            str2.getClass();
            if (str.equals(str2)) {
                UserSession userSession = c147716kw.A0N;
                C1OU.A04(userSession).A0G(c105824pt);
                AbstractC59962oe abstractC59962oe = c147716kw.A0K;
                C57158PZc.A02(this.A01, c147716kw, AbstractC25235BEs.A0S(abstractC59962oe), 33);
                C55012OVx c55012OVx = this.A03;
                EnumC109104va enumC109104va = c105824pt.A06;
                if (enumC109104va == null) {
                    enumC109104va = EnumC109104va.A0E;
                }
                if ((enumC109104va == EnumC109104va.A0E && enumC109104va.A00()) || enumC109104va == EnumC109104va.A05) {
                    c55012OVx.A06 = true;
                }
                c55012OVx.A02 = enumC109104va;
                C55012OVx.A00(c55012OVx);
                if (c147716kw.A01 != null) {
                    C109834xB c109834xB = c105824pt.A03;
                    if (c109834xB != null) {
                        NRG A00 = AbstractC54273Nyt.A00(userSession);
                        String str3 = c105824pt.A0e;
                        str3.getClass();
                        String str4 = c105824pt.A0X;
                        str4.getClass();
                        A00.A01(C05F.A0Y, str3, str4, "INSTAGRAM_USERPAY_BADGES");
                        if (c109834xB.A01 != null) {
                            int A0K = AbstractC167017dG.A0K(c109834xB.A04);
                            A00.A00(A0K);
                            if (A0K >= AbstractC25225BEi.A07(C06090Tz.A06, userSession, 36593671117800921L)) {
                                C18U.A06(C06090Tz.A05, userSession, 36312196141024243L);
                            }
                            C138376Ot c138376Ot2 = c147716kw.A01;
                            if (c138376Ot2 != null && AbstractC31177DnL.A1b(c109834xB.A03)) {
                                c147716kw.A08 = new C54801OJv(abstractC59962oe.requireContext(), c138376Ot2.A0V, abstractC59962oe, userSession, EnumC142806cg.A05, null);
                            }
                        }
                        C109804x7 c109804x7 = c109834xB.A02;
                        if (c109804x7 != null) {
                            FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                            OUD oud = OUD.A05;
                            if (oud == null) {
                                oud = new OUD(userSession, requireActivity);
                                OUD.A05 = oud;
                            }
                            c147716kw.A0M.A02(((C56138Ovy) oud.A04.getValue()).A00(oud.A00, new C51740MtP(oud.A03, 0)), new C49717Lxm(4, c105824pt, A00, c147716kw, c109804x7));
                            c147716kw.A07 = oud;
                        }
                    }
                    Boolean bool = c105824pt.A0D;
                    if (bool != null && bool.booleanValue()) {
                        User user = c105824pt.A09;
                        user.getClass();
                        if (user.A02 != C17Q.A06 && (c138376Ot = c147716kw.A01) != null) {
                            C54707OEj c54707OEj = new C54707OEj(abstractC59962oe.requireContext(), c138376Ot.A0V, c147716kw.A0L, userSession, EnumC142806cg.A05, new O98(c105824pt, c147716kw), MSX.A0g(c105824pt));
                            c147716kw.A05 = c54707OEj;
                            c54707OEj.A02.setVisibility(0);
                            C99694dm A002 = AbstractC99684dl.A00(c54707OEj.A04);
                            String moduleName = c54707OEj.A03.getModuleName();
                            String str5 = c54707OEj.A06;
                            C14360o3.A0B(moduleName, 0);
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A002.A00, "ig_fan_club_subs_in_live_subscribe_cta_impression");
                            AbstractC31171DnF.A1I(A0f, moduleName);
                            AbstractC31178DnM.A17(A0f, str5);
                            A0f.Cht();
                        }
                    }
                }
            }
        }
        C0f9.A0A(-2108319767, A032);
        C0f9.A0A(-540921282, A03);
    }
}
