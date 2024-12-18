package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.Iei, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41766Iei {
    public static boolean A00;

    public static final void A07(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        AbstractC31175DnJ.A1M(abstractC59962oe, new C63397SjR(abstractC59962oe.requireActivity(), userSession, C2Fb.A0X, MSV.A00(213), false));
    }

    public static final void A08(AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, String str) {
        String str2;
        HashMap A1G;
        String A0q;
        if (!A00) {
            A00 = true;
            C62862tP A03 = C62862tP.A03(abstractC59962oe, userSession, null);
            boolean A5d = c38321qM.A5d();
            boolean A4h = c38321qM.A4h();
            if (A5d) {
                if (A4h) {
                    if (C18U.A06(C06090Tz.A05, userSession, 36313957077616979L)) {
                        str2 = AbstractC111324zv.A00(817);
                    } else {
                        str2 = "com.instagram.insights.media.posts.surface";
                    }
                } else if (C18U.A06(C06090Tz.A06, userSession, 36313360077162403L)) {
                    str2 = AbstractC111324zv.A00(816);
                } else {
                    str2 = "com.instagram.insights.media.posts.bottom_sheet.action";
                }
            } else if (A4h) {
                if (C18U.A06(C06090Tz.A05, userSession, 36313957077748053L)) {
                    str2 = AbstractC111324zv.A00(821);
                } else {
                    str2 = "com.instagram.insights.media.videos.surface";
                }
            } else if (C18U.A06(C06090Tz.A06, userSession, 36313360077490086L)) {
                str2 = AbstractC111324zv.A00(820);
            } else {
                str2 = "com.instagram.insights.media.videos.bottom_sheet.action";
            }
            String id = c38321qM.getId();
            if (id != null) {
                Object obj = AbstractC167007dF.A0m(id, "_", 0).get(0);
                C006802i.A0p.markerStart(39130588);
                AbstractC167007dF.A0J().postDelayed(new J3A(userSession), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                if (c38321qM.A4h()) {
                    A00 = false;
                    A1G = AbstractC166987dD.A1G();
                    A1G.put("target_id", obj);
                    if (str != null) {
                        A1G.put("origin", str);
                    }
                    boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36329955830874711L);
                    Resources A0N = AbstractC166997dE.A0N(abstractC59962oe);
                    int i = 2131952248;
                    if (A06) {
                        i = 2131957604;
                    }
                    A0q = A0N.getString(i);
                    C14360o3.A0A(A0q);
                } else if ((c38321qM.A5d() && C18U.A06(C06090Tz.A05, userSession, 36313360077162403L)) || (!c38321qM.A5d() && C18U.A06(C06090Tz.A05, userSession, 36313360077490086L))) {
                    A00 = false;
                    A1G = AbstractC166987dD.A1G();
                    A1G.put("target_id", obj);
                    A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(abstractC59962oe), 2131976707);
                    if (c38321qM.A5d()) {
                        A0q = AbstractC166997dE.A0N(abstractC59962oe).getString(2131969801);
                    }
                } else {
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    AbstractC37300Gc1.A18(obj, A1I);
                    if (str != null) {
                        A1I.put("origin", str);
                    }
                    AbstractC192798gL A02 = C192108fB.A02(null, userSession, str2, A1I);
                    A02.A00(new C32394EOv(abstractC59962oe, A03, 4));
                    C1GJ.A03(A02);
                    return;
                }
                C140966Yy A0C = AbstractC31175DnJ.A0C(abstractC59962oe, userSession);
                C66277U6x A01 = C66277U6x.A01(str2, A1G);
                IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(userSession);
                A0C2.A0U = A0q;
                A0C.A0B(null, W6d.A02(A0C2, A01));
                A0C.A04();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C105824pt c105824pt) {
        C2EY c2ey;
        C34726FRp A07;
        if (c105824pt != null) {
            A07 = C28531Zo.A04.A02.A07(interfaceC11380iw, userSession, C2EY.A1B);
            A07.A06(c105824pt.getId());
            User user = c105824pt.A09;
            user.getClass();
            String id = user.getId();
            Bundle bundle = A07.A07;
            bundle.putString(MSV.A00(334), id);
            String str = c105824pt.A0e;
            str.getClass();
            bundle.putString(MSV.A00(333), str);
            bundle.putString(AbstractC111324zv.A00(1588), "v2v");
            bundle.putString(AbstractC111324zv.A00(1587), "paperplane");
        } else {
            if (c38321qM.A5d()) {
                c2ey = C2EY.A1F;
            } else {
                c2ey = C2EY.A0t;
            }
            A07 = C28531Zo.A04.A02.A07(interfaceC11380iw, userSession, c2ey);
            String id2 = c38321qM.getId();
            if (id2 != null) {
                A07.A06(id2);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        DirectShareSheetFragment A002 = A07.A00();
        C3DN A01 = C3DN.A00.A01(context);
        if (A01 != null) {
            A01.A0K(A002);
        }
    }

    public static final void A01(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str) {
        EnumC77173d3 enumC77173d3;
        EnumC77173d3 enumC77173d32;
        EnumC77173d3 enumC77173d33;
        String str2;
        if (AbstractC37301Gc2.A1a(userSession, c38321qM)) {
            enumC77173d3 = EnumC77173d3.A02;
            enumC77173d33 = enumC77173d3;
            enumC77173d32 = EnumC77173d3.A03;
        } else {
            enumC77173d3 = EnumC77173d3.A03;
            enumC77173d32 = EnumC77173d3.A02;
            enumC77173d33 = enumC77173d32;
        }
        I0H.A00(userSession, enumC77173d3, enumC77173d32, c38321qM);
        AbstractC41706Idc.A03(context, interfaceC60442pS, userSession, null, enumC77173d32, c38321qM, null, C05F.A0N, null, -1, -1, null, null, null, null, false, false);
        if (enumC77173d32 == enumC77173d33) {
            str2 = "like";
        } else {
            str2 = "unlike";
        }
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, str2);
        A0F.A2G = false;
        A0F.A70 = str;
        C32U.A0I(userSession, A0F, interfaceC60442pS, C05F.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r7.A5g() == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.content.DialogInterface.OnDismissListener r4, X.AbstractC59962oe r5, com.instagram.common.session.UserSession r6, X.C38321qM r7, boolean r8) {
        /*
            if (r8 == 0) goto Le
            boolean r1 = r7.A5g()
            r2 = 2131976688(0x7f1361f0, float:1.9590504E38)
            r0 = 2131976687(0x7f1361ef, float:1.9590502E38)
            if (r1 != 0) goto L14
        Le:
            r2 = 2131964184(0x7f133118, float:1.9565142E38)
            r0 = 2131964183(0x7f133117, float:1.956514E38)
        L14:
            X.8hC r1 = X.AbstractC31175DnJ.A0O(r5)
            r1.A0A(r2)
            r1.A09(r0)
            r0 = 2131964202(0x7f13312a, float:1.9565179E38)
            r3 = 2
            X.Og5 r2 = new X.Og5
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A0L(r2, r0)
            r0 = 14
            X.Ifq r0 = X.DialogInterfaceOnClickListenerC41836Ifq.A00(r4, r0)
            X.AbstractC31176DnK.A14(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41766Iei.A03(android.content.DialogInterface$OnDismissListener, X.2oe, com.instagram.common.session.UserSession, X.1qM, boolean):void");
    }

    public static final void A05(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2) {
        C42344Ip6 A002 = C42344Ip6.A00(userSession);
        Context requireContext = abstractC59962oe.requireContext();
        C08790ch A003 = AbstractC018607g.A00(abstractC59962oe);
        C33100Ej4 c33100Ej4 = new C33100Ej4(abstractC59962oe.requireActivity(), abstractC59962oe.mFragmentManager, interfaceC11380iw, userSession, c38321qM, str, str2);
        C1ON A004 = AbstractC35242Fgb.A00(A002.A00, c38321qM, null, C05F.A00, interfaceC11380iw.getModuleName());
        A004.A00 = c33100Ej4;
        C1GJ.A00(requireContext, A003, A004);
        AbstractC73317Y7a.A0G(interfaceC11380iw, userSession, str, str2, "copy_link", AbstractC25226BEj.A1G(c38321qM));
    }

    public static final void A06(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2) {
        C42582It0 c42582It0 = new C42582It0(interfaceC11380iw);
        C42344Ip6 A002 = C42344Ip6.A00(userSession);
        Context requireContext = abstractC59962oe.requireContext();
        C08790ch A003 = AbstractC018607g.A00(abstractC59962oe);
        ETW etw = new ETW(abstractC59962oe, interfaceC11380iw, userSession, c38321qM, c42582It0, str, str2);
        C1ON A004 = AbstractC35242Fgb.A00(A002.A00, c38321qM, null, C05F.A0Y, interfaceC11380iw.getModuleName());
        A004.A00 = etw;
        C1GJ.A00(requireContext, A003, A004);
        AbstractC73317Y7a.A0G(interfaceC11380iw, userSession, str, str2, "system_share_sheet", AbstractC25226BEj.A1G(c38321qM));
    }

    public static final void A02(DialogInterface.OnDismissListener onDismissListener, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM) {
        C193328hC A0O = AbstractC31175DnJ.A0O(abstractC59962oe);
        A0O.A0A(2131972235);
        A0O.A09(2131972301);
        A0O.A0F(new DialogInterfaceOnClickListenerC41837Ifr(3, onDismissListener, abstractC59962oe, userSession, c38321qM));
        AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC41836Ifq.A00(onDismissListener, 16), A0O);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, String str, String str2) {
        if (c38321qM.A1b() != EnumC39597He7.A07 && c38321qM.A1b() != EnumC39597He7.A0C && c38321qM.A1b() != EnumC39597He7.A0D) {
            C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
            A0H.A0A(2131976033);
            A0H.A09(2131976034);
            A0H.A06();
            AbstractC166987dD.A1W(A0H);
            return;
        }
        if (c38321qM.A0C.getBoostedBySponsor() != null) {
            AbstractC55199Oe9.A04(fragmentActivity, null, userSession, AbstractC166997dE.A0p(fragmentActivity, 2131954773), AbstractC166997dE.A0p(fragmentActivity, 2131954774));
            return;
        }
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        C14360o3.A0A(C27971Xb.A00);
        NMW nmw = new NMW();
        Bundle A0b = AbstractC166987dD.A0b();
        if (str == null) {
            str = AbstractC167017dG.A0j();
        }
        A0b.putString("igtv_session_id_arg", str);
        A0b.putString("igtv_media_id_arg", str2);
        AbstractC31175DnJ.A0v(A0b, nmw, A0r);
    }
}
