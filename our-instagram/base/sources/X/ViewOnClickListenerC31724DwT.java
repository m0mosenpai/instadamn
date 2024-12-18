package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.profile.edit.fragment.CompleteYourProfileFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.DwT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC31724DwT implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC31724DwT(C31721DwQ c31721DwQ, int i) {
        this.A00 = i;
        switch (i) {
            case 59:
            case 60:
            case 61:
            case 62:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 64:
            case 65:
                this.A01 = c31721DwQ;
                return;
            default:
                this.A01 = c31721DwQ;
                return;
        }
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC31724DwT(obj, i), view);
    }

    public static void A01(View view, C31721DwQ c31721DwQ, int i) {
        C0fQ.A00(new ViewOnClickListenerC31724DwT(c31721DwQ, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1P1, X.EjA, X.EUj] */
    /* JADX WARN: Type inference failed for: r1v323, types: [X.3Mu, X.EHO] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC37264GbH interfaceC37264GbH;
        C140966Yy A0P;
        Fragment c52173N7d;
        C3CZ c3cz;
        com.instagram.creation.base.ui.mediatabbar.Tab tab;
        int A05;
        int i;
        InterfaceC37264GbH interfaceC37264GbH2;
        InterfaceC37264GbH interfaceC37264GbH3;
        String str;
        C140966Yy A0r;
        Fragment A01;
        String str2;
        String str3;
        String str4;
        C140966Yy A0N;
        Fragment c32288EKb;
        InterfaceC37264GbH interfaceC37264GbH4;
        String str5;
        AbstractC12990ll A0o;
        Integer num;
        Integer num2;
        FragmentActivity activity;
        String str6;
        String str7;
        String str8;
        int i2;
        boolean z;
        User user;
        String str9;
        String str10;
        boolean z2;
        C33613EtP c33613EtP;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(2023686853);
                ENJ enj = (ENJ) this.A01;
                FragmentActivity activity2 = enj.getActivity();
                if (activity2 != null) {
                    if (activity2 instanceof InterfaceC37264GbH) {
                        interfaceC37264GbH2 = (InterfaceC37264GbH) activity2;
                    } else {
                        interfaceC37264GbH2 = null;
                    }
                    AbstractC31175DnJ.A1P(interfaceC37264GbH2);
                    C35230FgN.A03(C1Q9.A1T.A02(enj.A05), EnumC31713DwI.A1O);
                }
                i = 1503945522;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(497251443);
                ENJ enj2 = (ENJ) this.A01;
                FragmentActivity activity3 = enj2.getActivity();
                if (activity3 != null) {
                    if (activity3 instanceof InterfaceC37264GbH) {
                        interfaceC37264GbH3 = (InterfaceC37264GbH) activity3;
                    } else {
                        interfaceC37264GbH3 = null;
                    }
                    AbstractC31175DnJ.A1Q(interfaceC37264GbH3);
                    C35037FcA A012 = C35230FgN.A01(enj2, C1Q9.A1R);
                    A012.A03("follow_users_count", enj2.A0H.size());
                    A012.A02();
                }
                i = 785116453;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-1064937804);
                C32269EJe c32269EJe = (C32269EJe) this.A01;
                C35111FeD.A00(AbstractC166987dD.A0o(c32269EJe.A0E), null, "nux_interest_picker");
                AbstractC31175DnJ.A1P(c32269EJe.A03);
                i = -1939332579;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-1666979664);
                C32269EJe c32269EJe2 = (C32269EJe) this.A01;
                C35031Fc4.A00.A00(AbstractC166987dD.A0o(c32269EJe2.A0E), null, "nux_interest_picker");
                c32269EJe2.A06 = true;
                Iterator A14 = AbstractC166997dE.A14(c32269EJe2.A0B);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    long A0N2 = AbstractC166987dD.A0N(A1K.getKey());
                    boolean A1a = AbstractC166987dD.A1a(A1K.getValue());
                    C32269EJe.A00(c32269EJe2, A0N2, A1a);
                    if (A1a) {
                        str = "select";
                    } else {
                        str = "unselect";
                    }
                    String A0h = AbstractC31171DnF.A0h(Long.valueOf(A0N2), c32269EJe2.A0C);
                    if (A0h != null) {
                        c32269EJe2.A01(str, A0h, String.valueOf(A0N2));
                    }
                }
                InterfaceC37264GbH interfaceC37264GbH5 = c32269EJe2.A03;
                if (interfaceC37264GbH5 != null) {
                    interfaceC37264GbH5.CnE(AbstractC167007dF.A1O(c32269EJe2.A00) ? 1 : 0);
                }
                i = -88421970;
                C0f9.A0C(i, A05);
                return;
            case 4:
                C32316ELf c32316ELf = (C32316ELf) this.A01;
                C25621Ms A0D = AbstractC31179DnN.A0D(c32316ELf.A06);
                A0D.A0B("trusted_friend/get_recovery_request_challenge/");
                C1ON A0e = AbstractC25227BEk.A0e(A0D, EDC.class, C34870FYf.class);
                AbstractC10360h2 parentFragmentManager = c32316ELf.getParentFragmentManager();
                C07270a1 c07270a1 = c32316ELf.A06;
                C14360o3.A0B(c07270a1, 3);
                ?? abstractC32533EUj = new AbstractC32533EUj(parentFragmentManager);
                abstractC32533EUj.A00 = c32316ELf;
                abstractC32533EUj.A01 = c07270a1;
                A0e.A00 = abstractC32533EUj;
                c32316ELf.schedule(A0e);
                return;
            case 5:
                A05 = C0f9.A05(813608145);
                C32316ELf c32316ELf2 = (C32316ELf) this.A01;
                FDD.A00(c32316ELf2.A06, "login");
                FragmentActivity activity4 = c32316ELf2.getActivity();
                if (activity4 != null) {
                    Window window = activity4.getWindow();
                    window.getClass();
                    window.clearFlags(8192);
                }
                if (FEC.A00.A00(c32316ELf2.getRootActivity())) {
                    i = -519244291;
                } else {
                    if (activity4 instanceof InterfaceC37222GaX) {
                        A0r = AbstractC25225BEi.A0r(c32316ELf2.requireActivity(), c32316ELf2.A06);
                        AbstractC31175DnJ.A0R();
                        Bundle requireArguments = c32316ELf2.requireArguments();
                        AbstractC31171DnF.A12(requireArguments, "IgSessionManager.LOGGED_OUT_TOKEN");
                        A01 = new EKF();
                        A01.setArguments(requireArguments);
                    } else {
                        if (AbstractC35090Fd1.A02(c32316ELf2.A06)) {
                            Integer num3 = C35154Few.A00().A05;
                            Integer num4 = C05F.A0C;
                            if (num3 != num4 && C35160Ff2.A00().A01() != num4) {
                                A0r = AbstractC25225BEi.A0r(c32316ELf2.requireActivity(), c32316ELf2.A06);
                                A01 = FXP.A01(c32316ELf2.mArguments);
                            } else {
                                AbstractC31172DnG.A1A();
                                Bundle bundle = c32316ELf2.mArguments;
                                AbstractC31173DnH.A1B(bundle);
                                AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                                abstractC59962oe.setArguments(bundle);
                                AbstractC10360h2 abstractC10360h2 = c32316ELf2.mFragmentManager;
                                abstractC10360h2.getClass();
                                AbstractC31179DnN.A0z(abstractC59962oe, abstractC10360h2);
                            }
                        } else if (AbstractC23851Es.A03() && c32316ELf2.A0L) {
                            AbstractC10360h2 abstractC10360h22 = c32316ELf2.mFragmentManager;
                            AbstractC31172DnG.A1A();
                            Bundle bundle2 = c32316ELf2.mArguments;
                            C32288EKb c32288EKb2 = new C32288EKb();
                            c32288EKb2.setArguments(bundle2);
                            AbstractC35259Fgt.A07(c32288EKb2, abstractC10360h22, "android.nux.FacebookLandingFragment");
                        } else {
                            c32316ELf2.A09.A01();
                        }
                        i = 308907052;
                    }
                    A0r.A0E(A01);
                    A0r.A04();
                    i = 308907052;
                }
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(1023879710);
                C36007Fv5 A00 = C36007Fv5.A00();
                C32316ELf c32316ELf3 = (C32316ELf) this.A01;
                boolean A1X = AbstractC31171DnF.A1X(A00.A02(c32316ELf3.A06, "ig_android_growth_fx_access_fb_ig_sso", C32316ELf.__redex_internal_original_name));
                C35037FcA A06 = C1Q9.A0a.A02(c32316ELf3.A06).A06(EnumC33445EqI.A04, EnumC31713DwI.A0t);
                A06.A05("has_facebook_session", A1X);
                C35037FcA.A01(A06, c32316ELf3.A0I);
                C34994FbR.A00.A00(c32316ELf3.A06, "login");
                if (AbstractC31176DnK.A0k(c32316ELf3.A07.A02) != null && ((List) AbstractC31176DnK.A0k(c32316ELf3.A07.A02)).size() > 1) {
                    AbstractC31176DnK.A1A(c32316ELf3.requireArguments(), new EK1(), AbstractC31177DnL.A0N(c32316ELf3.requireActivity(), c32316ELf3.A06));
                } else {
                    if (A1X) {
                        if (c32316ELf3.A07.A02() == null) {
                            if (FEC.A00.A00(c32316ELf3.requireActivity())) {
                                i = -1227189222;
                            }
                        }
                        c32316ELf3.A0A.A0A(AbstractC31174DnI.A0J(c32316ELf3.A05), AbstractC31174DnI.A0J("login_continue_button"), c32316ELf3.A06, C36007Fv5.A00().A01(c32316ELf3.A06, "ig_android_growth_fx_access_fb_ig_sso", C32316ELf.__redex_internal_original_name), C36007Fv5.A00().A02(c32316ELf3.A06, "ig_android_growth_fx_access_fb_ig_sso", C32316ELf.__redex_internal_original_name), c32316ELf3.A07.A02(), null);
                    } else if (C36159FxZ.A03.A00(c32316ELf3.A06, C32316ELf.__redex_internal_original_name)) {
                        if (c32316ELf3.A07.A02() == null) {
                            if (FEC.A00.A00(c32316ELf3.requireActivity())) {
                                i = 1197163778;
                            }
                        }
                        if (AbstractC31181DnP.A11(c32316ELf3.A06, C32316ELf.__redex_internal_original_name)) {
                            str2 = null;
                        } else {
                            str2 = C36159FxZ.A02;
                        }
                        if (!AbstractC31181DnP.A11(c32316ELf3.A06, C32316ELf.__redex_internal_original_name) && (str3 = C36159FxZ.A00) != null && str2 != null) {
                            c32316ELf3.A0A.A0A(AbstractC31174DnI.A0J(c32316ELf3.A05), AbstractC31174DnI.A0J("login_continue_button"), c32316ELf3.A06, str3, str2, c32316ELf3.A07.A02(), null);
                        }
                    } else {
                        c32316ELf3.A0A.A07();
                    }
                    C0f9.A0C(i, A05);
                    return;
                }
                i = -924486319;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(722777323);
                C32316ELf.A02((C32316ELf) this.A01, false);
                i = 691752458;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(-1692082067);
                C32316ELf c32316ELf4 = (C32316ELf) this.A01;
                String str11 = C32316ELf.A0X;
                c32316ELf4.A0A.A08();
                C006802i.A0p.markerStart(725105460);
                C006802i.A0p.markerAnnotate(725105460, "flow", "prod");
                c32316ELf4.A0B.A00(null, AbstractC13880nE.A0J(c32316ELf4.A05));
                i = 498520171;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(516300343);
                Fragment fragment = (Fragment) this.A01;
                C12260kU.A05(AbstractC08820cl.A03(AbstractC63260SgI.A01(fragment.requireActivity(), "https://help.instagram.com/")), fragment);
                i = -1627503609;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(-1924635783);
                C32280EJr c32280EJr = (C32280EJr) this.A01;
                C32406EPh c32406EPh = c32280EJr.A02;
                c32406EPh.getClass();
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : c32406EPh.A07) {
                    if (c32406EPh.A03.contains(obj)) {
                        A1E.add(obj);
                    }
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1V(A1E2, it);
                }
                if (A1E.isEmpty()) {
                    c32280EJr.A03((User) AbstractC166987dD.A16(ImmutableList.copyOf((Collection) c32280EJr.A02.A06)));
                } else {
                    int size = A1E.size();
                    C18920wW A013 = AbstractC12220kQ.A01(c32280EJr, c32280EJr.A00);
                    if (size > 1) {
                        str4 = "click_multiple_account_log_in";
                    } else {
                        str4 = "click_single_account_log_in";
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A013, str4);
                    A0f.AAP("waterfall_id", C1QE.A01("log_in").A05());
                    EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0v;
                    AbstractC31171DnF.A1A(A0f, "multiple_users_recover");
                    A0f.AAP("app_device_id", AbstractC35274Fh9.A00());
                    A0f.AAP("fb_family_device_id", AbstractC35274Fh9.A02(c32280EJr.A00));
                    A0f.Cht();
                    Context requireContext = c32280EJr.requireContext();
                    C07270a1 c07270a12 = c32280EJr.A00;
                    String str12 = c32280EJr.A03;
                    String str13 = c32280EJr.A04;
                    C25621Ms A0M = AbstractC31173DnH.A0M(c07270a12);
                    A0M.A0B("accounts/account_recovery_nonce_login/");
                    AbstractC31173DnH.A1O(A0M, C16030qx.A00(requireContext));
                    A0M.A9s("login_nonce", str12);
                    A0M.A9s("user_ids", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1E2));
                    A0M.A9s("recovery_handle_type", str13);
                    AbstractC31175DnJ.A1J(A0M);
                    C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
                    A0U.A00 = new EfY(c32280EJr, c32280EJr, c32280EJr.A00, c32280EJr.A01, c32280EJr, enumC31713DwI, A1E2);
                    c32280EJr.schedule(A0U);
                }
                i = 2054631852;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(-291068306);
                EKC ekc = (EKC) this.A01;
                AbstractC31176DnK.A11(ekc.getContext(), ekc.A01, AbstractC31171DnF.A0R(AbstractC63260SgI.A01(ekc.getContext(), "https://help.instagram.com/227486307449481")), ekc.getString(2131965052));
                i = 2043580060;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(-1624570811);
                EKC ekc2 = (EKC) this.A01;
                ekc2.A0G = false;
                ekc2.A09.A03(false);
                i = 484924242;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-713959399);
                OneTapLoginLandingFragment oneTapLoginLandingFragment = (OneTapLoginLandingFragment) this.A01;
                C07270a1 c07270a13 = oneTapLoginLandingFragment.A00;
                C14360o3.A0B(c07270a13, 0);
                FDC.A00(c07270a13, null, "sso");
                AbstractC31172DnG.A1A();
                Bundle bundle3 = oneTapLoginLandingFragment.mArguments;
                C32316ELf c32316ELf5 = new C32316ELf();
                AbstractC31177DnL.A15(c32316ELf5, AbstractC31173DnH.A0J(bundle3, c32316ELf5, oneTapLoginLandingFragment), oneTapLoginLandingFragment.A00);
                i = -1333726525;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(-1425683906);
                OneTapLoginLandingFragment oneTapLoginLandingFragment2 = (OneTapLoginLandingFragment) this.A01;
                FDD.A00(oneTapLoginLandingFragment2.A00, "sso");
                Bundle bundle4 = oneTapLoginLandingFragment2.mArguments;
                if (AbstractC34269F9p.A00(bundle4) != null) {
                    C140966Yy A0N3 = AbstractC31177DnL.A0N(oneTapLoginLandingFragment2.requireActivity(), oneTapLoginLandingFragment2.A00);
                    AbstractC31173DnH.A1B(bundle4);
                    AbstractC31176DnK.A1A(bundle4, new EKM(), A0N3);
                } else {
                    if (AbstractC35090Fd1.A02(oneTapLoginLandingFragment2.A00)) {
                        Integer num5 = C35154Few.A00().A05;
                        Integer num6 = C05F.A0C;
                        if (num5 != num6 && C35160Ff2.A00().A01() != num6) {
                            A0N = AbstractC25225BEi.A0r(oneTapLoginLandingFragment2.requireActivity(), oneTapLoginLandingFragment2.A00);
                            c32288EKb = FXP.A01(bundle4);
                        } else {
                            AbstractC31172DnG.A1A();
                            AbstractC31173DnH.A1B(bundle4);
                            AbstractC59962oe abstractC59962oe2 = new AbstractC59962oe();
                            abstractC59962oe2.setArguments(bundle4);
                            AbstractC31179DnN.A0z(abstractC59962oe2, oneTapLoginLandingFragment2.mFragmentManager);
                        }
                    } else {
                        A0N = AbstractC31177DnL.A0N(oneTapLoginLandingFragment2.requireActivity(), oneTapLoginLandingFragment2.A00);
                        c32288EKb = new C32288EKb();
                        c32288EKb.setArguments(bundle4);
                    }
                    A0N.A0E(c32288EKb);
                    A0N.A04();
                }
                i = 1257688663;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                ENu eNu = (ENu) this.A01;
                UserSession session = eNu.getSession();
                boolean A1a2 = AbstractC167017dG.A1a(session, "nux_one_tap_upsell");
                C35111FeD.A00(session, null, "nux_one_tap_upsell");
                FragmentActivity activity5 = eNu.getActivity();
                if ((activity5 instanceof InterfaceC37264GbH) && (interfaceC37264GbH = (InterfaceC37264GbH) activity5) != null) {
                    interfaceC37264GbH.CnE(0);
                    return;
                }
                InterfaceC37222GaX interfaceC37222GaX = eNu.A02;
                if (interfaceC37222GaX != null) {
                    ((BusinessConversionActivity) interfaceC37222GaX).A0p(null, A1a2);
                    return;
                } else {
                    eNu.A03.A00();
                    return;
                }
            case 16:
                A05 = C0f9.A05(-454321902);
                C35031Fc4 c35031Fc4 = C35031Fc4.A00;
                ENu eNu2 = (ENu) this.A01;
                c35031Fc4.A02(eNu2.getSession(), "nux_one_tap_upsell");
                C83743oJ.A01(eNu2.getSession()).A09(eNu2.getContext(), eNu2, eNu2.getSession(), C05F.A0Y, eNu2.getSession().userId, true);
                FragmentActivity activity6 = eNu2.getActivity();
                if ((activity6 instanceof InterfaceC37264GbH) && (interfaceC37264GbH4 = (InterfaceC37264GbH) activity6) != null) {
                    interfaceC37264GbH4.CnE(1);
                } else {
                    InterfaceC37222GaX interfaceC37222GaX2 = eNu2.A02;
                    if (interfaceC37222GaX2 != null) {
                        AbstractC31174DnI.A1S(interfaceC37222GaX2);
                    } else {
                        eNu2.A03.A00();
                    }
                }
                i = 1948303525;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(-1459379445);
                C32323ELr c32323ELr = (C32323ELr) this.A01;
                C147036jf c147036jf = c32323ELr.A00;
                if (c147036jf == null) {
                    str5 = "contactImportLogger";
                    C14360o3.A0F(str5);
                    throw C00O.createAndThrow();
                }
                c147036jf.A03(null, c32323ELr.A02, true);
                C35111FeD.A00(AbstractC166987dD.A0o(c32323ELr.A04), null, "partial_ci_nux_prompt");
                AbstractC31175DnJ.A1P(c32323ELr.A01);
                i = 197768892;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(-1208629556);
                C32323ELr c32323ELr2 = (C32323ELr) this.A01;
                C35233FgQ c35233FgQ = new C35233FgQ(c32323ELr2, c32323ELr2, AbstractC166987dD.A0r(c32323ELr2.A04), c32323ELr2.A01, null);
                String obj2 = EnumC33444EqG.A0F.toString();
                String str14 = c32323ELr2.A03;
                if (str14 == null) {
                    str5 = "registrationFlow";
                    C14360o3.A0F(str5);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0B(obj2, 0);
                c35233FgQ.A04(null, null, null, obj2, str14, false, false);
                i = -1542927225;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(-1763266550);
                AbstractC31175DnJ.A1P(((EMR) this.A01).A01);
                i = -1555445781;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(28713467);
                C32252EIl c32252EIl = (C32252EIl) this.A01;
                User user2 = c32252EIl.A02;
                if (user2 != null) {
                    if (user2.A1k()) {
                        AbstractC31175DnJ.A1P(c32252EIl.A01);
                    } else {
                        C3CZ c3cz2 = c32252EIl.A00;
                        if (c3cz2 != null) {
                            C3CZ.A00(c32252EIl.requireContext(), c3cz2, true);
                        }
                    }
                    i = -781662761;
                    C0f9.A0C(i, A05);
                    return;
                }
                str5 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                C14360o3.A0F(str5);
                throw C00O.createAndThrow();
            case 21:
                A05 = C0f9.A05(1705984321);
                C32252EIl c32252EIl2 = (C32252EIl) this.A01;
                User user3 = c32252EIl2.A02;
                if (user3 != null) {
                    if (user3.A1k()) {
                        C3CZ c3cz3 = c32252EIl2.A00;
                        if (c3cz3 != null) {
                            c3cz3.A07(c32252EIl2.requireContext(), AbstractC43884Jap.A00);
                        }
                    } else {
                        AbstractC31175DnJ.A1Q(c32252EIl2.A01);
                    }
                    i = 1751366816;
                    C0f9.A0C(i, A05);
                    return;
                }
                str5 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                C14360o3.A0F(str5);
                throw C00O.createAndThrow();
            case 22:
                A05 = C0f9.A05(-6967268);
                C32255EIp c32255EIp = (C32255EIp) this.A01;
                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(c32255EIp.A08);
                Integer num7 = c32255EIp.A02;
                AbstractC167017dG.A1O(A0o2, num7);
                FD0.A00(A0o2, C05F.A01, num7);
                User user4 = c32255EIp.A01;
                if (user4 != null) {
                    AbstractC34265F9l.A00(c32255EIp, user4.getUsername(), false);
                    i = -1007605346;
                    C0f9.A0C(i, A05);
                    return;
                }
                str5 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                C14360o3.A0F(str5);
                throw C00O.createAndThrow();
            case 23:
                A05 = C0f9.A05(868036218);
                C32255EIp c32255EIp2 = (C32255EIp) this.A01;
                if (c32255EIp2.A04) {
                    C35031Fc4 c35031Fc42 = C35031Fc4.A00;
                    InterfaceC09390do interfaceC09390do = c32255EIp2.A08;
                    c35031Fc42.A00(AbstractC166987dD.A0o(interfaceC09390do), null, "lightweight_connections");
                    A0o = AbstractC166987dD.A0o(interfaceC09390do);
                    num = c32255EIp2.A02;
                    AbstractC167017dG.A1O(A0o, num);
                    num2 = C05F.A0C;
                } else {
                    InterfaceC09390do interfaceC09390do2 = c32255EIp2.A08;
                    C35111FeD.A00(AbstractC166987dD.A0o(interfaceC09390do2), null, "lightweight_connections");
                    A0o = AbstractC166987dD.A0o(interfaceC09390do2);
                    num = c32255EIp2.A02;
                    AbstractC167017dG.A1O(A0o, num);
                    num2 = C05F.A0N;
                }
                FD0.A00(A0o, num2, num);
                InterfaceC37264GbH A002 = AbstractC34275F9v.A00(c32255EIp2);
                if (A002 != null) {
                    A002.CnE(c32255EIp2.A04 ? 1 : 0);
                }
                i = 1370777823;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(564788708);
                C32255EIp c32255EIp3 = (C32255EIp) this.A01;
                AbstractC12990ll A0o3 = AbstractC166987dD.A0o(c32255EIp3.A08);
                Integer num8 = c32255EIp3.A02;
                AbstractC167017dG.A1O(A0o3, num8);
                FD0.A00(A0o3, C05F.A0Y, num8);
                C3CZ c3cz4 = c32255EIp3.A00;
                if (c3cz4 != null) {
                    C3CZ.A00(c32255EIp3.requireContext(), c3cz4, false);
                }
                i = 175072665;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(483418971);
                C32255EIp c32255EIp4 = (C32255EIp) this.A01;
                AbstractC12990ll A0o4 = AbstractC166987dD.A0o(c32255EIp4.A08);
                Integer num9 = c32255EIp4.A02;
                AbstractC167017dG.A1O(A0o4, num9);
                FD0.A00(A0o4, C05F.A0N, num9);
                AbstractC10360h2 A0I = AbstractC31174DnI.A0I(c32255EIp4);
                C14360o3.A07(A0I);
                if (A0I.A0L() > 0) {
                    A0I.A0b();
                } else {
                    AbstractC25226BEj.A1Q(c32255EIp4);
                }
                i = 55793047;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A05 = C0f9.A05(-299509276);
                EKM ekm = (EKM) this.A01;
                AbstractC34350FCs.A00(ekm.A01, "sign_up_with_biz_option");
                AbstractC18680vv abstractC18680vv = ekm.A01;
                String str15 = ekm.A04;
                C19280xC A003 = F0H.A00(C05F.A0N);
                A003.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "sign_up_with_biz_option");
                A003.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str15);
                A003.A0C("fb_user_id", null);
                A003.A0C("component", "sign_up_as_personal");
                if (abstractC18680vv != null) {
                    AbstractC31173DnH.A1S(A003, abstractC18680vv);
                    ekm.A03.A01();
                    i = -358593988;
                    C0f9.A0C(i, A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 27:
                A05 = C0f9.A05(1283595895);
                C1Q9 c1q9 = C1Q9.A0S;
                EKM ekm2 = (EKM) this.A01;
                C35230FgN.A02(c1q9.A02(ekm2.A01), null, EnumC31713DwI.A1V);
                AbstractC18680vv abstractC18680vv2 = ekm2.A01;
                String str16 = ekm2.A04;
                C19280xC A004 = F0H.A00(C05F.A0N);
                A004.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "sign_up_with_biz_option");
                A004.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str16);
                A004.A0C("fb_user_id", null);
                A004.A0C("component", "sign_up_as_business");
                if (abstractC18680vv2 != null) {
                    AbstractC31173DnH.A1S(A004, abstractC18680vv2);
                    AbstractC155756z4.A00();
                    Context context = ekm2.getContext();
                    C14360o3.A0B(context, 0);
                    Intent A08 = AbstractC31173DnH.A08(context);
                    Bundle A0b = AbstractC166987dD.A0b();
                    AbstractC31175DnJ.A0r(A0b, ekm2.A01);
                    A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ekm2.A04);
                    A0b.putInt("business_account_flow", 7);
                    A0b.putBoolean(AbstractC43591JPw.A00(1331), true);
                    A0b.putString("suma_sign_up_page_name", ekm2.A06);
                    A0b.putString("target_page_id", ekm2.A05);
                    A0b.putString("fb_access_token", ekm2.requireArguments().getString("cached_fb_access_token"));
                    A08.putExtras(A0b);
                    C0b3 c0b3 = C12260kU.A00;
                    if (ekm2.isAdded() && (activity = ekm2.getActivity()) != null) {
                        C12260kU.A0C(activity, A08);
                    }
                    i = -1846001183;
                    C0f9.A0C(i, A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 28:
                A05 = C0f9.A05(-197405671);
                C32321ELp.A01((C32321ELp) this.A01);
                i = 472084377;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(1187771837);
                C32321ELp.A00((C32321ELp) this.A01);
                i = 1863477870;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(1616219404);
                C32321ELp.A01((C32321ELp) this.A01);
                i = 241259358;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A05 = C0f9.A05(-358912450);
                C32321ELp.A00((C32321ELp) this.A01);
                i = -1486315791;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A05 = C0f9.A05(-1902040985);
                C32321ELp.A01((C32321ELp) this.A01);
                i = 1960363554;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A05 = C0f9.A05(-22279368);
                C32321ELp.A01((C32321ELp) this.A01);
                i = -58263862;
                C0f9.A0C(i, A05);
                return;
            case 34:
                A05 = C0f9.A05(-1549967169);
                C32321ELp.A00((C32321ELp) this.A01);
                i = -754942505;
                C0f9.A0C(i, A05);
                return;
            case 35:
                A05 = C0f9.A05(1756753902);
                C32321ELp.A00((C32321ELp) this.A01);
                i = 1184245760;
                C0f9.A0C(i, A05);
                return;
            case 36:
                A05 = C0f9.A05(-249359604);
                EKT ekt = (EKT) this.A01;
                Bundle A0A = AbstractC31173DnH.A0A(ekt.requireActivity());
                if (A0A != null && A0A.containsKey("caa_registration_redirection_to_native")) {
                    AbstractC25227BEk.A1B(ekt);
                } else {
                    EKT.A00(ekt);
                }
                i = 1265866377;
                C0f9.A0C(i, A05);
                return;
            case 37:
                A05 = C0f9.A05(690608824);
                EKD ekd = (EKD) this.A01;
                C140966Yy A0N4 = AbstractC31177DnL.A0N(ekd.requireActivity(), ekd.A00);
                RegFlowExtras regFlowExtras = ekd.A01;
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                AbstractC31173DnH.A1B(A0b2);
                AbstractC31176DnK.A1A(A0b2, new EKG(), A0N4);
                i = -1656160540;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(560350470);
                AutoCompleteTextView autoCompleteTextView = ((C34617FNa) this.A01).A04;
                AbstractC31171DnF.A14(autoCompleteTextView);
                autoCompleteTextView.requestFocus();
                AbstractC13880nE.A0R(autoCompleteTextView);
                i = 997483522;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A05 = C0f9.A05(-564984261);
                EVI evi = (EVI) this.A01;
                C07270a1 c07270a14 = evi.A06;
                String language = C1Q2.A03().getLanguage();
                String str17 = evi.A07.A01;
                AbstractC167027dH.A12(c07270a14, language, str17);
                double A014 = AbstractC31171DnF.A01();
                double A005 = AbstractC31171DnF.A00();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a14), "language_selector_clicked");
                AbstractC31179DnN.A18(A0f2, A014, A005);
                AbstractC31179DnN.A15(A0f2);
                A0f2.AAP("from_lang", language);
                AbstractC31171DnF.A1A(A0f2, str17);
                AbstractC35274Fh9.A04(A0f2);
                AbstractC35274Fh9.A08(A0f2, c07270a14);
                EHN ehn = new EHN();
                evi.A01 = ehn;
                AbstractC59962oe abstractC59962oe3 = evi.A05;
                ehn.setTargetFragment(abstractC59962oe3, 0);
                evi.A01.A0B(abstractC59962oe3.mFragmentManager, null);
                i = -185484597;
                C0f9.A0C(i, A05);
                return;
            case 40:
                A05 = C0f9.A05(-1157525236);
                AutoCompleteTextView autoCompleteTextView2 = ((C34692FQd) this.A01).A05;
                AbstractC31171DnF.A14(autoCompleteTextView2);
                autoCompleteTextView2.requestFocus();
                AbstractC13880nE.A0R(autoCompleteTextView2);
                i = 1105482737;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A05 = C0f9.A05(851471340);
                C34692FQd c34692FQd = (C34692FQd) this.A01;
                AbstractC12990ll abstractC12990ll = c34692FQd.A09;
                C14360o3.A0B(abstractC12990ll, 0);
                InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "country_code_buttontapped");
                if (A0f3.isSampled()) {
                    double A015 = AbstractC31171DnF.A01();
                    double A006 = AbstractC31171DnF.A00();
                    AbstractC31177DnL.A1B(A0f3, A015, A006);
                    AbstractC31171DnF.A19(A0f3, "phone");
                    AbstractC31172DnG.A1O(A0f3);
                    AbstractC31178DnM.A19(A0f3, "phone");
                    AbstractC31177DnL.A1G(A0f3, "contact_point_type", AbstractC167007dF.A0h("PHONE"), A006);
                    AbstractC35274Fh9.A0A(A0f3, abstractC12990ll);
                    A0f3.A9K("actor_id", null);
                    A0f3.Cht();
                }
                c34692FQd.A01 = new AbstractC72473Mu();
                Bundle A0D2 = AbstractC31174DnI.A0D(abstractC12990ll);
                EHO eho = c34692FQd.A01;
                eho.setArguments(A0D2);
                AbstractC59962oe abstractC59962oe4 = c34692FQd.A08;
                eho.setTargetFragment(abstractC59962oe4, 0);
                c34692FQd.A01.A0B(abstractC59962oe4.mFragmentManager, null);
                i = -220123641;
                C0f9.A0C(i, A05);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = C0f9.A05(74291565);
                EVK evk = (EVK) this.A01;
                evk.A00(evk.A06, evk.A02, C05F.A01);
                i = -891370934;
                C0f9.A0C(i, A05);
                return;
            case 43:
                A05 = C0f9.A05(-57388867);
                EVK evk2 = (EVK) this.A01;
                evk2.A00(evk2.A06, evk2.A02, C05F.A00);
                i = 1260968409;
                C0f9.A0C(i, A05);
                return;
            case 44:
                A05 = C0f9.A05(424123951);
                C32251EIk c32251EIk = (C32251EIk) this.A01;
                C32251EIk.A00(c32251EIk, false);
                C35031Fc4.A00.A00(AbstractC166987dD.A0o(c32251EIk.A06), null, "nux_uxr_survey");
                AbstractC31175DnJ.A1Q(c32251EIk.A01);
                i = 495514422;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A05 = C0f9.A05(616627588);
                C32251EIk c32251EIk2 = (C32251EIk) this.A01;
                C32251EIk.A00(c32251EIk2, true);
                C35111FeD.A00(AbstractC166987dD.A0o(c32251EIk2.A06), null, "nux_uxr_survey");
                AbstractC31175DnJ.A1P(c32251EIk2.A01);
                i = -34237754;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(400422692);
                android.net.Uri A03 = AbstractC08820cl.A03(C1AD.A04(C06090Tz.A05, 18859420440133653L));
                Context context2 = (Context) this.A01;
                if (!C12260kU.A0G(context2, A03)) {
                    C9GR.A07(context2.getApplicationContext(), 2131969278);
                }
                i = -540675805;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = C0f9.A05(-57232211);
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((C52140N5p) this.A01).A02);
                AbstractC166987dD.A1Z(new PZX(A0Z, null, 12), AbstractC141776au.A00(A0Z));
                i = 1965137264;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A05 = C0f9.A05(969694029);
                Fragment fragment2 = (Fragment) this.A01;
                C193328hC A0O = AbstractC31175DnJ.A0O(fragment2);
                A0O.A0e(DialogInterfaceOnClickListenerC35454FkB.A00(fragment2, 34), AbstractC25227BEk.A0v(fragment2, 2131972401));
                AbstractC31178DnM.A1R(A0O, true);
                i = 198562718;
                C0f9.A0C(i, A05);
                return;
            case 49:
                A05 = C0f9.A05(-1359993435);
                ((AnonymousClass749) this.A01).D3R(true);
                i = -1773171989;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A05 = C0f9.A05(525657405);
                ((AnonymousClass749) this.A01).Der();
                i = -308111440;
                C0f9.A0C(i, A05);
                return;
            case 51:
                A05 = C0f9.A05(-1838984859);
                EK2 ek2 = (EK2) this.A01;
                EditText editText = ek2.A00;
                editText.getClass();
                if (editText.getText().length() != 0) {
                    EditText editText2 = ek2.A00;
                    editText2.getClass();
                    if (!AbstractC13670mt.A0C(AbstractC167007dF.A0g(editText2))) {
                        ek2.A00.requestFocus();
                        AbstractC31171DnF.A0z(2131969694);
                        i = -28447992;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                ek2.A02.A02("contact_point", "add_contact_point");
                UserSession userSession = ek2.A01;
                Integer A007 = FCK.A00(ek2.A03);
                A007.getClass();
                EditText editText3 = ek2.A00;
                editText3.getClass();
                C1ON A032 = AbstractC152476ta.A03(ek2.requireContext(), userSession, A007, AbstractC167007dF.A0g(editText3), AbstractC31172DnG.A0P(ek2.A01).A02(C19T.A1S), ek2.A04);
                A032.A00 = new EUE(ek2);
                ek2.schedule(A032);
                i = -28447992;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A05 = C0f9.A05(539248566);
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A01;
                C140966Yy A0r2 = AbstractC25225BEi.A0r(editProfileFieldsController.A06(), editProfileFieldsController.A0C);
                AbstractC31364DqT.A03();
                A0r2.A0D(new C32366ENp());
                A0r2.A04();
                i = 1507920691;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A05 = C0f9.A05(-409041070);
                EditProfileFieldsController editProfileFieldsController2 = (EditProfileFieldsController) this.A01;
                UserSession userSession2 = editProfileFieldsController2.A0C;
                C19270xB c19270xB = editProfileFieldsController2.A0B;
                EnumC1571773w enumC1571773w = EnumC1571773w.A05;
                User user5 = editProfileFieldsController2.A06;
                if (user5 != null) {
                    str6 = AbstractC76433bn.A00(user5);
                } else {
                    str6 = null;
                }
                C1571673v.A07(c19270xB, userSession2, enumC1571773w, "tap_edit_profile_links", str6, null, null);
                C140966Yy A0r3 = AbstractC25225BEi.A0r(editProfileFieldsController2.A06(), userSession2);
                AbstractC31364DqT.A03();
                AbstractC31175DnJ.A0v(AbstractC166987dD.A0b(), new C32287EJz(), A0r3);
                i = -682544093;
                C0f9.A0C(i, A05);
                return;
            case 54:
                A05 = C0f9.A05(2106278202);
                EditProfileFieldsController editProfileFieldsController3 = (EditProfileFieldsController) this.A01;
                UserSession userSession3 = editProfileFieldsController3.A0C;
                if (AbstractC1565371b.A00(userSession3)) {
                    AbstractC35176FfT.A02(editProfileFieldsController3.A06(), userSession3, "edit_pronouns");
                    i = 977287067;
                } else {
                    C66277U6x A008 = C66277U6x.A00("com.instagram.equity.pronouns.edit_pronouns.screen");
                    FragmentActivity A062 = editProfileFieldsController3.A06();
                    IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession3);
                    AbstractC31171DnF.A10(editProfileFieldsController3.A06(), A0C, 2131971109);
                    A008.A04(A062, A0C);
                    i = 1794623907;
                }
                C0f9.A0C(i, A05);
                return;
            case 55:
                A05 = C0f9.A05(1417374518);
                CompleteYourProfileFragment completeYourProfileFragment = (CompleteYourProfileFragment) this.A01;
                C3CZ.A00(completeYourProfileFragment.requireContext(), completeYourProfileFragment.A00, false);
                i = -1308388320;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A05 = C0f9.A05(586124179);
                CompleteYourProfileFragment completeYourProfileFragment2 = (CompleteYourProfileFragment) this.A01;
                C3CZ.A00(completeYourProfileFragment2.requireContext(), completeYourProfileFragment2.A00, false);
                i = -1856673321;
                C0f9.A0C(i, A05);
                return;
            case 57:
                A05 = C0f9.A05(-273348276);
                CompleteYourProfileFragment completeYourProfileFragment3 = (CompleteYourProfileFragment) this.A01;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = completeYourProfileFragment3.A01;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Cm3(new Y7A("profile_completion", completeYourProfileFragment3.A06, "continue", null, null, null, null, null));
                }
                if (completeYourProfileFragment3.A05.A1k()) {
                    String string = completeYourProfileFragment3.getString(2131952266);
                    C9GR.A03(completeYourProfileFragment3.getContext(), string, "add_profile_photo_error", 0);
                    CompleteYourProfileFragment.A03(completeYourProfileFragment3, string);
                } else {
                    completeYourProfileFragment3.A04.A0A();
                    UserSession userSession4 = completeYourProfileFragment3.A02;
                    C34649FOh c34649FOh = completeYourProfileFragment3.A03;
                    c34649FOh.getClass();
                    C32539EUp.A00(completeYourProfileFragment3, AbstractC152476ta.A07(userSession4, c34649FOh, AbstractC31173DnH.A0l(completeYourProfileFragment3), false), 40);
                }
                i = -1329787321;
                C0f9.A0C(i, A05);
                return;
            case 58:
                A05 = C0f9.A05(-883273654);
                CompleteYourProfileFragment completeYourProfileFragment4 = (CompleteYourProfileFragment) this.A01;
                if (completeYourProfileFragment4.A07) {
                    AbstractC35083Fcu.A00(completeYourProfileFragment4.requireContext(), DialogInterfaceOnClickListenerC35454FkB.A00(this, 38));
                } else {
                    completeYourProfileFragment4.A09 = true;
                    AbstractC25226BEj.A1Q(completeYourProfileFragment4);
                }
                i = -431395074;
                C0f9.A0C(i, A05);
                return;
            case 59:
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                if (c31721DwQ.A10) {
                    C31721DwQ.A0K(c31721DwQ, "edit_gender");
                    return;
                }
                A0P = AbstractC31173DnH.A0P(c31721DwQ.requireActivity(), c31721DwQ.A0V);
                AbstractC31364DqT.A03();
                C34649FOh c34649FOh2 = c31721DwQ.A0f;
                c34649FOh2.getClass();
                int i3 = c34649FOh2.A00;
                String str18 = c31721DwQ.A0f.A0C;
                boolean z3 = c31721DwQ.A19;
                Bundle A0b3 = AbstractC166987dD.A0b();
                A0b3.putInt("gender", i3);
                if (str18 != null) {
                    A0b3.putString("custom_gender", str18);
                }
                A0b3.putBoolean(MSV.A00(575), z3);
                c52173N7d = new C52173N7d();
                c52173N7d.setArguments(A0b3);
                A0P.A0B(null, c52173N7d);
                A0P.A04();
                return;
            case 60:
                C31721DwQ c31721DwQ2 = (C31721DwQ) this.A01;
                InterfaceC02590Ai A0f4 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c31721DwQ2, c31721DwQ2.A0V), "ig_creator_connections_events");
                AbstractC31171DnF.A1B(A0f4, "click");
                A0f4.AAP("target", "edit_settings");
                A0f4.A8R(EnumC33488ErN.SELF_PROFILE, "screen");
                A0f4.A8R(AbstractC100604fP.A00(c31721DwQ2.A0V), "project");
                A0f4.Cht();
                AbstractC31173DnH.A0u();
                c52173N7d = new C32299EKm();
                A0P = AbstractC25225BEi.A0r(c31721DwQ2.requireActivity(), c31721DwQ2.A0V);
                A0P.A0B(null, c52173N7d);
                A0P.A04();
                return;
            case 61:
                c3cz = ((C31721DwQ) this.A01).A0O;
                tab = AbstractC43884Jap.A01;
                c3cz.A09(tab);
                return;
            case 62:
                c3cz = ((C31721DwQ) this.A01).A0O;
                tab = AbstractC43884Jap.A00;
                c3cz.A09(tab);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C31721DwQ.A0C((C31721DwQ) this.A01);
                return;
            case 64:
                C31721DwQ c31721DwQ3 = (C31721DwQ) this.A01;
                if (c31721DwQ3.A10) {
                    C31721DwQ.A0K(c31721DwQ3, "page_linking");
                    return;
                }
                C31590DuI c31590DuI = c31721DwQ3.A0U;
                if (c31590DuI != null && !c31590DuI.A04) {
                    UserSession userSession5 = c31721DwQ3.A0V;
                    C14360o3.A0B(userSession5, 1);
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "edit_profile");
                    A0q.put("flow", "pro2pro_framework_page_confirmation_flow");
                    AbstractC192798gL A052 = C192108fB.A05(userSession5, "com.bloks.www.pro_to_pro.framework.async.controller.entry", AbstractC167017dG.A0r("server_params", A0q.toString()));
                    C32394EOv.A00(A052, c31721DwQ3, userSession5, 1);
                    c31721DwQ3.schedule(A052);
                    c31721DwQ3.A0y = true;
                    return;
                }
                if (!c31721DwQ3.A0s.A1K() && !C31721DwQ.A0Q(c31721DwQ3)) {
                    c31721DwQ3.A18 = true;
                    FragmentActivity requireActivity = c31721DwQ3.requireActivity();
                    Context requireContext2 = c31721DwQ3.requireContext();
                    UserSession userSession6 = c31721DwQ3.A0V;
                    C08790ch A009 = AbstractC018607g.A00(c31721DwQ3);
                    CallerContext A0010 = CallerContext.A00(C31721DwQ.class);
                    C35793FrV.A03(userSession6, "edit_profile", "edit_page", "edit_page_row");
                    C193328hC c193328hC = new C193328hC(requireContext2, 0);
                    c193328hC.A0s(true);
                    c193328hC.A0t(true);
                    Dialog A02 = c193328hC.A02();
                    A02.setContentView(R.layout.edit_page_dialog);
                    TextView textView = (TextView) A02.requireViewById(R.id.change_page_content);
                    String string2 = requireContext2.getString(2131961604);
                    SpannableStringBuilder A07 = AbstractC31178DnM.A07(requireContext2, string2, 2131961602);
                    String A016 = AbstractC63260SgI.A01(requireContext2, "https://help.instagram.com/402748553849926");
                    int A0F = AbstractC53242c7.A0F(requireContext2, R.attr.igds_color_link);
                    AbstractC167017dG.A1R(userSession6, A016);
                    AnonymousClass773.A05(A07, new C33248Eli(requireContext2, userSession6, null, A016, A0F), string2);
                    AbstractC31176DnK.A1G(textView, A07);
                    ViewOnClickListenerC35684FpJ.A00(A02.requireViewById(R.id.not_now), userSession6, c31721DwQ3, A02, 7);
                    View requireViewById = A02.requireViewById(R.id.edit_button);
                    View requireViewById2 = A02.requireViewById(R.id.disconnect_button);
                    C0fQ.A00(new ViewOnClickListenerC35675FpA(0, A02, A0010, userSession6, c31721DwQ3, requireActivity), requireViewById);
                    C0fQ.A00(new ViewOnClickListenerC35633FoO(1, A02, requireContext2, c31721DwQ3, requireActivity, A009, userSession6), requireViewById2);
                    if (c31721DwQ3 instanceof DialogInterface.OnCancelListener) {
                        A02.setOnCancelListener((DialogInterface.OnCancelListener) c31721DwQ3);
                    }
                    C0fJ.A00(A02);
                    C31721DwQ.A0M(c31721DwQ3, "edit_profile", "page", null);
                    return;
                }
                c31721DwQ3.A0z = true;
                c31721DwQ3.A18 = true;
                C35793FrV.A01(c31721DwQ3.requireContext(), c31721DwQ3, c31721DwQ3, c31721DwQ3.A0V, "edit_profile", C31721DwQ.A0Q(c31721DwQ3));
                return;
            case 65:
                C31721DwQ c31721DwQ4 = (C31721DwQ) this.A01;
                HashMap A1G = AbstractC166987dD.A1G();
                BusinessFlowAnalyticsLogger A017 = AbstractC151606s6.A01(EnumC151596s5.A07, c31721DwQ4.A0V, C31721DwQ.__redex_internal_original_name, null);
                if (A017 != null) {
                    A017.Cm3(new Y7A("personal_ads_account_unlink", "edit_profile", "personal_ads_account_unlink", null, null, null, A1G, null));
                }
                c31721DwQ4.A16 = true;
                C66277U6x A0011 = C66277U6x.A00("com.instagram.page_delinking.screens.manage_from");
                FragmentActivity requireActivity2 = c31721DwQ4.requireActivity();
                IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(c31721DwQ4.A0V);
                AbstractC31171DnF.A17(c31721DwQ4, A0C2, 2131956633);
                A0011.A04(requireActivity2, A0C2);
                return;
            case 66:
                A05 = C0f9.A05(401819463);
                C31721DwQ c31721DwQ5 = (C31721DwQ) this.A01;
                if (c31721DwQ5.A10) {
                    C31721DwQ.A0K(c31721DwQ5, "edit_username");
                    i = 1690953840;
                } else {
                    C28431Ze A022 = AbstractC31364DqT.A02();
                    c31721DwQ5.A0f.getClass();
                    C34649FOh c34649FOh3 = c31721DwQ5.A0f;
                    C33601EtD c33601EtD = c34649FOh3.A06;
                    if (c33601EtD != null && (c33613EtP = c33601EtD.A01) != null) {
                        str7 = c34649FOh3.A0O;
                        str8 = c34649FOh3.A0N;
                        i2 = c34649FOh3.A01;
                        z = c33613EtP.A02;
                        z2 = c33613EtP.A03;
                        str9 = c33613EtP.A00;
                        str10 = c33613EtP.A01;
                        user = c31721DwQ5.A0s;
                    } else {
                        str7 = c34649FOh3.A0O;
                        str8 = c34649FOh3.A0N;
                        i2 = c34649FOh3.A01;
                        z = false;
                        user = c31721DwQ5.A0s;
                        str9 = "";
                        str10 = "";
                        z2 = false;
                    }
                    AbstractC31177DnL.A15(A022.A07(user, str7, str8, str9, str10, i2, z, z2), c31721DwQ5.requireActivity(), c31721DwQ5.A0V);
                    i = 186443669;
                }
                C0f9.A0C(i, A05);
                return;
            case 67:
                A05 = C0f9.A05(-1838646358);
                C31721DwQ c31721DwQ6 = (C31721DwQ) this.A01;
                if (c31721DwQ6.A10) {
                    C31721DwQ.A0K(c31721DwQ6, "edit_photo_and_avatar");
                    i = 2121041807;
                } else {
                    EnumC69993Ci enumC69993Ci = C31721DwQ.A1c;
                    C3CZ.A0B = enumC69993Ci;
                    UserSession userSession7 = c31721DwQ6.A0V;
                    Long.parseLong(userSession7.userId);
                    AbstractC31719DwO.A00(enumC69993Ci, userSession7, "change_profile_photo_button_clicked", "photo_editing", null, null, null);
                    Context context3 = c31721DwQ6.getContext();
                    boolean A023 = AbstractC35182FfZ.A02(c31721DwQ6.A0V);
                    if (context3 != null && A023 && AbstractC31248DoW.A05(c31721DwQ6.A0V)) {
                        AbstractC35182FfZ.A00(context3);
                        i = -1137296632;
                    } else {
                        if (!AbstractC49092Nc.A00(c31721DwQ6.A0V).A00(CallerContext.A00(C31721DwQ.class), "ig_profile_connect_fb_page")) {
                            AbstractC35174FfR.A00(EnumC72435Xdf.A05, c31721DwQ6.A0V, "upsell_impressions");
                        }
                        C31721DwQ.A0B(c31721DwQ6);
                        i = -718066633;
                    }
                }
                C0f9.A0C(i, A05);
                return;
            case 68:
                A05 = C0f9.A05(1276502253);
                C28431Ze A024 = AbstractC31364DqT.A02();
                C31721DwQ c31721DwQ7 = (C31721DwQ) this.A01;
                C34649FOh c34649FOh4 = c31721DwQ7.A0f;
                c34649FOh4.getClass();
                AbstractC31177DnL.A15(A024.A03(c34649FOh4.A0D, "edit_profile"), c31721DwQ7.requireActivity(), c31721DwQ7.A0V);
                i = -759893401;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A05 = C0f9.A05(2002022922);
                Bundle A0b4 = AbstractC166987dD.A0b();
                C31721DwQ c31721DwQ8 = (C31721DwQ) this.A01;
                C34649FOh c34649FOh5 = c31721DwQ8.A0f;
                c34649FOh5.getClass();
                AbstractC31181DnP.A0R(A0b4, c34649FOh5.A0B, c34649FOh5.A0H, c34649FOh5.A0M, !c34649FOh5.A0Z);
                AbstractC34231F8d.A00(A0b4, EnumC33365Eoy.A04);
                A0b4.putString("ENTRYPOINT", "edit_profile");
                C140966Yy A0r4 = AbstractC25225BEi.A0r(c31721DwQ8.requireActivity(), c31721DwQ8.A0V);
                A0r4.A0B(A0b4, AbstractC31175DnJ.A0R().A01(c31721DwQ8.A0V));
                A0r4.A0A = AbstractC111324zv.A00(88);
                A0r4.A04();
                i = 1105978170;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1865394015);
                C31721DwQ c31721DwQ9 = (C31721DwQ) this.A01;
                if (c31721DwQ9.A10) {
                    C31721DwQ.A0K(c31721DwQ9, "professional_conversion");
                    i = 352089431;
                } else {
                    C1QE.A01("business_conversion_flow").A08();
                    Intent A082 = AbstractC31173DnH.A08(c31721DwQ9.requireContext());
                    Bundle requireArguments2 = c31721DwQ9.requireArguments();
                    requireArguments2.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "edit_profile");
                    requireArguments2.putInt("intro_entry_position", 0);
                    AbstractC31174DnI.A1A(A082, 3, requireArguments2);
                    C12260kU.A06(c31721DwQ9, A082, 11);
                    i = -2060697583;
                }
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC31724DwT(ENu eNu, int i) {
        this.A00 = i;
        if (15 - i != 0) {
            this.A01 = eNu;
        } else {
            this.A01 = eNu;
        }
    }

    public ViewOnClickListenerC31724DwT(C32316ELf c32316ELf, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = c32316ELf;
        } else {
            this.A01 = c32316ELf;
        }
    }

    public ViewOnClickListenerC31724DwT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
