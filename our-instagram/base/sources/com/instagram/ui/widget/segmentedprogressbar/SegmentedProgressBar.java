package com.instagram.ui.widget.segmentedprogressbar;

import X.ANA;
import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C55235Of7;
import X.InterfaceC58000Pnk;
import X.LM1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.facebook.R;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class SegmentedProgressBar extends View {
    public static final int A0V = Color.argb(0, 255, 225, 255);
    public static final int A0W = Color.argb(255, 255, 226, 164);
    public static final int[] A0X = {R.drawable.fuse_1, R.drawable.fuse_2, R.drawable.fuse_3, R.drawable.fuse_4, R.drawable.fuse_5, R.drawable.fuse_6, R.drawable.fuse_7, R.drawable.fuse_8, R.drawable.fuse_9};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Bitmap A0B;
    public InterfaceC58000Pnk A0C;
    public boolean A0D;
    public Bitmap[] A0E;
    public long A0F;
    public final float A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final ValueAnimator A0M;
    public final Paint A0N;
    public final RectF A0O;
    public final RectF A0P;
    public final SparseArray A0Q;
    public final SparseArray A0R;
    public final SparseArray A0S;
    public final boolean A0T;
    public final BitmapFactory.Options A0U;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    private final float A00(Canvas canvas, float f, float f2, boolean z) {
        int i = 0;
        do {
            Paint paint = this.A0N;
            paint.setShader(null);
            RectF rectF = this.A0P;
            rectF.set(f, f2, getEllipsisWidth() + f, this.A02 + f2);
            paint.setStyle(Paint.Style.FILL);
            if (z) {
                paint.setColor(this.A0H);
            } else {
                paint.setColor(this.A0L);
                paint.setAlpha(153);
            }
            float f3 = this.A0I;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            f += rectF.width() + this.A0K;
            i++;
        } while (i < 3);
        return f;
    }

    public final void A06(int i, boolean z) {
        setProgress(0.0f);
        this.A03 = Math.min(i, this.A04 - 1);
        this.A0D = z;
        A03();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0209, code lost:
    
        if (r3 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r13 > (r24.A0A + r2)) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar.onDraw(android.graphics.Canvas):void");
    }

    public final void setCurrentSegment(int i) {
        setProgress(0.0f);
        this.A03 = Math.min(i, this.A04 - 1);
        this.A0D = false;
        A03();
        invalidate();
    }

    public final void setProgress(float f) {
        this.A01 = Math.min(Math.max(f, 0.0f), 1.0f);
        invalidate();
    }

    public final void setSegmentHeight(int i) {
        this.A02 = i;
        invalidate();
    }

    private final LinearGradient A01(float f) {
        int i;
        int i2;
        RectF rectF = this.A0P;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        if (this.A0T) {
            i = A0W;
            i2 = A0V;
        } else {
            i = A0V;
            i2 = A0W;
        }
        return new LinearGradient(f2, f3, f4, f, i, i2, Shader.TileMode.CLAMP);
    }

    private final void A04(int i, float f) {
        this.A0R.put(i, Float.valueOf(f));
        SparseArray sparseArray = this.A0S;
        if (sparseArray.get(i) == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 2.0f);
            ofFloat.setDuration(1000L);
            ofFloat.addListener(new ANA(this, i));
            ofFloat.addUpdateListener(new C55235Of7(this));
            sparseArray.put(i, ofFloat);
        }
    }

    public final void A05(int i) {
        if (this.A0T) {
            i = (this.A04 - 1) - i;
        }
        SparseArray sparseArray = this.A0Q;
        if (sparseArray.get(i) == null) {
            float f = this.A00;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
            ofFloat.setDuration(250L);
            sparseArray.put(i, Float.valueOf(f));
            ofFloat.addUpdateListener(new LM1(this, i));
            ofFloat.start();
        }
    }

    public final int getCurrentSegment() {
        return this.A03;
    }

    public final int getSegments() {
        return this.A04;
    }

    public final void setSegments(int i) {
        this.A04 = i;
        invalidate();
    }

    private final void A02() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A0F;
        if (j == -1 || currentTimeMillis - j > 30) {
            this.A05 = (this.A05 + 1) % 9;
            this.A0F = currentTimeMillis;
        }
    }

    private final void A03() {
        Resources resources = getResources();
        if (this.A0D) {
            if (this.A0E == null) {
                int[] iArr = A0X;
                this.A0E = new Bitmap[9];
                int i = 0;
                do {
                    Bitmap[] bitmapArr = this.A0E;
                    C14360o3.A0A(bitmapArr);
                    bitmapArr[i] = BitmapFactory.decodeResource(resources, iArr[i], this.A0U);
                    i++;
                } while (i < 9);
            }
        } else {
            Bitmap[] bitmapArr2 = this.A0E;
            if (bitmapArr2 != null) {
                int length = bitmapArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Bitmap[] bitmapArr3 = this.A0E;
                    C14360o3.A0A(bitmapArr3);
                    Bitmap bitmap = bitmapArr3[i2];
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
                this.A0E = null;
            }
        }
        if (this.A0D && this.A0B == null) {
            this.A0B = BitmapFactory.decodeResource(resources, R.drawable.smoke, this.A0U);
        }
        this.A0F = -1L;
        this.A05 = -1;
    }

    private final float getEllipsisWidth() {
        Context context = getContext();
        C14360o3.A07(context);
        return AbstractC13880nE.A04(context, 6);
    }

    public final void setEllipsisAfterIndex(int i) {
        this.A06 = i;
    }

    public final void setEllipsisBeforeIndex(int i) {
        this.A08 = i;
    }

    public final void setPositionAnchorDelegate(InterfaceC58000Pnk interfaceC58000Pnk) {
        this.A0C = interfaceC58000Pnk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0Q = new SparseArray();
        this.A0R = new SparseArray();
        this.A0S = new SparseArray();
        this.A08 = -1;
        this.A06 = -1;
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A28, i, 0);
        C14360o3.A07(obtainStyledAttributes);
        this.A0I = obtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
        this.A0K = obtainStyledAttributes.getDimensionPixelOffset(4, resources.getDimensionPixelOffset(R.dimen.abc_control_corner_material));
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(R.dimen.segmented_progress_bar_default_height));
        this.A0J = resources.getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        this.A0H = obtainStyledAttributes.getColor(1, Color.argb(255, 255, 255, 255));
        this.A0L = obtainStyledAttributes.getColor(5, Color.argb(153, 255, 255, 255));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.A0N = paint;
        paint.setShadowLayer(resources.getDisplayMetrics().density * 1.0f, 0.0f, 0.0f, Color.argb(39, 0, 0, 0));
        this.A0P = new RectF();
        this.A0O = new RectF();
        this.A0T = AbstractC13620mo.A02(context);
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.A0U = options;
        options.inSampleSize = 3;
        Context context2 = getContext();
        C14360o3.A07(context2);
        this.A0G = AbstractC13880nE.A04(context2, 1);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        this.A0M = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6e6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SegmentedProgressBar.this.invalidate();
            }
        });
        duration.setInterpolator(new OvershootInterpolator(1.25f));
    }

    public /* synthetic */ SegmentedProgressBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
