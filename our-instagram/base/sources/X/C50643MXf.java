package X;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.ui.LoadingSpinnerView;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.MXf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50643MXf implements InterfaceC11380iw, InterfaceC60072op {
    public static final String __redex_internal_original_name = "ClipsReviewController";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Surface A06;
    public TextureView A07;
    public InterfaceC58362lv A08;
    public C54671OCx A09;
    public C8RS A0A;
    public InterfaceC58267PsB A0B;
    public C9TN A0C;
    public C84B A0D;
    public AudioOverlayTrack A0E;
    public BOM A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final int A0K;
    public final Context A0L;
    public final View A0M;
    public final ViewGroup A0N;
    public final TextView A0O;
    public final Fragment A0P;
    public final UserSession A0Q;
    public final IgImageView A0R;
    public final TargetViewSizeProvider A0S;
    public final C86S A0T;
    public final C9L5 A0U;
    public final MXj A0V;
    public final C50648MXm A0W;
    public final C8RR A0X;
    public final C183378Bk A0Y;
    public final C8BP A0Z;
    public final ClipsCreationViewModel A0a;
    public final C8JS A0b;
    public final C184108Ez A0c;
    public final ClipsReviewProgressBar A0d;
    public final LoadingSpinnerView A0e;
    public final C49602Pt A0f;
    public final Runnable A0g;
    public final ConstraintLayout A0h;
    public final InterfaceC11380iw A0i;
    public final CameraToolMenuItem A0j;
    public final InterfaceC58111Ppa A0k;
    public final C8R0 A0l;
    public final C9L6 A0m;
    public final InterfaceC187208Rn A0n;
    public final InterfaceC187288Rv A0o;
    public final C187318Ry A0p;
    public final ExecutorService A0q;

    public static final int A00(C50643MXf c50643MXf, int i) {
        if (i != -1) {
            return NsX.A00(c50643MXf.A0V, i);
        }
        return AbstractC25226BEj.A05(c50643MXf.A0D.A01);
    }

    public static final void A03(ImageUrl imageUrl, C50643MXf c50643MXf) {
        CameraToolMenuItem cameraToolMenuItem;
        BOM bom;
        BOM bom2 = null;
        if (imageUrl != null && (bom = c50643MXf.A0F) != null) {
            bom.A04(imageUrl, null);
            cameraToolMenuItem = c50643MXf.A0j;
            bom2 = bom;
        } else {
            cameraToolMenuItem = c50643MXf.A0j;
        }
        cameraToolMenuItem.A05 = bom2;
        cameraToolMenuItem.A06 = null;
        cameraToolMenuItem.invalidate();
    }

    public static final void A0A(C50643MXf c50643MXf, boolean z) {
        c50643MXf.A09 = null;
        C2GT c2gt = c50643MXf.A0a.A0C;
        InterfaceC58362lv interfaceC58362lv = c50643MXf.A08;
        if (interfaceC58362lv == null) {
            interfaceC58362lv = new MY1(c50643MXf, 5);
            c50643MXf.A08 = interfaceC58362lv;
        }
        c2gt.A08(interfaceC58362lv);
        c50643MXf.A0N.removeCallbacks(c50643MXf.A0g);
        InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.reset();
        }
        c50643MXf.A0R.setImageDrawable(null);
        c50643MXf.A0A.CMH(z);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "trim_editor";
    }

    public C50643MXf(Context context, ViewGroup viewGroup, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C86S c86s, C9L5 c9l5, C183378Bk c183378Bk, C8BP c8bp, C8JS c8js, C184108Ez c184108Ez, C49602Pt c49602Pt, ExecutorService executorService) {
        AbstractC167007dF.A1H(c183378Bk, 5, executorService);
        C14360o3.A0B(c8bp, 13);
        this.A0L = context;
        this.A0P = fragment;
        this.A0Q = userSession;
        this.A0N = viewGroup;
        this.A0Y = c183378Bk;
        this.A0f = c49602Pt;
        this.A0q = executorService;
        this.A0c = c184108Ez;
        this.A0U = c9l5;
        this.A0i = interfaceC11380iw;
        this.A0S = targetViewSizeProvider;
        this.A0b = c8js;
        this.A0Z = c8bp;
        this.A0T = c86s;
        C50645MXi c50645MXi = new C50645MXi(this);
        this.A0k = c50645MXi;
        MXg mXg = new MXg(this);
        this.A0l = mXg;
        C50646MXk c50646MXk = new C50646MXk(this);
        this.A0n = c50646MXk;
        C50647MXl c50647MXl = new C50647MXl(this);
        this.A0o = c50647MXl;
        this.A0g = new RunnableC50644MXh(this);
        this.A0V = new MXj(this);
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC166997dE.A0S(viewGroup, R.id.video_review_trim_mode);
        this.A0h = constraintLayout;
        this.A0j = (CameraToolMenuItem) AbstractC166997dE.A0R(constraintLayout, R.id.trim_music_button);
        this.A0e = (LoadingSpinnerView) AbstractC166997dE.A0R(viewGroup, R.id.clips_review_spinner);
        this.A0R = AbstractC167007dF.A0T(viewGroup, R.id.clips_review_loading_thumbnail);
        this.A0d = (ClipsReviewProgressBar) AbstractC166997dE.A0R(viewGroup, R.id.clips_review_progress_bar);
        this.A0O = AbstractC167007dF.A0N(viewGroup, R.id.clips_count);
        C50648MXm c50648MXm = new C50648MXm(AbstractC31176DnK.A0C(viewGroup, R.id.clips_review_play_mode), c50645MXi);
        this.A0W = c50648MXm;
        this.A0X = new C8RR(constraintLayout, fragment, userSession, mXg, c8js, c49602Pt);
        this.A0K = context.getResources().getInteger(android.R.integer.config_shortAnimTime);
        C9L6 c9l6 = new C9L6();
        this.A0m = c9l6;
        this.A0p = new C187318Ry(fragment.requireActivity(), null, interfaceC11380iw, userSession, (TouchInterceptorFrameLayout) AbstractC166997dE.A0R(viewGroup, R.id.clips_edit_thumbnail_tray), null, c9l6, c50647MXl, null, null, MXW.A00, C187308Rx.A00, 0.5625f, 2131961124, 1, context.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size), AbstractC167017dG.A0A(context), R.color.black_60_transparent, R.dimen.abc_button_inset_vertical_material, false, true, true, false, false, false);
        this.A0M = AbstractC166997dE.A0S(viewGroup, R.id.clips_play_button);
        this.A0a = (ClipsCreationViewModel) AbstractC50522MSa.A0K(fragment, fragment.requireActivity(), userSession);
        this.A0A = c50648MXm;
        this.A0D = new C84B(C16930sl.A00, false);
        this.A03 = -1;
        this.A01 = Integer.MAX_VALUE;
        this.A04 = -1;
        viewGroup.setOnTouchListener(new MXn(this));
        C2GT c2gt = this.A0a.A0K.A06;
        Fragment fragment2 = this.A0P;
        AbstractC31180DnO.A1F(fragment2, c2gt, C57747Pja.A00(this, 6), 54);
        this.A0F = new BOM(context, null, context.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.clips_control_music_button_radius), context.getResources().getDimensionPixelSize(R.dimen.clips_control_music_button_stroke_width), AbstractC166997dE.A01(context), AbstractC167017dG.A04(context), 0, false);
        MY1.A00(fragment2, this.A0b.A0D, this, 4);
        c9l6.A96(c50646MXk);
        MY1.A01(fragment, ((C87G) AbstractC31175DnJ.A0A(fragment).A00(C87G.class)).A00("trim").A09, this, 3);
    }

    public static final int A01(C50643MXf c50643MXf, InterfaceC58267PsB interfaceC58267PsB) {
        if (!c50643MXf.A0H) {
            AbstractC12120kG.A07(__redex_internal_original_name, "getCurrentPositionInMs called while isShowing is false", null);
        } else if (interfaceC58267PsB != null) {
            int currentPosition = interfaceC58267PsB.getCurrentPosition();
            if (Integer.valueOf(currentPosition) != null && currentPosition > 0) {
                return currentPosition;
            }
        }
        return -1;
    }

    private final MediaComposition A02(C115475Kh c115475Kh, int i) {
        DownloadedTrack downloadedTrack;
        ImmutableList of;
        C115475Kh A00 = AbstractC54870OOf.A00(c115475Kh.A0E());
        boolean z = false;
        A00.A09 = 0;
        A00.A08 = c115475Kh.A0G.A04;
        C8RR c8rr = this.A0X;
        if (c8rr.A02 != C05F.A00) {
            A00.A0O = c8rr.A04;
        }
        AudioOverlayTrack audioOverlayTrack = this.A0E;
        if (audioOverlayTrack != null) {
            downloadedTrack = audioOverlayTrack.A06;
        } else {
            downloadedTrack = null;
        }
        C115525Km c115525Km = A00.A0G;
        float f = 0.5625f;
        if (c115525Km.A09 / c115525Km.A05 <= 0.5625f) {
            z = true;
        }
        ImmutableList of2 = ImmutableList.of((Object) AbstractC115515Kl.A03(A00));
        C14360o3.A07(of2);
        if (downloadedTrack == null) {
            of = ImmutableList.of();
        } else {
            of = ImmutableList.of((Object) new C23013ACn(null, null, downloadedTrack.A02, null, 1.0f, 1.0f, downloadedTrack.A00(audioOverlayTrack.A03 + this.A0D.A01(this.A05)), -1, i));
        }
        C14360o3.A0A(of);
        float f2 = 0.0f;
        if (audioOverlayTrack == null) {
            f2 = 1.0f;
        }
        C16930sl c16930sl = C16930sl.A00;
        ImmutableList of3 = ImmutableList.of();
        C14360o3.A0B(of, 2);
        AbstractC167017dG.A1T(c16930sl, of3);
        if (z) {
            C115525Km c115525Km2 = A00.A0G;
            f = c115525Km2.A09 / c115525Km2.A05;
        }
        C57620PhW c57620PhW = C57620PhW.A00;
        C14360o3.A0B(c57620PhW, 2);
        return new MediaComposition(AbstractC23120AKe.A00(null, null, of, of2, of3, null, c16930sl, c16930sl, c57620PhW, f2, f, 0, true, false));
    }

    public static final void A04(C54671OCx c54671OCx, C50643MXf c50643MXf) {
        int i;
        if (c50643MXf.A0H) {
            boolean z = true;
            if (c50643MXf.A0B == null) {
                c50643MXf.A0E();
            } else {
                c50643MXf.A09 = c54671OCx;
                C8RR c8rr = c50643MXf.A0X;
                Integer num = c8rr.A02;
                Integer num2 = C05F.A01;
                if (num == num2 && A0D(c50643MXf)) {
                    if (!C18U.A06(C06090Tz.A05, c50643MXf.A0Q, 36320399530074553L)) {
                        c50643MXf.A0C = null;
                        c50643MXf.A0N.setOnTouchListener(null);
                    }
                }
                if (c54671OCx.A03 == num2 && !c8rr.A04) {
                    z = false;
                }
                int i2 = c54671OCx.A01;
                int i3 = c54671OCx.A00;
                if (c50643MXf.A07 == null) {
                    AbstractC12120kG.A07(__redex_internal_original_name, "textureView is null", null);
                } else {
                    AbstractC13880nE.A0q(c50643MXf.A0N, new RunnableC24843Az3(c50643MXf, i2, i3, z));
                }
                int i4 = c50643MXf.A04;
                if (i4 != -1) {
                    i = c50643MXf.A0V.BsQ(i4);
                    c50643MXf.A04 = -1;
                } else {
                    i = c50643MXf.A02;
                }
                InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
                if (interfaceC58267PsB != null) {
                    interfaceC58267PsB.ESu(c54671OCx, i);
                }
                InterfaceC58267PsB interfaceC58267PsB2 = c50643MXf.A0B;
                if (interfaceC58267PsB2 != null) {
                    interfaceC58267PsB2.EYI(new OyZ(c50643MXf));
                }
                c50643MXf.A0M.setVisibility(8);
                InterfaceC58267PsB interfaceC58267PsB3 = c50643MXf.A0B;
                if (interfaceC58267PsB3 == null) {
                    return;
                }
                interfaceC58267PsB3.start();
                return;
            }
        }
        c50643MXf.A04 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C50643MXf r4) {
        /*
            boolean r0 = r4.A0H
            if (r0 == 0) goto L2c
            android.view.View r1 = r4.A0M
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.music.common.ui.LoadingSpinnerView r1 = r4.A0e
            X.MY0 r0 = X.MY0.A02
            r1.setLoadingStatus(r0)
            android.view.TextureView r1 = r4.A07
            if (r1 == 0) goto L1a
            r0 = 0
            r1.setAlpha(r0)
        L1a:
            X.84B r0 = r4.A0D
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 == 0) goto L2d
            java.lang.String r1 = "ClipsReviewController"
            java.lang.String r0 = "segment store cannot be empty"
            X.AbstractC12120kG.A07(r1, r0, r3)
        L2c:
            return
        L2d:
            X.8RS r1 = r4.A0A
            X.MXm r0 = r4.A0W
            if (r1 != r0) goto L55
            X.84B r1 = r4.A0D
            java.util.List r0 = r1.A01
            int r0 = X.AbstractC25226BEj.A05(r0)
        L3b:
            X.5Kj r2 = r1.A03(r0)
        L3f:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A0R
            r0 = 0
            r1.setVisibility(r0)
            r1.setImageDrawable(r3)
            if (r2 == 0) goto L2c
            android.view.ViewGroup r0 = r4.A0N
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 2
            X.ViewTreeObserverOnGlobalLayoutListenerC55502Okv.A00(r1, r2, r4, r0)
            return
        L55:
            X.8RR r0 = r4.A0X
            if (r1 != r0) goto L5e
            X.84B r1 = r4.A0D
            int r0 = r4.A05
            goto L3b
        L5e:
            r2 = r3
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50643MXf.A05(X.MXf):void");
    }

    public static final void A06(C50643MXf c50643MXf, int i) {
        if (c50643MXf.A0H && c50643MXf.A0B != null && c50643MXf.A09 != null) {
            int A05 = AbstractC25226BEj.A05(c50643MXf.A0D.A01);
            int A00 = A00(c50643MXf, A01(c50643MXf, c50643MXf.A0B));
            int A03 = AbstractC13600mm.A03(i + A00, 0, A05);
            if (A03 != A00 || A03 == 0 || A03 == A05) {
                InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
                if (interfaceC58267PsB != null) {
                    interfaceC58267PsB.seekTo(c50643MXf.A0V.BsQ(A03));
                }
                AbstractC50523MSb.A0f();
                C50648MXm c50648MXm = c50643MXf.A0W;
                int A06 = MSW.A06(c50643MXf.A0D);
                c50648MXm.A00 = A03;
                c50648MXm.A01 = A06;
                C50648MXm.A00(c50648MXm);
            }
        }
    }

    public static final void A07(C50643MXf c50643MXf, int i) {
        C9L6 c9l6 = c50643MXf.A0m;
        c9l6.A00(c50643MXf.A0D);
        C187318Ry c187318Ry = c50643MXf.A0p;
        C8RS c8rs = c50643MXf.A0A;
        C50648MXm c50648MXm = c50643MXf.A0W;
        c187318Ry.A0C(AbstractC167007dF.A1X(c8rs, c50648MXm), false);
        c187318Ry.A09(i);
        int size = c9l6.A01.size();
        c50648MXm.A00 = i;
        c50648MXm.A01 = size;
        C50648MXm.A00(c50648MXm);
    }

    public static final void A08(C50643MXf c50643MXf, int i, int i2, int i3) {
        c50643MXf.A0d.setPlaybackPosition(i);
        MSZ.A10(c50643MXf.A0L, c50643MXf.A0O, Integer.valueOf(i2 + 1), Integer.valueOf(i3), 2131955779);
        C8RS c8rs = c50643MXf.A0A;
        C50648MXm c50648MXm = c50643MXf.A0W;
        if (c8rs == c50648MXm) {
            C9L6 c9l6 = c50643MXf.A0m;
            if (i2 != c9l6.A00 && i2 < c9l6.A01.size()) {
                c50643MXf.A0p.A09(i2);
                c50648MXm.A00 = i2;
                c50648MXm.A01 = i3;
                C50648MXm.A00(c50648MXm);
            }
        }
    }

    public static final void A09(C50643MXf c50643MXf, C115475Kh c115475Kh, int i) {
        C49602Pt c49602Pt;
        AudioOverlayTrack audioOverlayTrack;
        C115525Km c115525Km = c115475Kh.A0G;
        if (c50643MXf.A0J && (audioOverlayTrack = c50643MXf.A0E) != null) {
            audioOverlayTrack.A03 = c50643MXf.A00 + i;
        }
        if (A0D(c50643MXf)) {
            A04(NsW.A00(c50643MXf.A02(c115475Kh, i), c115525Km, c50643MXf.A0X.A02, c115475Kh.A0G.A0F), c50643MXf);
            return;
        }
        AudioOverlayTrack audioOverlayTrack2 = c50643MXf.A0E;
        if (audioOverlayTrack2 == null || (c49602Pt = c50643MXf.A0f) == null) {
            return;
        }
        try {
            boolean z = false;
            if (c50643MXf.A0X.A02 != C05F.A00) {
                z = true;
            }
            File A02 = C80G.A02(c115475Kh, c49602Pt, z);
            Context context = c50643MXf.A0L;
            UserSession userSession = c50643MXf.A0Q;
            ExecutorService executorService = c50643MXf.A0q;
            int BsQ = c50643MXf.A0V.BsQ(c50643MXf.A05);
            C56316Ozd c56316Ozd = new C56316Ozd(c50643MXf, c115525Km);
            AbstractC37302Gc3.A1U(executorService, A02);
            C14120nc.A00().ATO(new C52392NGn(context, userSession, c56316Ozd, audioOverlayTrack2, c49602Pt, A02, executorService, BsQ, i));
        } catch (IOException unused) {
            AKk.A02(c50643MXf.A0L, C05F.A0j, "Failure while burning video with audio", 2131955613);
            A0B(c50643MXf, false);
        }
    }

    public static final void A0B(C50643MXf c50643MXf, boolean z) {
        C8YY A00;
        c50643MXf.A0b.A00();
        C8RR c8rr = c50643MXf.A0X;
        if (c8rr.A02 != C05F.A00) {
            if (z) {
                C8JT.A0g(c50643MXf.A0U.A00);
            }
            int intValue = c8rr.A02.intValue();
            if (intValue != 2) {
                if (intValue != 3) {
                    C9L5 c9l5 = c50643MXf.A0U;
                    if (intValue != 4) {
                        C8JT c8jt = c9l5.A00;
                        C8JT.A0g(c8jt);
                        C188798Xv c188798Xv = c8jt.A0B;
                        if (c188798Xv != null && (A00 = c188798Xv.A00()) != null) {
                            A00.A0N(false);
                        }
                        if (!C8JT.A1R(c8jt)) {
                            C8JT.A0q(c8jt);
                            return;
                        }
                        return;
                    }
                    C8JT c8jt2 = c9l5.A00;
                    C8JT.A0g(c8jt2);
                    C8JT.A10(c8jt2, null, MusicOverlaySearchTab.A07, false);
                    return;
                }
                AbstractC25227BEk.A1B(c50643MXf.A0U.A00.A1B);
                return;
            }
            C8JT.A0g(c50643MXf.A0U.A00);
            return;
        }
        c50643MXf.A04 = c50643MXf.A05;
        C50648MXm c50648MXm = c50643MXf.A0W;
        if (!c50643MXf.A0H) {
            return;
        }
        A0A(c50643MXf, true);
        c50643MXf.A0A = c50648MXm;
        A0C(c50643MXf, true, true);
    }

    public static final boolean A0D(C50643MXf c50643MXf) {
        if (c50643MXf.A0X.A02 != C05F.A00) {
            if (!C18U.A06(C06090Tz.A05, c50643MXf.A0Q, 36320399530074553L)) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        if (this.A0H) {
            this.A0H = false;
            A0G();
            AbstractC125325le A0C = AbstractC125325le.A01(this.A0N, 1).A0C(this.A0K);
            A0C.A0I(0.0f);
            PHM.A00(A0C, this, 2);
        }
    }

    public final void A0F() {
        if (this.A0D.A01.isEmpty()) {
            A0B(this, false);
            return;
        }
        C8RS c8rs = this.A0A;
        if (c8rs == this.A0W) {
            C84B c84b = this.A0D;
            this.A02 = c84b.A01(AbstractC25226BEj.A05(c84b.A01));
            this.A01 = Integer.MAX_VALUE;
            C2GT c2gt = this.A0a.A0C;
            Fragment fragment = this.A0P;
            InterfaceC58362lv interfaceC58362lv = this.A08;
            if (interfaceC58362lv == null) {
                interfaceC58362lv = new MY1(this, 5);
                this.A08 = interfaceC58362lv;
            }
            c2gt.A06(fragment, interfaceC58362lv);
            return;
        }
        C8RR c8rr = this.A0X;
        if (c8rs != c8rr) {
            return;
        }
        C49602Pt c49602Pt = this.A0f;
        if (c49602Pt == null) {
            AbstractC12120kG.A07(__redex_internal_original_name, "clipsDirectoryProvider is null", null);
            return;
        }
        C115475Kh c115475Kh = (C115475Kh) this.A0D.A03(this.A05);
        C115525Km c115525Km = c115475Kh.A0G;
        try {
            boolean z = false;
            if (c8rr.A02 != C05F.A00) {
                z = true;
            }
            File A02 = C80G.A02(c115475Kh, c49602Pt, z);
            int i = c115475Kh.A09;
            this.A02 = i;
            this.A01 = c115475Kh.A08;
            if (this.A0E == null) {
                A04(NsW.A00(A02(c115475Kh, this.A02), c115525Km, c8rr.A02, AbstractC43592JPx.A0x(A02)), this);
            } else {
                A09(this, c115475Kh, i);
            }
        } catch (IOException unused) {
            A0B(this, false);
        }
    }

    public final void A0G() {
        this.A0N.removeCallbacks(this.A0g);
        InterfaceC58267PsB interfaceC58267PsB = this.A0B;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.release();
            this.A0B = null;
        }
    }

    public final void A0H() {
        InterfaceC58267PsB c56266Oyb;
        if (this.A07 == null) {
            TextureView textureView = new TextureView(this.A0L);
            this.A07 = textureView;
            textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC55354OiG(this));
            TextureView textureView2 = this.A07;
            if (textureView2 != null) {
                C56302iJ c56302iJ = new C56302iJ(-1, -1);
                c56302iJ.A0F = 0;
                c56302iJ.A0u = 0;
                c56302iJ.A0M = 0;
                c56302iJ.A0s = 0;
                textureView2.setLayoutParams(c56302iJ);
            }
            this.A0N.addView(this.A07, 0);
        }
        A0G();
        Context context = this.A0L;
        UserSession userSession = this.A0Q;
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A0S).A0K;
        int width = interfaceC1812882f.getWidth();
        int height = interfaceC1812882f.getHeight();
        if (MSX.A0Y(A0D(this) ? 1 : 0).intValue() != 0) {
            c56266Oyb = new C23866AhI(context, userSession);
        } else {
            c56266Oyb = new C56266Oyb(context, userSession, width, height);
        }
        InterfaceC58267PsB interfaceC58267PsB = c56266Oyb;
        this.A0B = interfaceC58267PsB;
        Surface surface = this.A06;
        if (surface != null && interfaceC58267PsB != null) {
            interfaceC58267PsB.setSurface(surface);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A0H) {
            return false;
        }
        if (this.A0A == this.A0X) {
            A0B(this, false);
            return true;
        }
        C8JT.A0g(this.A0U.A00);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r5 >= r6) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0C(X.C50643MXf r7, boolean r8, boolean r9) {
        /*
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            X.84B r0 = r7.A0D
            int r2 = X.MSW.A06(r0)
            r1 = 0
        Lb:
            if (r1 >= r2) goto L1f
            X.84B r0 = r7.A0D
            X.5Kj r0 = r0.A03(r1)
            X.5Kh r0 = (X.C115475Kh) r0
            int r0 = X.MSW.A05(r0)
            X.AbstractC166997dE.A1W(r3, r0)
            int r1 = r1 + 1
            goto Lb
        L1f:
            com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar r1 = r7.A0d
            int r0 = r7.A03
            r1.A02(r3, r0)
            X.84B r0 = r7.A0D
            int r6 = X.MSW.A06(r0)
            int r5 = r7.A04
            r3 = 1
            r4 = 0
            r0 = -1
            if (r5 == r0) goto L38
            if (r5 < 0) goto L38
            r2 = 1
            if (r5 < r6) goto L39
        L38:
            r2 = 0
        L39:
            X.8RS r1 = r7.A0A
            X.MXm r0 = r7.A0W
            if (r1 != r0) goto L6b
            if (r2 != 0) goto L43
            int r5 = r6 + (-1)
        L43:
            X.8Ry r0 = r7.A0p
            r0.A0B(r8)
            r4 = r5
        L49:
            X.MXj r0 = r7.A0V
            int r0 = r0.BsQ(r4)
            A08(r7, r0, r4, r6)
            r7.A0F()
            X.8RS r2 = r7.A0A
            X.84B r1 = r7.A0D
            java.util.List r0 = r1.A01
            int r0 = X.AbstractC31172DnG.A03(r0, r3)
            X.5Kj r0 = r1.A03(r0)
            X.5Kh r0 = (X.C115475Kh) r0
            X.5Km r0 = r0.A0G
            r2.EkC(r0, r8, r9)
            return
        L6b:
            X.8RR r0 = r7.A0X
            if (r1 != r0) goto L49
            int r4 = r7.A05
            X.8Ry r0 = r7.A0p
            r0.A0A(r8)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50643MXf.A0C(X.MXf, boolean, boolean):void");
    }
}
