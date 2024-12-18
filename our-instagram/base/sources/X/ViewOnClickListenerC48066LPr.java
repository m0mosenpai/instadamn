package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.smartcapture.view.SelfieOnboardingActivity;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.appreciation.funding.AppreciationFundingViewModel;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.connections.notifyme.modules.fragments.NotifyMeNotFollowedFragment;
import com.instagram.creation.fragment.ManageDraftsFragment;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;
import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.user.model.User;
import go.Seq;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.LPr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48066LPr implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC48066LPr(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC48066LPr(i, obj, obj2), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v375, types: [java.lang.Object, X.2pF] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        int A052;
        int i2;
        Map map;
        C47358Kw7 c47358Kw7;
        String str2;
        String str3;
        MUW muw;
        RecyclerView recyclerView;
        int i3;
        TrackData trackData;
        String audioAssetId;
        String[] strArr;
        Drawable drawable;
        C74P c74p;
        C194808jg c194808jg;
        Context context;
        int i4;
        C47293Kv4 c47293Kv4;
        MN6 mn6;
        GalleryItem galleryItem;
        float f;
        Editable text;
        Number number;
        Object obj;
        switch (this.A00) {
            case 0:
                A052 = C0f9.A05(-1013641700);
                K5O k5o = (K5O) this.A02;
                ViewPager viewPager = k5o.A04;
                C14360o3.A0A(viewPager);
                if (viewPager.getCurrentItem() == AbstractC25226BEj.A05(((C44801JsQ) this.A01).A00)) {
                    InterfaceC50381MMj interfaceC50381MMj = (InterfaceC50381MMj) ((K5K) k5o).A00.get();
                    if (interfaceC50381MMj != null) {
                        SelfieOnboardingActivity.A01((SelfieOnboardingActivity) interfaceC50381MMj);
                    }
                    i2 = 1917201787;
                } else {
                    ViewPager viewPager2 = k5o.A04;
                    C14360o3.A0A(viewPager2);
                    ViewPager viewPager3 = k5o.A04;
                    C14360o3.A0A(viewPager3);
                    viewPager2.setCurrentItem(viewPager3.getCurrentItem() + 1);
                    i2 = 997063445;
                }
                C0f9.A0C(i2, A052);
                return;
            case 1:
                A052 = C0f9.A05(484369624);
                K5Y k5y = (K5Y) this.A02;
                K5Y.A00(LQ0.A01(k5y, 33), k5y);
                i2 = 1426609039;
                C0f9.A0C(i2, A052);
                return;
            case 2:
                A052 = C0f9.A05(659877918);
                K5Y k5y2 = (K5Y) this.A02;
                if (((K5L) k5y2).A00 != null) {
                    K5Y.A00(LQ0.A01(k5y2, 34), k5y2);
                }
                i2 = 437709103;
                C0f9.A0C(i2, A052);
                return;
            case 3:
                A052 = C0f9.A05(1736947100);
                C45523KDo c45523KDo = ((C45629KHs) this.A02).A00;
                C48311LZk c48311LZk = (C48311LZk) this.A01;
                String str4 = c48311LZk.A04;
                Long l = c48311LZk.A01;
                Long l2 = c48311LZk.A00;
                if (l != null && l2 != null) {
                    map = AbstractC167007dF.A0n(l, l2);
                } else {
                    map = null;
                }
                CreatorLoggingData A00 = AbstractC46602Kjf.A00(c45523KDo.requireArguments());
                ((LLN) c45523KDo.A00.getValue()).A07(Boolean.valueOf(A00.A01), Boolean.valueOf(A00.A02), null, null, C05F.A1F, C05F.A05, A00.A00, map, AbstractC167007dF.A0n("media_id", str4));
                AbstractC35212Fg5.A02(c45523KDo.requireActivity(), AbstractC166987dD.A0r(c45523KDo.A01), str4, C45523KDo.__redex_internal_original_name, AbstractC166987dD.A1G(), false, false, true);
                i2 = -374808901;
                C0f9.A0C(i2, A052);
                return;
            case 4:
                A052 = C0f9.A05(293616023);
                C47242KuF c47242KuF = ((KHI) this.A02).A00;
                C48314LZn c48314LZn = (C48314LZn) this.A01;
                String str5 = c48314LZn.A04;
                String str6 = c48314LZn.A03;
                C45521KDm c45521KDm = c47242KuF.A00;
                Parcelable parcelable = c45521KDm.requireArguments().getParcelable("arg_appreciation_logging_fan_data");
                if (parcelable != null) {
                    AppreciationFundingViewModel appreciationFundingViewModel = (AppreciationFundingViewModel) c45521KDm.A06.getValue();
                    String A0t = AbstractC31173DnH.A0t(c45521KDm.A05);
                    String str7 = ((LoggingFanData) parcelable).A02;
                    AbstractC167017dG.A1R(A0t, str7);
                    if (!appreciationFundingViewModel.A00) {
                        appreciationFundingViewModel.A00 = true;
                        AbstractC166987dD.A1Z(new MAv(appreciationFundingViewModel, str6, str5, A0t, str7, null, 0), AbstractC141776au.A00(appreciationFundingViewModel));
                    }
                    i2 = -250354425;
                    C0f9.A0C(i2, A052);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 5:
                A052 = C0f9.A05(574417119);
                C47245KuI c47245KuI = ((KI4) this.A02).A00;
                C48312LZl c48312LZl = (C48312LZl) this.A01;
                String str8 = c48312LZl.A03;
                ImageUrl imageUrl = c48312LZl.A00;
                ImageUrl imageUrl2 = c48312LZl.A01;
                C44552Jmy c44552Jmy = (C44552Jmy) c47245KuI.A00.A08.getValue();
                InterfaceC50392MMu interfaceC50392MMu = (InterfaceC50392MMu) c44552Jmy.A07.getValue();
                int i5 = -1;
                if (interfaceC50392MMu instanceof C45166Jz7) {
                    int i6 = 0;
                    Iterator it = ((List) ((C45166Jz7) interfaceC50392MMu).A00.A03).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C14360o3.A0K(((C45114Jxj) it.next()).A05, str8)) {
                                i5 = i6;
                            } else {
                                i6++;
                            }
                        }
                    }
                }
                AbstractC166987dD.A1Z(new MCB(c44552Jmy, interfaceC50392MMu, imageUrl, imageUrl2, null, i5, 0), AbstractC141776au.A00(c44552Jmy));
                i2 = 1810668270;
                C0f9.A0C(i2, A052);
                return;
            case 6:
                A052 = C0f9.A05(-617984722);
                C44658Jq3 c44658Jq3 = (C44658Jq3) this.A02;
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C47247KuK c47247KuK = c44658Jq3.A00;
                String str9 = ((LZX) this.A01).A02;
                K9J k9j = c47247KuK.A00;
                C44493Jlz c44493Jlz = (C44493Jlz) k9j.A00.getValue();
                Context requireContext = k9j.requireContext();
                C50356MLi c50356MLi = new C50356MLi(k9j, 29);
                File file = (File) c44493Jlz.A00.get(str9);
                if (file != null) {
                    String canonicalPath = file.getCanonicalPath();
                    C14360o3.A07(canonicalPath);
                    c50356MLi.invoke(canonicalPath);
                } else {
                    C3PR c3pr = (C3PR) AbstractC43592JPx.A15(c44493Jlz.A01).get(str9);
                    if (c3pr != null) {
                        c3pr.A01(new C48545Ldi(requireContext, c44493Jlz, str9, c50356MLi));
                    }
                }
                i2 = -364632372;
                C0f9.A0C(i2, A052);
                return;
            case 7:
                A052 = C0f9.A05(449443035);
                C47513Kyg c47513Kyg = ((C45632KHv) this.A02).A00;
                C48317LZq c48317LZq = (C48317LZq) this.A01;
                C2UU c2uu = c47513Kyg.A00.A0A;
                C14360o3.A0C(c2uu, MSV.A00(60));
                int A02 = ((C66362zD) c2uu).A02(c48317LZq.getKey());
                C44506JmC c44506JmC = (C44506JmC) c47513Kyg.A01.A01.getValue();
                TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = c48317LZq.A00;
                C8JW c8jw = C8JW.A0M;
                EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0a;
                C47514Kyh c47514Kyh = c44506JmC.A01;
                UUID uuid = c44506JmC.A00;
                C14360o3.A0B(uuid, 2);
                OriginalSoundData originalSoundData = trackOrOriginalSoundSchema.A00;
                if ((originalSoundData != null && (audioAssetId = originalSoundData.A0I) != null) || ((trackData = trackOrOriginalSoundSchema.A01) != null && (audioAssetId = trackData.getAudioAssetId()) != null)) {
                    UserSession userSession = c47514Kyh.A01;
                    InterfaceC11380iw interfaceC11380iw = c47514Kyh.A00;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_audio_tap");
                    AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                    A0f.AAP("media_compound_key", "");
                    A0f.A8R(enumC39652Hih, "action_source");
                    A0f.A9K("target_id", AbstractC25228BEl.A13(audioAssetId));
                    A0f.AAP("media_tap_token", AbstractC166997dE.A0n());
                    A0f.A9K("media_index", AbstractC31171DnF.A0V(A02));
                    A0f.AAP("viewer_session_id", uuid.toString());
                    A0f.A8R(c8jw, "pivot_page_entry_point");
                    AbstractC25232BEp.A1L(A0f, AbstractC111324zv.A00(71), uuid.toString());
                    AbstractC166987dD.A1Z(new MCP(trackOrOriginalSoundSchema, c8jw, c44506JmC, enumC39652Hih, null, 15), AbstractC141776au.A00(c44506JmC));
                    i2 = 1670925041;
                    C0f9.A0C(i2, A052);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 8:
                A052 = C0f9.A05(1170212724);
                C47513Kyg c47513Kyg2 = ((C45632KHv) this.A02).A00;
                C48317LZq c48317LZq2 = (C48317LZq) this.A01;
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(c47513Kyg2.A01.A01);
                AbstractC166987dD.A1Z(new MCH(c48317LZq2.A00, A0Z, (InterfaceC23621Ds) null, 47), AbstractC141776au.A00(A0Z));
                i2 = -571066614;
                C0f9.A0C(i2, A052);
                return;
            case 9:
                A052 = C0f9.A05(-605549217);
                C45443KAe c45443KAe = (C45443KAe) this.A02;
                C148286ly c148286ly = (C148286ly) this.A01;
                InterfaceC09390do interfaceC09390do = c45443KAe.A02;
                C189478aR A002 = AbstractC25231BEo.A0g(interfaceC09390do).A00();
                C34726FRp A07 = C28531Zo.A04.A02.A07(c45443KAe, AbstractC166987dD.A0r(interfaceC09390do), C2EY.A0O);
                String str10 = c148286ly.A0S;
                C14360o3.A07(str10);
                A07.A06(str10);
                String str11 = c148286ly.A0U;
                Bundle bundle = A07.A07;
                bundle.putString("DirectShareSheetConstants.sticker_name", str11);
                ImageUrl imageUrl3 = c148286ly.A0H;
                C14360o3.A07(imageUrl3);
                bundle.putParcelable("DirectShareSheetConstants.image_url", imageUrl3);
                bundle.putFloat("DirectShareSheetConstants.image_width", c148286ly.A01);
                bundle.putFloat("DirectShareSheetConstants.image_height", c148286ly.A00);
                bundle.putFloat("DirectShareSheetConstants.image_width_ratio", c148286ly.A01());
                A07.A06 = A002;
                A07.A08(false);
                A002.A02(c45443KAe.requireActivity(), A07.A00());
                i2 = 896080018;
                C0f9.A0C(i2, A052);
                return;
            case 10:
                A052 = C0f9.A05(-267606139);
                C45443KAe c45443KAe2 = (C45443KAe) this.A02;
                C148286ly c148286ly2 = (C148286ly) this.A01;
                AbstractC43593JPy.A0K(c45443KAe2).A03(c148286ly2);
                C6XJ A022 = C6XJ.A02(c45443KAe2.requireActivity(), AbstractC167017dG.A0T("unlockable_sticker_type", EnumC46137Kbb.A02, AbstractC166987dD.A1L("unlockable_sticker_id", c148286ly2.A0S)), AbstractC166987dD.A0o(c45443KAe2.A02), TransparentModalActivity.class, "attribution_quick_camera_fragment");
                AbstractC31179DnN.A1S(A022);
                A022.A0D(c45443KAe2, 60571);
                i2 = -545416312;
                C0f9.A0C(i2, A052);
                return;
            case 11:
                A052 = C0f9.A05(26841214);
                C102884kP c102884kP = (C102884kP) this.A02;
                InterfaceC103384lE A0B = c102884kP.A0B(45);
                if (A0B != null) {
                    C6FP.A03((C6FG) this.A01, c102884kP, AbstractC31179DnN.A0I(c102884kP).A00(), A0B);
                }
                i2 = 1224196936;
                C0f9.A0C(i2, A052);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A052 = C0f9.A05(147836809);
                KB7 kb7 = (KB7) this.A02;
                C47522Kyp c47522Kyp = kb7.A00;
                if (c47522Kyp != null) {
                    String A0g = AbstractC167007dF.A0g((EditText) this.A01);
                    C14360o3.A0B(A0g, 0);
                    C6FQ c6fq = c47522Kyp.A00;
                    InterfaceC103384lE interfaceC103384lE = c47522Kyp.A01;
                    C6FX A0s = AbstractC25225BEi.A0s();
                    A0s.A03(A0g, 0);
                    AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
                    kb7.getParentFragmentManager().A12();
                }
                i2 = 1900950137;
                C0f9.A0C(i2, A052);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A052 = C0f9.A05(1543224265);
                if (((BugReportComposerFragment) this.A02).A09) {
                    String A003 = MSV.A00(316);
                    C0K8.A0D(A003, "Ignoring click because we are processing an action");
                    C0f5 AEp = C18950wb.A01.AEp(A003, 817892340);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "Ignoring bug composer click because we are processing an action");
                    AEp.report();
                } else {
                    ((View.OnClickListener) this.A01).onClick(view);
                }
                i2 = 572142272;
                C0f9.A0C(i2, A052);
                return;
            case 14:
                A052 = C0f9.A05(1467834629);
                C44432Jkl c44432Jkl = (C44432Jkl) this.A02;
                int id = ((View) this.A01).getId();
                if (id == c44432Jkl.A00) {
                    c44432Jkl.A00 = 0;
                    Iterator it2 = c44432Jkl.A01.iterator();
                    while (it2.hasNext()) {
                        ((C44431Jkk) it2.next()).setBarSelected(null);
                    }
                } else {
                    c44432Jkl.A00 = id;
                    for (C44431Jkk c44431Jkk : c44432Jkl.A01) {
                        c44431Jkk.setBarSelected(Boolean.valueOf(AbstractC167007dF.A1P(c44431Jkk.getId(), id)));
                    }
                }
                i2 = 395452671;
                C0f9.A0C(i2, A052);
                return;
            case Process.SIGTERM /* 15 */:
                A052 = C0f9.A05(-701550591);
                C47271Kui c47271Kui = ((KEG) this.A02).A05;
                int ordinal = ((C47758L7e) this.A01).A00().ordinal();
                if (ordinal != 1) {
                    if (ordinal == 0) {
                        ELG.A02(c47271Kui.A00);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    ELG.A03(c47271Kui.A00);
                }
                i2 = -1611603050;
                C0f9.A0C(i2, A052);
                return;
            case 16:
                DialogC44330JiS dialogC44330JiS = (DialogC44330JiS) this.A01;
                UserSession userSession2 = (UserSession) this.A02;
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(dialogC44330JiS.A00), "instagram_android_13_notifications_priming_event");
                if (A0f2.isSampled()) {
                    A0f2.AAP("experiment_group", "no_in_test");
                    AbstractC43593JPy.A1J(A0f2, "mock_system_dialog_deny_clicked");
                }
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.add(5, 0);
                calendar.add(6, 100);
                C1GJ.A03(FXB.A01(userSession2, "mute_all", String.valueOf(AbstractC166987dD.A0L(calendar.getTimeInMillis()))));
                dialogC44330JiS.dismiss();
                AbstractC167007dF.A18(AbstractC19730y1.A00(AbstractC12960li.A00).A00, "eligible_to_mock_notification_dialog_showing_quota", AbstractC19730y1.A00(r0).A00.getInt("eligible_to_mock_notification_dialog_showing_quota", 2) - 1);
                return;
            case 17:
                A052 = C0f9.A05(1913145934);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                C44604JpA c44604JpA = (C44604JpA) this.A02;
                int i8 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                interfaceC16660sJ.invoke(c44604JpA.A00.getText().toString());
                i2 = -1118636492;
                C0f9.A0C(i2, A052);
                return;
            case 18:
                A052 = C0f9.A05(-1247837518);
                NotifyMeNotFollowedFragment notifyMeNotFollowedFragment = (NotifyMeNotFollowedFragment) this.A02;
                AbstractC35271Fh6.A08(notifyMeNotFollowedFragment.requireActivity(), new C44093JeI(notifyMeNotFollowedFragment, 3), AbstractC166987dD.A0r(notifyMeNotFollowedFragment.A02), (User) this.A01, "notify_me_not_followed");
                AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(notifyMeNotFollowedFragment.A01);
                AbstractC166987dD.A1Z(new PYX(A0Z2, null, 7), AbstractC141776au.A00(A0Z2));
                i2 = -906745331;
                C0f9.A0C(i2, A052);
                return;
            case Process.SIGSTOP /* 19 */:
                A052 = C0f9.A05(-2028087897);
                C47928LEx c47928LEx = (C47928LEx) this.A02;
                Context A0L = AbstractC166997dE.A0L(view);
                L5D l5d = (L5D) this.A01;
                BackInterceptEditText backInterceptEditText = l5d.A0A;
                Editable text2 = backInterceptEditText.getText();
                C14360o3.A07(text2);
                if (text2.length() == 0) {
                    C47928LEx.A00(c47928LEx, l5d);
                } else {
                    C193328hC A0I = AbstractC31171DnF.A0I(A0L);
                    A0I.A0A(2131968756);
                    A0I.A0M(new DialogInterfaceOnClickListenerC48021LMq(5, l5d, c47928LEx), 2131968757);
                    AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC48023LMs.A00(backInterceptEditText, 11), A0I, 2131968758);
                }
                i2 = 1653909958;
                C0f9.A0C(i2, A052);
                return;
            case 20:
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
                Activity activity = (Activity) this.A02;
                C195838lR c195838lR = viewOnClickListenerC44269JhH.A08;
                c195838lR.getClass();
                EnumC172127lh enumC172127lh = (EnumC172127lh) new HashMap(c195838lR.A06).get("android.permission.CAMERA");
                if (enumC172127lh != null) {
                    int ordinal2 = enumC172127lh.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            return;
                        }
                        WGH.A02(activity, 2131954587);
                        return;
                    } else {
                        C44325JiI c44325JiI = new C44325JiI(viewOnClickListenerC44269JhH, 1);
                        if (viewOnClickListenerC44269JhH.A03 == AbstractC43884Jap.A01) {
                            strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                        } else {
                            strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"};
                        }
                        AbstractC23451Ch.A04(activity, c44325JiI, strArr);
                        return;
                    }
                }
                throw AbstractC166987dD.A14("CAMERA PermissionState not received in permission request");
            case 21:
                ManageDraftsFragment manageDraftsFragment = (ManageDraftsFragment) this.A01;
                Draft draft = (Draft) this.A02;
                C14360o3.A0B(draft, 0);
                AnonymousClass840 anonymousClass840 = manageDraftsFragment.A01;
                if (anonymousClass840 == null) {
                    return;
                }
                if (manageDraftsFragment.A02) {
                    KEC kec = manageDraftsFragment.A00;
                    if (kec == null) {
                        AbstractC31171DnF.A0t();
                        throw C00O.createAndThrow();
                    }
                    Map map2 = kec.A03;
                    C47531Kyy c47531Kyy = (C47531Kyy) map2.get(draft);
                    C47531Kyy c47531Kyy2 = c47531Kyy;
                    if (c47531Kyy == null) {
                        Object obj2 = new Object();
                        map2.put(draft, obj2);
                        c47531Kyy2 = obj2;
                    }
                    c47531Kyy2.A00 = kec.A00;
                    ArrayList arrayList = kec.A02;
                    boolean contains = arrayList.contains(draft);
                    c47531Kyy2.A01 = contains;
                    if (contains) {
                        arrayList.remove(draft);
                    } else {
                        arrayList.add(draft);
                    }
                    KEC.A00(kec);
                    return;
                }
                C47Z A03 = C25A.A00(manageDraftsFragment.getSession()).A03(draft.A04);
                if (A03 != null) {
                    C75L.A00(manageDraftsFragment.requireActivity(), manageDraftsFragment.getSession()).A0L();
                    if (A03.A0x() || A03.A0t()) {
                        MYZ A01 = MX1.A01(manageDraftsFragment.getSession());
                        C24Q c24q = A01.A0B;
                        long A032 = c24q.A03(288425357, 15000L);
                        A01.A02 = A032;
                        c24q.A0A(A032, "camera_destination", "feed");
                    }
                    if (A03.A0t()) {
                        OOR.A01(manageDraftsFragment.getSession(), A03);
                    }
                    OOR.A00(manageDraftsFragment, manageDraftsFragment.getSession(), anonymousClass840, A03, "feed_draft_list_item_tap");
                } else {
                    MX1.A01(manageDraftsFragment.getSession()).A07(AbstractC111324zv.A00(3673));
                }
                AnonymousClass840 anonymousClass8402 = manageDraftsFragment.A01;
                if (anonymousClass8402 != null && AbstractC43593JPy.A0R(anonymousClass8402).A0M) {
                    Context requireContext2 = manageDraftsFragment.requireContext();
                    C14360o3.A0C(requireContext2, "null cannot be cast to non-null type android.app.Activity");
                    LBU.A01((Activity) requireContext2, null, manageDraftsFragment.getSession(), anonymousClass840, 10001);
                }
                if (!manageDraftsFragment.A03) {
                    return;
                }
                AbstractC25227BEk.A1B(manageDraftsFragment);
                return;
            case 22:
                A052 = C0f9.A05(-117797141);
                C43888Jav c43888Jav = (C43888Jav) this.A02;
                if (c43888Jav != null) {
                    ((C43858JaO) c43888Jav.A01).A00.A0F.A00.A0Y((Integer) this.A01);
                }
                i2 = -634478310;
                C0f9.A0C(i2, A052);
                return;
            case 23:
                A052 = C0f9.A05(1493657255);
                KNG kng = (KNG) this.A01;
                C148276lx c148276lx = ((C148306m0) kng).A00;
                if (c148276lx != null) {
                    C209809Pq c209809Pq = (C209809Pq) this.A02;
                    InterfaceC16610sE interfaceC16610sE = kng.A01;
                    Boolean valueOf = Boolean.valueOf(AbstractC167007dF.A1X(kng.A00, EnumC46147Kbl.A04));
                    String str12 = c148276lx.A0Z;
                    Drawable drawable2 = c209809Pq.A00;
                    Integer num = null;
                    if ((drawable2 instanceof C194808jg) && (c194808jg = (C194808jg) drawable2) != null) {
                        drawable = (Drawable) AbstractC001800i.A0A(c194808jg.A05());
                    } else {
                        drawable = null;
                    }
                    if ((drawable instanceof C74P) && (c74p = (C74P) drawable) != null) {
                        num = Integer.valueOf(c74p.A02);
                    }
                    interfaceC16610sE.invoke(valueOf, str12, num);
                }
                i2 = 1246542089;
                C0f9.A0C(i2, A052);
                return;
            case 24:
                A052 = C0f9.A05(-253379970);
                ((InterfaceC186108Ne) this.A02).Don((StickerTraySectionCTAType) ((C45127Jxw) this.A01).A00);
                i2 = 1978788590;
                C0f9.A0C(i2, A052);
                return;
            case 25:
                A052 = C0f9.A05(-1285057288);
                LIj lIj = (LIj) this.A02;
                Object obj3 = this.A01;
                IgImageView igImageView = lIj.A0C;
                if (igImageView.isActivated()) {
                    igImageView.setSelected(!igImageView.isSelected());
                    C95334Qt c95334Qt = lIj.A03;
                    if (c95334Qt != null) {
                        float f2 = 0.0f;
                        if (igImageView.isSelected()) {
                            f2 = 1.0f;
                        }
                        c95334Qt.EhH(f2);
                    }
                    context = igImageView.getContext();
                    i4 = 2131976742;
                    if (igImageView.isSelected()) {
                        i4 = 2131976743;
                    }
                } else {
                    if (!C14360o3.A0K(obj3, C208509Kk.A00)) {
                        context = igImageView.getContext();
                        i4 = 2131976740;
                    }
                    i2 = 778282411;
                    C0f9.A0C(i2, A052);
                    return;
                }
                C9GR.A07(context, i4);
                i2 = 778282411;
                C0f9.A0C(i2, A052);
                return;
            case 26:
                A052 = C0f9.A05(-1570686580);
                view.performHapticFeedback(3);
                C45748KNb c45748KNb = (C45748KNb) this.A02;
                int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                InterfaceC193828i3 interfaceC193828i3 = c45748KNb.A04;
                if (interfaceC193828i3 != null) {
                    interfaceC193828i3.DRf(((KNW) this.A01).A00, c45748KNb.getBindingAdapterPosition());
                }
                i2 = -1459947730;
                C0f9.A0C(i2, A052);
                return;
            case 27:
                A052 = C0f9.A05(-108094012);
                Activity activity2 = (Activity) this.A01;
                AbstractC93174Ft.A01(activity2, new C48291LYp(3, activity2, this.A02));
                i2 = 248153243;
                C0f9.A0C(i2, A052);
                return;
            case 28:
                A052 = C0f9.A05(-672831095);
                if (((View) this.A01).isSelected()) {
                    i2 = 776555051;
                } else {
                    C43830JZt c43830JZt = (C43830JZt) this.A02;
                    OXR oxr = c43830JZt.A00;
                    if (oxr != null) {
                        oxr.A06(C05F.A0Y);
                    }
                    c43830JZt.A0J(C05F.A0C);
                    i2 = -1041166738;
                }
                C0f9.A0C(i2, A052);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A052 = C0f9.A05(-1603120319);
                C45073Jx2 c45073Jx2 = ((AbstractC44757Jre) this.A01).A00;
                if (c45073Jx2 != null && (c47293Kv4 = ((KL2) this.A02).A02) != null && (mn6 = c47293Kv4.A00.A00) != null) {
                    GalleryItem galleryItem2 = c45073Jx2.A0B;
                    C14360o3.A0B(galleryItem2, 0);
                    GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = ((C48603Lef) mn6).A00;
                    if (GestureDetectorOnGestureListenerC43829JZs.A0Q(gestureDetectorOnGestureListenerC43829JZs)) {
                        if (C18U.A06(C06090Tz.A05, gestureDetectorOnGestureListenerC43829JZs.A0z, 36318595642366288L)) {
                            if (gestureDetectorOnGestureListenerC43829JZs.A0I != null && (galleryItem = gestureDetectorOnGestureListenerC43829JZs.A0B) != null && galleryItem.equals(galleryItem2)) {
                                Context context2 = gestureDetectorOnGestureListenerC43829JZs.getContext();
                                if (((FragmentActivity) AbstractC13320mI.A01(context2, FragmentActivity.class)).getSupportFragmentManager().A0Q(KCQ.__redex_internal_original_name) == null) {
                                    Bundle A0b = AbstractC166987dD.A0b();
                                    A0b.putParcelable("PhotoCropFragment.previewItem", gestureDetectorOnGestureListenerC43829JZs.A0B);
                                    Bitmap A0F = AbstractC167007dF.A0F(gestureDetectorOnGestureListenerC43829JZs.getWidth(), gestureDetectorOnGestureListenerC43829JZs.getHeight());
                                    Canvas A06 = AbstractC43592JPx.A06(A0F);
                                    AbstractC59962oe abstractC59962oe = gestureDetectorOnGestureListenerC43829JZs.A0x;
                                    View view2 = abstractC59962oe.mView;
                                    if (view2 != null) {
                                        view2.draw(A06);
                                    }
                                    A06.drawARGB(150, 0, 0, 0);
                                    CropImageView cropImageView = gestureDetectorOnGestureListenerC43829JZs.A1D;
                                    Matrix matrix = ((AbstractC43828JZr) cropImageView).A08;
                                    int width = cropImageView.getWidth();
                                    int height = cropImageView.getHeight();
                                    GalleryItem galleryItem3 = gestureDetectorOnGestureListenerC43829JZs.A0B;
                                    C14360o3.A0A(galleryItem3);
                                    float A004 = GestureDetectorOnGestureListenerC43829JZs.A00(galleryItem3, gestureDetectorOnGestureListenerC43829JZs);
                                    C47291Kv2 c47291Kv2 = new C47291Kv2(gestureDetectorOnGestureListenerC43829JZs);
                                    KCQ kcq = new KCQ();
                                    kcq.A05 = c47291Kv2;
                                    kcq.A02 = width;
                                    kcq.A01 = height;
                                    kcq.A00 = A004;
                                    kcq.A03 = A0F;
                                    if (matrix != null) {
                                        float[] fArr = new float[9];
                                        kcq.A07 = fArr;
                                        matrix.getValues(fArr);
                                    }
                                    String str13 = abstractC59962oe.mTag;
                                    int i10 = R.id.layout_container_main;
                                    if (str13 == C189588ad.__redex_internal_original_name) {
                                        i10 = R.id.quick_capture_outer_container;
                                    }
                                    kcq.setArguments(A0b);
                                    C14240no c14240no = new C14240no(((FragmentActivity) AbstractC13320mI.A01(context2, FragmentActivity.class)).getSupportFragmentManager());
                                    c14240no.A0I(KCQ.__redex_internal_original_name);
                                    c14240no.A0C(kcq, KCQ.__redex_internal_original_name, i10);
                                    c14240no.A00();
                                }
                            }
                        }
                    }
                    GestureDetectorOnGestureListenerC43829JZs.A0L(gestureDetectorOnGestureListenerC43829JZs, false);
                    gestureDetectorOnGestureListenerC43829JZs.A1D.A0P(true, false);
                }
                i2 = -1923277078;
                C0f9.A0C(i2, A052);
                return;
            case 30:
                A052 = C0f9.A05(-1905388505);
                C14240no c14240no2 = new C14240no(((C48625Lf1) this.A02).A07);
                c14240no2.A0D(AbstractC46679Kkw.A00(C05F.A1F, true), KC9.__redex_internal_original_name, ((View) this.A01).getId());
                c14240no2.A0I(null);
                c14240no2.A00();
                i2 = -790997178;
                C0f9.A0C(i2, A052);
                return;
            case 31:
                A052 = C0f9.A05(-665198663);
                ((C47947LGc) this.A01).A01();
                C47540Kz8 c47540Kz8 = (C47540Kz8) this.A02;
                Context context3 = c47540Kz8.A00;
                String A0p = AbstractC166997dE.A0p(context3, 2131955228);
                String string = context3.getString(2131955227);
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                A0Y.A0H = "acr_camera_roll_access_granted";
                A0Y.A0D = A0p;
                A0Y.A0I = string;
                A0Y.A01 = 10000;
                A0Y.A0J = true;
                AbstractC25233BEq.A1F(A0Y);
                UserSession userSession3 = c47540Kz8.A01;
                AbstractC23021Ah.A00(userSession3).A1M(true);
                AnonymousClass229.A01(userSession3).A1R(EnumC50631MWs.A02, "ALLOW_ACCESS_TO_DEVICE_CAMERA_ROLL");
                AbstractC60332pG.A00(context3, userSession3, new Object()).A02();
                i2 = -905375175;
                C0f9.A0C(i2, A052);
                return;
            case 32:
                A052 = C0f9.A05(-1394622196);
                ((C47947LGc) this.A01).A01();
                C47540Kz8 c47540Kz82 = (C47540Kz8) this.A02;
                Context context4 = c47540Kz82.A00;
                String A0p2 = AbstractC166997dE.A0p(context4, 2131955230);
                String string2 = context4.getString(2131955229);
                C146106i8 A0Y2 = AbstractC31174DnI.A0Y();
                A0Y2.A0H = "acr_camera_roll_access_denied";
                A0Y2.A0D = A0p2;
                A0Y2.A0I = string2;
                A0Y2.A01 = 10000;
                A0Y2.A0J = true;
                AbstractC25233BEq.A1F(A0Y2);
                UserSession userSession4 = c47540Kz82.A01;
                AbstractC23021Ah.A00(userSession4).A1M(false);
                AnonymousClass229.A01(userSession4).A1R(EnumC50631MWs.A02, "DENY_ACCESS_TO_DEVICE_CAMERA_ROLL");
                i2 = -1685895476;
                C0f9.A0C(i2, A052);
                return;
            case 33:
                A052 = C0f9.A05(843097019);
                ((C87U) this.A01).DdD(((C3OO) this.A02).getBindingAdapterPosition());
                i2 = 64857533;
                C0f9.A0C(i2, A052);
                return;
            case 34:
                A052 = C0f9.A05(-504497301);
                ((C87U) this.A01).DAo(((C3OO) this.A02).getBindingAdapterPosition());
                i2 = 2118349750;
                C0f9.A0C(i2, A052);
                return;
            case 35:
                A052 = C0f9.A05(-919715311);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.A01;
                constraintLayout.animate().cancel();
                AbstractC43594JPz.A0G(constraintLayout).withEndAction(new M3M(constraintLayout, (C208769Lk) this.A02)).start();
                i2 = -1621786090;
                C0f9.A0C(i2, A052);
                return;
            case 36:
                A052 = C0f9.A05(757185053);
                ((C24042Ale) this.A01).A03(((LZR) this.A02).A00);
                i2 = 797378793;
                C0f9.A0C(i2, A052);
                return;
            case 37:
                A052 = C0f9.A05(-1419250162);
                ((C24042Ale) this.A01).A03(((LZR) this.A02).A00);
                i2 = 808212581;
                C0f9.A0C(i2, A052);
                return;
            case 38:
                A052 = C0f9.A05(1074500666);
                C47295Kv6 c47295Kv6 = (C47295Kv6) this.A02;
                if (c47295Kv6 != null) {
                    Integer num2 = (Integer) ((C51758Mth) this.A01).A00;
                    C14360o3.A0B(num2, 0);
                    C44549Jmt c44549Jmt = c47295Kv6.A00.A03;
                    c44549Jmt.A07.Egh(new JWd(C05F.A01, AbstractC47838LBb.A01(num2)));
                    C44549Jmt.A00(c44549Jmt, num2);
                    c44549Jmt.A00 = num2;
                }
                i2 = 307000970;
                C0f9.A0C(i2, A052);
                return;
            case 39:
                A05 = C0f9.A05(187508536);
                C195838lR c195838lR2 = ((C45513KDd) this.A01).A04;
                c195838lR2.getClass();
                EnumC172127lh enumC172127lh2 = (EnumC172127lh) new HashMap(c195838lR2.A06).get("android.permission.WRITE_EXTERNAL_STORAGE");
                if (enumC172127lh2 != null) {
                    int ordinal3 = enumC172127lh2.ordinal();
                    if (ordinal3 != 1) {
                        if (ordinal3 == 2) {
                            WGH.A02((Activity) this.A02, 2131974429);
                        }
                    } else {
                        AbstractC43592JPx.A1C((Activity) this.A02, new C44325JiI(this, 3), "android.permission.WRITE_EXTERNAL_STORAGE");
                    }
                    i = 1615246348;
                    C0f9.A0C(i, A05);
                    return;
                }
                IllegalStateException A14 = AbstractC166987dD.A14("STORAGE PermissionState not received in permission request");
                C0f9.A0C(-1780359018, A05);
                throw A14;
            case 40:
                A05 = C0f9.A05(-2039969256);
                C45490KCf c45490KCf = (C45490KCf) this.A02;
                C18240vB c18240vB = C45490KCf.A0O;
                C195838lR c195838lR3 = c45490KCf.A08;
                if (c195838lR3 != null) {
                    EnumC172127lh enumC172127lh3 = (EnumC172127lh) new HashMap(c195838lR3.A06).get("android.permission.WRITE_EXTERNAL_STORAGE");
                    if (enumC172127lh3 != null) {
                        int ordinal4 = enumC172127lh3.ordinal();
                        if (ordinal4 != 1) {
                            if (ordinal4 == 2) {
                                WGH.A01((Activity) this.A01);
                            }
                        } else {
                            AbstractC43592JPx.A1C((Activity) this.A01, new C44325JiI(c45490KCf, 4), "android.permission.WRITE_EXTERNAL_STORAGE");
                        }
                        i = 211677445;
                    } else {
                        IllegalStateException A142 = AbstractC166987dD.A14("STORAGE PermissionState not received in permission request");
                        C0f9.A0C(1067940160, A05);
                        throw A142;
                    }
                } else {
                    i = 1607960400;
                }
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A05 = C0f9.A05(753437780);
                C45678KJp c45678KJp = (C45678KJp) this.A02;
                C161247Kj c161247Kj = c45678KJp.A04;
                LZZ lzz = (LZZ) this.A01;
                C45097JxR c45097JxR = lzz.A00;
                AnonymousClass541 anonymousClass541 = (AnonymousClass541) c45097JxR.A04;
                C14360o3.A0B(anonymousClass541, 0);
                if (anonymousClass541.A02) {
                    InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(c161247Kj.A00, "ig_click_send_avatar_power_up");
                    if (A0f3.isSampled()) {
                        A0f3.A9K("client_timestamp_ms", AbstractC31173DnH.A0g());
                        A0f3.AAP("send_source", "direct_composer");
                        A0f3.Cht();
                    }
                }
                C43888Jav c43888Jav2 = c45678KJp.A01;
                String obj4 = lzz.A01.A04.toString();
                C14360o3.A0B(obj4, 0);
                LGG lgg = (LGG) c43888Jav2.A01;
                C7UR c7ur = lgg.A0C;
                String url = ((ImageUrl) c45097JxR.A03).getUrl();
                C49469Lti c49469Lti = new C49469Lti(c45097JxR, lgg, obj4);
                C7UR c7ur2 = C7UR.A0A;
                c7ur.A05(c49469Lti, url);
                i = 629247929;
                C0f9.A0C(i, A05);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = C0f9.A05(539409565);
                Jn5 jn5 = (Jn5) this.A01;
                String A0j = AbstractC167017dG.A0j();
                LRZ lrz = (LRZ) this.A02;
                String A0g2 = AbstractC167007dF.A0g(lrz.A03.A03);
                KLD kld = lrz.A04;
                long A005 = kld.A00();
                int i11 = ((AbstractC13100lw) kld).A00;
                ((AbstractC13100lw) kld).A00 = 0;
                C51618MrB c51618MrB = new C51618MrB(null, A0j, A0g2, i11, A005, false);
                C166017bT c166017bT = jn5.A04;
                C167607eG A006 = c166017bT.A00(c51618MrB.A04);
                MediaCommentListRepository mediaCommentListRepository = jn5.A05;
                InterfaceC38371qR interfaceC38371qR = jn5.A06.A00;
                if (interfaceC38371qR != null) {
                    if (A006 != null) {
                        str = A006.A04;
                    } else {
                        str = null;
                    }
                    mediaCommentListRepository.A0G(null, LXH.A00, new C29117Csi(jn5, 5), c51618MrB, null, null, interfaceC38371qR, str);
                    c166017bT.A01();
                    jn5.A0C.Egh(C48664Lfr.A00);
                    i = -1956884003;
                    C0f9.A0C(i, A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 43:
                A05 = C0f9.A05(501954706);
                ((AbstractC46509Ki8) this.A01).A00();
                ((MQZ) this.A02).DAt();
                i = -517562569;
                C0f9.A0C(i, A05);
                return;
            case 44:
                A05 = C0f9.A05(-929183744);
                ((AbstractC46509Ki8) this.A01).A00();
                ((MQZ) this.A02).Daq();
                i = 1690043322;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A05 = C0f9.A05(1388699428);
                C140966Yy A0r = AbstractC25225BEi.A0r((FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                A0r.A0D(new C46051Ka6());
                A0r.A04();
                i = -1812207329;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(-461605802);
                C46054Ka9 c46054Ka9 = (C46054Ka9) this.A02;
                InterfaceC09390do interfaceC09390do2 = c46054Ka9.A0B;
                AbstractC43594JPz.A0T(Jn4.A00(interfaceC09390do2), "TURN_ON_SECURE_STORAGE", interfaceC09390do2).A04(c46054Ka9.requireActivity(), (EnumC46167Kc5) this.A01);
                i = -622059092;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = C0f9.A05(464719982);
                C46054Ka9 c46054Ka92 = (C46054Ka9) this.A02;
                InterfaceC09390do interfaceC09390do3 = c46054Ka92.A0B;
                AbstractC43594JPz.A0T(Jn4.A00(interfaceC09390do3), "TURN_ON_SECURE_STORAGE", interfaceC09390do3).A04(c46054Ka92.requireActivity(), (EnumC46167Kc5) this.A01);
                i = -1561798728;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A052 = C0f9.A05(1882629607);
                Float A0n = AnonymousClass010.A0n(AbstractC167007dF.A0g((EditText) this.A01));
                if (A0n != null) {
                    f = A0n.floatValue();
                } else {
                    f = 0.0f;
                }
                Jn4 jn4 = (Jn4) this.A02;
                InterfaceC19610xo ARD = ((C3LC) jn4.A0D.getValue()).A00.ARD();
                ARD.E7A("CUSTOM_DISK_SPACE_THRESHOLD", f);
                ARD.apply();
                Jn4.A03(jn4, 2131966647);
                i2 = 776177862;
                C0f9.A0C(i2, A052);
                return;
            case 49:
                A05 = C0f9.A05(804301494);
                ((C44567Jnr) this.A01).A02.DNO((C44178Jfh) this.A02);
                i = -1652586357;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A052 = C0f9.A05(626883748);
                C48733Lh1 c48733Lh1 = (C48733Lh1) this.A02;
                UserSession userSession5 = c48733Lh1.A0G;
                C18920wW A0O = AbstractC31176DnK.A0O(userSession5, "ig_direct_expression_tray");
                DirectThreadKey directThreadKey = c48733Lh1.A0S;
                String str14 = c48733Lh1.A0U;
                C51753Mtc c51753Mtc = (C51753Mtc) this.A01;
                AbstractC47343Kvs abstractC47343Kvs = (AbstractC47343Kvs) c51753Mtc.A02;
                if (abstractC47343Kvs instanceof KQA) {
                    muw = ((KQA) abstractC47343Kvs).A00;
                } else if (abstractC47343Kvs instanceof KQB) {
                    muw = ((KQB) abstractC47343Kvs).A01;
                } else {
                    muw = ((KQ9) abstractC47343Kvs).A00;
                }
                AbstractC46702KlL.A00(muw, A0O, userSession5, directThreadKey, str14);
                C3DN c3dn = c48733Lh1.A0T;
                if (c3dn != null) {
                    c3dn.A0G(1.0f);
                }
                InterfaceC09390do interfaceC09390do4 = c48733Lh1.A0V;
                ((AbstractC110824yu) interfaceC09390do4.getValue()).A00 = c51753Mtc.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession5, 36329612234277305L)) {
                    GridLayoutManager gridLayoutManager = c48733Lh1.A0E;
                    int A1a = gridLayoutManager.A1a() - ((AbstractC110824yu) interfaceC09390do4.getValue()).A00;
                    int A072 = AbstractC25225BEi.A07(c06090Tz, userSession5, 36611087211108607L);
                    str2 = "recyclerView";
                    if (A1a > A072) {
                        gridLayoutManager.A1O(((AbstractC110824yu) interfaceC09390do4.getValue()).A00 + A072);
                        recyclerView = c48733Lh1.A06;
                        if (recyclerView != null) {
                            i3 = 6;
                            recyclerView.addOnLayoutChangeListener(new LQ9(c48733Lh1, i3));
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    if (A1a < (-A072)) {
                        gridLayoutManager.A1O(((AbstractC110824yu) interfaceC09390do4.getValue()).A00 - A072);
                        recyclerView = c48733Lh1.A06;
                        if (recyclerView != null) {
                            i3 = 7;
                            recyclerView.addOnLayoutChangeListener(new LQ9(c48733Lh1, i3));
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    i2 = -376514056;
                    C0f9.A0C(i2, A052);
                    return;
                }
                c48733Lh1.A0E.A10((AbstractC110824yu) interfaceC09390do4.getValue());
                i2 = -376514056;
                C0f9.A0C(i2, A052);
                return;
            case 51:
                A05 = C0f9.A05(898369020);
                IgdExpressionTrayHscrollLayout igdExpressionTrayHscrollLayout = (IgdExpressionTrayHscrollLayout) this.A02;
                igdExpressionTrayHscrollLayout.setSelectedIndex(igdExpressionTrayHscrollLayout.A00.indexOfChild(view));
                ((View.OnClickListener) this.A01).onClick(view);
                i = -1157282089;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A05 = C0f9.A05(1987560164);
                KDM kdm = (KDM) this.A02;
                UserSession A0r2 = AbstractC166987dD.A0r(kdm.A0Q);
                FragmentActivity activity3 = kdm.getActivity();
                ThemeViewModelDelegate themeViewModelDelegate = kdm.A07;
                if (themeViewModelDelegate == null) {
                    C14360o3.A0F("currentTheme");
                    throw C00O.createAndThrow();
                }
                WEz A012 = AbstractC69993VzD.A01(activity3, kdm, A0r2, EnumC65855TvH.A0n, VG2.A0n, themeViewModelDelegate.A09);
                A012.A07(EnumC39619HeT.A06);
                WEz.A00((C189478aR) this.A01, A012);
                i = 1407292851;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A052 = C0f9.A05(-216229554);
                L6H l6h = ((KHU) this.A02).A00;
                PollMessageOptionViewModel pollMessageOptionViewModel = (PollMessageOptionViewModel) this.A01;
                LJc lJc = l6h.A00;
                C47359Kw8 c47359Kw8 = lJc.A06;
                C3o9 c3o9 = lJc.A07;
                InterfaceC02590Ai A0f4 = AbstractC166987dD.A0f(c47359Kw8.A00, "show_voters");
                C0Zx c0Zx = new C0Zx();
                String A073 = JRE.A07(c3o9);
                if (A073 != null) {
                    c0Zx.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A073);
                    AbstractC43592JPx.A1L(A0f4, c0Zx);
                    KC1 kc1 = lJc.A02;
                    if (kc1 != null && (c47358Kw7 = kc1.A03) != null) {
                        boolean z = kc1.A09;
                        KCZ kcz = c47358Kw7.A00;
                        InterfaceC09390do interfaceC09390do5 = kcz.A06;
                        C2DS A007 = AbstractC28761aE.A00(AbstractC166987dD.A0r(interfaceC09390do5));
                        String str15 = kcz.A03;
                        str2 = "threadId";
                        if (str15 != null) {
                            C81663kb C76 = A007.C76(str15);
                            if (C76 != null) {
                                str3 = C76.C7q();
                            } else {
                                str3 = null;
                            }
                            if (z) {
                                C142846ck A0V = AbstractC31176DnK.A0V(interfaceC09390do5);
                                String str16 = kcz.A03;
                                if (str16 != null) {
                                    C25531Mh A0I2 = AbstractC31172DnG.A0I(A0V);
                                    if (AbstractC25226BEj.A1Z(A0I2)) {
                                        AbstractC31175DnJ.A1B(A0I2, A0V);
                                        AbstractC31174DnI.A1J(A0I2, "retrieve_polls_responses_details");
                                        AbstractC43593JPy.A1N(A0I2, "poll_responses");
                                        A0I2.A0h(AbstractC31179DnN.A0Z(A0I2, "instagram", str16, str3));
                                        A0I2.Cht();
                                    }
                                }
                            }
                            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do5);
                            String str17 = kcz.A03;
                            if (str17 != null) {
                                C14360o3.A0B(A0o, 0);
                                Bundle A0D = AbstractC31174DnI.A0D(A0o);
                                A0D.putBoolean("DirectPollMessageVotersFragment_ARGS_IS_BROADCAST_CHAT_THREAD", z);
                                A0D.putParcelable("DirectPollMessageVotersFragment_OPTION_VIEW_MODEL", pollMessageOptionViewModel);
                                A0D.putString("DirectPollMessageVotersFragment_ARGS_THREAD_ID", str17);
                                A0D.putString("DirectPollMessageVotersFragment_ARGS_THREAD_V2_ID", str3);
                                C45498KCn c45498KCn = new C45498KCn();
                                c45498KCn.setArguments(A0D);
                                AbstractC10360h2 abstractC10360h2 = kcz.A02;
                                if (abstractC10360h2 == null) {
                                    str2 = "childFragMan";
                                } else {
                                    C14240no c14240no3 = new C14240no(abstractC10360h2);
                                    c14240no3.A0I(null);
                                    AbstractC43593JPy.A1D(c45498KCn, c14240no3);
                                }
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    i2 = -1078960151;
                    C0f9.A0C(i2, A052);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 54:
                A05 = C0f9.A05(427434943);
                C44750JrX c44750JrX = (C44750JrX) this.A02;
                int i12 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c44750JrX.A08.invoke(this.A01);
                i = 110415160;
                C0f9.A0C(i, A05);
                return;
            case 55:
                A052 = C0f9.A05(1650702589);
                KBZ kbz = (KBZ) this.A02;
                IgEditText igEditText = kbz.A03;
                if (igEditText != null && (((text = igEditText.getText()) == null || text.length() == 0) && (number = (Number) ((C51755Mte) ((C44520JmQ) kbz.A0N.getValue()).A05.getValue()).A00) != null)) {
                    Drawable drawable3 = (Drawable) this.A01;
                    int intValue = number.intValue();
                    IgEditText igEditText2 = kbz.A03;
                    if (igEditText2 != null) {
                        igEditText2.setText(AbstractC25225BEi.A0H(kbz.requireContext().getString(intValue)));
                    }
                    KBZ.A00(drawable3, kbz, kbz.A0D);
                }
                i2 = 702842560;
                C0f9.A0C(i2, A052);
                return;
            case 56:
                A05 = C0f9.A05(-272275714);
                ((C44117Jeh) this.A01).A02(EnumC43799JYm.A05);
                ((C189478aR) this.A02).A07();
                i = -1700493822;
                C0f9.A0C(i, A05);
                return;
            case 57:
                A05 = C0f9.A05(-1390621437);
                C44752JrZ c44752JrZ = (C44752JrZ) this.A02;
                int i13 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                LE1 le1 = c44752JrZ.A09;
                String str18 = ((C48313LZm) this.A01).A05;
                LE1.A00(le1, "igd_campaign_message_item_click", AbstractC167007dF.A0n(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str18));
                C83693oE c83693oE = new C83693oE(str18);
                Activity activity4 = c44752JrZ.A00;
                UserSession userSession6 = c44752JrZ.A03;
                AbstractC59962oe abstractC59962oe2 = c44752JrZ.A02;
                C36881nl A013 = C36881nl.A01(activity4, abstractC59962oe2, userSession6, "direct_ctd_campaign_messages");
                A013.A00 = abstractC59962oe2;
                A013.A0B = c83693oE;
                A013.A0s = true;
                A013.A0F = 92887;
                A013.A06();
                i = 2006957333;
                C0f9.A0C(i, A05);
                return;
            case 58:
                A05 = C0f9.A05(45556372);
                C45466KBb.A0T((C45466KBb) this.A02, (List) this.A01);
                i = 1448527627;
                C0f9.A0C(i, A05);
                return;
            case 59:
                A052 = C0f9.A05(1579343240);
                AnonymousClass693 anonymousClass693 = (AnonymousClass693) this.A01;
                if (anonymousClass693 != null) {
                    anonymousClass693.E4S();
                }
                C45466KBb c45466KBb = (C45466KBb) this.A02;
                Jn6 A023 = C45466KBb.A02(c45466KBb);
                C05A c05a = A023.A0B;
                List list = A023.A08;
                if (list != null) {
                    int i14 = A023.A00;
                    A023.A00 = i14 + 1;
                    obj = list.get(i14 % A023.A0L);
                } else {
                    obj = null;
                }
                c05a.Egh(obj);
                AbstractC135966Db.A01(AbstractC166987dD.A0r(c45466KBb.A1V)).A0C(EnumC46303KeZ.A0N);
                i2 = -99087727;
                C0f9.A0C(i2, A052);
                return;
            case 60:
                A05 = C0f9.A05(-2051072359);
                C45516KDh c45516KDh = (C45516KDh) this.A01;
                Object obj5 = this.A02;
                InterfaceC09390do interfaceC09390do6 = c45516KDh.A04;
                ((C44524JmU) interfaceC09390do6.getValue()).A02.Egh(obj5);
                ((C44524JmU) interfaceC09390do6.getValue()).A01();
                AbstractC25226BEj.A1Q(c45516KDh);
                i = -1079625841;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A05 = C0f9.A05(-1495119678);
                C45516KDh c45516KDh2 = ((KIU) this.A02).A02;
                NoteAudienceItem noteAudienceItem = ((C47647L2g) this.A01).A02;
                C14360o3.A0B(noteAudienceItem, 0);
                InterfaceC09390do interfaceC09390do7 = c45516KDh2.A04;
                ((C44524JmU) interfaceC09390do7.getValue()).A02.Egh(noteAudienceItem);
                ((C44524JmU) interfaceC09390do7.getValue()).A01();
                i = 436008637;
                C0f9.A0C(i, A05);
                return;
            case 62:
                A052 = C0f9.A05(698763562);
                C48757LhP c48757LhP = (C48757LhP) this.A02;
                User A0k = AbstractC31174DnI.A0k(c48757LhP.A04, ((C45216Jzw) this.A01).A02.getId());
                if (A0k != null) {
                    AbstractC35271Fh6.A06(c48757LhP.A00, new DialogInterfaceOnClickListenerC48021LMq(12, A0k, c48757LhP), null, c48757LhP.A03, null, A0k);
                    C48757LhP.A00(c48757LhP);
                }
                i2 = 638540020;
                C0f9.A0C(i2, A052);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A05 = C0f9.A05(-1889692632);
                C48757LhP c48757LhP2 = (C48757LhP) this.A02;
                C45216Jzw c45216Jzw = (C45216Jzw) this.A01;
                UserSession userSession7 = c48757LhP2.A04;
                WEz.A00(null, AbstractC69993VzD.A01(c48757LhP2.A00, c48757LhP2.A03, userSession7, EnumC65855TvH.A0w, VG2.A0e, String.valueOf(c45216Jzw.A00)));
                AbstractC135966Db.A01(userSession7).A0D(EnumC46303KeZ.A0W);
                i = 1119174915;
                C0f9.A0C(i, A05);
                return;
            case 64:
                A05 = C0f9.A05(1216123392);
                C48757LhP c48757LhP3 = (C48757LhP) this.A02;
                User user = ((C45216Jzw) this.A01).A02;
                FragmentActivity fragmentActivity = c48757LhP3.A00;
                C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
                A0H.A05 = AbstractC31178DnM.A0c(fragmentActivity, user, 2131962877);
                A0H.A09(2131962876);
                A0H.A0P(new DialogInterfaceOnClickListenerC48021LMq(11, user, c48757LhP3), EnumC193348hE.A05, 2131962875);
                A0H.A06();
                AbstractC166987dD.A1W(A0H);
                i = 1178199670;
                C0f9.A0C(i, A05);
                return;
            case 65:
                A05 = C0f9.A05(-1531869768);
                C48757LhP c48757LhP4 = (C48757LhP) this.A02;
                String id2 = ((C45216Jzw) this.A01).A02.getId();
                FragmentActivity fragmentActivity2 = c48757LhP4.A00;
                UserSession userSession8 = c48757LhP4.A04;
                C31368DqX.A02(AbstractC25225BEi.A0r(fragmentActivity2, userSession8), userSession8, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(userSession8, id2, "friend_map", c48757LhP4.A03.getModuleName()));
                i = 113573687;
                C0f9.A0C(i, A05);
                return;
            case 66:
                A05 = C0f9.A05(-792239153);
                ((KJW) this.A02).A01.FDS(((C45212Jzs) this.A01).A01);
                i = -166068785;
                C0f9.A0C(i, A05);
                return;
            case 67:
                A05 = C0f9.A05(-1983503217);
                ((KJW) this.A02).A01.CpT(((C45212Jzs) this.A01).A01);
                i = -303781691;
                C0f9.A0C(i, A05);
                return;
            case 68:
                A052 = C0f9.A05(2114629385);
                C43800JYn c43800JYn = (C43800JYn) this.A01;
                int i15 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C4FL c4fl = c43800JYn.A00;
                if (c4fl != null) {
                    C4F8 c4f8 = ((C4FD) this.A02).A02;
                    EnumC152696tw enumC152696tw = EnumC152696tw.POG;
                    NoteAvatarView noteAvatarView = c43800JYn.A04;
                    c4f8.A00(noteAvatarView.A0J, noteAvatarView.getNoteBubbleView(), enumC152696tw, c4fl, false);
                }
                i2 = -1771460211;
                C0f9.A0C(i2, A052);
                return;
            case 69:
                A052 = C0f9.A05(-1905663081);
                C43800JYn c43800JYn2 = (C43800JYn) this.A01;
                int i16 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C4FL c4fl2 = c43800JYn2.A00;
                if (c4fl2 != null) {
                    C4F8 c4f82 = ((C4FD) this.A02).A02;
                    EnumC152696tw enumC152696tw2 = EnumC152696tw.NOTE_BUBBLE;
                    NoteAvatarView noteAvatarView2 = c43800JYn2.A04;
                    c4f82.A00(noteAvatarView2.A0J, noteAvatarView2.getNoteBubbleView(), enumC152696tw2, c4fl2, false);
                }
                i2 = -33815960;
                C0f9.A0C(i2, A052);
                return;
            default:
                A052 = C0f9.A05(-412145248);
                C43800JYn c43800JYn3 = (C43800JYn) this.A01;
                int i17 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C4FL c4fl3 = c43800JYn3.A00;
                if (c4fl3 != null) {
                    C4F8 c4f83 = ((C4FD) this.A02).A02;
                    EnumC152696tw enumC152696tw3 = EnumC152696tw.NOTE_BUBBLE;
                    NoteAvatarView noteAvatarView3 = c43800JYn3.A04;
                    c4f83.A00(noteAvatarView3.A0J, noteAvatarView3.getNoteAnimatedBubbleView().getView(), enumC152696tw3, c4fl3, true);
                }
                i2 = 690901768;
                C0f9.A0C(i2, A052);
                return;
        }
    }
}
