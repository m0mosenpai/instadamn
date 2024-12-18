package com.instagram.showreelnative.ui.reels;

import X.AbstractC111324zv;
import X.AbstractC115825Lw;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC53242c7;
import X.BFP;
import X.C00O;
import X.C06090Tz;
import X.C0fO;
import X.C1341564a;
import X.C14360o3;
import X.C41051vD;
import X.C41181vS;
import X.C6PS;
import X.C6PT;
import X.C9C9;
import X.InterfaceC115845Ly;
import X.InterfaceC138736Qd;
import X.InterfaceC31031DkU;
import X.InterfaceC31148Dmr;
import X.UtP;
import X.ViewOnClickListenerC28666ClE;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class IgShowreelNativeProgressView extends FrameLayout implements InterfaceC115845Ly {
    public static final int A06 = IgShowreelNativeProgressView.class.hashCode();
    public int A00;
    public ProgressBar A01;
    public ColorFilterAlphaImageView A02;
    public C6PS A03;
    public UtP A04;
    public boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgShowreelNativeProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00();
    }

    @Override // X.InterfaceC115845Ly
    public final void reset() {
        String str;
        this.A03 = null;
        ProgressBar progressBar = this.A01;
        if (progressBar == null) {
            str = "progressBar";
        } else {
            progressBar.setProgress(0);
            UtP utP = this.A04;
            if (utP == null) {
                str = "mediaView";
            } else {
                utP.reset();
                A01(this, 0);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Deprecated(message = "Use the overload with ShowreelInteractivityListener instead")
    public final void setInteractivityListener(InterfaceC31148Dmr interfaceC31148Dmr) {
        C14360o3.A0B(interfaceC31148Dmr, 0);
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.A04 = interfaceC31148Dmr;
    }

    public final void setShowreelAnimation(UserSession userSession, List list, C41181vS c41181vS, C6PT c6pt, InterfaceC138736Qd interfaceC138736Qd) {
        AbstractC167017dG.A1N(userSession, list);
        C14360o3.A0B(c6pt, 3);
        reset();
        this.A03 = new C6PS(userSession, list, c41181vS, c6pt, interfaceC138736Qd);
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.setShowreelAnimation(userSession, list, c41181vS, c6pt, interfaceC138736Qd);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.UtP, X.5Lw] */
    private final void A00() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgShowreelNativeProgressView::init", -871075436);
        }
        try {
            removeAllViews();
            Context A0L = AbstractC166997dE.A0L(this);
            C9C9 c9c9 = new C9C9("sn_integration_reels", "IG_STORIES", 0);
            C41051vD c41051vD = C41051vD.A01;
            UserSession userSession = c41051vD.A00;
            if (userSession != null) {
                int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36592245190689145L);
                c41051vD.A00 = userSession;
                ?? abstractC115825Lw = new AbstractC115825Lw(A0L, null, c9c9, new C1341564a(c41051vD, A07, false), null, A0L.getMainExecutor(), 0);
                this.A04 = abstractC115825Lw;
                abstractC115825Lw.A02(new BFP(this), A06);
                IgProgressImageViewProgressBar igProgressImageViewProgressBar = new IgProgressImageViewProgressBar(A0L, null, R.attr.progressBarStyleHorizontal);
                this.A01 = igProgressImageViewProgressBar;
                igProgressImageViewProgressBar.setIndeterminate(true);
                ProgressBar progressBar = this.A01;
                String str = "progressBar";
                if (progressBar != null) {
                    progressBar.setProgressDrawable(A0L.getDrawable(com.facebook.R.drawable.feed_image_determinate_progress));
                    ProgressBar progressBar2 = this.A01;
                    if (progressBar2 != null) {
                        progressBar2.setIndeterminateDrawable(A0L.getDrawable(com.facebook.R.drawable.video_indeterminate_progress));
                        ColorFilterAlphaImageView colorFilterAlphaImageView = new ColorFilterAlphaImageView(A0L);
                        this.A02 = colorFilterAlphaImageView;
                        colorFilterAlphaImageView.setImageResource(com.facebook.R.drawable.refresh_big);
                        ColorFilterAlphaImageView colorFilterAlphaImageView2 = this.A02;
                        if (colorFilterAlphaImageView2 != null) {
                            colorFilterAlphaImageView2.setNormalColor(A0L.getColor(AbstractC53242c7.A07(A0L)));
                            ColorFilterAlphaImageView colorFilterAlphaImageView3 = this.A02;
                            if (colorFilterAlphaImageView3 != null) {
                                colorFilterAlphaImageView3.setOnClickListener(ViewOnClickListenerC28666ClE.A00(this, 42));
                                UtP utP = this.A04;
                                if (utP == null) {
                                    str = "mediaView";
                                } else {
                                    addView(utP, new FrameLayout.LayoutParams(-1, -1, 17));
                                    ProgressBar progressBar3 = this.A01;
                                    if (progressBar3 != null) {
                                        addView(progressBar3, new FrameLayout.LayoutParams(-1, -2, 17));
                                        ColorFilterAlphaImageView colorFilterAlphaImageView4 = this.A02;
                                        if (colorFilterAlphaImageView4 != null) {
                                            int dimension = (int) colorFilterAlphaImageView4.getResources().getDimension(com.facebook.R.dimen.ad_not_delivering_thumbnail_height);
                                            ColorFilterAlphaImageView colorFilterAlphaImageView5 = this.A02;
                                            if (colorFilterAlphaImageView5 != null) {
                                                addView(colorFilterAlphaImageView5, new FrameLayout.LayoutParams(dimension, dimension, 17));
                                                if (Systrace.A0E(1L)) {
                                                    C0fO.A00(-2083382082);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("errorRetryImageView");
                        throw C00O.createAndThrow();
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw new RuntimeException(AbstractC111324zv.A00(3787));
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(788004836);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r4.A05 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r4, int r5) {
        /*
            int r0 = r4.A00
            if (r0 == r5) goto L33
            r4.A00 = r5
            android.widget.ProgressBar r2 = r4.A01
            if (r2 != 0) goto L14
            java.lang.String r0 = "progressBar"
        Lc:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L14:
            r0 = 1
            r3 = 0
            if (r5 != r0) goto L1d
            boolean r1 = r4.A05
            r0 = 0
            if (r1 != 0) goto L1f
        L1d:
            r0 = 8
        L1f:
            r2.setVisibility(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r2 = r4.A02
            if (r2 != 0) goto L29
            java.lang.String r0 = "errorRetryImageView"
            goto Lc
        L29:
            int r1 = r4.A00
            r0 = 3
            if (r1 == r0) goto L30
            r3 = 8
        L30:
            r2.setVisibility(r3)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView.A01(com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView, int):void");
    }

    public final void A02(int i) {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        SparseArray sparseArray = utP.A0F;
        synchronized (sparseArray) {
            sparseArray.remove(i);
        }
    }

    @Override // X.InterfaceC115845Ly
    public final boolean CXh() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        return utP.CXh();
    }

    @Override // X.InterfaceC115845Ly
    public final void E0c() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.E0c();
    }

    @Override // X.InterfaceC115845Ly
    public final void E0l() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.E0l();
    }

    @Override // X.InterfaceC115845Ly
    public final void E0o() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.E0o();
    }

    @Override // X.InterfaceC115845Ly
    public final void E4S() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.E4S();
    }

    @Override // X.InterfaceC115845Ly
    public final void EKd() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.EKd();
    }

    public final long getDurationSeconds() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        return utP.getDurationSeconds();
    }

    public final ImageView getImageView() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        return utP.A0J;
    }

    public final ImmutableMap getRenderingComponentInfos() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        return utP.getRenderingComponentInfos();
    }

    @Override // X.InterfaceC115845Ly
    public final void pause() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.pause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r4 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setEnableProgressBar(boolean r4) {
        /*
            r3 = this;
            r3.A05 = r4
            android.widget.ProgressBar r2 = r3.A01
            if (r2 != 0) goto L10
            java.lang.String r0 = "progressBar"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L10:
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L18
            r0 = 0
            if (r4 != 0) goto L1a
        L18:
            r0 = 8
        L1a:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView.setEnableProgressBar(boolean):void");
    }

    public final void setPlaceHolderColor(int i) {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.setPlaceHolderColor(i);
    }

    @Override // X.InterfaceC115845Ly
    public final void stop() {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.stop();
    }

    @Override // X.InterfaceC115845Ly
    public final boolean isPlaying() {
        throw C00O.createAndThrow();
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        getImageView().setScaleType(scaleType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgShowreelNativeProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00();
    }

    public final void setInteractivityListener(InterfaceC31031DkU interfaceC31031DkU) {
        UtP utP = this.A04;
        if (utP == null) {
            AbstractC25225BEi.A1I();
            throw C00O.createAndThrow();
        }
        utP.setInteractivityListener(interfaceC31031DkU);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgShowreelNativeProgressView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00();
    }
}
