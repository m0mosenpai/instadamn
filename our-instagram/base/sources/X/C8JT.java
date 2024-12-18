package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8JT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JT implements C8JU, C8BK, C8JV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Dialog A04;
    public Dialog A05;
    public Bitmap A06;
    public C50627MWo A07;
    public C50627MWo A08;
    public A5G A09;
    public C8e1 A0A;
    public C188798Xv A0B;
    public C8IW A0C;
    public C8KC A0D;
    public C208649Ky A0E;
    public C50643MXf A0F;
    public C8KA A0G;
    public C128175qm A0H;
    public AnonymousClass826 A0I;
    public C84B A0J;
    public C84B A0K;
    public C31727DwY A0L;
    public C31349DqE A0M;
    public AudioOverlayTrack A0N;
    public AudioOverlayTrack A0O;
    public C8KO A0P;
    public File A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public List A0U;
    public List A0V;
    public List A0W;
    public List A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public int A0q;
    public C4PX A0r;
    public ClipsCameraCommandAction A0s;
    public C50641MXd A0t;
    public C50649MXo A0u;
    public C195868lW A0v;
    public Integer A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public final Context A11;
    public final View A12;
    public final ViewGroup A13;
    public final ViewStub A14;
    public final FragmentActivity A15;
    public final C22P A16;
    public final C185358Kb A17;
    public final C95394Qz A18;
    public final ACRType A19;
    public final AnonymousClass858 A1A;
    public final AbstractC59962oe A1B;
    public final C1815383g A1C;
    public final UserSession A1D;
    public final C57012jc A1E;
    public final C1810981l A1F;
    public final C8IY A1G;
    public final TargetViewSizeProvider A1H;
    public final ClipsAssetHubViewModel A1I;
    public final C8HI A1J;
    public final C1821786b A1K;
    public final AnonymousClass840 A1L;
    public final C83C A1M;
    public final C184958Ik A1N;
    public final C8GG A1O;
    public final C81J A1P;
    public final C8JQ A1Q;
    public final C1820485o A1R;
    public final C86S A1S;
    public final InterfaceC1818984z A1T;
    public final C1814382v A1U;
    public final C8HG A1V;
    public final InterfaceC1810081c A1W;
    public final C185488Kq A1X;
    public final C185098Ja A1Y;
    public final C8KF A1Z;
    public final C8KE A1a;
    public final C185278Js A1b;
    public final C183378Bk A1c;
    public final C86Q A1d;
    public final C86P A1e;
    public final C8BP A1f;
    public final C8BF A1g;
    public final C183348Bh A1h;
    public final C1829289n A1i;
    public final C185118Jc A1j;
    public final C8K1 A1k;
    public final C8BE A1l;
    public final C1828389e A1m;
    public final ClipsCreationViewModel A1n;
    public final C8A7 A1o;
    public final C185328Jy A1p;
    public final C8JS A1q;
    public final C184108Ez A1r;
    public final ClipsCreationDraftViewModel A1s;
    public final C5JK A1t;
    public final C83E A1u;
    public final AnonymousClass825 A1v;
    public final ViewOnTouchListenerC1829389o A1w;
    public final C1828989k A1x;
    public final AnonymousClass844 A1y;
    public final AudioOverlayTrack A1z;
    public final C49602Pt A20;
    public final C183298Bb A21;
    public final ShutterButton A22;
    public final List A23;
    public final ExecutorService A24;
    public final InterfaceC09390do A25;
    public final InterfaceC09390do A26;
    public final InterfaceC09390do A27;
    public final boolean A28;
    public final boolean A29;
    public final View A2A;
    public final C2GS A2B;
    public final C8JW A2C;
    public final C1825387s A2D;
    public final C1824787m A2E;
    public final C89F A2F;
    public final AnonymousClass874 A2G;
    public final C184418Gf A2H;
    public final C8C0 A2I;
    public final C1824987o A2J;
    public final AnonymousClass860 A2K;
    public final C8K6 A2L;
    public final C8JZ A2M;
    public final C8KD A2N;
    public final C8JY A2O;
    public final C84G A2P;
    public final C87D A2Q;
    public final C8K5 A2R;
    public final C150286pc A2S;
    public final C87H A2T;
    public final InterfaceC1829489p A2U;
    public final InteractiveDrawableContainer A2V;
    public final C185458Kn A2W;
    public final List A2X;
    public final boolean A2Y;
    public final boolean A2Z;

    public static final C115475Kh A06(ImmutableList immutableList, EnumC1828489f enumC1828489f, C8JT c8jt, C195868lW c195868lW, File file, String str, ArrayList arrayList, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        HashSet A0C;
        C50643MXf c50643MXf;
        C206169Az c206169Az;
        C115525Km A01 = AbstractC23036ADs.A01(c195868lW, str, i, i2, 0, i2, i2);
        float f = enumC1828489f.A00;
        boolean z3 = c8jt.A0e;
        ArrayList arrayList2 = null;
        if (i != 0 && !A1Z(c8jt)) {
            A0C = null;
        } else {
            A0C = c8jt.A0C();
        }
        if (!arrayList.isEmpty()) {
            arrayList2 = arrayList;
        }
        C115475Kh c115475Kh = new C115475Kh(null, null, new C115545Ko(immutableList, arrayList2, A0C, f, -1, z3), A01, null, null, null, null, null, f, 0, 0, 0, 0, 0, 0, 2147483640, false, false, false, false);
        c115475Kh.A09 = (int) (i3 / f);
        c115475Kh.A08 = (int) (i4 / f);
        c115475Kh.A0O = z;
        c115475Kh.A0U = z2;
        c115475Kh.A0S = c8jt.A0m;
        if (A1U(c8jt)) {
            c115475Kh.A0E = AbstractC14620oa.A01(AbstractC209669Pc.A02(file), 0);
        }
        C8JS c8js = c8jt.A1q;
        if (c8js.A07 != 0 && c8js.A06 != 0 && (c50643MXf = c8jt.A0F) != null) {
            if (C18U.A06(C06090Tz.A05, c50643MXf.A0Q, 36320399530074553L)) {
                if (c8js.A07 != 0 && c8js.A06 != 0) {
                    float[] fArr = new float[9];
                    c8js.A0A.getValues(fArr);
                    float f2 = fArr[0];
                    float f3 = c8js.A07;
                    float f4 = c8js.A00;
                    if (((f3 * f4) * c8js.A04) / ((c8js.A06 * c8js.A01) * c8js.A05) < 0.5625f) {
                        f2 /= f4;
                    }
                    Matrix matrix = new Matrix();
                    c8js.A0A.invert(matrix);
                    Matrix matrix2 = new Matrix();
                    matrix2.postTranslate(c8js.A07 / 2.0f, c8js.A06 / 2.0f);
                    matrix2.postConcat(matrix);
                    matrix2.postTranslate((-c8js.A07) / 2.0f, (-c8js.A06) / 2.0f);
                    matrix2.getValues(fArr);
                    c206169Az = new C206169Az(f2, ((-fArr[2]) / c8js.A07) * f2, 8, ((-fArr[5]) / c8js.A06) * f2, 3, 0.0f);
                } else {
                    c206169Az = new C206169Az(0.0f, 0.0f, 15, 0.0f, 3, 0.0f);
                }
                c115475Kh.A0A = c206169Az;
                c8js.A00();
            }
        }
        return c115475Kh;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0J(com.google.common.collect.ImmutableList r20, com.google.common.collect.ImmutableList r21, X.EnumC1828489f r22, X.C8JT r23, X.C195868lW r24, java.io.File r25, java.lang.Boolean r26, java.lang.Integer r27, java.lang.String r28, int r29, int r30, int r31, int r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A0J(com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, X.89f, X.8JT, X.8lW, java.io.File, java.lang.Boolean, java.lang.Integer, java.lang.String, int, int, int, int, boolean, boolean):void");
    }

    public static final void A0b(C8JT c8jt) {
        c8jt.A1I(null, false);
        A0X(c8jt);
        A0T(c8jt);
        c8jt.A1d.A00();
    }

    public static final void A0p(C8JT c8jt) {
        c8jt.A01 = 0;
        Iterator it = c8jt.A0J.A05().iterator();
        while (it.hasNext()) {
            if (!((AbstractC115485Ki) it.next()).A0A()) {
                c8jt.A01++;
            }
        }
        A1b(c8jt);
        if (c8jt.A01 != 0 && !c8jt.A0m && !c8jt.CUs() && !c8jt.A1L.A02.A0A() && !A1Z(c8jt) && !c8jt.A0j && c8jt.A1o.A07.size() <= 1 && c8jt.Aju() != EnumC223419tY.ADD_CLIPS_STACKED_TIMELINE) {
            c8jt.A0m = true;
        }
        if (c8jt.A0E != null) {
            A1B(c8jt, true);
            c8jt.A0D();
            A0W(c8jt);
            A0a(c8jt);
            A1E(c8jt, false);
            ShutterButton shutterButton = c8jt.A22;
            shutterButton.A0h.setSegments(c8jt.A0J);
            shutterButton.A08 = A00(c8jt);
            if (!c8jt.A0J.A01.isEmpty()) {
                C185488Kq c185488Kq = c8jt.A1X;
                if (c185488Kq.A03 != null) {
                    C185488Kq.A03(c185488Kq, false);
                }
            }
            A0v(c8jt, A02(c8jt) / 1000);
        }
        if (c8jt.A0l) {
            A0m(c8jt);
        }
    }

    public static final void A17(C8JT c8jt, Runnable runnable) {
        ArrayList A0A;
        String A0K = c8jt.A1n.A0K();
        if (A0K != null) {
            AKk.A03(c8jt.A11, A0K);
            AnonymousClass229.A01(c8jt.A1D).A0e();
            return;
        }
        if (A1T(c8jt) && (A0A = c8jt.A0A()) != null && !A0A.isEmpty() && !c8jt.CWT()) {
            UserSession userSession = c8jt.A1D;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36321507630130706L)) {
                C95394Qz c95394Qz = c8jt.A18;
                if (c95394Qz.A02) {
                    c95394Qz.A01();
                }
                c95394Qz.A02();
                Dialog A00 = AbstractC55109ObQ.A00(c8jt.A11, userSession, C05F.A0N, AbstractC166997dE.A0c(c06090Tz, userSession, 36323268566723712L).booleanValue());
                c8jt.A05 = A00;
                C0fJ.A00(A00);
                AnonymousClass826 anonymousClass826 = c8jt.A0I;
                if (anonymousClass826 == null) {
                    return;
                }
                int i = anonymousClass826.A01;
                ArrayList A0A2 = c8jt.A0A();
                if (A0A2 == null || A0A2.isEmpty()) {
                    return;
                }
                c8jt.A0j = true;
                A0u(c8jt, i);
                A0Q(null, c8jt, A0A2, i, true, false);
                return;
            }
        }
        AbstractC55109ObQ.A03(c8jt.A1D, C05F.A0C);
        A18(c8jt, runnable);
    }

    public static final void A1C(C8JT c8jt, boolean z) {
        c8jt.A0l = false;
        C208649Ky c208649Ky = c8jt.A0E;
        if (c208649Ky != null) {
            AbstractC125325le.A05(new View[]{c208649Ky.A00}, true);
        }
        c8jt.A1X.A04();
        C50643MXf c50643MXf = c8jt.A0F;
        if (c50643MXf != null) {
            if (c50643MXf.A0H) {
                c50643MXf.A0E();
            }
            if (c50643MXf.A0H) {
                AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "can't release the controller while showing", null);
            } else {
                TextureView textureView = c50643MXf.A07;
                if (textureView != null) {
                    c50643MXf.A0N.removeView(textureView);
                    c50643MXf.A07 = null;
                }
            }
        }
        if (z) {
            A0c(c8jt);
        }
        C50641MXd c50641MXd = c8jt.A0t;
        if (c50641MXd != null) {
            c50641MXd.A06 = null;
        }
        if (c8jt.CZY()) {
            c8jt.A1U.A00().Ekh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (CLf() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r12.A1D, 36321507630196243L) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1e(java.lang.Integer r13, java.lang.Runnable r14) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A1e(java.lang.Integer, java.lang.Runnable):void");
    }

    @Override // X.C8JU
    public final void DDo() {
        C8YL c8yl;
        C8YY A00;
        this.A0Z = true;
        C128175qm c128175qm = this.A0H;
        if (c128175qm != null) {
            this.A1L.A02.A01.A0E = c128175qm.A0T;
        }
        if (!this.A2V.A0x()) {
            this.A1L.A02.A01.A09 = null;
        }
        C188798Xv c188798Xv = this.A0B;
        if (c188798Xv != null && (A00 = c188798Xv.A00()) != null) {
            A00.A0O(false, false, false);
        }
        C81Z c81z = this.A1Q.A00;
        boolean z = c81z.A0u.A3i;
        InterfaceC1829689r interfaceC1829689r = c81z.A1Q;
        if (z) {
            if (interfaceC1829689r != null) {
                c8yl = (C8YL) interfaceC1829689r;
                C188798Xv c188798Xv2 = null;
                c8yl.A01 = c188798Xv2;
            }
        } else if (interfaceC1829689r != null && (c188798Xv2 = c81z.A1M) != null) {
            c8yl = (C8YL) interfaceC1829689r;
            c8yl.A01 = c188798Xv2;
        }
        this.A1j.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36321718083790565L) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e2, code lost:
    
        if (r7 != false) goto L56;
     */
    @Override // X.C8JU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDp(X.InterfaceC191028cy r9) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.DDp(X.8cy):void");
    }

    @Override // X.C8JU
    public final void DDy(boolean z) {
        this.A0Z = false;
        this.A0o = false;
        this.A0c = false;
        if (this.A0E != null) {
            if (z) {
                A1F(this, true, false, false);
            } else {
                A1F(this, false, false, false);
            }
        }
        A0c(this);
        this.A1j.A04.Egh(C185128Jd.A00);
    }

    @Override // X.C8G1
    public final boolean DIq() {
        return false;
    }

    @Override // X.C8BK
    public final /* synthetic */ void DuZ(AudioOverlayTrack audioOverlayTrack) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void Duc(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r11.A0y != false) goto L39;
     */
    @Override // X.C8BK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Due(com.instagram.music.common.model.AudioOverlayTrack r12) {
        /*
            r11 = this;
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            boolean r0 = r12.A01()
            if (r0 != 0) goto L2a
            int r1 = r12.A02
            X.84B r0 = r11.A0J
            int r0 = r0.A00
            if (r1 >= r0) goto L2a
            com.instagram.common.session.UserSession r0 = r11.A1D
            boolean r0 = X.AbstractC185298Jv.A00(r0)
            if (r0 != 0) goto L2a
            android.content.Context r1 = r11.A11
            r0 = 2131955786(0x7f13104a, float:1.954811E38)
            X.C9GR.A06(r1, r0)
            X.8Bh r1 = r11.A1h
            java.lang.String r0 = "selected track shorter than current recording"
            r1.A0D(r0)
            return
        L2a:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r11.A0N
            if (r0 == 0) goto L54
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r12.A0A
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L54
            com.instagram.music.common.model.AudioOverlayTrack r2 = r11.A0N
            if (r2 == 0) goto L54
            int r1 = r2.A03
            int r0 = r12.A03
            if (r1 != r0) goto L54
            int r1 = r2.A02
            int r0 = r12.A02
            if (r1 != r0) goto L54
            X.8Jt r1 = r2.A05
            X.8Jt r0 = r12.A05
            if (r1 != r0) goto L54
            X.8Bh r0 = r11.A1h
            r0.A03()
            return
        L54:
            X.8Jc r5 = r11.A1j
            X.858 r0 = r11.A1A
            X.05A r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            boolean r2 = r0 instanceof X.C189118Zc
            com.instagram.music.common.model.MusicAssetModel r0 = r12.A08
            if (r0 == 0) goto L9d
            com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem r1 = r0.A04
            if (r1 == 0) goto L9d
            java.lang.String r7 = r1.A02
            java.lang.String r8 = r1.A01
            java.lang.Boolean r6 = r1.A00
            if (r7 == 0) goto L9d
            if (r2 != 0) goto L9d
            X.05A r0 = r5.A04
            java.lang.String r9 = r1.A06
            java.lang.String r10 = r1.A05
            com.instagram.common.typedurl.ImageUrl r4 = r1.A04
            X.8Kw r3 = X.EnumC185548Kw.A04
            X.9aO r2 = new X.9aO
            r5 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.Egh(r2)
        L85:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r11.A0N
            if (r0 == 0) goto L98
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r12.A0A
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L98
            boolean r1 = r11.A0y
            r0 = 1
            if (r1 != 0) goto L99
        L98:
            r0 = 0
        L99:
            A11(r11, r12, r0)
            return
        L9d:
            X.8Jg r4 = r5.A03
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316637137277492(0x8105ca00011234, double:3.0301257887498156E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto Lb9
            r0 = 36316637137211955(0x8105ca00001233, double:3.03012578870837E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L85
        Lb9:
            com.instagram.music.common.model.MusicAssetModel r0 = r12.A08
            if (r0 == 0) goto L85
            X.05A r1 = r5.A04
            X.8Jp r0 = X.C185248Jp.A00
            r1.Egh(r0)
            com.instagram.music.common.model.MusicAssetModel r1 = r12.A08
            if (r1 == 0) goto Lcd
            r0 = 1
            r4.A00(r1, r0)
            goto L85
        Lcd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.Due(com.instagram.music.common.model.AudioOverlayTrack):void");
    }

    @Override // X.C8BK
    public final /* synthetic */ void Dui(AudioOverlayTrack audioOverlayTrack, Integer num) {
        AbstractC226899zl.A00(this, audioOverlayTrack);
    }

    @Override // X.C8JU
    public final void Dyr(C195868lW c195868lW) {
        String str;
        int i;
        String str2;
        ImmutableList immutableList;
        C8KC c198888qo;
        DownloadedTrack downloadedTrack;
        String str3;
        C8IW c8iw;
        if (this.A0E == null) {
            str3 = "view holder should not be null if on CLIPS format";
        } else if (A1Z(this) && (c8iw = this.A0C) != null) {
            c8iw.A00(c195868lW);
            if (this.A0E == null) {
                str3 = "view holder should not be null";
            } else {
                this.A1e.A00();
                this.A00 = -1;
                C131485wf c131485wf = this.A22.A0h;
                ArrayList arrayList = c131485wf.A0B;
                if (arrayList.isEmpty()) {
                    return;
                }
                AnonymousClass016.A15(arrayList);
                c131485wf.A04 = AbstractC001800i.A02(arrayList);
                return;
            }
        } else {
            int i2 = c195868lW.A07;
            if (i2 <= 0) {
                A0F();
                C9GR.A01(this.A11, null, 2131976723, 0);
                return;
            }
            if (this.A00 == -1) {
                str3 = "we should be getting the camera-calculated duration in onExitVideoRecording()";
            } else {
                UserSession userSession = this.A1D;
                C447724h c447724h = AnonymousClass229.A01(userSession).A0J;
                C5JK c5jk = this.A1t;
                c447724h.A06(c5jk, "precap_recording_finished_auto_transition", -1);
                C1810981l c1810981l = this.A1F;
                if (c1810981l.A08.A00 instanceof C81V) {
                    this.A1h.A0M(((C22F) AnonymousClass229.A01(userSession)).A04.A0L, AnonymousClass001.A0O("video_recording-", c195868lW.A0F));
                }
                CameraAREffect cameraAREffect = c195868lW.A0P;
                if (cameraAREffect != null) {
                    str = cameraAREffect.A0M;
                } else {
                    str = null;
                }
                C84B c84b = (C84B) this.A1n.A0G.A02();
                if (c84b != null) {
                    i = c84b.A01.size();
                } else {
                    i = 0;
                }
                CameraAREffect cameraAREffect2 = c195868lW.A0P;
                if (cameraAREffect2 != null) {
                    str2 = cameraAREffect2.A0Q;
                } else {
                    str2 = null;
                }
                C449124v c449124v = AnonymousClass229.A01(userSession).A0A;
                long A00 = A00(this) / 1000;
                String A05 = c195868lW.A05();
                C81J c81j = this.A1P;
                c449124v.A0X(Aju(), null, A05, str, c81j.A2J, c81j.A2K, str2, i, A00);
                this.A1e.A00();
                SystemClock.elapsedRealtime();
                if (c1810981l.A0W(C81W.A0B)) {
                    this.A00 = i2;
                }
                int i3 = this.A00;
                if (i2 < i3) {
                    AbstractC12120kG.A07("ClipsCaptureControllerImpl", AnonymousClass001.A0X("captured video duration mismatch (actual=", ", calculated=", ')', i2, i3), null);
                }
                C115525Km A002 = AbstractC23036ADs.A00(c195868lW, 0, i2, this.A00);
                this.A00 = -1;
                C49602Pt c49602Pt = this.A20;
                if (c49602Pt.A02()) {
                    try {
                        Context context = this.A11;
                        String AoU = AoU();
                        C14360o3.A0B(AoU, 2);
                        File A03 = AMc.A03(c49602Pt, AoU, AMc.A04(new File(c195868lW.A0k)), "move_camera_file");
                        if (A03.getUsableSpace() >= 52428800) {
                            Files.A02(new File(c195868lW.A0k), A03);
                            String path = A03.getPath();
                            C14360o3.A0B(path, 0);
                            A002.A0F = path;
                        } else {
                            C9GR.A03(context, context.getString(2131955467), "clips_drafts_not_enough_space", 1);
                            throw new IOException("not enough space to persist video");
                        }
                    } catch (IOException e) {
                        AbstractC12120kG.A07("ClipsCaptureControllerImpl", "file system failure", e);
                    }
                }
                float f = this.A1m.A00().A00;
                int i4 = this.A02;
                boolean z = this.A0e;
                HashSet A0C = A0C();
                CameraAREffect cameraAREffect3 = c195868lW.A0P;
                if (cameraAREffect3 != null) {
                    immutableList = ImmutableList.of((Object) cameraAREffect3);
                } else {
                    immutableList = null;
                }
                C115475Kh c115475Kh = new C115475Kh(null, null, new C115545Ko(immutableList, AbstractC115535Kn.A00(c1810981l), A0C, f, i4, z), A002, null, null, null, null, null, 0.0f, 0, 0, 0, 0, 0, 0, 2147483644, false, false, false, false);
                c115475Kh.A0E = c195868lW.A0U;
                this.A1V.A00().Dyt(c115475Kh);
                AudioOverlayTrack audioOverlayTrack = this.A0N;
                if (audioOverlayTrack != null && (downloadedTrack = audioOverlayTrack.A06) != null && new File(downloadedTrack.A02).exists() && i2 > 3000 && !AbstractC226389yv.A00(this.A11) && C18U.A06(C06090Tz.A05, userSession, 36316018661920635L)) {
                    this.A24.execute(new RunnableC57072PTl(this, c115475Kh, c84b, audioOverlayTrack, downloadedTrack, i2));
                }
                A1G(c115475Kh);
                A1E(this, false);
                this.A1h.A02();
                if (A02(this) <= 100) {
                    A0P(A04(), this);
                    return;
                }
                if (A1g()) {
                    c198888qo = new C198898qp(false);
                } else if (A05(this) != null) {
                    c198888qo = C9PB.A00;
                } else if (A1X(this)) {
                    c198888qo = new C198888qo(false);
                } else {
                    AnonymousClass229.A01(userSession).A0J.A00(c5jk);
                    return;
                }
                A0O(c198888qo, this);
                return;
            }
        }
        AbstractC12120kG.A07("ClipsCaptureControllerImpl", str3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e8, code lost:
    
        if (r4.A0W(X.C81W.A0y) != false) goto L61;
     */
    @Override // X.InterfaceC184638He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.A8D Dzh(X.A5H r22) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.Dzh(X.A5H):X.A8D");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.7l5, java.lang.Object, X.7lk] */
    @Override // X.C8JU
    public final void FBz() {
        Ah1 ah1;
        DownloadedTrack downloadedTrack;
        A1E(this, false);
        if (!CUs() && this.A0J.A01.size() == 1) {
            this.A1n.A0U(0, false);
            C185488Kq c185488Kq = this.A1X;
            AudioOverlayTrack audioOverlayTrack = c185488Kq.A03;
            if (audioOverlayTrack != null && (downloadedTrack = audioOverlayTrack.A06) != null) {
                C185488Kq.A02(c185488Kq, downloadedTrack.A00(audioOverlayTrack.A03));
            }
            C1829289n c1829289n = this.A1i;
            if (c1829289n != null && (ah1 = (Ah1) c1829289n.A00.A00()) != 0) {
                EnumC171747l4 enumC171747l4 = EnumC171747l4.A04;
                ?? obj = new Object();
                obj.A00 = enumC171747l4;
                ah1.A01(obj);
            }
        }
    }

    @Override // X.InterfaceC184638He
    public final String getName() {
        return "ClipsCaptureControllerImpl";
    }

    @Override // X.C8JU
    public final void onPause() {
        C50643MXf c50643MXf;
        this.A0h = true;
        if (this.A0l && (c50643MXf = this.A0F) != null && c50643MXf.A0H) {
            c50643MXf.A0N.removeCallbacks(c50643MXf.A0g);
            InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
            if (interfaceC58267PsB != null) {
                interfaceC58267PsB.pause();
            }
        }
    }

    @Override // X.C8JU
    public final void onResume() {
        C50643MXf c50643MXf;
        this.A0h = false;
        if (this.A0l && (c50643MXf = this.A0F) != null && c50643MXf.A0H) {
            InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
            if (interfaceC58267PsB == null) {
                c50643MXf.A0E();
            } else {
                interfaceC58267PsB.start();
                c50643MXf.A0N.postOnAnimation(c50643MXf.A0g);
            }
        }
    }

    @Override // X.C8JU
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        InterfaceC1810081c interfaceC1810081c = this.A1W;
        if (interfaceC1810081c.AuG() == EnumC1810181d.A09) {
            bundle.putSerializable("SAVE_INSTANCE_KEY_LAST_CAMERA_STATE", interfaceC1810081c.AuG());
        }
    }

    public static final int A00(C8JT c8jt) {
        Integer num;
        C185368Kc c185368Kc;
        Ah1 ah1;
        C1816283r c1816283r;
        int i;
        Ah1 ah12;
        AnonymousClass826 anonymousClass826 = c8jt.A0I;
        if (anonymousClass826 != null) {
            num = Integer.valueOf(anonymousClass826.A01);
        } else {
            num = null;
        }
        if (num == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "maxTotalRecordingDuration is null", null);
            return 0;
        }
        C1829289n c1829289n = c8jt.A1i;
        if ((c1829289n == null || (ah12 = (Ah1) c1829289n.A00.A00()) == null || !ah12.A03()) && A1U(c8jt) && (c185368Kc = c8jt.A1n.A0L.A00) != null) {
            if (c185368Kc.A01 == -1) {
                C1816283r c1816283r2 = c8jt.A1x.A00;
                if (c1816283r2 != null && c1816283r2.A00 == EnumC189548aZ.A06 && (i = c185368Kc.A00) > 0) {
                    int i2 = AnonymousClass827.A00(c8jt.A1D).A01;
                    if (i > i2) {
                        i = i2;
                    }
                } else {
                    i = AnonymousClass827.A00(c8jt.A1D).A01;
                }
                c185368Kc.A01 = i;
            }
            if (c1829289n != null && (ah1 = (Ah1) c1829289n.A00.A00()) != null && (c1816283r = ah1.A09.A08.A00) != null && c1816283r.A04.A5x()) {
                num = Integer.valueOf(AnonymousClass827.A00(c8jt.A1D).A01);
            } else {
                return c185368Kc.A01;
            }
        }
        return num.intValue();
    }

    private final Medium A03() {
        List list = this.A0X;
        if (list != null && list.size() == 1) {
            return (Medium) AbstractC001800i.A0O(list, 0);
        }
        return null;
    }

    public static final C211909aH A05(C8JT c8jt) {
        Object obj = ((C1809981b) c8jt.A1W).A02.A00.second;
        C14360o3.A07(obj);
        if (obj instanceof C188478Wm) {
            InterfaceC191028cy interfaceC191028cy = ((C188478Wm) obj).A01;
            if (interfaceC191028cy instanceof C211909aH) {
                return (C211909aH) interfaceC191028cy;
            }
            return null;
        }
        return null;
    }

    public static final File A07(C8JT c8jt, File file) {
        try {
            return AMc.A03(c8jt.A20, c8jt.AoU(), AMc.A04(file), "video_import");
        } catch (IOException e) {
            AKk.A01(c8jt.A11, e, "send to @haydenkai unable to create output file for gallery video", false);
            c8jt.A1o.A01();
            return null;
        }
    }

    private final Integer A08() {
        int i;
        Integer valueOf;
        Object obj = ((C1809981b) this.A1W).A02.A00.second;
        C14360o3.A07(obj);
        if (obj instanceof C188478Wm) {
            InterfaceC191028cy interfaceC191028cy = ((C188478Wm) obj).A01;
            if ((interfaceC191028cy instanceof C180397zT) && (valueOf = Integer.valueOf((i = ((C180397zT) interfaceC191028cy).A00))) != null && i >= 0 && i < this.A0J.A01.size()) {
                return valueOf;
            }
        } else if (this.A1I.A02) {
            return 0;
        }
        return null;
    }

    public static final Integer A09(C8JT c8jt) {
        Object obj = ((C1809981b) c8jt.A1W).A02.A00.second;
        C14360o3.A07(obj);
        if (obj instanceof C188478Wm) {
            InterfaceC191028cy interfaceC191028cy = ((C188478Wm) obj).A01;
            if (interfaceC191028cy instanceof C176497t7) {
                return ((C176497t7) interfaceC191028cy).A00;
            }
            return null;
        }
        return null;
    }

    private final ArrayList A0A() {
        C8YY A00;
        C193838i4 c193838i4;
        C188798Xv c188798Xv = this.A0B;
        if (c188798Xv != null && (A00 = c188798Xv.A00()) != null && (c193838i4 = A00.A02) != null) {
            List Bsg = c193838i4.A0z.Bsg();
            ArrayList arrayList = new ArrayList();
            Iterator it = Bsg.iterator();
            while (it.hasNext()) {
                Medium medium = ((C9NH) it.next()).A01.A00;
                if (medium != null) {
                    arrayList.add(medium);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final ArrayList A0B(C8JT c8jt) {
        C115545Ko A07;
        List list;
        ArrayList arrayList = new ArrayList();
        int size = c8jt.A0J.A01.size();
        for (int i = 0; i < size; i++) {
            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) c8jt.A0J.A04(i);
            if (abstractC115485Ki != null && (A07 = abstractC115485Ki.A07()) != null && (list = A07.A03) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(A08.A00((CameraToolInfo) it.next(), i));
                }
            }
        }
        return arrayList;
    }

    private final HashSet A0C() {
        HashSet hashSet = new HashSet();
        Iterator it = ((java.util.Set) this.A1F.A09.A00).iterator();
        while (it.hasNext()) {
            hashSet.add(((C81W) it.next()).name());
        }
        return hashSet;
    }

    private final void A0E() {
        this.A0n = !this.A0z;
        this.A1s.A0F(this.A1t, this.A1L.A02.A01.A0j, this.A1P.A34);
    }

    private final void A0F() {
        if (this.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null", null);
            return;
        }
        this.A00 = -1;
        C131485wf c131485wf = this.A22.A0h;
        ArrayList arrayList = c131485wf.A0B;
        if (!arrayList.isEmpty()) {
            AnonymousClass016.A15(arrayList);
            c131485wf.A04 = AbstractC001800i.A02(arrayList);
        }
        A0p(this);
        this.A1e.A00();
    }

    public static final void A0G(Bitmap bitmap, C8JT c8jt) {
        if (c8jt.A0e && c8jt.CLf()) {
            C57012jc c57012jc = c8jt.A1E;
            ((ImageView) c57012jc.A01()).setImageBitmap(bitmap);
            c57012jc.A01().setVisibility(0);
            AbstractC125325le A01 = AbstractC125325le.A01(c57012jc.A01(), 0);
            A01.A0I(0.5f);
            A01.A05 = null;
            A01.A0H();
            return;
        }
        C57012jc c57012jc2 = c8jt.A1E;
        if (!c57012jc2.A04()) {
            return;
        }
        AbstractC125325le.A03(c57012jc2.A01(), new C24075AmJ(c8jt), 8, true);
    }

    public static final void A0H(View view, C8JT c8jt) {
        Integer num = c8jt.A0w;
        if (num != C05F.A0C) {
            if (!view.isLaidOut()) {
                AbstractC13880nE.A0q(view, new RunnableC24662Avw(view, c8jt));
                return;
            }
            int[] iArr = AbstractC50652MXs.A00;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    return;
                }
                c8jt.A2J.A00(17);
            } else if (c8jt.A0s == ClipsCameraCommandAction.A0D) {
                A10(c8jt, c8jt.A0N, null, true);
            } else {
                A10(c8jt, null, null, false);
            }
        }
    }

    public static final void A0K(ImmutableList immutableList, ImmutableList immutableList2, C8JT c8jt, C115525Km c115525Km, Integer num, String str, int i, int i2, boolean z) {
        int i3 = i2;
        StringBuilder sb = new StringBuilder();
        sb.append(c115525Km.A0G);
        sb.append('_');
        sb.append(c115525Km.A03);
        sb.append('_');
        sb.append(c115525Km.A02);
        String obj = sb.toString();
        File file = new File(c115525Km.A0F);
        int i4 = c115525Km.A09;
        int i5 = c115525Km.A05;
        int i6 = c115525Km.A07;
        file.getAbsolutePath();
        if (c8jt.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null if on CLIPS format", null);
            return;
        }
        if (num == C05F.A01 && i2 - i > A02(c8jt)) {
            C89P c89p = c8jt.A1k.A03;
            if (!c89p.A0N() || c89p.A0A == null) {
                AbstractC12120kG.A07("ClipsCaptureControllerImpl", "Attempting to upload video from gallery with trimmed duration that exceeds maximum remaining duration.", null);
                i3 = i + A02(c8jt);
            }
        }
        int i7 = c115525Km.A04;
        boolean z2 = c115525Km.A0K;
        String str2 = c115525Km.A0I;
        A0I(immutableList, immutableList2, c115525Km.A0B, c8jt, file, null, num, Integer.valueOf(c115525Km.A08), obj, str, str2, c115525Km.A0J, i7, i4, i5, i6, i, i3, z, z2);
    }

    public static final void A0L(final Medium medium, final C8JT c8jt, final Integer num, final boolean z) {
        if (!c8jt.A0f) {
            CallableC209459Oe callableC209459Oe = new CallableC209459Oe(c8jt.A11, medium, c8jt.A1D, false);
            C2AH c2ah = new C2AH() { // from class: X.9hC
                @Override // X.C2AH
                public final void onFail(Exception exc) {
                    C14360o3.A0B(exc, 0);
                    C8JT c8jt2 = c8jt;
                    c8jt2.A1h.A0I("load video from medium failed");
                    C8JT.A16(c8jt2, exc, String.valueOf(medium.A05), "load video from medium failed", true, false);
                }

                @Override // X.C2AH, X.C11R
                public final void onFinish() {
                    c8jt.A0f = false;
                }

                @Override // X.C2AH, X.C11R
                public final void onStart() {
                    C8JT c8jt2 = c8jt;
                    c8jt2.A0f = true;
                    c8jt2.A1h.A07(c8jt2.A1v.A00, MediaStreamTrack.VIDEO_TRACK_KIND, medium.A03, false, c8jt2.CWT());
                }

                @Override // X.C2AH
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    C8IW c8iw;
                    C8YY A00;
                    C8IW c8iw2;
                    C195868lW c195868lW = (C195868lW) obj;
                    C14360o3.A0B(c195868lW, 0);
                    if (c195868lW.A07 <= 0) {
                        onFail(AbstractC166987dD.A18("video with <= 0 duration"));
                        return;
                    }
                    int i = 0;
                    if (medium.A0G.A0B) {
                        i = 54;
                    }
                    c195868lW.A0F = i;
                    C8JT c8jt2 = c8jt;
                    c8jt2.A1h.A0J("video_import_success");
                    Integer num2 = num;
                    boolean z2 = z;
                    ClipsCreationDraftViewModel clipsCreationDraftViewModel = c8jt2.A1s;
                    C5JK c5jk = c8jt2.A1t;
                    if (ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel) == null) {
                        ClipsCreationDraftViewModel.A08(clipsCreationDraftViewModel, c5jk, null);
                    }
                    int A01 = C80G.A01(c8jt2.A0J) + c195868lW.A07;
                    AnonymousClass826 anonymousClass826 = c8jt2.A0I;
                    if (anonymousClass826 != null) {
                        int i2 = anonymousClass826.A01;
                        if (Integer.valueOf(i2) != null && A01 > i2) {
                            UserSession userSession = c8jt2.A1D;
                            if (anonymousClass826 != AnonymousClass827.A00(userSession)) {
                                C8JT.A0u(c8jt2, AnonymousClass827.A00(userSession).A01);
                            }
                        }
                    }
                    UserSession userSession2 = c8jt2.A1D;
                    C22C A012 = AnonymousClass229.A01(userSession2);
                    boolean A1X = C8JT.A1X(c8jt2);
                    C449124v c449124v = A012.A0A;
                    EnumC193318hB enumC193318hB = EnumC193318hB.A04;
                    int i3 = c195868lW.A0K;
                    int i4 = c195868lW.A08;
                    Long valueOf = Long.valueOf(c195868lW.A00());
                    String str = c195868lW.A0k;
                    Double valueOf2 = Double.valueOf(c195868lW.A07 / 1000.0d);
                    Long valueOf3 = Long.valueOf(C8JT.A00(c8jt2) / 1000);
                    EnumC223419tY Aju = c8jt2.Aju();
                    Boolean valueOf4 = Boolean.valueOf(z2);
                    long j = c195868lW.A0M;
                    if (j <= 0) {
                        j = c195868lW.A0L;
                    }
                    c449124v.A0W(Aju, enumC193318hB, null, valueOf4, valueOf2, valueOf, valueOf3, str, 2, i3, i4, j / 1000, A1X);
                    if (A1X) {
                        A012.A0k();
                    }
                    C89P c89p = c8jt2.A1k.A03;
                    if (c89p.A0N()) {
                        C86Q c86q = c8jt2.A1d;
                        Context context = c8jt2.A11;
                        FragmentActivity requireActivity = c8jt2.A1B.requireActivity();
                        if (c86q.A00 == null) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            c86q.A00 = frameLayout;
                            frameLayout.setClickable(true);
                            FrameLayout frameLayout2 = c86q.A00;
                            if (frameLayout2 != null) {
                                frameLayout2.setBackgroundColor(AbstractC167007dF.A09(context, R.attr.igds_color_media_background));
                            }
                            AbstractC166997dE.A0T(requireActivity.getLayoutInflater().inflate(R.layout.layout_spinner_for_processing_video, c86q.A00), R.id.processing_video_text).setText(requireActivity.getResources().getText(2131969966));
                            requireActivity.addContentView(c86q.A00, new FrameLayout.LayoutParams(-1, -1));
                            C8JT.A0m(c8jt2);
                        }
                    }
                    if ((A1X || ((!c8jt2.A1g() && !c8jt2.CWT() && !C8JT.A1Z(c8jt2) && !c8jt2.A1x.A03()) || C8JT.A1V(c8jt2))) && num2 != C05F.A0Y) {
                        if (!(!c8jt2.CUs()) || !C18U.A06(C06090Tz.A05, userSession2, 36320012981641115L)) {
                            C8JT.A0h(c8jt2);
                        }
                        if (c8jt2.A1F.A0Q() && (c8iw = c8jt2.A0C) != null && C18U.A06(C06090Tz.A05, userSession2, 36327297246312934L)) {
                            AbstractC166987dD.A0u(userSession2).A00(c5jk);
                            c8iw.A00(c195868lW);
                            C188798Xv c188798Xv = c8jt2.A0B;
                            if (c188798Xv == null || (A00 = c188798Xv.A00()) == null) {
                                return;
                            }
                            A00.A0L(false);
                            return;
                        }
                        C8JT.A15(c8jt2, c195868lW, num2);
                        return;
                    }
                    InterfaceC09390do interfaceC09390do = c8jt2.A25;
                    if (interfaceC09390do.getValue() == null) {
                        if (!C8JT.A1V(c8jt2)) {
                            C8JT.A0h(c8jt2);
                        }
                        if (C1810981l.A05(C81W.A0z, c8jt2.A1F) && (c8iw2 = c8jt2.A0C) != null) {
                            AbstractC166987dD.A0u(userSession2).A00(c5jk);
                            c8iw2.A00(c195868lW);
                            return;
                        } else if (c89p.A0N()) {
                            C8JT.A13(c8jt2, c195868lW);
                            return;
                        } else {
                            if (C8JT.A1V(c8jt2)) {
                                return;
                            }
                            C8JT.A14(c8jt2, c195868lW, num2);
                            return;
                        }
                    }
                    Object value = interfaceC09390do.getValue();
                    if (value == null) {
                        return;
                    }
                    AbstractC58242lg.A00(AnonymousClass191.A00, new C57160PZe(c195868lW, value, (InterfaceC23621Ds) null, 27, 42)).A06(c8jt2.A1B, new C8KQ(new BAO(41, num2, c8jt2)));
                }
            };
            C121275eQ c121275eQ = new C121275eQ(callableC209459Oe, 459);
            c121275eQ.A00 = c2ah;
            C1GJ.A03(c121275eQ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        if (r3.A00.A00() == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0M(final com.instagram.common.gallery.Medium r35, final X.C8JT r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A0M(com.instagram.common.gallery.Medium, X.8JT, boolean):void");
    }

    public static final void A0N(C81W c81w, C8JT c8jt, boolean z) {
        C1810981l c1810981l = c8jt.A1F;
        C55U c55u = (C55U) c1810981l.A08.A00;
        if (c55u instanceof C81V) {
            c1810981l.A0K(c55u, c81w, z);
        }
    }

    public static final void A0P(C8KC c8kc, C8JT c8jt) {
        String str;
        String str2;
        Integer num;
        if (c8jt.A1B.getActivity() == null) {
            AnonymousClass229.A01(c8jt.A1D).A0J.A07(c8jt.A1t, "activity is detached", null, null);
            return;
        }
        String str3 = null;
        if (!c8jt.CLf() && c8jt.A16 != C22P.A3c) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "Request for post-capture when segment store is empty", null);
            c8jt.A1h.A0O("ClipsCaptureControllerImpl.stitchVideoAndGoToPostCapture", "segment store is empty");
            AnonymousClass229.A01(c8jt.A1D).A0J.A07(c8jt.A1t, "segment store is empty", null, null);
            return;
        }
        if ((c8kc instanceof C199348rb) && c8jt.A2Y) {
            C183348Bh c183348Bh = c8jt.A1h;
            c183348Bh.A01 = c183348Bh.A0K.A02(42144080, c183348Bh.A01);
            AnonymousClass229.A01(c8jt.A1D).A1t(c8jt.AoU());
        }
        UserSession userSession = c8jt.A1D;
        C447024a c447024a = AnonymousClass229.A01(userSession).A02;
        AudioOverlayTrack audioOverlayTrack = c8jt.A0N;
        if (audioOverlayTrack != null) {
            str = audioOverlayTrack.A0A;
            str2 = audioOverlayTrack.A0B;
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                str3 = musicAssetModel.A0I;
            }
        } else {
            str = null;
            str2 = null;
        }
        C24P c24p = c447024a.A00;
        String.valueOf(c24p.A00.A0J());
        String.valueOf(c24p.A00());
        C447024a.A01(c447024a, "stitch_video_and_go_to_post_capture", str, str2, str3, null, null, null, null, null);
        C183348Bh c183348Bh2 = c8jt.A1h;
        C22P c22p = c8jt.A1v.A00;
        int size = c8jt.A0J.A01.size();
        String str4 = ((C55U) c8jt.A1F.A08.A00).A02;
        C5JK c5jk = c8jt.A1t;
        c183348Bh2.A05(c22p, c5jk, str4, ((C22F) AnonymousClass229.A01(userSession)).A04.A0L, size);
        C447724h c447724h = AnonymousClass229.A01(userSession).A0J;
        String str5 = c8kc.A00;
        int size2 = c8jt.A0J.A01.size();
        if (c447724h.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            C24Q c24q = c447724h.A04;
            long A05 = c24q.A05("stitch_and_go_to_post_cap", 585185740, c447724h.A01, c447724h.A03);
            c447724h.A01 = A05;
            c24q.A0B(A05, "stitch_transition_source", str5, false);
            c24q.A0B(c447724h.A01, "num_segments", String.valueOf(size2), false);
        }
        c8jt.A0D = c8kc;
        if (((c8kc instanceof C198888qo) && !((C198888qo) c8kc).A00) || (c8kc instanceof C198898qp)) {
            ClipsCreationViewModel clipsCreationViewModel = c8jt.A1n;
            AbstractC193598he abstractC193598he = (AbstractC193598he) clipsCreationViewModel.A0C.A02();
            if (abstractC193598he != null && abstractC193598he.A00 == 3) {
                num = ((C195868lW) abstractC193598he.A00()).A1M;
            } else {
                num = null;
            }
            int hashCode = clipsCreationViewModel.A0O.A03.getValue().hashCode();
            if (num == null || hashCode != num.intValue()) {
                AbstractC23641Du.A05(AnonymousClass191.A00, new C57171PZp(c8kc, clipsCreationViewModel, (InterfaceC23621Ds) null, 9), AbstractC141776au.A00(clipsCreationViewModel));
                return;
            }
        }
        c8kc.equals(C218639lZ.A00);
        c8jt.A1n.A0X(c8kc);
    }

    public static final void A0Q(C22832A5b c22832A5b, final C8JT c8jt, List list, final int i, final boolean z, final boolean z2) {
        final boolean A1T = A1T(c8jt);
        if (!A1T) {
            c8jt.A1d.A01();
        }
        Context context = c8jt.A11;
        UserSession userSession = c8jt.A1D;
        C49602Pt c49602Pt = c8jt.A20;
        String AoU = c8jt.AoU();
        CameraSpec A00 = c8jt.A1v.A00();
        C2AH c2ah = new C2AH() { // from class: X.9hA
            public String A00;
            public final List A01 = AbstractC166987dD.A1E();

            @Override // X.C2AH
            public final void onFail(Exception exc) {
                C14360o3.A0B(exc, 0);
                C8JT c8jt2 = C8JT.this;
                String str = this.A00;
                if (str == null) {
                    str = "";
                }
                C8JT.A16(c8jt2, exc, str, "prefillMediums failed", true, true);
            }

            @Override // X.C2AH, X.C11R
            public final void onFinish() {
                C8JT c8jt2;
                C86Q c86q;
                FrameLayout frameLayout;
                if (A1T) {
                    if (!z && (frameLayout = (c86q = (c8jt2 = C8JT.this).A1d).A00) != null) {
                        AbstractC167017dG.A16(frameLayout, c86q);
                        c86q.A00 = null;
                        C8JT.A0m(c8jt2);
                        return;
                    }
                    return;
                }
                C8JT.this.A1d.A00();
            }

            @Override // X.C2AH
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                RuntimeException A18;
                int i2;
                List BsT;
                InterfaceC110074xc interfaceC110074xc;
                List list2 = (List) obj;
                C14360o3.A0B(list2, 0);
                if (list2.isEmpty()) {
                    A18 = AbstractC166987dD.A18("zero videos imported");
                } else {
                    C8JT c8jt2 = C8JT.this;
                    FragmentActivity activity = c8jt2.A1B.getActivity();
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                    int i3 = i;
                    C8JT.A0u(c8jt2, i3);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C195868lW c195868lW = (C195868lW) it.next();
                            if (c195868lW == null) {
                                A18 = AbstractC166987dD.A18("video is null");
                                break;
                            }
                            AbstractC166997dE.A1W(A1E, c195868lW.A07);
                        } else {
                            List A01 = OOM.A01(A1E, i3);
                            if (list2.size() != A01.size()) {
                                A18 = AbstractC166987dD.A18("videos size differs from finalVideoDurations size");
                            } else {
                                ListIterator listIterator = list2.listIterator();
                                while (listIterator.hasNext()) {
                                    int nextIndex = listIterator.nextIndex();
                                    C195868lW c195868lW2 = (C195868lW) listIterator.next();
                                    if (c195868lW2 == null) {
                                        A18 = AbstractC166987dD.A18("video is null");
                                    } else if (c195868lW2.A07 <= 0) {
                                        A18 = AbstractC166987dD.A18("video with <= 0 duration");
                                    } else {
                                        this.A00 = c195868lW2.A07();
                                        if (!listIterator.hasNext() && !z) {
                                            c8jt2.A0m = true;
                                        }
                                        OLX olx = (OLX) AbstractC001800i.A0O(A01, nextIndex);
                                        if (olx == null) {
                                            return;
                                        }
                                        if (z2) {
                                            InterfaceC110214xq interfaceC110214xq = ((C89P) c8jt2.A27.getValue()).A04;
                                            if (interfaceC110214xq == null || (BsT = interfaceC110214xq.BsT()) == null || (interfaceC110074xc = (InterfaceC110074xc) AbstractC001800i.A0O(BsT, nextIndex)) == null) {
                                                return;
                                            } else {
                                                i2 = (int) interfaceC110074xc.getDurationInMs();
                                            }
                                        } else {
                                            i2 = olx.A00;
                                        }
                                        Integer valueOf = Integer.valueOf(i2);
                                        if (valueOf == null) {
                                            return;
                                        }
                                        int intValue = valueOf.intValue();
                                        if (z) {
                                            int i4 = 54;
                                            if (c195868lW2.A0F != 54) {
                                                i4 = 1;
                                            }
                                            File A07 = C8JT.A07(c8jt2, AbstractC166987dD.A11(c195868lW2.A0k));
                                            if (A07 != null) {
                                                int i5 = c195868lW2.A07;
                                                C115475Kh A06 = C8JT.A06(ImmutableList.of(), c8jt2.A1m.A00(), c8jt2, c195868lW2, A07, c195868lW2.A06(), AbstractC166987dD.A1E(), i4, i5, olx.A01, intValue, false, false);
                                                List list3 = this.A01;
                                                list3.add(A06);
                                                C8JT.A0p(c8jt2);
                                                if (!listIterator.hasNext()) {
                                                    c8jt2.A1n.A0i(list3);
                                                }
                                            }
                                        } else {
                                            String A072 = c195868lW2.A07();
                                            File A11 = AbstractC166987dD.A11(c195868lW2.A0k);
                                            int i6 = c195868lW2.A07;
                                            int i7 = c195868lW2.A0K;
                                            int i8 = c195868lW2.A08;
                                            int i9 = c195868lW2.A09;
                                            String A062 = c195868lW2.A06();
                                            ImmutableList of = ImmutableList.of();
                                            C14360o3.A07(of);
                                            int i10 = olx.A01;
                                            int i11 = olx.A00;
                                            Integer num = C05F.A01;
                                            boolean z3 = c195868lW2.A1L;
                                            String str = c195868lW2.A0r;
                                            MediaUploadMetadata A02 = c195868lW2.A02();
                                            List list4 = c195868lW2.A0w;
                                            int i12 = c195868lW2.A0F;
                                            int i13 = 54;
                                            if (i12 != 54) {
                                                i13 = 1;
                                            }
                                            C8JT.A0I(of, null, A02, c8jt2, A11, Boolean.valueOf(listIterator.hasNext()), num, Integer.valueOf(i13), A072, A062, str, list4, i6, i7, i8, i9, i10, i11, true, z3);
                                        }
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
                onFail(A18);
            }
        };
        C14360o3.A0B(c49602Pt, 3);
        C121275eQ c121275eQ = new C121275eQ(new B1U(context, userSession, A00, c22832A5b, c49602Pt, AoU, list), 459);
        c121275eQ.A00 = c2ah;
        C1GJ.A03(c121275eQ);
    }

    public static final void A0S(C8JT c8jt) {
        boolean z;
        Iterator it = c8jt.A0V.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof C221009pO) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (c8jt.A1P.A1g == null && !(!AnonymousClass483.A04(c8jt.A2V.A0T(C221009pO.class))) && !z && !c8jt.A1g()) {
            A0N(C81W.A04, c8jt, true);
            AnonymousClass229.A01(c8jt.A1D).A1H(EnumC50631MWs.A0J);
        } else {
            A0N(C81W.A04, c8jt, false);
        }
    }

    public static final void A0T(C8JT c8jt) {
        c8jt.A22.A0h.A01 = (int) (A00(c8jt) * c8jt.A1m.A00().A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0.A02 >= 15000) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0U(X.C8JT r9) {
        /*
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A0N
            r4 = 1
            r3 = 0
            if (r0 == 0) goto Ld
            int r2 = r0.A02
            r0 = 15000(0x3a98, float:2.102E-41)
            r1 = 1
            if (r2 < r0) goto Le
        Ld:
            r1 = 0
        Le:
            X.81l r0 = r9.A1F
            X.81v r8 = r0.A08
            java.lang.Object r0 = r8.A00
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L8b
            boolean r0 = r9.CLf()
            if (r0 != 0) goto L8c
            if (r1 != 0) goto L8c
            boolean r0 = A1U(r9)
            if (r0 != 0) goto L8c
            X.81W r5 = X.C81W.A0E
            A0N(r5, r9, r4)
            X.826 r1 = r9.A0I
            if (r1 == 0) goto L8b
            int r0 = r1.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r1.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L8b
            if (r7 == 0) goto L8b
            android.content.Context r6 = r9.A11
            android.content.res.Resources r1 = r6.getResources()
            int r0 = r2.intValue()
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            X.C14360o3.A07(r3)
            r0 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r0)
            X.8GG r2 = r9.A1O
            X.8GH r1 = r2.A00()
            java.lang.Object r0 = r8.A00
            X.55U r0 = (X.C55U) r0
            r1.A09(r3, r0, r5)
            X.8GH r4 = r2.A00()
            java.lang.Object r3 = r8.A00
            X.55U r3 = (X.C55U) r3
            r0 = 2131961206(0x7f132576, float:1.9559102E38)
            java.lang.String r2 = r6.getString(r0)
            int r0 = r7.intValue()
            java.lang.String r0 = r6.getString(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            X.C14360o3.A07(r0)
            r4.A04(r3, r5, r0)
        L8b:
            return
        L8c:
            X.81W r0 = X.C81W.A0E
            A0N(r0, r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A0U(X.8JT):void");
    }

    public static final void A0V(C8JT c8jt) {
        boolean z;
        if (c8jt.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null", null);
            return;
        }
        if (A1U(c8jt)) {
            z = false;
        } else {
            z = false;
            if (c8jt.A0J.A01.size() > 0) {
                C84B c84b = c8jt.A0J;
                AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) c84b.A04(c84b.A01.size() - 1);
                if ((abstractC115485Ki instanceof C115475Kh) && ((C115475Kh) abstractC115485Ki).A0G.A08 == 0) {
                    z = true;
                }
            }
        }
        C81W c81w = C81W.A09;
        A0N(c81w, c8jt, z);
        c8jt.A1O.A00().A05(C81U.A00, c81w, c8jt.A11.getString(2131954603));
        C1810981l c1810981l = c8jt.A1F;
        if (c1810981l.A0W(c81w) == c8jt.A0e) {
            return;
        }
        c1810981l.A0M(c81w);
    }

    public static final void A0W(C8JT c8jt) {
        if (c8jt.A0e && c8jt.CLf() && !c8jt.A0i) {
            if (!c8jt.A20.A02()) {
                AKk.A02(c8jt.A11, C05F.A0C, "Directory provider unavailable during ghost overlay", 2131974293);
                return;
            }
            C57012jc c57012jc = c8jt.A1E;
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c8jt.A1H).A0K;
            AbstractC13880nE.A0g(A01, interfaceC1812882f.getWidth());
            View A012 = c57012jc.A01();
            C14360o3.A07(A012);
            AbstractC13880nE.A0W(A012, interfaceC1812882f.getHeight());
            C84B c84b = c8jt.A0J;
            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) c84b.A04(c84b.A01.size() - 1);
            if (!(abstractC115485Ki instanceof C115475Kh)) {
                return;
            }
            View A013 = c57012jc.A01();
            C14360o3.A07(A013);
            AbstractC13880nE.A0q(A013, new RunnableC24660Avu(c8jt, abstractC115485Ki));
            return;
        }
        A0G(null, c8jt);
    }

    public static final void A0X(C8JT c8jt) {
        C208649Ky c208649Ky = c8jt.A0E;
        if (c208649Ky == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null", null);
            return;
        }
        AudioOverlayTrack audioOverlayTrack = c8jt.A0N;
        if (c8jt.A1x.A03()) {
            A0N(C81W.A0g, c8jt, false);
            return;
        }
        C81W c81w = C81W.A0g;
        A0N(c81w, c8jt, true);
        UserSession userSession = c8jt.A1D;
        float f = 0.5f;
        if (C36A.A08(userSession)) {
            f = 1.0f;
        }
        if (audioOverlayTrack != null) {
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel == null) {
                return;
            }
            if (musicAssetModel.A01 != OriginalAudioSubtype.A06 || (C36A.A08(userSession) && C18U.A06(C06090Tz.A06, userSession, 36321353011570005L))) {
                AbstractC38055Goi.A01(userSession, musicAssetModel, c208649Ky.A05);
            } else {
                c8jt.A1I(null, false);
                C9GR.A01(c8jt.A11, "mix_not_available", 2131966719, 0);
            }
            BOM bom = c208649Ky.A05;
            bom.setAlpha((int) (f * 255.0f));
            C8GH A00 = c8jt.A1O.A00();
            C1810981l c1810981l = c8jt.A1F;
            boolean A09 = A00.A09(bom, (C55U) c1810981l.A08.A00, c81w);
            C24P c24p = AnonymousClass229.A01(userSession).A02.A00;
            String.valueOf(c24p.A00.A0J());
            String.valueOf(c24p.A00());
            c1810981l.A0L(c81w);
            c8jt.A1X.A04 = A09;
            return;
        }
        Drawable drawable = c8jt.A11.getResources().getDrawable(R.drawable.instagram_music_outline_44);
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
        }
        C8GH A002 = c8jt.A1O.A00();
        C1810981l c1810981l2 = c8jt.A1F;
        A002.A09(drawable, (C55U) c1810981l2.A08.A00, c81w);
        c1810981l2.A0N(c81w);
        c8jt.A1X.A04 = false;
    }

    public static final void A0Y(C8JT c8jt) {
        C81W c81w = C81W.A0t;
        A0N(c81w, c8jt, true);
        C8GH A00 = c8jt.A1O.A00();
        C55U c55u = (C55U) c8jt.A1F.A08.A00;
        String format = String.format(Locale.getDefault(), c8jt.A11.getString(2131974322), AbstractC171697kz.A00(c8jt.A1m.A00().A00));
        C14360o3.A07(format);
        A00.A04(c55u, c81w, format);
    }

    public static final void A0Z(C8JT c8jt) {
        if (c8jt.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null", null);
            return;
        }
        C8GH A00 = c8jt.A1O.A00();
        C81W c81w = C81W.A0y;
        A00.A05(C81U.A00, c81w, c8jt.A11.getString(2131954702));
        C1810981l c1810981l = c8jt.A1F;
        boolean A0W = c1810981l.A0W(c81w);
        boolean z = false;
        if (c8jt.A02 != -1) {
            z = true;
        }
        if (A0W == z) {
            return;
        }
        c1810981l.A0M(c81w);
    }

    public static final void A0a(C8JT c8jt) {
        int i;
        if (c8jt.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null", null);
            return;
        }
        if (A1Y(c8jt)) {
            int A01 = C80G.A01(c8jt.A0J);
            if (c8jt.A1F.A0W(C81W.A0J)) {
                i = A02(c8jt);
            } else {
                i = c8jt.A02;
                if (i == -1) {
                    i = c8jt.A03;
                }
            }
            c8jt.A22.A0h.A03 = A01 + i;
        } else {
            ShutterButton shutterButton = c8jt.A22;
            shutterButton.A0h.A03 = 0;
            shutterButton.invalidate();
        }
        A0v(c8jt, A02(c8jt) / 1000);
    }

    public static final void A0c(C8JT c8jt) {
        Dialog dialog = c8jt.A04;
        if (dialog != null) {
            dialog.dismiss();
        }
        C31727DwY c31727DwY = c8jt.A0L;
        if (c31727DwY != null) {
            c31727DwY.A04();
        }
    }

    public static final void A0e(C8JT c8jt) {
        C1816683y c1816683y;
        UserSession userSession = c8jt.A1D;
        boolean z = true;
        if (!C36A.A08(userSession)) {
            C24U c24u = AnonymousClass229.A01(userSession).A03;
            C24Q c24q = c24u.A0E;
            long A03 = c24q.A03(17641988, c24u.A0B);
            c24q.A09(A03, MSV.A00(1416), "clips_pre_cap_audio_button");
            c24q.A07("music browser unavailable", "", 17641988, A03);
            C9GR.A01(c8jt.A11, "clips_music_unavailable", 2131955576, 0);
            return;
        }
        if (c8jt.A1F.A08.A00 == C1811181n.A00 && (c1816683y = c8jt.A1P.A12) != null && c1816683y.A00 != null) {
            C9GR.A0F(c8jt.A11, "clips_music_pinned", 2131955646);
            return;
        }
        AnonymousClass229.A01(userSession);
        AnonymousClass229.A01(userSession).A03.A07("clips_pre_cap_audio_button");
        AudioOverlayTrack audioOverlayTrack = c8jt.A0N;
        if (A1S(c8jt) && c8jt.A0y) {
            z = false;
        }
        A10(c8jt, audioOverlayTrack, null, z);
    }

    public static final void A0g(C8JT c8jt) {
        C8YY A00;
        C50643MXf c50643MXf = c8jt.A0F;
        if (c50643MXf != null && c50643MXf.A0H) {
            c50643MXf.A0E();
            A0m(c8jt);
            A1B(c8jt, false);
            C188798Xv c188798Xv = c8jt.A0B;
            if (c188798Xv != null && (A00 = c188798Xv.A00()) != null) {
                A00.A0D();
            }
        }
    }

    public static final void A0h(C8JT c8jt) {
        if (C18U.A06(C06090Tz.A05, c8jt.A1D, 36327297246444008L)) {
            A0j(c8jt);
        } else {
            c8jt.A12.postDelayed(new RunnableC24410Arr(c8jt), 500L);
        }
    }

    public static final void A0i(C8JT c8jt) {
        C9BW c9bw;
        C8A8 c8a8 = (C8A8) c8jt.A1s.A0C.A02();
        if (c8a8 != null && (c9bw = (C9BW) c8a8.A01) != null) {
            UserSession userSession = c8jt.A1D;
            AnonymousClass229.A01(userSession).A1E(null, null, ((C128175qm) c9bw.A00).A0T, null, null, null, false);
            AbstractC226999zv.A00(userSession).A01(EnumC222779sI.A06);
        }
    }

    public static final void A0j(C8JT c8jt) {
        C188798Xv c188798Xv;
        C8YY A00;
        if (c8jt.A1k.A03.A04 == null && (c188798Xv = c8jt.A0B) != null && (A00 = c188798Xv.A00()) != null) {
            A00.A0L(false);
        }
    }

    public static final void A0k(C8JT c8jt) {
        if (!c8jt.A29) {
            List list = c8jt.A0X;
            if (list != null && !list.isEmpty()) {
                c8jt.A1o.A06.A0B(new C8A8(new C8A9(c8jt.A19, c8jt.A1z, null, list, c8jt.A2X, 678, false, c8jt.A2Z, false)));
            } else {
                return;
            }
        }
        c8jt.A0X = null;
        c8jt.A0W = null;
    }

    public static final void A0l(C8JT c8jt) {
        C4PX c4px = c8jt.A0r;
        if (c4px != null) {
            C57012jc c57012jc = c8jt.A1E;
            if (c57012jc.A04()) {
                View A01 = c57012jc.A01();
                C14360o3.A07(A01);
                float A00 = AbstractC94954Pb.A00(A01, c4px);
                c57012jc.A01().setScaleX(A00);
                c57012jc.A01().setScaleY(A00);
                c57012jc.A01().setPivotY(0.0f);
                c57012jc.A01().setPivotX(c57012jc.A01().getWidth() / 2);
            }
        }
    }

    public static final void A0n(C8JT c8jt) {
        C448124l c448124l = AnonymousClass229.A01(c8jt.A1D).A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (c448124l.A0P() && ((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("KEEP_EDITING_TAP");
            C448124l.A00(A08, c448124l);
            A08.A0a(EnumC114925Hg.CLIPS);
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0M(EnumC50631MWs.A0J, "surface");
            A08.A0m(C22F.A08.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((X.C89P) r3.A27.getValue()).A04 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0o(X.C8JT r3) {
        /*
            X.81l r0 = r3.A1F
            X.81v r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L2a
            X.8Gf r2 = r3.A2H
            boolean r0 = r3.A1L()
            if (r0 == 0) goto L1f
            X.0do r0 = r3.A27
            java.lang.Object r0 = r0.getValue()
            X.89P r0 = (X.C89P) r0
            X.4xq r1 = r0.A04
            r0 = 1
            if (r1 == 0) goto L20
        L1f:
            r0 = 0
        L20:
            X.05A r1 = r2.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Egh(r0)
        L29:
            return
        L2a:
            X.87m r0 = r3.A2E
            X.82K r0 = r0.A00
            X.82M r0 = r0.A00()
            X.8ZD r0 = (X.C8ZD) r0
            boolean r0 = r0.A07()
            if (r0 != 0) goto L29
            X.8Gf r2 = r3.A2H
            r0 = 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A0o(X.8JT):void");
    }

    public static final void A0q(C8JT c8jt) {
        int A06 = c8jt.A1F.A06(C81W.A0E);
        if (c8jt.A0I != AbstractC001800i.A0O(c8jt.A23, A06)) {
            A0t(c8jt, A06);
        }
    }

    public static final void A0r(C8JT c8jt) {
        if (c8jt.A0T != null) {
            c8jt.A0T = null;
            A0m(c8jt);
            A1B(c8jt, true);
            c8jt.A1d.A00();
        }
    }

    public static final void A0s(C8JT c8jt, int i) {
        C84B c84b;
        if (c8jt.A0E == null) {
            AKk.A02(c8jt.A11, C05F.A00, "Trying to delete segment when UI isn't available", 2131955610);
            return;
        }
        C448124l c448124l = AnonymousClass229.A01(c8jt.A1D).A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s(MSV.A00(777));
            A08.A0q(MSV.A00(699));
            C448124l.A00(A08, c448124l);
            A08.A0a(c448124l.A0J());
            A08.A0Q("capture_format_index", 0L);
            A08.A0b(c448124l.A04.A09);
            A08.A0T();
            A08.A0c(AnonymousClass249.VIDEO);
            A08.A0m(C22F.A08.getModuleName());
            A08.A0Q("segment_index", Long.valueOf(i));
            A08.A0U();
            A08.A0M(c448124l.A0I(), "capture_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
        ClipsCreationViewModel clipsCreationViewModel = c8jt.A1n;
        clipsCreationViewModel.A0U(i, true);
        Object A02 = clipsCreationViewModel.A0G.A02();
        if ((A02 instanceof C84B) && (c84b = (C84B) A02) != null) {
            c8jt.A22.A0h.setSegments(c84b);
        }
        C50643MXf c50643MXf = c8jt.A0F;
        if (c50643MXf != null && c50643MXf.A0H) {
            if (!c8jt.CLf()) {
                A0g(c8jt);
                View findViewById = c8jt.A13.findViewById(R.id.preview_view);
                if (findViewById != null) {
                    findViewById.setAlpha(1.0f);
                }
                C1828989k c1828989k = c8jt.A1x;
                if (c1828989k.A03()) {
                    c1828989k.A06.A0B(EnumC1829089l.A05);
                    c1828989k.A02.Egh(false);
                    c1828989k.A00 = null;
                    c1828989k.A01 = null;
                    A0b(c8jt);
                }
                ((C191478dz) c8jt.A2S.get()).A0H = C191548eB.A00;
            } else {
                C50643MXf c50643MXf2 = c8jt.A0F;
                if (c50643MXf2 != null) {
                    C84B c84b2 = c8jt.A0K;
                    int A00 = A00(c8jt);
                    C14360o3.A0B(c84b2, 0);
                    if (!c50643MXf2.A0H) {
                        AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "should be showing during update", null);
                    } else {
                        c50643MXf2.A0D = new C84B(c84b2.A05(), c84b2.A03);
                        c50643MXf2.A03 = A00;
                        c50643MXf2.A04 = 0;
                        c50643MXf2.A0N.removeCallbacks(c50643MXf2.A0g);
                        InterfaceC58267PsB interfaceC58267PsB = c50643MXf2.A0B;
                        if (interfaceC58267PsB != null) {
                            interfaceC58267PsB.reset();
                        }
                        C50643MXf.A0C(c50643MXf2, false, true);
                        C50643MXf.A07(c50643MXf2, 0);
                    }
                }
            }
        }
        if (c8jt.CLf()) {
            return;
        }
        clipsCreationViewModel.A0I.A0B(null);
    }

    public static final void A0t(C8JT c8jt, int i) {
        AnonymousClass826 anonymousClass826 = (AnonymousClass826) AbstractC001800i.A0O(c8jt.A23, i);
        c8jt.A0I = anonymousClass826;
        if (anonymousClass826 != null) {
            c8jt.A22.A0h.A01 = (int) (anonymousClass826.A01 * c8jt.A1m.A00().A00);
            c8jt.A1O();
            c8jt.A1v.A05.A0B(anonymousClass826);
            A0T(c8jt);
            A0v(c8jt, A02(c8jt) / 1000);
        }
    }

    public static final void A0u(C8JT c8jt, int i) {
        AnonymousClass825 anonymousClass825 = c8jt.A1v;
        List list = anonymousClass825.A08;
        Object A02 = anonymousClass825.A05.A02();
        C14360o3.A0B(list, 0);
        int indexOf = list.indexOf(A02) + 1;
        if (indexOf >= list.size()) {
            indexOf = 0;
        } else {
            while (indexOf < list.size() - 1 && ((AnonymousClass826) list.get(indexOf)).A01 < i) {
                indexOf++;
            }
        }
        c8jt.A0I = (AnonymousClass826) list.get(indexOf);
        A0R(c8jt);
    }

    public static final void A0v(C8JT c8jt, int i) {
        C185458Kn c185458Kn = c8jt.A2W;
        int i2 = (int) (1000.0f * c8jt.A1m.A00().A00);
        c185458Kn.A02.removeCallbacksAndMessages(null);
        c185458Kn.A01 = i;
        c185458Kn.A00 = i2;
        AbstractC185558Kx.A00(i, new C206899Du(c8jt, 44));
    }

    public static final void A0w(C8JT c8jt, InterfaceC185138Je interfaceC185138Je) {
        BEY bey;
        BEW bew;
        BEX bex;
        int i;
        int i2;
        final String str;
        BEW bew2;
        BEX bex2;
        C8YY A00;
        C194648jP c194648jP;
        MusicAttributionConfig BVX;
        final C83C c83c = c8jt.A1M;
        if (c83c != null && !C14360o3.A0K(interfaceC185138Je, C185248Jp.A00) && !C14360o3.A0K(interfaceC185138Je, C185128Jd.A00)) {
            if (C14360o3.A0K(interfaceC185138Je, C9LF.A00)) {
                c83c.A00().A04(true);
                return;
            }
            MusicAssetModel musicAssetModel = null;
            if (!(interfaceC185138Je instanceof BEY) || (bey = (BEY) interfaceC185138Je) == null) {
                return;
            }
            if (interfaceC185138Je instanceof BEW) {
                bew = (BEW) interfaceC185138Je;
            } else {
                bew = null;
            }
            if (interfaceC185138Je instanceof BEX) {
                bex = (BEX) interfaceC185138Je;
            } else {
                bex = null;
            }
            final EnumC185548Kw C3o = bey.C3o();
            ImageUrl C89 = bey.C89();
            C14360o3.A0B(C3o, 0);
            C14360o3.A0B(C89, 1);
            int ordinal = C3o.ordinal();
            switch (ordinal) {
                case 0:
                case 1:
                    i = 2131955605;
                    break;
                case 2:
                    i = 2131955607;
                    break;
                case 3:
                    i = 2131955656;
                    break;
                case 4:
                    i = 2131955658;
                    break;
                case 5:
                    i = 2131955657;
                    break;
                case 6:
                    return;
                default:
                    throw new RuntimeException();
            }
            Integer valueOf = Integer.valueOf(i);
            if (ordinal != 4) {
                i2 = 2131955608;
                if (ordinal != 5) {
                    i2 = 2131955606;
                }
            } else {
                i2 = 2131955609;
            }
            if (valueOf == null) {
                return;
            }
            C8ZA c8za = C8ZA.A05;
            int intValue = valueOf.intValue();
            boolean z = true;
            if (C3o != EnumC185548Kw.A04) {
                z = false;
            }
            final Long l = null;
            C180667zu c180667zu = new C180667zu(null, null, C89, null, c8za, null, null, null, 0, intValue, i2, 0, R.dimen.abc_alert_dialog_button_dimen, z, true, true, false, false);
            C8Z9 A002 = c83c.A00();
            final UserSession userSession = c8jt.A1D;
            if (bex != null) {
                str = bex.getEffectId();
            } else {
                str = null;
            }
            C81J c81j = c8jt.A1P;
            final String str2 = c81j.A2m;
            if (bew != null && (BVX = bew.BVX()) != null) {
                musicAssetModel = BVX.A02;
            }
            C05A c05a = c8jt.A1j.A04;
            InterfaceC185138Je interfaceC185138Je2 = (InterfaceC185138Je) c05a.getValue();
            C211989aP c211989aP = null;
            if (interfaceC185138Je2 instanceof BEW) {
                bew2 = (BEW) interfaceC185138Je2;
            } else {
                bew2 = null;
            }
            if (interfaceC185138Je2 instanceof BEX) {
                bex2 = (BEX) interfaceC185138Je2;
            } else {
                bex2 = null;
            }
            Object value = c05a.getValue();
            if (value instanceof C211989aP) {
                c211989aP = (C211989aP) value;
            }
            final C9PT c9pt = new C9PT(c8jt, bew2, bex2, c211989aP);
            String str3 = c81j.A2Z;
            if (str3 != null) {
                l = AbstractC003100w.A0k(10, str3);
            }
            final MusicAssetModel musicAssetModel2 = musicAssetModel;
            A002.A05.put((EnumMap) c8za, (C8ZA) new InterfaceC25206BDe(C3o, userSession, c83c, c9pt, musicAssetModel2, l, str, str2) { // from class: X.9PU
                public String A00;
                public String A01;
                public String A02;
                public final C22P A05;
                public final EnumC185548Kw A06;
                public final UserSession A07;
                public final C83C A08;
                public final C9PT A09;
                public final MusicAssetModel A0A;
                public final Long A0B;
                public final Long A0C;
                public final Long A0D;
                public final String A0E;
                public ArrayList A04 = AbstractC166987dD.A1E();
                public ArrayList A03 = AbstractC166987dD.A1E();

                public static void A01(InterfaceC02590Ai interfaceC02590Ai, Long l2, String str4, List list) {
                    interfaceC02590Ai.A8R(AnonymousClass249.VIDEO, "media_type");
                    interfaceC02590Ai.AAP("module", "ClipsCaptureControllerImpl");
                    interfaceC02590Ai.A8R(EnumC50631MWs.A0J, "surface");
                    interfaceC02590Ai.AAk("applied_effect_ids", list);
                    interfaceC02590Ai.A8R(null, "media_source");
                    interfaceC02590Ai.AAP("artist_name", str4);
                    interfaceC02590Ai.A9K("audio_asset_id", l2);
                }

                @Override // X.InterfaceC25206BDe
                public final void Doo() {
                }

                @Override // X.InterfaceC25206BDe
                public final void Dop() {
                }

                @Override // X.InterfaceC25206BDe
                public final void Doq() {
                    BEY bey2;
                    EnumC185548Kw C3o2;
                    EnumC209839Pu A003 = A00(this.A06);
                    if (A003 != null) {
                        UserSession userSession2 = this.A07;
                        String str4 = this.A01;
                        String str5 = this.A00;
                        String str6 = this.A02;
                        Long l2 = this.A0B;
                        Long l3 = this.A0C;
                        ArrayList arrayList = this.A03;
                        String str7 = this.A0E;
                        ArrayList arrayList2 = this.A04;
                        C22P c22p = this.A05;
                        AbstractC167007dF.A1J(arrayList, 7, arrayList2);
                        C448824s c448824s = AnonymousClass229.A01(userSession2).A0G;
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448824s.A01, "ig_camera_ui_tool_impression");
                        if (A0f.isSampled()) {
                            A0f.A8R(C81X.A29, "tool_type");
                            A0f.AAP("legacy_falco_event_name", "IG_CAMERA_PRELOAD_SETTINGS_TOAST_IMPRESSION");
                            String str8 = c448824s.A04.A0L;
                            if (str8 == null) {
                                str8 = "";
                            }
                            A0f.AAP("camera_session_id", str8);
                            A0f.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                            A0f.AAP("camera_session_id", str7);
                            A0f.AAk("camera_tools", arrayList);
                            A0f.A8R(EnumC193318hB.A02, "capture_type");
                            A0f.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            AbstractC166997dE.A1N(A0f, "event_type", 1);
                            A01(A0f, l2, str5, arrayList2);
                            A0f.A9K("audio_cluster_id", l3);
                            A0f.AAP("audio_type", str4);
                            A0f.AAP("song_name", str6);
                            A0f.AAP("nav_chain", C1QM.A00.A02.A00);
                            A0f.A8R(A003, "preload_settings_toast_type");
                            A0f.Cht();
                        }
                    }
                    C8JT c8jt2 = this.A09.A00;
                    if (c8jt2.A1W.AuH() == EnumC1810381f.A03) {
                        C185118Jc c185118Jc = c8jt2.A1j;
                        Object value2 = c185118Jc.A04.getValue();
                        if ((value2 instanceof BEY) && (bey2 = (BEY) value2) != null && (C3o2 = bey2.C3o()) != null && C3o2 == EnumC185548Kw.A06) {
                            c185118Jc.A02.A00();
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0101, code lost:
                
                    if (r7 != null) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x0257, code lost:
                
                    if (r6 != null) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x0253, code lost:
                
                    if (r6 != null) goto L61;
                 */
                @Override // X.InterfaceC25206BDe
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void Dor() {
                    /*
                        Method dump skipped, instructions count: 618
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9PU.Dor():void");
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:19:0x005b. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                {
                    /*
                        r2 = this;
                        r2.<init>()
                        r2.A06 = r3
                        r2.A08 = r5
                        r2.A07 = r4
                        r2.A0A = r7
                        r2.A09 = r6
                        r2.A0D = r8
                        java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
                        r2.A04 = r0
                        java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
                        r2.A03 = r0
                        r0 = 0
                        if (r7 == 0) goto L6e
                        java.lang.String r1 = r7.A0E
                        if (r1 == 0) goto L6e
                        java.lang.Long r1 = X.AbstractC166997dE.A0j(r1)
                    L26:
                        r2.A0B = r1
                        if (r7 == 0) goto L32
                        java.lang.String r1 = r7.A0B
                        if (r1 == 0) goto L32
                        java.lang.Long r0 = X.AbstractC166997dE.A0j(r1)
                    L32:
                        r2.A0C = r0
                        java.lang.String r0 = X.AbstractC166997dE.A0t(r4)
                        r2.A0E = r0
                        X.22C r0 = X.AnonymousClass229.A01(r4)
                        X.22M r0 = r0.A04
                        X.22P r0 = r0.A09
                        X.C14360o3.A07(r0)
                        r2.A05 = r0
                        if (r7 == 0) goto L57
                        java.lang.String r0 = r7.A0G
                        if (r0 == 0) goto L63
                        java.lang.String r0 = "original_sounds"
                        r2.A01 = r0
                        r2.A00 = r10
                        java.lang.String r0 = "Original Audio"
                    L55:
                        r2.A02 = r0
                    L57:
                        int r0 = r3.ordinal()
                        switch(r0) {
                            case 0: goto L70;
                            case 1: goto L70;
                            case 2: goto L7c;
                            case 3: goto L75;
                            case 4: goto L83;
                            case 5: goto L83;
                            case 6: goto L83;
                            default: goto L5e;
                        }
                    L5e:
                        X.B4Z r0 = X.B4Z.A00()
                        throw r0
                    L63:
                        java.lang.String r0 = "licensed_music"
                        r2.A01 = r0
                        java.lang.String r0 = r7.A0D
                        r2.A00 = r0
                        java.lang.String r0 = r7.A0I
                        goto L55
                    L6e:
                        r1 = r0
                        goto L26
                    L70:
                        java.util.ArrayList r1 = r2.A03
                        X.81X r0 = X.C81X.A1i
                        goto L80
                    L75:
                        java.util.ArrayList r1 = r2.A03
                        X.81X r0 = X.C81X.A1i
                        r1.add(r0)
                    L7c:
                        java.util.ArrayList r1 = r2.A03
                        X.81X r0 = X.C81X.A0x
                    L80:
                        r1.add(r0)
                    L83:
                        if (r9 == 0) goto L8e
                        java.util.ArrayList r1 = r2.A04
                        java.lang.Long r0 = X.AbstractC166997dE.A0j(r9)
                        r1.add(r0)
                    L8e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9PU.<init>(X.8Kw, com.instagram.common.session.UserSession, X.83C, X.9PT, com.instagram.music.common.model.MusicAssetModel, java.lang.Long, java.lang.String, java.lang.String):void");
                }

                private final EnumC209839Pu A00(EnumC185548Kw enumC185548Kw) {
                    switch (enumC185548Kw.ordinal()) {
                        case 0:
                        case 1:
                            return EnumC209839Pu.SUGGESTED_AUDIO;
                        case 2:
                            return EnumC209839Pu.SUGGESTED_AR_EFFECTS;
                        case 3:
                            return EnumC209839Pu.SUGGESTED_AUDIO_AND_AR_EFFECTS;
                        case 4:
                            return EnumC209839Pu.SUGGESTED_TEMPLATES;
                        case 5:
                            return EnumC209839Pu.BROWSE_TEMPLATES;
                        default:
                            String simpleName = getClass().getSimpleName();
                            C14360o3.A07(simpleName);
                            AbstractC12120kG.A07(simpleName, AbstractC167017dG.A0n(enumC185548Kw, "Suggested Camera Settings not supported: ", AbstractC166987dD.A1C()), null);
                            return null;
                    }
                }
            });
            if (!(c8jt.A1F.A08.A00 instanceof C81V) || c8jt.CZY() || c8jt.A1W.AuH() != EnumC1810381f.A03 || c8jt.A1k.A03.A04 != null || c8jt.A1g() || A05(c8jt) != null) {
                return;
            }
            C188798Xv c188798Xv = c8jt.A0B;
            if (c188798Xv != null && (A00 = c188798Xv.A00()) != null && (c194648jP = A00.A01) != null && (c194648jP.A0E.A01 != 0.0d || c194648jP.A00 <= 0.0f)) {
                return;
            }
            c83c.A00().A02(c180667zu, 500L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (r11 != X.AnonymousClass827.A00(r16.A1D)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0x(X.C8JT r16, X.C128175qm r17) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A0x(X.8JT, X.5qm):void");
    }

    public static final void A0y(C8JT c8jt, AnonymousClass826 anonymousClass826) {
        C1810981l c1810981l = c8jt.A1F;
        C81W c81w = C81W.A0E;
        if (c1810981l.A0V(c81w)) {
            if (C8GX.A01(c81w) == 1) {
                int indexOf = c8jt.A23.indexOf(anonymousClass826);
                if (indexOf >= 0) {
                    c1810981l.A0O(c81w, indexOf);
                    return;
                }
                return;
            }
            c1810981l.A0P(c81w, anonymousClass826.A01);
        }
    }

    public static final void A0z(C8JT c8jt, C115525Km c115525Km, int i, int i2) {
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = c8jt.A1D;
        User A01 = c08730cb.A01(userSession);
        String username = A01.getUsername();
        C22999ABy c22999ABy = new C22999ABy();
        c22999ABy.A09 = UUID.randomUUID().toString();
        c22999ABy.A0D = new ArrayList();
        Context context = c8jt.A11;
        c22999ABy.A0C = context.getString(2131969269);
        c22999ABy.A08 = username;
        c22999ABy.A02 = A01.Bhu();
        c22999ABy.A03 = A01.Bhu();
        c22999ABy.A00 = c115525Km.A04;
        c22999ABy.A0H = true;
        c22999ABy.A06 = "";
        c22999ABy.A0F = false;
        c22999ABy.A07 = "";
        c8jt.A1d.A03(context, c8jt.A1B.requireActivity());
        c8jt.A2L.A01(userSession, new C23789Ag0(c8jt, c22999ABy, i, i2), null, Long.valueOf(c115525Km.A04), c115525Km.A0F);
    }

    public static final void A10(C8JT c8jt, AudioOverlayTrack audioOverlayTrack, MusicOverlaySearchTab musicOverlaySearchTab, boolean z) {
        if (c8jt.A0b) {
            c8jt.A1d.A02();
            return;
        }
        File file = c8jt.A0Q;
        if (file == null || ((file.exists() && file.length() > 0) || audioOverlayTrack == null)) {
            c8jt.A1f.A0A(audioOverlayTrack, musicOverlaySearchTab, z, c8jt.A1j.A04.getValue() instanceof C211959aM);
            ClipsCreationViewModel clipsCreationViewModel = c8jt.A1n;
            clipsCreationViewModel.A0L.A05.Egh(MusicProduct.A06);
            return;
        }
        A12(c8jt, audioOverlayTrack, false);
    }

    public static final void A12(final C8JT c8jt, final AudioOverlayTrack audioOverlayTrack, boolean z) {
        if (c8jt.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null", null);
            return;
        }
        C8KO c8ko = c8jt.A0P;
        if (c8ko == null) {
            C14360o3.A0F("trackDownloader");
            throw C00O.createAndThrow();
        }
        if (c8ko.A00) {
            c8jt.A1h.A0E("download_in_progress_skipping_new_request");
            return;
        }
        if (c8jt.A0l) {
            c8jt.A1d.A01();
        }
        int min = Math.min(90000, AnonymousClass827.A00(c8jt.A1D).A01);
        c8jt.A1h.A0E("download_requested");
        c8ko.A03(audioOverlayTrack, new JHD() { // from class: X.9Nn
            @Override // X.JHD
            public final void DBj(MusicAssetModel musicAssetModel) {
                C14360o3.A0B(musicAssetModel, 0);
                C8JT c8jt2 = C8JT.this;
                c8jt2.A1h.A0E("asset_download_complete");
                AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
                audioOverlayTrack2.A00(musicAssetModel);
                c8jt2.A1n.A0b(new C187398Sh(audioOverlayTrack2), false);
                C8JT.A12(c8jt2, audioOverlayTrack2, false);
                C8JT.A0X(c8jt2);
            }

            @Override // X.JHD
            public final void DBk() {
                C8JT c8jt2 = C8JT.this;
                C8JT.A0b(c8jt2);
                if (c8jt2.A0l) {
                    C9GR.A0F(c8jt2.A11, "music_track_not_available", 2131968067);
                    if (c8jt2.A0g) {
                        c8jt2.A1h.A04();
                    }
                    c8jt2.A1h.A0D("music asset download failed");
                    return;
                }
                c8jt2.A1h.A0C("Asset DownloadFailed but ClipsCaptureContainer is hidden");
            }
        }, new BCw() { // from class: X.9Nm
            /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
            @Override // X.BCw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void DBi(com.instagram.music.common.model.DownloadedTrack r13) {
                /*
                    r12 = this;
                    r5 = 0
                    X.C14360o3.A0B(r13, r5)
                    X.8JT r2 = X.C8JT.this
                    X.8Bh r6 = r2.A1h
                    java.lang.String r0 = "track_download_complete"
                    r6.A0E(r0)
                    com.instagram.music.common.model.AudioOverlayTrack r3 = r2
                    r3.A06 = r13
                    X.8BE r4 = r2.A1l
                    com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A05
                    X.8ZT r0 = new X.8ZT
                    r0.<init>(r3)
                    r1.A0b(r0, r5)
                    r5 = 1
                    X.C8BE.A00(r4, r5)
                    boolean r0 = r2.A0l
                    if (r0 == 0) goto Lac
                    X.8Jt r1 = r3.A05
                    if (r1 == 0) goto L91
                    X.8Jt r0 = X.EnumC185288Jt.A0C
                    if (r1 == r0) goto L91
                    X.81c r0 = r2.A1W
                    X.81f r1 = r0.AuH()
                    X.81f r0 = X.EnumC1810381f.A03
                    if (r1 != r0) goto L91
                    com.instagram.common.session.UserSession r6 = r2.A1D
                    X.0Tz r4 = X.C06090Tz.A05
                    r0 = 36320347989025160(0x81092a00012188, double:3.0324725463374415E-306)
                    boolean r0 = X.C18U.A06(r4, r6, r0)
                    if (r0 == 0) goto L91
                    X.86Q r0 = r2.A1d
                    r0.A00()
                    com.instagram.music.common.model.MusicAssetModel r4 = r3.A08
                    if (r4 == 0) goto L91
                    X.8Js r6 = r2.A1b
                    r6.A0B = r5
                    r6.A0D = r5
                    r0 = 30000(0x7530, double:1.4822E-319)
                    r6.A02 = r0
                    int r1 = r3.A03
                    r0 = 0
                    r6.A07 = r4
                    r6.A01 = r1
                    X.C185278Js.A01(r6, r0)
                    r2.A0b = r5
                    android.content.Context r7 = r2.A11
                    X.8Jt r10 = r3.A05
                    X.AhJ r8 = new X.AhJ
                    r8.<init>(r2)
                    X.AhK r9 = new X.AhK
                    r9.<init>(r2)
                    X.BAj r11 = new X.BAj
                    r11.<init>(r2, r3, r13)
                    r6.A0G(r7, r8, r9, r10, r11)
                L7b:
                    com.instagram.music.common.model.DownloadedTrack r0 = r3.A06
                    if (r0 == 0) goto L90
                    X.83g r1 = r2.A1C
                    int r0 = r0.A01
                    X.83J r4 = r1.A07
                    if (r4 == 0) goto L90
                    double r2 = (double) r0
                    r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
                    double r2 = r2 / r0
                    r4.A00 = r2
                L90:
                    return
                L91:
                    boolean r0 = r2.A0i
                    if (r0 == 0) goto L98
                    r2.A0O = r3
                    goto L7b
                L98:
                    X.86Q r0 = r2.A1d
                    r0.A00()
                    X.8Kq r1 = r2.A1X
                    X.89e r0 = r2.A1m
                    X.89f r0 = r0.A00()
                    r1.A05(r0, r3)
                    X.C8JT.A0X(r2)
                    goto L7b
                Lac:
                    java.lang.String r0 = "ClipsCaptureContainer is hidden"
                    r6.A0C(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C209289Nm.DBi(com.instagram.music.common.model.DownloadedTrack):void");
            }

            @Override // X.BCw
            public final void DBk() {
                C8JT c8jt2 = C8JT.this;
                C8JT.A0b(c8jt2);
                if (c8jt2.A0l) {
                    C9GR.A0F(c8jt2.A11, "music_track_download_failed", 2131968064);
                    if (c8jt2.A0g) {
                        c8jt2.A1h.A04();
                    }
                    c8jt2.A1h.A0D("track download failed");
                    return;
                }
                c8jt2.A1h.A0C("DownloadFailed but ClipsCaptureContainer is hidden");
            }
        }, min, A1U(c8jt), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.2GT, X.2GS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A13(final X.C8JT r30, final X.C195868lW r31) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A13(X.8JT, X.8lW):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x015b, code lost:
    
        if (r20 != X.C05F.A0C) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0173, code lost:
    
        if (r18.A0J.A01.size() == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0187, code lost:
    
        if (A1X(r18) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A14(X.C8JT r18, X.C195868lW r19, java.lang.Integer r20) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A14(X.8JT, X.8lW, java.lang.Integer):void");
    }

    public static final void A15(C8JT c8jt, C195868lW c195868lW, Integer num) {
        c8jt.A0v = c195868lW;
        c8jt.A1h.A0M(((C22F) AnonymousClass229.A01(c8jt.A1D)).A04.A0L, "clips_gallery");
        String A07 = c195868lW.A07();
        File file = new File(c195868lW.A0k);
        int i = c195868lW.A07;
        int i2 = c195868lW.A0K;
        int i3 = c195868lW.A08;
        int i4 = c195868lW.A09;
        String A06 = c195868lW.A06();
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        int i5 = c195868lW.A07;
        boolean z = c195868lW.A1L;
        String str = c195868lW.A0r;
        MediaUploadMetadata A02 = c195868lW.A02();
        List list = c195868lW.A0w;
        int i6 = 54;
        if (c195868lW.A0F != 54) {
            i6 = 1;
        }
        A0I(of, null, A02, c8jt, file, null, num, Integer.valueOf(i6), A07, A06, str, list, i, i2, i3, i4, 0, i5, false, z);
        A0m(c8jt);
        A1B(c8jt, false);
    }

    public static final void A16(C8JT c8jt, Exception exc, String str, String str2, boolean z, boolean z2) {
        if (!C14360o3.A0K(str, c8jt.A0T) && !z2) {
            return;
        }
        C86Q c86q = c8jt.A1d;
        FrameLayout frameLayout = c86q.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c86q.A00);
            }
            c86q.A00 = null;
            A0m(c8jt);
        }
        Dialog dialog = c8jt.A05;
        if (dialog != null) {
            dialog.hide();
        }
        A0r(c8jt);
        AKk.A01(c8jt.A11, exc, str2, z);
        c8jt.A1o.A01();
    }

    public static final void A19(C8JT c8jt, Runnable runnable, boolean z) {
        C8YY A00;
        if (c8jt.A1x.A03() && c8jt.CLf()) {
            for (int size = c8jt.A0J.A01.size() - 1; size > 0; size--) {
                A0s(c8jt, size);
            }
            A0p(c8jt);
            return;
        }
        UserSession userSession = c8jt.A1D;
        C448124l c448124l = AnonymousClass229.A01(userSession).A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled() && c448124l.A0Q("logClipsAllSegmentsDeleted()")) {
            A08.A0s("IG_CAMERA_CLIPS_ALL_SEGMENTS_DELETED");
            A08.A0q("CLIPS_ALL_SEGMENTS_DELETED");
            C448124l.A00(A08, c448124l);
            C22M c22m = c448124l.A04;
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A08.A0V(i);
            A08.A0M(c448124l.A0I(), "capture_type");
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0c(AnonymousClass249.VIDEO);
            A08.A0m(C22F.A08.getModuleName());
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
        c8jt.A0z = true;
        c8jt.A1s.A0A();
        C8JY c8jy = c8jt.A2O;
        C1QT c1qt = c8jy.A02;
        c1qt.flowMarkPoint(c8jy.A01, "REELS_PRE_CAPTURE_START_OVER");
        c1qt.flowEndCancel(c8jy.A01, CancelReason.USER_CANCELLED);
        c8jy.A01 = 0L;
        AbstractC59962oe abstractC59962oe = c8jt.A1B;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        if (C1VN.A00 != null) {
            HashMap hashMap = new HashMap();
            if ("discard".length() != 0) {
                hashMap.put("exit_action", "discard");
            }
            hashMap.put("drafts_version", "drafts_V1");
            AbstractC31282Dp4.A00().A00(requireActivity, userSession, "729892711062224", hashMap);
        }
        C86S c86s = c8jt.A1S;
        AbstractC23641Du.A05(AnonymousClass191.A00, new C25024B5f(c86s, null, 7), AbstractC141776au.A00(c86s));
        c8jt.A0o = true;
        c8jt.A0c = false;
        A1F(c8jt, false, true, true);
        if (runnable != null) {
            runnable.run();
        }
        if (c8jt.A1F.A08.A00 instanceof C81V) {
            if (A1T(c8jt)) {
                AbstractC55032OXr.A01(abstractC59962oe.getActivity(), userSession);
                return;
            }
            if (c8jt.A1t == C5JK.A06) {
                FragmentActivity fragmentActivity = c8jt.A15;
                fragmentActivity.setResult(0);
                fragmentActivity.finish();
            } else if (z) {
                A1A(c8jt, "discard_video_clicked");
                C188798Xv c188798Xv = c8jt.A0B;
                if (c188798Xv != null && (A00 = c188798Xv.A00()) != null) {
                    A00.A0N(false);
                }
            }
        }
    }

    public static final void A1A(C8JT c8jt, String str) {
        C8YY A00;
        C193718hr c193718hr;
        C188798Xv c188798Xv = c8jt.A0B;
        if (c188798Xv != null && (A00 = c188798Xv.A00()) != null && (c193718hr = (C193718hr) A00.A0k.getValue()) != null) {
            c193718hr.A00(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0477, code lost:
    
        if (r7 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0491, code lost:
    
        if (X.C36A.A08(r10.A01) != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04c7, code lost:
    
        if (X.C14360o3.A0K(r12, false) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x058f, code lost:
    
        if (r9 != null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05aa, code lost:
    
        if (r13 != null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05a4, code lost:
    
        if (r13 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x05c1, code lost:
    
        if (r5 != null) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A1D(final X.C8JT r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A1D(X.8JT, boolean):void");
    }

    public static final void A1E(C8JT c8jt, boolean z) {
        AbstractC115485Ki abstractC115485Ki;
        C18160v1 A05;
        Number number;
        Number number2;
        C18160v1 A01;
        C1828989k c1828989k = c8jt.A1x;
        if (c1828989k.A01() == EnumC189548aZ.A06) {
            View view = c8jt.A12;
            view.setVisibility(0);
            AbstractC185998Mt.A00(view);
            if (c8jt.A0J.A01.size() == 0) {
                File file = c1828989k.A01;
                if (file != null && (A01 = AbstractC14620oa.A01(AbstractC209669Pc.A02(file), 0)) != null) {
                    number = (Number) AbstractC001800i.A0O(A01.A02, 0);
                    number2 = (Number) AbstractC001800i.A0O(A01.A02, 1);
                } else {
                    view.setBackgroundColor(c8jt.A11.getColor(R.color.clips_remix_camera_outer_container_default_background));
                    return;
                }
            } else {
                if ((c8jt.A0J.A01.size() != 1 && (!c8jt.CLf() || !z)) || (abstractC115485Ki = (AbstractC115485Ki) c8jt.A0J.A04(0)) == null || (A05 = abstractC115485Ki.A05()) == null) {
                    return;
                }
                number = (Number) AbstractC001800i.A0O(A05.A02, 0);
                number2 = (Number) AbstractC001800i.A0O(A05.A02, 1);
                if (A05.A02.size() <= 1) {
                    return;
                }
            }
            if (number != null && number2 != null) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{number.intValue(), number2.intValue()}));
            }
        }
    }

    public static final void A1F(C8JT c8jt, boolean z, boolean z2, boolean z3) {
        AnonymousClass860 anonymousClass860;
        AbstractC193598he abstractC193598he;
        AudioOverlayTrack audioOverlayTrack;
        DownloadedTrack downloadedTrack;
        if (c8jt.A0E != null) {
            C14360o3.A0B(c8jt.A0J, 0);
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 0);
            c8jt.A0J = new C84B(c16930sl, false);
            ShutterButton shutterButton = c8jt.A22;
            C131485wf c131485wf = shutterButton.A0h;
            c131485wf.A0B.clear();
            c131485wf.A04 = 0;
            c131485wf.A03 = 0;
            shutterButton.invalidate();
            ClipsCreationViewModel clipsCreationViewModel = c8jt.A1n;
            C183558Ce c183558Ce = clipsCreationViewModel.A02;
            if (c183558Ce != null) {
                c183558Ce.A00.A0G.A04.A00();
            }
            clipsCreationViewModel.A0O();
            clipsCreationViewModel.A0I.A0B(null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : c8jt.A0V) {
                if (!(obj instanceof C221009pO)) {
                    arrayList.add(obj);
                }
            }
            c8jt.A0V = arrayList;
            if (!z2) {
                C87D c87d = c8jt.A2Q;
                ClipsAudioStore clipsAudioStore = c87d.A02.A0K;
                clipsAudioStore.A0C.clear();
                clipsAudioStore.A0S.Egh(c16930sl);
                ClipsAudioStore clipsAudioStore2 = c87d.A01;
                clipsAudioStore2.A06(1.0f);
                clipsAudioStore2.A0U.Egh(Float.valueOf(C17s.A02(1.0f, 0.0f, 1.0f)));
                clipsAudioStore2.A0H.Egh(Float.valueOf(C17s.A02(1.0f, 0.0f, 1.0f)));
                clipsAudioStore2.A0Q.Egh(Float.valueOf(C17s.A02(1.0f, 0.0f, 1.0f)));
            }
            c8jt.A0Z = false;
            c8jt.A0m = false;
            if (!z) {
                ClipsAudioStore clipsAudioStore3 = clipsCreationViewModel.A0K;
                C84K c84k = clipsAudioStore3.A0A;
                Map map = c84k.A02;
                map.clear();
                C84K.A00(c84k, map);
                clipsAudioStore3.A0T.Egh(null);
                clipsAudioStore3.A0L.Egh(null);
                clipsAudioStore3.A0K.Egh(null);
                clipsAudioStore3.A09.A02.Egh(c16930sl);
                C1810981l c1810981l = c8jt.A1F;
                c1810981l.A0O(C81W.A0t, AbstractC171697kz.A01().indexOf(EnumC1828489f.A09));
                if (z2) {
                    C185488Kq c185488Kq = c8jt.A1X;
                    AudioOverlayTrack audioOverlayTrack2 = c185488Kq.A03;
                    if (audioOverlayTrack2 != null && (downloadedTrack = audioOverlayTrack2.A06) != null) {
                        C185488Kq.A02(c185488Kq, downloadedTrack.A00(audioOverlayTrack2.A03));
                    }
                    List list = (List) clipsAudioStore3.A0V.getValue();
                    if (list != null && (abstractC193598he = (AbstractC193598he) AbstractC001800i.A0J(list)) != null && (audioOverlayTrack = (AudioOverlayTrack) abstractC193598he.A01) != null) {
                        int i = audioOverlayTrack.A03;
                        int i2 = audioOverlayTrack.A02;
                        String str = audioOverlayTrack.A0B;
                        String str2 = audioOverlayTrack.A0A;
                        String str3 = audioOverlayTrack.A0E;
                        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
                        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                        DownloadedTrack downloadedTrack2 = audioOverlayTrack.A06;
                        AudioOverlayTrack audioOverlayTrack3 = new AudioOverlayTrack(audioOverlayTrack.A05, downloadedTrack2, audioOverlayTrack.A07, musicAssetModel, musicBrowseCategory, str, str2, str3, audioOverlayTrack.A0C, audioOverlayTrack.A00, i, i2, 0, 0);
                        if (audioOverlayTrack3.A06 != null) {
                            c8jt.A1I(null, false);
                            c8jt.A1I(audioOverlayTrack3, false);
                            c185488Kq.A05(c8jt.A1m.A00(), audioOverlayTrack3);
                        }
                    }
                } else if (!c8jt.A1P.A42) {
                    c8jt.A1J(false);
                }
                C81W c81w = C81W.A0G;
                if (false != c1810981l.A0W(c81w)) {
                    c1810981l.A0M(c81w);
                }
                if (!z3 && (anonymousClass860 = c8jt.A2K) != null && anonymousClass860.A0H.Bv5()) {
                    c8jt.A1A.A01(C85B.A03);
                }
            }
            A1b(c8jt);
            c8jt.A0e = false;
            A0q(c8jt);
            A0N(C81W.A09, c8jt, false);
            c8jt.A1d.A00();
            c8jt.A0D();
            A1B(c8jt, true);
            A0W(c8jt);
            A0a(c8jt);
            C50641MXd c50641MXd = c8jt.A0t;
            if (c50641MXd != null) {
                c50641MXd.A04();
            }
            A0m(c8jt);
            C9RL A00 = C9OT.A00(c8jt.A1D);
            if (!A00.A00) {
                A00.A01.clear();
            }
            c8jt.A0j = false;
            if (!c8jt.A0g) {
                if (c8jt.CWT() || c8jt.A1P.A2A != null) {
                    c8jt.A1s.A0C();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A1G(X.C115475Kh r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A1G(X.5Kh):void");
    }

    private final void A1I(AudioOverlayTrack audioOverlayTrack, boolean z) {
        this.A0N = audioOverlayTrack;
        this.A0y = z;
        AbstractC193598he abstractC193598he = C193588hd.A00;
        if (audioOverlayTrack != null) {
            if (audioOverlayTrack.A06 != null) {
                abstractC193598he = new C8ZT(audioOverlayTrack);
            } else {
                abstractC193598he = new C187398Sh(audioOverlayTrack);
            }
        }
        ClipsCreationViewModel clipsCreationViewModel = this.A1n;
        ClipsCreationViewModel.A01(abstractC193598he, clipsCreationViewModel);
        clipsCreationViewModel.A0b(abstractC193598he, false);
        if (audioOverlayTrack != null) {
            new C190068bP(this.A1B, this.A1D).A01(this, audioOverlayTrack);
        } else {
            C1815383g c1815383g = this.A1C;
            c1815383g.A00 = null;
            C1815383g.A00(c1815383g, null);
        }
    }

    private final void A1J(boolean z) {
        if (this.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null", null);
            return;
        }
        this.A1l.A05(null, "reset", z);
        A1I(null, false);
        C185488Kq c185488Kq = this.A1X;
        c185488Kq.A03 = null;
        c185488Kq.A02 = EnumC1828489f.A09;
        c185488Kq.A00 = Integer.MIN_VALUE;
        this.A1d.A00();
        C8KO c8ko = this.A0P;
        if (c8ko == null) {
            C14360o3.A0F("trackDownloader");
            throw C00O.createAndThrow();
        }
        c8ko.A00 = false;
        A0T(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (A1R(r3) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A1K(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A10
            if (r0 != 0) goto L11
            boolean r0 = r3.A1L()
            if (r0 == 0) goto L11
            boolean r0 = A1R(r3)
            r2 = 1
            if (r0 != 0) goto L12
        L11:
            r2 = 0
        L12:
            X.9Ky r0 = r3.A0E
            if (r0 != 0) goto L1f
            java.lang.String r2 = "ClipsCaptureControllerImpl"
            java.lang.String r1 = "view holder should not be null"
            r0 = 0
            X.AbstractC12120kG.A07(r2, r1, r0)
            return
        L1f:
            android.widget.ImageButton r0 = r0.A03
            android.view.View[] r1 = new android.view.View[]{r0}
            if (r2 == 0) goto L2c
            r0 = 0
            X.AbstractC125325le.A04(r0, r1, r4)
            return
        L2c:
            X.AbstractC125325le.A05(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A1K(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.A02 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A1L() {
        /*
            r6 = this;
            X.MXd r0 = r6.A0t
            r5 = 0
            r4 = 1
            if (r0 == 0) goto Lb
            android.os.CountDownTimer r0 = r0.A02
            r3 = 1
            if (r0 != 0) goto Lc
        Lb:
            r3 = 0
        Lc:
            X.8KA r0 = r6.A0G
            X.8K9 r2 = r0.A01
            X.8K9 r0 = X.C8K9.A04
            r1 = 0
            if (r2 != r0) goto L16
            r1 = 1
        L16:
            boolean r0 = r6.A0l
            if (r0 == 0) goto L3f
            boolean r0 = r6.A0i
            if (r0 != 0) goto L3f
            if (r3 != 0) goto L3f
            boolean r0 = r6.CZY()
            if (r0 != 0) goto L3f
            if (r1 != 0) goto L3f
            boolean r0 = r6.A0k
            if (r0 != 0) goto L3f
            X.825 r0 = r6.A1v
            X.2GS r0 = r0.A04
            java.lang.Object r1 = r0.A02()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L3f
            r5 = 1
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A1L():boolean");
    }

    private final boolean A1M() {
        int size = this.A0J.A01.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) this.A0J.A04(i2);
            if (abstractC115485Ki instanceof C115475Kh) {
                if (((C115475Kh) abstractC115485Ki).A0G.A08 == 0) {
                    i++;
                }
                if (i * 2 >= this.A0J.A01.size()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A1N() {
        C171757l5 c171757l5;
        Ah1 ah1;
        AbstractC172157lk abstractC172157lk = this.A1L.A02.A01.A06;
        EnumC171747l4 enumC171747l4 = null;
        if (abstractC172157lk instanceof C171757l5) {
            c171757l5 = (C171757l5) abstractC172157lk;
        } else {
            c171757l5 = null;
        }
        C1829289n c1829289n = this.A1i;
        if (c1829289n != null && (ah1 = (Ah1) c1829289n.A00.A00()) != null && ah1.A03()) {
            if (c171757l5 != null) {
                enumC171747l4 = c171757l5.A00;
            }
            if (enumC171747l4 == EnumC171747l4.A04) {
                return true;
            }
        }
        return false;
    }

    private final boolean A1O() {
        MusicAssetModel musicAssetModel;
        AudioOverlayTrack audioOverlayTrack = this.A0N;
        if (audioOverlayTrack == null || (musicAssetModel = audioOverlayTrack.A08) == null) {
            return false;
        }
        int i = musicAssetModel.A00 - audioOverlayTrack.A03;
        if (i > 90000) {
            i = 90000;
        }
        if (i <= audioOverlayTrack.A02) {
            return false;
        }
        audioOverlayTrack.A02 = i;
        return true;
    }

    private final boolean A1P(int i) {
        Integer num;
        AnonymousClass826 anonymousClass826 = this.A0I;
        if (anonymousClass826 != null) {
            num = Integer.valueOf(anonymousClass826.A01);
        } else {
            num = null;
        }
        if (this.A1k.A03.A04 != null && anonymousClass826 != null) {
            int i2 = anonymousClass826.A01;
            if (Integer.valueOf(i2) != null && i > i2 && num != null && num.intValue() < AnonymousClass827.A00(this.A1D).A01) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A1S(C8JT c8jt) {
        Ah1 ah1;
        C1816283r c1816283r;
        C1829289n c1829289n = c8jt.A1i;
        if (c1829289n != null && (ah1 = (Ah1) c1829289n.A00.A00()) != null && (c1816283r = ah1.A09.A08.A00) != null && c1816283r.A04.A5c()) {
            return true;
        }
        return false;
    }

    public static final boolean A1T(C8JT c8jt) {
        C8YY A00;
        C194648jP c194648jP;
        C188798Xv c188798Xv = c8jt.A0B;
        if (c188798Xv == null || (A00 = c188798Xv.A00()) == null || (c194648jP = A00.A01) == null || c194648jP.A00 == 0.0f) {
            return false;
        }
        return true;
    }

    public static final boolean A1U(C8JT c8jt) {
        C1829289n c1829289n = c8jt.A1i;
        if (c1829289n != null && c1829289n.A00.A00() != null) {
            return true;
        }
        return false;
    }

    public static final boolean A1X(C8JT c8jt) {
        Object obj = ((C1809981b) c8jt.A1W).A02.A00.second;
        C14360o3.A07(obj);
        if (obj instanceof C188478Wm) {
            return ((C188478Wm) obj).A01 instanceof C180397zT;
        }
        return false;
    }

    public static final boolean A1Y(C8JT c8jt) {
        if (c8jt.A02 == -1 && c8jt.A03 == -1 && !c8jt.A1F.A0W(C81W.A0J)) {
            return false;
        }
        return true;
    }

    public static final boolean A1Z(C8JT c8jt) {
        return c8jt.A1F.A0W(C81W.A0z);
    }

    public static final boolean A1a(C8JT c8jt) {
        if (c8jt.A1x.A03() && c8jt.A0J.A01.size() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean A1c(C8JT c8jt) {
        String str;
        String str2;
        String str3;
        String str4 = c8jt.A0R;
        if (str4 != null) {
            if ((AbstractC002300n.A0h(str4, "highlight:", false) || (((str = c8jt.A0R) != null && AbstractC002300n.A0h(str, "smartReel:", false)) || (((str2 = c8jt.A0R) != null && AbstractC002300n.A0h(str2, MSV.A00(1231), false)) || ((str3 = c8jt.A0R) != null && AbstractC002300n.A0h(str3, "smart_reel:", false))))) && c8jt.A0U == null && c8jt.A16 != C22P.A1T) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A1f() {
        C8KO c8ko = this.A0P;
        if (c8ko == null) {
            C14360o3.A0F("trackDownloader");
            throw C00O.createAndThrow();
        }
        if (!c8ko.A00) {
            if (this.A1x.A06.A02() != EnumC1829089l.A02 || this.A1k.A03.A04 != null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean A1g() {
        Object obj = ((C1809981b) this.A1W).A02.A00.second;
        C14360o3.A07(obj);
        if (obj instanceof C188478Wm) {
            return ((C188478Wm) obj).A01 instanceof C176497t7;
        }
        return false;
    }

    public final boolean A1h() {
        C8A8 c8a8;
        Object obj = ((C1809981b) this.A1W).A02.A00.second;
        C14360o3.A07(obj);
        if ((obj instanceof C188478Wm) && (c8a8 = (C8A8) this.A1s.A0C.A02()) != null && c8a8.A01 != null && this.A0c) {
            return ((C188478Wm) obj).A01 instanceof C191018cx;
        }
        return false;
    }

    @Override // X.C8JU
    public final List AIL() {
        boolean z;
        List list;
        C50627MWo c50627MWo = this.A08;
        boolean z2 = this.A0o;
        String name = this.A16.name();
        C128175qm A09 = this.A1s.A09(AoU());
        boolean A06 = C18U.A06(C06090Tz.A05, this.A1D, 36325643683640552L);
        C14360o3.A0B(name, 2);
        if (!A06 ? c50627MWo == null || z2 || !"CLIPS_DIRECT_SHARED_ALBUM_CREATE_REEL_BUTTON".equals(name) : z2 || "CLIPS_DIRECT_STACK_TO_CLIPS_CREATE_BUTTON".equals(name)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (A09 != null && (list = A09.A0n) != null && !list.isEmpty()) {
                return list;
            }
            if (c50627MWo != null) {
                return (List) c50627MWo.A00;
            }
        }
        return null;
    }

    @Override // X.C8JU
    public final String ASy() {
        if (this.A08 != null) {
            String name = this.A16.name();
            if ("CLIPS_DIRECT_SHARED_ALBUM_CREATE_REEL_BUTTON".equals(name)) {
                return name;
            }
        }
        return null;
    }

    @Override // X.C8JU
    public final EnumC223419tY Aju() {
        Object obj = ((C1809981b) this.A1W).A02.A00.second;
        C14360o3.A07(obj);
        if (this.A1k.A03.A04 != null) {
            return EnumC223419tY.TEMPLATE_BROWSER;
        }
        if (obj instanceof C188478Wm) {
            InterfaceC191028cy interfaceC191028cy = ((C188478Wm) obj).A01;
            if (interfaceC191028cy instanceof C176497t7) {
                return EnumC223419tY.ADD_CLIPS_STACKED_TIMELINE;
            }
            if (!(interfaceC191028cy instanceof C211909aH) && !(interfaceC191028cy instanceof C180397zT)) {
                if (interfaceC191028cy == C191018cx.A00) {
                    if (this.A0Z) {
                        return EnumC223419tY.BACK_BUTTON_POSTCAP;
                    }
                } else {
                    return EnumC223419tY.UNKNOWN;
                }
            } else {
                return EnumC223419tY.ADD_CLIPS_POSTCAP;
            }
        } else if (!(obj instanceof C8XK)) {
            return null;
        }
        return EnumC223419tY.OPEN_CAMERA;
    }

    @Override // X.C8JU
    public final String AoU() {
        AbstractC193598he abstractC193598he;
        C128175qm c128175qm;
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A1s;
        C5JK c5jk = this.A1t;
        String str = (String) clipsCreationDraftViewModel.A07.A02();
        if (str == null) {
            C2GS c2gs = clipsCreationDraftViewModel.A0G.A02;
            AbstractC193598he abstractC193598he2 = (AbstractC193598he) c2gs.A02();
            if (abstractC193598he2 == null || abstractC193598he2.A00 != 3 || (abstractC193598he = (AbstractC193598he) c2gs.A02()) == null || (c128175qm = (C128175qm) abstractC193598he.A00()) == null || (str = c128175qm.A0T) == null) {
                return ClipsCreationDraftViewModel.A08(clipsCreationDraftViewModel, c5jk, null);
            }
        }
        return str;
    }

    @Override // X.C8JU
    public final C8KA Aus() {
        return this.A0G;
    }

    @Override // X.AnonymousClass844
    public final String BVY() {
        return this.A1y.BVY();
    }

    @Override // X.C8JU
    public final AudioOverlayTrack Bsq() {
        return this.A0N;
    }

    @Override // X.C8JU
    public final boolean CLM() {
        if (this.A1l.A02().A03.size() > 1) {
            return true;
        }
        return false;
    }

    @Override // X.C8JU
    public final boolean CLf() {
        if (this.A1k.A03.A04 != null) {
            C84B c84b = (C84B) this.A2P.A00.A02();
            if (c84b != null) {
                Iterator it = c84b.A05().iterator();
                boolean z = true;
                while (it.hasNext()) {
                    AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) it.next();
                    if (!(abstractC115485Ki instanceof C115475Kh) || !((C115475Kh) abstractC115485Ki).A0P) {
                        z = false;
                    }
                }
                if (!c84b.A01.isEmpty() && !z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return !this.A0J.A01.isEmpty();
    }

    @Override // X.C8JU
    public final boolean CUs() {
        C115475Kh c115475Kh;
        C115525Km c115525Km;
        InterfaceC115495Kj A04 = this.A0J.A04(0);
        if (A04 instanceof C115475Kh) {
            c115475Kh = (C115475Kh) A04;
        } else {
            c115475Kh = null;
        }
        if (this.A0J.A01.isEmpty() || c115475Kh == null || (c115525Km = c115475Kh.A0G) == null || c115525Km.A08 != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C8JU, X.C8G1
    public final int CW4() {
        C8KA c8ka = this.A0G;
        if (c8ka.A01 == C8K9.A03 && c8ka.A00 != C8K8.A02 && this.A00 == -1 && this.A0T == null) {
            return 1;
        }
        return 2;
    }

    @Override // X.C8JU
    public final boolean CWT() {
        if (this.A1k.A03.A04 == null) {
            return false;
        }
        return true;
    }

    @Override // X.C8JU
    public final boolean CZY() {
        C50649MXo c50649MXo = this.A0u;
        if (c50649MXo != null && c50649MXo.A00) {
            return true;
        }
        return false;
    }

    @Override // X.C8JU
    public final boolean CZa() {
        return this.A0h;
    }

    @Override // X.C8JU
    public final boolean CcA() {
        C50643MXf c50643MXf = this.A0F;
        if (c50643MXf != null && c50643MXf.A0H) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        A1e(X.C05F.A00, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c7, code lost:
    
        if (r3 != (r0.A02 - r0.A03)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        if (r1 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0103, code lost:
    
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    @Override // X.C8JU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Coj(java.lang.Runnable r9) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.Coj(java.lang.Runnable):void");
    }

    @Override // X.C8JV
    public final void CuA(ARAudioEffectData aRAudioEffectData) {
        DownloadedTrack downloadedTrack;
        AudioOverlayTrack audioOverlayTrack = this.A0N;
        Integer num = null;
        if (audioOverlayTrack != null) {
            downloadedTrack = audioOverlayTrack.A06;
        } else {
            downloadedTrack = null;
        }
        C1815383g c1815383g = this.A1C;
        if (downloadedTrack != null) {
            num = Integer.valueOf(downloadedTrack.A01);
        }
        c1815383g.A00 = aRAudioEffectData;
        C1815383g.A00(c1815383g, num);
    }

    @Override // X.C8JU
    public final void D1Z() {
        Integer A00;
        C50649MXo c50649MXo = this.A0u;
        if (c50649MXo != null && (A00 = MXX.A00(c50649MXo.A04)) != null) {
            C50649MXo.A01(c50649MXo, A00);
        }
        this.A0Y = true;
    }

    @Override // X.C8JU
    public final void DDq() {
        this.A2V.A0v(this.A2U);
    }

    @Override // X.C8JU
    public final void DEt() {
        C86Q c86q = this.A1d;
        FrameLayout frameLayout = c86q.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c86q.A00);
            }
            c86q.A00 = null;
            A0m(this);
        }
        A1C(this, true);
        A0m(this);
        this.A2V.A0w(this.A2U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (A1Z(r8) != false) goto L18;
     */
    @Override // X.C8JU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DF1(int r9) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.DF1(int):void");
    }

    @Override // X.C8JU
    public final void DHi(C4PX c4px) {
        this.A0r = c4px;
        A0l(this);
        C50641MXd c50641MXd = this.A0t;
        if (c50641MXd != null) {
            c50641MXd.A03 = c4px;
            c50641MXd.A03();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.7l5, java.lang.Object, X.7lk] */
    @Override // X.C8JU
    public final void DIe() {
        C1829289n c1829289n = this.A1i;
        if (c1829289n != null) {
            C82K c82k = c1829289n.A00;
            if (c82k.A00() != null) {
                boolean A1N = A1N();
                ((Ah1) c82k.A00()).A02(A1N);
                if (A1N) {
                    Ah1 ah1 = (Ah1) c82k.A00();
                    EnumC171747l4 enumC171747l4 = EnumC171747l4.A04;
                    ?? obj = new Object();
                    obj.A00 = enumC171747l4;
                    ah1.A01(obj);
                }
            }
        }
    }

    @Override // X.C8JU
    public final boolean DIp() {
        C8KC c198888qo;
        InterfaceC09390do interfaceC09390do = this.A27;
        if (((C89P) interfaceC09390do.getValue()).A0L() && ((C89P) interfaceC09390do.getValue()).A0K()) {
            c198888qo = C218569lS.A00;
        } else if (A1g() && !A1M()) {
            c198888qo = new C198898qp(true);
        } else if (A05(this) != null && !A1M()) {
            c198888qo = C9PB.A00;
        } else if (A1X(this)) {
            c198888qo = new C198888qo(true);
        } else {
            return false;
        }
        A0P(c198888qo, this);
        return true;
    }

    @Override // X.C8JU
    public final void DIs() {
        C8KC c198888qo;
        InterfaceC09390do interfaceC09390do = this.A27;
        if (((C89P) interfaceC09390do.getValue()).A0L() && ((C89P) interfaceC09390do.getValue()).A0K()) {
            c198888qo = C218569lS.A00;
        } else if (A1g() && !A1M()) {
            c198888qo = new C198898qp(false);
        } else if (A05(this) != null && !A1M()) {
            c198888qo = C9PB.A00;
        } else if (!A1X(this)) {
            return;
        } else {
            c198888qo = new C198888qo(false);
        }
        A0P(c198888qo, this);
    }

    @Override // X.C8JU
    public final void DIt() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(MSV.A00(82), true);
        bundle.putBoolean(MSV.A00(324), true);
        bundle.putBoolean(MSV.A00(718), true);
        UserSession userSession = this.A1D;
        if (C18U.A06(C06090Tz.A06, userSession, 36328139060624610L)) {
            bundle.putBoolean(MSV.A00(950), true);
            bundle.putBoolean(AbstractC111324zv.A00(1549), false);
        }
        bundle.putParcelable(MSV.A00(591), this.A1L.A02.A01.A0j);
        FragmentActivity activity = this.A1B.getActivity();
        if (activity != null && !activity.isFinishing()) {
            C6XJ c6xj = new C6XJ(activity, bundle, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(2063));
            c6xj.A08();
            c6xj.A0C(this.A11);
        }
    }

    @Override // X.C8JU
    public final void DIv() {
        C31349DqE c31349DqE = this.A0M;
        if (c31349DqE != null) {
            C41451vu.A01.E4s(new C3KF(c31349DqE));
            this.A0M = null;
        }
    }

    @Override // X.C8JU
    public final void DIx() {
        C31349DqE c31349DqE = this.A0M;
        if (c31349DqE != null) {
            C41451vu.A01.E4s(new C3KF(c31349DqE));
            this.A0M = null;
        }
        A0w(this, (InterfaceC185138Je) this.A1j.A04.getValue());
    }

    @Override // X.C8BK
    public final void DUX(boolean z) {
        this.A1V.A00().setEnabled(!z);
        this.A0k = z;
        C208649Ky c208649Ky = this.A0E;
        if (c208649Ky != null) {
            View[] viewArr = {c208649Ky.A00};
            if (z) {
                AbstractC125325le.A05(viewArr, true);
            } else {
                AbstractC125325le.A04(null, viewArr, true);
            }
        }
        if (!this.A1q.A0B) {
            A1B(this, false);
        }
        A0m(this);
    }

    @Override // X.C8JU
    public final void Del() {
        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = this.A1w;
        if (viewOnTouchListenerC1829389o != null) {
            Object value = viewOnTouchListenerC1829389o.A0T.getValue();
            C14360o3.A07(value);
            if (((Boolean) value).booleanValue()) {
                viewOnTouchListenerC1829389o.A08((EnumC1829089l) this.A1x.A06.A02());
            }
        }
    }

    @Override // X.C8JU
    public final void DoH() {
        C8IW c8iw;
        if (this.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null if on CLIPS format", null);
            return;
        }
        if (A1Z(this) && (c8iw = this.A0C) != null) {
            C211709Ze c211709Ze = C211709Ze.A03;
            C14360o3.A0B(c211709Ze, 0);
            c8iw.A03.A0A(c211709Ze);
            c8iw.A01(true);
        }
        this.A0i = true;
        this.A00 = -1;
        AudioOverlayTrack audioOverlayTrack = this.A0N;
        if (audioOverlayTrack != null && audioOverlayTrack.A01 == 0) {
            C185488Kq c185488Kq = this.A1X;
            C8JT c8jt = c185488Kq.A08.A00;
            if (c8jt.A02 == -1 && !c8jt.A1F.A0W(C81W.A0J)) {
                if (c185488Kq.A03 != null || c185488Kq.A04) {
                    C24U c24u = AnonymousClass229.A01(c185488Kq.A07).A03;
                    boolean z = false;
                    if (c185488Kq.A03 != null) {
                        z = true;
                    }
                    c24u.A0H(z, c185488Kq.A04);
                }
                AudioOverlayTrack audioOverlayTrack2 = c185488Kq.A03;
                if (audioOverlayTrack2 != null) {
                    OriginalAudioSubtype originalAudioSubtype = null;
                    if (c185488Kq.A00 < 0) {
                        C24U c24u2 = AnonymousClass229.A01(c185488Kq.A07).A03;
                        c24u2.A04 = c24u2.A0E.A07("player not at the expected position", "", 17645025, c24u2.A04);
                        AbstractC12120kG.A07("BackingTrackPlayerController", "player not at the expected position", null);
                    } else {
                        MusicAssetModel musicAssetModel = audioOverlayTrack2.A08;
                        if (musicAssetModel != null) {
                            originalAudioSubtype = musicAssetModel.A01;
                        }
                        if (originalAudioSubtype != OriginalAudioSubtype.A06 && AbstractC185298Jv.A00(c185488Kq.A07)) {
                            C190338br A01 = C185488Kq.A01(c185488Kq);
                            if (!A01.A00) {
                                A01.A05.EYb(true);
                            } else {
                                throw new IllegalStateException("Check failed.");
                            }
                        }
                        C190338br A012 = C185488Kq.A01(c185488Kq);
                        C677933t c677933t = A012.A03;
                        c677933t.A06(false);
                        if (!A012.A00) {
                            A012.A04.A00();
                            C208589Ks c208589Ks = A012.A02;
                            c208589Ks.A01 = true;
                            c208589Ks.A03.clear();
                            C1815383g c1815383g = c208589Ks.A00;
                            if (c1815383g != null) {
                                c1815383g.A05(c208589Ks);
                            }
                            A012.A05.start();
                            c677933t.A01();
                            c185488Kq.A00 = Integer.MIN_VALUE;
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
        }
        A1B(this, true);
        A0m(this);
        A0W(this);
        this.A2W.A02.sendMessage(Message.obtain());
    }

    @Override // X.C8JU
    public final void Dys() {
        boolean z = false;
        if (this.A00 != -1) {
            z = true;
        }
        if (!z) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "bad onVideoCapturedFromCameraDropped() call", null);
        } else {
            A0F();
        }
    }

    @Override // X.C8JU
    public final void Dzg() {
        String str;
        if (!this.A0l) {
            str = "got onVideoRecordingError() call when not showing";
        } else if (this.A0E == null) {
            str = "view holder should not be null if on CLIPS format";
        } else if (this.A00 != -1) {
            A0F();
            return;
        } else {
            A0a(this);
            return;
        }
        AbstractC12120kG.A07("ClipsCaptureControllerImpl", str, null);
    }

    @Override // X.C8JU
    public final void Dzi(float f) {
        if (this.A0E == null) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "view holder should not be null if on CLIPS format", null);
        }
    }

    @Override // X.C8JU
    public final List E42() {
        boolean z;
        List list;
        C50627MWo c50627MWo = this.A08;
        boolean z2 = this.A0o;
        String name = this.A16.name();
        C128175qm A09 = this.A1s.A09(AoU());
        boolean A06 = C18U.A06(C06090Tz.A05, this.A1D, 36325643683640552L);
        C14360o3.A0B(name, 2);
        if (!A06 ? c50627MWo == null || z2 || !"CLIPS_DIRECT_SHARED_ALBUM_CREATE_REEL_BUTTON".equals(name) : z2 || "CLIPS_DIRECT_STACK_TO_CLIPS_CREATE_BUTTON".equals(name)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (A09 != null && (list = A09.A0q) != null && !list.isEmpty()) {
                return list;
            }
            if (c50627MWo != null) {
                return (List) c50627MWo.A01;
            }
        }
        return null;
    }

    @Override // X.C8JU
    public final void E60(EnumC76383bi enumC76383bi) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A1s;
        if (ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel) != null) {
            MXY mxy = new MXY();
            mxy.A00 = new MXZ(enumC76383bi);
            C128175qm A00 = ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel);
            if (A00 != null) {
                clipsCreationDraftViewModel.A0G.A0N(mxy.A01(A00));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        clipsCreationDraftViewModel.A01 = enumC76383bi;
    }

    @Override // X.C8JU
    public final void EKT(Bundle bundle) {
        Serializable serializable;
        UserSession userSession = this.A1D;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36322250659670099L) && C18U.A06(c06090Tz, userSession, 36322250659735636L)) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("SAVE_INSTANCE_KEY_LAST_CAMERA_STATE", EnumC1810181d.class);
            } else {
                serializable = bundle.getSerializable("SAVE_INSTANCE_KEY_LAST_CAMERA_STATE");
            }
            if (serializable == EnumC1810181d.A09) {
                Cox(C218639lZ.A00);
            }
        }
    }

    @Override // X.C8JU
    public final void ELn(C199008r1 c199008r1) {
        boolean isEmpty = this.A0K.A01.isEmpty();
        ClipsCreationViewModel clipsCreationViewModel = this.A1n;
        if (isEmpty) {
            clipsCreationViewModel.A0I.A0B(null);
        } else {
            clipsCreationViewModel.A0I.A0B(c199008r1);
        }
    }

    @Override // X.C8JU
    public final void EbC(List list) {
        this.A0V = list;
        A0S(this);
    }

    @Override // X.C8JU
    public final void Edx(boolean z) {
        this.A10 = z;
        if (this.A0E != null) {
            A1K(false);
        }
    }

    @Override // X.C8JU
    public final boolean FDT() {
        return this.A0x;
    }

    @Override // X.C8JU
    public final boolean onBackPressed() {
        Integer num;
        C8KC c8kc;
        C86Q c86q = this.A1d;
        FrameLayout frameLayout = c86q.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c86q.A00);
            }
            c86q.A00 = null;
            A0m(this);
        }
        boolean z = false;
        if (this.A0T != null) {
            z = true;
        }
        if (z) {
            C8A7.A00(this.A1o);
            A0r(this);
            C9GR.A07(this.A11, 2131955535);
            C50643MXf c50643MXf = this.A0F;
            if (c50643MXf != null) {
                c50643MXf.A0H();
            }
            C50643MXf c50643MXf2 = this.A0F;
            if (c50643MXf2 != null) {
                c50643MXf2.A0F();
            }
            this.A2T.A03();
        } else {
            if ((A1g() || A05(this) != null) && !A1Z(this)) {
                C50643MXf c50643MXf3 = this.A0F;
                if (c50643MXf3 != null && c50643MXf3.A0H) {
                    c50643MXf3.onBackPressed();
                    return true;
                }
                A0d(this);
                return true;
            }
            if (A1X(this)) {
                c8kc = new C198888qo(true);
            } else {
                C50643MXf c50643MXf4 = this.A0F;
                if (c50643MXf4 != null && c50643MXf4.onBackPressed()) {
                    return true;
                }
                C8KO c8ko = this.A0P;
                if (c8ko == null) {
                    C14360o3.A0F("trackDownloader");
                    throw C00O.createAndThrow();
                }
                if (!c8ko.A00) {
                    if (this.A00 != -1) {
                        C9GR.A01(this.A11, null, 2131955673, 0);
                        return true;
                    }
                    if (this.A0g && this.A01 == 0 && CLf()) {
                        Cox(C218559lR.A00);
                        return true;
                    }
                    if (CLf() && this.A0J.A01.size() == 1 && this.A0E != null) {
                        if (this.A1x.A03()) {
                            this.A1s.A0A();
                            A1F(this, false, false, false);
                            this.A1B.requireActivity().finish();
                            return true;
                        }
                        num = C05F.A00;
                    } else {
                        if (CLf()) {
                            A1d(this.A0J.A01.size() - 1, true);
                            return true;
                        }
                        UserSession userSession = this.A1D;
                        C1828989k c1828989k = this.A1x;
                        if (c1828989k.A01() == EnumC189548aZ.A06) {
                            File file = c1828989k.A01;
                            if (c1828989k.A06.A02() == EnumC1829089l.A04 && file != null) {
                                this.A1F.A0O(C81W.A0j, 3);
                                A0L(C8IU.A03(file, 3, 0), this, C05F.A0N, false);
                                c8kc = C198318pg.A00;
                            }
                        } else {
                            if (!A1T(this) || !(this.A1F.A08.A00 instanceof C81V) || ((Number) this.A1S.A0F.getValue()).intValue() < 2 || CWT() || !C18U.A06(C06090Tz.A05, userSession, 36321507630130706L)) {
                                return false;
                            }
                            num = C05F.A01;
                        }
                    }
                    A1e(num, null);
                    return true;
                }
            }
            A0P(c8kc, this);
            return true;
        }
        return true;
    }

    @Override // X.C8JU
    public final void onDestroyView() {
        if (this.A1P.A2j != null) {
            C218914p.A06(this.A1a);
        }
        this.A1X.A04();
        C218914p.A06(this.A1Z);
    }

    public static final int A01(C8JT c8jt) {
        if (A1Y(c8jt) && !c8jt.A1F.A0W(C81W.A0J)) {
            int i = c8jt.A02;
            if (i == -1) {
                return c8jt.A03;
            }
            return i;
        }
        return A02(c8jt);
    }

    public static final int A02(C8JT c8jt) {
        return A00(c8jt) - C80G.A01(c8jt.A0J);
    }

    private final C8KC A04() {
        if (A1g()) {
            return new C198898qp(false);
        }
        if (A05(this) != null) {
            return C9PB.A00;
        }
        if (A1X(this)) {
            return new C198888qo(false);
        }
        return new C8KC() { // from class: X.9lW
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (A1W(r3) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r2.A07 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0D() {
        /*
            r3 = this;
            A0U(r3)
            A0X(r3)
            A0S(r3)
            A0Y(r3)
            A0Z(r3)
            X.89k r0 = r3.A1x
            X.8aZ r2 = r0.A01()
            X.8aZ r1 = X.EnumC189548aZ.A06
            r0 = 0
            if (r2 != r1) goto L1b
            r0 = 1
        L1b:
            r2 = 0
            X.81W r1 = X.C81W.A0j
            if (r0 == 0) goto L70
            boolean r0 = A1W(r3)
            A0N(r1, r3, r0)
            X.81W r0 = X.C81W.A0k
        L29:
            A0N(r0, r3, r2)
            X.81W r1 = X.C81W.A0F
            boolean r0 = A1S(r3)
            A0N(r1, r3, r0)
            A0V(r3)
            X.81W r2 = X.C81W.A0J
            X.8HG r0 = r3.A1V
            X.BDo r0 = r0.A00()
            boolean r0 = r0.CbZ()
            if (r0 == 0) goto L4d
            boolean r1 = A1W(r3)
            r0 = 1
            if (r1 == 0) goto L4e
        L4d:
            r0 = 0
        L4e:
            A0N(r2, r3, r0)
            X.83E r2 = r3.A1u
            boolean r0 = A1W(r3)
            r2.A02 = r0
            if (r0 != 0) goto L60
            boolean r0 = r2.A07
            r1 = 1
            if (r0 != 0) goto L61
        L60:
            r1 = 0
        L61:
            r2.A01 = r1
            boolean r0 = r2.A07
            r2.A03 = r0
            if (r1 != 0) goto L6f
            X.81W r1 = X.C81W.A0K
            r0 = 0
            A0N(r1, r3, r0)
        L6f:
            return
        L70:
            A0N(r1, r3, r2)
            X.81W r0 = X.C81W.A0k
            boolean r2 = A1W(r3)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A0D():void");
    }

    public static final void A0O(C8KC c8kc, C8JT c8jt) {
        if (c8jt.A1f()) {
            new A9T(c8jt.A1B, c8jt.A1D, new A78(c8kc, c8jt));
            return;
        }
        if (c8kc instanceof C199348rb) {
            C183348Bh c183348Bh = c8jt.A1h;
            C1QT c1qt = c183348Bh.A0J;
            long j = c183348Bh.A02;
            AHF ahf = new AHF(c1qt);
            ahf.A01 = j;
            ahf.A04("AUDIO_TRACK_DOWNLOAD_FINISH");
        }
        A0P(c8kc, c8jt);
    }

    public static final void A0R(C8JT c8jt) {
        AudioOverlayTrack audioOverlayTrack;
        if (c8jt.A1O() && (audioOverlayTrack = c8jt.A0N) != null) {
            C183348Bh c183348Bh = c8jt.A1h;
            String A0R = AnonymousClass001.A0R(c8jt.A16.name(), "_new_max_duration");
            UserSession userSession = c8jt.A1D;
            c183348Bh.A09(c8jt.A1W.AuH(), A0R, String.valueOf(AnonymousClass229.A01(userSession).A0J()), ((C22F) AnonymousClass229.A01(userSession)).A04.A0L, null, false);
            A12(c8jt, audioOverlayTrack, false);
        }
        AnonymousClass826 anonymousClass826 = c8jt.A0I;
        if (anonymousClass826 != null) {
            c8jt.A1v.A05.A0B(anonymousClass826);
            A0T(c8jt);
            A0U(c8jt);
            A0v(c8jt, A02(c8jt) / 1000);
            c8jt.A22.A0h.A01 = (int) (anonymousClass826.A01 * c8jt.A1m.A00().A00);
        }
    }

    public static final void A0d(C8JT c8jt) {
        C8YY A00;
        C8KC c198898qp;
        if (c8jt.A1M()) {
            AnonymousClass229.A01(c8jt.A1D).A0J.A06(c8jt.A1t, "postcap_cancel_simplified_add_clip_flow", c8jt.A0J.A01.size());
            if (A05(c8jt) != null) {
                c198898qp = C9PB.A00;
            } else {
                c198898qp = new C198898qp(true);
            }
            A0P(c198898qp, c8jt);
            return;
        }
        A1A(c8jt, "handle_cancel_add_clip_flow");
        C188798Xv c188798Xv = c8jt.A0B;
        if (c188798Xv == null || (A00 = c188798Xv.A00()) == null) {
            return;
        }
        A00.A0N(false);
    }

    public static final void A0f(C8JT c8jt) {
        if (!A1Q(c8jt)) {
            AnonymousClass229.A01(c8jt.A1D);
            C8JZ c8jz = c8jt.A2M;
            A1Y(c8jt);
            int A01 = C80G.A01(c8jt.A0J);
            int A012 = A01(c8jt);
            AudioOverlayTrack audioOverlayTrack = c8jt.A0N;
            if (c8jz.A02.mFragmentManager != null) {
                UserSession userSession = c8jz.A03;
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                bundle.putInt(MSV.A00(1531), A01);
                bundle.putInt(MSV.A00(1428), A012);
                bundle.putParcelable("clips_track", audioOverlayTrack);
                N7P n7p = new N7P();
                n7p.setArguments(bundle);
                n7p.A03 = c8jz.A04;
                n7p.A02 = c8jz.A00;
                C189448aO c189448aO = new C189448aO(userSession);
                Context context = c8jz.A01;
                c189448aO.A0d = context.getString(2131955480);
                c189448aO.A0T = n7p;
                c189448aO.A00().A0D(context, n7p);
            }
        }
    }

    public static final void A0m(C8JT c8jt) {
        C8K8 c8k8;
        C8K9 c8k9;
        if (A02(c8jt) <= 100) {
            c8k8 = C8K8.A02;
        } else if (A1R(c8jt)) {
            c8k8 = C8K8.A04;
        } else {
            c8k8 = C8K8.A03;
        }
        if (c8jt.CZY()) {
            c8k9 = C8K9.A06;
        } else {
            C50641MXd c50641MXd = c8jt.A0t;
            if (c50641MXd != null && c50641MXd.A02 != null) {
                c8k9 = C8K9.A05;
            } else if (c8jt.A0i) {
                c8k9 = C8K9.A07;
            } else if (c8jt.A0k) {
                c8k9 = C8K9.A08;
            } else {
                C50643MXf c50643MXf = c8jt.A0F;
                if (c50643MXf == null || !c50643MXf.A0H) {
                    C2GT c2gt = c8jt.A1k.A03.A0H;
                    if (c2gt.A02() != EnumC189158Zj.A03 && c2gt.A02() != EnumC189158Zj.A05) {
                        if (c8jt.A1d.A00 != null) {
                            c8k9 = C8K9.A02;
                        } else {
                            c8k9 = C8K9.A03;
                        }
                    }
                }
                c8k9 = C8K9.A04;
            }
        }
        C8KA c8ka = new C8KA(c8k8, c8k9);
        if (!c8ka.equals(c8jt.A0G)) {
            c8jt.A0G = c8ka;
            C81Z c81z = c8jt.A1Q.A00;
            C8TN c8tn = c81z.A0c;
            if (c8tn != null) {
                int ordinal = c8ka.A01.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3 && ordinal != 4) {
                        if (ordinal == 5) {
                            C8TN.A04(c8tn);
                            c8tn.A0G.A0B(true);
                        }
                    } else {
                        C8TN.A04(c8tn);
                        c8tn.A0K.A00().CMN(false);
                    }
                } else {
                    boolean z = !C8Z8.A00(c8tn.A0A, c8tn.A0H, c8tn.A0O);
                    C8C0 c8c0 = c8tn.A0G;
                    if (z) {
                        c8c0.A0C(true);
                    } else {
                        c8c0.A0B(true);
                    }
                    c8tn.A0K.A00().EkU(false);
                    C8TN.A06(c8tn);
                }
            }
            C1821786b c1821786b = c81z.A0m;
            c1821786b.A07 = c8ka;
            C1821786b.A06(c1821786b);
            C150286pc c150286pc = c81z.A0d.A1h;
            if (c150286pc.A03) {
                C8NW c8nw = (C8NW) c150286pc.get();
                if (c8nw.A05 != C1811181n.A00) {
                    List list = c8nw.A1q;
                    if (list != null && !list.isEmpty()) {
                        if (C18U.A06(C06090Tz.A05, c8nw.A0r, 36317848318318211L)) {
                            return;
                        }
                    }
                    C8K9 c8k92 = c8ka.A01;
                    C8K9 c8k93 = C8K9.A07;
                    C8NW c8nw2 = (C8NW) c150286pc.get();
                    Iterator it = c8nw2.A1p.iterator();
                    if (c8k92 == c8k93) {
                        while (it.hasNext()) {
                            Drawable drawable = (Drawable) it.next();
                            if (!(!AnonymousClass483.A04(c8nw2.A1q)) && !c8nw2.A1v) {
                                c8nw2.A1l.A0g(drawable);
                            } else {
                                c8nw2.A0y.A1X.A00().Eoi();
                                drawable.setVisible(false, false);
                            }
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        Drawable drawable2 = (Drawable) it.next();
                        if (!(!AnonymousClass483.A04(c8nw2.A1q)) && !c8nw2.A1v) {
                            c8nw2.A1l.A0j(drawable2);
                        } else {
                            C183688Ct c183688Ct = c8nw2.A0y;
                            if (((C8NW) c183688Ct.A1h.get()).A1R()) {
                                c183688Ct.A1X.A00().Eo3();
                            }
                            drawable2.setVisible(true, false);
                        }
                    }
                }
            }
        }
    }

    public static final void A11(C8JT c8jt, AudioOverlayTrack audioOverlayTrack, boolean z) {
        c8jt.A1I(audioOverlayTrack, z);
        A0X(c8jt);
        A0T(c8jt);
        if (audioOverlayTrack.A01()) {
            c8jt.A1X.A05(c8jt.A1m.A00(), audioOverlayTrack);
        } else {
            A12(c8jt, audioOverlayTrack, false);
        }
        A0v(c8jt, A02(c8jt) / 1000);
        A0U(c8jt);
    }

    public static final void A18(C8JT c8jt, Runnable runnable) {
        String AoU = c8jt.AoU();
        UserSession userSession = c8jt.A1D;
        AnonymousClass229.A01(userSession).A1E(EnumC203578zI.DIALOG, null, AoU, null, null, null, false);
        AbstractC226999zv.A00(userSession).A01(EnumC222779sI.A06);
        c8jt.A1h.A0Q(true, false);
        C8JY c8jy = c8jt.A2O;
        C1QT c1qt = c8jy.A02;
        c1qt.flowMarkPoint(c8jy.A01, MSV.A00(824));
        c1qt.flowEndSuccess(c8jy.A01);
        c8jy.A01 = 0L;
        AnonymousClass229.A01(userSession);
        A0B(c8jt);
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = c8jt.A1s;
        C207189Ex c207189Ex = new C207189Ex(7, c8jt, runnable);
        C141796aw A00 = AbstractC141776au.A00(clipsCreationDraftViewModel);
        C9DB c9db = new C9DB(clipsCreationDraftViewModel, c207189Ex, null, 0, true);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9db, A00);
        c8jt.A0c = false;
        C14360o3.A0B(c8jt.A0J, 0);
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 0);
        c8jt.A0J = new C84B(c16930sl, false);
        AbstractC226999zv.A00(userSession).A00(c8jt.A1B.requireActivity(), userSession, C05F.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (A1Z(r5) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A1B(X.C8JT r5, boolean r6) {
        /*
            A0o(r5)
            boolean r0 = r5.A1L()
            r4 = 0
            if (r0 == 0) goto L17
            boolean r0 = A1R(r5)
            if (r0 == 0) goto L17
            boolean r0 = A1Z(r5)
            r3 = 1
            if (r0 == 0) goto L18
        L17:
            r3 = 0
        L18:
            X.82v r1 = r5.A1U
            X.832 r0 = r1.A00()
            android.view.View r2 = r0.AoS()
            X.832 r0 = r1.A00()
            android.view.View r1 = r0.AoH()
            if (r2 == 0) goto L42
            if (r1 == 0) goto L42
            if (r3 == 0) goto L5a
            boolean r0 = r5.A1g()
            if (r0 != 0) goto L5a
            boolean r0 = A1a(r5)
            if (r0 == 0) goto L4a
            X.AbstractC208529Km.A00(r2, r4)
        L3f:
            X.AbstractC208529Km.A00(r1, r6)
        L42:
            X.9Ky r0 = r5.A0E
            if (r0 == 0) goto L49
            r5.A1K(r6)
        L49:
            return
        L4a:
            X.5le r0 = X.AbstractC125325le.A01(r2, r4)
            r0.A0G()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            r2.setVisibility(r4)
            goto L3f
        L5a:
            X.AbstractC208529Km.A00(r2, r6)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A1B(X.8JT, boolean):void");
    }

    private final void A1H(C115475Kh c115475Kh) {
        int intValue;
        InterfaceC115495Kj A04;
        Integer A08 = A08();
        if (A08 != null && (A04 = this.A0J.A04((intValue = A08.intValue()))) != null) {
            int i = c115475Kh.A08 - c115475Kh.A09;
            int BsL = A04.BsL();
            if (i > BsL) {
                c115475Kh.A08 = BsL;
            }
            c115475Kh.A0T = true;
            ClipsCreationViewModel clipsCreationViewModel = this.A1n;
            ClipsCreationViewModel.A03(EnumC191648eM.A0c, clipsCreationViewModel, true);
            clipsCreationViewModel.A0O.A01(c115475Kh, intValue);
            return;
        }
        this.A1n.A0d(c115475Kh, null);
    }

    public static final boolean A1Q(C8JT c8jt) {
        boolean z = false;
        if (A02(c8jt) <= 100) {
            z = true;
        }
        if (z) {
            C9GR.A07(c8jt.A11, 2131955753);
            return true;
        }
        if (!c8jt.A0Y) {
            C9GR.A06(c8jt.A11, 2131955359);
            return true;
        }
        c8jt.D1Z();
        return false;
    }

    public static final boolean A1R(C8JT c8jt) {
        if (!c8jt.CLf() && c8jt.A00 == -1 && c8jt.A0T == null) {
            return false;
        }
        return true;
    }

    public static final boolean A1V(C8JT c8jt) {
        if (!c8jt.A1g()) {
            A05(c8jt);
            return false;
        }
        return true;
    }

    public static final boolean A1W(C8JT c8jt) {
        C1816283r c1816283r;
        if (A1U(c8jt) && (c1816283r = c8jt.A1x.A00) != null && c1816283r.A00 == EnumC189548aZ.A06 && !c8jt.CLf()) {
            return true;
        }
        return false;
    }

    public static final boolean A1b(C8JT c8jt) {
        boolean A1Y = A1Y(c8jt);
        c8jt.A02 = -1;
        c8jt.A03 = -1;
        C1810981l c1810981l = c8jt.A1F;
        C81W c81w = C81W.A0y;
        c1810981l.A0P(c81w, C8GX.A02(c81w));
        return A1Y;
    }

    public final void A1d(int i, boolean z) {
        if (!CLf()) {
            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "no recorded clips present during deletion", null);
            return;
        }
        C22C A01 = AnonymousClass229.A01(this.A1D);
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0J;
        long j = i;
        C448124l c448124l = A01.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s(MSV.A00(776));
            A08.A0q(MSV.A00(697));
            C448124l.A00(A08, c448124l);
            C22M c22m = c448124l.A04;
            int i2 = 2;
            if (c22m.A01 != 2) {
                i2 = 1;
            }
            A08.A0V(i2);
            A08.A0Q("capture_format_index", -1L);
            A08.A0M(c448124l.A0I(), "capture_type");
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0c(AnonymousClass249.VIDEO);
            A08.A0m(C22F.A08.getModuleName());
            A08.A0Q("segment_index", Long.valueOf(j));
            A08.A0M(enumC50631MWs, "surface");
            A08.A0a(c448124l.A0J());
            A08.A0R("discovery_session_id", c22m.A0O);
            A08.A0R("search_session_id", c22m.A0P);
            A08.A0O("is_timeline", false);
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
        A0c(this);
        C50643MXf c50643MXf = this.A0F;
        if (c50643MXf != null && c50643MXf.A0H) {
            c50643MXf.A0N.removeCallbacks(c50643MXf.A0g);
            InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
            if (interfaceC58267PsB != null) {
                interfaceC58267PsB.pause();
            }
        }
        this.A0p = false;
        C193328hC c193328hC = new C193328hC(this.A11);
        int i3 = 2131955411;
        if (z) {
            i3 = 2131955417;
        }
        c193328hC.A0A(i3);
        int i4 = 2131955410;
        if (z) {
            i4 = 2131955416;
        }
        c193328hC.A09(i4);
        c193328hC.A0L(new AOI(this, i), 2131960921);
        c193328hC.A0H(null, 2131964718);
        c193328hC.A0g(new DialogInterfaceOnDismissListenerC23176AOp(this));
        Dialog A02 = c193328hC.A02();
        this.A04 = A02;
        if (A02 == null) {
            return;
        }
        C0fJ.A00(A02);
    }

    @Override // X.C8JU
    public final String AoV() {
        return AoU();
    }

    @Override // X.C8JU
    public final boolean CWP() {
        if (A1g()) {
            if (this.A0q >= 1 || this.A0G.A01 != C8K9.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C8G1
    public final boolean CdL() {
        boolean z = false;
        if (A02(this) <= 100) {
            z = true;
        }
        return !z;
    }

    @Override // X.C8G1
    public final boolean Ce7() {
        if (!A1f() && this.A0Y) {
            return true;
        }
        return false;
    }

    @Override // X.C8JU
    public final void Cox(C8KC c8kc) {
        if (CLf()) {
            if (this.A1x.A06.A02() == EnumC1829089l.A02 && !CWT()) {
                return;
            }
            A0P(c8kc, this);
        }
    }

    @Override // X.C8G1
    public final boolean DIr() {
        boolean z = false;
        if (A02(this) <= 100) {
            z = true;
        }
        if (!z && this.A0Y) {
            return false;
        }
        A1Q(this);
        return true;
    }

    @Override // X.C8G1
    public final void DmE() {
        A1Q(this);
    }

    @Override // X.C8BK
    public final void Dub(AudioOverlayTrack audioOverlayTrack, boolean z) {
        A1J(z);
        A0v(this, A02(this) / 1000);
        A0X(this);
        A0U(this);
    }

    @Override // X.C8JU
    public final void ESP(C188798Xv c188798Xv) {
        this.A0B = c188798Xv;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0931  */
    /* JADX WARN: Type inference failed for: r2v52, types: [X.A5G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v126, types: [X.8KE] */
    /* JADX WARN: Type inference failed for: r3v127, types: [X.8KF] */
    /* JADX WARN: Type inference failed for: r3v194, types: [X.A5G, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8JT(android.view.View r72, android.view.ViewGroup r73, X.C8JW r74, X.C1825387s r75, X.C1824787m r76, X.AnonymousClass858 r77, X.AbstractC59962oe r78, X.C1815383g r79, final com.instagram.common.session.UserSession r80, X.C57012jc r81, X.C1810981l r82, X.C89F r83, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r84, X.AnonymousClass874 r85, X.C8HI r86, X.C1821786b r87, X.AnonymousClass840 r88, X.C83C r89, X.C184958Ik r90, X.C8GG r91, X.C184418Gf r92, X.C81J r93, X.C8JQ r94, X.C8C0 r95, X.C1820485o r96, X.C1824987o r97, X.AnonymousClass860 r98, X.InterfaceC1818984z r99, X.C1814382v r100, X.C8HG r101, X.InterfaceC1810081c r102, X.C86Q r103, X.C86P r104, X.C1829289n r105, X.C8JS r106, X.C184108Ez r107, X.C5JK r108, X.C83E r109, X.C150286pc r110, X.AnonymousClass825 r111, X.ViewOnTouchListenerC1829389o r112, X.AnonymousClass844 r113, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r114) {
        /*
            Method dump skipped, instructions count: 3083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.<init>(android.view.View, android.view.ViewGroup, X.8JW, X.87s, X.87m, X.858, X.2oe, X.83g, com.instagram.common.session.UserSession, X.2jc, X.81l, X.89F, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.874, X.8HI, X.86b, X.840, X.83C, X.8Ik, X.8GG, X.8Gf, X.81J, X.8JQ, X.8C0, X.85o, X.87o, X.860, X.84z, X.82v, X.8HG, X.81c, X.86Q, X.86P, X.89n, X.8JS, X.8Ez, X.5JK, X.83E, X.6pc, X.825, X.89o, X.844, com.instagram.ui.widget.interactive.InteractiveDrawableContainer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0.A0Q, 36320399530074553L) == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r43 == 270) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0I(com.google.common.collect.ImmutableList r28, com.google.common.collect.ImmutableList r29, com.instagram.common.gallery.metadata.MediaUploadMetadata r30, X.C8JT r31, java.io.File r32, java.lang.Boolean r33, java.lang.Integer r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.util.List r39, int r40, int r41, int r42, int r43, int r44, int r45, boolean r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JT.A0I(com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, com.instagram.common.gallery.metadata.MediaUploadMetadata, X.8JT, java.io.File, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, int, int, int, int, boolean, boolean):void");
    }
}
