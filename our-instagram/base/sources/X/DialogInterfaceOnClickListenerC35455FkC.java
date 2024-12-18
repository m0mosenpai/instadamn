package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.api.schemas.UserCallSettings;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.business.fragment.ProfileDisplayOptionsFragment;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.login.twofac.model.TotpSeed;
import com.instagram.modal.ModalActivity;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import go.Seq;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.FkC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35455FkC implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnClickListenerC35455FkC(Context context, UserSession userSession, int i) {
        this.A00 = i;
        switch (i) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 27:
            case 34:
                this.A01 = context;
                this.A02 = userSession;
                return;
            default:
                this.A01 = context;
                this.A02 = userSession;
                return;
        }
    }

    public static DialogInterfaceOnClickListenerC35455FkC A00(Object obj, Object obj2, int i) {
        return new DialogInterfaceOnClickListenerC35455FkC(i, obj, obj2);
    }

    public static void A01(C193328hC c193328hC, Object obj, Object obj2, int i, int i2) {
        c193328hC.A0J(new DialogInterfaceOnClickListenerC35455FkC(i, obj, obj2), i2);
    }

    public static void A02(C193328hC c193328hC, Object obj, Object obj2, int i, int i2) {
        c193328hC.A0I(new DialogInterfaceOnClickListenerC35455FkC(i, obj, obj2), i2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Runnable runnable;
        String str;
        C63397SjR A0y;
        String str2;
        C36297Fzr c36297Fzr;
        String str3;
        C38321qM c38321qM;
        EnumC33512Erl enumC33512Erl;
        AbstractC52922bZ A0Z;
        Object obj;
        C141796aw A00;
        InterfaceC23621Ds interfaceC23621Ds;
        int i2;
        Context context;
        String A0W;
        String str4;
        C25531Mh A0A;
        InterfaceC02590Ai A0f;
        String A0c;
        String str5;
        ArrayList arrayList;
        C1ON A0R;
        C32540EUq c32540EUq;
        List list;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                C53Z c53z = (C53Z) this.A01;
                User user = (User) this.A02;
                UserSession session = c53z.getSession();
                String str6 = c53z.getSession().userId;
                String id = user.getId();
                Bundle A05 = AbstractC31178DnM.A05(session);
                A05.putString("child_user_id_key", str6);
                A05.putString("main_user_id_key", id);
                AbstractC32319ELj abstractC32319ELj = new AbstractC32319ELj();
                abstractC32319ELj.setArguments(A05);
                String canonicalName = c53z.getClass().getCanonicalName();
                Pattern pattern = AbstractC13670mt.A01;
                if (canonicalName == null) {
                    canonicalName = "";
                }
                C140966Yy A0F = AbstractC31178DnM.A0F(c53z);
                A0F.A0C = canonicalName;
                A0F.A0E(abstractC32319ELj);
                A0F.A0F(c53z, 0);
                A0F.A04();
                return;
            case 1:
                C53Z c53z2 = (C53Z) this.A01;
                User user2 = (User) this.A02;
                c53z2.getSession();
                Long.parseLong(user2.getId());
                UserSession session2 = c53z2.getSession();
                String id2 = user2.getId();
                C25621Ms A0M = AbstractC31173DnH.A0M(session2);
                A0M.A0B("multiple_accounts/unlink_from_main_accounts/");
                A0M.A0S(C40781ul.class, C55702hA.class);
                C1ON A0T = AbstractC31172DnG.A0T(A0M, "main_account_ids", id2);
                C31456Ds0.A00(A0T, c53z2, user2, 0);
                c53z2.schedule(A0T);
                return;
            case 2:
                ELI eli = (ELI) this.A01;
                C32402EPd c32402EPd = eli.A00;
                FID fid = (FID) this.A02;
                c32402EPd.A0C(fid.A01.getId(), false);
                ELI.A00(fid, eli);
                return;
            case 3:
                C14360o3.A0B(dialogInterface, 0);
                C35021Fbu c35021Fbu = (C35021Fbu) this.A02;
                runnable = (Runnable) this.A01;
                C148676mc c148676mc = c35021Fbu.A01;
                if (c148676mc != null) {
                    c148676mc.A00();
                    dialogInterface.dismiss();
                    runnable.run();
                    return;
                }
                str = "audLogging";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                C35021Fbu c35021Fbu2 = (C35021Fbu) this.A02;
                runnable = (Runnable) this.A01;
                C34979Fb6 c34979Fb6 = C34979Fb6.A00;
                Context context2 = c35021Fbu2.A00;
                if (context2 == null) {
                    str = "context";
                } else {
                    UserSession userSession = c35021Fbu2.A02;
                    if (userSession == null) {
                        str = "userSession";
                    } else {
                        C148676mc c148676mc2 = c35021Fbu2.A01;
                        if (c148676mc2 != null) {
                            c34979Fb6.A00(context2, c148676mc2, userSession);
                            runnable.run();
                            return;
                        }
                        str = "audLogging";
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                AbstractC31171DnF.A1K((C6FQ) this.A02, (InterfaceC103384lE) this.A01);
                return;
            case 6:
                ClipboardManager clipboardManager = (ClipboardManager) this.A01;
                if (clipboardManager == null) {
                    return;
                }
                clipboardManager.setPrimaryClip((ClipData) this.A02);
                return;
            case 7:
                A0y = AbstractC25228BEl.A0y((Context) this.A01, (UserSession) this.A02, C2Fb.A0Y, "https://help.instagram.com/1022082264667994");
                str2 = "promoted_branded_content_dialog";
                A0y.A0S = str2;
                A0y.A0A();
                return;
            case 8:
                ((IgdsSwitch) this.A01).setCheckedAnimated(false);
                ProfileDisplayOptionsFragment.A01((ProfileDisplayOptionsFragment) this.A02);
                return;
            case 9:
                HashMap A11 = AbstractC31174DnI.A11(dialogInterface, 0);
                A11.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ig_direct_quick_replies");
                AbstractC31174DnI.A19((Context) this.A01, C66277U6x.A01(AbstractC111324zv.A00(369), A11), (AbstractC12990ll) this.A02);
                dialogInterface.dismiss();
                return;
            case 10:
                ((InterfaceC145346gt) this.A02).Cvg((User) this.A01);
                return;
            case 11:
                C35233FgQ c35233FgQ = (C35233FgQ) this.A02;
                Fragment fragment = c35233FgQ.A00;
                Context requireContext = fragment.requireContext();
                C08790ch A002 = AbstractC018607g.A00(fragment);
                C1ON A01 = AbstractC35238FgX.A01(fragment.requireContext(), c35233FgQ.A02, null, true);
                A01.A00 = (C1P1) this.A01;
                C1GJ.A00(requireContext, A002, A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC34763FTi.A01((Context) this.A01, (UserSession) this.A02);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                AbstractC31175DnJ.A1M(abstractC59962oe, AbstractC25228BEl.A0y(abstractC59962oe.requireContext(), (UserSession) this.A02, C2Fb.A2b, "https://help.instagram.com/856296695055001"));
                return;
            case 14:
                DirectShareSheetFragment directShareSheetFragment = ((C31893Dzz) this.A02).A04;
                FQ1 fq1 = (FQ1) this.A01;
                FQA fqa = directShareSheetFragment.A0O;
                if (fqa != null && fq1.A01.equals(fqa.A00)) {
                    DirectShareSheetFragment.A0E(directShareSheetFragment);
                    InterfaceC169357h9 interfaceC169357h9 = directShareSheetFragment.A0n;
                    if (interfaceC169357h9 != null) {
                        interfaceC169357h9.Eby("");
                        directShareSheetFragment.A0O.A00 = null;
                    }
                }
                C31893Dzz c31893Dzz = directShareSheetFragment.mShortcutsRowAdapter;
                if (c31893Dzz != null) {
                    c31893Dzz.A05.remove(fq1);
                    c31893Dzz.notifyDataSetChanged();
                }
                C1GJ.A06(AbstractC121115e3.A01(directShareSheetFragment.A0Q.A0M, new EZ3(fq1.A01, 2)), 1967622104, 2, false, false);
                return;
            case Process.SIGTERM /* 15 */:
                C34962Fam c34962Fam = (C34962Fam) this.A02;
                C36297Fzr c36297Fzr2 = c34962Fam.A07;
                C2EE c2ee = (C2EE) this.A01;
                C36297Fzr.A01(c36297Fzr2, c2ee.C7I(), c2ee.C7q(), "daily_prompt_reply_reminder_dialog_create_new_daily_prompt", "tap", "daily_prompt_button", "daily_prompt_reply_reminder_dialog", c2ee.AdZ());
                C34962Fam.A00(c34962Fam, c2ee);
                return;
            case 16:
                C14360o3.A0B(dialogInterface, 0);
                c36297Fzr = ((C34962Fam) this.A02).A07;
                C2EE c2ee2 = (C2EE) this.A01;
                C36297Fzr.A01(c36297Fzr, c2ee2.C7I(), c2ee2.C7q(), "daily_prompt_reply_reminder_dialog_cancel", "tap", "cancel_button", "daily_prompt_reply_reminder_dialog", c2ee2.AdZ());
                dialogInterface.dismiss();
                return;
            case 17:
                C36753GIa c36753GIa = (C36753GIa) this.A01;
                User user3 = (User) this.A02;
                C32282EJt c32282EJt = c36753GIa.A00;
                c32282EJt.A02.getClass();
                AbstractC31278Dp0.A0H(c32282EJt.A00, c32282EJt.A04, user3.getId());
                c32282EJt.A02.A00(user3);
                c32282EJt.A0C.remove(user3);
                C31892Dzy c31892Dzy = c32282EJt.A01;
                C35003Fba c35003Fba = c32282EJt.A02;
                C14360o3.A0B(c35003Fba, 0);
                c31892Dzy.A00 = Collections.unmodifiableList(c35003Fba.A04);
                c31892Dzy.notifyDataSetChanged();
                C32282EJt.A00(c32282EJt);
                FragmentActivity activity = c32282EJt.getActivity();
                if (activity != null) {
                    AbstractC31175DnJ.A0i(activity);
                }
                AbstractC25651Mw.A00(c32282EJt.A00).E4s(new C36087FwN(user3));
                c32282EJt.A02.getClass();
                AbstractC25651Mw.A00(c32282EJt.A00).E4s(new C161037Jm(c32282EJt.A04, c32282EJt.A02.A00));
                user3.getId();
                return;
            case 18:
                C35012Fbj.A00((C35012Fbj) this.A02, (ArrayList) this.A01);
                return;
            case Process.SIGSTOP /* 19 */:
                EN8 en8 = (EN8) this.A02;
                User user4 = (User) this.A01;
                C50170MDx c50170MDx = new C50170MDx(14, user4, en8);
                C15370ps A1F = AbstractC25225BEi.A1F();
                C6WQ c6wq = new C6WQ(en8.requireActivity(), true);
                A1F.A00 = c6wq;
                c6wq.setCancelable(true);
                C0fJ.A00((Dialog) A1F.A00);
                AbstractC35271Fh6.A00(en8.requireActivity(), null, new C31456Ds0(18, c50170MDx, A1F), AbstractC166987dD.A0r(en8.A0N), null, null, user4);
                C36296Fzq.A01(EnumC33514Ern.A0G, EnumC33512Erl.STORY, AbstractC31172DnG.A0b(en8.A0M), AbstractC111324zv.A00(4472));
                return;
            case 20:
                C31665DvV c31665DvV = (C31665DvV) this.A02;
                C31665DvV.A06(c31665DvV, (List) this.A01, true);
                c31665DvV.A0B.AOn(AbstractC166987dD.A1F(c31665DvV.A0D.keySet()));
                C31665DvV.A07(c31665DvV, false);
                return;
            case 21:
                C31665DvV.A06((C31665DvV) this.A02, (List) this.A01, false);
                dialogInterface.dismiss();
                return;
            case 22:
            case 23:
                A0y = AbstractC25228BEl.A0y((Context) this.A01, (UserSession) this.A02, C2Fb.A1W, AbstractC43591JPw.A00(381));
                str2 = "inbox_thread_action";
                A0y.A0S = str2;
                A0y.A0A();
                return;
            case 24:
            case 25:
                C14360o3.A0B(dialogInterface, 0);
                c36297Fzr = ((FRX) this.A02).A02;
                C2EE c2ee22 = (C2EE) this.A01;
                C36297Fzr.A01(c36297Fzr, c2ee22.C7I(), c2ee22.C7q(), "daily_prompt_reply_reminder_dialog_cancel", "tap", "cancel_button", "daily_prompt_reply_reminder_dialog", c2ee22.AdZ());
                dialogInterface.dismiss();
                return;
            case 26:
                C36004Fv2 c36004Fv2 = C36004Fv2.A00;
                UserSession userSession2 = (UserSession) this.A02;
                Runnable runnable2 = (Runnable) this.A01;
                String str7 = UserCallSettings.A06.A00;
                AbstractC167017dG.A1N(userSession2, str7);
                C25621Ms A0c2 = AbstractC167017dG.A0c(userSession2);
                A0c2.A0B("video_call/change_user_call_settings/");
                C1GJ.A03(AbstractC31178DnM.A0K(A0c2, "setting_type", str7));
                runnable2.run();
                AbstractC31175DnJ.A1N(AbstractC12220kQ.A01(c36004Fv2, userSession2), "verified_calling_dialog_enable_button_tapped");
                return;
            case 27:
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                Context context3 = (Context) this.A01;
                c35133Fea.A02(context3, (AbstractC12990ll) this.A02, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, AbstractC166997dE.A0p(context3, 2131965052), AbstractC63260SgI.A01(context3, "https://help.instagram.com/447613741984126")));
                return;
            case 28:
                new C7TR((UserSession) this.A02).Ch4((DirectThreadKey) this.A01);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                EL5 el5 = (EL5) this.A02;
                FanClubConsiderationViewModel A003 = EL5.A00(el5);
                EnumC33348Eoh enumC33348Eoh = (EnumC33348Eoh) ((C51749MtY) this.A01).A01;
                FragmentActivity requireActivity = el5.requireActivity();
                int A052 = AbstractC25227BEk.A05(enumC33348Eoh, 0);
                if (A052 != 0) {
                    if (A052 != 1) {
                        return;
                    }
                    if (C18U.A06(C06090Tz.A05, A003.A03, 36327284361148892L)) {
                        return;
                    }
                    if (A003.A0M) {
                        AbstractC167017dG.A0y(requireActivity, C3DN.A00);
                        return;
                    } else {
                        requireActivity.finish();
                        return;
                    }
                }
                throw AbstractC166987dD.A12("NONE dialog does not exist and should not be clicked");
            case 30:
                C148786mn c148786mn = (C148786mn) this.A02;
                C41181vS c41181vS = (C41181vS) this.A01;
                ImageUrl imageUrl = null;
                if (AbstractC167007dF.A1X(c41181vS.A0e, EnumC41231vY.A09) && (c38321qM = c41181vS.A0b) != null) {
                    str3 = c38321qM.getId();
                } else {
                    str3 = null;
                }
                C38321qM c38321qM2 = c41181vS.A0b;
                if (c38321qM2 != null) {
                    imageUrl = c38321qM2.A1S();
                }
                UserSession userSession3 = c148786mn.A05;
                InlineAddHighlightFragment A03 = AbstractC55178Odj.A03(imageUrl, C3G2.A1L, userSession3.token, str3);
                C189448aO A0y2 = AbstractC25225BEi.A0y(userSession3);
                A0y2.A0T = new C49615Lw8(c148786mn, 8);
                A0y2.A00().A02(c148786mn.A02, A03);
                return;
            case 31:
                EOG eog = (EOG) this.A02;
                C36296Fzq A0b = AbstractC31172DnG.A0b(eog.A08);
                FanClubCategoryType fanClubCategoryType = eog.A00;
                if (fanClubCategoryType == null) {
                    str = "categoryType";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                int ordinal = fanClubCategoryType.ordinal();
                if (ordinal != 3) {
                    if (ordinal != 2) {
                        if (ordinal == 1) {
                            enumC33512Erl = EnumC33512Erl.LEAST_INTERACTED_SUBSCRIBERS_LIST;
                        }
                        A0Z = AbstractC25225BEi.A0Z(eog.A0B);
                        obj = this.A01;
                        A00 = AbstractC141776au.A00(A0Z);
                        interfaceC23621Ds = null;
                        i2 = 6;
                        AbstractC166987dD.A1Z(new MCG(obj, A0Z, interfaceC23621Ds, i2), A00);
                        return;
                    }
                    enumC33512Erl = EnumC33512Erl.MOST_INTERACTED_SUBSCRIBERS_LIST;
                } else {
                    enumC33512Erl = EnumC33512Erl.MOST_RECENT_SUBSCRIBERS_LIST;
                }
                C36296Fzq.A02(EnumC33514Ern.A0Q, enumC33512Erl, A0b, "remove_subscriber", "tap", null);
                A0Z = AbstractC25225BEi.A0Z(eog.A0B);
                obj = this.A01;
                A00 = AbstractC141776au.A00(A0Z);
                interfaceC23621Ds = null;
                i2 = 6;
                AbstractC166987dD.A1Z(new MCG(obj, A0Z, interfaceC23621Ds, i2), A00);
                return;
            case 32:
                A0Z = AbstractC25225BEi.A0Z(((EOF) this.A02).A02);
                obj = this.A01;
                A00 = AbstractC141776au.A00(A0Z);
                interfaceC23621Ds = null;
                i2 = 7;
                AbstractC166987dD.A1Z(new MCG(obj, A0Z, interfaceC23621Ds, i2), A00);
                return;
            case 33:
                if (i != -1) {
                    return;
                }
                ELE ele = (ELE) this.A02;
                C99694dm c99694dm = ele.A00;
                if (c99694dm == null) {
                    C14360o3.A0F("fanClubLogger");
                    throw C00O.createAndThrow();
                }
                long A08 = AbstractC31174DnI.A08(AbstractC31176DnK.A0g(C17060sy.A01, ele.A04));
                String str8 = ((C26046BfZ) this.A01).A03;
                if (str8 != null) {
                    c99694dm.A04("FanClubPromoVideosFragment", A08, str8, "replace");
                    ELE.A03(ele);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 34:
                A0y = AbstractC25228BEl.A0y((Context) this.A01, (UserSession) this.A02, C2Fb.A2b, "https://help.instagram.com/402084904469945/");
                str2 = "exclusive_story_music_sticker_prevention_dialog";
                A0y.A0S = str2;
                A0y.A0A();
                return;
            case 35:
                C35241Fga.A02(FVP.A00((Integer) this.A01), (UserSession) this.A02, "reminder_cancel");
                return;
            case 36:
                EL0.A00((EL0) this.A02);
                context = (Context) this.A01;
                A0W = AbstractC31178DnM.A0W();
                str4 = "ig_two_fac_authenticator_app_confirm";
                AbstractC14490oL.A07(context, A0W, str4);
                return;
            case 37:
                C32291EKe c32291EKe = (C32291EKe) this.A02;
                C140966Yy A0c3 = AbstractC25231BEo.A0c(c32291EKe.requireActivity(), c32291EKe.A00);
                AbstractC35179FfW.A03();
                Bundle requireArguments = c32291EKe.requireArguments();
                requireArguments.putString("arg_two_fac_app_name", "Duo Mobile");
                AbstractC31175DnJ.A0t(requireArguments, new C32292EKf(), A0c3);
                context = (Context) this.A01;
                A0W = AbstractC31178DnM.A0W();
                str4 = "ig_two_fac_authenticator_app_download";
                AbstractC14490oL.A07(context, A0W, str4);
                return;
            case 38:
                C33221El9 c33221El9 = (C33221El9) this.A01;
                C33127EjW c33127EjW = new C33127EjW(c33221El9.getParentFragmentManager(), c33221El9, 7);
                AbstractC12990ll A0o = AbstractC166987dD.A0o(c33221El9.A02);
                Context requireContext2 = c33221El9.requireContext();
                String str9 = ((TotpSeed) this.A02).A02;
                C14360o3.A07(str9);
                C25621Ms A0C = AbstractC31179DnN.A0C(A0o);
                AbstractC31172DnG.A1Q(A0C, 584, 38, 116);
                AbstractC31177DnL.A0t(requireContext2, A0C);
                C1ON A0K = AbstractC31178DnM.A0K(A0C, AbstractC31178DnM.A0Y(), str9);
                A0K.A00 = c33127EjW;
                C1GJ.A03(A0K);
                return;
            case 39:
                C35272Fh7 c35272Fh7 = (C35272Fh7) this.A01;
                EnumC33353Eom enumC33353Eom = (EnumC33353Eom) this.A02;
                UserSession userSession4 = c35272Fh7.A04;
                C55772hI.A00(userSession4).A06(c35272Fh7.A01);
                EnumC33353Eom enumC33353Eom2 = EnumC33353Eom.A02;
                C18920wW A02 = AbstractC12220kQ.A02(userSession4);
                if (enumC33353Eom == enumC33353Eom2) {
                    A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(A02, "ig_log_out_all_accounts"), 237);
                    if (AbstractC25226BEj.A1Z(A0A)) {
                        A0A.A0m(c35272Fh7.A03.getModuleName());
                    }
                    c35272Fh7.A0D(enumC33353Eom, AbstractC31177DnL.A1X(userSession4));
                    return;
                }
                A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(A02, "ig_log_out_account"), 236);
                A0A.A0Q("updated_accounts_count", Long.valueOf(AbstractC31174DnI.A06(userSession4) - 1));
                A0A.A0R("containermodule", c35272Fh7.A03.getModuleName());
                A0A.Cht();
                c35272Fh7.A0D(enumC33353Eom, AbstractC31177DnL.A1X(userSession4));
                return;
            case 40:
                C83753oK c83753oK = (C83753oK) this.A02;
                C35272Fh7 c35272Fh72 = (C35272Fh7) this.A01;
                UserSession userSession5 = c35272Fh72.A04;
                C14360o3.A0B(userSession5, 0);
                C83753oK.A01(userSession5, "logout_password_saving_opt_out", "logout_spi", "spi", "logout_interaction");
                C35272Fh7.A02(c83753oK, c35272Fh72, false);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                UserSession userSession6 = ((C35272Fh7) this.A01).A04;
                C14360o3.A0B(userSession6, 0);
                C83753oK.A01(userSession6, "logout_password_saving_cancel_clicked", "logout_spi", "logout", "logout_interaction");
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C35272Fh7 c35272Fh73 = (C35272Fh7) this.A01;
                UserSession userSession7 = c35272Fh73.A04;
                C83743oJ.A01(userSession7).A09(c35272Fh73.A01.getApplicationContext(), c35272Fh73.A03, userSession7, C05F.A0j, AbstractC31171DnF.A0g(this.A02), true);
                C35272Fh7.A07(c35272Fh73);
                return;
            case 43:
                if (i != -2) {
                    if (i != -1) {
                        return;
                    }
                    C12260kU.A0E((Context) this.A01, (Intent) this.A02);
                    return;
                }
                dialogInterface.dismiss();
                return;
            case 44:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                InterfaceC37225Gaa interfaceC37225Gaa = (InterfaceC37225Gaa) this.A01;
                double A012 = AbstractC31171DnF.A01();
                double A004 = AbstractC31171DnF.A00();
                A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "retry_tapped");
                AbstractC31175DnJ.A0y(A0f);
                AbstractC31177DnL.A1B(A0f, A012, A004);
                AbstractC31171DnF.A1A(A0f, "access_dialog");
                AbstractC31177DnL.A1G(A0f, "module", "waterfall_log_in", A004);
                AbstractC35274Fh9.A07(A0f, A012);
                A0f.AAP("auth_type", interfaceC37225Gaa.AY9());
                C14360o3.A0B(abstractC12990ll, 0);
                A0c = AbstractC31179DnN.A0c(abstractC12990ll);
                str5 = CacheBehaviorLogger.SOURCE;
                A0f.AAP(str5, A0c);
                A0f.Cht();
                return;
            case 45:
                EMI emi = (EMI) this.A02;
                InterfaceC09390do interfaceC09390do = emi.A03;
                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do);
                EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0G;
                C51757Mtg c51757Mtg = (C51757Mtg) this.A01;
                AbstractC35102FdD.A01(A0o2, enumC31713DwI, c51757Mtg.A05());
                AymhViewModel aymhViewModel = emi.A01;
                if (aymhViewModel == null) {
                    str = "aymhViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AbstractC12990ll A0o3 = AbstractC166987dD.A0o(interfaceC09390do);
                Bundle requireArguments2 = emi.requireArguments();
                C14360o3.A0B(A0o3, 1);
                String A053 = c51757Mtg.A05();
                if (A053 != null) {
                    C17280tP c17280tP = aymhViewModel.A06;
                    c17280tP.A0H(AnonymousClass090.A01(A053, c17280tP.A09()));
                    Iterator A1J = AbstractC25226BEj.A1J(c51757Mtg.A00);
                    while (A1J.hasNext()) {
                        if (((E6N) A1J.next()).A01.intValue() == 1) {
                            aymhViewModel.A07.A0A(emi, A0o3, C05F.A0C, A053);
                        }
                    }
                }
                String str10 = c51757Mtg.A02;
                if (str10 != null) {
                    ArrayList A005 = LHJ.A00();
                    Iterator it = A005.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            L8l l8l = (L8l) it.next();
                            l8l.A01();
                            if (l8l.A01().equals(str10)) {
                                it.remove();
                            }
                        }
                    }
                    LHJ.A02(A005);
                    C17280tP c17280tP2 = aymhViewModel.A06;
                    c17280tP2.A0H(AnonymousClass090.A01(str10, c17280tP2.A09()));
                }
                InterfaceC09390do interfaceC09390do2 = aymhViewModel.A08;
                C2GT A0F2 = AbstractC31172DnG.A0F(interfaceC09390do2);
                List list2 = (List) AbstractC31176DnK.A0k(interfaceC09390do2);
                if (list2 != null) {
                    arrayList = AbstractC166987dD.A1E();
                    for (Object obj2 : list2) {
                        AbstractC25232BEp.A1Q(((C51757Mtg) obj2).A02, str10, obj2, arrayList);
                    }
                } else {
                    arrayList = null;
                }
                A0F2.A0B(arrayList);
                List list3 = (List) AbstractC31176DnK.A0k(interfaceC09390do2);
                if (list3 != null && !list3.isEmpty()) {
                    return;
                }
                AbstractC166987dD.A1Z(new PZX(aymhViewModel, requireArguments2, (InterfaceC23621Ds) null, 10), AbstractC141776au.A00(aymhViewModel));
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                AbstractC35102FdD.A00(AbstractC166987dD.A0o(((EMI) this.A02).A03), EnumC31713DwI.A0G, ((C51757Mtg) this.A01).A05());
                return;
            case 47:
                AbstractC31171DnF.A1R(((C31456Ds0) this.A01).A01, this.A02);
                return;
            case 48:
                dialogInterface.dismiss();
                AbstractC35178FfV.A00().A00((Activity) this.A01, null, (AbstractC12990ll) this.A02);
                return;
            case 49:
                dialogInterface.dismiss();
                if (!AbstractC151756sL.A01()) {
                    return;
                }
                C35043FcG A0d = AbstractC31174DnI.A0d();
                Activity activity2 = (Activity) this.A01;
                AbstractC31171DnF.A1P(activity2);
                A0d.A03((FragmentActivity) activity2, new C35957FuH(), (UserSession) this.A02, "opal_badge", true);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A01);
                AbstractC31171DnF.A1P(A09);
                FDS.A00(A09, (UserSession) this.A02);
                return;
            case 51:
                UserDetailFragment userDetailFragment = (UserDetailFragment) this.A01;
                User user5 = (User) this.A02;
                C31702Dw7 c31702Dw7 = new C31702Dw7(userDetailFragment, 19);
                UserSession userSession8 = userDetailFragment.A0I;
                if (userSession8 != null) {
                    AbstractC129875tr.A00(userSession8).A08(userDetailFragment.requireActivity(), c31702Dw7, userDetailFragment.A0I, user5);
                }
                FHF fhf = userDetailFragment.A0w;
                if (fhf == null) {
                    fhf = new FHF(userDetailFragment.A0I);
                    userDetailFragment.A0w = fhf;
                }
                A0c = userDetailFragment.A10.A02();
                C14360o3.A0B(A0c, 0);
                A0f = AbstractC166987dD.A0f(fhf.A00, "remove_follower_dialog_confirmed");
                str5 = "target_id";
                A0f.AAP(str5, A0c);
                A0f.Cht();
                return;
            case 52:
                AbstractC34910FZw.A00((FragmentActivity) this.A01, (UserSession) this.A02, "https://help.instagram.com/2387676754836493");
                return;
            case 53:
                ((GZN) this.A01).DlA((List) this.A02);
                return;
            case 54:
                final EM6 em6 = (EM6) this.A01;
                final List list4 = (List) this.A02;
                EM6.A02(em6);
                AbstractC35260Fgu.A08(em6.requireContext(), em6, em6.A05, new Runnable() { // from class: X.GOp
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC31181DnP.A0z(EM6.this, list4);
                    }
                }, list4);
                return;
            case 55:
                final EM6 em62 = (EM6) this.A01;
                final List list5 = (List) this.A02;
                EM6.A02(em62);
                SavedCollection savedCollection = em62.A0C;
                if (savedCollection == null) {
                    return;
                }
                AbstractC35260Fgu.A04(em62.requireContext(), em62, em62.A05, savedCollection, new Runnable() { // from class: X.GOr
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC31181DnP.A0z(EM6.this, list5);
                    }
                }, list5);
                return;
            case 56:
                C33226ElG c33226ElG = (C33226ElG) this.A02;
                AbstractC31175DnJ.A1N(c33226ElG.A03, "remove_self_followers_dialog_confirmed");
                if (c33226ElG.getActivity() == null) {
                    return;
                }
                FollowListData A006 = AbstractC31565Dtq.A00(EnumC31556Dtg.A04, AbstractC31171DnF.A0g(this.A01), null, false);
                C1XQ A013 = AbstractC31412DrH.A01();
                InterfaceC09390do interfaceC09390do3 = c33226ElG.A0E;
                C31535DtK CsL = A013.CsL(AbstractC166987dD.A0r(interfaceC09390do3), A006);
                C140966Yy A0j = AbstractC25233BEq.A0j(c33226ElG, interfaceC09390do3);
                A0j.A0B(null, CsL);
                A0j.A04();
                return;
            case 57:
                C35150Fes c35150Fes = (C35150Fes) this.A01;
                EnumC222416a enumC222416a = (EnumC222416a) this.A02;
                AbstractC59962oe abstractC59962oe2 = c35150Fes.A02;
                if (abstractC59962oe2.getContext() == null) {
                    return;
                }
                C61972ry c61972ry = new C61972ry(abstractC59962oe2.getContext(), AbstractC018607g.A00(abstractC59962oe2));
                Context context4 = abstractC59962oe2.getContext();
                UserSession userSession9 = c35150Fes.A07;
                InterfaceC37191Ga2 interfaceC37191Ga2 = c35150Fes.A04;
                AbstractC167017dG.A1Q(context4, userSession9);
                AbstractC167017dG.A1T(enumC222416a, interfaceC37191Ga2);
                C1ON A0N = AbstractC35780FrI.A00(userSession9, enumC222416a, "setting").A0N();
                A0N.A00 = new C32524EUa(context4, null, interfaceC37191Ga2, userSession9, c61972ry, new BusinessInfo(new C35130FeX()), enumC222416a, "setting", AbstractC167007dF.A1X(AbstractC166997dE.A0Y(userSession9).A0I(), EnumC222416a.A07));
                c61972ry.schedule(A0N);
                return;
            case 58:
                ((C33227ElJ) this.A01).A06.getValue();
                View view = (View) this.A02;
                C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.Checkable");
                ((Checkable) view).setChecked(false);
                dialogInterface.dismiss();
                return;
            case 59:
                FJF fjf = (FJF) this.A02;
                CheckBox checkBox = ((C35166FfG) this.A01).A08;
                checkBox.getClass();
                boolean isChecked = checkBox.isChecked();
                C35272Fh7 c35272Fh74 = fjf.A00;
                UserSession userSession10 = c35272Fh74.A04;
                String str11 = fjf.A01;
                InterfaceC11380iw interfaceC11380iw = c35272Fh74.A03;
                AbstractC35076Fcn.A02(interfaceC11380iw, userSession10, "logout_d1_logout_tapped", str11, isChecked);
                C83743oJ.A01(userSession10).A09(c35272Fh74.A01.getApplicationContext(), interfaceC11380iw, userSession10, C05F.A0j, str11, isChecked);
                c35272Fh74.A0D(EnumC33353Eom.A05, isChecked);
                return;
            case 60:
                C151546s0.A05((FbProfileLinkUrlHandlerActivity) this.A02, (UserSession) this.A01, "upsell");
                dialogInterface.dismiss();
                return;
            case 61:
            case 62:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            default:
                AbstractC86593tX.A0b((FragmentActivity) ((Context) this.A01), (UserSession) this.A02, C05F.A0j);
                return;
            case 64:
                ((GZW) this.A01).D6u(((C17I) this.A02).CQf() ? 1 : 0, false);
                return;
            case 65:
                Context context5 = (Context) this.A01;
                String A014 = AbstractC63260SgI.A01(context5, "http://help.instagram.com/374546259294234/?ref=learn_more");
                C14360o3.A07(A014);
                C35133Fea c35133Fea2 = SimpleWebViewActivity.A02;
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A02;
                if (abstractC12990ll2 != null) {
                    C35133Fea.A01(context5, abstractC12990ll2, c35133Fea2, AbstractC31171DnF.A0R(A014), context5.getString(2131963475));
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 66:
                UserSession userSession11 = (UserSession) this.A01;
                InterfaceC11380iw interfaceC11380iw2 = AbstractC206099Aq.A00;
                AbstractC167017dG.A1N(userSession11, interfaceC11380iw2);
                C65761Ttc.A02(new C65761Ttc(interfaceC11380iw2, userSession11), ((C71603Jf) this.A02).A03(0L), "ig_quiet_mode_upsell_dialog_not_now_tap", "in_app_upsell");
                dialogInterface.dismiss();
                return;
            case 67:
                AbstractC35239FgY.A05((FragmentActivity) this.A01, (UserSession) this.A02, "comments");
                return;
            case 68:
                SimpleWebViewActivity.A02.A02(AbstractC31172DnG.A07(this.A01), (AbstractC12990ll) this.A02, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, true, true, false, false, false, (String) null, "https://help.instagram.com/412981112149384/"));
                return;
            case 69:
                Activity activity3 = (Activity) this.A01;
                UserSession userSession12 = (UserSession) this.A02;
                C18920wW A015 = AbstractC12220kQ.A01(null, userSession12);
                String str12 = userSession12.userId;
                HashMap A0e = AbstractC31179DnN.A0e();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(A015, MSV.A00(478));
                A0f2.A9K("actor_ig_userid", AbstractC25228BEl.A13(str12));
                AbstractC31171DnF.A1C(A0f2, "click");
                AbstractC31171DnF.A1A(A0f2, "cant_tag_alert_manage_blocked_accounts");
                A0f2.A9M("extra_values", A0e);
                A0f2.Cht();
                AbstractC25228BEl.A1G(activity3, AbstractC166987dD.A0b(), userSession12, ModalActivity.class, "blocked_list");
                return;
            case 70:
                C41181vS c41181vS2 = (C41181vS) this.A02;
                boolean A1K = c41181vS2.A1K();
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
                if (A1K) {
                    List A016 = AbstractC34833FWq.A01(reelDashboardFragment.A06, c41181vS2);
                    Context requireContext3 = reelDashboardFragment.requireContext();
                    UserSession userSession13 = reelDashboardFragment.A06;
                    Reel reel = reelDashboardFragment.A07;
                    reel.getClass();
                    A016.getClass();
                    C3G2 c3g2 = C3G2.A0Y;
                    ArrayList A12 = AbstractC166997dE.A12(userSession13, 1);
                    Iterator it2 = A016.iterator();
                    while (it2.hasNext()) {
                        String id3 = AbstractC31172DnG.A0i(it2).getId();
                        if (id3 != null) {
                            A12.add(id3);
                        }
                    }
                    C54662OCo A007 = AbstractC50558MTp.A00(requireContext3, userSession13, reel, A12);
                    String str13 = null;
                    if (A007 != null) {
                        str13 = A007.A03;
                        list = AbstractC50558MTp.A04(A007);
                        ImageUrl imageUrl2 = A007.A02;
                        i3 = imageUrl2.getHeight();
                        i4 = imageUrl2.getWidth();
                    } else {
                        list = null;
                        i3 = 0;
                        i4 = 0;
                    }
                    String id4 = reel.getId();
                    C14360o3.A07(id4);
                    A0R = AbstractC1571873x.A01(AbstractC50558MTp.A01(c3g2), userSession13, id4, null, str13, null, list, AbstractC166987dD.A1H(), AbstractC31171DnF.A0k(A12), i3, i4);
                    AbstractC10360h2 abstractC10360h2 = reelDashboardFragment.mFragmentManager;
                    abstractC10360h2.getClass();
                    c32540EUq = new C32540EUq(19, reelDashboardFragment, new C54809OKh(null, abstractC10360h2, C05F.A01), A016);
                } else {
                    UserSession userSession14 = reelDashboardFragment.A06;
                    C14360o3.A0B(userSession14, 0);
                    InterfaceC37274GbR A054 = c41181vS2.A05();
                    String str14 = null;
                    C25621Ms A0c4 = AbstractC167017dG.A0c(userSession14);
                    if (A054 != null) {
                        str14 = A054.BsS();
                    }
                    A0c4.A0L("media/%s/delete_stitched_media_story_parts/", str14);
                    A0R = AbstractC31172DnG.A0R(null, A0c4, C40781ul.class, C55702hA.class, false);
                    AbstractC10360h2 abstractC10360h22 = reelDashboardFragment.mFragmentManager;
                    abstractC10360h22.getClass();
                    c32540EUq = new C32540EUq(18, reelDashboardFragment, new C54809OKh(null, abstractC10360h22, C05F.A00), c41181vS2);
                }
                A0R.A00 = c32540EUq;
                reelDashboardFragment.schedule(A0R);
                return;
        }
    }

    public DialogInterfaceOnClickListenerC35455FkC(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
