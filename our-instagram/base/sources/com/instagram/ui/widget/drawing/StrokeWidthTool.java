package com.instagram.ui.widget.drawing;

import X.AbstractC09440dt;
import X.AbstractC13950nL;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.AbstractC70163Da;
import X.C05F;
import X.C0f9;
import X.C130675vE;
import X.C14360o3;
import X.C3DY;
import X.C55982hj;
import X.C668630d;
import X.C8PS;
import X.EnumC130605v7;
import X.InterfaceC09390do;
import X.InterfaceC16820sZ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.ui.widget.drawing.StrokeWidthTool;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class StrokeWidthTool extends View {
    public static final int[] A0t = new int[2];
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public long A0E;
    public long A0F;
    public Drawable A0G;
    public Drawable A0H;
    public EnumC130605v7 A0I;
    public C8PS A0J;
    public Integer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public float A0Q;
    public float A0R;
    public boolean A0S;
    public final float A0T;
    public final float A0U;
    public final float A0V;
    public final float A0W;
    public final float A0X;
    public final Paint A0Y;
    public final Paint A0Z;
    public final Paint A0a;
    public final Paint A0b;
    public final Paint A0c;
    public final Paint A0d;
    public final Path A0e;
    public final C668630d A0f;
    public final C668630d A0g;
    public final C130675vE A0h;
    public final ArrayList A0i;
    public final ArrayList A0j;
    public final ArrayList A0k;
    public final InterfaceC09390do A0l;
    public final InterfaceC09390do A0m;
    public final InterfaceC09390do A0n;
    public final float A0o;
    public final float A0p;
    public final float A0q;
    public final int A0r;
    public final GestureDetector A0s;

    public StrokeWidthTool(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0S = true;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float f = (width - this.A0o) / width;
        this.A00 = f;
        this.A01 = f;
        this.A0D = getWidth() / 2.0f;
        this.A02 = (getHeight() - this.A0D) - getPaddingBottom();
        float f2 = this.A0V;
        this.A0C = getPaddingTop() + f2;
        this.A0B = (((getHeight() - getWidth()) - f2) - this.A0q) - getPaddingBottom();
        A04(this);
        if (this.A0O) {
            A05(this, 0.0f);
        }
        A03(this);
        Drawable drawable = this.A0G;
        if (drawable != null) {
            A01(drawable, getButtonRadius() * this.A00);
            drawable.setAlpha(255);
        }
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            A01(drawable2, getButtonRadius());
            drawable2.setAlpha(0);
        }
    }

    public void setCurrentRatio(float f) {
        this.A07 = (float) AbstractC70163Da.A04(f, 0.0d, 1.0d, this.A05, this.A04);
        A03(this);
    }

    private void A00(int i) {
        this.A0K = C05F.A00;
        this.A0L = false;
        long j = i;
        this.A0E = j;
        this.A08 = this.A0p;
        this.A06 = this.A03;
        this.A0F = System.currentTimeMillis();
        postDelayed(new Runnable() { // from class: X.9Mr
            @Override // java.lang.Runnable
            public final void run() {
                StrokeWidthTool strokeWidthTool = StrokeWidthTool.this;
                strokeWidthTool.A0L = true;
                strokeWidthTool.invalidate();
            }
        }, j);
    }

    private void A01(Drawable drawable, float f) {
        float f2 = f * 2.0f;
        float min = Math.min(((float) Math.sqrt((f2 * f2) / 2.0f)) - this.A0Q, drawable.getIntrinsicWidth() / 2.0f);
        float f3 = this.A0D;
        float f4 = this.A02;
        drawable.setBounds((int) (f3 - min), (int) (f4 - min), (int) (f3 + min), (int) (f4 + min));
    }

    public static void A03(StrokeWidthTool strokeWidthTool) {
        if (strokeWidthTool.A0S) {
            float f = strokeWidthTool.A0B;
            float f2 = f - strokeWidthTool.A0C;
            float f3 = strokeWidthTool.A04;
            float f4 = strokeWidthTool.A05;
            strokeWidthTool.A0A = f - ((f2 / (f3 - f4)) * (strokeWidthTool.A07 - f4));
            strokeWidthTool.invalidate();
        }
    }

    public static void A04(StrokeWidthTool strokeWidthTool) {
        float f = (float) ((C55982hj) strokeWidthTool.A0l.getValue()).A09.A00;
        float f2 = strokeWidthTool.A02;
        float f3 = f2 + ((strokeWidthTool.A0C - f2) * f);
        float f4 = f2 + ((strokeWidthTool.A0B - f2) * f);
        ArrayList arrayList = strokeWidthTool.A0i;
        PointF pointF = (PointF) arrayList.get(0);
        float f5 = strokeWidthTool.A0D;
        float f6 = strokeWidthTool.A0W / 2.0f;
        pointF.set(f5 - f6, f4);
        ((PointF) arrayList.get(1)).set(strokeWidthTool.A0D - f6, f3);
        ((PointF) arrayList.get(2)).set(strokeWidthTool.A0D + f6, f3);
        ((PointF) arrayList.get(3)).set(strokeWidthTool.A0D + f6, f4);
        ArrayList arrayList2 = strokeWidthTool.A0k;
        ((PointF) arrayList2.get(0)).set(strokeWidthTool.A0D, f4);
        PointF pointF2 = (PointF) arrayList2.get(1);
        float f7 = strokeWidthTool.A0D;
        float f8 = strokeWidthTool.A0X / 2.0f;
        pointF2.set(f7 - f8, f3);
        ((PointF) arrayList2.get(2)).set(strokeWidthTool.A0D + f8, f3);
        ((PointF) arrayList2.get(3)).set(strokeWidthTool.A0D, f4);
        float f9 = strokeWidthTool.A02 - strokeWidthTool.A0A;
        strokeWidthTool.A09 = f9 + ((0.0f - f9) * f);
    }

    public static void A05(StrokeWidthTool strokeWidthTool, float f) {
        ArrayList arrayList = strokeWidthTool.A0i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) arrayList.get(i);
            PointF pointF2 = (PointF) strokeWidthTool.A0k.get(i);
            PointF pointF3 = (PointF) strokeWidthTool.A0j.get(i);
            float f2 = pointF.x;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            pointF3.set(f3, f4 + ((pointF2.y - f4) * f));
        }
    }

    public static void A06(StrokeWidthTool strokeWidthTool, float f) {
        Integer num;
        int i;
        float f2 = strokeWidthTool.A0B;
        float f3 = strokeWidthTool.A0C;
        float min = Math.min(f2, Math.max(f3, f));
        strokeWidthTool.A0A = min;
        float f4 = strokeWidthTool.A07;
        float f5 = strokeWidthTool.A04;
        float f6 = strokeWidthTool.A05;
        float f7 = f6 + (((f5 - f6) / (f2 - f3)) * (f2 - min));
        strokeWidthTool.A07 = f7;
        if (f7 != f4) {
            C130675vE c130675vE = strokeWidthTool.A0h;
            StrokeWidthTool strokeWidthTool2 = c130675vE.A01;
            float currentRatio = strokeWidthTool2.getCurrentRatio() * 100.0f;
            if (0.0f <= currentRatio && currentRatio <= 1.0f) {
                num = 0;
            } else {
                if (24.0f <= currentRatio && currentRatio <= 26.0f) {
                    i = 25;
                } else if (49.0f <= currentRatio && currentRatio <= 51.0f) {
                    i = 50;
                } else if (74.0f <= currentRatio && currentRatio <= 76.0f) {
                    i = 75;
                } else if (99.0f <= currentRatio && currentRatio <= 100.0f) {
                    num = 100;
                } else {
                    num = null;
                }
                num = Integer.valueOf(i);
            }
            if (!C14360o3.A0K(c130675vE.A00, num) && num != null) {
                strokeWidthTool2.announceForAccessibility(strokeWidthTool2.getContext().getString(2131974780, num));
            }
            c130675vE.A00 = num;
            C8PS c8ps = strokeWidthTool.A0J;
            if (c8ps != null) {
                c8ps.Dyc(f4, f7);
            }
            C8PS c8ps2 = strokeWidthTool.A0J;
            if (c8ps2 != null) {
                strokeWidthTool.getLocationInWindow(A0t);
                c8ps2.Dsx(r1[0] + strokeWidthTool.A0D, r1[1] + strokeWidthTool.A0A);
            }
            strokeWidthTool.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(EnumC130605v7 enumC130605v7) {
        double d;
        if (this.A0I != enumC130605v7) {
            this.A0I = enumC130605v7;
            EnumC130605v7 enumC130605v72 = EnumC130605v7.COLLAPSED;
            C55982hj c55982hj = (C55982hj) this.A0l.getValue();
            if (enumC130605v7 == enumC130605v72) {
                d = 0.0d;
            } else {
                d = 1.0d;
            }
            c55982hj.A06(d);
            invalidate();
        }
    }

    public final void A07() {
        this.A0K = C05F.A01;
        this.A0L = false;
        ((C55982hj) this.A0n.getValue()).A05(1.0d);
        this.A03 = 0.0f;
        invalidate();
        A00(1000);
    }

    public float getCurrentRatio() {
        return (float) AbstractC70163Da.A04(this.A07, this.A05, this.A04, 0.0d, 1.0d);
    }

    public float getStrokeWidthDp() {
        return this.A07;
    }

    public float getStrokeWidthPx() {
        return this.A07 * this.A0U;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.A0O) {
            if (this.A0L) {
                float max = Math.max(0.0f, Math.min((((float) (System.currentTimeMillis() - this.A0F)) - ((float) this.A0E)) / 300.0f, 1.0f));
                ((C55982hj) this.A0n.getValue()).A05(this.A0K == C05F.A01 ? max : 1.0f - max);
                if (max > 0.0f && max < 1.0f) {
                    invalidate();
                } else {
                    this.A0L = false;
                }
                this.A03 = (float) AbstractC70163Da.A04(max, 0.0d, 1.0d, this.A06, this.A08);
            }
            setTranslationX(this.A03);
        } else {
            setTranslationX(0.0f);
        }
        if (this.A0I == EnumC130605v7.EXPANDED || !((C55982hj) this.A0l.getValue()).A0C()) {
            Path path = this.A0e;
            path.rewind();
            ArrayList arrayList = this.A0j;
            PointF pointF = (PointF) arrayList.get(0);
            path.moveTo(pointF.x, pointF.y);
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                path.lineTo(pointF2.x, pointF2.y);
            }
            path.close();
            path.setFillType(Path.FillType.WINDING);
            Paint paint = this.A0b;
            canvas.drawPath(path, paint);
            canvas.drawPath(path, this.A0d);
            float f = this.A0D;
            float f2 = this.A0A + this.A09;
            float f3 = this.A0V;
            canvas.drawCircle(f, f2, f3, paint);
            canvas.drawCircle(this.A0D, this.A0A + this.A09, f3, this.A0c);
        }
        if (this.A0O) {
            float buttonRadius = getButtonRadius() * this.A01;
            canvas.drawCircle(this.A0D, this.A02, buttonRadius, this.A0b);
            Paint paint2 = this.A0Z;
            if (Color.alpha(paint2.getColor()) < 255) {
                canvas.drawCircle(this.A0D, this.A02, buttonRadius - (this.A0T / 2.0f), this.A0Y);
            }
            float f4 = this.A0D;
            float f5 = this.A02;
            float f6 = buttonRadius - (this.A0T / 2.0f);
            canvas.drawCircle(f4, f5, f6, paint2);
            canvas.drawCircle(this.A0D, this.A02, f6, this.A0a);
            float f7 = (float) ((C55982hj) this.A0l.getValue()).A09.A00;
            Drawable drawable = this.A0G;
            if (drawable != null) {
                canvas.save();
                canvas.rotate((-45.0f) * f7, this.A0D, this.A02);
                drawable.setAlpha((int) ((1.0f - f7) * 255.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            Drawable drawable2 = this.A0H;
            if (drawable2 != null) {
                drawable2.setAlpha((int) (255.0f * f7));
                canvas.save();
                canvas.rotate((1.0f - f7) * 45.0f, this.A0D, this.A02);
                drawable2.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.A0r, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public void setCollapsedIcon(Drawable drawable) {
        this.A0G = drawable;
        invalidate();
    }

    public void setColour(int i) {
        ColorFilter A00 = C3DY.A00(AbstractC13950nL.A08(i, 1.0f));
        Drawable drawable = this.A0G;
        if (drawable != null) {
            drawable.setColorFilter(A00);
        }
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            drawable2.setColorFilter(A00);
        }
        this.A0Z.setColor(i);
        invalidate();
    }

    public void setStrokeWidthButtonShowing(boolean z) {
        EnumC130605v7 enumC130605v7;
        this.A0O = z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i = 8388627;
            if (z) {
                i = 8388691;
            }
            layoutParams2.gravity = i;
            setLayoutParams(layoutParams2);
        }
        if (this.A0O) {
            enumC130605v7 = EnumC130605v7.COLLAPSED;
        } else {
            enumC130605v7 = EnumC130605v7.EXPANDED;
        }
        setMode(enumC130605v7);
    }

    public void setStrokeWidthDp(float f) {
        this.A07 = f;
        A03(this);
    }

    private float getButtonRadius() {
        return (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2.0f) + (this.A0T / 2.0f);
    }

    public final boolean A08(float f, float f2) {
        float buttonRadius = getButtonRadius();
        if (f >= 0.0f && f <= getWidth()) {
            float f3 = this.A02;
            if (f2 >= f3 - buttonRadius && f2 <= f3 + buttonRadius) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1257615662);
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            if (action == 0) {
                this.A0R = motionEvent.getY();
                if (!this.A0O) {
                    this.A0K = C05F.A01;
                    this.A0L = true;
                    this.A0E = 0L;
                    this.A08 = 0.0f;
                    this.A06 = this.A03;
                    this.A0F = System.currentTimeMillis();
                    invalidate();
                }
            } else if (action == 2 && (this.A0P || this.A0M)) {
                float y = motionEvent.getY();
                float f = this.A0R - y;
                this.A0R = y;
                A06(this, this.A0A - f);
                invalidate();
            }
        } else {
            if (!this.A0O) {
                A00(0);
            }
            ((C55982hj) this.A0n.getValue()).A04();
            this.A0N = false;
            this.A0P = false;
            if (this.A0O && this.A0M) {
                setMode(EnumC130605v7.COLLAPSED);
                this.A0M = false;
            }
            C8PS c8ps = this.A0J;
            if (c8ps != null) {
                c8ps.Dsw();
            }
        }
        boolean onTouchEvent = this.A0s.onTouchEvent(motionEvent);
        C0f9.A0C(1305702311, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.A0O) {
            if (i == 4 || i == 8) {
                setMode(EnumC130605v7.COLLAPSED);
            }
        }
    }

    public void setOnValueChangedListener(C8PS c8ps) {
        this.A0J = c8ps;
    }

    public StrokeWidthTool(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0e = new Path();
        this.A0j = new ArrayList();
        this.A0i = new ArrayList();
        this.A0k = new ArrayList();
        this.A0I = EnumC130605v7.COLLAPSED;
        this.A0K = C05F.A00;
        int i2 = 0;
        this.A0S = false;
        this.A0O = true;
        this.A0L = false;
        this.A0f = new C668630d() { // from class: X.5v8
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                float f = (float) c55982hj.A09.A00;
                StrokeWidthTool strokeWidthTool = StrokeWidthTool.this;
                float f2 = strokeWidthTool.A00;
                strokeWidthTool.A01 = f2 + ((1.0f - f2) * f);
                StrokeWidthTool.A04(strokeWidthTool);
                if (strokeWidthTool.A0O) {
                    StrokeWidthTool.A05(strokeWidthTool, 0.0f);
                } else {
                    StrokeWidthTool.A05(strokeWidthTool, 1.0f);
                }
                strokeWidthTool.invalidate();
            }
        };
        this.A0g = new C668630d() { // from class: X.5v9
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                StrokeWidthTool strokeWidthTool = StrokeWidthTool.this;
                StrokeWidthTool.A05(strokeWidthTool, (float) c55982hj.A09.A00);
                strokeWidthTool.invalidate();
            }
        };
        try {
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2G);
            try {
                float max = Math.max(0.0f, Math.min(obtainStyledAttributes.getFloat(9, -1.0f), 1.0f));
                this.A07 = obtainStyledAttributes.getDimension(6, 5.0f);
                this.A05 = obtainStyledAttributes.getDimension(8, 2.0f);
                this.A04 = obtainStyledAttributes.getDimension(7, 100.0f);
                this.A0W = obtainStyledAttributes.getDimension(15, 10.0f);
                this.A0X = obtainStyledAttributes.getDimension(16, 60.0f);
                this.A0V = obtainStyledAttributes.getDimension(12, 60.0f) / 2.0f;
                float dimension = obtainStyledAttributes.getDimension(2, 3.0f);
                this.A0T = dimension;
                int color = obtainStyledAttributes.getColor(14, -1);
                int color2 = obtainStyledAttributes.getColor(11, -1);
                this.A0q = obtainStyledAttributes.getDimension(13, 0.0f);
                setCollapsedIcon(obtainStyledAttributes.getDrawable(3));
                this.A0H = obtainStyledAttributes.getDrawable(4);
                this.A0Q = obtainStyledAttributes.getDimension(5, 0.0f);
                float dimension2 = obtainStyledAttributes.getDimension(10, 0.0f);
                this.A0o = obtainStyledAttributes.getDimension(1, 0.0f);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentDescription(context.getString(resourceId));
                }
                obtainStyledAttributes.recycle();
                this.A0U = getResources().getDisplayMetrics().density;
                this.A0r = (int) (r2.getDisplayMetrics().widthPixels * max);
                this.A0p = (-(r0 / 2)) + getPaddingLeft();
                Paint paint = new Paint(1);
                this.A0a = paint;
                paint.setColor(-1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(dimension);
                Paint paint2 = new Paint(1);
                this.A0Z = paint2;
                Paint.Style style = Paint.Style.FILL;
                paint2.setStyle(style);
                Paint paint3 = new Paint(1);
                this.A0Y = paint3;
                paint3.setStyle(style);
                paint3.setColor(-1);
                Paint paint4 = new Paint(1);
                this.A0d = paint4;
                paint4.setStyle(style);
                paint4.setColor(color);
                Paint paint5 = new Paint(1);
                this.A0b = paint5;
                paint5.setStyle(style);
                paint5.setColor(context2.getColor(R.color.black_25_transparent));
                paint5.setMaskFilter(new BlurMaskFilter(dimension2, BlurMaskFilter.Blur.OUTER));
                Paint paint6 = new Paint(1);
                this.A0c = paint6;
                paint6.setStyle(style);
                paint6.setColor(color2);
                setLayerType(1, null);
                this.A0s = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.5vA
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final void onShowPress(MotionEvent motionEvent) {
                        StrokeWidthTool strokeWidthTool = StrokeWidthTool.this;
                        if (strokeWidthTool.A0N) {
                            strokeWidthTool.A0M = true;
                            strokeWidthTool.setMode(EnumC130605v7.EXPANDED);
                            ((C55982hj) strokeWidthTool.A0n.getValue()).A03();
                            C8PS c8ps = strokeWidthTool.A0J;
                            if (c8ps != null) {
                                strokeWidthTool.getLocationInWindow(StrokeWidthTool.A0t);
                                c8ps.Dsx(r1[0] + strokeWidthTool.A0D, r1[1] + strokeWidthTool.A0A);
                            }
                        }
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onSingleTapUp(MotionEvent motionEvent) {
                        StrokeWidthTool strokeWidthTool = StrokeWidthTool.this;
                        boolean A08 = strokeWidthTool.A08(motionEvent.getX(), motionEvent.getY());
                        if (A08) {
                            if (strokeWidthTool.A0O) {
                                EnumC130605v7 enumC130605v7 = strokeWidthTool.A0I;
                                EnumC130605v7 enumC130605v72 = EnumC130605v7.COLLAPSED;
                                if (enumC130605v7 == enumC130605v72) {
                                    enumC130605v72 = EnumC130605v7.EXPANDED;
                                }
                                strokeWidthTool.setMode(enumC130605v72);
                            }
                            strokeWidthTool.A0N = false;
                            strokeWidthTool.A0P = false;
                        }
                        return A08;
                    }

                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onDown(MotionEvent motionEvent) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        StrokeWidthTool strokeWidthTool = StrokeWidthTool.this;
                        boolean A08 = strokeWidthTool.A08(x, y);
                        strokeWidthTool.A0N = A08;
                        if (!A08 && strokeWidthTool.A0I == EnumC130605v7.EXPANDED && y <= strokeWidthTool.A0B) {
                            strokeWidthTool.A0P = true;
                            ((C55982hj) strokeWidthTool.A0n.getValue()).A06(1.0d);
                            StrokeWidthTool.A06(strokeWidthTool, y);
                        }
                        if (strokeWidthTool.A0P || strokeWidthTool.A0N) {
                            return true;
                        }
                        return false;
                    }
                }, new Handler(Looper.getMainLooper()));
                do {
                    this.A0i.add(new PointF());
                    this.A0k.add(new PointF());
                    this.A0j.add(new PointF());
                    i2++;
                } while (i2 < 4);
                this.A0m = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.5vB
                    @Override // X.InterfaceC16820sZ
                    public final /* bridge */ /* synthetic */ Object invoke() {
                        return AbstractC13560mi.A00();
                    }
                });
                this.A0l = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.5vC
                    @Override // X.InterfaceC16820sZ
                    public final /* bridge */ /* synthetic */ Object invoke() {
                        StrokeWidthTool strokeWidthTool = StrokeWidthTool.this;
                        C55982hj A02 = ((C55952hg) strokeWidthTool.A0m.getValue()).A02();
                        A02.A06 = true;
                        A02.A0A(strokeWidthTool.A0f);
                        return A02;
                    }
                });
                this.A0n = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.5vD
                    @Override // X.InterfaceC16820sZ
                    public final /* bridge */ /* synthetic */ Object invoke() {
                        StrokeWidthTool strokeWidthTool = StrokeWidthTool.this;
                        C55982hj A02 = ((C55952hg) strokeWidthTool.A0m.getValue()).A02();
                        A02.A06 = true;
                        A02.A0A(strokeWidthTool.A0g);
                        return A02;
                    }
                });
                this.A0h = new C130675vE(this);
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public StrokeWidthTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
