package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController;
import com.instagram.profile.edit.fragment.CompleteYourProfileFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import go.Seq;
import java.util.List;

/* renamed from: X.EUp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32539EUp extends C1P1 {
    public final int A00;
    public final Object A01;

    public C32539EUp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AbstractC59962oe abstractC59962oe, C1ON c1on, int i) {
        c1on.A00 = new C32539EUp(abstractC59962oe, i);
        abstractC59962oe.schedule(c1on);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int A032;
        int i2;
        String str;
        String str2;
        String str3;
        String string;
        C40781ul c40781ul;
        List list;
        switch (this.A00) {
            case 0:
                A032 = C0f9.A03(1360964180);
                C14360o3.A0B(abstractC115105If, 0);
                C32267EJc c32267EJc = (C32267EJc) this.A01;
                if (c32267EJc.isResumed()) {
                    AbstractC35254Fgn.A07(c32267EJc, abstractC115105If);
                    InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
                    if (A0L == null || (str = A0L.getErrorMessage()) == null) {
                        str = "unknown";
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, AbstractC25230BEn.A0k(c32267EJc.A0A, 0)), "instagram_two_fac_setup_verification_failure");
                    A0f.AAP("reason", str);
                    AbstractC31181DnP.A0c(A0f);
                    A0f.Cht();
                }
                i2 = -1575637954;
                C0f9.A0A(i2, A032);
                return;
            case 1:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 186319987);
                Fragment fragment = (Fragment) this.A01;
                if (fragment.isResumed()) {
                    AbstractC35254Fgn.A07(fragment, abstractC115105If);
                }
                i2 = -1049551444;
                C0f9.A0A(i2, A032);
                return;
            case 2:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -1313904707);
                Fragment fragment2 = (Fragment) this.A01;
                if (fragment2.isResumed()) {
                    AbstractC35254Fgn.A07(fragment2, abstractC115105If);
                }
                i2 = -97300092;
                C0f9.A0A(i2, A032);
                return;
            case 3:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -273077491);
                C32267EJc c32267EJc2 = (C32267EJc) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c32267EJc2.A0A);
                ECV ecv = (ECV) abstractC115105If.A00();
                if (ecv != null) {
                    str2 = ecv.A00;
                } else {
                    str2 = "unknown";
                }
                AbstractC35075Fcm.A01(A0r, str2);
                AbstractC35254Fgn.A07(c32267EJc2, abstractC115105If);
                i2 = -878900477;
                C0f9.A0A(i2, A032);
                return;
            case 4:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 371483256);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i2 = -285189075;
                C0f9.A0A(i2, A032);
                return;
            case 5:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -1531956734);
                super.onFail(abstractC115105If);
                InterfaceC40821up A0L2 = AbstractC31172DnG.A0L(abstractC115105If);
                if (A0L2 != null) {
                    Fragment fragment3 = (Fragment) this.A01;
                    if (A0L2.getErrorMessage() != null) {
                        Context requireContext = fragment3.requireContext();
                        String errorTitle = A0L2.getErrorTitle();
                        if (errorTitle != null && errorTitle.length() != 0) {
                            string = A0L2.getErrorTitle();
                        } else {
                            string = fragment3.getString(2131961880);
                        }
                        AbstractC35254Fgn.A06(requireContext, A0L2.getErrorMessage(), string);
                    } else {
                        AbstractC35254Fgn.A01(fragment3.requireContext());
                    }
                }
                EJU eju = (EJU) this.A01;
                if (eju.mView != null) {
                    ViewStub viewStub = eju.A01;
                    if (viewStub == null) {
                        str3 = "loadingViewStub";
                        C14360o3.A0F(str3);
                        throw C00O.createAndThrow();
                    }
                    viewStub.setVisibility(8);
                }
                i2 = -1584229311;
                C0f9.A0A(i2, A032);
                return;
            case 6:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1861637464);
                C32262EIw c32262EIw = (C32262EIw) this.A01;
                AbstractC35254Fgn.A07(c32262EIw, abstractC115105If);
                C1Q9 c1q9 = C1Q9.A21;
                C07270a1 c07270a1 = c32262EIw.A06;
                if (c07270a1 != null) {
                    C35230FgN A02 = c1q9.A02(c07270a1);
                    EnumC31713DwI enumC31713DwI = c32262EIw.A0C;
                    if (enumC31713DwI != null) {
                        C35230FgN.A03(A02, enumC31713DwI);
                        i = -513102784;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    str3 = "twoFacStage";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                str3 = "loggedOutSession";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 7:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 528218765);
                C32262EIw c32262EIw2 = (C32262EIw) this.A01;
                AbstractC35254Fgn.A07(c32262EIw2, abstractC115105If);
                C1Q9 c1q92 = C1Q9.A21;
                C07270a1 c07270a12 = c32262EIw2.A06;
                if (c07270a12 != null) {
                    C35230FgN A022 = c1q92.A02(c07270a12);
                    EnumC31713DwI enumC31713DwI2 = c32262EIw2.A0C;
                    if (enumC31713DwI2 != null) {
                        C35230FgN.A03(A022, enumC31713DwI2);
                        i = -790905603;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    str3 = "twoFacStage";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                str3 = "loggedOutSession";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 8:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1877696744);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i = 419137492;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(-1932971974);
                C32262EIw c32262EIw3 = (C32262EIw) this.A01;
                Handler handler = c32262EIw3.A00;
                if (handler == null) {
                    str3 = "notificationStatusHandler";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                handler.removeCallbacks(c32262EIw3.A0U);
                if (c32262EIw3.isResumed()) {
                    AbstractC35254Fgn.A01(c32262EIw3.requireContext());
                }
                i = 262126558;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -2087354359);
                super.onFail(abstractC115105If);
                C33221El9.A00((C33221El9) this.A01);
                i = -1889580600;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 2097789816);
                super.onFail(abstractC115105If);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i = -307637320;
                C0f9.A0A(i, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1334259579);
                super.onFail(abstractC115105If);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i = -1581136332;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -729430793);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i = 506657166;
                C0f9.A0A(i, A03);
                return;
            case 14:
                A03 = C0f9.A03(-455032627);
                C31250DoY c31250DoY = (C31250DoY) this.A01;
                AbstractC63248Sg4.A01(c31250DoY.A06);
                C9GR.A0C(c31250DoY.A05, "launch_shared_memory_story_creation_failed");
                i = 2094436957;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-2113496710);
                C31250DoY c31250DoY2 = (C31250DoY) this.A01;
                AbstractC63248Sg4.A01(c31250DoY2.A06);
                C0w9.A03("DefaultNewsfeedRowDelegate", "failed to fetch media for clips edit metadata page");
                C9GR.A0E(c31250DoY2.A05, "navigate_to_clips_edit_failed");
                i = -388513249;
                C0f9.A0A(i, A03);
                return;
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 25:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 34:
            case 43:
            default:
                super.onFail(abstractC115105If);
                return;
            case 17:
                A03 = C0f9.A03(1595489723);
                BJK bjk = (BJK) this.A01;
                String A0m = AbstractC31173DnH.A0m(bjk.A02);
                if (abstractC115105If instanceof C115115Ig) {
                    Object A00 = abstractC115105If.A00();
                    A00.getClass();
                    String errorMessage = ((InterfaceC40821up) A00).getErrorMessage();
                    if (errorMessage != null && !TextUtils.isEmpty(errorMessage)) {
                        A0m = errorMessage;
                    }
                }
                bjk.A03.Clv(new Y7A(AbstractC111324zv.A00(1892), "activity_feed", null, A0m, null, null, null, null));
                i = -377903131;
                C0f9.A0A(i, A03);
                return;
            case 18:
                A03 = C0f9.A03(-53698205);
                C9GR.A0E(AbstractC31171DnF.A09(this.A01), "fetch_followers_failed");
                i = -113266319;
                C0f9.A0A(i, A03);
                return;
            case 20:
                A03 = C0f9.A03(-654607595);
                C35206Ffy.A02((C35206Ffy) this.A01);
                i = 377987269;
                C0f9.A0A(i, A03);
                return;
            case 21:
                A03 = C0f9.A03(805320880);
                C32257EIr c32257EIr = (C32257EIr) this.A01;
                UserSession userSession = (UserSession) c32257EIr.A01;
                String str4 = c32257EIr.A03;
                AbstractC167017dG.A1N(userSession, str4);
                C35241Fga.A03(userSession, "cp_upsell_config_fetch_failed", str4, null);
                C32257EIr.A01(c32257EIr, -1);
                i = -1674233925;
                C0f9.A0A(i, A03);
                return;
            case 22:
                A032 = C0f9.A03(-2093899864);
                C32257EIr c32257EIr2 = (C32257EIr) this.A01;
                UserSession userSession2 = (UserSession) c32257EIr2.A01;
                String str5 = c32257EIr2.A03;
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add((Object) VHf.NAME);
                if (!AbstractC81033jX.A03(c32257EIr2.A02.A01)) {
                    builder.add((Object) VHf.PROFILE_PHOTO);
                }
                ImmutableList build = builder.build();
                ImmutableList.Builder builder2 = ImmutableList.builder();
                EnumC33433Eq4 enumC33433Eq4 = EnumC33433Eq4.FACEBOOK;
                builder2.add((Object) enumC33433Eq4);
                if (!AbstractC81033jX.A03(c32257EIr2.A02.A01)) {
                    builder2.add((Object) enumC33433Eq4);
                }
                ImmutableList build2 = builder2.build();
                C14360o3.A0B(userSession2, 0);
                AbstractC167027dH.A13(str5, build, build2);
                C35241Fga.A03(userSession2, "cp_sync_error", str5, C35241Fga.A00(build, build2));
                Context context = c32257EIr2.getContext();
                if (context == null) {
                    C32257EIr.A01(c32257EIr2, -1);
                } else {
                    C193328hC A0I = AbstractC31171DnF.A0I(context);
                    A0I.A0A(2131975116);
                    if (c32257EIr2.A02.A0C) {
                        DialogInterfaceOnClickListenerC35454FkB.A02(A0I, c32257EIr2, 16, 2131975117);
                        A0I.A0H(DialogInterfaceOnClickListenerC35454FkB.A00(c32257EIr2, 17), 2131975115);
                    } else {
                        DialogInterfaceOnClickListenerC35454FkB.A02(A0I, c32257EIr2, 18, 2131975115);
                    }
                    AbstractC166987dD.A1W(A0I);
                }
                i2 = 629305781;
                C0f9.A0A(i2, A032);
                return;
            case 23:
                A03 = C0f9.A03(1618353666);
                super.onFail(abstractC115105If);
                C33001Ego c33001Ego = (C33001Ego) this.A01;
                AbstractC35259Fgt.A08(c33001Ego.A05, AbstractC31173DnH.A0m(c33001Ego));
                i = 1927974142;
                C0f9.A0A(i, A03);
                return;
            case 24:
                A03 = C0f9.A03(1293193684);
                ENv eNv = (ENv) this.A01;
                if (eNv.A00 != null) {
                    AbstractC35259Fgt.A08(eNv.A00, AbstractC31173DnH.A0m(eNv));
                }
                UserSession session = eNv.getSession();
                AbstractC167017dG.A1N(session, EnumC31713DwI.A08);
                double A01 = AbstractC31171DnF.A01();
                double A002 = AbstractC31171DnF.A00();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(session), "save_additional_phone_fail");
                AbstractC31179DnN.A18(A0f2, A01, A002);
                AbstractC31178DnM.A19(A0f2, "additional_contact");
                AbstractC35274Fh9.A09(A0f2, session);
                AbstractC35274Fh9.A04(A0f2);
                AbstractC31172DnG.A1O(A0f2);
                A0f2.Cht();
                i = -1557761512;
                C0f9.A0A(i, A03);
                return;
            case 26:
                A032 = C0f9.A03(1988750214);
                Object A003 = abstractC115105If.A00();
                if (A003 != null) {
                    C40781ul c40781ul2 = (C40781ul) A003;
                    if (!TextUtils.isEmpty(c40781ul2.getErrorMessage())) {
                        ((EKF) this.A01).Eks(c40781ul2.getErrorMessage(), C05F.A0Y);
                        i2 = -1486822621;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                EKF.A03((EKF) this.A01);
                i2 = -1486822621;
                C0f9.A0A(i2, A032);
                return;
            case 27:
                A03 = C0f9.A03(320415541);
                C193328hC A0O = AbstractC31175DnJ.A0O((Fragment) this.A01);
                A0O.A09(2131968430);
                AbstractC31176DnK.A1W(A0O);
                i = -671941459;
                C0f9.A0A(i, A03);
                return;
            case 28:
                A03 = C0f9.A03(1356773274);
                C32260EIu c32260EIu = (C32260EIu) this.A01;
                c32260EIu.A03(false);
                C9GR.A07(c32260EIu.getContext(), 2131976159);
                i = 1454433095;
                C0f9.A0A(i, A03);
                return;
            case 30:
                A03 = C0f9.A03(-1527560728);
                C32269EJe c32269EJe = (C32269EJe) this.A01;
                c32269EJe.A02(false);
                C9GR.A07(c32269EJe.getContext(), 2131976159);
                i = 1789574264;
                C0f9.A0A(i, A03);
                return;
            case 31:
                A03 = C0f9.A03(-1197996876);
                C32269EJe c32269EJe2 = (C32269EJe) this.A01;
                c32269EJe2.A02(false);
                C9GR.A07(c32269EJe2.getContext(), 2131976159);
                i = 1732556975;
                C0f9.A0A(i, A03);
                return;
            case 32:
                A03 = C0f9.A03(-1547089161);
                E04 e04 = ((C32269EJe) this.A01).A02;
                if (e04 == null) {
                    str3 = "interestAdapter";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                if (e04.A04) {
                    e04.A0A.A02(false);
                    e04.notifyDataSetChanged();
                }
                e04.A07 = true;
                i = 1076195366;
                C0f9.A0A(i, A03);
                return;
            case 33:
                A03 = C0f9.A03(-572946572);
                C32316ELf c32316ELf = (C32316ELf) this.A01;
                String str6 = C32316ELf.A0X;
                c32316ELf.A02.setVisibility(8);
                i = 778550534;
                C0f9.A0A(i, A03);
                return;
            case 35:
                A03 = C0f9.A03(1599053918);
                super.onFail(abstractC115105If);
                String A004 = AbstractC151876sX.A00(abstractC115105If);
                EKM ekm = (EKM) this.A01;
                String A033 = AbstractC151876sX.A03(abstractC115105If, AbstractC31173DnH.A0m(ekm));
                AbstractC18680vv abstractC18680vv = ekm.A01;
                String str7 = ekm.A04;
                C19280xC A005 = F0H.A00(C05F.A0j);
                A005.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "sign_up_with_biz_option");
                A005.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
                A005.A0C("error_identifier", A004);
                A005.A0C("error_message", A033);
                if (abstractC18680vv != null) {
                    AbstractC31173DnH.A1S(A005, abstractC18680vv);
                    i = -1716122988;
                    C0f9.A0A(i, A03);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 36:
                A03 = C0f9.A03(1582401005);
                C0w9.A01.EmN("AdActivityRemoveMutationUtils", "AdActivity remove mutation failed");
                i = -1126711734;
                C0f9.A0A(i, A03);
                return;
            case 37:
                A03 = C0f9.A03(1145844874);
                C0w9.A01.EmN("AdActivityRemoveMutationUtils", "AdActivity remove undo mutation failed");
                i = -180573727;
                C0f9.A0A(i, A03);
                return;
            case 38:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 602334496);
                super.onFail(abstractC115105If);
                EditProfileBarcelonaController editProfileBarcelonaController = (EditProfileBarcelonaController) this.A01;
                editProfileBarcelonaController.A00 = editProfileBarcelonaController.A04.A1f();
                i = -1742242924;
                C0f9.A0A(i, A03);
                return;
            case 39:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1629091046);
                super.onFail(abstractC115105If);
                EditProfileBarcelonaController editProfileBarcelonaController2 = (EditProfileBarcelonaController) this.A01;
                editProfileBarcelonaController2.A00 = editProfileBarcelonaController2.A04.A1f();
                i = -1068767549;
                C0f9.A0A(i, A03);
                return;
            case 40:
                A032 = C0f9.A03(-914883810);
                CompleteYourProfileFragment completeYourProfileFragment = (CompleteYourProfileFragment) this.A01;
                String string2 = completeYourProfileFragment.getString(2131974293);
                Object A006 = abstractC115105If.A00();
                if (A006 != null && (list = (c40781ul = (C40781ul) A006).mErrorStrings) != null && !list.isEmpty()) {
                    string2 = AbstractC31173DnH.A0s(c40781ul.mErrorStrings, 0);
                }
                CompleteYourProfileFragment.A03(completeYourProfileFragment, string2);
                FragmentActivity activity = completeYourProfileFragment.getActivity();
                if (activity != null) {
                    AbstractC31175DnJ.A0j(activity, false);
                    C9GR.A03(activity, string2, "save_failed", 0);
                }
                i2 = 915992119;
                C0f9.A0A(i2, A032);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A03 = C0f9.A03(-812070692);
                i = -1624618927;
                C0f9.A0A(i, A03);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A03 = C0f9.A03(94060764);
                super.onFail(abstractC115105If);
                C9GR.A01(AbstractC31172DnG.A07(this.A01), "fetch_featured_account_error", 2131962363, 1);
                i = -1870821795;
                C0f9.A0A(i, A03);
                return;
            case 44:
                A03 = C0f9.A03(1349875819);
                super.onFail(abstractC115105If);
                i = 1052991240;
                C0f9.A0A(i, A03);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(2094378978);
                C32267EJc c32267EJc = (C32267EJc) this.A01;
                ProgressButton progressButton = c32267EJc.A02;
                str = "nextButton";
                if (progressButton != null) {
                    progressButton.setEnabled(true);
                    ProgressButton progressButton2 = c32267EJc.A02;
                    if (progressButton2 != null) {
                        progressButton2.setShowProgressBar(false);
                        i = 1399578062;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                A03 = C0f9.A03(135328713);
                C32267EJc c32267EJc2 = (C32267EJc) this.A01;
                ProgressButton progressButton3 = c32267EJc2.A02;
                str = "nextButton";
                if (progressButton3 != null) {
                    progressButton3.setEnabled(true);
                    ProgressButton progressButton4 = c32267EJc2.A02;
                    if (progressButton4 != null) {
                        progressButton4.setShowProgressBar(false);
                        i = -1769629618;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                A03 = C0f9.A03(705368617);
                C32267EJc c32267EJc3 = (C32267EJc) this.A01;
                ProgressButton progressButton5 = c32267EJc3.A02;
                str = "nextButton";
                if (progressButton5 != null) {
                    progressButton5.setEnabled(true);
                    ProgressButton progressButton6 = c32267EJc3.A02;
                    if (progressButton6 != null) {
                        progressButton6.setShowProgressBar(false);
                        i = 250236024;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                A03 = C0f9.A03(-540010112);
                ProgressButton progressButton7 = ((C32267EJc) this.A01).A02;
                if (progressButton7 == null) {
                    str = "nextButton";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                progressButton7.setShowProgressBar(false);
                i = -1354638533;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = C0f9.A03(-121990359);
                EK3 ek3 = (EK3) this.A01;
                ProgressButton progressButton8 = ek3.A01;
                str = "nextButton";
                if (progressButton8 != null) {
                    progressButton8.setEnabled(true);
                    ProgressButton progressButton9 = ek3.A01;
                    if (progressButton9 != null) {
                        progressButton9.setShowProgressBar(false);
                        i = 1371525494;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A03 = C0f9.A03(1621077119);
                EJU eju = (EJU) this.A01;
                eju.A03 = false;
                AbstractC31178DnM.A0v(eju);
                i = -184073574;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(279400141);
                ProgressButton progressButton10 = ((C32262EIw) this.A01).A0B;
                if (progressButton10 != null) {
                    progressButton10.setShowProgressBar(false);
                    i = 388882994;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "confirmButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                A03 = C0f9.A03(-482453025);
                ProgressButton progressButton11 = ((C32262EIw) this.A01).A0B;
                if (progressButton11 != null) {
                    progressButton11.setShowProgressBar(false);
                    i = -2055509311;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "confirmButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
                A03 = C0f9.A03(-1031018635);
                ProgressButton progressButton12 = ((C32262EIw) this.A01).A0B;
                if (progressButton12 != null) {
                    progressButton12.setShowProgressBar(false);
                    i = 1832007932;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "confirmButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(1500640707);
                C0fA.A00(((ENP) this.A01).A02, 46819180);
                i = -446935286;
                C0f9.A0A(i, A03);
                return;
            case 23:
                A03 = C0f9.A03(-1465210426);
                ((C33001Ego) this.A01).A06.setShowProgressBar(false);
                i = 356601512;
                C0f9.A0A(i, A03);
                return;
            case 24:
                A03 = C0f9.A03(1702454709);
                ((ENv) this.A01).A01.A00();
                i = 1645687735;
                C0f9.A0A(i, A03);
                return;
            case 25:
                A03 = C0f9.A03(-972875200);
                C32362ENj c32362ENj = (C32362ENj) this.A01;
                ProgressButton progressButton13 = c32362ENj.A02;
                if (progressButton13 != null) {
                    progressButton13.setShowProgressBar(false);
                }
                C32362ENj.A02(c32362ENj);
                i = 1580449803;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A03 = C0f9.A03(1949475574);
                ProgressButton progressButton14 = ((AbstractC32319ELj) this.A01).A02;
                if (progressButton14 != null) {
                    progressButton14.setShowProgressBar(false);
                }
                i = -1795016836;
                C0f9.A0A(i, A03);
                return;
            case 38:
                A03 = C0f9.A03(740832591);
                super.onFinish();
                EditProfileBarcelonaController editProfileBarcelonaController = (EditProfileBarcelonaController) this.A01;
                IgdsListCell igdsListCell = editProfileBarcelonaController.toggleBarcelonaSwitchCell;
                if (igdsListCell != null) {
                    if (!igdsListCell.isEnabled()) {
                        IgdsListCell igdsListCell2 = editProfileBarcelonaController.toggleBarcelonaSwitchCell;
                        if (igdsListCell2 != null) {
                            igdsListCell2.setEnabled(true);
                        }
                    }
                    i = 535814709;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "toggleBarcelonaSwitchCell";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 39:
                A03 = C0f9.A03(178955558);
                super.onFinish();
                EditProfileBarcelonaController editProfileBarcelonaController2 = (EditProfileBarcelonaController) this.A01;
                IgdsListCell igdsListCell3 = editProfileBarcelonaController2.toggleBarcelonaSwitchCell;
                if (igdsListCell3 != null) {
                    if (!igdsListCell3.isEnabled()) {
                        IgdsListCell igdsListCell4 = editProfileBarcelonaController2.toggleBarcelonaSwitchCell;
                        if (igdsListCell4 != null) {
                            igdsListCell4.setEnabled(true);
                        }
                    }
                    i = 976563369;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "toggleBarcelonaSwitchCell";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                super.onFinish();
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        int A032;
        String str;
        int i2;
        switch (this.A00) {
            case 0:
                A032 = C0f9.A03(733652914);
                C32267EJc c32267EJc = (C32267EJc) this.A01;
                ProgressButton progressButton = c32267EJc.A02;
                str = "nextButton";
                if (progressButton != null) {
                    progressButton.setEnabled(false);
                    ProgressButton progressButton2 = c32267EJc.A02;
                    if (progressButton2 != null) {
                        progressButton2.setShowProgressBar(true);
                        i2 = 205465485;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                A032 = C0f9.A03(-595152509);
                C32267EJc c32267EJc2 = (C32267EJc) this.A01;
                ProgressButton progressButton3 = c32267EJc2.A02;
                str = "nextButton";
                if (progressButton3 != null) {
                    progressButton3.setEnabled(false);
                    ProgressButton progressButton4 = c32267EJc2.A02;
                    if (progressButton4 != null) {
                        progressButton4.setShowProgressBar(true);
                        i2 = 830923634;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                A032 = C0f9.A03(158372031);
                C32267EJc c32267EJc3 = (C32267EJc) this.A01;
                ProgressButton progressButton5 = c32267EJc3.A02;
                str = "nextButton";
                if (progressButton5 != null) {
                    progressButton5.setEnabled(false);
                    ProgressButton progressButton6 = c32267EJc3.A02;
                    if (progressButton6 != null) {
                        progressButton6.setShowProgressBar(true);
                        i2 = 719261388;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                A032 = C0f9.A03(-333200880);
                C32267EJc c32267EJc4 = (C32267EJc) this.A01;
                ProgressButton progressButton7 = c32267EJc4.A02;
                str = "nextButton";
                if (progressButton7 != null) {
                    progressButton7.setEnabled(false);
                    ProgressButton progressButton8 = c32267EJc4.A02;
                    if (progressButton8 != null) {
                        progressButton8.setShowProgressBar(true);
                        i2 = -720444655;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A032 = C0f9.A03(533436704);
                EK3 ek3 = (EK3) this.A01;
                ProgressButton progressButton9 = ek3.A01;
                str = "nextButton";
                if (progressButton9 != null) {
                    progressButton9.setEnabled(false);
                    ProgressButton progressButton10 = ek3.A01;
                    if (progressButton10 != null) {
                        progressButton10.setShowProgressBar(true);
                        i2 = -2018933384;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A03 = C0f9.A03(2035249370);
                ((EJU) this.A01).A03 = true;
                i = -1150186282;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A032 = C0f9.A03(-1854334910);
                C32262EIw c32262EIw = (C32262EIw) this.A01;
                ProgressButton progressButton11 = c32262EIw.A0B;
                str = "confirmButton";
                if (progressButton11 != null) {
                    progressButton11.setEnabled(false);
                    ProgressButton progressButton12 = c32262EIw.A0B;
                    if (progressButton12 != null) {
                        progressButton12.setShowProgressBar(true);
                        i2 = -1338732681;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                A032 = C0f9.A03(-234158731);
                C32262EIw c32262EIw2 = (C32262EIw) this.A01;
                ProgressButton progressButton13 = c32262EIw2.A0B;
                str = "confirmButton";
                if (progressButton13 != null) {
                    progressButton13.setEnabled(false);
                    ProgressButton progressButton14 = c32262EIw2.A0B;
                    if (progressButton14 != null) {
                        progressButton14.setShowProgressBar(true);
                        i2 = 1005083552;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
                A032 = C0f9.A03(-573030927);
                C32262EIw c32262EIw3 = (C32262EIw) this.A01;
                ProgressButton progressButton15 = c32262EIw3.A0B;
                str = "confirmButton";
                if (progressButton15 != null) {
                    progressButton15.setEnabled(false);
                    ProgressButton progressButton16 = c32262EIw3.A0B;
                    if (progressButton16 != null) {
                        progressButton16.setShowProgressBar(true);
                        i2 = -1439306156;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 26:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            default:
                super.onStart();
                return;
            case 14:
                A03 = C0f9.A03(319174746);
                AbstractC63248Sg4.A02(((C31250DoY) this.A01).A06);
                i = 2046626659;
                C0f9.A0A(i, A03);
                return;
            case 23:
                A03 = C0f9.A03(1711855706);
                ((C33001Ego) this.A01).A06.setShowProgressBar(true);
                i = -34302073;
                C0f9.A0A(i, A03);
                return;
            case 24:
                A03 = C0f9.A03(-360365852);
                ((ENv) this.A01).A01.A01();
                i = -903209039;
                C0f9.A0A(i, A03);
                return;
            case 25:
                A03 = C0f9.A03(-1872384385);
                ProgressButton progressButton17 = ((C32362ENj) this.A01).A02;
                if (progressButton17 != null) {
                    progressButton17.setShowProgressBar(true);
                }
                i = -1296901261;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A03 = C0f9.A03(-670056524);
                ProgressButton progressButton18 = ((AbstractC32319ELj) this.A01).A02;
                if (progressButton18 != null) {
                    progressButton18.setShowProgressBar(true);
                }
                i = -2020441625;
                C0f9.A0A(i, A03);
                return;
            case 28:
                A03 = C0f9.A03(230980591);
                ((C32260EIu) this.A01).A03(true);
                i = 66132692;
                C0f9.A0A(i, A03);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A03 = C0f9.A03(-1519674027);
                ((C32260EIu) this.A01).A03(true);
                i = 1771319334;
                C0f9.A0A(i, A03);
                return;
            case 30:
                A03 = C0f9.A03(-291146787);
                ((C32269EJe) this.A01).A02(true);
                i = -351220615;
                C0f9.A0A(i, A03);
                return;
            case 31:
                A03 = C0f9.A03(-954874017);
                ((C32269EJe) this.A01).A02(true);
                i = 1333112743;
                C0f9.A0A(i, A03);
                return;
            case 32:
                A03 = C0f9.A03(-420328415);
                ((C32269EJe) this.A01).A02(true);
                i = 2133082543;
                C0f9.A0A(i, A03);
                return;
            case 40:
                A03 = C0f9.A03(313933637);
                AbstractC31179DnN.A0v((Fragment) this.A01);
                i = 1497115973;
                C0f9.A0A(i, A03);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:578:0x115c, code lost:
    
        if (r2 == false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x126b, code lost:
    
        if (r2 == false) goto L544;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b5  */
    /* JADX WARN: Type inference failed for: r1v114, types: [com.instagram.registration.model.UserBirthDate, java.lang.Object] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 4862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32539EUp.onSuccess(java.lang.Object):void");
    }
}
