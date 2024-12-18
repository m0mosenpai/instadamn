package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.GSs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37013GSs extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37013GSs(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [X.98o, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        int i;
        String str;
        boolean z2;
        long longValue;
        long longValue2;
        long longValue3;
        int i2;
        boolean z3;
        String str2;
        C221249po c221249po;
        C46037KZd c46037KZd;
        Integer num;
        C61582rL c61582rL;
        switch (this.A00) {
            case 0:
                return JR2.A05((JR2) this.A01);
            case 1:
                C27961Xa A00 = AbstractC54912fq.A00();
                JR2 jr2 = (JR2) this.A01;
                AbstractC59962oe abstractC59962oe = jr2.A1L;
                UserSession A0p = jr2.A0p();
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0J;
                C54922fr A0S = AbstractC31175DnJ.A0S();
                A0S.A04 = new GCP(jr2, 1);
                A0S.A02 = new GCN(jr2, 1);
                A0S.A08 = new C31451Drv(jr2, 1);
                A0S.A01(new C31450Dru(jr2, 0), (C64742wY) jr2.A2X.getValue());
                A0S.A06 = new C43992Jcf(jr2);
                A0S.A07 = new C31449Drt(jr2);
                A0S.A00 = new GCM(jr2, 1);
                return AbstractC31175DnJ.A0T(abstractC59962oe, A0p, A0S, A00, quickPromotionSlot);
            case 2:
                return AbstractC54912fq.A00().A05(((JR2) this.A01).A0p(), AbstractC06930Yk.A06(AbstractC166987dD.A1L(QPTooltipAnchor.A0d, new C64712wV()), AbstractC166987dD.A1L(QPTooltipAnchor.A0X, new C64712wV()), AbstractC166987dD.A1L(QPTooltipAnchor.A0a, new C64712wV()), AbstractC166987dD.A1L(QPTooltipAnchor.A0b, new C31616Dui()), AbstractC166987dD.A1L(QPTooltipAnchor.A0Z, new C64712wV()), AbstractC166987dD.A1L(QPTooltipAnchor.A0Y, new C64712wV())));
            case 3:
                return new C31214Dnx((JR2) this.A01);
            case 4:
                JR2 jr22 = (JR2) this.A01;
                return new C63702ur(jr22.A1L, jr22.A0p());
            case 5:
                return new C31623Dup((JR2) this.A01);
            case 6:
                return new C31622Duo((JR2) this.A01);
            case 7:
                JR2 jr23 = (JR2) this.A01;
                return new C43915JbQ((C43916JbR) jr23.A2C.getValue(), C18U.A06(C06090Tz.A05, jr23.A0p(), 36325819777430934L));
            case 8:
                JR2 jr24 = (JR2) this.A01;
                return new C31226Do9(jr24.A1L, jr24.A0p(), null);
            case 9:
                return AnonymousClass994.A00(((JR2) this.A01).A0p());
            case 10:
                JR2 jr25 = (JR2) this.A01;
                jr25.A06 = 0L;
                jr25.A05 = 0L;
                break;
            case 11:
                JR2 jr26 = (JR2) this.A01;
                return new KWM(jr26.A0p(), C17060sy.A01.A01(jr26.A0p()).A2I(), false);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C43956Jc5((JR2) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C2056598p(((JR2) this.A01).A0p(), new Object());
            case 14:
                return new C31643Dv9((JR2) this.A01);
            case Process.SIGTERM /* 15 */:
                return new C31618Duk((JR2) this.A01);
            case 16:
                return new C31619Dul((JR2) this.A01);
            case 17:
                JR2 jr27 = (JR2) this.A01;
                C57112jm c57112jm = (C57112jm) jr27.A2w.getValue();
                if (c57112jm == null || (c61582rL = jr27.A1T) == null) {
                    return null;
                }
                return new C31204Dnn(jr27.A0p(), c57112jm, null, null, c61582rL, C05F.A15, jr27.A1L.getModuleName(), true);
            case 18:
                C61582rL c61582rL2 = ((JR2) this.A01).A1T;
                if (c61582rL2 != null) {
                    return new C62112sC(c61582rL2);
                }
                return null;
            case Process.SIGSTOP /* 19 */:
                return AbstractC93804Jo.A00(((JR2) this.A01).A0p());
            case 20:
                return new C31654DvK((JR2) this.A01);
            case 21:
                return new C43946Jbv((JR2) this.A01);
            case 22:
                return C2JD.A00(((JR2) this.A01).A0p());
            case 23:
                JR2 jr28 = (JR2) this.A01;
                return AbstractC12220kQ.A01(jr28.A1L, jr28.A0p());
            case 24:
                JR2 jr29 = (JR2) this.A01;
                InterfaceC09390do interfaceC09390do = jr29.A1j;
                MSI B7D = ((InterfaceC50519MRw) interfaceC09390do.getValue()).B7D();
                MSJ C7c = ((InterfaceC50519MRw) interfaceC09390do.getValue()).C7c();
                C41951wl A002 = C41951wl.A00(jr29.A0p());
                boolean A1W = AbstractC167007dF.A1W(jr29.A0c);
                AbstractC59962oe abstractC59962oe2 = jr29.A1L;
                Context requireContext = abstractC59962oe2.requireContext();
                UserSession A0p2 = jr29.A0p();
                FragmentActivity requireActivity = abstractC59962oe2.requireActivity();
                MSH msh = (MSH) jr29.A26.getValue();
                InterfaceC62602sz interfaceC62602sz = (InterfaceC62602sz) jr29.A2H.getValue();
                InterfaceC1571373s interfaceC1571373s = (InterfaceC1571373s) jr29.A20.getValue();
                C53N c53n = (C53N) jr29.A22.getValue();
                boolean A1M = AbstractC167007dF.A1M(jr29.A2y ? 1 : 0);
                boolean z4 = ((C43929Jbe) jr29.A1t.getValue()).A0A;
                boolean A1Z = AbstractC167007dF.A1Z(jr29.A2E);
                C42221xC FDh = B7D.FDh();
                C42221xC FDh2 = C7c.FDh();
                C42221xC AED = ((InterfaceC50519MRw) interfaceC09390do.getValue()).C0B().AED();
                C43955Jc4 c43955Jc4 = (C43955Jc4) jr29.A2S.getValue();
                boolean A03 = AbstractC31268Doq.A03(jr29.A0p());
                UserSession A0p3 = jr29.A0p();
                C06090Tz A0j = AbstractC25225BEi.A0j(A0p3, 0);
                boolean A06 = C18U.A06(A0j, A0p3, 36320403823927743L);
                UserSession A0p4 = jr29.A0p();
                C14360o3.A0B(A0p4, 0);
                boolean A062 = C18U.A06(A0j, A0p4, 36320403824189891L);
                UserSession A0p5 = jr29.A0p();
                C14360o3.A0B(A0p5, 0);
                boolean A063 = C18U.A06(A0j, A0p5, 36320403825041869L);
                UserSession A0p6 = jr29.A0p();
                C14360o3.A0B(A0p6, 0);
                boolean A064 = C18U.A06(A0j, A0p6, 36320403825107406L);
                UserSession A0p7 = jr29.A0p();
                C14360o3.A0B(A0p7, 0);
                int A07 = AbstractC25225BEi.A07(A0j, A0p7, 36601878801879424L);
                UserSession A0p8 = jr29.A0p();
                boolean A065 = C18U.A06(AbstractC166997dE.A0U(A0p8), A0p8, 36324767511163335L);
                C14360o3.A0B(A0p2, 1);
                AbstractC25234BEr.A0k(4, msh, interfaceC62602sz, interfaceC1571373s, c53n);
                ArrayList A12 = AbstractC166997dE.A12(c43955Jc4, 17);
                A12.add(new C31598DuQ(c53n));
                A12.add(new C31599DuR(c53n));
                C31522Dt6 c31522Dt6 = new C31522Dt6(abstractC59962oe2, "", A12, false, true);
                if (!AbstractC43959Jc8.A01(A0p2) && !AbstractC43959Jc8.A00(A0p2) && (AbstractC63302u8.A00(A0p2).A05(UserMonetizationProductType.A08) || AbstractC63302u8.A00(A0p2).A05)) {
                    z = true;
                } else {
                    z = false;
                }
                C43629JRm c43629JRm = new C43629JRm(requireContext, requireActivity, A0p2, msh, interfaceC1571373s);
                C31454Dry c31454Dry = new C31454Dry("find_people_header_row", AbstractC166997dE.A0p(requireContext, 2131952168));
                C31609Dub c31609Dub = new C31609Dub(c31522Dt6);
                C43961JcA c43961JcA = new C43961JcA(requireContext, A0p2, msh, c53n);
                Integer num2 = null;
                C43960Jc9 c43960Jc9 = new C43960Jc9(C05F.A01, 2131959649, "channel_invites_header_row", 2131959581, false, true);
                Integer num3 = C05F.A00;
                C43960Jc9 c43960Jc92 = new C43960Jc9(num3, 2131959649, "find_channels_header_row", 2131959583, false, true);
                C31607DuZ c31607DuZ = new C31607DuZ(AbstractC166997dE.A0p(requireContext, 2131959689));
                if (C2E7.A01(AbstractC166997dE.A0Y(A0p2))) {
                    i = 2131959584;
                } else {
                    i = 2131959690;
                    if (C18U.A06(A0j, A0p2, 36317908448319143L)) {
                        i = 2131959682;
                    }
                }
                JTJ jtj = null;
                if (AbstractC25225BEi.A07(A0j, A0p2, 36600852305350700L) == 1) {
                    num2 = 2131959683;
                }
                C43960Jc9 c43960Jc93 = new C43960Jc9(num3, num2, "suggestions_disclaimer_header_row", i, false, true);
                if (A1M) {
                    jtj = JTI.A00(A0p2, A07, A1W, false, A03, A06, A062, A063, A064, A065);
                }
                return new C43626JRj(requireContext, requireActivity, abstractC59962oe2, FDh, FDh2, AED, A0p2, c43961JcA, new C31612Due(new C43966JcF(requireActivity, A0p2), AbstractC166997dE.A0p(requireContext, 2131968488), AbstractC166997dE.A0p(requireContext, 2131968487), AbstractC166997dE.A0p(requireContext, 2131963190)), c43629JRm, new C31608Dua(AbstractC166997dE.A0p(requireContext, 2131962566)), c43955Jc4, C7c, new C31610Duc(new C31611Dud(requireActivity, A0p2), z), A002, jtj, c43960Jc9, c43960Jc92, c43960Jc93, c31607DuZ, c31454Dry, interfaceC62602sz, c31609Dub, A07, z4, A1Z, A03, A06, A062, A063, A064, A065);
            case 25:
                if (((JR2) this.A01).A1T != null) {
                    return C57112jm.A00();
                }
                return null;
            case 26:
                UserSession A0p9 = ((JR2) this.A01).A0p();
                if (C18U.A06(AbstractC25225BEi.A0j(A0p9, 1), A0p9, 36325506245014660L)) {
                    return new C48740Lh8(A0p9);
                }
                return new Object();
            case 27:
                return new C44013Jd0((UserSession) this.A01);
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C31665DvV.A07((C31665DvV) this.A01, false);
                break;
            case 30:
                C31606DuY c31606DuY = (C31606DuY) this.A01;
                AbstractC59962oe abstractC59962oe3 = c31606DuY.A00;
                Context context = abstractC59962oe3.getContext();
                if (context != null) {
                    return new C31280Dp2(context, abstractC59962oe3, abstractC59962oe3, c31606DuY.A01);
                }
                throw AbstractC166997dE.A0g();
            case 31:
                C31606DuY c31606DuY2 = (C31606DuY) this.A01;
                AbstractC59962oe abstractC59962oe4 = c31606DuY2.A00;
                Context context2 = abstractC59962oe4.getContext();
                if (context2 != null) {
                    UserSession userSession = c31606DuY2.A01;
                    return new C31286Dp8(context2, abstractC59962oe4, userSession, new C7TR(userSession));
                }
                throw AbstractC166997dE.A0g();
            case 32:
            case 37:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 48:
                return this.A01;
            case 33:
            case 38:
            case 43:
            default:
                return AbstractC25226BEj.A1C(this.A01);
            case 34:
            case 39:
            case 44:
                return AbstractC167027dH.A0B(this.A01);
            case 35:
                return ((EJG) this.A01).A01.invoke();
            case 36:
                EJG ejg = (EJG) this.A01;
                return new EW6(ejg, AbstractC166987dD.A0r(ejg.A03));
            case 40:
                return ((C45477KBp) this.A01).A03.invoke();
            case Seq.NULL_REFNUM /* 41 */:
                C45477KBp c45477KBp = (C45477KBp) this.A01;
                return new KGM(c45477KBp.requireContext(), c45477KBp, AbstractC166987dD.A0r(c45477KBp.A04));
            case 45:
                JR3 jr3 = (JR3) this.A01;
                Application A0L = AbstractC25231BEo.A0L(jr3);
                UserSession A01 = JR3.A01(jr3);
                Context requireContext2 = jr3.requireContext();
                UserSession A012 = JR3.A01(jr3);
                C61972ry c61972ry = new C61972ry(jr3.requireContext(), AbstractC018607g.A00(jr3), null);
                C31600DuS c31600DuS = jr3.A08;
                if (c31600DuS == null) {
                    C14360o3.A0F("directOmnipickerLogger");
                    throw C00O.createAndThrow();
                }
                C31641Dv7 c31641Dv7 = c31600DuS.A03;
                if (c31641Dv7 != null) {
                    str = c31641Dv7.A02;
                } else {
                    str = null;
                }
                C14360o3.A0B(A012, 1);
                return new EWN(A0L, A01, new C33093Eix(requireContext2, A012, new C169337h7((C1GL) c61972ry, (InterfaceC169327h6) new C31672Dvd(A012, "raven", null, str, 0, 0, 0, 0, true), false)));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                DirectSearchInboxFragment directSearchInboxFragment = (DirectSearchInboxFragment) this.A01;
                Context applicationContext = directSearchInboxFragment.requireContext().getApplicationContext();
                C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
                return new EWB((Application) applicationContext, AbstractC166987dD.A0r(directSearchInboxFragment.A0Q));
            case 47:
                DirectSearchInboxFragment directSearchInboxFragment2 = (DirectSearchInboxFragment) this.A01;
                Application A0L2 = AbstractC25231BEo.A0L(directSearchInboxFragment2);
                InterfaceC09390do interfaceC09390do2 = directSearchInboxFragment2.A0Q;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                Context requireContext3 = directSearchInboxFragment2.requireContext();
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                C61972ry c61972ry2 = new C61972ry(directSearchInboxFragment2.requireContext(), AbstractC018607g.A00(directSearchInboxFragment2), null);
                if (AbstractC137186Ix.A01(AbstractC166987dD.A0r(interfaceC09390do2)) && (directSearchInboxFragment2.A0E || AbstractC31177DnL.A1Z(AbstractC47132Ef.A00(AbstractC166987dD.A0r(interfaceC09390do2)).A0a))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do2);
                C06090Tz A0j2 = AbstractC25225BEi.A0j(A0o, 0);
                if (C18U.A06(A0j2, A0o, 36313931308075333L)) {
                    longValue = C18U.A01(C06090Tz.A06, A0o, 36595406284523664L);
                } else {
                    longValue = AbstractC31176DnK.A0i(36595406284523664L).longValue();
                }
                int i3 = (int) longValue;
                AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do2, 0);
                if (C18U.A06(A0j2, A0k, 36313931308075333L)) {
                    longValue2 = C18U.A01(C06090Tz.A06, A0k, 36595406284589201L);
                } else {
                    longValue2 = AbstractC31176DnK.A0i(36595406284589201L).longValue();
                }
                int i4 = (int) longValue2;
                AbstractC12990ll A0k2 = AbstractC25230BEn.A0k(interfaceC09390do2, 0);
                if (C18U.A06(A0j2, A0k2, 36317496130671888L)) {
                    longValue3 = C18U.A01(A0j2, A0k2, 36598971107446112L);
                } else {
                    longValue3 = AbstractC31176DnK.A0i(36598971107446112L).longValue();
                }
                int i5 = (int) longValue3;
                if (AbstractC31268Doq.A0B(AbstractC166987dD.A0r(interfaceC09390do2))) {
                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do2);
                    if (AbstractC31268Doq.A01(A0r3)) {
                        i2 = AbstractC25225BEi.A07(C06090Tz.A05, A0r3, 36601286095081617L);
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do2, 0);
                User A0Y = AbstractC166997dE.A0Y(A0K);
                if ((!C2E7.A00(A0Y) && C18U.A06(A0j2, A0K, 36314790301272884L)) || (C2E7.A00(A0Y) && C18U.A06(A0j2, A0K, 36314790301338421L))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                interfaceC09390do2.getValue();
                boolean A066 = C18U.A06(A0j2, AbstractC25230BEn.A0k(interfaceC09390do2, 0), 36321941421828005L);
                boolean A0B = AbstractC31268Doq.A0B(AbstractC166987dD.A0r(interfaceC09390do2));
                boolean A067 = C18U.A06(C06090Tz.A06, AbstractC25230BEn.A0k(interfaceC09390do2, 0), 36320403823534523L);
                boolean A068 = C18U.A06(A0j2, AbstractC25230BEn.A0k(interfaceC09390do2, 0), 36320403823796669L);
                C25805BbM c25805BbM = (C25805BbM) directSearchInboxFragment2.A0O.getValue();
                C36303Fzy c36303Fzy = directSearchInboxFragment2.A06;
                if (c36303Fzy != null) {
                    C34721FRi c34721FRi = c36303Fzy.A01;
                    if (c34721FRi != null) {
                        str2 = c34721FRi.A07;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                C169337h7 c169337h7 = null;
                boolean z5 = false;
                C14360o3.A0B(A0r2, 1);
                if ("universal".equals("forwarding") || "universal".equals("reshare") || "universal".equals("story_share_sheet")) {
                    z5 = true;
                }
                C34548FKi c34548FKi = (C34548FKi) A0r2.A01(C34548FKi.class, new MHR(A0r2, 49));
                C14360o3.A0B("direct_user_search_nullstate", 0);
                c34548FKi.A00 = "direct_user_search_nullstate";
                java.util.Set set = c34548FKi.A02;
                if (AbstractC001800i.A0u(set, "direct_user_search_nullstate")) {
                    c34548FKi.A01.markerAnnotate(276892616, "surface", "direct_user_search_nullstate");
                }
                if (AbstractC001800i.A0u(set, c34548FKi.A00)) {
                    c34548FKi.A01.markerPoint(276892616, "start_suggested_section_load");
                }
                if (AbstractC001800i.A0u(set, c34548FKi.A00)) {
                    c34548FKi.A01.markerPoint(276892616, "loaded_suggested_section");
                }
                C36280FzX c36280FzX = (C36280FzX) A0r2.A01(C36280FzX.class, new C50160MDn(A0r2, 4));
                ArrayList A1E = AbstractC166987dD.A1E();
                HashMap A1G = AbstractC166987dD.A1G();
                if (z3) {
                    A1E.add("message_content");
                    A1G.put("message_content", "0");
                }
                C46036KZc c46036KZc = null;
                if (!A1E.isEmpty()) {
                    c169337h7 = new C169337h7((C1GL) c61972ry2, (InterfaceC169327h6) new C36692GFn(A0r2, A1E, A1G), false);
                }
                if (C18U.A06(A0j2, A0r2, 36317496132834590L)) {
                    c221249po = new C221249po(A0r2, c61972ry2, new A7K(A0r2, str2));
                } else {
                    c221249po = null;
                }
                C33098Ej2 c33098Ej2 = new C33098Ej2(A0r2, c221249po, A066, A0B, A067);
                if (A068) {
                    c46037KZd = new C46037KZd(A0r2);
                } else {
                    c46037KZd = null;
                }
                if (c25805BbM != null) {
                    c46036KZc = new C46036KZc(c25805BbM);
                }
                C33097Ej1 c33097Ej1 = new C33097Ej1(requireContext3, A0r2, c36280FzX, new C169337h7((C1GL) c61972ry2, (InterfaceC169327h6) new C31672Dvd(A0r2, "universal", null, str2, i3, i4, i5, i2, true), false), c169337h7);
                C33095Eiz c33095Eiz = new C33095Eiz(A0r2);
                C33096Ej0 c33096Ej0 = new C33096Ej0(A0r2);
                if (C18U.A06(A0j2, A0r2, 2342156051466094224L)) {
                    num = C05F.A00;
                } else if (z2) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                return new EWN(A0L2, A0r, new C33094Eiy(A0r2, c33095Eiz, c33096Ej0, new C46035KZb(A0r2), c33097Ej1, c46036KZc, c46037KZd, c33098Ej2, num, z5));
        }
        return C0eB.A00;
    }
}
