package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.ASk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23249ASk implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC23249ASk(C8DN c8dn, int i) {
        this.A00 = i;
        switch (i) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A01 = c8dn;
                return;
            default:
                this.A01 = c8dn;
                return;
        }
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC23249ASk(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        String str;
        int i;
        int A052;
        int i2;
        C88X A02;
        C88H c88h;
        String str2;
        boolean z;
        C3DN A01;
        C3DN A012;
        String str3;
        C8GD c8gd;
        int A053;
        AudioOverlayTrack audioOverlayTrack;
        C8T3 c8t3;
        C51676Ms7 c51676Ms7;
        int i3;
        Integer BTu;
        AudioOverlayTrack audioOverlayTrack2;
        AbstractC193598he abstractC193598he;
        String str4;
        String str5;
        InterfaceC110104xf AdG;
        String templateMediaId;
        InterfaceC110104xf AdG2;
        String templateMediaId2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(638348884);
                C23100AGm c23100AGm = (C23100AGm) this.A01;
                Integer num = c23100AGm.A00;
                Integer num2 = C05F.A00;
                if (num == num2) {
                    c23100AGm.A01();
                } else {
                    C23100AGm.A00(c23100AGm, num2);
                    C214619ez c214619ez = c23100AGm.A02.A00;
                    C23632AdR c23632AdR = ((C214899fR) c214619ez).A0A;
                    if (c23632AdR != null) {
                        c23632AdR.A03(new AB1(c214619ez), num2);
                    } else {
                        str = "cameraInitializationController";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                i = -1523634665;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-1054607381);
                C214899fR c214899fR = (C214899fR) this.A01;
                C23656Adr.A00(EnumC223239t9.A0P, c214899fR.A02());
                OXk.A00(c214899fR.requireActivity(), c214899fR.A03, AbstractC166987dD.A0r(c214899fR.A0M));
                i = 1558611240;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(1271535570);
                C214899fR c214899fR2 = ((AAM) this.A01).A02.A00;
                c214899fR2.requireActivity().onBackPressed();
                C23656Adr.A00(EnumC223239t9.A0C, c214899fR2.A02());
                i = -1642972904;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-274083807);
                C214899fR c214899fR3 = ((AAM) this.A01).A02.A00;
                C23656Adr.A00(EnumC223239t9.A0W, c214899fR3.A02());
                C50674MYs c50674MYs = new C50674MYs(c214899fR3.requireContext(), AbstractC166987dD.A0o(c214899fR3.A0M));
                c50674MYs.A01(new WNN(c214899fR3, 61), 2131961691);
                if (c214899fR3.A03 != null) {
                    c50674MYs.A03(new ViewOnClickListenerC23249ASk(c214899fR3, 1), 2131961690);
                }
                c50674MYs.A03(ASY.A00, 2131954754);
                new C31727DwY(c50674MYs).A05(c214899fR3.requireActivity());
                i = -1980680859;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-1319369700);
                C214899fR c214899fR4 = ((AAM) this.A01).A02.A00;
                String str6 = c214899fR4.A03().A01;
                if (str6 != null) {
                    InterfaceC09390do interfaceC09390do = c214899fR4.A0M;
                    new C6XJ(c214899fR4.getActivity(), AbstractC31364DqT.A03().A01.A01(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31402Dr6.A02(AbstractC166987dD.A0r(interfaceC09390do), str6, "ar_ads_camera", c214899fR4.getModuleName()).A03()), AbstractC166987dD.A0o(interfaceC09390do), ModalActivity.class, "profile").A0C(c214899fR4.getActivity());
                }
                C23656Adr.A00(EnumC223239t9.A05, c214899fR4.A02());
                i = 1775382895;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(63897894);
                C214899fR c214899fR5 = ((AAM) this.A01).A02.A00;
                String str7 = c214899fR5.A03().A05;
                if (str7 != null) {
                    AbstractC131165w4.A00().A03(AbstractC166987dD.A0r(c214899fR5.A0M), c214899fR5.requireActivity(), str7);
                }
                C23656Adr.A00(EnumC223239t9.A0D, c214899fR5.A02());
                i = 150433533;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-1210758301);
                C214899fR c214899fR6 = ((AAM) this.A01).A02.A00;
                C23432Aa5.A00(c214899fR6.A01().A03.A09).Epf();
                C23656Adr.A00(EnumC223239t9.A0O, c214899fR6.A02());
                i = -746524006;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A052 = C0f9.A05(-1074309624);
                C23632AdR c23632AdR2 = (C23632AdR) this.A01;
                if (c23632AdR2.A05) {
                    WGH.A06(c23632AdR2.A09, null);
                } else {
                    C23632AdR.A02(c23632AdR2, c23632AdR2.A04);
                }
                i2 = 1791987437;
                C0f9.A0C(i2, A052);
                return;
            case 8:
                A05 = C0f9.A05(-732332089);
                AbstractC166987dD.A1Y(this.A01);
                i = 1238115264;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A052 = C0f9.A05(-969820899);
                C48591LeT c48591LeT = (C48591LeT) this.A01;
                boolean A1X = AbstractC167007dF.A1X(c48591LeT.A0D, C05F.A15);
                C8OP c8op = c48591LeT.A0S;
                c8op.A04 = AbstractC23641Du.A02(AnonymousClass191.A00, new PZO(new WeakReference(c48591LeT.A0I), c8op, null, 5, A1X), AbstractC141776au.A00(c8op));
                if (!A1X) {
                    c48591LeT.A0R.D97();
                }
                i2 = 1815362456;
                C0f9.A0C(i2, A052);
                return;
            case 10:
                A05 = C0f9.A05(1323922155);
                C8NW c8nw = (C8NW) ((C48588LeQ) this.A01).A04;
                C8PK c8pk = c8nw.A0w;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c8pk.A00, "ig_fitness_stickers");
                if (A0f.isSampled()) {
                    A0f.AAP("story_session_uuid", c8pk.A01);
                    A0f.AAP("event_name", "DISMISS_FITNESS_STICKER_TRAY");
                    A0f.Cht();
                }
                c8nw.onBackPressed();
                i = -1855089927;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(-2093353956);
                ((JT7) this.A01).A0E.Doj();
                i = 1604106177;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                C8Y8 A00 = C8DN.A00((C8DN) this.A01);
                if (A00 != null) {
                    A00.A0D();
                    return;
                }
                return;
            case 14:
                A05 = C0f9.A05(-874380674);
                C198818qe c198818qe = (C198818qe) this.A01;
                C88M c88m = c198818qe.A00;
                if (c88m != null && (A02 = c88m.A02(c88m.A00)) != null && (c88h = c198818qe.A01) != null) {
                    c88h.DDA(A02);
                }
                i = -1259778907;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(1834673501);
                AK7.A01((AK7) this.A01);
                i = 1050384535;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(470833132);
                C9V3 c9v3 = (C9V3) this.A01;
                C195608l0 c195608l0 = c9v3.A00;
                if (c195608l0 != null) {
                    AbstractC226549zC.A00(c9v3, c195608l0, c9v3.A0B);
                }
                i = -1738918887;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(215879246);
                ((Fragment) this.A01).requireActivity().onBackPressed();
                i = 502625929;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(-1277277149);
                ((C48624Lf0) this.A01).A0D.E4u(C8UR.A00);
                i = -1535511371;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(25480129);
                C210989Uv c210989Uv = ((C215759gr) this.A01).A00;
                if (c210989Uv != null) {
                    EditText editText = c210989Uv.A01;
                    String A0g = AbstractC167007dF.A0g(editText);
                    C211859aC c211859aC = c210989Uv.A00;
                    if (c211859aC != null && (str2 = c211859aC.A01) != null) {
                        if (!AJp.A01(A0g)) {
                            str2 = AJp.A00(str2.length());
                        }
                        editText.setText(str2, TextView.BufferType.EDITABLE);
                        AbstractC167017dG.A18(editText);
                    }
                }
                i = 1656915973;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(157947705);
                C23630AdP.A09((C23630AdP) this.A01, C05F.A0C);
                i = 1102060795;
                C0f9.A0C(i, A05);
                return;
            case 21:
                C69105Vhv c69105Vhv = (C69105Vhv) this.A01;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C66017TyF c66017TyF = c69105Vhv.A01;
                LinkedList linkedList = c66017TyF.A08;
                int indexOf = linkedList.indexOf(c69105Vhv.A02);
                if (indexOf < 0) {
                    return;
                }
                C66486UJo c66486UJo = c66017TyF.A00;
                if (c66486UJo != null && c66486UJo.getLayoutPosition() == indexOf) {
                    c66017TyF.A00 = null;
                }
                AAF aaf = (AAF) linkedList.remove(indexOf);
                aaf.getClass();
                String str8 = aaf.A06;
                if (str8 != null) {
                    c66017TyF.A09.remove(str8);
                }
                Bitmap bitmap = aaf.A00;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                c66017TyF.notifyItemRemoved(indexOf);
                C208769Lk c208769Lk = (C208769Lk) c66017TyF.A06;
                C208769Lk.A07(c208769Lk);
                if (!(c208769Lk.A0J.A08.A00 instanceof C81V)) {
                    return;
                }
                C9M4.A01(c208769Lk.A0C, c208769Lk, 0.0f);
                return;
            case 22:
                A05 = C0f9.A05(1000426337);
                ((Fragment) this.A01).requireActivity().onBackPressed();
                i = -1802407525;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(-1422416683);
                C214749fC c214749fC = (C214749fC) this.A01;
                InterfaceC09390do interfaceC09390do2 = c214749fC.A0H;
                if (AbstractC1565371b.A00(AbstractC166987dD.A0r(interfaceC09390do2))) {
                    AbstractC35176FfT.A02(c214749fC.requireContext(), AbstractC166987dD.A0r(interfaceC09390do2), "closed_friends");
                } else {
                    C684436h c684436h = c214749fC.A01;
                    if (c684436h == null) {
                        str = "closeFriendsController";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    c684436h.A00(c214749fC, EnumC33409Epg.LIVE_COMPOSER, 2002, false);
                }
                i = 1059943699;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(1741589548);
                C214749fC.A01((C214749fC) this.A01);
                i = -1446197615;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(-1018545231);
                C214699f7 c214699f7 = (C214699f7) this.A01;
                A75 a75 = c214699f7.A00;
                if (a75 != null) {
                    IgdsSwitch igdsSwitch = c214699f7.A01;
                    if (igdsSwitch != null) {
                        z = igdsSwitch.isChecked();
                    } else {
                        z = false;
                    }
                    AbstractC23021Ah.A00(a75.A00.A0K).A1C(z);
                    a75.A01.A0L(null);
                }
                i = 316150821;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A05 = C0f9.A05(1946535212);
                A75 a752 = ((C214699f7) this.A01).A00;
                if (a752 != null) {
                    a752.A01.A0L(null);
                }
                i = -1405937012;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(288796002);
                C23854Ah6.A00((C23854Ah6) this.A01);
                i = 2080694855;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(188523063);
                ((C8BP) ((C23854Ah6) this.A01).A0P.getValue()).A0A(null, null, false, false);
                i = 1950183967;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A052 = C0f9.A05(-1167226085);
                C23854Ah6 c23854Ah6 = (C23854Ah6) this.A01;
                if (c23854Ah6.A00 == null) {
                    InterfaceC09390do interfaceC09390do3 = c23854Ah6.A0M;
                    float rotation = AbstractC167007dF.A0L(interfaceC09390do3).getRotation();
                    float f = rotation - 4.0f;
                    ObjectAnimator.ofFloat(AbstractC166987dD.A17(interfaceC09390do3), (Property<Object, Float>) View.ROTATION, rotation, f, rotation, f, rotation).setDuration(300L).start();
                } else {
                    c23854Ah6.A09.DBH();
                }
                i2 = 581692951;
                C0f9.A0C(i2, A052);
                return;
            case 30:
                A05 = C0f9.A05(-1342707012);
                ((C8EQ) ((C8EO) this.A01).A04.getValue()).A00();
                i = 2042955532;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A05 = C0f9.A05(-608210296);
                ((C8EQ) ((C8EO) this.A01).A04.getValue()).A00();
                i = -765983171;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A05 = C0f9.A05(1704753481);
                ((C172437mC) this.A01).A0F.A00.A1N.E4u(new Object());
                i = 1501961373;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A05 = C0f9.A05(1517688383);
                ((C8DN) this.A01).A00.A1N.E4u(new Object());
                i = -170884154;
                C0f9.A0C(i, A05);
                return;
            case 34:
                A052 = C0f9.A05(-876312507);
                C23629AdO c23629AdO = (C23629AdO) this.A01;
                InterfaceC1810081c interfaceC1810081c = c23629AdO.A0X;
                interfaceC1810081c.E4u(new Object());
                ImageView imageView = c23629AdO.A05;
                imageView.getClass();
                Context context = c23629AdO.A0L.getContext();
                int i5 = 2131970026;
                if (interfaceC1810081c.CRB(EnumC1810181d.A1D)) {
                    i5 = 2131970027;
                }
                AbstractC166997dE.A18(context, imageView, i5);
                i2 = 358356445;
                C0f9.A0C(i2, A052);
                return;
            case 35:
                A05 = C0f9.A05(-1208640757);
                C23853Ah5 c23853Ah5 = (C23853Ah5) this.A01;
                UserSession userSession = c23853Ah5.A0H;
                C22C A013 = AnonymousClass229.A01(userSession);
                EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
                A013.A1I(enumC50631MWs);
                IgEditText igEditText = c23853Ah5.A02;
                if (igEditText == null) {
                    str = "stickerEditText";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                igEditText.setText("");
                c23853Ah5.A0I.E4u(C8UR.A00);
                AbstractC47059KrG.A00(c23853Ah5.A0E, enumC50631MWs, userSession, new C23968Ak3(c23853Ah5));
                i = -101245010;
                C0f9.A0C(i, A05);
                return;
            case 36:
                A052 = C0f9.A05(1132481947);
                N7P n7p = (N7P) this.A01;
                C8JT c8jt = n7p.A03;
                if (c8jt != null) {
                    int i6 = n7p.A00;
                    boolean z2 = !C8JT.A1Y(c8jt);
                    c8jt.A02 = i6;
                    if (z2) {
                        C185488Kq c185488Kq = c8jt.A1X;
                        if (c185488Kq.A03 != null) {
                            C185488Kq.A03(c185488Kq, false);
                        }
                    }
                    c8jt.A1F.A0P(C81W.A0y, i6);
                    C8JT.A0a(c8jt);
                }
                Context context2 = n7p.getContext();
                if (context2 != null && (A01 = C3DN.A00.A01(context2)) != null) {
                    A01.A0B();
                } else {
                    AbstractC12120kG.A07(N7P.__redex_internal_original_name, "bottomSheetNavigator is null", null);
                }
                i2 = -1112751586;
                C0f9.A0C(i2, A052);
                return;
            case 37:
                A052 = C0f9.A05(-100035357);
                N7P n7p2 = (N7P) this.A01;
                C8JT c8jt2 = n7p2.A03;
                if (c8jt2 != null) {
                    if (C8JT.A1b(c8jt2)) {
                        C185488Kq c185488Kq2 = c8jt2.A1X;
                        if (c185488Kq2.A03 != null) {
                            C185488Kq.A03(c185488Kq2, false);
                        }
                    }
                    C1810981l c1810981l = c8jt2.A1F;
                    C81W c81w = C81W.A0y;
                    c1810981l.A0P(c81w, C8GX.A02(c81w));
                    C8JT.A0a(c8jt2);
                }
                Context context3 = n7p2.getContext();
                if (context3 != null && (A012 = C3DN.A00.A01(context3)) != null) {
                    A012.A0B();
                } else {
                    AbstractC12120kG.A07(N7P.__redex_internal_original_name, "bottomSheetNavigator is null", null);
                }
                i2 = 154893825;
                C0f9.A0C(i2, A052);
                return;
            case 38:
                A05 = C0f9.A05(-687309487);
                C8D6 c8d6 = ((C191478dz) this.A01).A0t;
                if (c8d6 != null) {
                    c8d6.A03(C219629nA.A00);
                    Drawable A002 = c8d6.A00();
                    if (A002 != null) {
                        c8d6.A02(A002);
                    }
                }
                i = 1916705839;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A05 = C0f9.A05(-228917980);
                if (!view.isActivated()) {
                    C55081Oab.A02.A01(((Fragment) this.A01).requireContext(), 2131955971);
                } else {
                    ClipsStackedTimelineFragment clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) this.A01;
                    C187358Sd c187358Sd = clipsStackedTimelineFragment.A0d;
                    String str9 = null;
                    if (c187358Sd != null) {
                        AbstractC187378Sf A0E = c187358Sd.A0E();
                        if ((A0E instanceof C8T3) && (c8t3 = (C8T3) A0E) != null) {
                            NIW niw = clipsStackedTimelineFragment.A0f;
                            if (niw == null) {
                                str = "stackedTimelineAudioTrackViewModel";
                                C14360o3.A0F(str);
                                throw C00O.createAndThrow();
                            }
                            C51832Mva A0M = niw.A0M(c8t3.A01, c8t3.A00);
                            if (A0M != null && (c51676Ms7 = A0M.A08) != null) {
                                str9 = c51676Ms7.A08;
                            }
                        }
                        C187438Sl c187438Sl = clipsStackedTimelineFragment.A09;
                        if (c187438Sl != null) {
                            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = c187438Sl.A00;
                            ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
                            clipsTimelineEditorDrawerController.A0f.E4u(new Object());
                            C05A c05a = clipsTimelineEditorDrawerController.A0k.A0Z;
                            C8GD c8gd2 = (C8GD) c05a.getValue();
                            if (c8gd2 != null && (str3 = c8gd2.BVf().A0S) != null && str3.equals(str9) && (c8gd = (C8GD) c05a.getValue()) != null) {
                                C87D c87d = clipsTimelineEditorDrawerController.A0j;
                                c87d.A00.A0B(new C8A8(true));
                                MusicAssetModel A03 = MusicAssetModel.A03(c8gd.BVf());
                                AbstractC193598he abstractC193598he2 = (AbstractC193598he) c87d.A01.A0Y.getValue();
                                int i7 = abstractC193598he2.A00;
                                if (i7 != 0 && ((i7 == 3 || i7 == 2) && (audioOverlayTrack = (AudioOverlayTrack) abstractC193598he2.A00()) != null)) {
                                    A053 = audioOverlayTrack.A03;
                                } else {
                                    Integer num3 = c8gd.BVf().A0K;
                                    if (num3 != null) {
                                        A053 = num3.intValue();
                                    } else {
                                        A053 = A03.A05();
                                    }
                                }
                                C70569Wd3 c70569Wd3 = clipsTimelineEditorDrawerController.A0D;
                                if (c70569Wd3 != null) {
                                    ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = clipsTimelineEditorDrawerController.A0g;
                                    clipsAudioMixingDrawerController.A04 = c70569Wd3;
                                    clipsAudioMixingDrawerController.A00 = c70569Wd3.A01;
                                }
                                ClipsAudioMixingDrawerController clipsAudioMixingDrawerController2 = clipsTimelineEditorDrawerController.A0g;
                                C14360o3.A0A(A03);
                                clipsAudioMixingDrawerController2.A04(new C191708eS(A03, c8gd.BVp(), str9, A053, c8gd.C0U(), true));
                            } else {
                                ClipsTimelineEditorDrawerController.A05(null, clipsTimelineEditorDrawerController, str9, null, false, false, true);
                            }
                        }
                    }
                    str = "clipsTimelineEditorViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i = 1739345394;
                C0f9.A0C(i, A05);
                return;
            case 40:
                A05 = C0f9.A05(1610951228);
                ClipsStackedTimelineFragment clipsStackedTimelineFragment2 = (ClipsStackedTimelineFragment) this.A01;
                AnonymousClass229.A01(clipsStackedTimelineFragment2.A0N()).A1D(EnumC203578zI.STACKED_TIMELINE);
                C187358Sd c187358Sd2 = clipsStackedTimelineFragment2.A0d;
                if (c187358Sd2 != null) {
                    c187358Sd2.A0G(C219479mv.A00);
                    i = 669323630;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "clipsTimelineEditorViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.NULL_REFNUM /* 41 */:
                A05 = C0f9.A05(501533136);
                C187418Sj c187418Sj = ((ClipsTimelineActionBarViewController) this.A01).A06;
                if (c187418Sj != null) {
                    c187418Sj.A0F(C23876AhV.A00);
                }
                i = 1635675765;
                C0f9.A0C(i, A05);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = C0f9.A05(1510560098);
                C23873AhS c23873AhS = (C23873AhS) this.A01;
                AbstractC166987dD.A0u(c23873AhS.A06).A02(c23873AhS.A0A, "templates_add_media");
                c23873AhS.A08.A0F(new C9BF());
                i = -2105011492;
                C0f9.A0C(i, A05);
                return;
            case 43:
                A052 = C0f9.A05(1750387070);
                C23873AhS c23873AhS2 = (C23873AhS) this.A01;
                C89P c89p = c23873AhS2.A07;
                if (c89p.A0J()) {
                    ClipsAudioStore clipsAudioStore = c89p.A0L.A0K;
                    AbstractC193598he abstractC193598he3 = (AbstractC193598he) clipsAudioStore.A06.A02();
                    if (abstractC193598he3 == null || (audioOverlayTrack2 = (AudioOverlayTrack) abstractC193598he3.A01) == null) {
                        List list = (List) clipsAudioStore.A0V.getValue();
                        if (list != null && (abstractC193598he = (AbstractC193598he) AbstractC001800i.A0L(list)) != null) {
                            audioOverlayTrack2 = (AudioOverlayTrack) abstractC193598he.A01;
                        } else {
                            audioOverlayTrack2 = null;
                        }
                    }
                    UserSession userSession2 = c23873AhS2.A06;
                    C447024a c447024a = AnonymousClass229.A01(userSession2).A02;
                    String str10 = null;
                    if (audioOverlayTrack2 != null) {
                        str4 = audioOverlayTrack2.A0A;
                        str5 = audioOverlayTrack2.A0B;
                        MusicAssetModel musicAssetModel = audioOverlayTrack2.A08;
                        if (musicAssetModel != null) {
                            str10 = musicAssetModel.A0I;
                        }
                    } else {
                        str4 = null;
                        str5 = null;
                    }
                    AbstractC167027dH.A10(c447024a);
                    C447024a.A01(c447024a, "user_template_media_selection_done", str4, str5, str10, null, null, null, null, null);
                    InterfaceC110214xq interfaceC110214xq = c89p.A04;
                    if (interfaceC110214xq != null && (AdG = interfaceC110214xq.AdG()) != null && (templateMediaId = AdG.getTemplateMediaId()) != null) {
                        C22C A014 = AnonymousClass229.A01(userSession2);
                        C24H c24h = c89p.A03;
                        if (c24h == null) {
                            c24h = C24H.UNKNOWN;
                        }
                        A014.A1X(c24h, templateMediaId, "TEMPLATE_BUILDER_NEXT_BUTTON_TAPPED");
                    }
                    c23873AhS2.A08.A0F(C23876AhV.A00);
                } else {
                    Resources A0N = AbstractC166997dE.A0N(c23873AhS2.A05);
                    InterfaceC110214xq interfaceC110214xq2 = c89p.A04;
                    if (interfaceC110214xq2 != null && interfaceC110214xq2.BTu() != null) {
                        InterfaceC110214xq interfaceC110214xq3 = c89p.A04;
                        if (interfaceC110214xq3 != null && (BTu = interfaceC110214xq3.BTu()) != null) {
                            i3 = BTu.intValue() - c89p.A01;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        i3 = 3 - c89p.A01;
                    }
                    if (i3 <= 0 && !c89p.A0J()) {
                        i3 = 1;
                    }
                    String A0r = AbstractC166997dE.A0r(A0N, Integer.valueOf(i3), 2131955508);
                    C14360o3.A07(A0r);
                    C9GR.A09(view.getContext(), A0r);
                }
                i2 = 1676123075;
                C0f9.A0C(i2, A052);
                return;
            case 44:
                A05 = C0f9.A05(73571906);
                ((C23873AhS) this.A01).A08.A0F(C23879AhY.A00);
                i = -227869432;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A05 = C0f9.A05(-767124391);
                ((C23873AhS) this.A01).A09.A0G(new C187368Se(false));
                i = -1628769279;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(-1281477776);
                C219469mu c219469mu = (C219469mu) this.A01;
                InterfaceC110214xq interfaceC110214xq4 = c219469mu.A0O().A04;
                if (interfaceC110214xq4 != null && (AdG2 = interfaceC110214xq4.AdG()) != null && (templateMediaId2 = AdG2.getTemplateMediaId()) != null) {
                    AnonymousClass229.A01(c219469mu.A0N()).A1X(c219469mu.A04, templateMediaId2, "TEMPLATE_LANDING_PAGE_ADD_CLIPS_TAPPED");
                }
                c219469mu.A0O().A0G(false);
                i = 298732717;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = C0f9.A05(-818302299);
                Ai8 ai8 = (Ai8) this.A01;
                C55101ObE c55101ObE = new C55101ObE(ai8.A05, ai8.A02);
                String str11 = ai8.A06.A01;
                c55101ObE.A07(true, str11);
                C22877A6x c22877A6x = ai8.A07;
                C81Z c81z = c22877A6x.A01;
                c81z.A0Z.A0D(false);
                int ordinal = c81z.A0n.A02.A01().ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        OpenCarouselCaptureConfig openCarouselCaptureConfig = c22877A6x.A00.A0b;
                        if (openCarouselCaptureConfig != null && openCarouselCaptureConfig.A03) {
                            IQU.A00(c81z.A09, 2131969128);
                        } else {
                            c81z.A0f.A0Q(new ACA(null, UserStoryTarget.A01, ShareType.A0H), null, C05F.A00, null, str11, false);
                        }
                    } else {
                        throw AbstractC166987dD.A1D("Unknown media type");
                    }
                } else {
                    c81z.A0b.A0J(null, new ACA(null, UserStoryTarget.A01, ShareType.A0H), null, null, null, C05F.A00, null, null, str11, false, false);
                }
                i = 1016647155;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A05 = C0f9.A05(595604483);
                FragmentActivity activity = ((Fragment) this.A01).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                i = -1101598782;
                C0f9.A0C(i, A05);
                return;
            case 49:
                A05 = C0f9.A05(-814655621);
                C214759fD.A07((C214759fD) this.A01);
                i = -2141993585;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A05 = C0f9.A05(1363961094);
                IgProgressImageView igProgressImageView = (IgProgressImageView) this.A01;
                if (igProgressImageView.getIgImageView().A0C != null) {
                    igProgressImageView.getIgImageView().A0A();
                }
                i = 1410043111;
                C0f9.A0C(i, A05);
                return;
            case 51:
                A05 = C0f9.A05(1676822408);
                AMp aMp = (AMp) this.A01;
                aMp.A0J.A0G();
                Fragment fragment = (Fragment) aMp.A0P.get();
                if (fragment != null) {
                    UserSession userSession3 = aMp.A0I;
                    AnonymousClass229.A01(userSession3);
                    String moduleName = C22F.A08.getModuleName();
                    C45441KAc c45441KAc = new C45441KAc();
                    c45441KAc.setArguments(AbstractC167017dG.A0T("IgSessionManager.SESSION_TOKEN_KEY", userSession3.token, AbstractC166987dD.A1L(AbstractC111324zv.A00(44), moduleName)));
                    C189448aO c189448aO = new C189448aO(userSession3);
                    c189448aO.A0x = false;
                    c189448aO.A0a = true;
                    c189448aO.A03 = 1.0f;
                    c189448aO.A06 = aMp.A0G.getContext().getColor(R.color.grey_10);
                    c189448aO.A0U = new C24116An1(aMp, 6);
                    c189448aO.A00().A02(fragment.requireActivity(), c45441KAc);
                }
                C449524z c449524z = AnonymousClass229.A01(aMp.A0I).A05;
                ArrayList A1E = AbstractC166987dD.A1E();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c449524z.A01, "tap_edit_avatar_sticker_event");
                if (A0f2.isSampled()) {
                    A0f2.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "music_sticker");
                    A0f2.AAk("recipient_ids", A1E);
                    A0f2.Cht();
                }
                i = -139496281;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A05 = C0f9.A05(-324753463);
                ((QuickSnapArchiveViewModel) ((C193798hz) this.A01).A0D.getValue()).A06();
                i = 1821315220;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A05 = C0f9.A05(1057665318);
                QuickSnapArchiveViewModel quickSnapArchiveViewModel = (QuickSnapArchiveViewModel) ((C193798hz) this.A01).A0D.getValue();
                C05A c05a2 = quickSnapArchiveViewModel.A0G;
                if (((C9BR) c05a2.getValue()).A02) {
                    QuickSnapArchiveViewModel.A02(quickSnapArchiveViewModel);
                    i = 1159992878;
                    C0f9.A0C(i, A05);
                    return;
                }
                do {
                } while (!c05a2.AIi(c05a2.getValue(), new C9BR(new LinkedHashSet(), true)));
                QuickSnapArchiveViewModel.A01(C24001Akf.A00, quickSnapArchiveViewModel);
                i = 1159992878;
                C0f9.A0C(i, A05);
                return;
            case 54:
                A05 = C0f9.A05(-1737775044);
                ((QuickSnapArchiveViewModel) ((C193798hz) this.A01).A0D.getValue()).A06();
                i = -1753749613;
                C0f9.A0C(i, A05);
                return;
            case 55:
                A05 = C0f9.A05(-798606653);
                C8XV c8xv = ((C55087Oak) this.A01).A08.A01;
                if (c8xv != null) {
                    c8xv.A02();
                }
                i = 384075730;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A05 = C0f9.A05(623179651);
                C8XV c8xv2 = ((C55087Oak) this.A01).A08.A01;
                if (c8xv2 != null) {
                    c8xv2.A02();
                }
                i = 59682415;
                C0f9.A0C(i, A05);
                return;
            case 57:
                A05 = C0f9.A05(-593089079);
                C8HC c8hc = (C8HC) ((C55087Oak) this.A01).A08.A0F.getValue();
                c8hc.A04 = true;
                C8HC.A04(c8hc, C57664PiF.A00);
                C8HC.A03(new C56503P7b(true), c8hc);
                C191138dB.A01(EnumC223409tX.ADD_CAPTION, c8hc.A0A, null);
                i = -1951095582;
                C0f9.A0C(i, A05);
                return;
            case 58:
                A05 = C0f9.A05(37699963);
                C8HB c8hb = ((C55087Oak) this.A01).A08;
                C191138dB.A00(EnumC53366NjH.TAP_ON_ARCHIVE_ICON, ((C8HC) c8hb.A0F.getValue()).A0A, null);
                c8hb.A09.A00.A1M.A00().A08().A0k(true);
                i = 833395873;
                C0f9.A0C(i, A05);
                return;
            case 59:
                A05 = C0f9.A05(-1087184892);
                C148456mF.A02((C148456mF) ((C148476mH) this.A01).A02.getValue());
                i = 647221318;
                C0f9.A0C(i, A05);
                return;
            case 60:
                A05 = C0f9.A05(1934749352);
                ViewOnFocusChangeListenerC207579Gl.A01((ViewOnFocusChangeListenerC207579Gl) this.A01);
                i = 1412723061;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A05 = C0f9.A05(1404113733);
                N54 n54 = (N54) this.A01;
                C22879A6z c22879A6z = n54.A02;
                if (c22879A6z != null) {
                    boolean z3 = n54.A04;
                    C8Y8 c8y8 = c22879A6z.A00;
                    c8y8.A0A.A1r.A04(z3);
                    String str12 = c22879A6z.A01;
                    c8y8.A0G(str12, null);
                    C8Y8.A02(EnumC201098ur.ACCEPT, c8y8, str12, z3);
                }
                C3DN A015 = C3DN.A00.A01(n54.getContext());
                if (A015 != null) {
                    A015.A0B();
                }
                i = 628856346;
                C0f9.A0C(i, A05);
                return;
            case 62:
                A05 = C0f9.A05(1250190517);
                C23851Ah3 c23851Ah3 = (C23851Ah3) ((OyP) this.A01).A0D.getValue();
                if (c23851Ah3 != null) {
                    c23851Ah3.DBH();
                }
                i = -1043780046;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC23249ASk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
