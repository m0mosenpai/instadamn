package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.EOt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32392EOt extends AbstractC193068gm {
    public final int A00;
    public final Object A01;

    public C32392EOt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AbstractC192798gL abstractC192798gL, Object obj, int i) {
        abstractC192798gL.A00(new C32392EOt(obj, i));
    }

    @Override // X.AbstractC192848gQ
    public final void A01() {
        switch (this.A00) {
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return;
            case 23:
                U79 u79 = (U79) this.A01;
                u79.A01 = true;
                u79.A02 = false;
                return;
            default:
                super.A01();
                return;
        }
    }

    @Override // X.AbstractC192848gQ
    public final void A02() {
        C3DN c3dn;
        switch (this.A00) {
            case 23:
                U79 u79 = (U79) this.A01;
                U79.A00(XPI.FETCHING_START, u79);
                if (!u79.A02 && (c3dn = u79.A07) != null && !((C3DP) c3dn).A0h) {
                    u79.A02 = true;
                    U79.A03(u79);
                }
                u79.A08.A02();
                return;
            case 24:
            case 25:
            default:
                super.A02();
                return;
            case 26:
                return;
        }
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        FragmentActivity fragmentActivity;
        AbstractC115105If c115115Ig;
        switch (this.A00) {
            case 1:
                C9GR.A07(AbstractC31172DnG.A06(this.A01), 2131954218);
                return;
            case 3:
                Ef6 ef6 = (Ef6) this.A01;
                UserSession userSession = ef6.A00;
                String str = ef6.A01;
                if (ef6 instanceof Ef5) {
                    AbstractC167017dG.A1N(userSession, str);
                    C35191Ffj.A00(userSession, "initial_async_controller_request_error", str);
                }
                AbstractC34209F7h.A00().A01(((AbstractC32357ENe) ef6).A00);
                ((AbstractC32357ENe) ef6).A01.A01().setVisibility(0);
                return;
            case 4:
                AbstractC35254Fgn.A01(AbstractC31172DnG.A07(this.A01));
                return;
            case 9:
                C9GR.A0F(((AnonymousClass740) this.A01).A07.getContext(), "branded_content_tools_error", 2131954218);
                return;
            case 10:
                C14360o3.A0B(abstractC115105If, 0);
                Context context = ((C36006Fv4) this.A01).A00;
                C9GR.A03(context, context.getString(2131968430), "save_to_creator_list_failed", 0);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    C0w9.A06("BrandedContentAddToList", "Error in fetching bloks BC Creators AddToList bottom sheet", A01);
                    return;
                } else {
                    C0w9.A03("BrandedContentAddToList", "Error in fetching bloks BC Creators AddToList bottom sheet");
                    return;
                }
            case 23:
                C14360o3.A0B(abstractC115105If, 0);
                U79 u79 = (U79) this.A01;
                C3DN c3dn = u79.A07;
                if (c3dn != null && !((C3DP) c3dn).A0h) {
                    return;
                }
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    c115115Ig = new C115095Ie(A012);
                } else {
                    C9CD c9cd = (C9CD) abstractC115105If.A00();
                    if (c9cd != null) {
                        c115115Ig = new C115115Ig(new C68858VdE(c9cd.A01));
                    } else {
                        C34722FRj c34722FRj = u79.A08;
                        c34722FRj.A01();
                        AbstractC35261Fgv.A03(u79.A03);
                        c34722FRj.A05(null);
                        return;
                    }
                }
                U79.A01(c115115Ig, u79);
                return;
            case 24:
                C14360o3.A0B(abstractC115105If, 0);
                fragmentActivity = ((C33108EjC) this.A01).A02;
                break;
            case 25:
                C14360o3.A0B(abstractC115105If, 0);
                fragmentActivity = ((C33107EjB) this.A01).A01;
                break;
            case 26:
                C9GR.A0B(AbstractC31172DnG.A07(this.A01), "something_went_wrong");
                return;
            case 27:
                C14360o3.A0B(abstractC115105If, 0);
                fragmentActivity = ((C33106EjA) this.A01).A00.getActivity();
                if (fragmentActivity == null) {
                    return;
                }
                break;
            default:
                return;
        }
        AbstractC35254Fgn.A03(fragmentActivity, abstractC115105If);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q;
        C62862tP c62862tP;
        AbstractC12990ll A0o;
        C32301EKo c32301EKo;
        C66246U5q A0E;
        C62862tP A03;
        UserSession userSession;
        Fragment fragment;
        C189478aR c189478aR;
        AbstractC12990ll abstractC12990ll;
        IgFragmentActivity igFragmentActivity;
        String str;
        switch (this.A00) {
            case 0:
                c66246U5q = (C66246U5q) obj;
                c62862tP = ((EO3) this.A01).A00;
                AbstractC33787EwD.A00(c62862tP, c66246U5q);
                return;
            case 1:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                C32301EKo c32301EKo2 = (C32301EKo) this.A01;
                A0o = AbstractC166987dD.A0o(c32301EKo2.A03);
                c32301EKo = c32301EKo2;
                c62862tP = AbstractC31172DnG.A0N(c32301EKo, A0o);
                AbstractC33787EwD.A00(c62862tP, c66246U5q);
                return;
            case 2:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                C35931Ftp c35931Ftp = (C35931Ftp) this.A01;
                c62862tP = C62862tP.A02(c35931Ftp.A00, AbstractC31171DnF.A0D("pro_to_pro.framework.async.controller.entry"), c35931Ftp.A01, null);
                AbstractC33787EwD.A00(c62862tP, c66246U5q);
                return;
            case 3:
                c66246U5q = (C66246U5q) obj;
                Ef6 ef6 = (Ef6) this.A01;
                UserSession userSession2 = ef6.A00;
                String str2 = ef6.A01;
                if (ef6 instanceof Ef5) {
                    AbstractC167017dG.A1N(userSession2, str2);
                    C35191Ffj.A00(userSession2, "initial_async_controller_request_success", str2);
                }
                C57012jc c57012jc = ((AbstractC32357ENe) ef6).A01;
                if (c57012jc.A04()) {
                    c57012jc.A01().setVisibility(8);
                }
                A0o = ef6.A00;
                c32301EKo = ef6;
                c62862tP = AbstractC31172DnG.A0N(c32301EKo, A0o);
                AbstractC33787EwD.A00(c62862tP, c66246U5q);
                return;
            case 4:
                A0E = AbstractC31175DnJ.A0E(obj);
                C32262EIw c32262EIw = (C32262EIw) this.A01;
                C07270a1 c07270a1 = c32262EIw.A06;
                if (c07270a1 != null) {
                    FTX.A00(c07270a1);
                    C07270a1 c07270a12 = c32262EIw.A06;
                    if (c07270a12 != null) {
                        A03 = C62862tP.A03(c32262EIw, c07270a12, null);
                        A03.A00 = true;
                        AbstractC33787EwD.A00(A03, A0E);
                        return;
                    }
                }
                C14360o3.A0F("loggedOutSession");
                throw C00O.createAndThrow();
            case 5:
                A0E = AbstractC31175DnJ.A0E(obj);
                N6G n6g = (N6G) this.A01;
                A03 = AbstractC31172DnG.A0N(n6g, n6g.A06());
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 6:
                A0E = (C66246U5q) obj;
                EVQ evq = (EVQ) this.A01;
                CallerContext callerContext = EVQ.A0B;
                A03 = C62862tP.A02(evq.A06, new InterfaceC11380iw() { // from class: X.FuA
                    public static final String __redex_internal_original_name = "FacebookLoginHelper$1$$ExternalSyntheticLambda0";

                    @Override // X.InterfaceC11380iw
                    public final String getModuleName() {
                        return "bloks-com.bloks.www.fx.pf.auth_flow.async";
                    }
                }, evq.A08, null);
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 7:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            default:
                A0E = AbstractC31175DnJ.A0E(obj);
                A03 = (C62862tP) this.A01;
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 8:
                A0E = (C66246U5q) obj;
                A03 = (C62862tP) ((ViewOnClickListenerC35684FpJ) ((C31702Dw7) this.A01).A01).A03;
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 9:
                A0E = AbstractC31175DnJ.A0E(obj);
                AnonymousClass740 anonymousClass740 = (AnonymousClass740) this.A01;
                userSession = anonymousClass740.A05;
                fragment = anonymousClass740.A07;
                A03 = AbstractC31172DnG.A0N(fragment, userSession);
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 10:
                A0E = AbstractC31175DnJ.A0E(obj);
                C36006Fv4 c36006Fv4 = (C36006Fv4) this.A01;
                userSession = c36006Fv4.A07;
                fragment = c36006Fv4.A04;
                A03 = AbstractC31172DnG.A0N(fragment, userSession);
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0E = AbstractC31175DnJ.A0E(obj);
                C34684FPv c34684FPv = (C34684FPv) this.A01;
                userSession = c34684FPv.A01;
                fragment = c34684FPv.A00;
                A03 = AbstractC31172DnG.A0N(fragment, userSession);
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 22:
                A0E = AbstractC31175DnJ.A0E(obj);
                A03 = (C62862tP) this.A01;
                if (A03 == null) {
                    return;
                }
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 23:
                C66246U5q A0E2 = AbstractC31175DnJ.A0E(obj);
                U79 u79 = (U79) this.A01;
                C3DN c3dn = u79.A07;
                if ((c3dn != null && !((C3DP) c3dn).A0h) || (c189478aR = u79.A00) == null) {
                    return;
                }
                U79.A00(XPI.FETCHING_DONE, u79);
                C34722FRj c34722FRj = u79.A08;
                c34722FRj.A04(null);
                C62862tP A01 = C62862tP.A01(null, u79.A03, u79.A05, u79.A06);
                SparseArray sparseArray = A01.A01;
                sparseArray.put(R.id.bottom_sheet_id, c189478aR);
                sparseArray.put(R.id.ixt_event_ended_handler, c34722FRj);
                AbstractC79383gk.A01(new RunnableC36929GOy(A01, A0E2));
                return;
            case 24:
                A0E = AbstractC31175DnJ.A0E(obj);
                C33108EjC c33108EjC = (C33108EjC) this.A01;
                abstractC12990ll = c33108EjC.A03;
                igFragmentActivity = c33108EjC.A02;
                str = "Password Reset";
                A03 = AbstractC31178DnM.A0G(igFragmentActivity, abstractC12990ll, str);
                A03.A00 = true;
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 25:
                A0E = AbstractC31175DnJ.A0E(obj);
                C33107EjB c33107EjB = (C33107EjB) this.A01;
                abstractC12990ll = c33107EjB.A02;
                igFragmentActivity = c33107EjB.A01;
                str = "Security Checkup";
                A03 = AbstractC31178DnM.A0G(igFragmentActivity, abstractC12990ll, str);
                A03.A00 = true;
                AbstractC33787EwD.A00(A03, A0E);
                return;
            case 26:
                Bundle A0b = AbstractC166987dD.A0b();
                ENO eno = (ENO) this.A01;
                A0b.putInt("ChallengeFragment.bloksAction", U6N.A00(eno.A00).A01(obj));
                String str3 = eno.A00.token;
                C14360o3.A0B(str3, 0);
                Context requireContext = eno.requireContext();
                Intent intent = new Intent(requireContext, (Class<?>) ChallengeActivity.class);
                intent.addFlags(335544320);
                AbstractC31179DnN.A0k(intent, AbstractC166987dD.A0b(), A0b, "bloks", str3);
                try {
                    C12260kU.A0C(requireContext, intent);
                    return;
                } catch (IllegalStateException e) {
                    C0w9.A07(AbstractC111324zv.A00(296), e);
                    return;
                }
            case 27:
                A0E = AbstractC31175DnJ.A0E(obj);
                C33106EjA c33106EjA = (C33106EjA) this.A01;
                A03 = AbstractC31172DnG.A0N(c33106EjA.A00, c33106EjA.A01);
                A03.A00 = true;
                AbstractC33787EwD.A00(A03, A0E);
                return;
        }
    }
}
