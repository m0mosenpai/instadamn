package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.EZe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32655EZe extends AbstractRunnableC14200nk {
    public final /* synthetic */ EfU A00;
    public final /* synthetic */ C32547EUx A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32655EZe(EfU efU, C32547EUx c32547EUx) {
        super(706);
        this.A01 = c32547EUx;
        this.A00 = efU;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImmutableList copyOf;
        C1Q9 c1q9;
        int intValue;
        final EfU efU = this.A00;
        final User user = efU.A00;
        user.A03.Edl(efU.A08);
        AbstractC31177DnL.A1O(user);
        Integer num = C05F.A0j;
        C32547EUx c32547EUx = this.A01;
        Integer num2 = c32547EUx.A09;
        if (!num.equals(num2)) {
            if (!(c32547EUx instanceof C32976Efh) && (intValue = num2.intValue()) != 1) {
                if (intValue != 2) {
                    c1q9 = C1Q9.A0u;
                } else {
                    c1q9 = C1Q9.A0x;
                }
            } else {
                c1q9 = C1Q9.A0w;
            }
            c32547EUx.A02(user, c1q9);
        }
        if (efU.A07 != null) {
            C17280tP A00 = C17280tP.A00();
            InterfaceC16530ry interfaceC16530ry = A00.A2T;
            C0YR[] c0yrArr = C17280tP.A4G;
            if (AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 186)) {
                C17280tP A002 = C17280tP.A00();
                AbstractC167007dF.A1L(A002, A002.A2U, c0yrArr, 187, true);
            }
        }
        C07270a1 c07270a1 = c32547EUx.A05;
        Activity activity = c32547EUx.A01;
        activity.getClass();
        final UserSession A02 = AbstractC31525Dt9.A02(activity, c32547EUx.A04, c07270a1, user, efU.A07, false);
        AnonymousClass253 A003 = AnonymousClass252.A00(A02);
        CallerContext.A01("LoginCallbacks");
        A003.A00(null);
        AbstractC49092Nc.A00(A02).A02(CallerContext.A01("LoginCallbacks"), null, "ig_login_util");
        Long l = efU.A02;
        C1565571d A004 = AbstractC1565471c.A00(A02);
        if (l != null) {
            String l2 = Long.toString(l.longValue());
            InterfaceC19610xo ARD = A004.A00.ARD();
            ARD.E7K("account_delegate_ig_id", l2);
            ARD.apply();
            C17110t6 c17110t6 = (C17110t6) C0BQ.A00(A02);
            C14360o3.A0B(l2, 1);
            c17110t6.A02.A08(user, l2);
        } else {
            InterfaceC19610xo ARD2 = A004.A00.ARD();
            ARD2.E7K("account_delegate_ig_id", null);
            ARD2.apply();
            ((C17110t6) C0BQ.A00(A02)).A02.A05(user);
        }
        List list = efU.A0B;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        if (!AbstractC83893oY.A00(copyOf)) {
            C84613qA.A00(A02).A05(copyOf);
        }
        EnumC33404Epb enumC33404Epb = c32547EUx.A0D;
        if (enumC33404Epb == EnumC33404Epb.A07 || enumC33404Epb == EnumC33404Epb.A06) {
            Context applicationContext = activity.getApplicationContext();
            String str = efU.A06;
            if (str == null || !str.contains("one_click_login")) {
                if (C83743oJ.A01(A02).A0K(efU.A00.getId())) {
                    C83743oJ.A01(A02).A0G(efU.A00.getId());
                }
                boolean A0J = C83743oJ.A01(A02).A0J(A02.userId);
                C83743oJ.A01(A02).A08(applicationContext, AbstractC31171DnF.A0D("aymh"), A02, Boolean.valueOf(A0J), false, C05F.A0C, efU.A00.getId(), true);
            }
        }
        activity.runOnUiThread(new Runnable() { // from class: X.GQP
            @Override // java.lang.Runnable
            public final void run() {
                C32547EUx c32547EUx2;
                String str2;
                Fragment ej8;
                String str3;
                AbstractC33626Etc abstractC33626Etc;
                String str4;
                String str5;
                C32655EZe c32655EZe = this;
                EfU efU2 = efU;
                User user2 = user;
                UserSession userSession = A02;
                String str6 = efU2.A06;
                Integer num3 = efU2.A01;
                if (str6 != null) {
                    if (str6.equals("autoconf_register_flow") && num3 != null && (str3 = (c32547EUx2 = c32655EZe.A01).A0B) != null && (abstractC33626Etc = c32547EUx2.A07) != null && (str4 = c32547EUx2.A0C) != null) {
                        C47989LJs c47989LJs = C47989LJs.A00;
                        EnumC31713DwI enumC31713DwI = c32547EUx2.A08;
                        String str7 = "";
                        if (enumC31713DwI == null) {
                            str5 = "";
                        } else {
                            str5 = enumC31713DwI.A01;
                        }
                        c47989LJs.A04(userSession, str5, "client_reg_valid_login_response", "valid login response for reg flow", "registration_flow", "ar_code_sms");
                        int intValue2 = num3.intValue();
                        if (intValue2 != 2 && intValue2 != 3 && intValue2 != 4) {
                            if (num3.equals(AbstractC25227BEk.A0p())) {
                                if (enumC31713DwI != null) {
                                    str7 = enumC31713DwI.A01;
                                }
                                c47989LJs.A04(userSession, str7, "client_reg_not_show_user_consent", "reg with consent screen skipped, user already consented", "registration_flow", "ar_code_sms");
                                if (abstractC33626Etc instanceof C32988Efu) {
                                    C32988Efu c32988Efu = (C32988Efu) abstractC33626Etc;
                                    SPT spt = LIA.A07;
                                    EKE eke = c32988Efu.A00;
                                    LIA lia = new LIA(eke.requireContext());
                                    String str8 = eke.C0Q().A01;
                                    FragmentActivity requireActivity = eke.requireActivity();
                                    String str9 = eke.A0C;
                                    str9.getClass();
                                    String str10 = c32988Efu.A01;
                                    C32522ETy c32522ETy = new C32522ETy(eke.requireActivity(), eke, userSession, null, eke.C0Q());
                                    C34385FEb c34385FEb = new C34385FEb();
                                    c34385FEb.A00.putByteArray("requestMessage", LIA.A07.A03(str9));
                                    c34385FEb.A00.putBoolean("useDebugKey", false);
                                    C1GJ.A03(new KK7(requireActivity, c34385FEb, eke, userSession, c32522ETy, lia, str8, "ar_code_sms", str10));
                                    return;
                                }
                                return;
                            }
                            if (enumC31713DwI != null) {
                                str7 = enumC31713DwI.A01;
                            }
                            c47989LJs.A04(userSession, str7, "client_reg_not_show_user_consent", "consent screen not shown and abort reg", "registration_flow", "ar_code_sms");
                            c32547EUx2.A03(userSession, user2);
                        }
                        AbstractC31172DnG.A1A();
                        Bundle A05 = AbstractC31178DnM.A05(userSession);
                        A05.putString("REGISTER_START_MESSAGE", str3);
                        A05.putString("NONCE", str4);
                        A05.putString("SMS_FLOW_TYPE", "ar_code_sms");
                        A05.putInt("CONSENT_MODE", intValue2);
                        ej8 = new EJC();
                        ej8.setArguments(A05);
                    } else if (str6.equals("autoconf_authenticate_flow")) {
                        c32547EUx2 = c32655EZe.A01;
                        C47989LJs c47989LJs2 = C47989LJs.A00;
                        EnumC31713DwI enumC31713DwI2 = c32547EUx2.A08;
                        if (enumC31713DwI2 == null) {
                            str2 = "";
                        } else {
                            str2 = enumC31713DwI2.A01;
                        }
                        c47989LJs2.A04(userSession, str2, "client_auth_finished_success", null, "optimistic_authentication_flow", "ar_code_sms");
                        AbstractC31172DnG.A1A();
                        Bundle A052 = AbstractC31178DnM.A05(userSession);
                        ej8 = new EJ8();
                        ej8.setArguments(A052);
                    }
                    Activity activity2 = c32547EUx2.A01;
                    activity2.getClass();
                    AbstractC31181DnP.A0b(ej8, (FragmentActivity) activity2, userSession);
                    return;
                }
                Integer num4 = C05F.A0j;
                c32547EUx2 = c32655EZe.A01;
                if (num4.equals(c32547EUx2.A09)) {
                    C83743oJ A01 = C83743oJ.A01(userSession);
                    String str11 = userSession.userId;
                    C17280tP A005 = C17280tP.A00();
                    InterfaceC16530ry interfaceC16530ry2 = A005.A05;
                    C0YR[] c0yrArr2 = C17280tP.A4G;
                    boolean contains = ((java.util.Set) AbstractC31171DnF.A0Y(A005, interfaceC16530ry2, c0yrArr2, 235)).contains(str11);
                    C17280tP A006 = C17280tP.A00();
                    boolean A1b = AbstractC167017dG.A1b(A006, A006.A0D, c0yrArr2, 234);
                    if ((!contains || !A1b) && !A01.A0K(str11) && A01.A0I() && (!C17280tP.A00().A0A().contains(str11))) {
                        LinkedHashSet A0l = AbstractC31171DnF.A0l();
                        A0l.addAll(C17280tP.A00().A0A());
                        A0l.add(userSession.userId);
                        C17280tP A007 = C17280tP.A00();
                        AbstractC31171DnF.A1S(A007, A0l, A007.A06, c0yrArr2, 230);
                        C83753oK.A01(userSession, "login_password_saving_eligible", "login_spi", "spi", "home_page");
                        C65981Txa A03 = C35205Ffx.A00().A03();
                        IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(userSession).A00;
                        igBloksScreenConfig.A0R = "com.bloks.www.caa.login.save-credentials";
                        igBloksScreenConfig.A03 = new EOZ(1, c32547EUx2, userSession, user2);
                        igBloksScreenConfig.A0C = A03;
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("family_device_id", AbstractC31172DnG.A0P(userSession).A02(C19T.A1w));
                        A1G.put("offline_experiment_group", "caa_iteration_v3_perf_ig_4");
                        C16030qx c16030qx = C16030qx.A02;
                        Activity activity3 = c32547EUx2.A01;
                        activity3.getClass();
                        A1G.put("qe_device_id", c16030qx.A05(activity3));
                        try {
                            C83753oK.A01(userSession, "login_password_saving_open_spi_attempt", "login_spi", "spi", "home_page");
                            AbstractC31180DnO.A11(activity3, igBloksScreenConfig, "com.bloks.www.caa.login.save-credentials", A1G, Collections.emptyMap());
                            return;
                        } catch (Exception e) {
                            C83753oK.A00(userSession, C05F.A01, "login_password_saving_opening_failed", "login_spi", "spi", "home_page", e.getMessage(), null);
                            c32547EUx2.A03(userSession, user2);
                            return;
                        }
                    }
                }
                c32547EUx2.A03(userSession, user2);
            }
        });
        if (!TextUtils.isEmpty(efU.A09)) {
            AbstractC35179FfW.A02().A02(user.getId(), efU.A09);
        }
    }
}
