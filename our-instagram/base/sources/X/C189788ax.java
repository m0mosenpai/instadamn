package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.8ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189788ax implements InterfaceC189798ay {
    public int A00;
    public A5H A01;
    public AudioOverlayTrack A02;
    public C8GD A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View A09;
    public final ViewGroup A0A;
    public final AbstractC59962oe A0B;
    public final C1815283f A0C;
    public final UserSession A0D;
    public final C8G3 A0E;
    public final C8GB A0F;
    public final C189908b9 A0G;
    public final AnonymousClass844 A0H;
    public final LoadingSpinnerView A0I;
    public final AnonymousClass878 A0J;
    public final boolean A0K;
    public final int A0L;
    public final Drawable A0M;
    public final C1810981l A0N;
    public final C8GA A0O;
    public final C189948bD A0P;
    public final C189838b2 A0Q;
    public final AnonymousClass856 A0R;
    public final C190068bP A0S;
    public final C189878b6 A0T;
    public final MusicAttributionConfig A0U;
    public final MusicOverlayStickerModel A0V;
    public final C8KO A0W;
    public final C189858b4 A0X;
    public final C677733r A0Y;
    public final C8GD A0Z;
    public final Runnable A0a;
    public final ExecutorService A0b;
    public C23987AkM musicPrecaptureSearchController;

    private final C23987AkM A01() {
        C23987AkM c23987AkM = this.musicPrecaptureSearchController;
        if (c23987AkM == null) {
            AbstractC59962oe abstractC59962oe = this.A0B;
            if (abstractC59962oe.isAdded()) {
                View view = this.A09;
                AbstractC10360h2 childFragmentManager = abstractC59962oe.getChildFragmentManager();
                C14360o3.A07(childFragmentManager);
                C23987AkM c23987AkM2 = new C23987AkM(view, childFragmentManager, this.A0D, this, this.A0H, this.A0U, this.A0Y, this.A0L);
                this.musicPrecaptureSearchController = c23987AkM2;
                return c23987AkM2;
            }
            return c23987AkM;
        }
        return c23987AkM;
    }

    private final void A03() {
        this.A03 = null;
        this.A05 = false;
        this.A02 = null;
        this.A0G.A01 = null;
        this.A07.removeCallbacks(this.A0a);
    }

    public static final void A09(C189788ax c189788ax, AudioOverlayTrack audioOverlayTrack) {
        c189788ax.A05 = true;
        C8KO c8ko = c189788ax.A0W;
        C23978AkD c23978AkD = new C23978AkD(c189788ax, audioOverlayTrack);
        C23981AkG c23981AkG = new C23981AkG(c189788ax, audioOverlayTrack);
        C14360o3.A0B(c23978AkD, 1);
        C14360o3.A0B(c23981AkG, 2);
        c8ko.A03(audioOverlayTrack, c23978AkD, c23981AkG, audioOverlayTrack.A02, false, false);
    }

    @Override // X.InterfaceC189798ay
    public final void CuD(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
        this.A06 = false;
        if (cameraAREffect != null && cameraAREffect.A0J()) {
            if (cameraAREffect2 == null || !cameraAREffect2.A0J()) {
                A0D(true);
                return;
            }
        } else if (cameraAREffect2 == null) {
            return;
        }
        if (!cameraAREffect2.A0J() || this.A03 != null) {
            return;
        }
        ImageView imageView = this.A0O.A00;
        if (imageView.getVisibility() == 0) {
            this.A0R.A00().A01(this.A09, imageView, EnumC199188rL.A0l);
        } else {
            this.A06 = true;
        }
    }

    @Override // X.InterfaceC189798ay
    public final void DDx() {
        A0D(true);
    }

    @Override // X.InterfaceC189798ay
    public final void DEt() {
        A0D(false);
    }

    @Override // X.InterfaceC189798ay
    public final void DF0() {
        this.A01 = null;
        this.A0J.pause();
    }

    @Override // X.InterfaceC189808az
    public final void DUk() {
    }

    @Override // X.InterfaceC184638He
    public final String getName() {
        return "MusicPrecaptureController";
    }

    private final void A02() {
        C8GD c8gd = this.A03;
        if (c8gd != null) {
            MusicOverlayStickerModel BVf = c8gd.BVf();
            MusicDataSource A00 = AbstractC23129AMi.A00(BVf);
            AnonymousClass878 anonymousClass878 = this.A0J;
            if (!C14360o3.A0K(A00, anonymousClass878.A05.Avn())) {
                int i = 0;
                anonymousClass878.EZL(AbstractC23129AMi.A00(BVf), false);
                Integer num = BVf.A0O;
                if (num != null) {
                    i = num.intValue();
                }
                anonymousClass878.EZO(i);
            }
            this.A05 = true;
            A0C(C05F.A0C);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A04() {
        BEc bEc;
        AnonymousClass878 anonymousClass878 = this.A0J;
        anonymousClass878.EZO(60000);
        Object obj = this.A0M;
        if ((obj instanceof BEc) && (bEc = (BEc) obj) != null) {
            MusicOverlayStickerModel musicOverlayStickerModel = this.A0V;
            if (musicOverlayStickerModel != null) {
                C23000ABz c23000ABz = new C23000ABz(musicOverlayStickerModel);
                c23000ABz.A0O = 60000;
                bEc.DUc(c23000ABz.A00());
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (C4AJ.A00(this.A0D, null, false, false)) {
            anonymousClass878.EhH(1.0f);
        }
        anonymousClass878.A01 = true;
    }

    public static final void A05(C189788ax c189788ax) {
        C8G5 c8g5;
        Integer num = C05F.A0C;
        AnonymousClass878 anonymousClass878 = c189788ax.A0J;
        boolean z = false;
        if (num == anonymousClass878.CAH()) {
            z = true;
        }
        C8G3 c8g3 = c189788ax.A0E;
        if (z) {
            if (anonymousClass878.A05.isPlaying()) {
                c8g5 = C8G5.A05;
            } else {
                c8g5 = C8G5.A04;
            }
        } else {
            c8g5 = C8G5.A03;
        }
        c8g3.A01.A01(c8g5);
        C138586Po c138586Po = c8g3.A02;
        boolean z2 = false;
        if (c8g5 == C8G5.A04) {
            z2 = true;
        }
        c138586Po.A05 = z2;
        c138586Po.invalidateSelf();
    }

    public static final void A06(C189788ax c189788ax) {
        c189788ax.A0J.release();
        c189788ax.A03();
        c189788ax.A0B(c189788ax.A03);
        c189788ax.A05 = false;
    }

    public static final void A07(C189788ax c189788ax) {
        c189788ax.A0J.pause();
        C23987AkM A01 = c189788ax.A01();
        if (A01 != null) {
            MusicProduct A00 = c189788ax.A00();
            MYM mym = A01.A00;
            if (mym == null) {
                A01.A00(A00);
            } else {
                mym.A06();
                MYM mym2 = A01.A00;
                if (mym2 != null) {
                    mym2.A07(null, C05F.A0C);
                }
            }
        }
        c189788ax.A0C(C05F.A01);
    }

    public static final void A08(C189788ax c189788ax) {
        int i;
        Integer num;
        if (c189788ax.A0J.CAH() != C05F.A00) {
            C8GD c8gd = c189788ax.A03;
            if (c8gd != null && (num = c8gd.BVf().A0K) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C8GD c8gd2 = c189788ax.A03;
            if (c8gd2 != null) {
                C189948bD c189948bD = c189788ax.A0P;
                MusicOverlayStickerModel BVf = c8gd2.BVf();
                C189988bH.A03(MusicAssetModel.A03(BVf), c189948bD.A00, c8gd2.BVp(), Integer.valueOf(i), Integer.valueOf(c8gd2.C0U()), false, true, true, false);
            }
            c189788ax.A0C(C05F.A0N);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.9uw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.9uv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.9uu] */
    public static final void A0A(C189788ax c189788ax, AudioOverlayTrack audioOverlayTrack) {
        if (audioOverlayTrack != null && audioOverlayTrack.A06 != null) {
            C8GD c8gd = c189788ax.A03;
            if (c8gd != null) {
                MusicOverlayStickerModel BVf = c8gd.BVf();
                c189788ax.A0Y.A00();
                DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
                if (downloadedTrack != null) {
                    C189908b9 c189908b9 = c189788ax.A0G;
                    String canonicalPath = new File(downloadedTrack.A02).getCanonicalPath();
                    C14360o3.A07(canonicalPath);
                    long j = audioOverlayTrack.A02;
                    ?? obj = new Object();
                    obj.A01 = canonicalPath;
                    obj.A00 = j;
                    String str = BVf.A0m;
                    String str2 = BVf.A0Y;
                    ?? obj2 = new Object();
                    obj2.A01 = str;
                    obj2.A00 = str2;
                    ?? obj3 = new Object();
                    obj3.A00 = obj;
                    obj3.A01 = obj2;
                    c189908b9.A01(obj3);
                }
                C8G3 c8g3 = c189788ax.A0E;
                c8g3.A01.A01(C8G5.A05);
                C138586Po c138586Po = c8g3.A02;
                c138586Po.A05 = false;
                c138586Po.invalidateSelf();
                c189788ax.A07.postDelayed(c189788ax.A0a, 16L);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A0B(C8GD c8gd) {
        Integer num;
        if (c8gd != null) {
            this.A03 = c8gd;
            this.A00 = c8gd.C0U();
        }
        this.A0P.A00.A0F();
        if (c8gd != null) {
            num = C05F.A0C;
        } else {
            num = C05F.A00;
        }
        A0C(num);
    }

    private final void A0C(Integer num) {
        Integer num2 = this.A04;
        if (num2 != num) {
            this.A04 = num;
            if (num2 == C05F.A01 && num == C05F.A0C) {
                this.A0R.A00().A01(this.A09, this.A0E.A00, EnumC199188rL.A0m);
            }
            C8GB c8gb = this.A0F;
            Integer num3 = this.A04;
            C81Z c81z = c8gb.A00;
            C8TN c8tn = c81z.A0c;
            Integer num4 = C05F.A0N;
            if (num3 == num4) {
                C8TN.A04(c8tn);
                c8tn.A0K.A00().CMN(false);
            } else {
                if (num2 == num4) {
                    c8tn.A0K.A00().EkU(false);
                }
                C8HI.A0A(c8tn.A0C);
                C8TN.A06(c8tn);
            }
            C1821786b c1821786b = c81z.A0m;
            c1821786b.A08 = num3;
            C1821786b.A06(c1821786b);
        }
    }

    private final void A0D(boolean z) {
        MYM mym;
        MYM mym2;
        Integer num = this.A04;
        Integer num2 = C05F.A00;
        if (num != num2) {
            this.A0P.A00.A0F();
            if (z) {
                this.A04 = num2;
                A03();
                Object obj = this.A0X.A01.get(0);
                C14360o3.A07(obj);
                this.A00 = ((Number) obj).intValue();
                C23987AkM A01 = A01();
                if (A01 != null && (mym2 = A01.A00) != null) {
                    mym2.A06();
                    MYM mym3 = A01.A00;
                    if (mym3 != null) {
                        mym3.A08(C05F.A01);
                    }
                }
                this.A0Y.A00();
            } else {
                C23987AkM A012 = A01();
                if (A012 != null && (mym = A012.A00) != null) {
                    mym.A09(C05F.A0C);
                }
            }
            this.A0J.release();
        }
    }

    private final boolean A0E() {
        CameraAREffect cameraAREffect = this.A0C.A00().A05.A09;
        if (cameraAREffect != null && cameraAREffect.A0J()) {
            return true;
        }
        return false;
    }

    public static final boolean A0F(C189788ax c189788ax) {
        CameraAREffect cameraAREffect;
        C1815283f c1815283f = c189788ax.A0C;
        if (c1815283f.A00().A05.A09 != null && (cameraAREffect = c1815283f.A00().A05.A09) != null && cameraAREffect.A0Z.get("audioFBA") != null && c189788ax.A0E() && !c189788ax.A0K) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC189798ay
    public final Integer Aue() {
        return this.A04;
    }

    @Override // X.InterfaceC189818b0
    public final MusicOverlayStickerModel BVf() {
        C8GD c8gd = this.A03;
        if (c8gd != null) {
            return c8gd.BVf();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC189798ay
    public final boolean CLx() {
        if (this.A03 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189798ay
    public final boolean CWR() {
        return this.A0K;
    }

    @Override // X.InterfaceC189798ay
    public final boolean CZS() {
        if (this.A04 != C05F.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189798ay
    public final boolean CaA() {
        return this.A06;
    }

    @Override // X.InterfaceC189798ay
    public final void Cns(C183978Ee c183978Ee) {
        MusicOverlayStickerModel musicOverlayStickerModel;
        MusicOverlayStickerModel A00;
        if (this.A0K) {
            A00 = this.A0V;
            if (A00 == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C8GD c8gd = this.A03;
            if (c8gd != null) {
                musicOverlayStickerModel = c8gd.BVf();
            } else {
                musicOverlayStickerModel = null;
            }
            if (this.A03 != null && musicOverlayStickerModel != null) {
                C23000ABz c23000ABz = new C23000ABz(musicOverlayStickerModel);
                c23000ABz.A0O = 15000;
                A00 = c23000ABz.A00();
            } else {
                return;
            }
        }
        c183978Ee.A0J = A00;
    }

    @Override // X.InterfaceC189798ay
    public final void Cnt(List list) {
        C8GD c8gd;
        int i;
        boolean z = this.A0K;
        if (z) {
            c8gd = this.A0Z;
        } else {
            c8gd = this.A03;
        }
        if (c8gd != null) {
            MusicOverlayStickerModel BVf = c8gd.BVf();
            Integer num = BVf.A0K;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C195868lW c195868lW = (C195868lW) it.next();
                int i2 = c195868lW.A0H;
                int i3 = c195868lW.A06 - i2;
                Integer valueOf = Integer.valueOf(i2 + i);
                if (i3 <= 0) {
                    i3 = 15000;
                    if (z) {
                        i3 = 60000;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i3);
                C23000ABz c23000ABz = new C23000ABz(BVf);
                c23000ABz.A0K = valueOf;
                c23000ABz.A0O = valueOf2;
                c23000ABz.A0L = null;
                c195868lW.A0V = c23000ABz.A00();
            }
        }
    }

    @Override // X.C8JV
    public final void CuA(ARAudioEffectData aRAudioEffectData) {
        DownloadedTrack downloadedTrack;
        AudioOverlayTrack audioOverlayTrack = this.A02;
        Integer num = null;
        if (audioOverlayTrack != null) {
            downloadedTrack = audioOverlayTrack.A06;
        } else {
            downloadedTrack = null;
        }
        C1815383g A00 = this.A0C.A00();
        if (downloadedTrack != null) {
            num = Integer.valueOf(downloadedTrack.A01);
        }
        A00.A00 = aRAudioEffectData;
        C1815383g.A00(A00, num);
    }

    @Override // X.InterfaceC189818b0
    public final void CwG() {
        this.A0P.A00.A0F();
        A07(this);
    }

    @Override // X.InterfaceC189818b0
    public final void DBI(AudioOverlayTrack audioOverlayTrack, C8GD c8gd) {
        this.A02 = audioOverlayTrack;
        if (audioOverlayTrack != null) {
            this.A0J.pause();
            this.A0I.setLoadingStatus(MY0.A02);
            this.A0A.setVisibility(0);
            A09(this, audioOverlayTrack);
            C190068bP c190068bP = this.A0S;
            if (c190068bP != null) {
                c190068bP.A01(this, audioOverlayTrack);
            }
        }
        A0B(c8gd);
    }

    @Override // X.InterfaceC189798ay
    public final void DDq() {
        int i;
        BEc bEc;
        if (!(this.A0N.A08.A00 instanceof C81V)) {
            this.A0C.A00().A06(this.A0Q);
            if (A0E()) {
                int intValue = this.A04.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                throw new RuntimeException();
                            }
                            return;
                        } else {
                            A02();
                            return;
                        }
                    }
                    C23987AkM A01 = A01();
                    if (A01 != null) {
                        MusicProduct A00 = A00();
                        MYM mym = A01.A00;
                        if (mym == null) {
                            A01.A00(A00);
                            return;
                        }
                        mym.A06();
                        MYM mym2 = A01.A00;
                        if (mym2 != null) {
                            mym2.A07(null, C05F.A0C);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C23987AkM A012 = A01();
                if (A012 != null) {
                    A012.A00(A00());
                }
                A0C(C05F.A01);
                return;
            }
            if (this.A0K) {
                AnonymousClass878 anonymousClass878 = this.A0J;
                MusicOverlayStickerModel musicOverlayStickerModel = this.A0V;
                if (musicOverlayStickerModel != null) {
                    anonymousClass878.EZL(AbstractC23129AMi.A00(musicOverlayStickerModel), false);
                    Integer num = musicOverlayStickerModel.A0O;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    anonymousClass878.EZO(i);
                    Object obj = this.A0M;
                    if ((obj instanceof BEc) && (bEc = (BEc) obj) != null) {
                        bEc.DUc(musicOverlayStickerModel);
                    }
                    anonymousClass878.EhH(0.001f);
                    anonymousClass878.A01 = false;
                    anonymousClass878.E4S();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A0Y.A00();
    }

    @Override // X.InterfaceC189828b1
    public final void DUU() {
        if (this.A03 == null) {
            A0C(C05F.A00);
        } else {
            A02();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 == null) goto L6;
     */
    @Override // X.InterfaceC189808az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DUh(int r6, int r7) {
        /*
            r5 = this;
            X.878 r2 = r5.A0J
            X.8GD r0 = r5.A03
            if (r0 == 0) goto L13
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.BVf()
            com.instagram.music.common.model.MusicDataSource r0 = X.AbstractC23129AMi.A00(r0)
            android.net.Uri r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            r4 = 0
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L58
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A02
            if (r0 == 0) goto L7e
            com.instagram.music.common.model.DownloadedTrack r1 = r0.A06
            if (r1 == 0) goto L78
            X.8GD r0 = r5.A03
            if (r0 == 0) goto L72
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.BVf()
            java.lang.Integer r0 = r0.A0K
            if (r0 == 0) goto L31
            int r4 = r0.intValue()
        L31:
            int r4 = r1.A00(r4)
        L35:
            r2.EZP(r4)
            java.lang.Integer r1 = X.C05F.A0C
            java.lang.Integer r0 = r2.CAH()
            if (r1 != r0) goto L50
            boolean r0 = r5.A05
            if (r0 == 0) goto L50
            r0 = 0
            r5.A05 = r0
            boolean r0 = A0F(r5)
            if (r0 != 0) goto L50
            r2.E4S()
        L50:
            java.lang.Integer r0 = r5.A04
            if (r1 != r0) goto L57
            A05(r5)
        L57:
            return
        L58:
            boolean r0 = r5.A0K
            if (r0 == 0) goto L69
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r5.A0V
            if (r0 == 0) goto L35
        L60:
            java.lang.Integer r0 = r0.A0K
            if (r0 == 0) goto L35
            int r4 = r0.intValue()
            goto L35
        L69:
            X.8GD r0 = r5.A03
            if (r0 == 0) goto L84
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.BVf()
            goto L60
        L72:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L78:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L7e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L84:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189788ax.DUh(int, int):void");
    }

    @Override // X.InterfaceC189808az
    public final void DUi() {
        if (this.A01 != null && C05F.A0C == this.A0J.CAH()) {
            A5H a5h = this.A01;
            if (a5h != null) {
                C8IE.A01(a5h.A00);
            }
            this.A01 = null;
        }
        this.A0G.A03.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1 == null) goto L18;
     */
    @Override // X.InterfaceC189808az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DUm(int r8) {
        /*
            r7 = this;
            boolean r3 = r7.A0K
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L10
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r7.A0V
            if (r5 != 0) goto L18
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L10:
            X.8GD r0 = r7.A03
            if (r0 == 0) goto Lc2
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r0.BVf()
        L18:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r7.A02
            if (r0 == 0) goto Lb3
            com.instagram.music.common.model.DownloadedTrack r6 = r0.A06
        L1e:
            X.8GD r0 = r7.A03
            if (r0 == 0) goto L2f
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.BVf()
            com.instagram.music.common.model.MusicDataSource r0 = X.AbstractC23129AMi.A00(r0)
            android.net.Uri r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L30
        L2f:
            r0 = 0
        L30:
            r4 = 0
            if (r0 == 0) goto Lb0
            if (r6 == 0) goto Lbc
            java.lang.Integer r0 = r5.A0K
            if (r0 == 0) goto Lae
            int r0 = r0.intValue()
        L3d:
            int r0 = r6.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L45:
            X.8GD r1 = r7.A03
            if (r1 == 0) goto La6
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r1.BVf()
            com.instagram.music.common.model.MusicDataSource r1 = X.AbstractC23129AMi.A00(r1)
            android.net.Uri r1 = r1.A00
            if (r1 == 0) goto La6
            com.instagram.music.common.model.AudioOverlayTrack r1 = r7.A02
            if (r1 == 0) goto Lb6
            int r1 = r1.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L5f:
            if (r0 == 0) goto La4
            int r2 = r0.intValue()
        L65:
            if (r1 == 0) goto La2
            int r3 = r1.intValue()
        L6b:
            int r2 = r8 - r2
            float r5 = (float) r2
            float r2 = (float) r3
            float r5 = r5 / r2
            r3 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = X.AbstractC13600mm.A00(r5, r3, r2)
            X.8G3 r2 = r7.A0E
            X.8G6 r2 = r2.A01
            r2.A00(r3)
            android.graphics.drawable.Drawable r3 = r7.A0M
            boolean r2 = r3 instanceof X.C5RQ
            if (r2 == 0) goto L9f
            r2 = 4991(0x137f, float:6.994E-42)
            java.lang.String r2 = X.AbstractC111324zv.A00(r2)
            X.C14360o3.A0C(r3, r2)
            X.5RQ r3 = (X.C5RQ) r3
            if (r0 == 0) goto La0
            int r0 = r0.intValue()
        L95:
            int r8 = r8 - r0
            if (r1 == 0) goto L9c
            int r4 = r1.intValue()
        L9c:
            r3.EUp(r8, r4)
        L9f:
            return
        La0:
            r0 = 0
            goto L95
        La2:
            r3 = 0
            goto L6b
        La4:
            r2 = 0
            goto L65
        La6:
            if (r3 == 0) goto Lab
            java.lang.Integer r1 = r5.A0O
            goto L5f
        Lab:
            java.lang.Integer r1 = r5.A0K
            goto L5f
        Lae:
            r0 = 0
            goto L3d
        Lb0:
            java.lang.Integer r0 = r5.A0K
            goto L45
        Lb3:
            r6 = 0
            goto L1e
        Lb6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        Lbc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        Lc2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189788ax.DUm(int):void");
    }

    @Override // X.InterfaceC189798ay
    public final void DoF() {
        this.A0J.pause();
        if (this.A0K) {
            A04();
        }
    }

    @Override // X.InterfaceC189818b0
    public final void Dx9(int i) {
        C8GD c8gd = this.A03;
        if (c8gd != null) {
            MusicOverlayStickerModel BVf = c8gd.BVf();
            C8GD c8gd2 = this.A03;
            if (c8gd2 != null) {
                Integer valueOf = Integer.valueOf(i);
                C23000ABz c23000ABz = new C23000ABz(BVf);
                c23000ABz.A0O = valueOf;
                c8gd2.EZN(c23000ABz.A00());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC189818b0
    public final void DxA(int i) {
        C8GD c8gd = this.A03;
        if (c8gd != null) {
            MusicOverlayStickerModel BVf = c8gd.BVf();
            C8GD c8gd2 = this.A03;
            if (c8gd2 != null) {
                Integer valueOf = Integer.valueOf(i);
                C23000ABz c23000ABz = new C23000ABz(BVf);
                c23000ABz.A0K = valueOf;
                c8gd2.EZN(c23000ABz.A00());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC189798ay
    public final void Dyr(C195868lW c195868lW) {
        DownloadedTrack downloadedTrack;
        C189878b6 c189878b6;
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack != null) {
            downloadedTrack = audioOverlayTrack.A06;
        } else {
            downloadedTrack = null;
        }
        if (!A0F(this) && !this.A0K && (c189878b6 = this.A0T) != null && downloadedTrack != null) {
            File file = new File(c195868lW.A0k);
            File file2 = new File(c189878b6.A00, "audio_burn_in_video.mp4");
            Context context = this.A09.getContext();
            C14360o3.A07(context);
            UserSession userSession = this.A0D;
            ExecutorService executorService = this.A0b;
            File file3 = new File(downloadedTrack.A02);
            Ai4 ai4 = new Ai4(this, c195868lW, file2);
            C14360o3.A0B(executorService, 3);
            C14120nc.A00().ATO(new C52391NGm(context, userSession, ai4, c189878b6, file, file3, file2, executorService));
            return;
        }
        this.A0F.A00.A13.A04(c195868lW);
    }

    @Override // X.InterfaceC184638He
    public final A8D Dzh(A5H a5h) {
        this.A01 = a5h;
        this.A0J.pause();
        if (this.A0K) {
            A04();
        }
        return new A8D("", 60000, true);
    }

    @Override // X.InterfaceC189798ay
    public final boolean onBackPressed() {
        C23987AkM A01;
        MYM mym;
        if (this.A04 == C05F.A01 && (A01 = A01()) != null && (mym = A01.A00) != null) {
            Boolean valueOf = Boolean.valueOf(mym.A0A());
            if (valueOf != null) {
                if (valueOf.booleanValue()) {
                    return true;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (this.A04 != C05F.A0N || !this.A0P.A00.A0M()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189798ay
    public final void onPause() {
        this.A0J.onPause();
    }

    @Override // X.InterfaceC189798ay
    public final void onResume() {
        this.A0J.onResume();
        this.A0C.A00().A06(this.A0Q);
    }

    private final MusicProduct A00() {
        if (A0E()) {
            CameraAREffect cameraAREffect = this.A0C.A00().A05.A09;
            if (cameraAREffect != null && cameraAREffect.A0d) {
                return MusicProduct.A0D;
            }
            return MusicProduct.A0C;
        }
        if (this.A0K) {
            return MusicProduct.A0L;
        }
        return MusicProduct.A0N;
    }

    @Override // X.InterfaceC189798ay
    public final C5NL ANF() {
        C8GD c8gd;
        if (A0E() || (c8gd = this.A03) == null) {
            return null;
        }
        return c8gd;
    }

    @Override // X.InterfaceC189818b0
    public final void Cyu(C8GD c8gd) {
        A0B(c8gd);
    }

    @Override // X.InterfaceC189818b0
    public final void D9c() {
        A06(this);
    }

    @Override // X.InterfaceC189808az
    public final void DUg() {
        A05(this);
        C189908b9 c189908b9 = this.A0G;
        CameraAREffect cameraAREffect = c189908b9.A02.A00().A05.A09;
        if (cameraAREffect != null && cameraAREffect.A0J()) {
            boolean z = false;
            if (cameraAREffect.A0Z.get("audioFBA") != null) {
                z = true;
            }
            C189908b9.A00(c189908b9, z);
        }
    }

    @Override // X.InterfaceC189808az
    public final void DUl() {
        A05(this);
        C189908b9 c189908b9 = this.A0G;
        c189908b9.A03.clear();
        C1815283f c1815283f = c189908b9.A02;
        IgCameraEffectsController igCameraEffectsController = c1815283f.A00().A05;
        igCameraEffectsController.A0C = false;
        AnonymousClass818 anonymousClass818 = igCameraEffectsController.A07;
        if (anonymousClass818 != null) {
            anonymousClass818.A0I(false);
        }
        c1815283f.A00().A05(null);
        AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer = c189908b9.A00;
        if (audioServiceConfigurationAnnouncer != null) {
            audioServiceConfigurationAnnouncer.pause();
        }
        c189908b9.A00 = null;
    }

    @Override // X.InterfaceC189798ay
    public final void Dml() {
        A08(this);
    }

    @Override // X.InterfaceC189798ay
    public final void DoI(boolean z) {
        if (A0F(this)) {
            C189908b9 c189908b9 = this.A0G;
            C224129uw c224129uw = c189908b9.A01;
            if (c224129uw != null) {
                c189908b9.A01(c224129uw);
                return;
            }
            return;
        }
        if (A0F(this)) {
            return;
        }
        this.A0J.E4S();
    }

    @Override // X.InterfaceC189828b1
    public final void Duf(JIN jin) {
        MYM mym;
        A03();
        MusicAssetModel A02 = MusicAssetModel.A02(jin);
        MusicProduct A00 = A00();
        int A05 = A02.A05();
        String BVY = this.A0H.BVY();
        Integer valueOf = Integer.valueOf(A05);
        C24024AlG c24024AlG = new C24024AlG(AbstractC23129AMi.A01(A00, A02, 15000, valueOf, valueOf, null, BVY, null, null), null, EnumC138556Pl.A0F, this.A00);
        c24024AlG.A04 = true;
        this.A03 = c24024AlG;
        C23987AkM A01 = A01();
        if (A01 != null && (mym = A01.A00) != null) {
            mym.A09(C05F.A0C);
        }
        A08(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00d5, code lost:
    
        if (r23 == null) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.8b2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C189788ax(android.graphics.drawable.Drawable r23, android.view.View r24, X.AbstractC59962oe r25, X.C1815283f r26, com.instagram.common.session.UserSession r27, X.C1810981l r28, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r29, X.C8GA r30, X.C8G3 r31, X.C8GB r32, X.AnonymousClass856 r33, X.AnonymousClass844 r34, com.instagram.music.common.config.MusicAttributionConfig r35, X.C677733r r36, X.C8GD r37, int r38) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189788ax.<init>(android.graphics.drawable.Drawable, android.view.View, X.2oe, X.83f, com.instagram.common.session.UserSession, X.81l, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8GA, X.8G3, X.8GB, X.856, X.844, com.instagram.music.common.config.MusicAttributionConfig, X.33r, X.8GD, int):void");
    }
}
