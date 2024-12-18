package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ikw */
/* loaded from: classes7.dex */
public final class C42089Ikw implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C42089Ikw.class);
    public static final String __redex_internal_original_name = "MediaOptionsOverflowDeleteHandler";

    public static void A00(Context context, DialogInterface.OnClickListener onClickListener, Fragment fragment, C1P1 c1p1, C1P1 c1p12, C1P1 c1p13, C1P1 c1p14, C1P1 c1p15, UserSession userSession, C38321qM c38321qM) {
        int i;
        int i2;
        C193328hC A0H;
        if (c38321qM.A4h()) {
            A0H = AbstractC31171DnF.A0I(context);
            A0H.A0A(2131976033);
            A0H.A09(2131976034);
            A0H.A06();
        } else {
            if (c38321qM.A0C.getBoostedBySponsor() != null) {
                AbstractC55199Oe9.A04(fragment.requireActivity(), null, userSession, context.getString(2131954769), context.getString(2131954770));
                return;
            }
            if (c38321qM.A0C.BPh() != null && c38321qM.A0C.BPh().getHasBeenMashedUp()) {
                A0H = AbstractC31171DnF.A0I(context);
                A0H.A0A(2131956570);
                A0H.A09(2131972574);
                A0H.A0J(new DialogInterfaceOnClickListenerC41808IfO(context, AbstractC018607g.A00(fragment), c1p1, userSession, c38321qM), 2131957677);
                A0H.A0s(true);
                A0H.A0t(true);
                A0H.A0I(null, 2131961127);
            } else {
                if (AbstractC40630Hzo.A00(c38321qM)) {
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    InterfaceC16530ry interfaceC16530ry = A002.A34;
                    C0YR[] c0yrArr = C23031Ai.A8c;
                    if (!AbstractC167017dG.A1b(A002, interfaceC16530ry, c0yrArr, 161) && c38321qM.A1y() != C3YU.A04) {
                        C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                        AbstractC167007dF.A1L(A003, A003.A34, c0yrArr, 161, true);
                        A0H = AbstractC31171DnF.A0I(context);
                        A0H.A0A(2131966099);
                        A0H.A09(2131966100);
                        A0H.A0J(new DialogInterfaceOnClickListenerC41808IfO(context, AbstractC018607g.A00(fragment), c1p1, userSession, c38321qM), 2131957677);
                        A0H.A0I(new DialogInterfaceOnClickListenerC41805IfL(1, context, userSession, c38321qM), 2131966101);
                    }
                }
                if (c38321qM.A5g()) {
                    I1Z.A00(null, fragment, userSession, c38321qM);
                    return;
                }
                if (c38321qM.A5P()) {
                    C28482Cha.A01((Activity) context, null, null, fragment, c1p1, c1p12, c1p13, userSession, c38321qM, null);
                    return;
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                if (c38321qM.A4p()) {
                    i = 2131956570;
                    i2 = 2131957719;
                } else if (c38321qM.A5o()) {
                    i = 2131956575;
                    i2 = 2131957718;
                } else if (c38321qM.A6a(userSession)) {
                    i = 2131956576;
                    i2 = 2131957720;
                } else if (c38321qM.A0C.BPh() != null && c38321qM.A0C.BPh().getHasBeenMashedUp()) {
                    i = 2131972155;
                    i2 = 2131972154;
                } else if (c38321qM.A5c() && AbstractC166997dE.A1Z(c38321qM.A0C.BZt(), true)) {
                    i = 2131957721;
                    A1C.append(context.getString(2131957717));
                    A1C.append("\n\n");
                    i2 = 2131957695;
                } else {
                    i = 2131957721;
                    i2 = 2131957716;
                }
                A1C.append(context.getString(i2));
                if (C196068lw.A03(C196068lw.A00(userSession).A00(A00)) && AbstractC76713cJ.A01(c38321qM, true)) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    A1E.add("FB");
                    C193328hC A0H2 = AbstractC31171DnF.A0H(fragment.requireActivity());
                    A0H2.A0A(2131957621);
                    A0H2.A09(2131957620);
                    DialogInterfaceOnClickListenerC41814IfU dialogInterfaceOnClickListenerC41814IfU = new DialogInterfaceOnClickListenerC41814IfU(1, context, fragment, c1p14, userSession, c38321qM, A1E);
                    EnumC193348hE enumC193348hE = EnumC193348hE.A06;
                    A0H2.A0R(dialogInterfaceOnClickListenerC41814IfU, enumC193348hE, 2131957618);
                    A0H2.A0s(true);
                    A0H2.A0t(true);
                    A0H2.A0D(new DialogInterfaceOnClickListenerC41800IfG(1, userSession, c38321qM));
                    A0H2.A0P(new DialogInterfaceOnClickListenerC41813IfT(0, c38321qM, context, userSession, c1p15, fragment), enumC193348hE, 2131957619);
                    AbstractC166987dD.A1W(A0H2);
                    AbstractC40629Hzn.A00(AbstractC58317Pt9.A00(263), userSession, c38321qM);
                    return;
                }
                A0H = AbstractC31171DnF.A0H(fragment.requireActivity());
                A0H.A0A(i);
                A0H.A0r(A1C.toString());
                A0H.A0L(new DialogInterfaceOnClickListenerC41808IfO(context, AbstractC018607g.A00(fragment), c1p1, userSession, c38321qM), 2131957677);
                A0H.A0s(true);
                A0H.A0t(true);
                A0H.A06();
                if (c38321qM.A5o() && !c38321qM.A4p()) {
                    A0H.A0H(onClickListener, 2131966008);
                }
            }
            AbstractC166987dD.A1W(A0H);
        }
        A0H.A0s(true);
        A0H.A0t(true);
        AbstractC166987dD.A1W(A0H);
    }

    public static /* synthetic */ void A01(Context context, AbstractC018607g abstractC018607g, C1P1 c1p1, UserSession userSession, C38321qM c38321qM) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, MSV.A00(226), new Object[]{c38321qM.getId(), c38321qM.BRp()});
        A0M.A9s("media_id", c38321qM.getId());
        A0M.A0I("igtv_feed_preview", c38321qM.A5g());
        A0M.A0S(H9U.class, C41256INx.class);
        C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
        if (c1p1 != null) {
            A0U.A00 = c1p1;
        }
        C1GJ.A00(context, abstractC018607g, A0U);
    }
}
