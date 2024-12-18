package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;
import go.Seq;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Fp5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35670Fp5 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC35670Fp5(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC35670Fp5(i, obj, obj2), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        C32361ENi c32361ENi;
        boolean z;
        C41181vS c41181vS;
        C38321qM c38321qM;
        String id;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(521782950);
                EVJ evj = (EVJ) this.A01;
                EnumC33444EqG enumC33444EqG = EnumC33444EqG.A0J;
                Integer valueOf = Integer.valueOf(AbstractC166987dD.A0H(this.A02));
                UserSession userSession = evj.A04;
                InterfaceC11380iw interfaceC11380iw = evj.A03;
                Fragment fragment = evj.A02;
                if (fragment == null) {
                    fragment = evj.A01;
                }
                C35233FgQ c35233FgQ = new C35233FgQ(fragment, interfaceC11380iw, userSession, null, null);
                C147036jf c147036jf = new C147036jf(interfaceC11380iw, userSession);
                String str = evj.A07;
                String obj = enumC33444EqG.toString();
                c147036jf.A02(false, valueOf, str, obj);
                c35233FgQ.A04(null, null, enumC33444EqG, obj, null, false, false);
                evj.A01();
                i = 1685096341;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1761052131);
                AbstractC31177DnL.A0n((Activity) this.A01, AbstractC177607uu.A00(null, EnumC33405Epc.A03, false), ((EVJ) this.A02).A04, ModalActivity.class, "nametag");
                i = 2005517353;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-2047741011);
                EVJ evj2 = (EVJ) this.A01;
                C34686FPx c34686FPx = (C34686FPx) this.A02;
                boolean A00 = c34686FPx.A00();
                boolean A1X = AbstractC167007dF.A1X(c34686FPx.A02, C05F.A00);
                EnumC33444EqG enumC33444EqG2 = EnumC33444EqG.A0B;
                UserSession userSession2 = evj2.A04;
                InterfaceC11380iw interfaceC11380iw2 = evj2.A03;
                Fragment fragment2 = evj2.A02;
                if (fragment2 == null) {
                    fragment2 = evj2.A01;
                }
                new C35233FgQ(fragment2, interfaceC11380iw2, userSession2, null, null).A05(null, enumC33444EqG2, true, A00, A1X);
                evj2.A01();
                i = -900584602;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(80748598);
                C31542DtS c31542DtS = (C31542DtS) this.A02;
                String Aj5 = ((GraphGuardianContent) this.A01).Aj5();
                if (Aj5 == null) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("analytics_module", c31542DtS.A0S.getModuleName());
                    A0b.putString("location", "IG_PROFILE");
                    AbstractC25228BEl.A1G(c31542DtS.A0N, A0b, c31542DtS.A0T, ModalActivity.class, "account_status");
                } else {
                    C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                    Context context = c31542DtS.A0O;
                    c35133Fea.A02(context, c31542DtS.A0T, new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, (String) null, AbstractC63260SgI.A01(context, Aj5)));
                }
                i = 1348617469;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-315986664);
                ((InterfaceC37297Gby) this.A01).onUserRowClick((User) this.A02);
                i = -1266618262;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(1306632971);
                ((InterfaceC37297Gby) this.A01).onUserRowClick((User) this.A02);
                i = -579100781;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(1271273691);
                ((GYZ) this.A01).Des((User) this.A02);
                i = 950511387;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-1704380469);
                ((GYZ) this.A01).Des((User) this.A02);
                i = 2055791053;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(167935689);
                ((GYZ) this.A01).Des((User) this.A02);
                i = -334749428;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(330721059);
                ((InterfaceC37204GaF) this.A01).Cub(((FNI) this.A02).A01);
                i = 1828330473;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(644027986);
                C31535DtK c31535DtK = (C31535DtK) this.A01;
                User user = ((FLV) this.A02).A00;
                Context context2 = c31535DtK.getContext();
                if (context2 != null) {
                    Resources resources = context2.getResources();
                    int i2 = c31535DtK.A00;
                    NumberFormat numberInstance = NumberFormat.getNumberInstance(C1Q2.A02());
                    numberInstance.setGroupingUsed(true);
                    numberInstance.setMaximumFractionDigits(0);
                    String format = numberInstance.format(i2);
                    C14360o3.A07(format);
                    String A0r = AbstractC25231BEo.A0r(resources, format, R.plurals.remove_spam_followers_title_plu, i2);
                    String A0p = AbstractC166997dE.A0p(context2, 2131972219);
                    AbstractC31178DnM.A1L(c31535DtK.A03, "remove_follower_dialog_impression", user.getId());
                    C193328hC A0a = AbstractC31176DnK.A0a(context2, A0p, A0r);
                    A0a.A0T(new DialogInterfaceOnClickListenerC35319Fhu(c31535DtK, 10), EnumC193348hE.A06, 2131972214, 2131972214);
                    A0a.A03();
                    AbstractC166987dD.A1W(A0a);
                }
                i = -1739932190;
                C0f9.A0C(i, A05);
                return;
            case 11:
                ((FOT) this.A01).A0B.DT1((User) this.A02);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                return;
            case 14:
                EXV exv = (EXV) this.A01;
                C36208FyM c36208FyM = (C36208FyM) this.A02;
                FOI foi = exv.A02;
                EB0 eb0 = c36208FyM.A01;
                int i3 = eb0.A00;
                Fragment fragment3 = foi.A01;
                if (i3 == 0) {
                    FragmentActivity requireActivity = fragment3.requireActivity();
                    UserSession userSession3 = foi.A04;
                    C31368DqX.A01(AbstractC25225BEi.A0r(requireActivity, userSession3), userSession3, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(userSession3, eb0.A04, foi.A08, foi.A03.getModuleName()));
                    return;
                } else {
                    FragmentActivity requireActivity2 = fragment3.requireActivity();
                    UserSession userSession4 = foi.A04;
                    C36881nl A01 = C36881nl.A01(requireActivity2, foi.A03, userSession4, foi.A07);
                    ImageUrl imageUrl = PendingRecipient.A0g;
                    A01.A0B(AbstractC31175DnJ.A0g(FY9.A00(userSession4, eb0)));
                    A01.A06();
                    return;
                }
            case Process.SIGTERM /* 15 */:
                EXV exv2 = (EXV) this.A01;
                C36208FyM c36208FyM2 = (C36208FyM) this.A02;
                FOI foi2 = exv2.A02;
                EB0 eb02 = c36208FyM2.A01;
                UserSession userSession5 = foi2.A04;
                User A002 = FY9.A00(userSession5, eb02);
                F7C.A00(foi2.A00, foi2.A01, null, userSession5, null, null, null, A002, new C35199Ffr(null, null, null, null, foi2.A03.getModuleName(), foi2.A06, A002.B7L().name(), null, "BLOCKED_ACCOUNTS", foi2.A02.name(), AbstractC166997dE.A0n(), A002.BJ8()), null, foi2.A05);
                return;
            case 16:
                A05 = C0f9.A05(-1737196407);
                C31535DtK c31535DtK2 = (C31535DtK) this.A02;
                User user2 = (User) this.A01;
                String id2 = user2.getId();
                UserSession A03 = C31535DtK.A03(c31535DtK2);
                C14360o3.A0B(A03, 1);
                C25621Ms A0c = AbstractC167017dG.A0c(A03);
                A0c.A0B("friendships/follower_not_spam/set/");
                A0c.A9s("target_user_id", id2);
                C1ON A0e = AbstractC25227BEk.A0e(A0c, C151516rx.class, C151526ry.class);
                A0e.A00 = new C32530EUg(4, user2, c31535DtK2);
                c31535DtK2.schedule(A0e);
                i = 819767666;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(189039921);
                C31535DtK c31535DtK3 = (C31535DtK) this.A02;
                AbstractC35261Fgv.A04(c31535DtK3.requireActivity(), C31535DtK.A03(c31535DtK3), new GIP(c31535DtK3), (User) this.A01, "more_button_action_sheet", c31535DtK3.getModuleName(), null, false);
                i = -1951630245;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(-1194716683);
                C31535DtK c31535DtK4 = (C31535DtK) this.A02;
                User user3 = (User) this.A01;
                C31535DtK.A0B(user3, c31535DtK4);
                AbstractC31178DnM.A1L(c31535DtK4.A03, "remove_follower_dialog_confirmed", user3.getId());
                i = 2121215007;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(-1249578750);
                String id3 = ((C38321qM) this.A01).getId();
                if (id3 != null) {
                    C27897CRi c27897CRi = (C27897CRi) ((EN1) this.A02).A04.getValue();
                    UserSession userSession6 = c27897CRi.A01;
                    C189448aO A0y = AbstractC25225BEi.A0y(userSession6);
                    Fragment fragment4 = c27897CRi.A00;
                    AbstractC25226BEj.A1M(fragment4.requireContext(), A0y, 2131976905);
                    A0y.A11 = true;
                    A0y.A00().A02(fragment4.requireActivity(), FCY.A00(userSession6, id3));
                }
                i = -410646089;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(1814902226);
                C32283EJu.A01((Context) this.A01, (C32283EJu) this.A02);
                i = -1404164555;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(1890438891);
                C32283EJu.A02((Context) this.A01, (C32283EJu) this.A02);
                i = -1539547266;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(2097980723);
                ((GZX) this.A01).DyA(AbstractC31171DnF.A0g(this.A02));
                i = -381362392;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(-1231259025);
                ((GZX) this.A01).DyA(AbstractC31171DnF.A0g(this.A02));
                i = -68853950;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(1169891048);
                String str2 = ((C33605EtH) this.A02).A01;
                if (str2 != null) {
                    ENO eno = (ENO) this.A01;
                    FragmentActivity requireActivity3 = eno.requireActivity();
                    UserSession userSession7 = eno.A00;
                    C14360o3.A0B(userSession7, 1);
                    AbstractC35261Fgv.A07(requireActivity3, userSession7, str2, null);
                }
                i = -1144761102;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(-175097977);
                ENO eno2 = (ENO) this.A01;
                FragmentActivity requireActivity4 = eno2.requireActivity();
                UserSession userSession8 = eno2.A00;
                User user4 = (User) this.A02;
                C14360o3.A0B(userSession8, 2);
                FYZ.A01(requireActivity4, eno2, userSession8, null, user4, null, null, null);
                i = -1983546878;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A05 = C0f9.A05(-291988816);
                ENO eno3 = (ENO) this.A01;
                FragmentActivity requireActivity5 = eno3.requireActivity();
                UserSession userSession9 = eno3.A00;
                AbstractC35261Fgv.A04(requireActivity5, userSession9, eno3, (User) this.A02, "support_inbox_detail_fragment", "support_inbox_detail_fragment", null, AbstractC25229BEm.A1Y(userSession9));
                i = 1850986761;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(1079511420);
                ENO eno4 = (ENO) this.A01;
                AbstractC31175DnJ.A0N(eno4.A00).A03(eno4.requireContext(), AbstractC35261Fgv.A00(eno4.A00, (User) this.A02, new C33280Enb(this), "support_detail_ticket"));
                i = 900958734;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(1805210217);
                ((View.OnClickListener) this.A02).onClick(view);
                AbstractC31171DnF.A1N(this.A01);
                i = -1602921691;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c32361ENi = (C32361ENi) this.A01;
                FO8 fo8 = (FO8) this.A02;
                if (!c32361ENi.A03) {
                    TextView textView = fo8.A05;
                    textView.setText(2131977228);
                    AbstractC166987dD.A1O(c32361ENi.requireContext(), textView, R.color.abc_decor_view_status_guard_light);
                    textView.setBackgroundResource(R.color.zero_rating_video_settings_drawer_confirm_background_color);
                }
                C32361ENi.A00(fo8, c32361ENi);
                z = true;
                c32361ENi.A03 = z;
                return;
            case 30:
                c32361ENi = (C32361ENi) this.A01;
                FO8 fo82 = (FO8) this.A02;
                if (c32361ENi.A03) {
                    TextView textView2 = fo82.A05;
                    textView2.setText(2131977228);
                    AbstractC166987dD.A1O(c32361ENi.requireContext(), textView2, R.color.abc_decor_view_status_guard_light);
                    textView2.setBackgroundResource(R.color.zero_rating_video_settings_drawer_confirm_background_color);
                }
                C32361ENi.A01(fo82, c32361ENi);
                z = false;
                c32361ENi.A03 = z;
                return;
            case 31:
                A05 = C0f9.A05(-1462838145);
                C38921HBt c38921HBt = (C38921HBt) this.A01;
                Context context3 = (Context) this.A02;
                C189478aR A003 = F86.A00(AbstractC25230BEn.A0m(c38921HBt));
                if (A003 != null) {
                    String str3 = c38921HBt.A02;
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    A0b2.putBoolean("show_text_translations_error_rows", false);
                    A0b2.putBoolean("show_voice_translations_error_rows", true);
                    A0b2.putString("translation_error_media_id", str3);
                    A0b2.putBoolean("has_closed_caption_translations", false);
                    C32258EIs c32258EIs = new C32258EIs();
                    c32258EIs.setArguments(A0b2);
                    C189448aO A0g = AbstractC25231BEo.A0g(c38921HBt.A06);
                    AbstractC25226BEj.A1M(context3, A0g, 2131972414);
                    A003.A0F(c32258EIs, A0g);
                }
                i = -880052528;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A05 = C0f9.A05(-1127286467);
                C2XE c2xe = (C2XE) this.A01;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                Context context4 = c2xe.A0C;
                AbstractC31171DnF.A1O(context4);
                AbstractC31175DnJ.A0N(abstractC12990ll).A02((Activity) context4, new C32227EHl());
                i = -168272180;
                C0f9.A0C(i, A05);
                return;
            case 33:
                C31883Dzp c31883Dzp = (C31883Dzp) this.A01;
                EnumC33369Ep2 enumC33369Ep2 = (EnumC33369Ep2) this.A02;
                FK3 fk3 = c31883Dzp.A04;
                GIS gis = fk3.A01;
                C38266GsB c38266GsB = fk3.A00;
                User user5 = c38266GsB.A0L;
                if (user5 != null) {
                    gis.A01 = enumC33369Ep2;
                    C3DO c3do = C3DN.A00;
                    Fragment fragment5 = gis.A02;
                    AbstractC167017dG.A0y(fragment5.getActivity(), c3do);
                    switch (enumC33369Ep2.ordinal()) {
                        case 1:
                            gis.A06.A01(user5);
                            Context context5 = fragment5.getContext();
                            if (context5 != null) {
                                UserSession userSession10 = gis.A04;
                                String moduleName = gis.A03.getModuleName();
                                C36762GIl c36762GIl = new C36762GIl(1, c38266GsB, gis, user5);
                                String fullName = user5.getFullName();
                                if (fullName != null) {
                                    C14360o3.A0B(moduleName, 2);
                                    DialogInterfaceOnClickListenerC35319Fhu dialogInterfaceOnClickListenerC35319Fhu = new DialogInterfaceOnClickListenerC35319Fhu(new C36767GIq(context5, userSession10, user5, c36762GIl, moduleName, fullName), 13);
                                    C193328hC A0I = AbstractC31171DnF.A0I(context5);
                                    A0I.A05 = AbstractC167007dF.A0f(context5, fullName, 2131958575);
                                    StringBuilder A1C = AbstractC166987dD.A1C();
                                    AbstractC31172DnG.A1D(context5, A1C, 2131958567);
                                    A1C.append("\n\n");
                                    AbstractC31172DnG.A1D(context5, A1C, 2131958568);
                                    A1C.append("\n");
                                    AbstractC31172DnG.A1D(context5, A1C, 2131958569);
                                    A1C.append("\n");
                                    AbstractC31172DnG.A1D(context5, A1C, 2131958570);
                                    A1C.append("\n");
                                    AbstractC31172DnG.A1D(context5, A1C, 2131958571);
                                    A1C.append("\n");
                                    AbstractC31172DnG.A1D(context5, A1C, 2131958572);
                                    A1C.append("\n");
                                    AbstractC31172DnG.A1D(context5, A1C, 2131958573);
                                    A1C.append("\n\n");
                                    A0I.A0r(AbstractC166997dE.A0x(AbstractC167007dF.A0f(context5, fullName, 2131958574), A1C));
                                    A0I.A0J(dialogInterfaceOnClickListenerC35319Fhu, 2131958566);
                                    AbstractC31176DnK.A16(null, A0I, 2131964718);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        case 2:
                            AbstractC31178DnM.A1L(gis.A06.A00, MSV.A00(558), user5.getId());
                            Context context6 = fragment5.getContext();
                            if (context6 != null) {
                                FragmentActivity activity = fragment5.getActivity();
                                if (activity != null) {
                                    FCD.A00(activity, context6, fragment5, gis.A03, gis.A04, new GIU(user5, gis), user5);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        case 3:
                        case 4:
                            gis.A04(user5);
                            return;
                        case 5:
                        default:
                            return;
                        case 6:
                            GIS.A00(c38266GsB, gis);
                            return;
                        case 7:
                            C84923qg c84923qg = c38266GsB.A02;
                            if (c84923qg == null || (c41181vS = c38266GsB.A0K) == null || (c38321qM = c41181vS.A0b) == null || (id = c38321qM.getId()) == null) {
                                return;
                            }
                            C1GL c1gl = gis.A05;
                            UserSession userSession11 = gis.A04;
                            String str4 = c84923qg.A0G;
                            String moduleName2 = gis.A03.getModuleName();
                            AbstractC167007dF.A1D(str4, 1, moduleName2);
                            C25621Ms A0c2 = AbstractC167017dG.A0c(userSession11);
                            AbstractC31173DnH.A1Q(A0c2, "media/story_comment/delete/", new Object[0]);
                            AbstractC31173DnH.A1N(A0c2);
                            A0c2.A9s("comment_id", str4);
                            A0c2.A9s("media_id", id);
                            A0c2.A9s("container_module", moduleName2);
                            c1gl.schedule(AbstractC31172DnG.A0U(A0c2, true));
                            AbstractC50567MTy.A03(c38321qM, c84923qg.A0G);
                            gis.A07.CtK(c38266GsB);
                            return;
                    }
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 34:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
                C1OU.A07(reelDashboardFragment.requireActivity(), reelDashboardFragment, reelDashboardFragment.A06, (C38321qM) this.A02, MSV.A00(119), false);
                return;
            case 35:
                ReelDashboardFragment reelDashboardFragment2 = (ReelDashboardFragment) this.A01;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                reelDashboardFragment2.A0D = false;
                ImageUrl A1S = c38321qM2.A1S();
                C3DN A0r2 = AbstractC31172DnG.A0r(reelDashboardFragment2.getActivity());
                if (A0r2 == null) {
                    return;
                }
                A0r2.A0J(AbstractC55178Odj.A03(A1S, C3G2.A0Y, reelDashboardFragment2.A06.token, c38321qM2.getId()));
                return;
            case 36:
                A05 = C0f9.A05(817516685);
                FIC fic = (FIC) this.A01;
                User user6 = (User) this.A02;
                C37986GnW c37986GnW = fic.A00;
                CallerContext callerContext = C37986GnW.A11;
                c37986GnW.A0U.A0A.A05(user6.getId());
                i = 465462295;
                C0f9.A0C(i, A05);
                return;
            case 37:
                A05 = C0f9.A05(-200994184);
                FIC fic2 = (FIC) this.A01;
                User user7 = (User) this.A02;
                C37986GnW c37986GnW2 = fic2.A00;
                CallerContext callerContext2 = C37986GnW.A11;
                ReelDashboardFragment reelDashboardFragment3 = c37986GnW2.A0U;
                C41181vS c41181vS2 = c37986GnW2.A03;
                c41181vS2.getClass();
                String A0P = c41181vS2.A0P();
                A0P.getClass();
                C193328hC A0O = AbstractC31175DnJ.A0O(reelDashboardFragment3);
                A0O.A05 = user7.getUsername();
                A0O.A09(2131972291);
                A0O.A0t(true);
                A0O.A0Z(new DialogInterfaceOnClickListenerC35352FiT(reelDashboardFragment3, user7, c41181vS2, A0P, 11), EnumC193348hE.A05, reelDashboardFragment3.getString(2131972236), true);
                AbstractC31176DnK.A14(new DialogInterfaceOnClickListenerC35319Fhu(reelDashboardFragment3, 23), A0O);
                i = -937656405;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(150878646);
                FIC fic3 = (FIC) this.A01;
                User user8 = (User) this.A02;
                C37986GnW c37986GnW3 = fic3.A00;
                CallerContext callerContext3 = C37986GnW.A11;
                C41181vS c41181vS3 = c37986GnW3.A03;
                c41181vS3.getClass();
                C35003Fba c35003Fba = c41181vS3.A04;
                c35003Fba.getClass();
                if (c35003Fba.A01 >= 250) {
                    Context context7 = c37986GnW3.A0F;
                    C193328hC A0I2 = AbstractC31171DnF.A0I(context7);
                    A0I2.A05 = AbstractC166997dE.A0r(context7.getResources(), Integer.valueOf(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), 2131960420);
                    A0I2.A0r(context7.getResources().getString(2131960421));
                    A0I2.A0t(true);
                    AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC35301Fha(17), A0I2, 2131956237);
                    C36283Fza A004 = AbstractC40677I1j.A00(c37986GnW3.A0J);
                    C41181vS c41181vS4 = c37986GnW3.A03;
                    c41181vS4.getClass();
                    String A0P2 = c41181vS4.A0P();
                    A0P2.getClass();
                    String str5 = c37986GnW3.A08;
                    str5.getClass();
                    A004.A00(A0P2, str5);
                } else {
                    c37986GnW3.A0a.add(user8);
                    ReelDashboardFragment reelDashboardFragment4 = c37986GnW3.A0U;
                    C41181vS c41181vS5 = c37986GnW3.A03;
                    String A0P3 = c41181vS5.A0P();
                    A0P3.getClass();
                    UserSession userSession12 = reelDashboardFragment4.A06;
                    List singletonList = Collections.singletonList(user8);
                    C34569FLd c34569FLd = new C34569FLd(c41181vS5, user8, reelDashboardFragment4);
                    AbstractC167017dG.A1O(userSession12, singletonList);
                    int size = singletonList.size();
                    ArrayList A17 = AbstractC25225BEi.A17(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        A17.add(((C17D) singletonList.get(i4)).getId());
                    }
                    AbstractC35173FfQ.A03(userSession12, new C36450G5z(c34569FLd, 1), A0P3, A17);
                    LinkedList linkedList = new LinkedList();
                    Iterator it = singletonList.iterator();
                    while (it.hasNext()) {
                        AbstractC167017dG.A1V(linkedList, it);
                    }
                    C36283Fza A005 = AbstractC40677I1j.A00(c37986GnW3.A0J);
                    C41181vS c41181vS6 = c37986GnW3.A03;
                    c41181vS6.getClass();
                    String A0P4 = c41181vS6.A0P();
                    A0P4.getClass();
                    String str6 = c37986GnW3.A08;
                    str6.getClass();
                    C25531Mh A0F = C25531Mh.A0F(A005.A00);
                    if (AbstractC25226BEj.A1Z(A0F)) {
                        AbstractC31178DnM.A1F(A0F, A005.A01);
                        AbstractC31174DnI.A1I(A0F, "jcs_add_recipient");
                        AbstractC31179DnN.A1E(A0F, AbstractC111324zv.A00(1068), A0P4, str6);
                    }
                    c37986GnW3.A07();
                }
                i = 257140630;
                C0f9.A0C(i, A05);
                return;
            case 39:
                C38262Gs5 c38262Gs5 = (C38262Gs5) this.A01;
                List list = (List) this.A02;
                AbstractC59962oe abstractC59962oe = c38262Gs5.A05;
                abstractC59962oe.requireActivity();
                UserSession userSession13 = c38262Gs5.A07;
                new FRU(c38262Gs5.A06, userSession13).A02(EnumC33505Ere.VIEWER_LIST, ((AudienceListIntf) list.get(0)).BNl(), ((AudienceListIntf) list.get(0)).getName());
                AbstractC35049FcM.A02((AudienceListIntf) list.get(0), abstractC59962oe, userSession13, 95848312, false);
                return;
            case 40:
                C38262Gs5 c38262Gs52 = (C38262Gs5) this.A01;
                List list2 = (List) this.A02;
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(EnumC33367Ep0.A08, null);
                A1G.put(EnumC33367Ep0.A07, EnumC33505Ere.VIEWER_LIST);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    A1E.add(((AudienceListIntf) it2.next()).BNl());
                }
                A1G.put(EnumC33367Ep0.A05, A1E);
                UserSession userSession14 = c38262Gs52.A07;
                FragmentActivity requireActivity6 = c38262Gs52.A05.requireActivity();
                C14360o3.A0B(userSession14, 0);
                EOT A006 = AbstractC34039F0s.A00(null, userSession14, A1G);
                C189448aO A0y2 = AbstractC25225BEi.A0y(userSession14);
                A0y2.A0U = A006;
                A0y2.A0T = A006;
                A0y2.A0X = null;
                AbstractC31173DnH.A0w(requireActivity6, A006, A0y2);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                final C38262Gs5 c38262Gs53 = (C38262Gs5) this.A01;
                C41181vS c41181vS7 = (C41181vS) this.A02;
                AbstractC59962oe abstractC59962oe2 = c38262Gs53.A05;
                FragmentActivity requireActivity7 = abstractC59962oe2.requireActivity();
                UserSession userSession15 = c38262Gs53.A07;
                new FRV(requireActivity7, new C684436h(requireActivity7, userSession15), userSession15).A02(null, abstractC59962oe2, EnumC33409Epg.SELF_REEL_DASHBOARD, new C55884OrY(c41181vS7), new InterfaceC145346gt() { // from class: X.Ftt
                    @Override // X.InterfaceC145346gt
                    public final void Cvg(User user9) {
                        ReelDashboardFragment reelDashboardFragment5 = C38262Gs5.this.A0B;
                        reelDashboardFragment5.A04.A03(reelDashboardFragment5, AbstractC31178DnM.A0L(reelDashboardFragment5), user9, C05F.A00);
                    }
                }, abstractC59962oe2);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C38262Gs5 c38262Gs54 = (C38262Gs5) this.A01;
                C41181vS c41181vS8 = (C41181vS) this.A02;
                FragmentActivity requireActivity8 = c38262Gs54.A05.requireActivity();
                C38321qM c38321qM3 = c41181vS8.A0b;
                if (c38321qM3 == null) {
                    return;
                }
                AbstractC151756sL.A00().A01();
                UserSession userSession16 = c38262Gs54.A07;
                C14360o3.A0B(userSession16, 1);
                AbstractC34278F9y.A00(requireActivity8, null, userSession16, c38321qM3);
                return;
        }
    }
}
