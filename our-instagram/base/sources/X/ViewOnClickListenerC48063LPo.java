package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import com.instagram.creation.fragment.ManageDraftsFragment;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.modal.ModalActivity;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import go.Seq;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.LPo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48063LPo implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC48063LPo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC48063LPo(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, X.1vN] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int A052;
        int i2;
        Medium medium;
        String str;
        C44767Jro c44767Jro;
        C45077Jx6 c45077Jx6;
        Integer num;
        String str2;
        int A053;
        int i3;
        int A054;
        int i4;
        Object value;
        Integer num2;
        boolean z;
        boolean z2;
        Object value2;
        Integer num3;
        boolean z3;
        boolean z4;
        int i5;
        int A055;
        IllegalStateException A0g;
        int i6;
        int i7;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1616152227);
                L57 l57 = (L57) this.A01;
                l57.A03.setVisibility(8);
                l57.A02.setVisibility(0);
                l57.A05.requestFocus();
                i = -2001477371;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A052 = C0f9.A05(1052417374);
                C48592LeU c48592LeU = (C48592LeU) this.A01;
                if (!c48592LeU.A02) {
                    String A00 = C48592LeU.A00(c48592LeU);
                    if (A00 != null && A00.length() != 0) {
                        String A01 = AbstractC47839LBc.A01(A00);
                        C14360o3.A07(A01);
                        C1OK c1ok = c48592LeU.A00;
                        if (c1ok != null) {
                            c1ok.A00();
                        }
                        C1OK c1ok2 = new C1OK();
                        c48592LeU.A00 = c1ok2;
                        C1ON A002 = C25401Lu.A00(c1ok2.A00, c48592LeU.A06, A01);
                        A002.A00 = new C45551KEq(A01, c48592LeU, 1);
                        C1GJ.A03(A002);
                    } else {
                        ((C8NW) c48592LeU.A07).onBackPressed();
                        C48592LeU.A02(c48592LeU, false);
                    }
                }
                i2 = 108550817;
                C0f9.A0C(i2, A052);
                return;
            case 2:
                A052 = C0f9.A05(525814715);
                C48592LeU c48592LeU2 = (C48592LeU) this.A01;
                String A003 = C48592LeU.A00(c48592LeU2);
                if (A003 != null && A003.length() != 0) {
                    Activity activity = c48592LeU2.A03;
                    if (!activity.isFinishing()) {
                        C193328hC A0I = AbstractC31171DnF.A0I(activity);
                        A0I.A0A(2131976209);
                        A0I.A09(2131976208);
                        DialogInterfaceOnClickListenerC48023LMs.A01(A0I, c48592LeU2, 16, 2131977166);
                        A0I.A0H(null, 2131968555);
                        AbstractC166987dD.A1W(A0I);
                        i2 = 1176144657;
                        C0f9.A0C(i2, A052);
                        return;
                    }
                }
                ((C8NW) c48592LeU2.A07).onBackPressed();
                C48592LeU.A02(c48592LeU2, false);
                i2 = 1176144657;
                C0f9.A0C(i2, A052);
                return;
            case 3:
                A052 = C0f9.A05(-709103371);
                JT7 jt7 = (JT7) this.A01;
                SpinnerImageView spinnerImageView = jt7.A04;
                if (spinnerImageView != null) {
                    AbstractC31171DnF.A1M(spinnerImageView);
                }
                int ordinal = jt7.A0F.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 && ((Map) jt7.A0H.A07.getValue()).isEmpty()) {
                        jt7.AD4();
                    }
                } else {
                    C75B c75b = jt7.A0H;
                    if (((Map) c75b.A08.getValue()).isEmpty()) {
                        c75b.A01(20, null);
                    }
                }
                i2 = -1721870243;
                C0f9.A0C(i2, A052);
                return;
            case 4:
                A05 = C0f9.A05(1814859451);
                ((C8NW) ((C48589LeR) this.A01).A08).onBackPressed();
                i = -473435789;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A052 = C0f9.A05(1372312234);
                L11 l11 = (L11) this.A01;
                if (!l11.A01.onBackPressed()) {
                    l11.A02.A07();
                }
                i2 = 974784149;
                C0f9.A0C(i2, A052);
                return;
            case 6:
                A05 = C0f9.A05(-671290851);
                AbstractC166987dD.A1Y(this.A01);
                i = -600219061;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(134991089);
                ((C43830JZt) this.A01).A0K(!r3.A0D.A07, true);
                i = -50732595;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A052 = C0f9.A05(1182659242);
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = (GestureDetectorOnGestureListenerC43829JZs) this.A01;
                UserSession userSession = gestureDetectorOnGestureListenerC43829JZs.A0z;
                MX1.A01(userSession).A03(gestureDetectorOnGestureListenerC43829JZs.A0q);
                AnonymousClass229.A01(userSession).A10(EnumC114925Hg.FEED, null);
                if (!AbstractC25651Mw.A00(userSession).A05(new Object())) {
                    MYZ A012 = MX1.A01(userSession);
                    A012.A01 = A012.A0B.A07(String.valueOf((Object) null), "", 288435480, A012.A01);
                    AbstractC12120kG.A0A("GalleryPickerView", "@haydenkai UnifiedCameraDismissFeedGalleryEvent failed", null);
                    C9GR.A0F(gestureDetectorOnGestureListenerC43829JZs.getContext(), "unable_to_open_camera", 2131976046);
                }
                i2 = -697067953;
                C0f9.A0C(i2, A052);
                return;
            case 9:
                A052 = C0f9.A05(1275477665);
                IgCaptureVideoPreviewView igCaptureVideoPreviewView = ((GestureDetectorOnGestureListenerC43829JZs) this.A01).A0J;
                if (igCaptureVideoPreviewView != null) {
                    if (igCaptureVideoPreviewView.A04 == MXU.PAUSED) {
                        igCaptureVideoPreviewView.A06();
                    } else {
                        igCaptureVideoPreviewView.A04();
                    }
                }
                i2 = 784436864;
                C0f9.A0C(i2, A052);
                return;
            case 10:
                A052 = C0f9.A05(-942396468);
                KCQ kcq = (KCQ) this.A01;
                GalleryItem galleryItem = kcq.A04;
                if (galleryItem != null && (medium = galleryItem.A00) != null) {
                    MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                    C43868JaY c43868JaY = kcq.A06;
                    if (c43868JaY == null) {
                        str = "cropImageController";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    c43868JaY.A02(kcq.requireContext(), mediaUploadMetadata);
                }
                kcq.requireActivity().getSupportFragmentManager().A0b();
                i2 = -1107474122;
                C0f9.A0C(i2, A052);
                return;
            case 11:
                A052 = C0f9.A05(1197612694);
                C45752KNf c45752KNf = (C45752KNf) this.A01;
                int i8 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                IgCaptureVideoPreviewView igCaptureVideoPreviewView2 = c45752KNf.A04;
                if (igCaptureVideoPreviewView2.A04 == MXU.PAUSED) {
                    igCaptureVideoPreviewView2.A06();
                } else {
                    igCaptureVideoPreviewView2.A04();
                }
                i2 = 1179988067;
                C0f9.A0C(i2, A052);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(-33010588);
                ((C48625Lf1) this.A01).A09.invoke();
                i = -673132007;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(1912283091);
                ((KCE) this.A01).onBackPressed();
                i = -333472196;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A052 = C0f9.A05(19409085);
                KCE kce = (KCE) this.A01;
                C09530e4 A02 = KCE.A02(kce);
                if (A02 != null && (c44767Jro = (C44767Jro) A02.A00) != null && (c45077Jx6 = c44767Jro.A01) != null) {
                    AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(kce.A0F);
                    AbstractC166987dD.A1Z(new C25023B5e(c45077Jx6, A0Z, null, 9), AbstractC141776au.A00(A0Z));
                }
                i2 = -117357203;
                C0f9.A0C(i2, A052);
                return;
            case Process.SIGTERM /* 15 */:
                A052 = C0f9.A05(1353955915);
                C44767Jro c44767Jro2 = (C44767Jro) this.A01;
                C45077Jx6 c45077Jx62 = c44767Jro2.A01;
                if (c45077Jx62 != null) {
                    C44535Jmf c44535Jmf = c44767Jro2.A0E;
                    AbstractC166987dD.A1Z(new C25023B5e(c45077Jx62, c44535Jmf, null, 9), AbstractC141776au.A00(c44535Jmf));
                }
                i2 = -42184956;
                C0f9.A0C(i2, A052);
                return;
            case 16:
                A05 = C0f9.A05(-1473988711);
                C44767Jro c44767Jro3 = (C44767Jro) this.A01;
                int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C44535Jmf c44535Jmf2 = c44767Jro3.A0E;
                C50120MBu.A01(c44535Jmf2, "https://help.instagram.com/6232621926851479", AbstractC141776au.A00(c44535Jmf2), 37);
                AnonymousClass229.A01(c44535Jmf2.A03).A1R(EnumC50631MWs.A02, "ACR_BROWSER_THREE_DOTS_MENU_MORE_INFO_BUTTON");
                i = 1181393525;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(-1770255921);
                AbstractC31176DnK.A1Y(this.A01);
                i = 1731401090;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(448330176);
                ((C48605Leh) this.A01).A04.A00(false);
                i = 968621379;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(-476737309);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putSerializable("ARGUMENT_CAMERA_SETTINGS_MODE", EnumC46157Kbv.A03);
                C48605Leh c48605Leh = (C48605Leh) this.A01;
                A0b.putString(DialogModule.KEY_TITLE, c48605Leh.A02.getString(2131965534));
                AbstractC31177DnL.A0n(c48605Leh.A01, A0b, c48605Leh.A03, ModalActivity.class, "camera_settings");
                i = -169621321;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(-1451564781);
                C48605Leh c48605Leh2 = (C48605Leh) this.A01;
                UserSession userSession2 = c48605Leh2.A03;
                AnonymousClass229.A01(userSession2);
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putSerializable("ARGUMENT_CAMERA_SETTINGS_MODE", EnumC46157Kbv.A04);
                A0b2.putString(DialogModule.KEY_TITLE, c48605Leh2.A02.getString(2131972006));
                AbstractC31177DnL.A0n(c48605Leh2.A01, A0b2, userSession2, ModalActivity.class, "camera_settings");
                i = 1073594064;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(-706228740);
                Bundle A0b3 = AbstractC166987dD.A0b();
                A0b3.putSerializable("ARGUMENT_CAMERA_SETTINGS_MODE", EnumC46157Kbv.A05);
                C48605Leh c48605Leh3 = (C48605Leh) this.A01;
                AbstractC31177DnL.A0n(c48605Leh3.A01, A0b3, c48605Leh3.A03, ModalActivity.class, "camera_settings");
                i = 398536577;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A052 = C0f9.A05(720521546);
                C48252LXb c48252LXb = (C48252LXb) this.A01;
                int intValue = c48252LXb.A01.intValue();
                if (intValue != 0) {
                    num = C05F.A00;
                } else {
                    num = C05F.A01;
                }
                HashMap A1G = AbstractC166987dD.A1G();
                if (intValue != 0) {
                    str2 = "disallow_reshare";
                } else {
                    str2 = "allow_reshare";
                }
                A1G.put("reshare_mode", str2);
                if (c48252LXb.A01 != num) {
                    c48252LXb.A01 = num;
                }
                c48252LXb.A00.A00(num);
                AbstractC43821JZj.A00(c48252LXb, c48252LXb.A02, null, "remix_reply_reshare_settings", "tap", "remix_reply_post_capture", null, A1G);
                i2 = -1081263680;
                C0f9.A0C(i2, A052);
                return;
            case 23:
                A053 = C0f9.A05(904643007);
                C44795JsG c44795JsG = (C44795JsG) this.A01;
                int i10 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C46520KiJ c46520KiJ = c44795JsG.A01;
                Reel reel = c44795JsG.A02;
                C45509KCy c45509KCy = c44795JsG.A00;
                if (c45509KCy != null && reel != null && c46520KiJ != null) {
                    int bindingAdapterPosition = c44795JsG.getBindingAdapterPosition();
                    AttributedAREffect attributedAREffect = reel.A0G;
                    if (attributedAREffect != null) {
                        C4T6 A004 = C4T4.A00(AbstractC166987dD.A0r(c45509KCy.A0B));
                        String str3 = c45509KCy.A07;
                        if (str3 == null) {
                            str = "profileTabSessionId";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        A004.Ckv(str3, attributedAREffect.A09, bindingAdapterPosition % 2, bindingAdapterPosition / 2);
                    }
                    List A1J = AbstractC166987dD.A1J(reel);
                    C44571Jnw c44571Jnw = c45509KCy.A03;
                    if (c44571Jnw != null) {
                        C38321qM A005 = c44571Jnw.A00(bindingAdapterPosition);
                        if (A005 != null) {
                            C47510Kyd c47510Kyd = c45509KCy.A01;
                            if (c47510Kyd == null) {
                                str = "previewImpressionsTracker";
                                C14360o3.A0F(str);
                                throw C00O.createAndThrow();
                            }
                            View view2 = c44795JsG.itemView;
                            C59072n8 A006 = C59062n7.A00(A005, new Object(), A005.getId());
                            A006.A00(c47510Kyd.A00);
                            AbstractC25227BEk.A10(view2, A006, c47510Kyd.A01);
                        }
                        C38E c38e = c45509KCy.A06;
                        if (c38e == null) {
                            str = "reelViewerLauncher";
                        } else {
                            C64012vM c64012vM = c45509KCy.A05;
                            if (c64012vM == null) {
                                str = "reelTrayLogger";
                            } else {
                                c38e.A0C = c64012vM.A04;
                                c38e.A05 = new KZ1(c45509KCy, c44795JsG);
                                List list = c45509KCy.A09;
                                if (list == null) {
                                    list = A1J;
                                }
                                c38e.A06(reel, C3G2.A0G, c44795JsG, A1J, list, list);
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    str = "adapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i3 = -239823213;
                C0f9.A0C(i3, A053);
                return;
            case 24:
                A05 = C0f9.A05(-174281924);
                C48624Lf0 c48624Lf0 = (C48624Lf0) this.A01;
                C48624Lf0.A02(c48624Lf0, EnumC46218Kcu.A07);
                C48624Lf0.A00(c48624Lf0);
                C48624Lf0.A01(c48624Lf0);
                i = 1754006474;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(-2083161214);
                C48624Lf0 c48624Lf02 = (C48624Lf0) this.A01;
                C48624Lf0.A02(c48624Lf02, EnumC46218Kcu.A06);
                C48624Lf0.A00(c48624Lf02);
                C48624Lf0.A01(c48624Lf02);
                i = 2061968502;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A05 = C0f9.A05(905197106);
                C48624Lf0 c48624Lf03 = (C48624Lf0) this.A01;
                C48624Lf0.A02(c48624Lf03, EnumC46218Kcu.A09);
                C48624Lf0.A00(c48624Lf03);
                C48624Lf0.A01(c48624Lf03);
                i = -1600845269;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(-1497066679);
                C48624Lf0 c48624Lf04 = (C48624Lf0) this.A01;
                C48624Lf0.A02(c48624Lf04, EnumC46218Kcu.A08);
                C48624Lf0.A00(c48624Lf04);
                C48624Lf0.A01(c48624Lf04);
                i = -1857556573;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(935946317);
                C45486KCa c45486KCa = new C45486KCa();
                C23852Ah4 c23852Ah4 = (C23852Ah4) this.A01;
                UserSession userSession3 = c23852Ah4.A05;
                AbstractC148206lq abstractC148206lq = (AbstractC148206lq) userSession3.A01(C45753KNg.class, new B8S(userSession3, 41));
                C14360o3.A0B(abstractC148206lq, 0);
                c45486KCa.A02 = abstractC148206lq;
                c45486KCa.A01 = new C23763Afa(c23852Ah4);
                C189448aO A0y = AbstractC25225BEi.A0y(userSession3);
                A0y.A06 = c23852Ah4.A03.getColor(R.color.black_70_transparent);
                A0y.A0T = c45486KCa;
                A0y.A03 = 0.7f;
                A0y.A0k = true;
                AbstractC25225BEi.A1Q(A0y, true);
                A0y.A00().A02(c23852Ah4.A02, c45486KCa);
                i = -406546190;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(1152814403);
                ((C24042Ale) this.A01).A02();
                i = -1097301662;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(-141290207);
                ((C24042Ale) this.A01).A02();
                i = 1198670944;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A05 = C0f9.A05(1886896496);
                ((C48631Lf7) this.A01).A07.E4u(new Object());
                i = 1479666445;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A05 = C0f9.A05(1323796434);
                C48631Lf7 c48631Lf7 = (C48631Lf7) this.A01;
                LKb.A02(((C8Y6) c48631Lf7.A0A.get()).A05(), c48631Lf7.A04, c48631Lf7.A06, c48631Lf7.A08, c48631Lf7.A09);
                Activity activity2 = c48631Lf7.A02;
                activity2.setResult(-1);
                activity2.finish();
                i = 615243832;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A052 = C0f9.A05(-506540919);
                C45513KDd c45513KDd = (C45513KDd) this.A01;
                AnonymousClass841 A007 = C45513KDd.A00(c45513KDd);
                int i11 = A007.ANZ().A01;
                C5L6 c5l6 = C5L6.A0E;
                if (i11 == c5l6.A01) {
                    c5l6 = C5L6.A08;
                }
                CreationSession creationSession = ((MX5) A007).A01;
                creationSession.A05 = c5l6;
                if (c45513KDd.A08) {
                    c45513KDd.A03.requestLayout();
                }
                creationSession.A06 = A007.ANZ();
                i2 = -481627369;
                C0f9.A0C(i2, A052);
                return;
            case 34:
                A05 = C0f9.A05(287901218);
                InterfaceC50446MPa interfaceC50446MPa = ((C45513KDd) this.A01).A02;
                interfaceC50446MPa.getClass();
                ((MediaCaptureActivity) interfaceC50446MPa).onBackPressed();
                i = -1809559897;
                C0f9.A0C(i, A05);
                return;
            case 35:
                A052 = C0f9.A05(1441227451);
                C45513KDd c45513KDd2 = ((KLA) this.A01).A00;
                C47Z A013 = C45513KDd.A01(c45513KDd2);
                if (A013 != null) {
                    ClipInfo clipInfo = A013.A1N;
                    if (clipInfo != null) {
                        String str4 = clipInfo.A0F;
                        str4.getClass();
                        if (AbstractC166987dD.A11(str4).exists()) {
                            C6WI.A01().A04(c45513KDd2.getSession(), "edit_video");
                            A013.A02 = C45513KDd.A00(c45513KDd2).ACq();
                            InterfaceC50446MPa interfaceC50446MPa2 = c45513KDd2.A02;
                            interfaceC50446MPa2.getClass();
                            interfaceC50446MPa2.Cs4(A013);
                            i2 = 726142467;
                            C0f9.A0C(i2, A052);
                            return;
                        }
                    }
                    C9GR.A0F(AbstractC12290kX.A00, "video_import_error", 2131976697);
                }
                InterfaceC50446MPa interfaceC50446MPa3 = c45513KDd2.A02;
                interfaceC50446MPa3.getClass();
                ((MediaCaptureActivity) interfaceC50446MPa3).onBackPressed();
                i2 = 726142467;
                C0f9.A0C(i2, A052);
                return;
            case 36:
                A05 = C0f9.A05(954463171);
                ((Activity) this.A01).onBackPressed();
                i = -1051698358;
                C0f9.A0C(i, A05);
                return;
            case 37:
                A05 = C0f9.A05(-1549908613);
                AbstractC166987dD.A1Y(this.A01);
                i = -1426752563;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(-357641421);
                AbstractC166987dD.A1Y(((C50627MWo) ((C44135Jf0) this.A01).A00).A00);
                i = -605473357;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A05 = C0f9.A05(-1037260389);
                V1G v1g = ((L8G) this.A01).A02;
                if (v1g == null) {
                    str = "bottomSheetFragment";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                v1g.A03();
                i = 804452483;
                C0f9.A0C(i, A05);
                return;
            case 40:
                A05 = C0f9.A05(32794101);
                ManageDraftsFragment manageDraftsFragment = (ManageDraftsFragment) this.A01;
                AnonymousClass840 anonymousClass840 = manageDraftsFragment.A01;
                if (anonymousClass840 != null && AbstractC43593JPy.A0R(anonymousClass840).A0M) {
                    AbstractC25226BEj.A1Q(manageDraftsFragment);
                } else {
                    AbstractC43593JPy.A1P(manageDraftsFragment.getSession());
                }
                i = -1090301782;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A053 = C0f9.A05(329005520);
                ManageDraftsFragment manageDraftsFragment2 = (ManageDraftsFragment) this.A01;
                if (manageDraftsFragment2.A02) {
                    KEC kec = manageDraftsFragment2.A00;
                    if (kec != null) {
                        if (Collections.unmodifiableList(kec.A02).size() > 0) {
                            KEC kec2 = manageDraftsFragment2.A00;
                            if (kec2 != null) {
                                List A19 = AbstractC31172DnG.A19(kec2.A02);
                                String A0k = AbstractC167017dG.A0k(AbstractC166997dE.A0N(manageDraftsFragment2), A19.size(), R.plurals.discard_x_drafts);
                                C14360o3.A07(A0k);
                                C193328hC A0O = AbstractC31175DnJ.A0O(manageDraftsFragment2);
                                A0O.A05 = A0k;
                                A0O.A0J(new DialogInterfaceOnClickListenerC48021LMq(7, A19, manageDraftsFragment2), 2131958587);
                                A0O.A06();
                                AbstractC166987dD.A1W(A0O);
                                i3 = 1902792651;
                                C0f9.A0C(i3, A053);
                                return;
                            }
                        }
                    }
                    str = "adapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                boolean z5 = !manageDraftsFragment2.A02;
                manageDraftsFragment2.A02 = z5;
                KEC kec3 = manageDraftsFragment2.A00;
                if (kec3 != null) {
                    kec3.A00 = z5;
                    KEC.A00(kec3);
                    ManageDraftsFragment.A00(manageDraftsFragment2);
                    i3 = 1902792651;
                    C0f9.A0C(i3, A053);
                    return;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A053 = C0f9.A05(-1054494008);
                AbstractC31178DnM.A1T(this.A01);
                i3 = -344951321;
                C0f9.A0C(i3, A053);
                return;
            case 43:
                A05 = C0f9.A05(1724699352);
                C45500KCp c45500KCp = (C45500KCp) this.A01;
                InterfaceC09390do interfaceC09390do = c45500KCp.A06;
                AbstractC43593JPy.A0T(interfaceC09390do).A1L(EnumC50631MWs.A0L, null, "AUDIO_EDITOR_PAGE_DONE_BUTTON", null, false);
                C189988bH c189988bH = c45500KCp.A02;
                if (c189988bH != null) {
                    TrackSnippet A0D = c189988bH.A0D();
                    AudioOverlayTrack audioOverlayTrack = c45500KCp.A01;
                    if (audioOverlayTrack != null) {
                        AbstractC31180DnO.A0y(c45500KCp.requireActivity(), JQ0.A0A(audioOverlayTrack, A0D));
                        AbstractC43593JPy.A0T(interfaceC09390do).A03.A01();
                        i = 1421264587;
                        C0f9.A0C(i, A05);
                        return;
                    }
                    str = "audioTrack";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "musicOverlayEditController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 44:
                A05 = C0f9.A05(-1796256446);
                AbstractC31180DnO.A0y(((Fragment) this.A01).requireActivity(), new Intent());
                i = -1249680059;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A053 = C0f9.A05(377613606);
                AbstractC31178DnM.A1T(this.A01);
                i3 = -909831158;
                C0f9.A0C(i3, A053);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A052 = C0f9.A05(2055245676);
                C47811L9t c47811L9t = (C47811L9t) this.A01;
                C49519LuY c49519LuY = c47811L9t.A01;
                if (c49519LuY.A08.A1J != null) {
                    c47811L9t.A00.Ekn(c49519LuY, false);
                    c49519LuY.A02();
                    c49519LuY.onResume();
                } else {
                    c47811L9t.A02(null, C05F.A02);
                }
                i2 = -319415520;
                C0f9.A0C(i2, A052);
                return;
            case 47:
                A053 = C0f9.A05(1270420012);
                AbstractC31178DnM.A1T(this.A01);
                i3 = -1853199707;
                C0f9.A0C(i3, A053);
                return;
            case 48:
                A054 = C0f9.A05(1235643676);
                C45501KCq c45501KCq = (C45501KCq) this.A01;
                C22C A0T = AbstractC43593JPy.A0T(c45501KCq.A06);
                AtomicBoolean atomicBoolean = C38321qM.A0i;
                String str5 = c45501KCq.A02;
                if (str5 == null) {
                    str = "mediaId";
                } else {
                    String A06 = C38801rC.A06(str5);
                    AudioOverlayTrack audioOverlayTrack2 = c45501KCq.A00;
                    if (audioOverlayTrack2 != null) {
                        A0T.A1z("AUDIO_EDITOR_PAGE_DONE_BUTTON", A06, audioOverlayTrack2.A0A);
                        C189988bH c189988bH2 = c45501KCq.A01;
                        if (c189988bH2 != null) {
                            TrackSnippet A0D2 = c189988bH2.A0D();
                            AudioOverlayTrack audioOverlayTrack3 = c45501KCq.A00;
                            if (audioOverlayTrack3 != null) {
                                Intent A0A = JQ0.A0A(audioOverlayTrack3, A0D2);
                                String str6 = c45501KCq.A03;
                                if (str6 == null) {
                                    str = "musicBrowseSessionFullId";
                                } else {
                                    A0A.putExtra("args_music_browse_session_full_id", str6);
                                    AbstractC31180DnO.A0y(c45501KCq.requireActivity(), A0A);
                                    AbstractC31177DnL.A12(c45501KCq);
                                    AbstractC31179DnN.A0x(c45501KCq);
                                    i4 = 890600451;
                                    C0f9.A0C(i4, A054);
                                    return;
                                }
                            }
                        }
                        str = "musicOverlayEditController";
                    }
                    str = "audioTrack";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 49:
                A054 = C0f9.A05(1230032528);
                AbstractC31178DnM.A1T(this.A01);
                i4 = 849398825;
                C0f9.A0C(i4, A054);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A054 = C0f9.A05(1019859975);
                AbstractC31178DnM.A1T(this.A01);
                i4 = 1604158053;
                C0f9.A0C(i4, A054);
                return;
            case 51:
                A054 = C0f9.A05(45317593);
                C45490KCf c45490KCf = (C45490KCf) this.A01;
                C18240vB c18240vB = C45490KCf.A0O;
                InterfaceC50451MPf interfaceC50451MPf = c45490KCf.A05;
                if (interfaceC50451MPf != null) {
                    interfaceC50451MPf.D1r();
                }
                i4 = -626706681;
                C0f9.A0C(i4, A054);
                return;
            case 52:
                A05 = C0f9.A05(1858475355);
                C45490KCf.A01((C45490KCf) this.A01);
                i = -1569549267;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A052 = C0f9.A05(-336229540);
                C45490KCf c45490KCf2 = (C45490KCf) this.A01;
                C18240vB c18240vB2 = C45490KCf.A0O;
                AnonymousClass841 A0Q = AbstractC43594JPz.A0Q(c45490KCf2.requireContextAs(InterfaceC189608af.class));
                int i12 = A0Q.ANZ().A01;
                C5L6 c5l62 = C5L6.A0E;
                if (i12 == c5l62.A01) {
                    c5l62 = C5L6.A08;
                }
                ((MX5) A0Q).A01.A05 = c5l62;
                CropImageView cropImageView = c45490KCf2.A06;
                if (cropImageView != null) {
                    cropImageView.A0N(AbstractC167007dF.A1X(A0Q.ANZ(), C5L6.A08));
                }
                i2 = 2021095609;
                C0f9.A0C(i2, A052);
                return;
            case 54:
                A052 = C0f9.A05(1956670959);
                IgMultiListenerSimpleImageView igMultiListenerSimpleImageView = (IgMultiListenerSimpleImageView) this.A01;
                View.OnClickListener onClickListener = igMultiListenerSimpleImageView.A00;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                Iterator it = igMultiListenerSimpleImageView.A01.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                i2 = -1265430342;
                C0f9.A0C(i2, A052);
                return;
            case 55:
                A05 = C0f9.A05(304881314);
                KFG kfg = ((L41) this.A01).A02;
                AbstractC93174Ft.A01(kfg.A04.requireActivity(), kfg);
                i = 1629148069;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A054 = C0f9.A05(1956293380);
                AbstractC31177DnL.A12(((KFG) this.A01).A04);
                i4 = -130439039;
                C0f9.A0C(i4, A054);
                return;
            case 57:
                A05 = C0f9.A05(1564835827);
                C44771Jrs c44771Jrs = (C44771Jrs) this.A01;
                int i13 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                Medium medium2 = c44771Jrs.A01;
                if (medium2 != null) {
                    C45470KBf c45470KBf = c44771Jrs.A04.A04.A04;
                    String str7 = c45470KBf.A01;
                    Context requireContext = c45470KBf.requireContext();
                    InterfaceC09390do interfaceC09390do2 = c45470KBf.A03;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                    AbstractC167017dG.A1N(requireContext, A0r);
                    C49602Pt A008 = C2Ps.A00(requireContext, A0r);
                    interfaceC09390do2.getValue();
                    File A022 = AMc.A02(A008, str7);
                    Context requireContext2 = c45470KBf.requireContext();
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                    int A0A2 = AbstractC13880nE.A0A(c45470KBf.requireContext()) / 2;
                    int A014 = C1H4.A01((AbstractC13880nE.A0A(c45470KBf.requireContext()) / 2) / 0.5625f);
                    String str8 = medium2.A0X;
                    C50889MeK c50889MeK = c45470KBf.A00;
                    str = "galleryCoverPhotoPickerViewModel";
                    if (c50889MeK != null) {
                        C2GS c2gs = c50889MeK.A00;
                        C14360o3.A0C(c2gs, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.creation.video.intf.CoverFrameSuccessHandler>");
                        Object A023 = c2gs.A02();
                        if (A023 != null) {
                            C55186Odr.A03(requireContext2, A0r2, (InterfaceC57942Pmm) A023, A022, str8, 0.5625f, A0A2, A014);
                            C50889MeK c50889MeK2 = c45470KBf.A00;
                            if (c50889MeK2 != null) {
                                AbstractC166987dD.A1Z(new PZT(c50889MeK2, null, 6), AbstractC141776au.A00(c50889MeK2));
                                AbstractC31177DnL.A12(c45470KBf);
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i = -446741793;
                C0f9.A0C(i, A05);
                return;
            case 58:
                A055 = C0f9.A05(-2018188544);
                KCP kcp = (KCP) this.A01;
                C44529JmZ A0Z2 = AbstractC43592JPx.A0Z(kcp);
                AnonymousClass841 A0R = AbstractC43594JPz.A0R(kcp.requireContext());
                C47Z A0i = AbstractC43593JPy.A0i(kcp);
                MXB mxb = kcp.A08;
                if (mxb != null) {
                    A0Z2.A01(mxb, A0R, A0i);
                    i7 = 1167169305;
                    C0f9.A0C(i7, A055);
                    return;
                } else {
                    A0g = AbstractC166997dE.A0g();
                    i6 = 462927777;
                    C0f9.A0C(i6, A055);
                    throw A0g;
                }
            case 59:
                A055 = C0f9.A05(-690250236);
                AbstractC43592JPx.A0Z((KCP) this.A01).A00();
                i7 = 155650734;
                C0f9.A0C(i7, A055);
                return;
            case 60:
                A052 = C0f9.A05(1915334294);
                C44529JmZ A0Z3 = AbstractC43592JPx.A0Z((KCP) this.A01);
                C05A c05a = A0Z3.A03;
                do {
                    value = c05a.getValue();
                    num2 = C05F.A0C;
                    z = !A0Z3.A05;
                    z2 = ((C51733MtG) value).A04;
                    C14360o3.A0B(num2, 0);
                } while (!c05a.AIi(value, new C51733MtG(num2, true, z, z, z2, z)));
                i2 = 15323188;
                C0f9.A0C(i2, A052);
                return;
            case 61:
                A052 = C0f9.A05(-2086579822);
                C44529JmZ A0Z4 = AbstractC43592JPx.A0Z((KCP) this.A01);
                C05A c05a2 = A0Z4.A03;
                do {
                    value2 = c05a2.getValue();
                    num3 = C05F.A0N;
                    z3 = !A0Z4.A05;
                    z4 = ((C51733MtG) value2).A04;
                    C14360o3.A0B(num3, 0);
                } while (!c05a2.AIi(value2, new C51733MtG(num3, true, z3, z3, z4, z3)));
                i2 = 1013331243;
                C0f9.A0C(i2, A052);
                return;
            case 62:
                A052 = C0f9.A05(341924289);
                KCP kcp2 = (KCP) this.A01;
                C47Z A0i2 = AbstractC43593JPy.A0i(kcp2);
                AnonymousClass841 A0R2 = AbstractC43594JPz.A0R(kcp2.requireContext());
                ImageView imageView = kcp2.A06;
                boolean z6 = false;
                if (imageView != null && imageView.isSelected() && A0i2 != null && (A0i2.A5C || A0R2.CLO())) {
                    if (C36A.A0K(AbstractC166987dD.A0r(kcp2.A0O), AbstractC25230BEn.A1S(A0R2.CpK().size(), 1), A0R2.CMB())) {
                        C9GR.A09(kcp2.requireContext(), kcp2.getString(2131976682));
                        i2 = -932838302;
                        C0f9.A0C(i2, A052);
                        return;
                    }
                }
                ImageView imageView2 = kcp2.A06;
                if (imageView2 != null && imageView2.isSelected()) {
                    z6 = true;
                }
                boolean z7 = !z6;
                if (A0i2 != null) {
                    A0i2.A5F = z7;
                }
                ImageView imageView3 = kcp2.A06;
                if (imageView3 != null) {
                    imageView3.setSelected(z7);
                }
                Toast toast = kcp2.A07;
                if (toast != null) {
                    toast.cancel();
                }
                if (C36A.A05(AbstractC166987dD.A0r(kcp2.A0O))) {
                    i5 = 2131976686;
                    if (z7) {
                        i5 = 2131976683;
                    }
                } else {
                    i5 = 2131976622;
                    if (z7) {
                        i5 = 2131976621;
                    }
                }
                kcp2.A07 = C9GR.A00(kcp2.getContext(), kcp2.getString(i5), null, 0);
                str = "videoPreviewController";
                OM7 om7 = kcp2.A0F;
                if (z7) {
                    if (om7 != null) {
                        C9KW c9kw = om7.A03.A08;
                        if (c9kw != null) {
                            c9kw.A09();
                        }
                        i2 = 666310212;
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (om7 != null) {
                    C9KW c9kw2 = om7.A03.A08;
                    if (c9kw2 != null) {
                        c9kw2.A0A();
                    }
                    i2 = 666310212;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
                C0f9.A0C(i2, A052);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A055 = C0f9.A05(1270894483);
                KCP kcp3 = (KCP) this.A01;
                C44529JmZ A0Z5 = AbstractC43592JPx.A0Z(kcp3);
                AnonymousClass841 A0R3 = AbstractC43594JPz.A0R(kcp3.requireContext());
                C47Z A0i3 = AbstractC43593JPy.A0i(kcp3);
                MXB mxb2 = kcp3.A08;
                if (mxb2 != null) {
                    A0Z5.A01(mxb2, A0R3, A0i3);
                    i7 = 814238499;
                    C0f9.A0C(i7, A055);
                    return;
                } else {
                    A0g = AbstractC166997dE.A0g();
                    i6 = 1955735821;
                    C0f9.A0C(i6, A055);
                    throw A0g;
                }
            case 64:
                A055 = C0f9.A05(-804232660);
                KCP kcp4 = (KCP) this.A01;
                C44529JmZ A0Z6 = AbstractC43592JPx.A0Z(kcp4);
                AnonymousClass841 A0R4 = AbstractC43594JPz.A0R(kcp4.requireContext());
                C47Z A0i4 = AbstractC43593JPy.A0i(kcp4);
                MXB mxb3 = kcp4.A08;
                if (mxb3 != null) {
                    A0Z6.A01(mxb3, A0R4, A0i4);
                    i7 = 941644598;
                    C0f9.A0C(i7, A055);
                    return;
                } else {
                    A0g = AbstractC166997dE.A0g();
                    i6 = -994443926;
                    C0f9.A0C(i6, A055);
                    throw A0g;
                }
            case 65:
                A055 = C0f9.A05(-934560335);
                C45758KNl.A01((C45758KNl) this.A01, true);
                i7 = -1767467176;
                C0f9.A0C(i7, A055);
                return;
            case 66:
                A055 = C0f9.A05(-357936694);
                C45758KNl.A01((C45758KNl) this.A01, false);
                i7 = -1042061174;
                C0f9.A0C(i7, A055);
                return;
            case 67:
                A055 = C0f9.A05(-219763011);
                C45758KNl.A01((C45758KNl) this.A01, true);
                i7 = 1423302006;
                C0f9.A0C(i7, A055);
                return;
            case 68:
                A055 = C0f9.A05(1665009986);
                C45758KNl.A01((C45758KNl) this.A01, false);
                i7 = 1823943714;
                C0f9.A0C(i7, A055);
                return;
            case 69:
                A055 = C0f9.A05(-1975280031);
                C45758KNl.A01((C45758KNl) this.A01, true);
                i7 = -2098418708;
                C0f9.A0C(i7, A055);
                return;
            default:
                A055 = C0f9.A05(-700156620);
                C45758KNl.A01((C45758KNl) this.A01, false);
                i7 = -1806057894;
                C0f9.A0C(i7, A055);
                return;
        }
    }
}
