package com.instagram.feed.widget;

import X.AbstractC09440dt;
import X.AbstractC12990ll;
import X.AbstractC13880nE;
import X.AbstractC26351Pq;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.AbstractC63123SdR;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C26361Pr;
import X.C3GG;
import X.C3X1;
import X.C3X2;
import X.C3X6;
import X.C3X7;
import X.C80673iw;
import X.C9EM;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC59152nG;
import X.InterfaceC73023Pd;
import X.InterfaceC80653iu;
import X.MP6;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes2.dex */
public final class IgProgressImageView extends FrameLayout {
    public ImageView.ScaleType A00;
    public InterfaceC73023Pd A01;
    public IgImageView A02;
    public C3X1 A03;
    public MP6 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public Integer A09;
    public String A0A;
    public boolean A0B;
    public final SparseArray A0C;
    public final SparseArray A0D;
    public final C26361Pr A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgProgressImageView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
        this.A0C = new SparseArray();
        this.A0D = new SparseArray();
        C26361Pr c26361Pr = AbstractC26351Pq.A00;
        C14360o3.A07(c26361Pr);
        this.A0E = c26361Pr;
        this.A0G = AbstractC09440dt.A01(new C9EM(this, 1));
        this.A0H = AbstractC09440dt.A01(new C9EM(this, 2));
        this.A0F = AbstractC09440dt.A01(new C9EM(this, 0));
        this.A0B = true;
        this.A09 = C05F.A00;
        this.A03 = C3X1.A04;
        this.A08 = 1.0f;
        A01(null);
    }

    public static /* synthetic */ void setUrlWithFallback$default(IgProgressImageView igProgressImageView, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC11380iw interfaceC11380iw, boolean z, int i, Object obj) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        igProgressImageView.A07(interfaceC11380iw, abstractC12990ll, imageUrl, imageUrl2, z2);
    }

    @Deprecated(message = "Use reset(resetListeners = true) instead", replaceWith = @ReplaceWith(expression = "reset(resetListeners = true)", imports = {}))
    public final void A04() {
        A0B(false);
    }

    public final void A07(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, ImageUrl imageUrl2, boolean z) {
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(imageUrl2, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C26361Pr c26361Pr = this.A0E;
        c26361Pr.A02(this, C3GG.Unset);
        c26361Pr.A02(this, C3GG.LoadingData);
        this.A07 = false;
        A02(this, C05F.A01);
        getIgImageView().A0C(interfaceC11380iw, abstractC12990ll, imageUrl, imageUrl2, new InterfaceC73023Pd() { // from class: X.3iz
            @Override // X.InterfaceC73023Pd
            public final void DPX(C73083Pj c73083Pj) {
                C14360o3.A0B(c73083Pj, 0);
                IgProgressImageView igProgressImageView = IgProgressImageView.this;
                IgProgressImageView.A02(igProgressImageView, C05F.A0C);
                InterfaceC73023Pd interfaceC73023Pd = igProgressImageView.A01;
                if (interfaceC73023Pd != null) {
                    interfaceC73023Pd.DPX(c73083Pj);
                }
                igProgressImageView.A07 = true;
            }

            @Override // X.InterfaceC73023Pd
            public final void DFp() {
                IgProgressImageView.this.A07 = false;
            }
        }, z);
    }

    public final void A09(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        A08(interfaceC11380iw, null, imageUrl, z);
    }

    public final void setAspectRatio(float f) {
        if (f > 0.0f) {
            this.A08 = f;
            return;
        }
        throw new IllegalStateException("Aspect ratio must be greater than 0");
    }

    public final void setBitmapAndImageRenderer(Bitmap bitmap, InterfaceC59152nG interfaceC59152nG) {
        C14360o3.A0B(bitmap, 0);
        getIgImageView().setBitmapAndImageRenderer(bitmap, interfaceC59152nG);
        A02(this, C05F.A0N);
    }

    public final void setErrorMode(C3X1 c3x1) {
        C14360o3.A0B(c3x1, 0);
        this.A03 = c3x1;
    }

    public final void setImageBitmap(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        getIgImageView().setImageBitmap(bitmap);
        A02(this, C05F.A0N);
    }

    public final void setIndeterminateProgressBarDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        getProgressBar().setIndeterminateDrawable(drawable);
    }

    public final void setOnFallbackListener(InterfaceC73023Pd interfaceC73023Pd) {
        C14360o3.A0B(interfaceC73023Pd, 0);
        this.A01 = interfaceC73023Pd;
    }

    public final void setPlaceHolderColor(ColorDrawable colorDrawable) {
        C14360o3.A0B(colorDrawable, 0);
        getIgImageView().setPlaceHolderColor(colorDrawable);
    }

    public final void setProgressBarDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        getProgressBar().setProgressDrawable(drawable);
    }

    public final void setProgressiveImageConfig(C80673iw c80673iw) {
        C14360o3.A0B(c80673iw, 0);
        getIgImageView().A0A = c80673iw;
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        C14360o3.A0B(scaleType, 0);
        getIgImageView().setScaleType(scaleType);
    }

    public final void setTrackedBitmap(Bitmap bitmap, ImageUrl imageUrl, String str, int i, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(bitmap, 0);
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC11380iw, 4);
        getIgImageView().setPrefetchedBitmap(bitmap, imageUrl, str, i, interfaceC11380iw);
        A02(this, C05F.A0N);
    }

    public final void setUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        setUrl(null, imageUrl, interfaceC11380iw);
    }

    public final void setUrlWithFallback(ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(imageUrl2, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        A07(interfaceC11380iw, null, imageUrl, imageUrl2, true);
    }

    public static final void A02(IgProgressImageView igProgressImageView, Integer num) {
        if (igProgressImageView.A09 != num) {
            igProgressImageView.A09 = num;
            ProgressBar progressBar = igProgressImageView.getProgressBar();
            int i = 0;
            if (igProgressImageView.A09 != C05F.A01 || !igProgressImageView.A0B) {
                i = 8;
            }
            progressBar.setVisibility(i);
            igProgressImageView.A03();
            MP6 mp6 = igProgressImageView.A04;
            if (mp6 != null) {
                mp6.DoP(num);
            }
        }
    }

    private final ColorFilterAlphaImageView getErrorRetryImageView() {
        return (ColorFilterAlphaImageView) this.A0F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressBar getProgressBar() {
        return (ProgressBar) this.A0G.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.A0H.getValue();
    }

    private final C3GG getUIContentState() {
        int intValue = this.A09.intValue();
        if (intValue != 1 && intValue != 2) {
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue == 0) {
                        return C3GG.Unset;
                    }
                    throw new RuntimeException();
                }
                return C3GG.FailedToLoad;
            }
            return C3GG.ShowingData;
        }
        return C3GG.LoadingData;
    }

    public final void A06(int i) {
        this.A0C.delete(i);
    }

    public final void A08(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, boolean z) {
        C26361Pr c26361Pr = this.A0E;
        c26361Pr.A02(this, C3GG.Unset);
        c26361Pr.A02(this, C3GG.LoadingData);
        A02(this, C05F.A01);
        getIgImageView().A0D(interfaceC11380iw, abstractC12990ll, imageUrl, z);
    }

    public final void A0A(InterfaceC80653iu interfaceC80653iu, int i) {
        this.A0C.put(i, interfaceC80653iu);
    }

    public final void A0B(boolean z) {
        this.A0E.A02(this, C3GG.Unset);
        this.A07 = false;
        A02(this, C05F.A01);
        getProgressBar().setProgress(0);
        if (z) {
            this.A01 = null;
            this.A0C.clear();
        }
        getIgImageView().A09();
    }

    public final IgImageView getIgImageView() {
        IgImageView igImageView = this.A02;
        if (igImageView != null) {
            return igImageView;
        }
        C14360o3.A0F("igImageView");
        throw C00O.createAndThrow();
    }

    public final MP6 getOnImageStateChangedListener() {
        return this.A04;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View textView;
        if (this.A06) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = (int) (size / this.A08);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            getIgImageView().measure(i, makeMeasureSpec);
            ProgressBar progressBar = getProgressBar();
            Context context = getContext();
            C14360o3.A07(context);
            progressBar.measure(i, (int) AbstractC13880nE.A04(context, 10));
            if (this.A03 == C3X1.A03) {
                textView = getErrorRetryImageView();
            } else {
                textView = getTextView();
            }
            textView.measure(i, makeMeasureSpec);
            setMeasuredDimension(size, i3);
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setEnableProgressBar(boolean z) {
        this.A0B = z;
        ProgressBar progressBar = getProgressBar();
        int i = 0;
        if (this.A09 != C05F.A01 || !z) {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    private final void A01(AttributeSet attributeSet) {
        IgImageView igImageView;
        View textView;
        removeAllViews();
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1E);
        C14360o3.A07(obtainStyledAttributes);
        this.A0A = AbstractC56922jQ.A00(context, obtainStyledAttributes, 6);
        this.A05 = obtainStyledAttributes.getBoolean(2, false);
        this.A06 = obtainStyledAttributes.getBoolean(3, false);
        this.A00 = ImageView.ScaleType.values()[obtainStyledAttributes.getInt(0, ImageView.ScaleType.FIT_XY.ordinal())];
        this.A03 = C3X1.values()[obtainStyledAttributes.getInt(7, 0)];
        if (this.A05) {
            igImageView = new CircularImageView(context, null, 0);
        } else {
            igImageView = new IgImageView(context);
            igImageView.setScaleType(this.A00);
        }
        this.A02 = igImageView;
        getIgImageView().A0G = new C3X2(this);
        getIgImageView().A0P = true;
        getIgImageView().A0E = new InterfaceC73023Pd() { // from class: X.3X4
            @Override // X.InterfaceC73023Pd
            public final void DPX(C73083Pj c73083Pj) {
                C14360o3.A0B(c73083Pj, 0);
                IgProgressImageView igProgressImageView = IgProgressImageView.this;
                igProgressImageView.A0E.A02(igProgressImageView, C3GG.ShowingData);
                IgProgressImageView.A02(igProgressImageView, C05F.A0N);
                SparseArray clone = igProgressImageView.A0C.clone();
                C14360o3.A07(clone);
                int size = clone.size();
                for (int i = 0; i < size; i++) {
                    Object valueAt = clone.valueAt(i);
                    if (valueAt != null) {
                        ((InterfaceC80653iu) valueAt).DPX(c73083Pj);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }

            @Override // X.InterfaceC73023Pd
            public final void DFp() {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load image: isFallbackImageLoaded = ");
                IgProgressImageView igProgressImageView = IgProgressImageView.this;
                sb.append(igProgressImageView.A07);
                sb.append(", isAnyImageLoadedAFallback = ");
                sb.append(false);
                sb.append(", isAnyImageLoaded = ");
                sb.append(igProgressImageView.getIgImageView().A0G());
                C0w9.A03("IgProgressImageView", sb.toString());
                igProgressImageView.A0E.A02(igProgressImageView, C3GG.ContentIsNotAvailable);
                if (!igProgressImageView.A07) {
                    IgProgressImageView.A02(igProgressImageView, C05F.A0Y);
                }
                SparseArray clone = igProgressImageView.A0C.clone();
                C14360o3.A07(clone);
                int size = clone.size();
                for (int i = 0; i < size; i++) {
                    Object valueAt = clone.valueAt(i);
                    if (valueAt != null) {
                        ((InterfaceC80653iu) valueAt).DFp();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        };
        getIgImageView().setProgressiveImageListener(new C3X6() { // from class: X.3X5
            @Override // X.C3X6
            public final void Dbt(int i) {
                Integer num;
                IgProgressImageView igProgressImageView = IgProgressImageView.this;
                C26361Pr c26361Pr = igProgressImageView.A0E;
                synchronized (c26361Pr) {
                    C3GH c3gh = (C3GH) c26361Pr.A01.get(igProgressImageView);
                    if (c3gh != null) {
                        c3gh.A00 = i;
                    }
                }
                if (i < 4) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0C;
                }
                IgProgressImageView.A02(igProgressImageView, num);
                SparseArray sparseArray = igProgressImageView.A0D;
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC80663iv) sparseArray.valueAt(i2)).Dbt(i);
                }
            }
        });
        getIgImageView().setMiniPreviewLoadListener(new C3X7(this));
        getIgImageView().setAdjustViewBounds(obtainStyledAttributes.getBoolean(1, false));
        getIgImageView().setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(5, getIgImageView().getMaxWidth()));
        getIgImageView().setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(4, getIgImageView().getMaxHeight()));
        obtainStyledAttributes.recycle();
        int i = -1;
        addView(getIgImageView(), new FrameLayout.LayoutParams(-1, -1, 17));
        addView(getProgressBar(), new FrameLayout.LayoutParams(-1, -1, 17));
        C3X1 c3x1 = this.A03;
        if (c3x1 == C3X1.A03) {
            i = (int) getErrorRetryImageView().getResources().getDimension(R.dimen.ad_not_delivering_thumbnail_height);
            textView = getErrorRetryImageView();
        } else {
            if (c3x1 == C3X1.A04) {
                textView = getTextView();
            }
            A02(this, C05F.A01);
            this.A07 = false;
        }
        addView(textView, new FrameLayout.LayoutParams(i, i, 17));
        A02(this, C05F.A01);
        this.A07 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r6.A0B == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r6 = this;
            android.widget.ProgressBar r5 = r6.getProgressBar()
            java.lang.Integer r1 = r6.A09
            java.lang.Integer r0 = X.C05F.A01
            r4 = 1
            r3 = 0
            if (r1 != r0) goto L11
            boolean r0 = r6.A0B
            r1 = 1
            if (r0 != 0) goto L12
        L11:
            r1 = 0
        L12:
            r2 = 8
            r0 = 8
            if (r1 == 0) goto L19
            r0 = 0
        L19:
            r5.setVisibility(r0)
            X.3X1 r0 = r6.A03
            int r1 = r0.ordinal()
            if (r1 == r4) goto L3e
            if (r1 == r3) goto L43
            r0 = 2
            if (r1 != r0) goto L38
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r6.getErrorRetryImageView()
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.getTextView()
            r0.setVisibility(r2)
            return
        L38:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L3e:
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r2 = r6.getErrorRetryImageView()
            goto L47
        L43:
            android.widget.TextView r2 = r6.getTextView()
        L47:
            android.view.View r2 = (android.view.View) r2
            java.lang.Integer r1 = r6.A09
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 == r0) goto L51
            r3 = 8
        L51:
            r2.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.widget.IgProgressImageView.A03():void");
    }

    public final void A05() {
        getTextView().setText(2131976061);
    }

    public final AtomicInteger getCurrentScans() {
        return getIgImageView().A0a;
    }

    public final Drawable getImageDrawable() {
        return getIgImageView().getDrawable();
    }

    public final InterfaceC59152nG getPostProcessor() {
        return getIgImageView().A0I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-144968289);
        super.onAttachedToWindow();
        C26361Pr c26361Pr = this.A0E;
        c26361Pr.A03(this, this.A0A);
        c26361Pr.A02(this, getUIContentState());
        C0f9.A0D(275576131, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1485281054);
        super.onDetachedFromWindow();
        this.A0E.A01(this);
        C0f9.A0D(-1860593333, A06);
    }

    public final void setAdjustViewBounds(boolean z) {
        getIgImageView().setAdjustViewBounds(z);
    }

    public final void setExpiration(long j) {
        getIgImageView().A05 = j;
    }

    public final void setImageDrawable(Drawable drawable) {
        getIgImageView().setImageDrawable(drawable);
    }

    public final void setMiniPreviewBlurRadius(int i) {
        getIgImageView().A04 = i;
    }

    public final void setMiniPreviewPayload(String str) {
        getIgImageView().A0K = str;
    }

    public final void setPostProcessor(InterfaceC59152nG interfaceC59152nG) {
        getIgImageView().A0I = interfaceC59152nG;
    }

    public final void setProgressBarGravity(int i) {
        ProgressBar progressBar = getProgressBar();
        ViewGroup.LayoutParams layoutParams = getProgressBar().getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i;
        progressBar.setLayoutParams(layoutParams2);
    }

    public final void setProgressBarIndeterminate(boolean z) {
        getProgressBar().setIndeterminate(z);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
    }

    public final void setFitAspectRatio(boolean z) {
        this.A06 = z;
    }

    public final void setOnImageStateChangedListener(MP6 mp6) {
        this.A04 = mp6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A0C = new SparseArray();
        this.A0D = new SparseArray();
        C26361Pr c26361Pr = AbstractC26351Pq.A00;
        C14360o3.A07(c26361Pr);
        this.A0E = c26361Pr;
        this.A0G = AbstractC09440dt.A01(new C9EM(this, 1));
        this.A0H = AbstractC09440dt.A01(new C9EM(this, 2));
        this.A0F = AbstractC09440dt.A01(new C9EM(this, 0));
        this.A0B = true;
        this.A09 = C05F.A00;
        this.A03 = C3X1.A04;
        this.A08 = 1.0f;
        A01(attributeSet);
    }

    public final void setPlaceHolderColor(int i) {
        getIgImageView().setPlaceHolderColor(i);
    }

    public final void setUrl(AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        A08(interfaceC11380iw, abstractC12990ll, imageUrl, false);
    }
}
