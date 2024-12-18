package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.gallery.scanner.MediaScannerScheduler;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8i4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193838i4 implements InterfaceC187208Rn, InterfaceC187288Rv, InterfaceC195388ke, InterfaceC55932he, InterfaceC193848i5, InterfaceC193868i7, InterfaceC23471Cj, InterfaceC189658ak, InterfaceC193788hy, InterfaceC155836zD {
    public static final C55942hf A1d = C55942hf.A04(70.0d, 5.0d);
    public float A00;
    public View A01;
    public C2GT A02;
    public C22P A03;
    public IgFrameLayout A04;
    public C55U A05;
    public MusicAssetModel A06;
    public Integer A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public int A0F;
    public View A0G;
    public Integer A0H;
    public Integer A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Activity A0N;
    public final Context A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final ViewGroup A0S;
    public final ViewGroup A0T;
    public final ImageView A0U;
    public final GridLayoutManager A0V;
    public final C1I4 A0W;
    public final RecyclerView A0X;
    public final AbstractC59962oe A0Y;
    public final InterfaceC11380iw A0Z;
    public final C193528hX A0a;
    public final C8SF A0b;
    public final UserSession A0c;
    public final IgTextView A0d;
    public final IgTextView A0e;
    public final C1810981l A0f;
    public final AbstractC193818i2 A0g;
    public final ClipsAssetHubViewModel A0h;
    public final C194268im A0i;
    public final C194428j3 A0j;
    public final C194628jN A0k;
    public final C193918iC A0l;
    public final C194278in A0m;
    public final C193998iK A0n;
    public final C193768hw A0o;
    public final C194488j9 A0p;
    public final C193948iF A0q;
    public final C193968iH A0r;
    public final C194598jK A0s;
    public final C193888i9 A0t;
    public final C188888Ye A0u;
    public final C193988iJ A0v;
    public final C8YY A0w;
    public final C193738ht A0x;
    public final GalleryMemoriesViewModel A0y;
    public final C7Db A0z;
    public final C86S A10;
    public final InterfaceC1810081c A11;
    public final ClipsCreationViewModel A12;
    public final C89P A13;
    public final C5JK A14;
    public final C195398kf A15;
    public final C187318Ry A16;
    public final EnumC193878i8 A17;
    public final C8CS A18;
    public final C8MX A19;
    public final C62882tR A1A;
    public final C62882tR A1B;
    public final C193798hz A1C;
    public final C6WQ A1D;
    public final ViewOnTouchListenerC195698lA A1E;
    public final SlideInAndOutIconView A1F;
    public final Runnable A1G;
    public final InterfaceC09390do A1H;
    public final InterfaceC09390do A1I;
    public final InterfaceC09390do A1J;
    public final InterfaceC09390do A1K;
    public final InterfaceC09390do A1L;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final View A1P;
    public final View A1Q;
    public final ViewGroup A1R;
    public final ViewGroup A1S;
    public final TextView A1T;
    public final C8J0 A1U;
    public final AnonymousClass840 A1V;
    public final C194138iY A1W;
    public final C8A7 A1X;
    public final DirectShareTarget A1Y;
    public final C195428ki A1Z;
    public final C194588jJ A1a;
    public final String A1b;
    public final boolean A1c;

    private final void A0A(GalleryItem galleryItem, String str) {
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            this.A15.A03(this.A0O, remoteMedia, this.A0c, AbstractC208329Jr.A00((C55U) this.A0f.A08.A00), new C50365MLr(galleryItem, this, remoteMedia, str, 29), new B8U(this, 11));
        }
    }

    public final void A0X() {
        this.A0A = false;
        C193968iH c193968iH = this.A0r;
        ((C189058Yv) c193968iH.A0R.getValue()).A09.A09.AHe();
        c193968iH.A00 = (int) (System.currentTimeMillis() / 1000);
        this.A0m.EYj(new ArrayList(), "");
        A0i(false);
        this.A0z.clear();
        ((C80K) this.A0c.A01(C80K.class, C80J.A00)).A00.clear();
        C193528hX c193528hX = this.A0a;
        c193528hX.A00 = false;
        c193528hX.A01.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (r7.A0v.A00() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0d(X.C22P r8) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193838i4.A0d(X.22P):void");
    }

    public final void A0f(String str, String str2, boolean z) {
        Bitmap bitmap;
        C14360o3.A0B(str, 0);
        android.net.Uri parse = android.net.Uri.parse(str);
        C14360o3.A07(parse);
        SimpleImageUrl A00 = AbstractC81033jX.A00(parse, -1, -1);
        RemoteMedia remoteMedia = new RemoteMedia(new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), A00, A00, null, null, null, str, A00.getUrl(), 0, false, false, false);
        GalleryItem galleryItem = new GalleryItem(null, new GeneratedMediaMetadata(str2, z), null, remoteMedia, null, remoteMedia.A04, null, null, C05F.A0C, remoteMedia.A06, -1);
        View requireViewById = this.A0S.requireViewById(R.id.gallery_grid_item_thumbnail);
        C14360o3.A07(requireViewById);
        ImageView imageView = (ImageView) requireViewById;
        C14360o3.A0B(imageView, 1);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        } else {
            bitmap = null;
        }
        A06(bitmap, galleryItem, this);
    }

    @Override // X.InterfaceC187288Rv
    public final void D54(Integer num) {
        C14360o3.A0B(num, 0);
        A0M(num);
        if (C18U.A06(C06090Tz.A05, this.A0c, 36328134764805333L)) {
            this.A0H = num;
            A0G(this);
        }
        if (num == C05F.A01) {
            AbstractC23641Du.A05(C12L.A00.A04, new PYX(this, null, 10), C07Y.A00(this.A0Y));
        }
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DCd(int i) {
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void DHW(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, X.2pF] */
    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        C193408hL c193408hL;
        int i;
        InterfaceC16660sJ c206899Du;
        float A04 = (float) AbstractC70163Da.A04(f, 0.5d, 1.0d, 0.0d, 1.0d);
        this.A00 = f;
        View view = this.A1P;
        view.setAlpha(A04);
        if (this.A0G != null) {
            view.setTranslationY(r1.getHeight() - f2);
            if (A0T(this)) {
                C193798hz c193798hz = this.A1C;
                float height = r1.getHeight() - f2;
                QuickSnapArchiveViewModel quickSnapArchiveViewModel = (QuickSnapArchiveViewModel) c193798hz.A0D.getValue();
                if (((C51705Msa) quickSnapArchiveViewModel.A0F.getValue()).A02 || quickSnapArchiveViewModel.A0C == C05F.A01) {
                    InterfaceC09390do interfaceC09390do = c193798hz.A0F;
                    Object value = interfaceC09390do.getValue();
                    C14360o3.A07(value);
                    ((View) value).setAlpha(A04);
                    Object value2 = interfaceC09390do.getValue();
                    C14360o3.A07(value2);
                    ((View) value2).setTranslationY(height);
                }
                if (C193798hz.A01(c193798hz)) {
                    InterfaceC09390do interfaceC09390do2 = c193798hz.A0I;
                    Object value3 = interfaceC09390do2.getValue();
                    C14360o3.A07(value3);
                    ((View) value3).setAlpha(A04);
                    Object value4 = interfaceC09390do2.getValue();
                    C14360o3.A07(value4);
                    ((View) value4).setTranslationY(height);
                }
            }
        }
        ViewGroup viewGroup = this.A0l.A00;
        viewGroup.setAlpha(A04);
        this.A0T.setAlpha(A04);
        if (f2 > 0.0f) {
            A01();
            if (!this.A0B) {
                this.A0B = true;
                this.A0v.A01 = true;
                C193968iH c193968iH = this.A0r;
                c193968iH.A00 = (int) (System.currentTimeMillis() / 1000);
                if (c193968iH.A0T == null) {
                    EST(Integer.valueOf(AbstractC50712Us.A01.A03()));
                }
                if (A0T(this)) {
                    C193798hz c193798hz2 = this.A1C;
                    if (C193798hz.A01(c193798hz2)) {
                        InterfaceC09390do interfaceC09390do3 = c193798hz2.A0D;
                        ((QuickSnapArchiveViewModel) interfaceC09390do3.getValue()).A05();
                        if (c193798hz2.A02 == null) {
                            c193798hz2.A02 = AbstractC18560vj.A03(C07Y.A00(c193798hz2.A04.getViewLifecycleOwner()), new C15340po(new PZI(c193798hz2, null, 12), ((QuickSnapArchiveViewModel) interfaceC09390do3.getValue()).A0D));
                        }
                    }
                }
                UserSession userSession = this.A0c;
                AnonymousClass229.A01(userSession).A0J.A01(this.A14, "gallery_visible");
                A0F(this);
                Object obj = this.A0f.A08.A00;
                if ((obj instanceof C128535rM) || (obj instanceof C81V) || (obj instanceof C208509Kk)) {
                    AbstractC59962oe abstractC59962oe = this.A0Y;
                    Context context = abstractC59962oe.getContext();
                    if (abstractC59962oe.isVisible() && context != null) {
                        C180627zq c180627zq = (C180627zq) this.A1L.getValue();
                        C57312k6 A00 = AbstractC57302k5.A00(abstractC59962oe.getLifecycle());
                        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                        MediaScannerScheduler A003 = AbstractC60332pG.A00(context, userSession, new Object());
                        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36322452523067644L);
                        C14360o3.A0B(A002, 3);
                        C14360o3.A0B(A003, 5);
                        if (c180627zq.A00 == null && A06) {
                            AbstractC23641Du.A05(((C12N) c180627zq.A01.getValue()).AOT(23341140, 3), new MC0(c180627zq, A002, A003, context, A00, userSession, null, 3), A00);
                        }
                    }
                }
            }
        } else {
            this.A0x.A00(false, false);
            C193968iH c193968iH2 = this.A0r;
            if (c193968iH2.A06 != null) {
                C49632Pw A004 = AbstractC49622Pv.A00(c193968iH2.A0J);
                A004.A01 = A004.A04.A06(CancelReason.USER_CANCELLED, "User exited before the gallery finished loading", 17638606, A004.A01);
                c193968iH2.A06 = null;
            }
            if (c193968iH2.A0T != null) {
                c193968iH2.A0T = null;
                C447724h c447724h = AnonymousClass229.A01(c193968iH2.A0J).A0J;
                C5JK c5jk = c193968iH2.A0O;
                if (c447724h.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
                    c447724h.A00 = c447724h.A04.A06(CancelReason.USER_CANCELLED, "User exited before the gallery finished loading", 585177795, c447724h.A00);
                }
            }
            this.A0B = false;
            this.A0v.A01 = false;
            this.A0X.removeCallbacks(this.A1G);
            viewGroup.setVisibility(8);
            A0b();
            if (!AbstractC1822686m.A01(this.A0c)) {
                A0i(false);
            }
            A0j(this.A0D);
            C193768hw c193768hw = this.A0o;
            C31349DqE c31349DqE = c193768hw.A07;
            if (c31349DqE != null) {
                C41451vu.A01.E4s(new C3KF(c31349DqE));
                c193768hw.A07 = null;
            }
            if (A0T(this)) {
                this.A1C.A02();
            }
        }
        if (this.A00 == 1.0f) {
            boolean z = this.A1N;
            if (!z) {
                C194598jK c194598jK = this.A0s;
                boolean z2 = false;
                if (c194598jK.A0A) {
                    A7E a7e = c194598jK.A00;
                    if (a7e != null) {
                        B8T b8t = new B8T(c194598jK, 26);
                        B8U b8u = new B8U(c194598jK, 19);
                        boolean z3 = false;
                        InterfaceC25190BCn interfaceC25190BCn = a7e.A01;
                        int AyT = interfaceC25190BCn.AyT("share_fundraiser_educational_dialog");
                        if (AyT < 1 && ((Boolean) b8t.invoke()).booleanValue()) {
                            a7e.A00.A00(b8u);
                            z3 = true;
                            interfaceC25190BCn.ELd("share_fundraiser_educational_dialog", AyT + 1);
                        }
                        C50168MDv c50168MDv = new C50168MDv(21, c194598jK, z3);
                        B8U b8u2 = new B8U(c194598jK, 15);
                        int AyT2 = interfaceC25190BCn.AyT("long_reels_nux");
                        if (AyT2 < 1 && ((Boolean) c50168MDv.invoke()).booleanValue()) {
                            a7e.A00.A00(b8u2);
                            interfaceC25190BCn.ELd("long_reels_nux", AyT2 + 1);
                        }
                    }
                } else {
                    C194588jJ c194588jJ = c194598jK.A08;
                    if (c194588jJ != null && !c194588jJ.A00) {
                        c194598jK.A07.A00(new B8U(c194598jK, 16));
                        z2 = true;
                    }
                    UserSession userSession2 = c194598jK.A03;
                    C195448kk A005 = AbstractC195438kj.A00(userSession2);
                    if (!z2) {
                        if (c194598jK.A06.A03.A01.A02 == -1 && c194598jK.A05.A0K.getValue() == null) {
                            C14360o3.A0B(A005, 0);
                            if ((!((C195478kn) A005.A07.getValue()).A02.isEmpty()) && AbstractC23021Ah.A00(userSession2).A01.getInt("meta_gallery_recents_nux_impression_count", 0) < 1) {
                                c193408hL = c194598jK.A07;
                                i = 17;
                                c206899Du = new B8U(c194598jK, i);
                                c193408hL.A00(c206899Du);
                            }
                        }
                        C1811981v c1811981v = c194598jK.A04.A08;
                        if ((c1811981v.A00 instanceof C81V) && ((C180657zt) c194598jK.A09.getValue()).A02()) {
                            c193408hL = c194598jK.A07;
                            c206899Du = new C206899Du(c194598jK, 1);
                            c193408hL.A00(c206899Du);
                        } else if ((c1811981v.A00 instanceof C208509Kk) && ((C180657zt) c194598jK.A09.getValue()).A03()) {
                            c193408hL = c194598jK.A07;
                            i = 18;
                            c206899Du = new B8U(c194598jK, i);
                            c193408hL.A00(c206899Du);
                        }
                    }
                }
            }
            C193768hw c193768hw2 = this.A0o;
            if (c193768hw2.A0F.A08.A00 instanceof C81V) {
                C75E c75e = c193768hw2.A0I;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - c75e.A00 >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                    c75e.A00 = currentTimeMillis;
                    C141796aw A006 = AbstractC141776au.A00(c75e);
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9D7(c75e, (InterfaceC23621Ds) null, 2, currentTimeMillis), A006);
                }
            }
            boolean z4 = true;
            if (!this.A13.A0L() && ((!this.A10.A03((C55U) this.A0f.A08.A00) && !(!this.A0z.Bsg().isEmpty())) || A0Q())) {
                z4 = false;
            }
            A0i(z4);
            if (!z) {
                this.A0p.A00();
            }
            this.A09 = false;
            AbstractC56932jR.A05(viewGroup, 500L);
        }
    }

    @Override // X.InterfaceC1829689r
    public final boolean DJG(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        boolean z3 = false;
        if (f2 < 0.0f) {
            z3 = true;
        }
        if (A0T(this) && z3) {
            C193798hz c193798hz = this.A1C;
            if (C193798hz.A01(c193798hz)) {
                C191138dB.A00(EnumC53366NjH.SWIPE_UP_TO_VIEW_ARCHIVE, ((QuickSnapArchiveViewModel) c193798hz.A0D.getValue()).A07, null);
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC195388ke
    public final void DNQ(GalleryItem galleryItem, BBC bbc, int i) {
        C14360o3.A0B(bbc, 1);
        if (bbc instanceof C9NP) {
            A0i(true);
            A0c(((C9NP) bbc).A00, galleryItem, i);
        }
    }

    @Override // X.InterfaceC195388ke
    public final void DNa(View view, GalleryItem galleryItem, BBC bbc, int i) {
        C14360o3.A0B(galleryItem, 0);
        C14360o3.A0B(bbc, 1);
        if ((bbc instanceof C9NP) && !A0R(galleryItem) && A0N()) {
            C194278in c194278in = this.A0m;
            if (!c194278in.A08.A0A && !this.A0C) {
                if (!this.A0z.Ccf(galleryItem)) {
                    c194278in.A01(galleryItem, ((C9NP) bbc).A00);
                    this.A0q.A00(galleryItem, ((C194478j8) this.A1I.getValue()).A03.A01.A00(), "LONG_PRESS", i, true);
                    if (galleryItem.A09 == C05F.A0C && galleryItem.A00 == null) {
                        A0A(galleryItem, this.A0r.A04());
                    } else {
                        Medium medium = galleryItem.A00;
                        if (medium != null) {
                            medium.A0G.A01 = this.A0r.A04();
                        }
                    }
                    A08(galleryItem, i);
                }
                if (galleryItem.A04 != null) {
                    A09(galleryItem, C05F.A01);
                }
                A0i(true);
                this.A16.A0C(true, true);
                C2UY.A01.A05(10L);
            }
        }
    }

    @Override // X.InterfaceC187208Rn
    public final void DNm(C9NH c9nh, int i) {
        C14360o3.A0B(c9nh, 0);
        A02();
        if (this.A0z instanceof C159407Da) {
            Object obj = this.A0f.A08.A00;
            if ((obj instanceof C81V) || (obj instanceof C208509Kk)) {
                C194278in c194278in = this.A0m;
                GalleryItem galleryItem = c9nh.A01;
                C193958iG c193958iG = c194278in.A08;
                InterfaceC195388ke interfaceC195388ke = c194278in.A09;
                C9EB c9eb = new C9EB(c194278in, 44);
                C193958iG.A00(galleryItem, c193958iG);
                c193958iG.A01(c9eb);
                interfaceC195388ke.DNr(galleryItem, false);
            }
        }
    }

    @Override // X.InterfaceC187208Rn
    public final void DNp(C9NH c9nh, int i) {
    }

    @Override // X.InterfaceC195388ke
    public final void DNu(GalleryItem galleryItem, BBC bbc, int i, boolean z) {
        C141796aw A00;
        InterfaceC16620sF c25023B5e;
        Integer num;
        C14360o3.A0B(galleryItem, 0);
        C14360o3.A0B(bbc, 1);
        if ((bbc instanceof C9NP) && !A0R(galleryItem)) {
            C86S c86s = this.A10;
            Bitmap bitmap = ((C9NP) bbc).A00;
            c86s.A01 = new WeakReference(bitmap);
            if (galleryItem.A09 != C05F.A0C) {
                Medium medium = galleryItem.A00;
                if (medium != null) {
                    num = Integer.valueOf(medium.A05);
                } else {
                    num = null;
                }
                c86s.A00 = num;
            }
            if (z) {
                A0c(bitmap, galleryItem, i);
                A0G(this);
            } else if (!this.A0C) {
                A08(galleryItem, i);
                RemoteMedia remoteMedia = galleryItem.A04;
                if (remoteMedia != null && remoteMedia.A08) {
                    GalleryMemoriesViewModel galleryMemoriesViewModel = this.A0y;
                    String str = galleryItem.A0A;
                    C14360o3.A0B(str, 0);
                    if (C18U.A06(C06090Tz.A05, galleryMemoriesViewModel.A01, 36327653728467712L)) {
                        A00 = AbstractC141776au.A00(galleryMemoriesViewModel);
                        c25023B5e = new C57155PYz(galleryMemoriesViewModel, null, i, 10);
                    } else {
                        C38321qM A02 = galleryMemoriesViewModel.A02.A02(str);
                        if (A02 != null) {
                            A00 = AbstractC141776au.A00(galleryMemoriesViewModel);
                            c25023B5e = new C25023B5e(A02, galleryMemoriesViewModel, null, 22);
                        }
                    }
                    AbstractC23641Du.A05(AnonymousClass191.A00, c25023B5e, A00);
                } else if (galleryItem.A00 == null) {
                    A0B(galleryItem, new ME5(25, galleryItem, this, bbc));
                } else {
                    AnonymousClass229.A01(this.A0c).A0J.A06(this.A14, "reels_gallery_thumbnail_tap", 1);
                    List singletonList = Collections.singletonList(new C9NH(galleryItem, bitmap));
                    C14360o3.A07(singletonList);
                    c86s.A01(singletonList);
                }
            } else {
                A08(galleryItem, i);
                A06(bitmap, galleryItem, this);
            }
            if (galleryItem.A04 != null) {
                A09(galleryItem, C05F.A00);
            }
        }
    }

    @Override // X.InterfaceC189658ak
    public final void DTe(C8Z4 c8z4) {
        C14360o3.A0B(c8z4, 0);
        this.A0r.DTe(c8z4);
    }

    @Override // X.InterfaceC155846zE
    public final void DWT(AppBarLayout appBarLayout, int i) {
        this.A0K = i == 0;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C14360o3.A0B(map, 0);
        if (AbstractC93174Ft.A00(map) != EnumC172127lh.A05 && !AbstractC93174Ft.A03(this.A0N)) {
            A0b();
        } else {
            C8J0 c8j0 = this.A1U;
            String str = ((C55U) this.A0f.A08.A00).A02;
            C24Q c24q = c8j0.A03;
            long A03 = c24q.A03(518928411, 12000L);
            c8j0.A01 = A03;
            c24q.A09(A03, "camera_destination", str);
            A0V();
        }
        A0a();
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void Dem(String str) {
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void Dir(float f, float f2, float f3, float f4, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DkG() {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        int i = 0;
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        ImageView imageView = this.A0U;
        imageView.setImageAlpha(C1H4.A01(255.0f * f));
        if (f <= 0.0f) {
            imageView.setImageBitmap(null);
            i = 4;
        }
        imageView.setVisibility(i);
    }

    @Override // X.InterfaceC193788hy
    public final void DpK(Bitmap bitmap, String str) {
        C14360o3.A0B(bitmap, 0);
        C14360o3.A0B(str, 1);
        this.A0o.DpK(bitmap, str);
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dvh() {
    }

    @Override // X.InterfaceC193848i5
    public final void EW5(boolean z) {
        this.A0C = false;
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
    }

    public static final Medium A00(RemoteMedia remoteMedia, GalleryItem galleryItem, C193838i4 c193838i4, File file) {
        Medium medium;
        C183978Ee c183978Ee;
        String str;
        String str2;
        C195428ki c195428ki = c193838i4.A1Z;
        Medium A00 = C195428ki.A00(remoteMedia, file);
        c195428ki.A02(A00, remoteMedia);
        String str3 = null;
        if (remoteMedia.A09) {
            RemoteMedia remoteMedia2 = galleryItem.A04;
            if (remoteMedia2 != null) {
                str2 = remoteMedia2.A07;
            } else {
                str2 = null;
            }
            A00.A0a = str2;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file.getCanonicalPath());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String str4 = "0";
            if (extractMetadata == null) {
                extractMetadata = "0";
            }
            int parseInt = Integer.parseInt(extractMetadata);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null) {
                str4 = extractMetadata2;
            }
            int parseInt2 = Integer.parseInt(str4);
            mediaMetadataRetriever.release();
            A00.A0B = parseInt2;
            A00.A04 = parseInt;
        }
        MediaUploadMetadata mediaUploadMetadata = A00.A0G;
        RemoteMedia remoteMedia3 = galleryItem.A04;
        if (remoteMedia3 != null) {
            str3 = remoteMedia3.A02.A03;
        }
        mediaUploadMetadata.A09 = str3;
        String str5 = null;
        if ((remoteMedia3 == null || (str = remoteMedia3.A02.A08) == null) && (((medium = galleryItem.A00) == null || (str = medium.A0G.A08) == null) && ((c183978Ee = galleryItem.A07) == null || (str = c183978Ee.A01().A08) == null))) {
            C195868lW c195868lW = galleryItem.A08;
            if (c195868lW != null) {
                str = c195868lW.A02().A08;
            }
            mediaUploadMetadata.A08 = str5;
            A00.A0E = galleryItem.A03;
            return A00;
        }
        str5 = str;
        mediaUploadMetadata.A08 = str5;
        A00.A0E = galleryItem.A03;
        return A00;
    }

    private final void A02() {
        C187318Ry c187318Ry = this.A16;
        if (c187318Ry.A00 == 5 && c187318Ry.A0R.getCount() > 1 && c187318Ry.A08 == null) {
            UserSession userSession = c187318Ry.A0O;
            if (AbstractC23021Ah.A00(userSession).A01.getInt("gallery_drag_thumbnail_tray_tooltip", 0) < 3 && !C18U.A06(C06090Tz.A06, userSession, 36328134764674259L)) {
                String string = c187318Ry.A0L.getContext().getString(2131963060);
                C14360o3.A07(string);
                C187318Ry.A06(c187318Ry, string, new C206959Ea(c187318Ry, 7));
            }
        }
        this.A10.A0A.Egh(Integer.valueOf(this.A0z.getCount()));
    }

    private final void A03() {
        if (AbstractC70453Ee.A00(this.A0c).booleanValue() && !this.A0M) {
            C193798hz c193798hz = this.A1C;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c193798hz.A00 >= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                c193798hz.A00 = currentTimeMillis;
                ((QuickSnapArchiveViewModel) c193798hz.A0D.getValue()).A04();
            }
            this.A0M = true;
        }
    }

    private final void A04() {
        GridLayoutManager gridLayoutManager = this.A0V;
        gridLayoutManager.A1v(3);
        C2UU c2uu = this.A0X.A0A;
        if (c2uu != null) {
            gridLayoutManager.A01 = new C194418j2(c2uu, gridLayoutManager.A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A05(Bitmap bitmap, Medium medium, C193838i4 c193838i4) {
        if (!c193838i4.A0C) {
            A07(bitmap, c193838i4, medium.A07);
        }
        boolean A05 = medium.A05();
        C8YY c8yy = c193838i4.A0w;
        if (A05) {
            c8yy.A0E(medium, c193838i4, false);
        } else {
            c8yy.A0F(medium, c193838i4, false);
        }
    }

    public static final void A07(Bitmap bitmap, C193838i4 c193838i4, int i) {
        c193838i4.A0I = C05F.A01;
        Bitmap blur = BlurUtil.blur(bitmap, 0.25f, 10);
        ImageView imageView = c193838i4.A0U;
        imageView.setImageBitmap(blur);
        int width = blur.getWidth();
        int height = blur.getHeight();
        int width2 = imageView.getWidth();
        int height2 = imageView.getHeight();
        boolean z = C1NC.A02;
        Matrix matrix = new Matrix();
        C1NC.A0J(matrix, width, height, width2, height2, i, false);
        imageView.setImageMatrix(matrix);
        imageView.setVisibility(0);
        ((C55982hj) c193838i4.A1H.getValue()).A08(1.0d, true);
    }

    private final void A08(GalleryItem galleryItem, int i) {
        Medium medium;
        DirectShareTarget directShareTarget = this.A1Y;
        if (directShareTarget != null && (medium = galleryItem.A00) != null) {
            C7FR c7fr = new C7FR(this.A0Z, this.A0c);
            InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
            interfaceC83713oG.getClass();
            String str = null;
            if (medium.A05()) {
                str = "photo";
            } else if (medium.Cff()) {
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
            }
            c7fr.A01(interfaceC83713oG, Long.valueOf(i), str);
        }
    }

    private final void A09(GalleryItem galleryItem, Integer num) {
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            List Bsg = this.A0z.Bsg();
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(Bsg, 10));
            Iterator it = Bsg.iterator();
            while (it.hasNext()) {
                arrayList.add(((C9NH) it.next()).A01);
            }
            AbstractC208329Jr.A02(this.A0Z, remoteMedia, this.A0c, num, AbstractC208329Jr.A00((C55U) this.A0f.A08.A00), arrayList, this.A0L);
        }
    }

    private final void A0B(GalleryItem galleryItem, InterfaceC16820sZ interfaceC16820sZ) {
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            Activity activity = this.A0N;
            UserSession userSession = this.A0c;
            C195398kf c195398kf = this.A15;
            String A00 = AbstractC208329Jr.A00((C55U) this.A0f.A08.A00);
            DT0 dt0 = new DT0(5, this, galleryItem, remoteMedia, interfaceC16820sZ);
            C30192DRx c30192DRx = new C30192DRx(this, 25);
            C14360o3.A0B(c195398kf, 2);
            Object obj = new Object();
            String string = activity.getString(2131965660);
            C14360o3.A07(string);
            C9RU A002 = AbstractC47115KsA.A00(activity, string, new B5y(obj, 31));
            C0fJ.A00(A002);
            c195398kf.A03(activity, remoteMedia, userSession, A00, new C30172DRc(26, obj, A002, dt0), new C30172DRc(27, obj, A002, c30192DRx));
        }
    }

    public static final void A0C(C193838i4 c193838i4) {
        if (c193838i4.A0f.A08.A00 instanceof C81V) {
            if (!c193838i4.A0v.A00() || c193838i4.A1X.A07.size() <= 0) {
                c193838i4.A0Y();
            }
        }
    }

    public static final void A0E(C193838i4 c193838i4) {
        String str;
        C193988iJ c193988iJ = c193838i4.A0v;
        if (!c193988iJ.A04() && c193988iJ.A06()) {
            str = "draftsTabView";
            IgTextView igTextView = c193838i4.A0o.A03;
            if (igTextView != null) {
                igTextView.setVisibility(0);
                return;
            }
        } else {
            str = "draftsTabView";
            IgTextView igTextView2 = c193838i4.A0o.A03;
            if (igTextView2 != null) {
                igTextView2.setVisibility(8);
                if (c193838i4.A07 != C05F.A01) {
                    return;
                }
                c193838i4.A0h(false);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A0c, 36327297246312934L) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r7.A07 != X.C05F.A01) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0F(X.C193838i4 r7) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193838i4.A0F(X.8i4):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0219, code lost:
    
        if (r0 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r3 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36322233480063045L) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fd, code lost:
    
        if (r16 != false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v42, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.C193838i4 r24) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193838i4.A0G(X.8i4):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r14.A07 != X.C05F.A00) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
    
        if (r14.A0Q() != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0H(final X.C193838i4 r14, X.C86T r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193838i4.A0H(X.8i4, X.86T):void");
    }

    public static final void A0I(C193838i4 c193838i4, String str) {
        if (c193838i4.A0r.A0T == null) {
            c193838i4.EST(Integer.valueOf(AbstractC50712Us.A01.A03()));
            AnonymousClass229.A01(c193838i4.A0c).A0J.A02(c193838i4.A14, str);
        }
    }

    public static final void A0J(C193838i4 c193838i4, List list) {
        c193838i4.A0U.setVisibility(8);
        C8YY c8yy = c193838i4.A0w;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium medium = ((GalleryItem) it.next()).A00;
            String str = null;
            if (medium != null) {
                MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                String str2 = mediaUploadMetadata.A03;
                if (str2 == null) {
                    AbstractC224309vG A00 = AbstractC178007vZ.A00(null, c193838i4.A0c, medium.A0X, medium.A05());
                    if (A00 != null) {
                        str = A00.A02();
                    }
                } else {
                    str = str2;
                }
                mediaUploadMetadata.A03 = str;
                arrayList.add(medium);
            }
        }
        c8yy.A0K(arrayList, false);
    }

    public static final void A0K(C193838i4 c193838i4, List list) {
        final C198308pf c198308pf;
        Number number;
        c193838i4.A0U.setVisibility(0);
        if ((c193838i4.A0f.A08.A00 instanceof C81V) && (!list.isEmpty())) {
            if (c193838i4.A16.A0A == C05F.A01) {
                CreationSession creationSession = new CreationSession();
                EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
                creationSession.A09 = new MediaCaptureConfig(new C43846JaA(enumC69983Ch));
                creationSession.A0A = enumC69983Ch;
                boolean z = true;
                creationSession.A0M = true;
                UserSession userSession = c193838i4.A0c;
                C43871Jab c43871Jab = new C43871Jab(c193838i4.A0N, AbstractC018607g.A00(c193838i4.A0Y), c193838i4.A03, userSession, null, null, MX9.A00(c193838i4.A03, userSession, creationSession, new C1815483h(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, false, false, false, false)), null, null, 10001);
                Map map = AbstractC43847JaB.A00(userSession).A04;
                C16920sk A0E = AbstractC06930Yk.A0E();
                C128535rM c128535rM = C128535rM.A00;
                if (c193838i4.A00 != 1.0f) {
                    z = false;
                }
                AbstractC50677MYv.A0G(userSession, c128535rM, z);
                LIL.A00.A01(EnumC114925Hg.FEED, userSession, list, map, false);
                c43871Jab.A05(EnumC114925Hg.CLIPS, null, null, list, map, A0E, 1.0f, false, false, false);
                return;
            }
            A0J(c193838i4, list);
            return;
        }
        int intValue = ((GalleryItem) list.get(0)).A09.intValue();
        if (intValue != 2 && intValue != 0) {
            if (intValue != 5 && intValue != 6) {
                throw new UnsupportedOperationException("Unhandled media thumbnail item type.");
            }
            GalleryItem galleryItem = (GalleryItem) list.get(0);
            int intValue2 = galleryItem.A09.intValue();
            if (intValue2 != 5) {
                if (intValue2 == 6) {
                    C195868lW c195868lW = galleryItem.A08;
                    if (c195868lW != null) {
                        c198308pf = new C198308pf(c195868lW);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new UnsupportedOperationException("Unsupported draft media type.");
                }
            } else {
                C183978Ee c183978Ee = galleryItem.A07;
                if (c183978Ee != null) {
                    c198308pf = new C198308pf(c183978Ee);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            final C194268im c194268im = c193838i4.A0i;
            final WeakReference weakReference = new WeakReference(new C23748AfL(c193838i4, list));
            Map map2 = C194268im.A04;
            if (map2.containsKey(C194268im.A00(c194268im, c198308pf))) {
                if (weakReference.get() == null || c198308pf.A01() == null || (number = (Number) map2.get(C194268im.A00(c194268im, c198308pf))) == null) {
                    return;
                }
                C194268im.A01(c194268im, c198308pf, weakReference, number.intValue());
                return;
            }
            c194268im.A03.ATO(new AbstractRunnableC14200nk() { // from class: X.9j7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1910247448, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C194268im c194268im2 = C194268im.this;
                    C198308pf c198308pf2 = c198308pf;
                    WeakReference weakReference2 = weakReference;
                    String A01 = c198308pf2.A01();
                    if (weakReference2.get() != null && c198308pf2.A01() != null) {
                        BitmapFactory.Options options = c194268im2.A02;
                        BitmapFactory.decodeFile(A01, options);
                        int i = options.outWidth;
                        int i2 = options.outHeight;
                        int i3 = c194268im2.A01;
                        int i4 = c194268im2.A00;
                        int i5 = 1;
                        while (i / i5 > i3 && i2 / i5 > i4) {
                            i5 *= 2;
                        }
                        Map map3 = C194268im.A04;
                        C14360o3.A08(map3);
                        map3.put(C194268im.A00(c194268im2, c198308pf2), Integer.valueOf(i5));
                        C194268im.A01(c194268im2, c198308pf2, weakReference2, i5);
                    }
                }
            });
            return;
        }
        Medium medium = ((GalleryItem) list.get(0)).A00;
        if (medium == null) {
            return;
        }
        if (medium.A0G.A0B) {
            C194628jN c194628jN = c193838i4.A0k;
            c194628jN.A00 = list;
            C1OG A0J = C25821No.A00().A0J(AbstractC81033jX.A01(new File(medium.A0X)), "GalleryGridController");
            A0J.A02(c194628jN);
            A0J.A01();
            return;
        }
        c193838i4.A0b.A04(medium, new C23624AdJ(c193838i4, list));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        if (r11.isEmpty() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        r4 = X.AnonymousClass229.A01(r10.A0c).A0B;
        r3 = r4.A01;
        r3 = r3.A00(r3.A00, "ig_camera_navigation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (r3.isSampled() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        r3.AAP(com.facebook.common.dextricks.OptSvcAnalyticsStore.LOGGING_KEY_STEP, "GALLERY_NEXT_BUTTON");
        r3.AAP("legacy_falco_event_name", "IG_CAMERA_GALLERY_NEXT_BUTTON");
        r6 = r4.A04;
        r1 = r6.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f7, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        r3.AAP("camera_session_id", r1);
        r3.A8R(r4.A0J(), "camera_destination");
        r3.A8R(r6.A09, com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r3.A8p("event_type", 2);
        r3.A8R(X.EnumC50631MWs.A0J, "surface");
        r3.AAP("module", X.C22F.A08.getModuleName());
        r3.A9K("selected_photo_count", java.lang.Long.valueOf(r2));
        r3.A9K("selected_video_count", java.lang.Long.valueOf(r5));
        r3.AAP("nav_chain", X.C1QM.A00.A02.A00);
        r3.AAQ(X.AbstractC449424y.A07(r4.A00, r4.A03), "system_info");
        r3.Cht();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0159, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0181, code lost:
    
        r1 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0189, code lost:
    
        if (r1.hasNext() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0195, code lost:
    
        if (((com.instagram.common.gallery.model.GalleryItem) r1.next()).A03() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0197, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0199, code lost:
    
        if (r2 >= 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0175, code lost:
    
        X.AbstractC16960so.A1T();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017c, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017d, code lost:
    
        if (r3 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0L(X.C193838i4 r10, java.util.List r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193838i4.A0L(X.8i4, java.util.List, java.util.List):void");
    }

    private final boolean A0N() {
        C193988iJ c193988iJ = this.A0v;
        if ((c193988iJ.A00() && !((Boolean) c193988iJ.A00.A01).booleanValue()) || !this.A0L || A0O() || this.A07 == C05F.A0C) {
            return false;
        }
        C1810981l c1810981l = this.A0f;
        if (c1810981l.A0Q()) {
            if (C18U.A06(C06090Tz.A05, this.A0c, 36327297246312934L)) {
                return false;
            }
        }
        if (c1810981l.A08.A00 instanceof C81V) {
            if (C18U.A06(C06090Tz.A05, this.A0c, 36328469772123693L)) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean A0O() {
        C89P c89p = this.A13;
        if ((c89p.A04 == null || !c89p.A0N() || c89p.A0A == null) && !this.A0w.A0Q()) {
            return false;
        }
        return true;
    }

    private final boolean A0P() {
        if (this.A0z instanceof C159407Da) {
            Object obj = this.A0f.A08.A00;
            if (!(obj instanceof C81V)) {
                if (obj instanceof C208509Kk) {
                    if (C18U.A06(C06090Tz.A05, this.A0c, 36328946513821591L)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A0Q() {
        if ((C14360o3.A0K(this.A0f.A08.A00, C208509Kk.A00) && this.A07 == C05F.A01 && (!this.A0z.Bsg().isEmpty())) || !this.A0B || A0O() || !this.A0L) {
            return true;
        }
        return false;
    }

    private final boolean A0R(GalleryItem galleryItem) {
        int i;
        UserSession userSession = this.A0c;
        boolean z = false;
        if (galleryItem.A09 == C05F.A0C) {
            z = true;
        }
        boolean A06 = galleryItem.A06();
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            i = remoteMedia.A01;
        } else {
            i = 0;
        }
        if (!z || !A06 || !WGT.A07(userSession, i)) {
            return false;
        }
        AbstractC208329Jr.A09(this.A0Z, userSession, AbstractC43591JPw.A00(1097), AbstractC208329Jr.A00((C55U) this.A0f.A08.A00), null);
        AbstractC34763FTi.A00(this.A0N, userSession);
        return true;
    }

    private final boolean A0S(GalleryItem galleryItem) {
        Medium medium;
        if (galleryItem.A09 != C05F.A0C && (medium = galleryItem.A00) != null && (this.A0f.A08.A00 instanceof C81V) && medium.Cff() && medium.A03 > 1800000) {
            return true;
        }
        return false;
    }

    public static final boolean A0T(C193838i4 c193838i4) {
        if (!(c193838i4.A0f.A08.A00 instanceof C81R) && c193838i4.A07 != C05F.A0C) {
            return false;
        }
        return true;
    }

    public static final boolean A0U(C193838i4 c193838i4) {
        C22P c22p;
        if (c193838i4.A0f.A08.A00 == C208509Kk.A00 && c193838i4.A00 == 1.0f && ((c22p = c193838i4.A03) == C22P.A5C || c22p == C22P.A0a)) {
            if (C18U.A06(C06090Tz.A05, c193838i4.A0c, 36330591486034856L)) {
                c193838i4.A0w.A0L(true);
                return true;
            }
        }
        return false;
    }

    public final void A0W() {
        InterfaceC09390do interfaceC09390do = this.A0r.A0R;
        if (((C189058Yv) interfaceC09390do.getValue()).A04) {
            if (((C189058Yv) interfaceC09390do.getValue()).A0A.get(-1) != null) {
                if (!(!((Folder) r0).A05.isEmpty())) {
                    A0V();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0Y() {
        while (true) {
            C7Db c7Db = this.A0z;
            if (!c7Db.Bsg().isEmpty()) {
                C9NH BJy = c7Db.BJy(0);
                C194278in c194278in = this.A0m;
                GalleryItem galleryItem = BJy.A01;
                List list = C194278in.A0H;
                c194278in.A01(galleryItem, null);
            } else {
                c7Db.clear();
                ((C80K) this.A0c.A01(C80K.class, C80J.A00)).A00.clear();
                return;
            }
        }
    }

    public final void A0Z() {
        List Bsg = this.A0z.Bsg();
        if (Bsg != null && !Bsg.isEmpty()) {
            this.A10.A00();
            A0C(this);
            A0i(false);
        }
    }

    public final void A0a() {
        C86T c86t;
        C86S c86s = this.A10;
        boolean A0N = A0N();
        C05A c05a = c86s.A08;
        if (A0N) {
            c86t = C86T.A02;
        } else {
            c86t = C86T.A04;
        }
        c05a.Egh(c86t);
    }

    public final void A0b() {
        View view;
        Context context;
        int i;
        String string;
        C193988iJ c193988iJ = this.A0v;
        C1811981v c1811981v = c193988iJ.A03.A08;
        if ((c1811981v.A00 instanceof C208509Kk) && c193988iJ.A04()) {
            this.A0P.setVisibility(0);
        }
        if (!this.A0B) {
            this.A0R.setVisibility(8);
            this.A0X.setVisibility(8);
            this.A0d.setVisibility(8);
        } else {
            if (A0T(this)) {
                this.A0X.setVisibility(0);
                this.A0d.setVisibility(4);
                this.A1P.setVisibility(8);
                C193888i9 c193888i9 = this.A0t;
                C195838lR c195838lR = c193888i9.A00;
                if (c195838lR != null) {
                    c195838lR.A00();
                }
                c193888i9.A00 = null;
                View view2 = this.A0G;
                if (view2 == null) {
                    return;
                }
                view2.setBackgroundColor(this.A0O.getColor(R.color.black));
                return;
            }
            View view3 = this.A0G;
            if (view3 != null) {
                view3.setBackgroundColor(this.A0O.getColor(AbstractC53242c7.A0H(this.A0N, R.attr.igds_color_media_background)));
            }
            UserSession userSession = this.A0c;
            if (AbstractC70453Ee.A00(userSession).booleanValue()) {
                this.A1C.A02();
            }
            C193968iH c193968iH = this.A0r;
            if (c193968iH.A0B) {
                this.A0R.setVisibility(0);
                this.A0X.setVisibility(0);
                this.A0d.setVisibility(4);
            } else {
                if (!AbstractC93174Ft.A03(this.A0N)) {
                    this.A0R.setVisibility(8);
                    this.A0X.setVisibility(8);
                    this.A0d.setVisibility(8);
                    this.A1P.setVisibility(8);
                    this.A0t.A00(this.A1b);
                    return;
                }
                int A00 = this.A0m.A00();
                this.A0R.setVisibility(8);
                RecyclerView recyclerView = this.A0X;
                if (A00 == 0) {
                    recyclerView.setVisibility(0);
                    if (c193968iH.A06()) {
                        this.A1P.setVisibility(0);
                        TextView textView = this.A1T;
                        Context context2 = this.A0O;
                        C14360o3.A0B(context2, 0);
                        C06090Tz c06090Tz = C06090Tz.A05;
                        long A01 = C18U.A01(c06090Tz, userSession, 36598120705952884L);
                        Long valueOf = Long.valueOf(A01);
                        if (A01 == -1) {
                            string = context2.getString(2131963137);
                        } else {
                            string = context2.getString(2131963134, valueOf);
                        }
                        C14360o3.A0A(string);
                        String string2 = context2.getString(2131963135);
                        C14360o3.A07(string2);
                        textView.setText(LFH.A00(context2, userSession, string, string2, C18U.A04(c06090Tz, userSession, 36882653697278411L)));
                        return;
                    }
                    IgTextView igTextView = this.A0d;
                    int i2 = ((C194478j8) this.A1I.getValue()).A03.A01.A02;
                    if (i2 != -9) {
                        if (i2 != -3) {
                            context = this.A0O;
                            i = 2131963140;
                            if (i2 != -2) {
                                i = 2131963133;
                            }
                        } else {
                            context = this.A0O;
                            i = 2131963141;
                        }
                    } else {
                        context = this.A0O;
                        i = 2131963138;
                    }
                    igTextView.setText(context.getString(i));
                    igTextView.setVisibility(0);
                    if (!(c1811981v.A00 instanceof C208509Kk) || !c193988iJ.A04()) {
                        return;
                    }
                    this.A0P.setVisibility(4);
                    return;
                }
                recyclerView.setVisibility(0);
                this.A0d.setVisibility(4);
                this.A1P.setVisibility(8);
                view = this.A01;
                if (view == null) {
                    return;
                }
                view.setVisibility(8);
            }
        }
        view = this.A1P;
        view.setVisibility(8);
    }

    public final void A0c(Bitmap bitmap, GalleryItem galleryItem, int i) {
        if (A0S(galleryItem)) {
            C9GR.A06(this.A0O, 2131976698);
            return;
        }
        Integer num = galleryItem.A09;
        Integer num2 = C05F.A0C;
        if (num == num2 && galleryItem.A00 == null) {
            A0A(galleryItem, this.A0r.A04());
        } else {
            Medium medium = galleryItem.A00;
            if (medium != null) {
                medium.A0G.A01 = this.A0r.A04();
            }
        }
        this.A0m.A01(galleryItem, bitmap);
        if (num != num2) {
            this.A0q.A00(galleryItem, ((C194478j8) this.A1I.getValue()).A03.A01.A00(), "TAP", i, this.A0z.Ccf(galleryItem));
        }
        if (!this.A0z.Ccf(galleryItem)) {
            return;
        }
        A08(galleryItem, i);
    }

    public final void A0e(final String str) {
        int i;
        IgTextView igTextView = this.A0e;
        igTextView.setText(str);
        AbstractC010103p.A0B(igTextView, new C02V() { // from class: X.8lO
            @Override // X.C02V
            public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setText(C193838i4.this.A0O.getString(2131952886, str));
            }
        });
        View view = this.A1Q;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources resources = this.A0O.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        Drawable drawable = igTextView.getCompoundDrawables()[2];
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding));
        layoutParams.width = Math.min(((int) textPaint.measureText(str)) + i + (dimensionPixelSize * 2) + dimensionPixelSize2, ((Number) this.A1J.getValue()).intValue()) + igTextView.getPaddingStart();
        view.setLayoutParams(layoutParams);
    }

    public final void A0g(List list, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        if (C18U.A06(C06090Tz.A05, this.A0c, 36327297246247397L)) {
            this.A0m.A00 = new C9R7(this);
        }
        C194278in c194278in = this.A0m;
        if (z) {
            C193958iG c193958iG = c194278in.A08;
            C16920sk A0E = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E, 0);
            c193958iG.A07 = A0E;
        }
        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(list, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66621UPi c66621UPi = (C66621UPi) it.next();
            SimpleImageUrl simpleImageUrl = new SimpleImageUrl(c66621UPi.A07);
            C25821No.A00().A0J(simpleImageUrl, c194278in.A03.toString()).A01();
            String str = c66621UPi.A06;
            SimpleImageUrl simpleImageUrl2 = new SimpleImageUrl(str);
            RemoteMedia A00 = WGT.A00(c66621UPi);
            GalleryItem galleryItem = new GalleryItem(null, null, null, A00, null, simpleImageUrl2, null, null, C05F.A0C, A00.A06, -1);
            String str2 = c66621UPi.A05;
            int i = 1;
            if (c66621UPi.A09) {
                i = 3;
            }
            int i2 = c66621UPi.A01;
            C193958iG c193958iG2 = c194278in.A08;
            linkedHashMap.put(str2, new C195608l0(galleryItem, simpleImageUrl, str2, str, interfaceC16660sJ, i, i2, c193958iG2.A0H.CNK(galleryItem), c193958iG2.A0A, false));
        }
        C193958iG c193958iG3 = c194278in.A08;
        LinkedHashMap A04 = AbstractC06930Yk.A04(c193958iG3.A07, linkedHashMap);
        C14360o3.A0B(A04, 0);
        c193958iG3.A07 = A04;
        c194278in.A02(c194278in.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0h(boolean r7) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193838i4.A0h(boolean):void");
    }

    public final void A0i(boolean z) {
        boolean z2;
        Object value;
        C86T c86t;
        int intValue = this.A07.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue != 2) {
                    throw new RuntimeException();
                }
                return;
            }
            C194278in c194278in = this.A0m;
            C193988iJ c193988iJ = this.A0v;
            if (c193988iJ.A00()) {
                z2 = ((Boolean) c193988iJ.A00.A02).booleanValue();
            } else {
                z2 = false;
            }
            C86S c86s = this.A10;
            c194278in.A03(z, z2, c86s.A02((C55U) this.A0f.A08.A00));
            C187318Ry c187318Ry = this.A16;
            if (z) {
                int i = 0;
                c187318Ry.A0B(true);
                if (A0P()) {
                    i = 5;
                }
                c187318Ry.A00 = i;
            } else {
                c187318Ry.A0A(true);
            }
            C05A c05a = c86s.A08;
            do {
                value = c05a.getValue();
                c86t = C86T.A04;
                if (value != c86t) {
                    if (z) {
                        c86t = C86T.A03;
                    } else {
                        c86t = C86T.A02;
                    }
                }
            } while (!c05a.AIi(value, c86t));
            A0G(this);
            return;
        }
        C194278in c194278in2 = this.A0m;
        List list = C194278in.A0H;
        c194278in2.A03(false, false, false);
        C194148iZ c194148iZ = this.A0o.A06;
        if (c194148iZ == null) {
            C14360o3.A0F("storyDraftsAdapter");
            throw C00O.createAndThrow();
        }
        c194148iZ.A02(z);
        this.A16.A0A(true);
    }

    public final void A0j(boolean z) {
        this.A0L = z;
        if (z) {
            this.A0z.A96(this);
        }
        if (!AbstractC1822686m.A01(this.A0c) && !this.A10.A02((C55U) this.A0f.A08.A00)) {
            A0i(false);
        }
    }

    public final void A0k(boolean z) {
        this.A0C = z;
        C8YY c8yy = this.A0w;
        if (z) {
            c8yy.A0Y.E4u(new Object());
            c8yy.A0N(true);
        } else {
            C22C A01 = AnonymousClass229.A01(c8yy.A0E);
            C55U c55u = (C55U) c8yy.A0F.A08.A00;
            C18920wW c18920wW = ((C22F) A01).A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_gallery_enter_button_tap");
            if (A00.isSampled()) {
                String str = ((C22F) A01).A04.A0L;
                if (str != null) {
                    A00.A8R(c55u.A00, "camera_destination");
                    A00.AAP("camera_session_id", str);
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.AAQ(AbstractC449424y.A07(((C22F) A01).A00, ((C22F) A01).A03), "system_info");
                    A00.Cht();
                } else {
                    AbstractC12120kG.A01("IgCameraLoggerImpl", "logGalleryEnterButtonTap() cameraSession is null");
                }
            }
            ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = c8yy.A0K.A0N;
            if (viewOnTouchListenerC1829389o != null && !viewOnTouchListenerC1829389o.A0f) {
                if (!viewOnTouchListenerC1829389o.A0f) {
                    viewOnTouchListenerC1829389o.A06();
                }
            } else if (!((InterfaceC184358Fz) c8yy.A0L.A00.A00()).DIr()) {
                c8yy.A0Y.E4u(new Object());
                c8yy.A0N(true);
            }
        }
        A0j(this.A0L);
    }

    @Override // X.InterfaceC193868i7
    public final Integer AtC() {
        return this.A0r.A0T;
    }

    @Override // X.InterfaceC193868i7
    public final boolean CLK() {
        C195478kn c195478kn;
        C193968iH c193968iH = this.A0r;
        if (!c193968iH.A06() || (c195478kn = (C195478kn) c193968iH.A0N.A0F.A02()) == null || !c195478kn.A03) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC193848i5
    public final void CMT(boolean z) {
        C55982hj c55982hj = (C55982hj) this.A1H.getValue();
        if (z) {
            c55982hj.A06(0.0d);
        } else {
            c55982hj.A08(0.0d, true);
        }
    }

    @Override // X.InterfaceC193858i6
    public final boolean CVK() {
        C48625Lf1 c48625Lf1;
        if (this.A0I == C05F.A0C || (((c48625Lf1 = this.A0w.A00) != null && c48625Lf1.A00(null).getParent() != null) || this.A13.A04 != null)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC193848i5
    public final boolean CWE() {
        return this.A0C;
    }

    @Override // X.InterfaceC193848i5
    public final boolean CWF() {
        return this.A1M;
    }

    @Override // X.InterfaceC193868i7
    public final boolean CYh() {
        return this.A0r.A06();
    }

    @Override // X.InterfaceC187288Rv
    public final boolean Ceo() {
        C89P c89p = this.A13;
        boolean z = false;
        if (c89p.A04 != null) {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (c89p.A0N() && c89p.A0A != null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC193848i5
    public final void DDr(boolean z) {
        if (!z) {
            A0V();
        }
    }

    @Override // X.InterfaceC193848i5
    public final void DEt() {
        if (this.A07 == C05F.A01) {
            if (AbstractC1822686m.A01(this.A0c)) {
                return;
            }
        } else if (!A0T(this)) {
            return;
        } else {
            this.A0M = false;
        }
        A0h(false);
    }

    @Override // X.InterfaceC195388ke
    public final void DNr(GalleryItem galleryItem, boolean z) {
        if (this.A0z.Bsg().isEmpty() && !this.A10.A03((C55U) this.A0f.A08.A00)) {
            A0i(false);
        }
    }

    @Override // X.InterfaceC195388ke
    public final void DU5() {
        if (this.A0m.A00() != 0) {
            GridLayoutManager gridLayoutManager = this.A0V;
            int A02 = AbstractC72193Ls.A02(gridLayoutManager);
            for (int A01 = AbstractC72193Ls.A01(gridLayoutManager); A01 <= A02; A01++) {
                Object A0W = this.A0X.A0W(A01, false);
                if (A0W instanceof InterfaceC177987vX) {
                    ((InterfaceC177987vX) A0W).DU5();
                }
            }
        }
    }

    @Override // X.InterfaceC1829689r
    public final void Du2(float f, float f2) {
        this.A0I = C05F.A00;
    }

    @Override // X.InterfaceC187288Rv
    public final void Dve(C26086BgF c26086BgF) {
        C7Db c7Db = this.A0z;
        int size = c7Db.Bsg().size();
        if (size != 0) {
            if (size == 1) {
                AnonymousClass229.A01(this.A0c).A0J.A06(this.A14, "reels_gallery_next_button_tap", size);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < size; i++) {
                if (c7Db.Bsi(i).A00 != null || (this.A0m.A08.A0A && this.A0r.A08 != null)) {
                    arrayList.add(c7Db.BJy(i).A01);
                    arrayList2.add(c7Db.Bsi(i));
                    Medium medium = c7Db.BJy(i).A01.A00;
                    if (medium != null) {
                        this.A1V.A02.A01.A0o.add(medium);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RemoteMedia remoteMedia = ((GalleryItem) it.next()).A04;
                if (remoteMedia != null) {
                    arrayList3.add(remoteMedia);
                }
            }
            if (!arrayList3.isEmpty()) {
                A0H.A00(this.A0N, this.A15, arrayList3, new ME5(26, arrayList, this, arrayList2));
            } else {
                A0L(this, arrayList, arrayList2);
            }
        }
    }

    @Override // X.InterfaceC193868i7
    public final void EST(Integer num) {
        this.A0r.A0T = num;
    }

    @Override // X.InterfaceC187288Rv
    public final boolean Ejf() {
        if (this.A13.A04 == null && this.A0f.A08.A00 == C81U.A00 && !this.A0v.A00() && this.A12.A0s()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r2 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A0c, 36322946444176141L) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        if (r1 != (-1)) goto L33;
     */
    @Override // X.InterfaceC193858i6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean FAE(float r8, float r9, float r10) {
        /*
            r7 = this;
            java.lang.Integer r1 = r7.A0I
            java.lang.Integer r0 = X.C05F.A00
            r2 = 1
            if (r1 == r0) goto Ld
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto Lc
            r2 = 0
        Lc:
            return r2
        Ld:
            float r0 = r7.A00
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r5 = 0
            if (r0 != 0) goto L16
            r5 = 1
        L16:
            X.89P r4 = r7.A13
            X.4xq r0 = r4.A04
            if (r0 != 0) goto L64
            boolean r0 = r7.A1M
            if (r0 == 0) goto L2b
            if (r5 == 0) goto L2b
            boolean r2 = r7.A1c
            if (r2 == 0) goto L65
        L26:
            java.lang.Integer r0 = X.C05F.A01
        L28:
            r7.A0I = r0
            return r2
        L2b:
            X.8YY r0 = r7.A0w
            boolean r0 = r0.A0Q()
            if (r0 != 0) goto L64
            X.81l r0 = r7.A0f
            X.81v r3 = r0.A08
            java.lang.Object r1 = r3.A00
            X.81S r0 = X.C81S.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto La1
            java.lang.Object r1 = r3.A00
            X.81p r0 = X.C1811381p.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto La1
        L4b:
            X.4xq r0 = r4.A04
            if (r0 != 0) goto L64
            X.8lA r0 = r7.A1E
            boolean r0 = r0.A04
            if (r0 == 0) goto L68
            com.instagram.common.session.UserSession r4 = r7.A0c
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36322946444176141(0x810b8700002b0d, double:3.034115819838061E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto L68
        L64:
            r2 = 0
        L65:
            java.lang.Integer r0 = X.C05F.A0C
            goto L28
        L68:
            float r1 = r7.A00
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L26
            android.view.ViewGroup r0 = r7.A0S
            int r0 = r0.getTop()
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L26
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L64
            X.8iJ r0 = r7.A0v
            boolean r0 = r0.A04()
            if (r0 == 0) goto L8c
            boolean r0 = r7.A0K
            if (r0 != 0) goto L8c
            goto L64
        L8c:
            int r1 = r7.A0F
            androidx.recyclerview.widget.GridLayoutManager r0 = r7.A0V
            if (r1 != r2) goto L9c
            int r1 = X.AbstractC72193Ls.A01(r0)
        L96:
            if (r1 == 0) goto L26
            r0 = -1
            if (r1 != r0) goto L64
            goto L26
        L9c:
            int r1 = X.AbstractC72193Ls.A00(r0)
            goto L96
        La1:
            if (r5 == 0) goto L4b
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193838i4.FAE(float, float, float):boolean");
    }

    @Override // X.InterfaceC187288Rv
    public final boolean getCanHaveEmptySegments() {
        if (this.A13.A04 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC193868i7
    public final int getColumnCount() {
        return this.A0F;
    }

    private final void A01() {
        if (!A0T(this)) {
            Activity activity = this.A0N;
            UserSession userSession = this.A0c;
            if (AbstractC193398hK.A00(activity, userSession)) {
                IgFrameLayout igFrameLayout = this.A04;
                if (igFrameLayout != null) {
                    KKF kkf = new KKF(activity);
                    AbstractC46687Kl4.A00(activity, userSession, kkf, true, true);
                    igFrameLayout.addView(kkf);
                    return;
                }
                return;
            }
        }
        IgFrameLayout igFrameLayout2 = this.A04;
        if (igFrameLayout2 == null || igFrameLayout2.getChildCount() <= 0) {
            return;
        }
        igFrameLayout2.removeAllViews();
    }

    public static final void A06(Bitmap bitmap, GalleryItem galleryItem, C193838i4 c193838i4) {
        Medium medium;
        InterfaceC16820sZ me5;
        int i;
        C8MX c8mx;
        String str;
        if (c193838i4.A0S(galleryItem)) {
            C9GR.A06(c193838i4.A0O, 2131976698);
            C447724h c447724h = AnonymousClass229.A01(c193838i4.A0c).A0J;
            C5JK c5jk = c193838i4.A14;
            if (c447724h.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
                c447724h.A01 = c447724h.A04.A06(CancelReason.SYSTEM_CANCELLED, "Video is too long", 585185740, c447724h.A01);
                return;
            }
            return;
        }
        Medium medium2 = galleryItem.A00;
        if (medium2 != null) {
            medium2.A0G.A01 = c193838i4.A0r.A04();
        }
        Integer num = null;
        if (!c193838i4.A0C) {
            C1810981l c1810981l = c193838i4.A0f;
            if (c1810981l.A0W(C81W.A0T)) {
                if (galleryItem.A06()) {
                    C9GR.A01(c193838i4.A0N, null, 2131963146, 1);
                } else {
                    Integer num2 = galleryItem.A09;
                    if (num2 == C05F.A0C) {
                        c193838i4.A0B(galleryItem, new ME5(24, galleryItem, c193838i4, bitmap));
                    } else {
                        int intValue = num2.intValue();
                        if (intValue != 0) {
                            if (intValue == 5) {
                                C183978Ee c183978Ee = galleryItem.A07;
                                if (c183978Ee == null || (str = c183978Ee.A06()) == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalArgumentException("Unsupported media type for Layout gallery upload.");
                            }
                        } else {
                            Medium medium3 = galleryItem.A00;
                            if (medium3 != null) {
                                str = medium3.A0X;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        C8YY c8yy = c193838i4.A0w;
                        if (bitmap != null) {
                            C14360o3.A0B(str, 1);
                            AbstractC25651Mw.A00(c8yy.A0E).E4s(new C191178dG(bitmap, str));
                            c8yy.A0L(true);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                AnonymousClass229.A01(c193838i4.A0c).A0J.A00(c193838i4.A14);
                return;
            }
            C1811981v c1811981v = c1810981l.A08;
            if (c1811981v.A00 instanceof C81V) {
                C86S c86s = c193838i4.A10;
                c86s.A01 = new WeakReference(bitmap);
                if (galleryItem.A09 != C05F.A0C) {
                    Medium medium4 = galleryItem.A00;
                    if (medium4 != null) {
                        num = Integer.valueOf(medium4.A05);
                    }
                    c86s.A00 = num;
                } else if (galleryItem.A00 == null) {
                    me5 = new B61(25, galleryItem, c193838i4);
                    c193838i4.A0B(galleryItem, me5);
                    return;
                }
                List singletonList = Collections.singletonList(galleryItem);
                C14360o3.A07(singletonList);
                A0J(c193838i4, singletonList);
                return;
            }
            Medium medium5 = galleryItem.A00;
            if (medium5 != null && galleryItem.A06() && (i = medium5.A03) < 15000) {
                if ((medium5.A0B * 1.0f) / medium5.A04 > 0.5625f && (c1811981v.A00 instanceof C208509Kk) && (c8mx = c193838i4.A19) != null) {
                    c8mx.A00(medium5.A0X, i);
                }
            }
        }
        c193838i4.A1V.A02.A01.A0V = !c193838i4.A0C;
        int intValue2 = galleryItem.A09.intValue();
        if (intValue2 != 2) {
            if (intValue2 != 0) {
                if (intValue2 != 5) {
                    if (intValue2 == 6) {
                        if (bitmap == null) {
                            return;
                        }
                        C193768hw c193768hw = c193838i4.A0o;
                        C195868lW c195868lW = galleryItem.A08;
                        if (c195868lW != null) {
                            c193768hw.A01(bitmap, null, c195868lW);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new UnsupportedOperationException("Unhandled media thumbnail item type.");
                }
                if (bitmap == null) {
                    return;
                }
                C193768hw c193768hw2 = c193838i4.A0o;
                C183978Ee c183978Ee2 = galleryItem.A07;
                if (c183978Ee2 != null) {
                    c193768hw2.A00(bitmap, null, c183978Ee2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (bitmap == null) {
                return;
            }
            medium = galleryItem.A00;
            if (medium == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            medium = galleryItem.A00;
            if (medium == null) {
                me5 = new ME5(23, galleryItem, c193838i4, bitmap);
                c193838i4.A0B(galleryItem, me5);
                return;
            } else if (bitmap == null) {
                return;
            }
        }
        A05(bitmap, medium, c193838i4);
    }

    public static final void A0D(C193838i4 c193838i4) {
        GridLayoutManager gridLayoutManager;
        C194418j2 c194418j2;
        if (A0T(c193838i4)) {
            gridLayoutManager = c193838i4.A0V;
            gridLayoutManager.A1v(3);
            c194418j2 = new C194418j2(((C194218ig) c193838i4.A1C.A07.getValue()).A01, 3);
        } else {
            if (c193838i4.A0F != 3) {
                gridLayoutManager = c193838i4.A0V;
                gridLayoutManager.A1v(3);
                C66362zD c66362zD = c193838i4.A0m.A06;
                int i = gridLayoutManager.A00;
                C14360o3.A0B(c66362zD, 0);
                c194418j2 = new C194418j2(c66362zD, i);
            }
            c193838i4.A0F = c193838i4.A0V.A00;
        }
        gridLayoutManager.A01 = c194418j2;
        c193838i4.A0F = c193838i4.A0V.A00;
    }

    private final void A0M(Integer num) {
        C7Db c7Db;
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                c7Db = this.A0z;
                i = this.A16.A0F;
            } else {
                throw new RuntimeException();
            }
        } else {
            c7Db = this.A0z;
            C89P c89p = this.A13;
            if (c89p.A04 != null) {
                if (c89p.A0N() && c89p.A0A != null) {
                    i = 1;
                } else {
                    i = ((Number) c89p.A0D.getValue()).intValue();
                }
            } else {
                i = 10;
                if (this.A0f.A08.A00 instanceof C81V) {
                    i = 50;
                }
            }
        }
        c7Db.EYg(i);
    }

    public final void A0V() {
        if (A0T(this)) {
            A0h(false);
            A03();
            return;
        }
        if (AbstractC93174Ft.A03(this.A0N)) {
            IgTextView igTextView = this.A0o.A03;
            if (igTextView == null) {
                C14360o3.A0F("draftsTabView");
                throw C00O.createAndThrow();
            }
            if (igTextView.isSelected()) {
                A0h(true);
            } else if (!this.A1O || this.A0B) {
                this.A0r.A05();
            }
        } else if (this.A0B) {
            this.A0r.A0B = false;
            A0b();
            C193888i9 c193888i9 = this.A0t;
            if (!c193888i9.A02) {
                c193888i9.A02 = true;
                AbstractC93174Ft.A01(c193888i9.A03, c193888i9);
            }
        }
        C193968iH c193968iH = this.A0r;
        AbstractC60332pG.A00(c193968iH.A0G, c193968iH.A0J, c193968iH.A0P).A02();
    }

    @Override // X.InterfaceC187208Rn
    public final void DNc(int i, int i2) {
        if (A0P()) {
            C194278in c194278in = this.A0m;
            c194278in.A08.A01(new B8U(c194278in, 12));
        }
    }

    @Override // X.InterfaceC187208Rn
    public final void DNz() {
        A02();
    }

    @Override // X.InterfaceC187208Rn
    public final void DO2(List list) {
        A02();
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        A01();
        this.A0r.A00 = (int) (System.currentTimeMillis() / 1000);
        if (this.A0B) {
            A0I(this, "gallery_resume");
            C193888i9 c193888i9 = this.A0t;
            if (AbstractC93174Ft.A03(c193888i9.A03)) {
                c193888i9.A04.A00();
                C195838lR c195838lR = c193888i9.A00;
                if (c195838lR != null) {
                    c195838lR.A00();
                }
                c193888i9.A00 = null;
                c193888i9.A05.A0V();
            }
            A0V();
        }
    }

    @Override // X.InterfaceC187208Rn
    public final void DNF(C9NH c9nh, int i) {
        A02();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x052a A[Catch: all -> 0x072d, TryCatch #0 {all -> 0x072d, blocks: (B:16:0x0338, B:18:0x0414, B:19:0x0416, B:20:0x0418, B:23:0x0470, B:25:0x052a, B:26:0x052e, B:28:0x0591, B:29:0x05a0, B:31:0x05e8, B:32:0x0603, B:51:0x06f8, B:52:0x0712, B:53:0x0721, B:55:0x0727), top: B:15:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0591 A[Catch: all -> 0x072d, TryCatch #0 {all -> 0x072d, blocks: (B:16:0x0338, B:18:0x0414, B:19:0x0416, B:20:0x0418, B:23:0x0470, B:25:0x052a, B:26:0x052e, B:28:0x0591, B:29:0x05a0, B:31:0x05e8, B:32:0x0603, B:51:0x06f8, B:52:0x0712, B:53:0x0721, B:55:0x0727), top: B:15:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05e8 A[Catch: all -> 0x072d, TryCatch #0 {all -> 0x072d, blocks: (B:16:0x0338, B:18:0x0414, B:19:0x0416, B:20:0x0418, B:23:0x0470, B:25:0x052a, B:26:0x052e, B:28:0x0591, B:29:0x05a0, B:31:0x05e8, B:32:0x0603, B:51:0x06f8, B:52:0x0712, B:53:0x0721, B:55:0x0727), top: B:15:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x06f8 A[Catch: all -> 0x072d, TryCatch #0 {all -> 0x072d, blocks: (B:16:0x0338, B:18:0x0414, B:19:0x0416, B:20:0x0418, B:23:0x0470, B:25:0x052a, B:26:0x052e, B:28:0x0591, B:29:0x05a0, B:31:0x05e8, B:32:0x0603, B:51:0x06f8, B:52:0x0712, B:53:0x0721, B:55:0x0727), top: B:15:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0712 A[Catch: all -> 0x072d, TryCatch #0 {all -> 0x072d, blocks: (B:16:0x0338, B:18:0x0414, B:19:0x0416, B:20:0x0418, B:23:0x0470, B:25:0x052a, B:26:0x052e, B:28:0x0591, B:29:0x05a0, B:31:0x05e8, B:32:0x0603, B:51:0x06f8, B:52:0x0712, B:53:0x0721, B:55:0x0727), top: B:15:0x0338 }] */
    /* JADX WARN: Type inference failed for: r13v4, types: [X.8j3, X.1I4] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Object, X.8iY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C193838i4(android.app.Activity r62, android.view.ViewGroup r63, android.view.ViewGroup r64, android.widget.ImageView r65, X.AbstractC59962oe r66, X.InterfaceC11380iw r67, X.C8SF r68, com.instagram.common.session.UserSession r69, X.C1810981l r70, X.AbstractC193818i2 r71, X.C8J0 r72, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r73, X.AnonymousClass840 r74, final X.C193768hw r75, X.C188888Ye r76, X.C8YY r77, X.C193738ht r78, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r79, X.C86S r80, X.InterfaceC1810081c r81, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r82, X.C8A7 r83, X.C89P r84, X.C5JK r85, X.EnumC193878i8 r86, X.C8CS r87, X.C8MX r88, com.instagram.model.direct.DirectShareTarget r89, X.C193798hz r90, X.C189058Yv r91, java.lang.String r92, boolean r93, boolean r94, boolean r95, boolean r96, boolean r97, boolean r98, boolean r99) {
        /*
            Method dump skipped, instructions count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193838i4.<init>(android.app.Activity, android.view.ViewGroup, android.view.ViewGroup, android.widget.ImageView, X.2oe, X.0iw, X.8SF, com.instagram.common.session.UserSession, X.81l, X.8i2, X.8J0, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel, X.840, X.8hw, X.8Ye, X.8YY, X.8ht, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel, X.86S, X.81c, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel, X.8A7, X.89P, X.5JK, X.8i8, X.8CS, X.8MX, com.instagram.model.direct.DirectShareTarget, X.8hz, X.8Yv, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
