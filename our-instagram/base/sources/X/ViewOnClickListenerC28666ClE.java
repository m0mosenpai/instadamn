package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.schools.management.data.BadgeVisibilitySettingItem;
import com.instagram.schools.management.data.SchoolSettingsRepository;
import com.instagram.schools.management.data.UpdateBadgeNameResponseImpl;
import com.instagram.schools.management.data.UpdateSchoolBadgeVisibilityResponseImpl;
import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallTextPostItem;
import com.instagram.wonderwall.repository.WallPostComposerRepository;
import go.Seq;
import java.io.File;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.ClE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28666ClE implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC28666ClE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static ViewOnClickListenerC28666ClE A00(Object obj, int i) {
        return new ViewOnClickListenerC28666ClE(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC28666ClE(obj, i), view);
    }

    public static void A02(InterfaceC56362iU interfaceC56362iU, Object obj, int i) {
        interfaceC56362iU.EkT(new ViewOnClickListenerC28666ClE(obj, i), true);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r5v38, types: [X.1rF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.0oO, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        String str2;
        String str3;
        C5Hc c5Hc;
        Object obj;
        Fragment A00;
        BottomSheetFragment bottomSheetFragment;
        String str4;
        int i2;
        Medium medium;
        C25671My c25671My;
        String str5;
        InterfaceC58259Ps3 c26233Bix;
        Parcelable parcelable;
        EnumC40111tc enumC40111tc;
        int A052;
        int i3;
        ClipboardManager clipboardManager;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1885566358);
                AbstractC166987dD.A1Y(((C51760Mtj) ((C9BH) this.A01).A00).A01);
                i = 21275407;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-2016831566);
                AbstractC166987dD.A1Y(((C51760Mtj) ((C9BH) this.A01).A00).A02);
                i = -1085080526;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(1260282725);
                AbstractC166987dD.A1Y(((C51760Mtj) ((C9BH) this.A01).A00).A00);
                i = 1765789285;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-706302531);
                C26352Bkx c26352Bkx = (C26352Bkx) this.A01;
                C35265Fh0.A02(c26352Bkx.A00, c26352Bkx.A01, "tifu");
                i = -1474965788;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(1956277308);
                AbstractC166987dD.A1Y(((C9BW) ((C206189Bb) this.A01).A00).A01);
                i = 667700898;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-1159494356);
                C180257zF c180257zF = C180257zF.A00;
                C26851BtD c26851BtD = (C26851BtD) this.A01;
                FragmentActivity requireActivity = c26851BtD.requireActivity();
                InterfaceC09390do interfaceC09390do = c26851BtD.A00;
                c180257zF.A01(AbstractC166987dD.A0r(interfaceC09390do), requireActivity, true);
                OTM A002 = A1G.A00(c26851BtD.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
                if (OTM.A00(A002)) {
                    InterfaceC02590Ai A0P = AbstractC25236BEt.A0P(A002);
                    if (A0P.isSampled()) {
                        A0P.AAP("action", "onboarding_dialog_left_tapped");
                        A0P.Cht();
                    }
                }
                AbstractC25233BEq.A14(c26851BtD);
                i = -988930193;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(934877928);
                C180257zF c180257zF2 = C180257zF.A00;
                C26851BtD c26851BtD2 = (C26851BtD) this.A01;
                FragmentActivity requireActivity2 = c26851BtD2.requireActivity();
                InterfaceC09390do interfaceC09390do2 = c26851BtD2.A00;
                c180257zF2.A01(AbstractC166987dD.A0r(interfaceC09390do2), requireActivity2, false);
                OTM A003 = A1G.A00(c26851BtD2.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do2));
                if (OTM.A00(A003)) {
                    InterfaceC02590Ai A0P2 = AbstractC25236BEt.A0P(A003);
                    if (A0P2.isSampled()) {
                        A0P2.AAP("action", "onboarding_dialog_right_tapped");
                        A0P2.Cht();
                    }
                }
                AbstractC25233BEq.A14(c26851BtD2);
                i = -1667776004;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-1147374168);
                C26777Bry.A00((C26777Bry) this.A01).A03();
                i = 1886091252;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(674871200);
                ((C29329CwO) ((InterfaceC30828Dh3) this.A01)).A00.invoke();
                i = -984429578;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(1024542867);
                ((N86) ((C26872BtZ) this.A01).A0H.getValue()).A03();
                i = -1246299114;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(-1452850142);
                C26872BtZ c26872BtZ = (C26872BtZ) this.A01;
                C140966Yy A0c = AbstractC25231BEo.A0c(c26872BtZ.requireActivity(), c26872BtZ.A0C);
                A0c.A08();
                A0c.A0D(CJL.A00(true));
                A0c.A04();
                i = 90675625;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(-140289816);
                C56342iS c56342iS = C56352iT.A0t;
                C0N c0n = (C0N) this.A01;
                c56342iS.A03(c0n.requireActivity()).setIsLoading(true);
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(c0n.A02);
                AbstractC166987dD.A1Z(new PZG(A0Z, (InterfaceC23621Ds) null, 21), AbstractC141776au.A00(A0Z));
                InterfaceC09390do interfaceC09390do3 = ((AbstractC26782Bs6) c0n).A00;
                AbstractC34277F9x.A00(c0n, AbstractC166987dD.A0r(interfaceC09390do3), "tap", "save_button", "edit_opal", AbstractC166987dD.A0r(interfaceC09390do3).userId, null);
                i = -939879765;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(289571346);
                AbstractC26782Bs6 abstractC26782Bs6 = (AbstractC26782Bs6) this.A01;
                String A004 = AbstractC43591JPw.A00(130);
                InterfaceC09390do interfaceC09390do4 = abstractC26782Bs6.A00;
                AbstractC34277F9x.A00(abstractC26782Bs6, AbstractC166987dD.A0r(interfaceC09390do4), "tap", A004, "edit_opal", AbstractC166987dD.A0r(interfaceC09390do4).userId, null);
                AbstractC25227BEk.A1B(abstractC26782Bs6);
                i = -1655536758;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-221001140);
                C0O c0o = (C0O) this.A01;
                C0O.A04(c0o, "tap");
                AbstractC25226BEj.A1Q(c0o);
                i = 1179733116;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(-1827471931);
                ((C50975Mfi) ((N5D) this.A01).A02.getValue()).A00(C1W.A00);
                i = -376411701;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(-1827919819);
                ((C50975Mfi) ((N5F) this.A01).A03.getValue()).A00(C1W.A00);
                i = -1673206544;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(-1353907816);
                C26768Brp c26768Brp = (C26768Brp) this.A01;
                C36291Fzl c36291Fzl = (C36291Fzl) c26768Brp.A02.getValue();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36291Fzl.A02, AbstractC111324zv.A00(26));
                if (A0f.isSampled()) {
                    AbstractC25233BEq.A16(A0f);
                    AbstractC25232BEp.A1K(A0f, MSV.A00(30));
                    C36291Fzl.A00(A0f, c36291Fzl, "edit_pinned_channels_start");
                    A0f.A7v("is_test_user", AbstractC166997dE.A0a());
                    A0f.AAP(AbstractC58410Puo.A00(), c36291Fzl.A00);
                    A0f.Cht();
                }
                C25849Bc4 c25849Bc4 = (C25849Bc4) c26768Brp.A04.getValue();
                c25849Bc4.A03.A04(true);
                c25849Bc4.A01.A0A(C1X.A00);
                C8SB c8sb = c26768Brp.A00;
                if (c8sb == null) {
                    str = "itemTouchHelper";
                } else {
                    RecyclerView recyclerView = c26768Brp.A01;
                    if (recyclerView == null) {
                        str = "recyclerView";
                    } else {
                        c8sb.A0A(recyclerView);
                        C56352iT.A0t.A03(c26768Brp.getActivity()).A0T();
                        i = -136301202;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 17:
                A05 = C0f9.A05(955190118);
                AbstractC25226BEj.A1Q((Fragment) this.A01);
                i = 464588189;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(1772446421);
                ((C189478aR) this.A01).A07();
                i = -1843020850;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(939724560);
                ((Activity) this.A01).onBackPressed();
                i = -682731901;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(-1490325724);
                ((InterfaceC64002vL) this.A01).DSa();
                i = 956832791;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(866094237);
                C27278C2d c27278C2d = (C27278C2d) this.A01;
                C97T c97t = c27278C2d.A00;
                if (c97t != null) {
                    c97t.A00(c27278C2d.requireContext());
                    i = 850694456;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "buildUpdater";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 22:
                A05 = C0f9.A05(-2105022291);
                C27278C2d c27278C2d2 = (C27278C2d) this.A01;
                FragmentActivity requireActivity3 = c27278C2d2.requireActivity();
                InterfaceC09390do interfaceC09390do5 = c27278C2d2.A03;
                C140966Yy A0c2 = AbstractC25231BEo.A0c(requireActivity3, interfaceC09390do5);
                A0c2.A0D(AbstractC27703CJw.A00(AbstractC166987dD.A0r(interfaceC09390do5), false, false));
                A0c2.A04();
                i = 316823756;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(1136884212);
                C27278C2d c27278C2d3 = (C27278C2d) this.A01;
                FragmentActivity requireActivity4 = c27278C2d3.requireActivity();
                InterfaceC09390do interfaceC09390do6 = c27278C2d3.A03;
                C140966Yy A0c3 = AbstractC25231BEo.A0c(requireActivity4, interfaceC09390do6);
                A0c3.A0D(AbstractC27703CJw.A00(AbstractC166987dD.A0r(interfaceC09390do6), false, true));
                A0c3.A04();
                i = 1971655335;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(1002005808);
                C27278C2d c27278C2d4 = (C27278C2d) this.A01;
                C3EW A005 = C3EV.A00(c27278C2d4.requireContext(), AbstractC166987dD.A0r(c27278C2d4.A03));
                A005.A00(0L);
                InterfaceC19610xo ARD = A005.A04.ARD();
                ARD.E7G(AbstractC111324zv.A00(898), System.currentTimeMillis());
                ARD.apply();
                i = -1867483019;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(738239219);
                C27278C2d c27278C2d5 = (C27278C2d) this.A01;
                C97T c97t2 = c27278C2d5.A00;
                if (c97t2 != null) {
                    Context requireContext = c27278C2d5.requireContext();
                    c97t2.A01(requireContext, AbstractC14490oL.A09(requireContext));
                    i = -1152472672;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "buildUpdater";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 26:
                A05 = C0f9.A05(-53561744);
                C0QY A0A = C0b3.A00().A0A();
                C27278C2d c27278C2d6 = (C27278C2d) this.A01;
                A0A.A0G(c27278C2d6.requireContext(), new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(c27278C2d6.A02)));
                i = 1443621160;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(-1918946074);
                C26801BsP c26801BsP = (C26801BsP) this.A01;
                C29138Ct5 A12 = AbstractC25226BEj.A12(c26801BsP.A01);
                EnumC39642HiX enumC39642HiX = c26801BsP.A00;
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(C29138Ct5.A01(A12, enumC39642HiX, 0), "ig_school_reliability_edit_banner_page_save_tap");
                if (A0f2.isSampled()) {
                    AbstractC25225BEi.A1L(enumC39642HiX, A0f2);
                    AbstractC25234BEr.A0w(C8n.EDIT_BANNER, A0f2);
                }
                C25827Bbi c25827Bbi = (C25827Bbi) c26801BsP.A03.getValue();
                BIE bie = new BIE(c26801BsP, 27);
                SchoolSettingsRepository schoolSettingsRepository = c25827Bbi.A00;
                C26014Bf2 c26014Bf2 = (C26014Bf2) ((C51759Mti) ((C51755Mte) c25827Bbi.A01.getValue()).A00).A01;
                if (c26014Bf2 != null) {
                    str2 = c26014Bf2.A05;
                } else {
                    str2 = null;
                }
                C26014Bf2 c26014Bf22 = (C26014Bf2) ((C51759Mti) schoolSettingsRepository.A03.getValue()).A01;
                if (c26014Bf22 != null) {
                    str3 = c26014Bf22.A05;
                } else {
                    str3 = null;
                }
                if (str2 != null && str2.length() != 0 && !str2.equals(str3)) {
                    C2JM A0b = AbstractC25225BEi.A0b();
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str2, "badge_name"), A0b, "input"), "UpdateBadgeName", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), UpdateBadgeNameResponseImpl.class, true, null, 0, null, "xdt_update_badge_name", AbstractC166987dD.A1E());
                    C40701ud A01 = AbstractC40691uc.A01(schoolSettingsRepository.A00);
                    SchoolSettingsRepository.A02(schoolSettingsRepository, C05F.A01);
                    C28909CpI.A00(new C28912CpM(2, schoolSettingsRepository, bie), pandoGraphQLRequest, A01, schoolSettingsRepository, 12);
                } else {
                    bie.invoke();
                }
                i = 1912451579;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(345049355);
                C26793BsH c26793BsH = (C26793BsH) this.A01;
                C25829Bbk c25829Bbk = (C25829Bbk) c26793BsH.A01.getValue();
                BIE bie2 = new BIE(c26793BsH, 45);
                SchoolSettingsRepository schoolSettingsRepository2 = c25829Bbk.A00;
                C26014Bf2 c26014Bf23 = (C26014Bf2) ((C51759Mti) schoolSettingsRepository2.A03.getValue()).A01;
                if (c26014Bf23 != null && (c5Hc = c26014Bf23.A07) != null) {
                    Iterator it = c5Hc.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((BadgeVisibilitySettingItem) obj).A02) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    BadgeVisibilitySettingItem badgeVisibilitySettingItem = (BadgeVisibilitySettingItem) obj;
                    if (badgeVisibilitySettingItem != null) {
                        C2JM A0b2 = AbstractC25225BEi.A0b();
                        PandoGraphQLRequest pandoGraphQLRequest2 = new PandoGraphQLRequest(AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(GraphQlCallInput.A02, badgeVisibilitySettingItem.A00.name(), MSV.A00(392)), A0b2, "input"), "UpdateSchoolBadgeVisibility", A0b2.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), UpdateSchoolBadgeVisibilityResponseImpl.class, true, null, 0, null, "xdt_update_school_badge_visibility", AbstractC166987dD.A1E());
                        C40701ud A012 = AbstractC40691uc.A01(schoolSettingsRepository2.A00);
                        SchoolSettingsRepository.A02(schoolSettingsRepository2, C05F.A01);
                        C28909CpI.A00(new C28912CpM(1, schoolSettingsRepository2, bie2), pandoGraphQLRequest2, A012, schoolSettingsRepository2, 11);
                    }
                }
                i = 873150193;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(-567010640);
                C26823Bsl c26823Bsl = (C26823Bsl) this.A01;
                ?? obj2 = new Object();
                C189448aO A0g = AbstractC25231BEo.A0g(c26823Bsl.A0B);
                A0g.A0U = new C56758PHa(6, c26823Bsl, obj2);
                C189478aR A006 = A0g.A00();
                String str6 = c26823Bsl.A01;
                C27894CRf c27894CRf = new C27894CRf(A006, c26823Bsl, obj2);
                boolean A1Z = AbstractC167007dF.A1Z(c26823Bsl.A06);
                AbstractC167007dF.A1E(str6, 0, c26823Bsl.A00);
                C26731BrC c26731BrC = new C26731BrC();
                c26731BrC.A01 = str6;
                c26731BrC.A00 = c27894CRf;
                c26731BrC.A02 = A1Z;
                A006.A02(c26823Bsl.requireActivity(), c26731BrC);
                i = -1227265816;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(-1658586061);
                C26823Bsl c26823Bsl2 = (C26823Bsl) this.A01;
                C26823Bsl.A02(c26823Bsl2);
                C29138Ct5 A122 = AbstractC25226BEj.A12(c26823Bsl2.A0A);
                EnumC39642HiX enumC39642HiX2 = c26823Bsl2.A00;
                InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(C29138Ct5.A01(A122, enumC39642HiX2, 0), "ig_school_reliability_invite_plane_tap");
                if (A0f3.isSampled()) {
                    AbstractC25225BEi.A1L(enumC39642HiX2, A0f3);
                    AbstractC25234BEr.A0w(C8n.DIRECTORY, A0f3);
                }
                i = 1026697190;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A05 = C0f9.A05(1407254703);
                C26823Bsl c26823Bsl3 = (C26823Bsl) this.A01;
                C26823Bsl.A01(c26823Bsl3);
                C29138Ct5 A123 = AbstractC25226BEj.A12(c26823Bsl3.A0A);
                EnumC39642HiX enumC39642HiX3 = c26823Bsl3.A00;
                InterfaceC02590Ai A0f4 = AbstractC166987dD.A0f(C29138Ct5.A01(A123, enumC39642HiX3, 0), "ig_school_reliability_settings_icon_tap");
                if (A0f4.isSampled()) {
                    AbstractC25225BEi.A1L(enumC39642HiX3, A0f4);
                    AbstractC25234BEr.A0w(C8n.DIRECTORY, A0f4);
                }
                i = 1527861286;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A05 = C0f9.A05(1101633886);
                C28189Cbd c28189Cbd = (C28189Cbd) this.A01;
                C28261Yl c28261Yl = C28261Yl.A00;
                Context context = c28189Cbd.A00;
                UserSession userSession = c28189Cbd.A06;
                FragmentActivity fragmentActivity = c28189Cbd.A02;
                String moduleName = c28189Cbd.A04.getModuleName();
                User user = c28189Cbd.A09;
                c28261Yl.A00(context, fragmentActivity, userSession, user, c28189Cbd.A0A, moduleName, null, user.getUsername());
                i = 1174211958;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A05 = C0f9.A05(-1930919572);
                C28189Cbd.A00((C28189Cbd) this.A01, false);
                i = 1458235314;
                C0f9.A0C(i, A05);
                return;
            case 34:
                A05 = C0f9.A05(-1538264086);
                C28189Cbd c28189Cbd2 = (C28189Cbd) this.A01;
                c28189Cbd2.A08.A01(c28189Cbd2.A07, c28189Cbd2.A09, "school", true, false);
                i = -57153284;
                C0f9.A0C(i, A05);
                return;
            case 35:
                A05 = C0f9.A05(1193413520);
                C27895CRg c27895CRg = (C27895CRg) this.A01;
                UserSession userSession2 = c27895CRg.A01;
                AbstractC35091Fd2.A01(null, userSession2, "accessibility", MSV.A00(36), null);
                C140966Yy A0r = AbstractC25225BEi.A0r(c27895CRg.A00, userSession2);
                A0r.A08();
                if (AbstractC75343a1.A05(userSession2)) {
                    A00 = CFO.A00(true);
                } else {
                    A00 = AbstractC34031F0k.A00(userSession2, "accessibility", null, true, false, false, false, false);
                }
                C14360o3.A0A(A00);
                A0r.A0B(null, A00);
                A0r.A04();
                i = -1310019590;
                C0f9.A0C(i, A05);
                return;
            case 36:
                A05 = C0f9.A05(731538719);
                C27895CRg c27895CRg2 = (C27895CRg) this.A01;
                UserSession userSession3 = c27895CRg2.A01;
                AbstractC35091Fd2.A01(null, userSession3, "accessibility", "color_filter_settings_entered", null);
                C140966Yy A0r2 = AbstractC25225BEi.A0r(c27895CRg2.A00, userSession3);
                A0r2.A08();
                C33191Ekd c33191Ekd = new C33191Ekd();
                Bundle A0b3 = AbstractC166987dD.A0b();
                AbstractC03240Dh.A00(A0b3, userSession3);
                c33191Ekd.setArguments(A0b3);
                A0r2.A0B(null, c33191Ekd);
                A0r2.A04();
                i = 2017438123;
                C0f9.A0C(i, A05);
                return;
            case 37:
                A05 = C0f9.A05(1684495416);
                C27895CRg c27895CRg3 = (C27895CRg) this.A01;
                UserSession userSession4 = c27895CRg3.A01;
                AbstractC35091Fd2.A01(null, userSession4, "accessibility", "translation_settings_entered", null);
                C140966Yy A0r3 = AbstractC25225BEi.A0r(c27895CRg3.A00, userSession4);
                A0r3.A08();
                A0r3.A0B(null, AbstractC34033F0m.A00(userSession4, "accessibility", null, false, false, false, false));
                A0r3.A04();
                i = 377204169;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(119205651);
                C26726Br7 c26726Br7 = (C26726Br7) this.A01;
                CPK cpk = c26726Br7.A00;
                if (cpk != null) {
                    User user2 = c26726Br7.A01;
                    if (user2 == null) {
                        str = "producer";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    cpk.A00.A08.CJ7(user2, "reel_viewer_photo_credit_popup");
                }
                i = 1073456804;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A05 = C0f9.A05(-387596148);
                C26726Br7 c26726Br72 = (C26726Br7) this.A01;
                UserSession A0r4 = AbstractC166987dD.A0r(c26726Br72.A03);
                FragmentActivity requireActivity5 = c26726Br72.requireActivity();
                Fragment fragment = c26726Br72.mParentFragment;
                if (fragment instanceof BottomSheetFragment) {
                    bottomSheetFragment = (BottomSheetFragment) fragment;
                } else {
                    bottomSheetFragment = null;
                }
                FBT.A00(requireActivity5, c26726Br72, A0r4, bottomSheetFragment);
                i = 1766495860;
                C0f9.A0C(i, A05);
                return;
            case 40:
                A05 = C0f9.A05(-1913320263);
                AbstractC166987dD.A1Y(this.A01);
                i = 1157807685;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A05 = C0f9.A05(-569589917);
                ((C29160CtR) this.A01).A01.A00.invoke();
                i = 1248725688;
                C0f9.A0C(i, A05);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = C0f9.A05(710101118);
                IgShowreelNativeProgressView igShowreelNativeProgressView = (IgShowreelNativeProgressView) this.A01;
                if (igShowreelNativeProgressView.A00 != 3) {
                    str4 = "Loading state should be error state";
                } else {
                    C6PS c6ps = igShowreelNativeProgressView.A03;
                    if (c6ps == null) {
                        str4 = "Data is null";
                    } else {
                        IgShowreelNativeProgressView.A01(igShowreelNativeProgressView, 1);
                        UtP utP = igShowreelNativeProgressView.A04;
                        if (utP == null) {
                            str = "mediaView";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        utP.setShowreelAnimation(c6ps.A02, c6ps.A04, c6ps.A03, c6ps.A01, c6ps.A00);
                        i = -2024982816;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C0w9.A03("IgShowreelNativeProgressView#handleRetryOnClick", str4);
                i = -2024982816;
                C0f9.A0C(i, A05);
                return;
            case 43:
                A05 = C0f9.A05(-1248191999);
                C3DN A007 = C3DN.A00.A00(((Fragment) this.A01).getActivity());
                if (A007 != null) {
                    ((C3DP) A007).A0H = new C29387CxK(1);
                    A007.A0B();
                }
                i = 1142388829;
                C0f9.A0C(i, A05);
                return;
            case 44:
                A05 = C0f9.A05(2013218228);
                C26859BtL c26859BtL = (C26859BtL) this.A01;
                C23031Ai A0l = AbstractC25230BEn.A0l(c26859BtL.A03);
                boolean z = c26859BtL.A01;
                InterfaceC19630xq interfaceC19630xq = A0l.A01;
                if (z) {
                    i2 = 1325;
                } else {
                    i2 = 1324;
                }
                AbstractC167017dG.A0g(interfaceC19630xq, MSV.A00(i2)).apply();
                C3DN A008 = C3DN.A00.A00(c26859BtL.getActivity());
                if (A008 != null) {
                    ((C3DP) A008).A0H = new C29389CxM(c26859BtL, 2);
                    A008.A0B();
                }
                i = 14092999;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A05 = C0f9.A05(-1496351946);
                C26745BrR.A00((C26745BrR) this.A01);
                i = 1742879970;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(-1265182919);
                C25883Bcj.A00(C29435CyB.A00, (C25883Bcj) ((C26763Brk) this.A01).A03.getValue());
                i = 1422143668;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = C0f9.A05(1872501705);
                N5H n5h = (N5H) this.A01;
                C51014MgM c51014MgM = (C51014MgM) n5h.A07.getValue();
                Collection values = ((AbstractMap) AbstractC001800i.A0I(c51014MgM.A02.Bn0())).values();
                C14360o3.A07(values);
                AbstractC52515NLi abstractC52515NLi = (AbstractC52515NLi) AbstractC001800i.A0A(values);
                if (abstractC52515NLi instanceof C30) {
                    c25671My = c51014MgM.A00;
                    C38321qM c38321qM = ((C30) abstractC52515NLi).A00.A00;
                    String id = c38321qM.getId();
                    if (id == null) {
                        id = "";
                    }
                    c26233Bix = new C26234Biy(c38321qM.A09, c38321qM, id);
                } else {
                    if ((abstractC52515NLi instanceof C27293C2z) && (medium = ((C27293C2z) abstractC52515NLi).A00.A00.A00) != null) {
                        c25671My = c51014MgM.A00;
                        String valueOf = String.valueOf(medium.A05);
                        if (medium.Cff()) {
                            str5 = medium.A0b;
                        } else {
                            str5 = medium.A0X;
                        }
                        c26233Bix = new C26233Bix(medium, AbstractC81033jX.A01(new File(str5)), valueOf, true);
                    }
                    AbstractC25226BEj.A1P(n5h);
                    i = -633429398;
                    C0f9.A0C(i, A05);
                    return;
                }
                c25671My.E4s(new C56006Otd(c26233Bix));
                AbstractC25226BEj.A1P(n5h);
                i = -633429398;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A05 = C0f9.A05(-1431008610);
                C25868BcP c25868BcP = (C25868BcP) ((C26809BsX) this.A01).A03.getValue();
                c25868BcP.A02(false);
                WallPostComposerRepository wallPostComposerRepository = c25868BcP.A03;
                String A0j = AbstractC167017dG.A0j();
                User user3 = wallPostComposerRepository.A02;
                WallInfo wallInfo = wallPostComposerRepository.A04;
                WallPostInfo wallPostInfo = new WallPostInfo(user3, wallInfo, C7B.A03, A0j, AbstractC25228BEl.A1A((String) wallPostComposerRepository.A07.getValue()), C16930sl.A00, 0, -1, System.currentTimeMillis(), true, false, false);
                InterfaceC58259Ps3 interfaceC58259Ps3 = (InterfaceC58259Ps3) wallPostComposerRepository.A06.getValue();
                if (interfaceC58259Ps3 instanceof C26233Bix) {
                    C26233Bix c26233Bix2 = (C26233Bix) interfaceC58259Ps3;
                    AtomicBoolean atomicBoolean = C38321qM.A0i;
                    C38321qM c38321qM2 = new C38321qM(new C37761pD(null), new Object());
                    Medium medium2 = c26233Bix2.A00;
                    boolean Cff = medium2.Cff();
                    c38321qM2.A4P(String.valueOf(medium2.A05));
                    c38321qM2.A09 = c26233Bix2.A01;
                    c38321qM2.A0C.EaI(Integer.valueOf(medium2.A0B));
                    c38321qM2.A0C.EaG(Integer.valueOf(medium2.A04));
                    c38321qM2.A0M = medium2.A0X;
                    if (Cff) {
                        enumC40111tc = EnumC40111tc.A0a;
                    } else {
                        enumC40111tc = EnumC40111tc.A0Q;
                    }
                    c38321qM2.A4I(enumC40111tc);
                    WallMediaPostItem wallMediaPostItem = new WallMediaPostItem(c38321qM2, wallPostInfo);
                    wallMediaPostItem.A00 = medium2;
                    parcelable = wallMediaPostItem;
                } else if (C26234Biy.A00(interfaceC58259Ps3, 0)) {
                    parcelable = new WallMediaPostItem((C38321qM) ((C26234Biy) interfaceC58259Ps3).A01, wallPostInfo);
                } else if (C26234Biy.A00(interfaceC58259Ps3, 1)) {
                    C26234Biy c26234Biy = (C26234Biy) interfaceC58259Ps3;
                    parcelable = new WallMusicPostItem((AudioOverlayTrack) c26234Biy.A02, wallPostInfo, (List) c26234Biy.A01);
                } else if (interfaceC58259Ps3 instanceof C26232Biw) {
                    C26232Biw c26232Biw = (C26232Biw) interfaceC58259Ps3;
                    parcelable = new WallGifPostItem(c26232Biw.A00, wallPostInfo, c26232Biw.A01);
                } else {
                    parcelable = new WallTextPostItem(wallPostInfo);
                }
                wallPostComposerRepository.A05.A05((WallPostItem) parcelable, wallInfo.A01);
                C25868BcP.A00(C29437CyD.A00, c25868BcP);
                i = 131359785;
                C0f9.A0C(i, A05);
                return;
            case 49:
                A05 = C0f9.A05(-1317584623);
                C25884Bck c25884Bck = (C25884Bck) ((C26776Brx) this.A01).A03.getValue();
                c25884Bck.A04(false);
                WallPostItem wallPostItem = (WallPostItem) ((C26066Bfu) c25884Bck.A0B.getValue()).A02;
                WallMenuConfig A009 = AbstractC27714CKh.A00(c25884Bck.A02, wallPostItem.Bez(), wallPostItem, c25884Bck.A04, c25884Bck, AbstractC141776au.A00(c25884Bck));
                if (A009 != null) {
                    C25884Bck.A02(new C29443CyJ(A009), c25884Bck);
                }
                i = -1275413764;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A05 = C0f9.A05(-36136773);
                InterfaceC153546vP interfaceC153546vP = ((C27059Bwi) this.A01).A00;
                C14360o3.A0A(view);
                interfaceC153546vP.D52(view);
                i = -620856994;
                C0f9.A0C(i, A05);
                return;
            case 51:
                A05 = C0f9.A05(-276082830);
                AbstractC25226BEj.A1Q((Fragment) this.A01);
                i = 808298531;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A052 = C0f9.A05(1577546059);
                C26831Bst c26831Bst = ((C26732BrD) this.A01).A02;
                if (c26831Bst != null) {
                    String str7 = c26831Bst.A05;
                    str = "contentUrl";
                    if (str7 != null) {
                        if (str7.length() > 0) {
                            FragmentActivity activity = c26831Bst.getActivity();
                            if (activity != null) {
                                AbstractC41776Ies.A03(activity, str7);
                            }
                            AbstractC12990ll A0o = AbstractC166987dD.A0o(c26831Bst.A0E);
                            String str8 = c26831Bst.A06;
                            if (str8 == null) {
                                str = "mediaId";
                            } else {
                                String str9 = c26831Bst.A03;
                                if (str9 != null) {
                                    C14360o3.A0B(A0o, 0);
                                    InterfaceC02590Ai A0f5 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c26831Bst, A0o), "instagram_clips_viewer_link_tap");
                                    if (A0f5.isSampled()) {
                                        AbstractC25225BEi.A1O(A0f5, "third_party_app_pivot_page");
                                        AtomicBoolean atomicBoolean2 = C38321qM.A0i;
                                        String A06 = C38801rC.A06(str8);
                                        C14360o3.A0B(A06, 0);
                                        AbstractC25236BEt.A0m(A0f5, 0, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A06)));
                                        A0f5.A8R(BQL.A1K, "action");
                                        AbstractC25225BEi.A1M(EnumC120795dP.A0l, A0f5);
                                        A0f5.A9K("app_attribution_id", AbstractC003100w.A0k(10, str9));
                                        A0f5.Cht();
                                    }
                                }
                                str = "attributionAppId";
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i3 = 240966563;
                C0f9.A0C(i3, A052);
                return;
            case 53:
                A05 = C0f9.A05(-1624180995);
                AbstractC25226BEj.A1Q((Fragment) this.A01);
                i = 1135523271;
                C0f9.A0C(i, A05);
                return;
            case 54:
                A05 = C0f9.A05(1004824958);
                C26833Bsv c26833Bsv = (C26833Bsv) this.A01;
                C26912BuF c26912BuF = c26833Bsv.A05;
                if (c26912BuF == null) {
                    str = "remixPivotPagePerfLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c26912BuF.A0K("has_user_interacted", true);
                c26912BuF.A0J(MSV.A00(53), "exit_pivot_page");
                AbstractC25226BEj.A1Q(c26833Bsv);
                i = -14260307;
                C0f9.A0C(i, A05);
                return;
            case 55:
                A05 = C0f9.A05(-1776330817);
                AbstractC25226BEj.A1Q((Fragment) this.A01);
                i = 1923093436;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A05 = C0f9.A05(-545621943);
                C26831Bst c26831Bst2 = (C26831Bst) this.A01;
                C50674MYs c50674MYs = new C50674MYs(c26831Bst2.requireContext(), AbstractC166987dD.A0o(c26831Bst2.A0E));
                c50674MYs.A03(A00(c26831Bst2, 57), 2131975474);
                c50674MYs.A03(A00(c26831Bst2, 58), 2131975469);
                c50674MYs.A03(A00(c26831Bst2, 59), 2131975473);
                new C31727DwY(c50674MYs).A05(c26831Bst2.requireActivity());
                i = 1657153563;
                C0f9.A0C(i, A05);
                return;
            case 57:
                A05 = C0f9.A05(-552731654);
                C26831Bst c26831Bst3 = (C26831Bst) this.A01;
                UserSession A0r5 = AbstractC166987dD.A0r(c26831Bst3.A0E);
                FragmentActivity requireActivity6 = c26831Bst3.requireActivity();
                String str10 = c26831Bst3.A03;
                if (str10 != null) {
                    WEz A013 = AbstractC69993VzD.A01(requireActivity6, c26831Bst3, A0r5, EnumC65855TvH.A0I, VG2.A0m, str10);
                    A013.A07(EnumC39619HeT.A06);
                    WEz.A00(null, A013);
                    i = 284093592;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "attributionAppId";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 58:
                A052 = C0f9.A05(1111069841);
                C26831Bst c26831Bst4 = (C26831Bst) this.A01;
                Object systemService = c26831Bst4.requireContext().getSystemService("clipboard");
                if ((systemService instanceof ClipboardManager) && (clipboardManager = (ClipboardManager) systemService) != null) {
                    String A0p = AbstractC166997dE.A0p(c26831Bst4.requireContext(), 2131975467);
                    String str11 = c26831Bst4.A07;
                    if (str11 != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(A0p, str11));
                        C9GR.A07(c26831Bst4.requireContext(), 2131975468);
                    }
                    str = "pivotPageUrl";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i3 = -2016451487;
                C0f9.A0C(i3, A052);
                return;
            case 59:
                A05 = C0f9.A05(128523857);
                C26831Bst c26831Bst5 = (C26831Bst) this.A01;
                Context requireContext2 = c26831Bst5.requireContext();
                UserSession A0r6 = AbstractC166987dD.A0r(c26831Bst5.A0E);
                String str12 = c26831Bst5.A07;
                if (str12 != null) {
                    String str13 = c26831Bst5.A03;
                    if (str13 != null) {
                        String string = AbstractC166997dE.A0N(c26831Bst5).getString(2131971179);
                        String str14 = c26831Bst5.A04;
                        if (str14 == null) {
                            str = "attributionAppName";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        new LLI(requireContext2, c26831Bst5, A0r6, null, str12, str13, string, str14, null, false).A05();
                        i = -2136591515;
                        C0f9.A0C(i, A05);
                        return;
                    }
                    str = "attributionAppId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "pivotPageUrl";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 60:
                A05 = C0f9.A05(1463054304);
                C27343C4y c27343C4y = (C27343C4y) this.A01;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                UserSession userSession5 = c27343C4y.A03;
                Context context2 = c27343C4y.A01.getContext();
                String A0p2 = AbstractC166997dE.A0p(context2, 2131975248);
                C14360o3.A0B(userSession5, 0);
                Bundle A0b4 = AbstractC166987dD.A0b();
                A0b4.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession5.token);
                A0b4.putString(DevServerEntity.COLUMN_DESCRIPTION, A0p2);
                C26720Br1 c26720Br1 = new C26720Br1();
                c26720Br1.setArguments(A0b4);
                C189448aO A0y = AbstractC25225BEi.A0y(userSession5);
                A0y.A06 = context2.getColor(R.color.grey_9);
                A0y.A1C = false;
                AbstractC25226BEj.A1M(context2, A0y, 2131975249);
                A0y.A0E = context2.getColor(R.color.grey_0);
                C189478aR A0010 = A0y.A00();
                Activity A0011 = AbstractC13330mJ.A00(context2);
                C14360o3.A0C(c26720Br1, AbstractC43591JPw.A00(0));
                A0010.A02(A0011, c26720Br1);
                i = 108167491;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A05 = C0f9.A05(-741924029);
                AbstractC25226BEj.A1Q((Fragment) this.A01);
                i = -1554047105;
                C0f9.A0C(i, A05);
                return;
            case 62:
                A05 = C0f9.A05(-1966421935);
                N5S n5s = (N5S) this.A01;
                Context requireContext3 = n5s.requireContext();
                C193328hC c193328hC = new C193328hC(requireContext3);
                c193328hC.A0A(2131955322);
                c193328hC.A0r(requireContext3.getString(2131955323));
                c193328hC.A07();
                c193328hC.A04();
                AbstractC166987dD.A1W(c193328hC);
                AnonymousClass229.A01(AbstractC166987dD.A0r(n5s.A0C)).A0l();
                IgdsListCell igdsListCell = n5s.A02;
                if (igdsListCell == null) {
                    str = "audioTranslationOptInToggle";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                igdsListCell.setChecked(false);
                i = 1270902238;
                C0f9.A0C(i, A05);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A05 = C0f9.A05(1615812724);
                C25448BNn c25448BNn = (C25448BNn) this.A01;
                C37616GhB c37616GhB = c25448BNn.A08;
                C14360o3.A0A(view);
                c37616GhB.A06(view, null, null);
                c25448BNn.A05.DsE(view);
                i = -2016382035;
                C0f9.A0C(i, A05);
                return;
            case 64:
                A05 = C0f9.A05(146412750);
                C25448BNn c25448BNn2 = (C25448BNn) this.A01;
                c25448BNn2.A07.CxK(c25448BNn2.A02, c25448BNn2.A03);
                i = 820621449;
                C0f9.A0C(i, A05);
                return;
            case 65:
                A05 = C0f9.A05(-785128124);
                C25448BNn c25448BNn3 = (C25448BNn) this.A01;
                c25448BNn3.A07.Dck(c25448BNn3.A02);
                i = -1828880985;
                C0f9.A0C(i, A05);
                return;
            case 66:
                A05 = C0f9.A05(-382889496);
                C25448BNn c25448BNn4 = (C25448BNn) this.A01;
                InterfaceC31137Dmc interfaceC31137Dmc = c25448BNn4.A07;
                C120985dq c120985dq = c25448BNn4.A02;
                C37644Ghd c37644Ghd = c25448BNn4.A03;
                interfaceC31137Dmc.DSD(c120985dq, c37644Ghd, c37644Ghd.A06());
                i = 2073209218;
                C0f9.A0C(i, A05);
                return;
            case 67:
                A05 = C0f9.A05(-2137570102);
                ((C38321qM) this.A01).A2D();
                i = 1709287912;
                C0f9.A0C(i, A05);
                return;
            case 68:
                A05 = C0f9.A05(963992967);
                C25448BNn c25448BNn5 = (C25448BNn) this.A01;
                c25448BNn5.A07.DAY(c25448BNn5.A02, c25448BNn5.A03);
                i = 2076858895;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A05 = C0f9.A05(2084779958);
                C25448BNn c25448BNn6 = (C25448BNn) this.A01;
                c25448BNn6.A07.Dqf(c25448BNn6.A02);
                i = 1205531279;
                C0f9.A0C(i, A05);
                return;
            case 70:
                A05 = C0f9.A05(125158479);
                AbstractC25228BEl.A1P(((BPE) this.A01).A07.get());
                i = -1555890969;
                C0f9.A0C(i, A05);
                return;
            default:
                return;
        }
    }
}
