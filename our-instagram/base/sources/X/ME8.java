package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class ME8 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ME8(Object obj, Object obj2, Object obj3, String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.2fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [X.Fay, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, X.00g] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC16820sZ me5;
        String str;
        UserSession userSession;
        C1Q9 c1q9;
        C39F c39f;
        Fragment A00;
        Long l;
        User BSW;
        switch (this.A00) {
            case 0:
                OJB ojb = (OJB) this.A02;
                ojb.A01 = ((ComponentActivity) this.A01).activityResultRegistry.A02(new C63539Sp7(0, ojb, this.A03), new Object(), this.A04);
                me5 = new C57243PbR(ojb, 29);
                return new C79353gg(me5);
            case 1:
                Wap A0H = AbstractC43592JPx.A0H();
                LoggingContext loggingContext = (LoggingContext) this.A02;
                List A1J = AbstractC166987dD.A1J(this.A01);
                String str2 = this.A04;
                boolean A0K = C14360o3.A0K(str2, "PRE_WARM");
                C70073W1q c70073W1q = (C70073W1q) this.A03;
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                if (c70073W1q != null) {
                    C70199WGm.A08(c70073W1q, A1I);
                }
                Wap.A03(AbstractC31171DnF.A0A(AbstractC166987dD.A0f((C18920wW) A0H.A00, "client_load_ecpcheckoutcomponent_success"), 60), loggingContext, new X5B(A1J, loggingContext, A1I, str2, "checkout", AbstractC25230BEn.A07(0, loggingContext, str2), A0K));
                return C0eB.A00;
            case 2:
                Wap A0H2 = AbstractC43592JPx.A0H();
                UFX ufx = (UFX) this.A03;
                LoggingContext loggingContext2 = ufx.A1P;
                PaymentMethod paymentMethod = (PaymentMethod) this.A02;
                long parseLong = Long.parseLong(paymentMethod.AtA());
                EnumC72407Xcu AtB = paymentMethod.AtB();
                List A1J2 = AbstractC166987dD.A1J(((ECPPaymentResponseParams) this.A01).A0B);
                List A04 = ufx.A1O.A04();
                UFS ufs = ufx.A1Q;
                C70073W1q A05 = ufs.A05();
                LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                C70199WGm.A08(A05, A1I2);
                A0H2.A0E(AtB, loggingContext2, this.A04, A04, A1J2, A1I2, parseLong);
                if (!ufx.A0q()) {
                    Wap A0H3 = AbstractC43592JPx.A0H();
                    C70073W1q A052 = ufs.A05();
                    LinkedHashMap A1I3 = AbstractC166987dD.A1I();
                    C70199WGm.A08(A052, A1I3);
                    A0H3.A0f(loggingContext2, "payment_success", A1I3);
                }
                return C0eB.A00;
            case 3:
                C73453YDw c73453YDw = (C73453YDw) this.A01;
                String moduleName = ((InterfaceC11380iw) this.A02).getModuleName();
                String str3 = this.A04;
                InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) this.A03;
                c73453YDw.D86(moduleName, str3, str3, null, null, null, null, ((C45101JxV) interfaceC74963Ym.getValue()).A07, ((C45101JxV) interfaceC74963Ym.getValue()).A0B, ((C45101JxV) interfaceC74963Ym.getValue()).A09, ((C45101JxV) interfaceC74963Ym.getValue()).A0E, false, false);
                return C0eB.A00;
            case 4:
                String A0E = ((C44463JlV) this.A03).A0E(AbstractC25231BEo.A0E((InterfaceC74953Yl) this.A02));
                if (A0E != null) {
                    ((InterfaceC16620sF) this.A01).invoke(this.A04, A0E);
                }
                return C0eB.A00;
            case 5:
                Activity activity = (Activity) this.A01;
                UserSession userSession2 = (UserSession) this.A03;
                String str4 = this.A04;
                C45174JzF c45174JzF = (C45174JzF) this.A02;
                AbstractC28037CXl.A00(activity, userSession2, c45174JzF.A02, Long.valueOf(c45174JzF.A00), str4, c45174JzF.A04);
                return C0eB.A00;
            case 6:
                LB6.A01((Activity) this.A02, (Context) this.A01, (UserSession) this.A03, this.A04);
                return C0eB.A00;
            case 7:
                return new C56133Ovt((FragmentActivity) this.A01, (C51740MtP) this.A02, (UserSession) this.A03, this.A04);
            case 8:
                C27961Xa A002 = AbstractC54912fq.A00();
                FragmentActivity fragmentActivity = (FragmentActivity) this.A02;
                InterfaceC11380iw A08 = C6BQ.A08((C6FQ) this.A01);
                UserSession userSession3 = (UserSession) this.A03;
                String str5 = this.A04;
                Locale locale = Locale.US;
                C14360o3.A08(locale);
                QuickPromotionSlot valueOf = QuickPromotionSlot.valueOf(AbstractC166997dE.A10(locale, str5));
                AbstractC54912fq.A00();
                ?? obj = new Object();
                obj.A02 = new GCO(fragmentActivity, userSession3, str5);
                return A002.A01(fragmentActivity, A08, userSession3, obj.A00(), valueOf);
            case 9:
                String str6 = this.A04;
                C43761JWz c43761JWz = new C43761JWz(str6, AbstractC25225BEi.A16(this.A01));
                C43760JWy c43760JWy = new C43760JWy(str6, AbstractC25225BEi.A16(this.A02));
                BRG brg = (BRG) this.A03;
                UserSession userSession4 = brg.A02;
                AbstractC25651Mw.A00(userSession4).A01(c43761JWz, C3MC.class);
                AbstractC25651Mw.A00(userSession4).A01(c43760JWy, C42281xI.class);
                me5 = new ME5(11, c43760JWy, brg, c43761JWz);
                return new C79353gg(me5);
            case 10:
                Badge badge = (Badge) this.A01;
                if (badge instanceof Badge.AchievementBadge) {
                    Achievement achievement = ((Badge.AchievementBadge) badge).A01;
                    C28458ChA c28458ChA = C28458ChA.A00;
                    UserSession userSession5 = (UserSession) this.A03;
                    c28458ChA.A08(userSession5, "all_earned_achievements_list", "achievement_cell", this.A04, null, AbstractC166987dD.A1J(String.valueOf(achievement.A01)), AbstractC166987dD.A1J(achievement), null, null);
                    F1A.A00().A01((FragmentActivity) this.A02, achievement, userSession5, null, null, null, true, false);
                } else if (badge instanceof Badge.ChallengeBadge) {
                    Challenge challenge = ((Badge.ChallengeBadge) badge).A01;
                    C28458ChA c28458ChA2 = C28458ChA.A00;
                    UserSession userSession6 = (UserSession) this.A03;
                    String str7 = this.A04;
                    c28458ChA2.A05(userSession6, null, "all_earned_achievements_list", "challenges_cell", str7, null, null, null, AbstractC43594JPz.A10(challenge.A02), null, AbstractC166987dD.A1J(challenge), null, null);
                    F1A.A00().A02((FragmentActivity) this.A02, challenge, userSession6, null, str7);
                } else {
                    if (badge instanceof Badge.ChallengeTieredBadge) {
                        Badge.ChallengeTieredBadge challengeTieredBadge = (Badge.ChallengeTieredBadge) badge;
                        A00 = F1A.A00().A00().A01(challengeTieredBadge.A03, challengeTieredBadge.A04);
                    } else if (badge instanceof Badge.AchievementTieredBadge) {
                        Badge.AchievementTieredBadge achievementTieredBadge = (Badge.AchievementTieredBadge) badge;
                        A00 = F1A.A00().A00().A00(achievementTieredBadge.A03, this.A04, achievementTieredBadge.A04, achievementTieredBadge.A05);
                    } else {
                        throw B4Z.A00();
                    }
                    AbstractC25229BEm.A18(A00, AbstractC25225BEi.A0r((FragmentActivity) this.A02, (AbstractC12990ll) this.A03));
                }
                return C0eB.A00;
            case 11:
                AbstractC167007dF.A0x(((C47701L4i) this.A02).A06);
                AbstractC166987dD.A1Y(this.A01);
                C161287Kn c161287Kn = ((AbstractC161267Kl) this.A03).A01;
                String str8 = this.A04;
                C14360o3.A0B(str8, 0);
                c161287Kn.A00.remove(str8);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                EN8 en8 = (EN8) this.A03;
                AbstractC121115e3.A00(AbstractC166987dD.A0r(en8.A0N)).A05(AbstractC31171DnF.A0g(this.A02));
                EN8.A00(en8.getActivity(), en8, (ThreadFetchReason) this.A01, this.A04);
                AbstractC31179DnN.A0x(en8);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c39f = (C39F) this.A03;
                NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = (NotesPogThoughtBubbleUiState) this.A02;
                C39F.A01(AbstractC25533BQv.A00(notesPogThoughtBubbleUiState), notesPogThoughtBubbleUiState, c39f, (Integer) this.A01, this.A04);
                return C0eB.A00;
            case 14:
                C39F c39f2 = (C39F) this.A03;
                C39F.A02(c39f2, new ME8(this.A01, c39f2, this.A02, this.A04, 13));
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                C3DO c3do = C3DN.A00;
                c39f = (C39F) this.A03;
                AbstractC167017dG.A0y(c39f.A00, c3do);
                NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = (NotesPogThoughtBubbleUiState) this.A02;
                C39F.A01(AbstractC25533BQv.A00(notesPogThoughtBubbleUiState2), notesPogThoughtBubbleUiState2, c39f, (Integer) this.A01, this.A04);
                return C0eB.A00;
            case 16:
                C76833cV.A05((C6WQ) this.A02);
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 A0K2 = AbstractC31171DnF.A0K();
                A0K2.A0D = this.A04;
                C38321qM c38321qM = (C38321qM) this.A01;
                A0K2.A09 = c38321qM.A1S();
                A0K2.A03();
                AbstractC31178DnM.A1N(c41451vu, A0K2);
                UserSession userSession7 = (UserSession) this.A03;
                User A2E = c38321qM.A2E(userSession7);
                if (A2E != null) {
                    AbstractC25651Mw.A00(userSession7).E4s(new C154976xm(EnumC125765mR.A04, A2E.getId()));
                }
                AbstractC25651Mw.A00(userSession7).E4s(new C154976xm(EnumC125765mR.A04, userSession7.userId));
                return C0eB.A00;
            case 17:
                String str9 = this.A04;
                C55549Olj c55549Olj = (C55549Olj) this.A02;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
                Object obj2 = this.A01;
                return new MT3(C50542MSv.A00(c55549Olj, (List) interfaceC16660sJ.invoke(obj2), new C57259Pbh(str9, obj2, 9), 4), str9);
            case 18:
                C52167N6w c52167N6w = (C52167N6w) this.A03;
                ReelStore A042 = C1OU.A04(c52167N6w.A03());
                String str10 = this.A04;
                Reel reel = (Reel) this.A02;
                Reel A0F = A042.A0F(new C32061E6n(str10, false, AbstractC167017dG.A0K(reel.A0i)));
                if (A0F == null) {
                    A0F = reel;
                }
                C52167N6w.A00(A0F, c52167N6w, 0, false);
                C9GR.A07((Context) this.A01, 2131963590);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                HZ4 hz4 = (HZ4) this.A03;
                HZ4.A03(hz4);
                C38A c38a = hz4.A03;
                String valueOf2 = String.valueOf(((C38819H7k) this.A02).A02);
                FeaturedProductPermissionStatus featuredProductPermissionStatus = (FeaturedProductPermissionStatus) this.A01;
                JI6 ji6 = hz4.A04;
                String str11 = JQ0.A0a(ji6).A0H;
                String A0d = AbstractC37302Gc3.A0d(JQ0.A0a(ji6));
                C14360o3.A0A(A0d);
                c38a.A02(featuredProductPermissionStatus, valueOf2, str11, A0d, this.A04);
                return C0eB.A00;
            case 20:
            case 21:
            default:
                AnonymousClass389.A02((AnonymousClass389) this.A03);
                InterfaceC43546JLg interfaceC43546JLg = (InterfaceC43546JLg) this.A01;
                JLH BcS = interfaceC43546JLg.BcS();
                if (BcS != null) {
                    l = BcS.BF7();
                } else {
                    l = null;
                }
                String.valueOf(l);
                ProductDetailsProductItemDictIntf Bgl = interfaceC43546JLg.Bgl();
                if (Bgl != null) {
                    Bgl.getProductId();
                }
                ProductDetailsProductItemDictIntf Bgl2 = interfaceC43546JLg.Bgl();
                if (Bgl2 != null && (BSW = Bgl2.BSW()) != null) {
                    BSW.getId();
                }
                return C0eB.A00;
            case 22:
                userSession = (UserSession) this.A03;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "account_switch_add_account_sheet_registration_button_tapped");
                if (A0f.isSampled()) {
                    A0f.A7v("is_short_copy", AbstractC31173DnH.A0e(A0f, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A04, false));
                    A0f.Cht();
                }
                new Object().A01(userSession, C05F.A00);
                String str12 = this.A04;
                if ("settings".equals(str12)) {
                    CallerContext callerContext = C35792FrU.A00;
                    if (AbstractC31177DnL.A1U(AbstractC25225BEi.A0j(userSession, 0), userSession, 36310684312535279L)) {
                        AbstractC155756z4.A00();
                        Activity activity2 = (Activity) this.A01;
                        C14360o3.A0B(activity2, 0);
                        Intent intent = new Intent(activity2, (Class<?>) BusinessConversionActivity.class);
                        Bundle A053 = AbstractC31178DnM.A05(userSession);
                        A053.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "add_account_bottom_sheet");
                        A053.putBoolean("show_personal_account_selector", true);
                        A053.putInt("business_account_flow", 7);
                        intent.putExtras(A053);
                        C12260kU.A08(activity2, intent, 11);
                        c1q9 = C1Q9.A1P;
                        AbstractC31173DnH.A1S(c1q9.A02(userSession).A04(), userSession);
                        return C0eB.A00;
                    }
                }
                C06090Tz c06090Tz = C06090Tz.A05;
                C14360o3.A08(c06090Tz);
                boolean A06 = C1AD.A06(c06090Tz, 18312185772062698L);
                InterfaceC02900Bo interfaceC02900Bo = (InterfaceC02900Bo) this.A02;
                Activity activity3 = (Activity) this.A01;
                Bundle bundle = interfaceC02900Bo.AEZ(activity3, null, userSession, str12, !A06, A06).A00;
                AbstractC167017dG.A1P(activity3, userSession);
                Application application = activity3.getApplication();
                C14360o3.A07(application);
                AbstractC52232aO.A00(application);
                C36700GFv c36700GFv = FE9.A00;
                if (!C36700GFv.A01() && !A06 && AbstractC34029F0i.A00()) {
                    C3DN.A00.A00(activity3);
                    C14360o3.A0C(activity3, MSV.A00(0));
                    c36700GFv.A02(bundle, (FragmentActivity) activity3, userSession, "xav_cds_switcher");
                } else {
                    AbstractC35178FfV.A00();
                    AbstractC34230F8c.A00(activity3, bundle, userSession, false);
                }
                c1q9 = C1Q9.A1P;
                AbstractC31173DnH.A1S(c1q9.A02(userSession).A04(), userSession);
                return C0eB.A00;
            case 23:
                Activity activity4 = (Activity) this.A01;
                userSession = (UserSession) this.A03;
                AbstractC167007dF.A1D(activity4, 1, userSession);
                Application application2 = activity4.getApplication();
                C14360o3.A07(application2);
                AbstractC52232aO.A00(application2);
                if (C1AD.A06(C06090Tz.A05, 18306786998101190L)) {
                    String str13 = userSession.userId;
                    Intent intent2 = new Intent();
                    intent2.putExtra("active_logged_in_user_id", str13);
                    intent2.putExtra("is_logged_in_switcher", true);
                    intent2.putExtra("last_logged_in_ig_access_token", userSession.token);
                    intent2.setClassName(activity4, this.A04);
                    C12260kU.A0C(activity4, intent2);
                    activity4.overridePendingTransition(R.anim.cds_slide_in_bottom, R.anim.activity_slide_hold);
                } else {
                    AbstractC35178FfV.A00();
                    AbstractC34230F8c.A00(activity4, (Bundle) this.A02, userSession, false);
                }
                c1q9 = C1Q9.A1Q;
                AbstractC31173DnH.A1S(c1q9.A02(userSession).A04(), userSession);
                return C0eB.A00;
            case 24:
                ((C25448BNn) this.A03).A07.E0n((C37644Ghd) this.A01, (C38321qM) this.A02, this.A04);
                return C0eB.A00;
            case 25:
                C26053Bfg c26053Bfg = (C26053Bfg) this.A01;
                if (c26053Bfg != null) {
                    C26587Bok c26587Bok = (C26587Bok) this.A03;
                    C2Z0 c2z0 = (C2Z0) this.A02;
                    String str14 = this.A04;
                    User user = (User) c26053Bfg.A04;
                    UserSession userSession8 = c26587Bok.A02;
                    if (!C14360o3.A0K(user, AbstractC166997dE.A0Y(userSession8))) {
                        C57 c57 = c26587Bok.A03;
                        Context context = c2z0.A00.A0C;
                        C14360o3.A07(context);
                        CLP.A00(context, c26053Bfg, userSession8, (ImageUrl) AbstractC001800i.A0J((List) c26053Bfg.A02), c57, str14, user.getUsername(), c26053Bfg.A05, c26587Bok.A00);
                    }
                }
                return C0eB.A00;
            case 26:
                C26587Bok c26587Bok2 = (C26587Bok) this.A03;
                OJ6 A003 = AbstractC54315NzZ.A00(c26587Bok2.A02);
                Context A004 = AbstractC77363dM.A00((C2Z0) this.A01);
                C38321qM c38321qM2 = c26587Bok2.A03.A06.A02;
                if (c38321qM2 != null) {
                    str = c38321qM2.A38();
                } else {
                    str = null;
                }
                A003.A00(A004, str, this.A04, c26587Bok2.A00);
                C26587Bok.A05((C76223bS) this.A02, c26587Bok2);
                return C0eB.A00;
        }
    }
}
