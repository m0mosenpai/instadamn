package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.config.MediaKitConfig;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Fv4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36006Fv4 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "UserOptionsOverflowHelper";
    public final Context A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final AbstractC018607g A03;
    public final AbstractC59962oe A04;
    public final InterfaceC11380iw A05;
    public final C18920wW A06;
    public final UserSession A07;
    public final AnonymousClass708 A08;
    public final C6WQ A09;
    public final GZU A0A;
    public final FR7 A0B;
    public final User A0C;
    public final InterfaceC37219GaU A0D;
    public final C53W A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final Resources A0I;
    public final InterfaceC38371qR A0J;
    public final UserDetailTabController A0K;
    public final MRA A0L;
    public final String A0M;
    public final String A0N;
    public final List A0O;

    public final void A04(EnumC33417Epo enumC33417Epo) {
        AnonymousClass741 BiC;
        C66277U6x A01;
        Context context;
        IgBloksScreenConfig A0C;
        switch (AbstractC25227BEk.A05(enumC33417Epo, 0)) {
            case 0:
                C28261Yl c28261Yl = C28261Yl.A00;
                Context context2 = this.A00;
                UserSession userSession = this.A07;
                FragmentActivity fragmentActivity = this.A02;
                String moduleName = this.A05.getModuleName();
                String str = this.A0F;
                User user = this.A0C;
                c28261Yl.A00(context2, fragmentActivity, userSession, user, this.A0D, moduleName, str, user.getUsername());
                return;
            case 1:
                this.A0B.A01(this.A0A, this.A0C, "profile", true, false);
                return;
            case 2:
                A01(this, "copy_profile_url");
                AbstractC31510Dsu.A04(this.A02, null, this.A04.mFragmentManager, this.A03, this, this.A07, this.A0C, null, "profile_action_sheet", this.A0G, this.A0H, null, false);
                return;
            case 3:
                User user2 = this.A0C;
                String username = user2.getUsername();
                AbstractC59962oe abstractC59962oe = this.A04;
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                AbstractC10360h2 parentFragmentManager = abstractC59962oe.getParentFragmentManager();
                C08790ch A00 = AbstractC018607g.A00(abstractC59962oe);
                UserSession userSession2 = this.A07;
                String A10 = AbstractC166997dE.A10(Locale.ROOT, AnonymousClass001.A0D(username, '@'));
                String str2 = this.A0G;
                String str3 = this.A0H;
                boolean booleanValue = AbstractC166997dE.A0c(C06090Tz.A05, userSession2, 36314837549779812L).booleanValue();
                AbstractC31510Dsu.A0A(requireActivity, parentFragmentManager, A00, new C35874Fso(userSession2, requireActivity, user2, abstractC59962oe, A10, 0, booleanValue), abstractC59962oe, userSession2, user2, AbstractC31172DnG.A0s(booleanValue), null, "profile_action_sheet", "qr_code", str2, str3, false);
                return;
            case 4:
                AnonymousClass708 anonymousClass708 = this.A08;
                if (anonymousClass708 != null && (BiC = anonymousClass708.BiC()) != null) {
                    BiC.DSz("more_menu", false);
                    return;
                }
                return;
            case 5:
                A01(this, "tap_share_this_profile");
                C19280xC A002 = C19280xC.A00(this.A04, AbstractC111324zv.A00(109));
                User user3 = this.A0C;
                A002.A0C(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user3.getId());
                A002.A0C("nav_chain", AbstractC25225BEi.A14());
                UserSession userSession3 = this.A07;
                AbstractC31173DnH.A1S(A002, userSession3);
                C34726FRp A07 = C28531Zo.A04.A02.A07(this.A05, userSession3, C2EY.A1Q);
                A07.A06(user3.getId());
                if (user3.A1u()) {
                    A07.A07.putSerializable("DirectShareSheetConstants.story_reshare_entry_point", C22P.A0b);
                }
                DirectShareSheetFragment A003 = A07.A00();
                C3DN A012 = C3DN.A00.A01(this.A01);
                if (A012 != null) {
                    A012.A0K(A003);
                    return;
                }
                return;
            case 6:
                UserSession userSession4 = this.A07;
                String id = this.A0C.getId();
                FHG fhg = new FHG(this);
                C0fJ.A00(fhg.A00.A09);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession4);
                A0c.A0L("direct_v2/whitelist/%s/", id);
                C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
                A0Q.A00 = new C32223EDw(userSession4, fhg, id);
                C1GJ.A03(A0Q);
                return;
            case 7:
                A02(this, false);
                return;
            case 8:
                Integer num = C05F.A01;
                UserSession userSession5 = this.A07;
                IT8.A01(this, userSession5, num);
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("shared_user_id", this.A0C.getId());
                A01 = C66277U6x.A01("com.bloks.www.ig.bloks.your_shared_activity.entry", A1G);
                context = this.A01;
                A0C = AbstractC31171DnF.A0C(userSession5);
                A0C.A0U = AbstractC25227BEk.A0v(this.A04, 2131973810);
                break;
            case 9:
                A01(this, "remove_follower");
                C18920wW c18920wW = this.A06;
                User user4 = this.A0C;
                AbstractC31178DnM.A1L(c18920wW, "remove_follower_dialog_impression", user4.getId());
                Context context3 = this.A00;
                FCD.A00(this.A02, context3, this.A04, this.A05, this.A07, new GIT(this, 1), user4);
                return;
            case 10:
                User user5 = this.A0C;
                String id2 = user5.getId();
                boolean isRestricted = user5.isRestricted();
                C28151Xt c28151Xt = C28151Xt.A02;
                if (c28151Xt != null) {
                    C18920wW c18920wW2 = this.A06;
                    if (isRestricted) {
                        C75R.A0E(c18920wW2, "click", "unrestrict_option", id2);
                        c28151Xt.A02(this.A02, this.A03, this.A07, new GJ5(this, id2), id2, this.A05.getModuleName());
                        return;
                    }
                    C75R.A0E(c18920wW2, "click", "restrict_option", id2);
                    C35015Fbo A004 = c28151Xt.A00();
                    UserSession userSession6 = this.A07;
                    Context context4 = this.A00;
                    String moduleName2 = this.A05.getModuleName();
                    A004.A00(context4, null, null, c18920wW2, userSession6, user5, new GJE(this), EnumC33371Ep4.A0E, new GJI(this, id2), moduleName2, this.A0F);
                    return;
                }
                return;
            case 11:
                A01(this, "about_this_account");
                HashMap A1G2 = AbstractC166987dD.A1G();
                A1G2.put("target_user_id", this.A0C.getId());
                A1G2.put("referer_type", "ProfileMore");
                A01 = C66277U6x.A01(MSV.A00(20), A1G2);
                context = this.A02;
                A0C = AbstractC31171DnF.A0C(this.A07);
                AbstractC31171DnF.A10(this.A00, A0C, 2131952061);
                A0C.A0R = "account_transparency_bloks";
                A0C.A0P = C05F.A01;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(this, "manage_notifications");
                AbstractC31364DqT.A03().A01(this.A02, this.A07, null, this.A0C, null);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                JSONObject A0q = AbstractC31171DnF.A0q();
                try {
                    User user6 = this.A0C;
                    A0q.put("business_owner_igid", user6.getId());
                    A0q.put(CacheBehaviorLogger.SOURCE, user6.A03.BpT());
                    A0q.put("delivery_method", "profile");
                } catch (JSONException unused) {
                    C0w9.A03("UserOptionDialogClickListener.handleLeaveAReview", "JSON error");
                }
                String A19 = AbstractC166987dD.A19(A0q);
                C140966Yy A0r = AbstractC25225BEi.A0r(this.A02, this.A07);
                A0r.A0D(IgFragmentFactoryImpl.A00().A02(AbstractC111324zv.A00(1114), A19));
                A0r.A04();
                return;
            case 14:
                Map A0n = AbstractC167007dF.A0n(AbstractC58317Pt9.A00(131), this.A0C.getId());
                AbstractC59962oe abstractC59962oe2 = this.A04;
                AbstractC192798gL A05 = C192108fB.A05(this.A07, "com.instagram.branded_content.wishlists.creator_lists_selector_bottom_sheet", A0n);
                C32392EOt.A00(A05, this, 10);
                abstractC59962oe2.schedule(A05);
                return;
            case Process.SIGTERM /* 15 */:
                User user7 = this.A0C;
                if (user7.A03.AwJ() != null) {
                    C1ZK.A00().E2l(this.A02, this.A07, new MediaKitConfig(MediaKitEntryPoint.A07, user7.A03.AwJ(), null));
                    return;
                }
                return;
            default:
                throw B4Z.A00();
        }
        A01.A04(context, A0C);
    }

    public static final void A00(C36006Fv4 c36006Fv4) {
        if (C1VN.A00 != null) {
            AbstractC31282Dp4.A00().A00(c36006Fv4.A02, c36006Fv4.A07, "985297752732769", AbstractC47112Ks7.A00(c36006Fv4.A0C.getId()));
        }
    }

    public static final void A01(C36006Fv4 c36006Fv4, String str) {
        UserSession userSession = c36006Fv4.A07;
        AbstractC59962oe abstractC59962oe = c36006Fv4.A04;
        User user = c36006Fv4.A0C;
        C1571673v.A06(abstractC59962oe, userSession, C1571673v.A01(user.B7L()), str, user.getId(), "more_menu");
    }

    public static final void A02(C36006Fv4 c36006Fv4, boolean z) {
        String str;
        UserSession userSession = c36006Fv4.A07;
        WEz A01 = AbstractC69993VzD.A01(c36006Fv4.A02, c36006Fv4.A05, userSession, EnumC65855TvH.A1A, VG2.A0o, c36006Fv4.A0C.getId());
        A01.A08(c36006Fv4.A0L);
        A01.A09("shopping_session_id", c36006Fv4.A0N);
        if (z) {
            str = "profile_block";
        } else {
            str = "";
        }
        A01.A09("nua_action", str);
        InterfaceC38371qR interfaceC38371qR = c36006Fv4.A0J;
        String str2 = null;
        if (interfaceC38371qR != null && interfaceC38371qR.BQN() != null) {
            str2 = interfaceC38371qR.BQN().getId();
        }
        A01.A09("profile_media_attribution", str2);
        WEz.A00(null, A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a2, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36326726015662134L) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36326726015662134L) != false) goto L86;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:124:0x017d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A03() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36006Fv4.A03():java.util.List");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0M;
    }

    public C36006Fv4(Context context, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, InterfaceC38371qR interfaceC38371qR, AnonymousClass708 anonymousClass708, UserDetailTabController userDetailTabController, User user, C53W c53w, String str, String str2, String str3, String str4) {
        EnumC33417Epo[] enumC33417EpoArr;
        EnumC33417Epo enumC33417Epo;
        EnumC33417Epo enumC33417Epo2;
        C14360o3.A0B(context, 2);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(user, 5);
        C14360o3.A0B(abstractC018607g, 10);
        C14360o3.A0B(c18920wW, 11);
        this.A02 = fragmentActivity;
        this.A00 = context;
        this.A04 = abstractC59962oe;
        this.A07 = userSession;
        this.A0C = user;
        this.A0K = userDetailTabController;
        this.A0E = c53w;
        this.A05 = interfaceC11380iw;
        this.A08 = anonymousClass708;
        this.A03 = abstractC018607g;
        this.A06 = c18920wW;
        this.A0N = str;
        this.A0J = interfaceC38371qR;
        this.A0F = str2;
        this.A0G = str3;
        this.A0H = str4;
        Context requireContext = abstractC59962oe.requireContext();
        this.A01 = requireContext;
        this.A0I = AbstractC31177DnL.A09(abstractC59962oe);
        this.A0B = new FR7(abstractC59962oe, userSession);
        C6WQ c6wq = new C6WQ(requireContext, true);
        AbstractC31176DnK.A13(c6wq.getContext(), c6wq);
        this.A09 = c6wq;
        this.A0D = new C36765GIo(this, 2);
        this.A0A = new GIR(this);
        this.A0L = new C33312Eo7(this, 8);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36326726015662134L)) {
            enumC33417EpoArr = new EnumC33417Epo[16];
            enumC33417EpoArr[0] = EnumC33417Epo.A0A;
            enumC33417EpoArr[1] = EnumC33417Epo.A07;
            enumC33417EpoArr[2] = EnumC33417Epo.A0I;
            enumC33417EpoArr[3] = EnumC33417Epo.A09;
            enumC33417EpoArr[4] = EnumC33417Epo.A08;
            enumC33417EpoArr[5] = EnumC33417Epo.A04;
            enumC33417EpoArr[6] = EnumC33417Epo.A0H;
            enumC33417EpoArr[7] = EnumC33417Epo.A0C;
            enumC33417EpoArr[8] = EnumC33417Epo.A0B;
            enumC33417EpoArr[9] = EnumC33417Epo.A0J;
            enumC33417EpoArr[10] = EnumC33417Epo.A0G;
            enumC33417EpoArr[11] = EnumC33417Epo.A06;
            enumC33417EpoArr[12] = EnumC33417Epo.A0D;
            enumC33417EpoArr[13] = EnumC33417Epo.A0F;
            enumC33417EpoArr[14] = EnumC33417Epo.A05;
            enumC33417Epo2 = EnumC33417Epo.A0E;
        } else {
            enumC33417EpoArr = new EnumC33417Epo[16];
            if (C18U.A06(c06090Tz, userSession, 36324569941815538L)) {
                enumC33417EpoArr[0] = EnumC33417Epo.A0F;
                enumC33417EpoArr[1] = EnumC33417Epo.A05;
                enumC33417EpoArr[2] = EnumC33417Epo.A0E;
                enumC33417EpoArr[3] = EnumC33417Epo.A04;
                enumC33417EpoArr[4] = EnumC33417Epo.A0H;
                enumC33417EpoArr[5] = EnumC33417Epo.A0B;
                enumC33417EpoArr[6] = EnumC33417Epo.A06;
                enumC33417EpoArr[7] = EnumC33417Epo.A0D;
                enumC33417EpoArr[8] = EnumC33417Epo.A07;
                enumC33417EpoArr[9] = EnumC33417Epo.A0A;
                enumC33417EpoArr[10] = EnumC33417Epo.A0I;
                enumC33417Epo = EnumC33417Epo.A09;
            } else {
                enumC33417EpoArr[0] = EnumC33417Epo.A0E;
                enumC33417EpoArr[1] = EnumC33417Epo.A05;
                enumC33417EpoArr[2] = EnumC33417Epo.A04;
                enumC33417EpoArr[3] = EnumC33417Epo.A0B;
                enumC33417EpoArr[4] = EnumC33417Epo.A0F;
                enumC33417EpoArr[5] = EnumC33417Epo.A0H;
                enumC33417EpoArr[6] = EnumC33417Epo.A06;
                enumC33417EpoArr[7] = EnumC33417Epo.A0D;
                enumC33417EpoArr[8] = EnumC33417Epo.A07;
                enumC33417EpoArr[9] = EnumC33417Epo.A0I;
                enumC33417EpoArr[10] = EnumC33417Epo.A09;
                enumC33417Epo = EnumC33417Epo.A0A;
            }
            enumC33417EpoArr[11] = enumC33417Epo;
            enumC33417EpoArr[12] = EnumC33417Epo.A08;
            enumC33417EpoArr[13] = EnumC33417Epo.A0C;
            enumC33417EpoArr[14] = EnumC33417Epo.A0J;
            enumC33417Epo2 = EnumC33417Epo.A0G;
        }
        enumC33417EpoArr[15] = enumC33417Epo2;
        this.A0O = AbstractC16960so.A1Q(enumC33417EpoArr);
        this.A0M = "UserOptionsDialog";
    }
}
