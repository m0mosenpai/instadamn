package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Pfz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57525Pfz extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57525Pfz(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C57525Pfz A00(Object obj, int i) {
        return new C57525Pfz(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C50808McV c50808McV;
        String str;
        C185368Kc c185368Kc;
        C25531Mh A0G;
        InterfaceC02530Ab interfaceC02530Ab;
        String str2;
        UserSession userSession;
        InterfaceC11380iw interfaceC11380iw;
        NKJ nkj;
        String str3;
        switch (this.A00) {
            case 0:
                N6J.A0I((N6J) this.A01);
                return C0eB.A00;
            case 1:
                MSX.A0K((N6J) this.A01).A15(EnumC114925Hg.CLIPS, C81X.A0h);
                return C0eB.A00;
            case 2:
                N6J n6j = (N6J) this.A01;
                MSX.A0K(n6j).A1d(C81W.A08, n6j.A0C);
                return C0eB.A00;
            case 3:
                ((N6J) this.A01).onBackPressed();
                return C0eB.A00;
            case 4:
                N6J n6j2 = (N6J) this.A01;
                return AbstractC55109ObQ.A00(n6j2.requireContext(), AbstractC166987dD.A0r(n6j2.A0U), C05F.A00, false);
            case 5:
                N6J n6j3 = (N6J) this.A01;
                InterfaceC09390do interfaceC09390do = n6j3.A0U;
                O7Z A00 = AbstractC53937NtA.A00(AbstractC166987dD.A0r(interfaceC09390do));
                A00.A01.flowMarkPoint(A00.A00, "COVER_PHOTO_ENTERED");
                MSX.A0K(n6j3).A1C(EnumC53380NjV.A0B, C81X.A0k);
                if (NJR.A04(n6j3) != null && ClipsSharingDraftViewModel.A02(n6j3)) {
                    C47Z A04 = NJR.A04(n6j3);
                    if (A04 != null) {
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        ShareMediaLoggingInfo shareMediaLoggingInfo = ClipsSharingDraftViewModel.A00(n6j3).A0B;
                        String str4 = ClipsSharingDraftViewModel.A00(n6j3).A0T;
                        C14360o3.A0B(A0r, 0);
                        C25A.A00(A0r).A0D(A04, A04.A35);
                        Bundle A05 = AbstractC31178DnM.A05(A0r);
                        A05.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY", A04.A35);
                        if (str4 != null) {
                            A05.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_CLIPS_SESSION_ID", str4);
                        }
                        A05.putParcelable("ClipsConstants.ARG_CLIPS_SHARE_MEDIA_LOGGING_INFO", shareMediaLoggingInfo);
                        NJC njc = new NJC();
                        AbstractC31178DnM.A0y(njc, AbstractC31173DnH.A0J(A05, njc, n6j3), AbstractC166987dD.A0r(interfaceC09390do));
                    }
                } else {
                    N6J.A0J(n6j3);
                }
                return C0eB.A00;
            case 6:
                N6J.A0F((N6J) this.A01);
                return C0eB.A00;
            case 7:
            case 9:
            case 17:
            case 20:
            case 24:
            case 30:
            case 32:
            default:
                return AbstractC25235BEs.A0U(this.A01);
            case 8:
            case 18:
            case 31:
            case 33:
                return AbstractC50523MSb.A0A(this.A01);
            case 10:
                N6J n6j4 = (N6J) this.A01;
                FragmentActivity activity = n6j4.getActivity();
                if (activity != null && !activity.isFinishing()) {
                    AbstractC25235BEs.A1Q(n6j4.A0S);
                }
                ((C95394Qz) n6j4.A0T.getValue()).A01();
                C15370ps A1F = AbstractC25225BEi.A1F();
                if (N6J.A0R(n6j4)) {
                    Intent A042 = AbstractC31171DnF.A04();
                    A1F.A00 = A042;
                    A042.putExtra("ClipsConstants.ARG_CLIPS_SHARE_SHEET_RESULT_CREATION_TYPE", C5JK.A06);
                }
                C47Z A043 = NJR.A04(n6j4);
                EnumC189548aZ enumC189548aZ = null;
                if (A043 != null && (c185368Kc = A043.A12) != null) {
                    enumC189548aZ = c185368Kc.A03;
                }
                if (enumC189548aZ == EnumC189548aZ.A06) {
                    Intent intent = (Intent) A1F.A00;
                    if (intent == null) {
                        intent = AbstractC31171DnF.A04();
                    }
                    A1F.A00 = intent;
                    intent.putExtra("ClipsConstants.ARG_SHOULD_CLOSE_CAMERA_ON_EXIT_REMIX", true);
                }
                C8JY c8jy = n6j4.A02;
                if (c8jy == null) {
                    str = "autoCreatedReelFlowsPerfLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C1QT c1qt = c8jy.A02;
                c1qt.flowMarkPoint(c8jy.A01, "REELS_DRAFT_SAVE_SUCCESS");
                c1qt.flowEndSuccess(c8jy.A01);
                c8jy.A01 = 0L;
                if (!N6J.A0R(n6j4)) {
                    InterfaceC09390do interfaceC09390do2 = n6j4.A0U;
                    if (C1LE.A0C(AbstractC166987dD.A0r(interfaceC09390do2))) {
                        n6j4.APl();
                        Intent intent2 = (Intent) A1F.A00;
                        ME0 A1G = MSW.A1G(n6j4, A1F, 22);
                        C34726FRp A08 = C28531Zo.A04.A02.A08(AbstractC166987dD.A0r(interfaceC09390do2), C2EY.A0V, n6j4.getModuleName());
                        A08.A02 = new C56379P1o(n6j4, A1G);
                        A08.A07.putBoolean("DirectShareSheetConstants.show_just_saved_draft_message", true);
                        A08.A01();
                        A08.A00 = new FIO(intent2, n6j4);
                        DirectShareSheetFragment A002 = A08.A00();
                        C3DN A0l = AbstractC43593JPy.A0l(n6j4, C3DN.A00);
                        if (A0l != null) {
                            A0l.A0K(A002);
                        }
                        return C0eB.A00;
                    }
                }
                N6J.A0A((Intent) A1F.A00, n6j4, 9685);
                return C0eB.A00;
            case 11:
                C128175qm A03 = NJR.A03(((NJO) this.A01).A0D);
                if (A03 != null && (str3 = A03.A0d) != null) {
                    return str3;
                }
                return "";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                P0G p0g = (P0G) this.A01;
                if (!AbstractC55222Oeo.A0A(p0g.A06) && (c50808McV = p0g.A03) != null) {
                    c50808McV.A06(OX2.A02(p0g.A07));
                }
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                NJK njk = (NJK) this.A01;
                C55904Ort c55904Ort = njk.A04;
                if (c55904Ort != null) {
                    List list = OX2.A01(njk).A08.A04;
                    AbstractC50867Mdy A052 = njk.A05();
                    C14360o3.A0C(A052, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                    ArrayList arrayList = ((NJQ) A052).A08.A00;
                    AbstractC50867Mdy A053 = njk.A05();
                    C14360o3.A0C(A053, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                    c55904Ort.A00(null, "tag_people_row", arrayList, list, ((NJQ) A053).A08.A01);
                    return C0eB.A00;
                }
                str = "tagProductsRowNavigator";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 14:
                return Boolean.valueOf(OX2.A01((OX2) this.A01).A0G());
            case Process.SIGTERM /* 15 */:
                NJK njk2 = (NJK) this.A01;
                UserSession userSession2 = njk2.A0I;
                C22P c22p = ((C22F) AnonymousClass229.A01(userSession2)).A04.A09;
                C14360o3.A07(c22p);
                return new P0H(new OXR(AbstractC53855Nrj.A00(c22p), njk2.A0H, userSession2), userSession2);
            case 16:
                FollowersShareFragment.A0G((FollowersShareFragment) this.A01);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                return new O7Z((UserSession) this.A01);
            case 21:
                return new C52276NBr(AbstractC166987dD.A0r(((N7G) this.A01).A04), C05F.A01);
            case 22:
                C23031Ai A003 = AbstractC23021Ah.A00(((C52276NBr) this.A01).A01);
                return AbstractC31172DnG.A0s(AbstractC167017dG.A1b(A003, A003.A4e, C23031Ai.A8c, 196));
            case 23:
                C23031Ai A004 = AbstractC23021Ah.A00(((C52276NBr) this.A01).A01);
                AbstractC167007dF.A1L(A004, A004.A4e, C23031Ai.A8c, 196, true);
                return C0eB.A00;
            case 25:
                return new C52276NBr(((C52367NFg) this.A01).A03, C05F.A01);
            case 26:
                ClipsCoverPhotoPickerController clipsCoverPhotoPickerController = (ClipsCoverPhotoPickerController) this.A01;
                Context context = clipsCoverPhotoPickerController.A06;
                UserSession userSession3 = clipsCoverPhotoPickerController.A09;
                AbstractC167017dG.A1N(context, userSession3);
                return AMc.A02(C2Ps.A00(context, userSession3), clipsCoverPhotoPickerController.A0E);
            case 27:
                return this.A01;
            case 28:
                return AbstractC25226BEj.A1C(this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC167027dH.A0B(this.A01);
            case 34:
                Context context2 = (Context) this.A01;
                if (context2 != null) {
                    C0w9.A03("RecommendOnFbUtils", "Failed to update Recommend-on-Facebook Settings");
                    C9GR.A0F(context2, "clips_recommend_on_facebook_update_error", 2131955749);
                }
                return C0eB.A00;
            case 35:
            case 36:
                P1C.A02((P1C) this.A01, null);
                return C0eB.A00;
            case 37:
                C28221Yb A005 = C27S.A00();
                C56364P0z c56364P0z = (C56364P0z) this.A01;
                return A005.A01(c56364P0z.A02, c56364P0z.A03, c56364P0z.A05, c56364P0z.A01.getModuleName());
            case 38:
            case 40:
                C448124l c448124l = P1B.A00((P1B) this.A01).A09;
                A0G = MSW.A0G(c448124l);
                if (AbstractC25226BEj.A1Z(A0G)) {
                    MSW.A1W(A0G);
                    A0G.A0q("SPINS_CREATIVE_TOOL_CANCEL");
                    C448124l.A00(A0G, c448124l);
                    MSY.A1A(A0G);
                    A0G.A0a(EnumC114925Hg.CLIPS);
                    MSW.A1P(EnumC50631MWs.A0L, A0G);
                    interfaceC02530Ab = EnumC53336Nim.SPINNABLE_REEL;
                    str2 = "spin_type";
                    A0G.A0M(interfaceC02530Ab, str2);
                    A0G.Cht();
                }
                return C0eB.A00;
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
                C448724r c448724r = P1B.A00((P1B) this.A01).A0F;
                InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
                if (A0M.isSampled()) {
                    MSW.A1N(C81X.A2S, A0M);
                    AbstractC166987dD.A1S(A0M, MSX.A0f(c448724r.A04));
                    MSW.A1Q(A0M);
                    MSW.A1M(EnumC50631MWs.A0L, A0M);
                    A0M.A8R(EnumC53336Nim.SPINNABLE_REEL, "spin_type");
                    A0M.Cht();
                }
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                P1B p1b = (P1B) this.A01;
                P1B.A02(p1b, true);
                C448624q c448624q = P1B.A00(p1b).A0E;
                A0G = C25531Mh.A0A(c448624q.A01);
                if (AbstractC25226BEj.A1Z(A0G)) {
                    A0G.A0M(C81X.A2S, "tool_type");
                    C448624q.A00(A0G, c448624q);
                    A0G.A0a(EnumC114925Hg.CLIPS);
                    MSW.A1P(EnumC50631MWs.A0L, A0G);
                    A0G.A0M(EnumC53336Nim.SPINNABLE_REEL, "spin_type");
                    MSY.A1A(A0G);
                    interfaceC02530Ab = VHl.A0C;
                    str2 = "sticker_type";
                    A0G.A0M(interfaceC02530Ab, str2);
                    A0G.Cht();
                }
                return C0eB.A00;
            case 43:
                ((P16) this.A01).A05.A08(true);
                return C0eB.A00;
            case 44:
                NKJ nkj2 = (NKJ) this.A01;
                userSession = nkj2.A05;
                interfaceC11380iw = nkj2.A04;
                nkj = nkj2;
                return AbstractC153926w1.A01(interfaceC11380iw, userSession, nkj.A04().A0N);
            case 45:
                NKN.A02((NKN) this.A01, true);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C54401O2h((UserSession) this.A01);
            case 47:
                NK0 nk0 = (NK0) this.A01;
                userSession = nk0.A01;
                interfaceC11380iw = nk0.A00;
                nkj = nk0;
                return AbstractC153926w1.A01(interfaceC11380iw, userSession, nkj.A04().A0N);
            case 48:
                NKK nkk = (NKK) this.A01;
                userSession = nkk.A05;
                interfaceC11380iw = nkk.A04;
                nkj = nkk;
                return AbstractC153926w1.A01(interfaceC11380iw, userSession, nkj.A04().A0N);
            case 49:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
        }
    }
}
