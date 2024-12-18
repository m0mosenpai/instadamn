package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.debug.mcdoptions.MetaCheckoutDeveloperOptionsFragment;
import com.instagram.debug.whoptions.WhitehatOptionsFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;
import com.instagram.user.model.User;
import go.Seq;
import java.util.HashMap;

/* renamed from: X.FpO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35689FpO implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC35689FpO(FLI fli, int i) {
        this.A00 = i;
        if (45 - i != 0) {
            this.A01 = fli;
        } else {
            this.A01 = fli;
        }
    }

    public static ViewOnClickListenerC35689FpO A00(Object obj, int i) {
        return new ViewOnClickListenerC35689FpO(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC35689FpO(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v67, types: [X.1P1, X.EjB, X.EUj] */
    /* JADX WARN: Type inference failed for: r1v228, types: [X.EUd, X.1P1, X.Ege] */
    /* JADX WARN: Type inference failed for: r1v269, types: [X.EUd, X.1P1, X.Ege] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C34944FaU c34944FaU;
        int i;
        int A05;
        C140966Yy A0j;
        int i2;
        HashMap A1G;
        int i3;
        int A052;
        int i4;
        C140966Yy A0P;
        String A00;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                c34944FaU = (C34944FaU) this.A01;
                i = 0;
                C34944FaU.A00(c34944FaU, new GS4(c34944FaU, i));
                return;
            case 1:
                c34944FaU = (C34944FaU) this.A01;
                i = 2;
                C34944FaU.A00(c34944FaU, new GS4(c34944FaU, i));
                return;
            case 2:
                A052 = C0f9.A05(-1002524176);
                FMN fmn = (FMN) this.A01;
                DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(fmn.A00, fmn.A02, fmn.A01, fmn.A03);
                i4 = 1691086608;
                C0f9.A0C(i4, A052);
                return;
            case 3:
                A052 = C0f9.A05(1833812714);
                FMN fmn2 = (FMN) this.A01;
                C140966Yy A0r = AbstractC25225BEi.A0r(fmn2.A01, fmn2.A03);
                A0r.A0E(new WhitehatOptionsFragment());
                A0r.A04();
                i4 = -395880972;
                C0f9.A0C(i4, A052);
                return;
            case 4:
                A052 = C0f9.A05(938439157);
                FMN fmn3 = (FMN) this.A01;
                C140966Yy A0r2 = AbstractC25225BEi.A0r(fmn3.A01, fmn3.A03);
                A0r2.A0E(new MetaCheckoutDeveloperOptionsFragment());
                A0r2.A04();
                i4 = 2138969461;
                C0f9.A0C(i4, A052);
                return;
            case 5:
                A052 = C0f9.A05(-2005733783);
                C31717DwM c31717DwM = (C31717DwM) this.A01;
                AbstractC34073F2b.A00(c31717DwM, AbstractC31180DnO.A0M(c31717DwM.A01), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE, "click", "button", null, AbstractC167007dF.A0n("is_bloks", "0"));
                AbstractC35275FhA.A05(c31717DwM.requireActivity(), "instagram://direct_account_theme_picker?entrypoint=ig_settings");
                i4 = -733688296;
                C0f9.A0C(i4, A052);
                return;
            case 6:
                A05 = C0f9.A05(-811020279);
                C31717DwM c31717DwM2 = (C31717DwM) this.A01;
                InterfaceC09390do interfaceC09390do = c31717DwM2.A01;
                if (C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(interfaceC09390do), 2342161673576061323L)) {
                    C50685MZd A002 = FBR.A00(EnumC72365Xc1.A09, null);
                    A0j = AbstractC25233BEq.A0j(c31717DwM2, interfaceC09390do);
                    A0j.A0F = true;
                    C14360o3.A0A(A002);
                    A0j.A0B(null, A002);
                } else {
                    DirectMessagesOptionsFragment directMessagesOptionsFragment = new DirectMessagesOptionsFragment();
                    Bundle A0B = AbstractC31177DnL.A0B(directMessagesOptionsFragment);
                    A0B.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
                    A0B.putSerializable(AbstractC43591JPw.A00(195), EnumC33470Er5.PRIVACY_SETTINGS);
                    directMessagesOptionsFragment.setArguments(A0B);
                    A0j = AbstractC25233BEq.A0j(c31717DwM2, interfaceC09390do);
                    A0j.A0F = true;
                    A0j.A0B(null, directMessagesOptionsFragment);
                }
                A0j.A04();
                i2 = 1169634351;
                C0f9.A0C(i2, A05);
                return;
            case 7:
                A052 = C0f9.A05(-644771697);
                C31717DwM c31717DwM3 = (C31717DwM) this.A01;
                C66277U6x A01 = C66277U6x.A01("com.instagram.portable_settings.story_replies", AbstractC166987dD.A1G());
                FragmentActivity requireActivity = c31717DwM3.requireActivity();
                IgBloksScreenConfig A0O = AbstractC31177DnL.A0O(c31717DwM3.A01);
                AbstractC31171DnF.A17(c31717DwM3, A0O, 2131974701);
                A01.A04(requireActivity, A0O);
                i4 = -272441469;
                C0f9.A0C(i4, A052);
                return;
            case 8:
                A05 = C0f9.A05(-1367954216);
                C31717DwM c31717DwM4 = (C31717DwM) this.A01;
                FragmentActivity requireActivity2 = c31717DwM4.requireActivity();
                UserSession A0r3 = AbstractC166987dD.A0r(c31717DwM4.A01);
                C14360o3.A0B(A0r3, 1);
                if (C4K3.A00(A0r3) && C18U.A06(C06090Tz.A05, A0r3, 36316405208977777L)) {
                    A1G = AbstractC166987dD.A1G();
                    i3 = 191;
                } else {
                    boolean A06 = C18U.A06(C06090Tz.A05, A0r3, 36315653589700054L);
                    A1G = AbstractC166987dD.A1G();
                    if (A06) {
                        i3 = 809;
                    } else {
                        i3 = 370;
                    }
                }
                C66277U6x A012 = C66277U6x.A01(AbstractC111324zv.A00(i3), A1G);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A0r3);
                AbstractC31171DnF.A10(requireActivity2, A0C, 2131963151);
                A012.A04(requireActivity2, A0C);
                i2 = -145701201;
                C0f9.A0C(i2, A05);
                return;
            case 9:
                A052 = C0f9.A05(466050122);
                C31717DwM c31717DwM5 = (C31717DwM) this.A01;
                FragmentActivity requireActivity3 = c31717DwM5.requireActivity();
                AbstractC12990ll A0o = AbstractC166987dD.A0o(c31717DwM5.A01);
                C14360o3.A0B(A0o, 1);
                C140966Yy A0P2 = AbstractC31173DnH.A0P(requireActivity3, A0o);
                A0P2.A0D(new C33203Ekq());
                A0P2.A04();
                i4 = -482425340;
                C0f9.A0C(i4, A052);
                return;
            case 10:
                A052 = C0f9.A05(1470910406);
                C31717DwM c31717DwM6 = (C31717DwM) this.A01;
                FragmentActivity requireActivity4 = c31717DwM6.requireActivity();
                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(c31717DwM6.A01);
                C14360o3.A0B(A0o2, 1);
                C140966Yy A0P3 = AbstractC31173DnH.A0P(requireActivity4, A0o2);
                A0P3.A0D(new C33204Ekr());
                A0P3.A04();
                i4 = 1569111462;
                C0f9.A0C(i4, A052);
                return;
            case 11:
                A052 = C0f9.A05(-1214512276);
                C31717DwM c31717DwM7 = (C31717DwM) this.A01;
                C140966Yy A0c = AbstractC25231BEo.A0c(c31717DwM7.requireActivity(), c31717DwM7.A01);
                A0c.A0D(new C46052Ka7());
                A0c.A04();
                i4 = -1472737412;
                C0f9.A0C(i4, A052);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A052 = C0f9.A05(-509363624);
                C31717DwM c31717DwM8 = (C31717DwM) this.A01;
                C140966Yy A0c2 = AbstractC25231BEo.A0c(c31717DwM8.requireActivity(), c31717DwM8.A01);
                A0c2.A0D(new C33193Ekf());
                A0c2.A04();
                i4 = 155086402;
                C0f9.A0C(i4, A052);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A052 = C0f9.A05(1005664558);
                C31717DwM c31717DwM9 = (C31717DwM) this.A01;
                C140966Yy A0c3 = AbstractC25231BEo.A0c(c31717DwM9.requireActivity(), c31717DwM9.A01);
                A0c3.A0D(new C46054Ka9());
                A0c3.A04();
                i4 = 622337371;
                C0f9.A0C(i4, A052);
                return;
            case 14:
                A052 = C0f9.A05(1622997612);
                C31717DwM c31717DwM10 = (C31717DwM) this.A01;
                AbstractC86593tX.A0d(c31717DwM10.requireActivity(), AbstractC166987dD.A0r(c31717DwM10.A01), "");
                i4 = 152299840;
                C0f9.A0C(i4, A052);
                return;
            case Process.SIGTERM /* 15 */:
                A052 = C0f9.A05(777553380);
                AbstractC27401Ut abstractC27401Ut = AbstractC27401Ut.getInstance();
                FRN frn = (FRN) this.A01;
                UserSession userSession = frn.A05;
                abstractC27401Ut.getPerformanceLogger(userSession).Emq(C05F.A01, null, "email_sms_notification_settings");
                AbstractC27401Ut.getInstance();
                C64501TGn A013 = new C64501TGn(userSession).A01("IgEmailSmsSettingsRoute");
                Activity activity = frn.A01;
                A013.A07 = activity.getString(2131961723);
                A013.A08 = true;
                A013.A02(activity);
                i4 = 831497491;
                C0f9.A0C(i4, A052);
                return;
            case 16:
                C33196Ekj c33196Ekj = (C33196Ekj) this.A01;
                if (c33196Ekj.getActivity() == null) {
                    return;
                }
                W8S.A01(c33196Ekj.A00, "settings_single_payment_option");
                A0P = AbstractC31173DnH.A0P(c33196Ekj.requireActivity(), c33196Ekj.A00);
                A0P.A0E(new C68096VAq());
                A00 = AbstractC111324zv.A00(159);
                A0P.A0A = A00;
                A0P.A04();
                return;
            case 17:
                A052 = C0f9.A05(559150398);
                C92I.A07(AbstractC31172DnG.A07(this.A01));
                i4 = 550390908;
                C0f9.A0C(i4, A052);
                return;
            case 18:
                FN8 fn8 = (FN8) this.A01;
                UserSession userSession2 = fn8.A02;
                FragmentActivity fragmentActivity = fn8.A01;
                AbstractC167007dF.A1E(userSession2, 0, fragmentActivity);
                FP2 fp2 = FEV.A01;
                fp2.A00();
                String A0j2 = AbstractC167017dG.A0j();
                A00 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                A0P = AbstractC25225BEi.A0r(fragmentActivity, userSession2);
                A0P.A0F = true;
                C1XJ.A00.A0T();
                String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131974000);
                HashMap A1G2 = AbstractC166987dD.A1G();
                A1G2.put("prior_module", "shopping_business_settings");
                A1G2.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "SHOP_INVENTORY_SHOPPING_SETTINGS");
                fp2.A00();
                A1G2.put("waterfall_id", A0j2);
                A1G2.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                AbstractC31181DnP.A0s(A0P, userSession2, "com.bloks.www.bloks.commerce.shop.inventory.settings", A0p, A1G2);
                A0P.A0A = A00;
                A0P.A04();
                return;
            case Process.SIGSTOP /* 19 */:
                A052 = C0f9.A05(-257976004);
                FN8 fn82 = (FN8) this.A01;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fn82.A03.A00, "shopping_business_setting_tapped");
                A0f.AAP("shopping_business_setting_type", "domain");
                AbstractC31175DnJ.A15(A0f, null);
                AbstractC1566271k.A0O(fn82.A01, fn82.A02, "POLICY_MIGRATION_SHOPPING_SETTINGS", "shopping_business_settings", false);
                i4 = 1006893167;
                C0f9.A0C(i4, A052);
                return;
            case 20:
                A052 = C0f9.A05(547884709);
                FN8 fn83 = (FN8) this.A01;
                UserSession userSession3 = fn83.A02;
                FragmentActivity fragmentActivity2 = fn83.A01;
                C14360o3.A0B(userSession3, 0);
                FEV.A01.A00();
                String A0j3 = AbstractC167017dG.A0j();
                C140966Yy A0P4 = AbstractC31173DnH.A0P(fragmentActivity2, userSession3);
                C1XJ.A00.A0T();
                String string = fragmentActivity2.getString(2131974007);
                AbstractC31181DnP.A0s(A0P4, userSession3, "com.instagram.shopping.screens.domain_change", string, AbstractC31181DnP.A0J(string, "DOMAIN_CHANGE_SHOPPING_SETTINGS", A0j3, "shopping_business_settings"));
                A0P4.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                A0P4.A04();
                i4 = -843096159;
                C0f9.A0C(i4, A052);
                return;
            case 21:
                A052 = C0f9.A05(-2147408922);
                FN8 fn84 = (FN8) this.A01;
                AbstractC1566271k.A0Q(fn84.A01, fn84.A02, "CHECKOUT_SETUP_SHOPPING_SETTINGS", "shopping_business_settings", false);
                i4 = 2020353008;
                C0f9.A0C(i4, A052);
                return;
            case 22:
                A052 = C0f9.A05(224020959);
                FN8 fn85 = (FN8) this.A01;
                AbstractC1566271k.A0Q(fn85.A01, fn85.A02, "CHECKOUT_DEFERRED_PAYOUT_SHOPPING_SETTINGS", "shopping_business_settings", true);
                i4 = 1153442601;
                C0f9.A0C(i4, A052);
                return;
            case 23:
                A052 = C0f9.A05(865565080);
                FN8 fn86 = (FN8) this.A01;
                AbstractC1566271k.A0I(fn86.A01, fn86.A02, "CHECKOUT_UPSELL_SHOPPING_SETTINGS", "shopping_business_settings");
                i4 = -12795071;
                C0f9.A0C(i4, A052);
                return;
            case 24:
                A052 = C0f9.A05(1195574780);
                FN8 fn87 = (FN8) this.A01;
                UserSession userSession4 = fn87.A02;
                FragmentActivity fragmentActivity3 = fn87.A01;
                C14360o3.A0B(userSession4, 0);
                FEV.A01.A00();
                String A0j4 = AbstractC167017dG.A0j();
                C140966Yy A0P5 = AbstractC31173DnH.A0P(fragmentActivity3, userSession4);
                C1XJ.A00.A0T();
                String string2 = fragmentActivity3.getString(2131974004);
                AbstractC31181DnP.A0s(A0P5, userSession4, "com.instagram.shopping.screens.product_tags_options", string2, AbstractC31181DnP.A0J(string2, "PRODUCT_TAG_OPTIONS", A0j4, "shopping_business_settings"));
                A0P5.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                A0P5.A04();
                i4 = 938250175;
                C0f9.A0C(i4, A052);
                return;
            case 25:
                A052 = C0f9.A05(673722374);
                C66277U6x A003 = C66277U6x.A00("com.instagram.shopping.screens.shop_linking_seller");
                FN8 fn88 = (FN8) this.A01;
                UserSession userSession5 = fn88.A02;
                C140966Yy A0O2 = AbstractC31174DnI.A0O(W6d.A02(AbstractC31171DnF.A0C(userSession5), A003), fn88.A01, userSession5);
                A0O2.A0A = "shopping_business_settings";
                A0O2.A04();
                i4 = -1981423380;
                C0f9.A0C(i4, A052);
                return;
            case 26:
                A052 = C0f9.A05(-938591605);
                android.net.Uri parse = android.net.Uri.parse("stella://");
                C14360o3.A07(parse);
                C12260kU.A04(new Intent("android.intent.action.VIEW", parse), (Fragment) this.A01);
                i4 = 1997769095;
                C0f9.A0C(i4, A052);
                return;
            case 27:
                A052 = C0f9.A05(-1230459795);
                C33244Ele c33244Ele = (C33244Ele) this.A01;
                C33244Ele.A01(new GG8(this), c33244Ele, c33244Ele.A04.getString(2131975594), String.valueOf(c33244Ele.A00.A00));
                i4 = 993763420;
                C0f9.A0C(i4, A052);
                return;
            case 28:
                A052 = C0f9.A05(-1497266259);
                C33244Ele c33244Ele2 = (C33244Ele) this.A01;
                C33244Ele.A01(new GG9(this), c33244Ele2, c33244Ele2.A04.getString(2131975595), String.valueOf(c33244Ele2.A00.A01));
                i4 = 341576024;
                C0f9.A0C(i4, A052);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A052 = C0f9.A05(-484987661);
                ELn eLn = (ELn) this.A01;
                if (eLn instanceof C33149Ejs) {
                    C33149Ejs c33149Ejs = (C33149Ejs) eLn;
                    C140966Yy A0c4 = AbstractC25231BEo.A0c(c33149Ejs.requireActivity(), c33149Ejs.A06);
                    A0c4.A0F = true;
                    A0c4.A0D(new C33144Ejn());
                    A0c4.A04();
                }
                i4 = -1664593223;
                C0f9.A0C(i4, A052);
                return;
            case 30:
                A052 = C0f9.A05(-641676098);
                EQ8 eq8 = ((FHX) ((C38687GzS) this.A01).A00).A00;
                eq8.A03 = true;
                eq8.A01();
                i4 = 910416311;
                C0f9.A0C(i4, A052);
                return;
            case 31:
                A052 = C0f9.A05(878829323);
                EQ8 eq82 = ((FHX) ((C38687GzS) this.A01).A00).A00;
                eq82.A03 = true;
                eq82.A01();
                i4 = 182021133;
                C0f9.A0C(i4, A052);
                return;
            case 32:
                A052 = C0f9.A05(-52202799);
                AbstractC31176DnK.A1Y(this.A01);
                i4 = 444138843;
                C0f9.A0C(i4, A052);
                return;
            case 33:
                A052 = C0f9.A05(-98048564);
                EIx eIx = ((C31870Dzc) this.A01).A00;
                C684436h c684436h = eIx.A03;
                if (c684436h == null) {
                    str = "closeFriendsController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c684436h.A00(eIx, EnumC33409Epg.BIRTHDAY_EFFECTS_SETTINGS, 2002, false);
                C31294DpG c31294DpG = eIx.A09;
                if (c31294DpG != null) {
                    InterfaceC09390do interfaceC09390do2 = eIx.A0N;
                    c31294DpG.A02("qp", "close_friend_list", null, AbstractC31178DnM.A04(interfaceC09390do2), AbstractC31178DnM.A04(interfaceC09390do2));
                    i4 = -1763822691;
                    C0f9.A0C(i4, A052);
                    return;
                }
                str = "birthdayLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 34:
                A05 = C0f9.A05(1870218501);
                EIx eIx2 = (EIx) this.A01;
                if (eIx2.A00 != null && eIx2.A0D) {
                    C121275eQ c121275eQ = new C121275eQ(new PUG(eIx2, 4), 1726365662);
                    c121275eQ.A00 = new EZ9(eIx2, 16);
                    eIx2.schedule(c121275eQ);
                } else {
                    EnumC33412Epj enumC33412Epj = (EnumC33412Epj) ((C31807DyR) eIx2.A0O.getValue()).A01.A02();
                    if (enumC33412Epj != null) {
                        EIx.A04(eIx2, null, enumC33412Epj.A00);
                    }
                }
                i2 = -72627657;
                C0f9.A0C(i2, A05);
                return;
            case 35:
                A052 = C0f9.A05(-1287772389);
                AbstractC31177DnL.A13((Fragment) this.A01);
                i4 = -1069877403;
                C0f9.A0C(i4, A052);
                return;
            case 36:
                A052 = C0f9.A05(-771162969);
                EIx.A06((EIx) this.A01, true);
                i4 = 1936681408;
                C0f9.A0C(i4, A052);
                return;
            case 37:
                A052 = C0f9.A05(219379686);
                EIx eIx3 = (EIx) this.A01;
                if (eIx3.A0C && eIx3.A00 != null && !eIx3.A0D) {
                    EIx.A06(eIx3, false);
                } else {
                    InterfaceC09390do interfaceC09390do3 = eIx3.A0N;
                    C6XJ.A02(eIx3.getActivity(), eIx3.mArguments, AbstractC166987dD.A0o(interfaceC09390do3), TransparentModalActivity.class, AbstractC111324zv.A00(3506)).A0D(eIx3, 7766);
                    C31294DpG c31294DpG2 = eIx3.A09;
                    if (c31294DpG2 != null) {
                        c31294DpG2.A02("qp", "birthday_selfie_camera", "open", AbstractC31178DnM.A04(interfaceC09390do3), AbstractC31178DnM.A04(interfaceC09390do3));
                    }
                    str = "birthdayLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i4 = 838373911;
                C0f9.A0C(i4, A052);
                return;
            case 38:
                A052 = C0f9.A05(-162137713);
                AbstractC31177DnL.A13((Fragment) this.A01);
                i4 = 768841750;
                C0f9.A0C(i4, A052);
                return;
            case 39:
                A052 = C0f9.A05(1963857869);
                AbstractC31177DnL.A13((Fragment) this.A01);
                i4 = -975386000;
                C0f9.A0C(i4, A052);
                return;
            case 40:
                A052 = C0f9.A05(-1214257175);
                AbstractC25227BEk.A1B((Fragment) this.A01);
                i4 = -1627496130;
                C0f9.A0C(i4, A052);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A052 = C0f9.A05(160457454);
                C33224ElC c33224ElC = (C33224ElC) this.A01;
                String str3 = c33224ElC.A02;
                if (str3 != null && (str2 = c33224ElC.A03) != null && !str2.equals(str3)) {
                    C33224ElC.A01(c33224ElC, str2);
                }
                AbstractC25226BEj.A1Q(c33224ElC);
                i4 = 1360481457;
                C0f9.A0C(i4, A052);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A052 = C0f9.A05(2109247899);
                C32254EIo c32254EIo = (C32254EIo) this.A01;
                AbstractC31173DnH.A1I(c32254EIo, AbstractC31176DnK.A0d(c32254EIo.requireActivity(), AbstractC31178DnM.A06(AbstractC111324zv.A00(1505), c32254EIo.getString(2131953842)), AbstractC166987dD.A0o(c32254EIo.A08), ModalActivity.class, AbstractC111324zv.A00(1981)));
                User user = c32254EIo.A04;
                if (user != null) {
                    C32254EIo.A00(c32254EIo, user.getId(), "notif_setting");
                }
                i4 = 1661412895;
                C0f9.A0C(i4, A052);
                return;
            case 43:
                A05 = C0f9.A05(-353434182);
                C32254EIo c32254EIo2 = (C32254EIo) this.A01;
                User user2 = c32254EIo2.A04;
                if (user2 != null) {
                    AbstractC12990ll A0o3 = AbstractC166987dD.A0o(c32254EIo2.A08);
                    String id = user2.getId();
                    C25621Ms A0C2 = AbstractC31179DnN.A0C(A0o3);
                    A0C2.A03();
                    A0C2.A0B("api/v1/stories/follow_versaries/follow_versaries_media/");
                    A0C2.A0R(EAC.class, FSJ.class);
                    C1ON A0T = AbstractC31172DnG.A0T(A0C2, "follower_id", id);
                    C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FollowVersariesResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FollowVersariesResponse>>");
                    C31702Dw7.A00(c32254EIo2, A0T, 45);
                }
                User user3 = c32254EIo2.A04;
                if (user3 != null) {
                    C32254EIo.A00(c32254EIo2, user3.getId(), "shared_memories");
                }
                i2 = -1706653498;
                C0f9.A0C(i2, A05);
                return;
            case 44:
                A05 = C0f9.A05(552213688);
                C32254EIo c32254EIo3 = (C32254EIo) this.A01;
                InterfaceC09390do interfaceC09390do4 = c32254EIo3.A08;
                User A02 = AbstractC31176DnK.A0h(interfaceC09390do4).A02(c32254EIo3.requireArguments().getString("USER_ID_ARGUMENT"));
                if (A02 != null) {
                    C36881nl A014 = C36881nl.A01(c32254EIo3.requireActivity(), c32254EIo3, AbstractC166987dD.A0r(interfaceC09390do4), "celebrate_birthday_bottomsheet");
                    AbstractC31179DnN.A1Q(A014, A02);
                    A014.A06();
                }
                User user4 = c32254EIo3.A04;
                if (user4 != null) {
                    C32254EIo.A00(c32254EIo3, user4.getId(), "send_confetti");
                }
                i2 = -1551253702;
                C0f9.A0C(i2, A05);
                return;
            case 45:
                FLI fli = (FLI) this.A01;
                UserSession userSession6 = fli.A01;
                Integer valueOf = Integer.valueOf(EnumC33390EpN.A04.A00);
                C25621Ms A0C3 = AbstractC31179DnN.A0C(userSession6);
                A0C3.A0B("security_checkup/start/");
                A0C3.A0A(valueOf, "use_case");
                C1ON A0e = AbstractC25227BEk.A0e(A0C3, EDB.class, C34866FYb.class);
                FragmentActivity fragmentActivity4 = fli.A00;
                AbstractC10360h2 supportFragmentManager = fragmentActivity4.getSupportFragmentManager();
                IgFragmentActivity igFragmentActivity = (IgFragmentActivity) fragmentActivity4;
                AbstractC167027dH.A13(supportFragmentManager, igFragmentActivity, userSession6);
                ?? abstractC32533EUj = new AbstractC32533EUj(supportFragmentManager);
                abstractC32533EUj.A00 = supportFragmentManager;
                abstractC32533EUj.A01 = igFragmentActivity;
                abstractC32533EUj.A02 = userSession6;
                A0e.A00 = abstractC32533EUj;
                C1GJ.A03(A0e);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A052 = C0f9.A05(320605810);
                FLI fli2 = (FLI) this.A01;
                UserSession userSession7 = fli2.A01;
                AbstractC35091Fd2.A02(userSession7, "security", "app_and_websites_entered");
                C66277U6x A015 = C66277U6x.A01("com.instagram.platformapi.platform_authorized_applications.list", AbstractC166987dD.A1G());
                FragmentActivity fragmentActivity5 = fli2.A00;
                IgBloksScreenConfig A0C4 = AbstractC31171DnF.A0C(userSession7);
                AbstractC31171DnF.A10(fragmentActivity5, A0C4, 2131953127);
                AbstractC31173DnH.A14(fragmentActivity5, A0C4, A015);
                i4 = -69850975;
                C0f9.A0C(i4, A052);
                return;
            case 47:
                A052 = C0f9.A05(1311857626);
                FLI fli3 = (FLI) this.A01;
                C35256Fgp.A02(fli3.A02, fli3.A01, "ig_change_password_phase_1", "password_change");
                i4 = 98598553;
                C0f9.A0C(i4, A052);
                return;
            case 48:
                A052 = C0f9.A05(1881740870);
                FLI fli4 = (FLI) this.A01;
                FragmentActivity fragmentActivity6 = fli4.A00;
                UserSession userSession8 = fli4.A01;
                C140966Yy A0N = AbstractC31177DnL.A0N(fragmentActivity6, userSession8);
                AbstractC33235ElU abstractC33235ElU = fli4.A02;
                Bundle A053 = AbstractC31178DnM.A05(userSession8);
                EK8 ek8 = new EK8();
                ek8.setArguments(A053);
                ek8.setTargetFragment(abstractC33235ElU, 0);
                A0N.A0E(ek8);
                A0N.A04();
                i4 = -576617186;
                C0f9.A0C(i4, A052);
                return;
            case 49:
                A052 = C0f9.A05(-533851693);
                FLI fli5 = (FLI) this.A01;
                C25621Ms A0M = AbstractC31173DnH.A0M(fli5.A01);
                A0M.A0B("accounts/send_password_reset_link/");
                C1ON A0I = AbstractC31178DnM.A0I(A0M, EDD.class, C34807FVj.class);
                FragmentActivity fragmentActivity7 = fli5.A00;
                AbstractC10360h2 parentFragmentManager = fli5.A02.getParentFragmentManager();
                ?? c32527EUd = new C32527EUd(fragmentActivity7);
                c32527EUd.A00 = parentFragmentManager;
                A0I.A00 = c32527EUd;
                C1GJ.A03(A0I);
                i4 = -122957813;
                C0f9.A0C(i4, A052);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A052 = C0f9.A05(-2054557478);
                FLI fli6 = (FLI) this.A01;
                UserSession userSession9 = fli6.A01;
                AbstractC35091Fd2.A02(userSession9, "security", "password_setting_entered");
                new C35016Fbp(userSession9).A01(857808781, "password_change");
                C140966Yy A0P6 = AbstractC31173DnH.A0P(fli6.A00, userSession9);
                A0P6.A0E(AbstractC31175DnJ.A0R().A00(userSession9, null));
                A0P6.A04();
                i4 = -732623120;
                C0f9.A0C(i4, A052);
                return;
            case 51:
                A052 = C0f9.A05(95013899);
                FLI fli7 = (FLI) this.A01;
                C140966Yy A0P7 = AbstractC31173DnH.A0P(fli7.A00, fli7.A01);
                AbstractC31172DnG.A1A();
                A0P7.A0E(new AbstractC60672pq());
                A0P7.A04();
                i4 = -1869277545;
                C0f9.A0C(i4, A052);
                return;
            case 52:
                A05 = C0f9.A05(890713953);
                FLI fli8 = (FLI) this.A01;
                UserSession userSession10 = fli8.A01;
                AbstractC35091Fd2.A02(userSession10, "security", AbstractC111324zv.A00(5518));
                if (C18U.A06(C06090Tz.A05, userSession10, 36314356509575703L)) {
                    C35256Fgp.A02(fli8.A02, userSession10, AbstractC111324zv.A00(4634), "two_factor");
                } else {
                    EJU A022 = AbstractC35179FfW.A00().A02(C05F.A0C, false, false);
                    C140966Yy A0r4 = AbstractC25225BEi.A0r(fli8.A00, userSession10);
                    A0r4.A0A = AbstractC37314GcG.A01(19, 24, 50);
                    A0r4.A0E(A022);
                    A0r4.A0F = true;
                    A0r4.A04();
                }
                i2 = -1614975750;
                C0f9.A0C(i2, A05);
                return;
            case 53:
                A05 = C0f9.A05(1785851715);
                FLI fli9 = (FLI) this.A01;
                UserSession userSession11 = fli9.A01;
                AbstractC35091Fd2.A02(userSession11, "security", "login_activity_entered");
                if (C18U.A06(C06090Tz.A05, userSession11, 36314360804543000L)) {
                    C35256Fgp.A02(fli9.A02, userSession11, "ig_login_activities_phase_1", "login_activities");
                } else {
                    C140966Yy A0r5 = AbstractC25225BEi.A0r(fli9.A00, userSession11);
                    A0r5.A0E(new N7U());
                    A0r5.A04();
                }
                i2 = 1460162830;
                C0f9.A0C(i2, A05);
                return;
            case 54:
                A052 = C0f9.A05(1916969557);
                FLI fli10 = (FLI) this.A01;
                UserSession userSession12 = fli10.A01;
                AbstractC35091Fd2.A02(userSession12, "security", "emails_sent_list_entered");
                C66277U6x A016 = C66277U6x.A01("com.instagram.account_security.screens.email_sent_list", AbstractC166987dD.A1G());
                FragmentActivity fragmentActivity8 = fli10.A00;
                IgBloksScreenConfig A0C5 = AbstractC31171DnF.A0C(userSession12);
                A0C5.A0m = false;
                A0C5.A0P = C05F.A01;
                AbstractC31171DnF.A10(fragmentActivity8, A0C5, 2131961716);
                A016.A04(fragmentActivity8, A0C5);
                i4 = -591119107;
                C0f9.A0C(i4, A052);
                return;
            case 55:
                A052 = C0f9.A05(94305318);
                C33208Ekw c33208Ekw = (C33208Ekw) this.A01;
                Bundle A08 = AbstractC31176DnK.A08(c33208Ekw.A01);
                C33146Ejp c33146Ejp = new C33146Ejp();
                FragmentActivity A0J = AbstractC31173DnH.A0J(A08, c33146Ejp, c33208Ekw);
                InterfaceC09390do interfaceC09390do5 = c33208Ekw.A02;
                C140966Yy A0c5 = AbstractC25231BEo.A0c(A0J, interfaceC09390do5);
                A0c5.A0F = true;
                C14360o3.A0A(c33146Ejp);
                A0c5.A0D(c33146Ejp);
                A0c5.A04();
                AbstractC31175DnJ.A1N(AbstractC31176DnK.A0M(c33208Ekw, interfaceC09390do5), "call_settings_specific_people_tapped");
                i4 = 1214862707;
                C0f9.A0C(i4, A052);
                return;
            case 56:
                A052 = C0f9.A05(-1526675809);
                AbstractC31178DnM.A1T(this.A01);
                i4 = -815805637;
                C0f9.A0C(i4, A052);
                return;
            case 57:
                A052 = C0f9.A05(-1225467196);
                AbstractC31178DnM.A1T(this.A01);
                i4 = -850983299;
                C0f9.A0C(i4, A052);
                return;
            case 58:
                A052 = C0f9.A05(1401988980);
                C33146Ejp.A03((C33146Ejp) this.A01);
                i4 = 963216032;
                C0f9.A0C(i4, A052);
                return;
            case 59:
                A052 = C0f9.A05(922061595);
                ((AbstractC32289EKc) this.A01).onBackPressed();
                i4 = 933705605;
                C0f9.A0C(i4, A052);
                return;
            case 60:
                A052 = C0f9.A05(1069551444);
                ((AbstractC32289EKc) this.A01).onBackPressed();
                i4 = 1685461866;
                C0f9.A0C(i4, A052);
                return;
            case 61:
                A052 = C0f9.A05(-1903688895);
                C33157Ek0 c33157Ek0 = (C33157Ek0) this.A01;
                C25621Ms A0M2 = AbstractC31173DnH.A0M(c33157Ek0.A04);
                A0M2.A0B("accounts/send_password_reset_link/");
                C1ON A0I2 = AbstractC31178DnM.A0I(A0M2, EDD.class, C34807FVj.class);
                Context context = c33157Ek0.getContext();
                AbstractC10360h2 abstractC10360h2 = c33157Ek0.mFragmentManager;
                ?? c32527EUd2 = new C32527EUd(context);
                c32527EUd2.A00 = abstractC10360h2;
                A0I2.A00 = c32527EUd2;
                c33157Ek0.schedule(A0I2);
                i4 = 1464345764;
                C0f9.A0C(i4, A052);
                return;
            case 62:
                A052 = C0f9.A05(968032877);
                C33157Ek0.A00((C33157Ek0) this.A01);
                i4 = 684620026;
                C0f9.A0C(i4, A052);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A052 = C0f9.A05(-1337302542);
                ((AbstractC32289EKc) this.A01).onBackPressed();
                i4 = -1957691613;
                C0f9.A0C(i4, A052);
                return;
            case 64:
                C33158Ek1.A01((C33158Ek1) this.A01);
                return;
            case 65:
                A052 = C0f9.A05(-469552863);
                Bundle A0b = AbstractC166987dD.A0b();
                C33216El4 c33216El4 = (C33216El4) this.A01;
                UserSession userSession13 = c33216El4.A00;
                C14360o3.A0A(userSession13);
                AbstractC31173DnH.A1C(A0b, userSession13);
                C140966Yy A0r6 = AbstractC25225BEi.A0r(c33216El4.requireActivity(), c33216El4.A00);
                AbstractC60672pq abstractC60672pq = new AbstractC60672pq();
                abstractC60672pq.setArguments(A0b);
                A0r6.A0D(abstractC60672pq);
                A0r6.A0F(c33216El4, 0);
                A0r6.A04();
                i4 = 1223302428;
                C0f9.A0C(i4, A052);
                return;
            case 66:
                A052 = C0f9.A05(1523438761);
                C33199Ekm c33199Ekm = (C33199Ekm) this.A01;
                FragmentActivity requireActivity5 = c33199Ekm.requireActivity();
                InterfaceC09390do interfaceC09390do6 = c33199Ekm.A01;
                C140966Yy A0c6 = AbstractC25231BEo.A0c(requireActivity5, interfaceC09390do6);
                A0c6.A0F = true;
                A0c6.A0D(FBN.A00(AbstractC166987dD.A0r(interfaceC09390do6)));
                A0c6.A04();
                i4 = -1698875981;
                C0f9.A0C(i4, A052);
                return;
            case 67:
                A052 = C0f9.A05(-1758147578);
                C33199Ekm c33199Ekm2 = (C33199Ekm) this.A01;
                FragmentActivity requireActivity6 = c33199Ekm2.requireActivity();
                InterfaceC09390do interfaceC09390do7 = c33199Ekm2.A01;
                C140966Yy A0c7 = AbstractC25231BEo.A0c(requireActivity6, interfaceC09390do7);
                A0c7.A0F = true;
                AbstractC31175DnJ.A0t(AbstractC31174DnI.A0D(AbstractC31178DnM.A0M(interfaceC09390do7)), new EJR(), A0c7);
                i4 = 1829170517;
                C0f9.A0C(i4, A052);
                return;
            case 68:
                A052 = C0f9.A05(1756188369);
                C32265EJa c32265EJa = (C32265EJa) this.A01;
                C006802i A004 = C32265EJa.A00(c32265EJa);
                int i5 = c32265EJa.A00;
                A004.markerPoint(i5, "nux_continue_click");
                C32265EJa.A00(c32265EJa).markerEnd(i5, (short) 2);
                c32265EJa.requireActivity();
                AbstractC25229BEm.A18(AbstractC34142F4s.A00("nux"), AbstractC25231BEo.A0c(c32265EJa.requireActivity(), c32265EJa.A01));
                i4 = 869946205;
                C0f9.A0C(i4, A052);
                return;
            case 69:
                A052 = C0f9.A05(2134119333);
                C32265EJa c32265EJa2 = (C32265EJa) this.A01;
                C006802i A005 = C32265EJa.A00(c32265EJa2);
                int i6 = c32265EJa2.A00;
                A005.markerPoint(i6, "nux_remind_later_click");
                C32265EJa.A00(c32265EJa2).markerEnd(i6, (short) 2);
                InterfaceC09390do interfaceC09390do8 = c32265EJa2.A01;
                InterfaceC19610xo ARD = AbstractC31174DnI.A0g(C1AT.A01(AbstractC166987dD.A0r(interfaceC09390do8)), C1AV.A19, c32265EJa2).ARD();
                ARD.E7G("IGD_PARENTAL_ACCESS_CONTROL_EDUCATION_REMIND_ME_LATER_TIMESTAMP_KEY", System.currentTimeMillis());
                ARD.apply();
                System.currentTimeMillis();
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                A0Y.A0H = "delete_thread_education_remind_me";
                AbstractC31172DnG.A1H(AbstractC166997dE.A0N(c32265EJa2), A0Y, 2131972139);
                AbstractC31178DnM.A1S(A0Y);
                AbstractC25233BEq.A0j(c32265EJa2, interfaceC09390do8).A06();
                i4 = 1656332167;
                C0f9.A0C(i4, A052);
                return;
            default:
                A052 = C0f9.A05(194763756);
                ((NAF) this.A01).A02(MSV.A00(1211));
                i4 = -1338753576;
                C0f9.A0C(i4, A052);
                return;
        }
    }

    public ViewOnClickListenerC35689FpO(FN8 fn8, int i) {
        this.A00 = i;
        if (18 - i != 0) {
            this.A01 = fn8;
        } else {
            this.A01 = fn8;
        }
    }

    public ViewOnClickListenerC35689FpO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
