package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.FrW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35794FrW implements CallerContextable {
    public static final String __redex_internal_original_name = "CreateAccountUtil";

    public static void A02(Handler handler, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, GY4 gy4, GY6 gy6, RegFlowExtras regFlowExtras, EVN evn, EnumC31713DwI enumC31713DwI, String str, String str2, boolean z) {
        String str3;
        EnumC33445EqI A01 = regFlowExtras.A01();
        double A00 = AbstractC31171DnF.A00();
        double A012 = AbstractC31171DnF.A01();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "register_with_ci_option");
        AbstractC31179DnN.A16(A0f, A012, A00);
        A0f.A7v("is_opted_in", Boolean.valueOf(regFlowExtras.A0h));
        AbstractC31176DnK.A1J(A0f, A00);
        AbstractC31178DnM.A19(A0f, enumC31713DwI.A01);
        boolean z2 = true;
        A0f.A7v("username_suggestion_avail", Boolean.valueOf(AbstractC167007dF.A1W(str2)));
        if (str2 == null || str2.equals(str)) {
            z2 = false;
        }
        A0f.A7v("username_suggestion_changed_by_user", Boolean.valueOf(z2));
        if (A01 != null) {
            AbstractC31171DnF.A19(A0f, A01.A00);
        }
        AbstractC35274Fh9.A05(A0f);
        A0f.Cht();
        if (A01 != EnumC33445EqI.A04) {
            C006802i.A0p.markerPoint(4197923, "queue_signup_runnable");
            handler.post(new GRA(handler, abstractC59962oe, interfaceC11380iw, c07270a1, gy4, gy6, regFlowExtras, str, z));
            return;
        }
        Context requireContext = abstractC59962oe.requireContext();
        if (regFlowExtras.A09 != null && C1AD.A06(C06090Tz.A05, 2324139960736678397L)) {
            str3 = regFlowExtras.A09;
        } else {
            str3 = null;
        }
        C1ON A0C = AbstractC35276FhB.A0C(c07270a1, null, str, str3, regFlowExtras.A07, regFlowExtras.A06, C16030qx.A00(requireContext), AbstractC31172DnG.A10(requireContext), null, false, false, regFlowExtras.A0h, regFlowExtras.A0r, regFlowExtras.A0m);
        Context requireContext2 = abstractC59962oe.requireContext();
        CallerContext callerContext = EVQ.A0B;
        A0C.A00 = new EU3(requireContext2, handler, abstractC59962oe, interfaceC11380iw, c07270a1, gy6, regFlowExtras, evn);
        abstractC59962oe.schedule(A0C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r28.A0l != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(android.os.Handler r22, X.AbstractC59962oe r23, X.InterfaceC11380iw r24, X.C07270a1 r25, X.GY4 r26, X.GY6 r27, com.instagram.registration.model.RegFlowExtras r28, java.lang.Integer r29, boolean r30) {
        /*
            r0 = 1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r14 = r28
            X.EqI r15 = r14.A01()
            r15.getClass()
            X.02i r8 = X.C006802i.A0p
            boolean r0 = r14.A0k
            if (r0 == 0) goto L1b
            boolean r0 = r14.A0l
            r21 = 1
            if (r0 == 0) goto L1d
        L1b:
            r21 = 0
        L1d:
            java.lang.String r0 = r14.A04
            com.instagram.registration.model.RegFlowExtras r13 = X.AbstractC31181DnP.A0B(r14)
            X.Eij r3 = new X.Eij
            r4 = r22
            r5 = r23
            r7 = r24
            r9 = r25
            r11 = r26
            r12 = r27
            r2 = r29
            r22 = r30
            r6 = r5
            r10 = r9
            r16 = r15
            r17 = r2
            r18 = r2
            r19 = r0
            r20 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.GFC r0 = new X.GFC
            r0.<init>(r1)
            r3.A01 = r0
            X.GFE r0 = new X.GFE
            r10 = r0
            r11 = r5
            r12 = r9
            r13 = r3
            r16 = r2
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r3.A02 = r0
            r1 = 4197923(0x400e23, float:5.882543E-39)
            java.lang.String r0 = "start_account_creation_request"
            r8.markerPoint(r1, r0)
            A05(r5, r9, r3, r14, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35794FrW.A03(android.os.Handler, X.2oe, X.0iw, X.0a1, X.GY4, X.GY6, com.instagram.registration.model.RegFlowExtras, java.lang.Integer, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0Jk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Jk, java.lang.Object] */
    public static void A05(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, AbstractC32549EUz abstractC32549EUz, RegFlowExtras regFlowExtras, Integer num) {
        String A0R;
        String str;
        if (A07(regFlowExtras)) {
            AbstractC167017dG.A1N(c07270a1, abstractC59962oe);
            String str2 = regFlowExtras.A0J;
            FMK fmk = new FMK(abstractC59962oe, abstractC32549EUz, c07270a1, regFlowExtras);
            if (str2 == null || !C023409i.A0A.A0A(new Object(), null, fmk, str2)) {
                A0R = AnonymousClass001.A0R("Failed to add create secondary account operation in non-linking simple SAC. Last logged-in userid is: ", str2);
                str = "SecondaryAccountApi";
            } else {
                return;
            }
        } else {
            String str3 = regFlowExtras.A0J;
            if (EnumC33445EqI.A07 == regFlowExtras.A01() && str3 != null) {
                C34623FNg c34623FNg = new C34623FNg(abstractC59962oe, c07270a1, abstractC32549EUz, regFlowExtras, num, str3);
                if (C023409i.A0A.A0A(new Object(), null, c34623FNg, str3)) {
                    return;
                }
                A0R = AnonymousClass001.A0R("Failed to add create secondary account operation in non linking SAC. The last logged in account id is: ", str3);
                str = __redex_internal_original_name;
            } else {
                if (C18U.A06(C06090Tz.A05, c07270a1, 36311478881616414L)) {
                    C14120nc.A00().ATO(new C32669EZt(abstractC59962oe, c07270a1, abstractC32549EUz, regFlowExtras, num));
                    return;
                }
                C1ON A00 = AbstractC34291FAl.A00(abstractC59962oe.requireContext(), c07270a1, regFlowExtras, num, null, null);
                A00.A00 = abstractC32549EUz;
                abstractC59962oe.schedule(A00);
                return;
            }
        }
        C0w9.A03(str, A0R);
    }

    public static Integer A00() {
        for (Integer num : C05F.A00(3)) {
            if (C14360o3.A0K(AbstractC34292FAm.A00(num), NetInfoModule.CONNECTION_TYPE_NONE)) {
                return num;
            }
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('\'');
        A1C.append(NetInfoModule.CONNECTION_TYPE_NONE);
        throw AbstractC166987dD.A12(AbstractC166997dE.A0x("' is not a valid retry strategy name.", A1C));
    }

    public static void A06(UserSession userSession) {
        if (C18U.A06(C06090Tz.A06, userSession, 36329994485645936L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
            A0w.E7G("nux_started_timestamp", currentTimeMillis);
            A0w.apply();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r4.A0J == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A07(com.instagram.registration.model.RegFlowExtras r4) {
        /*
            boolean r0 = r4.A0u
            r3 = 1
            if (r0 == 0) goto La
            java.lang.String r0 = r4.A0J
            r2 = 1
            if (r0 != 0) goto Lb
        La:
            r2 = 0
        Lb:
            X.EqI r1 = X.EnumC33445EqI.A07
            X.EqI r0 = r4.A01()
            if (r1 != r0) goto L16
            if (r2 == 0) goto L16
            return r3
        L16:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35794FrW.A07(com.instagram.registration.model.RegFlowExtras):boolean");
    }

    public static Integer A01(RegFlowExtras regFlowExtras) {
        EnumC33445EqI A01 = regFlowExtras.A01();
        EnumC33445EqI enumC33445EqI = EnumC33445EqI.A07;
        if (A01 == enumC33445EqI) {
            if (regFlowExtras.A0t && regFlowExtras.A0y) {
                return C05F.A0j;
            }
            if (A07(regFlowExtras)) {
                return C05F.A0N;
            }
        }
        if (A01 == EnumC33445EqI.A06 || (A01 == enumC33445EqI && regFlowExtras.A02() == C05F.A01)) {
            return C05F.A01;
        }
        if (A01 != EnumC33445EqI.A03) {
            if (A01 == enumC33445EqI) {
                if (regFlowExtras.A02() != C05F.A00) {
                    return C05F.A0C;
                }
            } else {
                return C05F.A0u;
            }
        }
        return C05F.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A04(Fragment fragment, InterfaceC11380iw interfaceC11380iw, EnumC33445EqI enumC33445EqI, Integer num, Integer num2, String str) {
        FragmentActivity requireActivity = fragment.requireActivity();
        Bundle A09 = AbstractC31176DnK.A09(str);
        A09.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession A0G = AbstractC31171DnF.A0G(A09);
        if (requireActivity instanceof InterfaceC37106GWr) {
            ((SignedOutFragmentActivity) ((InterfaceC37106GWr) requireActivity)).A0A = true;
        }
        C3JG.A02(C05F.A1F);
        C34907FZt.A00 = null;
        C35146Fen.A02(requireActivity);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0G), "ig_nux_started");
        AbstractC31172DnG.A1O(A0f);
        AbstractC31179DnN.A16(A0f, A01, A00);
        AbstractC31171DnF.A19(A0f, enumC33445EqI.A00);
        A0f.A7v("from_server", true);
        AbstractC31177DnL.A1G(A0f, "guid", AbstractC35274Fh9.A00(), A00);
        AbstractC35274Fh9.A0C(A0f, A0G, "waterfall_id", C1Q9.A01());
        A0f.Cht();
        A06(A0G);
        C1GJ.A03(F9W.A00(requireActivity, A0G, AbstractC23851Es.A03()));
        C3BH.A00().A03(requireActivity, A0G, new GB9(requireActivity, interfaceC11380iw, A0G, enumC33445EqI), enumC33445EqI, num, num2, false, false);
        C006802i.A0p.markerEnd(4197923, (short) 2);
    }
}
