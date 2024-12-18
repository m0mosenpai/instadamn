package com.instagram.ui.widget.drawing;

import X.AbstractC13560mi;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.AbstractC70163Da;
import X.AnonymousClass656;
import X.C0f9;
import X.C18C;
import X.C55952hg;
import X.C55982hj;
import X.C668630d;
import X.C8H3;
import X.RunnableC24492AtB;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.facebook.R;
import com.instagram.ui.widget.drawing.EffectSlider;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class EffectSlider extends View {
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
    public int A0B;
    public int A0C;
    public long A0D;
    public C55982hj A0E;
    public C8H3 A0F;
    public AnonymousClass656 A0G;
    public boolean A0H;
    public boolean A0I;
    public float A0J;
    public float A0K;
    public int A0L;
    public BitmapShader A0M;
    public LinearGradient A0N;
    public C55982hj A0O;
    public boolean A0P;
    public int[] A0Q;
    public int A0R;
    public final float A0S;
    public final float A0T;
    public final float A0U;
    public final Paint A0V;
    public final Paint A0W;
    public final Paint A0X;
    public final Path A0Y;
    public final RectF A0Z;
    public final ArrayList A0a;
    public final ArrayList A0b;
    public final ArrayList A0c;
    public final float A0d;
    public final GestureDetector A0e;
    public final C668630d A0f;
    public final C668630d A0g;

    public EffectSlider(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        this.A0P = true;
        this.A0A = getWidth() / 2.0f;
        this.A0J = (getHeight() - this.A0A) - getPaddingBottom();
        this.A09 = this.A06 + getPaddingTop();
        float height = (((getHeight() - getWidth()) - this.A06) - this.A0S) - getPaddingBottom();
        this.A08 = height;
        int i5 = this.A0B;
        if (i5 != 2 && i5 != 1) {
            f = this.A0d;
        } else {
            f = (height - this.A09) * 0.060606062f;
        }
        this.A06 = f;
        A00();
        float f2 = this.A02;
        float f3 = this.A08;
        A03(this, f3 + ((this.A09 - f3) * f2));
        A01(this);
    }

    private void A00() {
        int[] iArr = this.A0Q;
        if (iArr != null) {
            float f = this.A09;
            float f2 = this.A08;
            if (f != f2) {
                float f3 = this.A0T;
                LinearGradient linearGradient = new LinearGradient(f3, f, f3, f2, iArr, (float[]) null, Shader.TileMode.CLAMP);
                this.A0N = linearGradient;
                this.A0X.setShader(linearGradient);
            }
        }
        BitmapShader bitmapShader = this.A0M;
        if (bitmapShader != null) {
            this.A0W.setShader(bitmapShader);
        } else {
            this.A0W.setShader(null);
        }
        invalidate();
    }

    public static void A01(EffectSlider effectSlider) {
        float f = (float) effectSlider.A0O.A09.A00;
        float f2 = effectSlider.A0J;
        float f3 = f2 + ((effectSlider.A09 - f2) * f);
        float f4 = f2 + ((effectSlider.A08 - f2) * f);
        ArrayList arrayList = effectSlider.A0a;
        PointF pointF = (PointF) arrayList.get(0);
        float f5 = effectSlider.A0A;
        float f6 = effectSlider.A0T / 2.0f;
        pointF.set(f5 - f6, f4);
        ((PointF) arrayList.get(1)).set(effectSlider.A0A - f6, f3);
        ((PointF) arrayList.get(2)).set(effectSlider.A0A + f6, f3);
        ((PointF) arrayList.get(3)).set(effectSlider.A0A + f6, f4);
        ArrayList arrayList2 = effectSlider.A0c;
        ((PointF) arrayList2.get(0)).set(effectSlider.A0A, f4);
        PointF pointF2 = (PointF) arrayList2.get(1);
        float f7 = effectSlider.A0A;
        float f8 = effectSlider.A0U / 2.0f;
        pointF2.set(f7 - f8, f3);
        ((PointF) arrayList2.get(2)).set(effectSlider.A0A + f8, f3);
        ((PointF) arrayList2.get(3)).set(effectSlider.A0A, f4);
        float f9 = effectSlider.A0J - effectSlider.A07;
        effectSlider.A05 = f9 + ((0.0f - f9) * f);
    }

    public static void A02(EffectSlider effectSlider, float f) {
        ArrayList arrayList = effectSlider.A0a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) arrayList.get(i);
            PointF pointF2 = (PointF) effectSlider.A0c.get(i);
            PointF pointF3 = (PointF) effectSlider.A0b.get(i);
            float f2 = pointF.x;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            pointF3.set(f3, f4 + ((pointF2.y - f4) * f));
        }
    }

    public static void A03(EffectSlider effectSlider, float f) {
        if (effectSlider.A0P) {
            float f2 = effectSlider.A08;
            float f3 = effectSlider.A09;
            float min = Math.min(f2, Math.max(f3, f));
            float f4 = (min - f2) / (f3 - f2);
            effectSlider.A02 = f4;
            C8H3 c8h3 = effectSlider.A0F;
            if (c8h3 != null) {
                c8h3.Dyb(f4);
            }
            effectSlider.A07 = min;
        }
    }

    private void setVisibility(AnonymousClass656 anonymousClass656) {
        C55982hj c55982hj;
        double d;
        if (this.A0G != anonymousClass656) {
            this.A0G = anonymousClass656;
            if (anonymousClass656 == AnonymousClass656.FULL) {
                c55982hj = this.A0O;
                d = 1.0d;
            } else {
                if (anonymousClass656 == AnonymousClass656.HIDDEN) {
                    c55982hj = this.A0O;
                    d = 0.0d;
                }
                invalidate();
            }
            c55982hj.A06(d);
            invalidate();
        }
    }

    public final void A04(int i, int i2, float[] fArr, byte[] bArr) {
        int length;
        this.A0B = i;
        this.A0C = i2;
        this.A0N = null;
        this.A0Q = null;
        this.A0M = null;
        this.A0X.setShader(null);
        if (fArr != null) {
            int length2 = fArr.length / 4;
            int[] iArr = new int[length2];
            this.A0Q = iArr;
            for (int i3 = length2 - 1; i3 >= 0; i3--) {
                int i4 = i3 * 4;
                iArr[(length2 - i3) - 1] = ((Math.round(fArr[i4 + 3] * 255.0f) & 255) << 24) | ((Math.round(fArr[i4] * 255.0f) & 255) << 16) | ((Math.round(fArr[i4 + 1] * 255.0f) & 255) << 8) | (Math.round(fArr[i4 + 2] * 255.0f) & 255);
            }
        }
        if (bArr != null && (length = bArr.length) > 0) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length);
            C18C.A07(decodeByteArray, "Image could not be decoded");
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.A0M = new BitmapShader(decodeByteArray, tileMode, tileMode);
        }
        A00();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A0G == AnonymousClass656.PARTIAL) {
            if (this.A0H) {
                float max = Math.max(0.0f, Math.min((((float) (System.currentTimeMillis() - this.A0D)) - 0.0f) / 300.0f, 1.0f));
                this.A0E.A05(1.0f - max);
                if (max > 0.0f && max < 1.0f) {
                    invalidate();
                } else {
                    this.A0H = false;
                }
                this.A00 = (float) AbstractC70163Da.A03(max, this.A03, this.A04);
            }
            setTranslationX(this.A00);
        } else {
            setTranslationX(0.0f);
        }
        if (this.A0G != AnonymousClass656.HIDDEN || !this.A0O.A0C()) {
            Path path = this.A0Y;
            path.rewind();
            if (this.A0B == 0) {
                ArrayList arrayList = this.A0b;
                PointF pointF = (PointF) arrayList.get(0);
                path.moveTo(pointF.x, pointF.y);
                int size = arrayList.size();
                for (int i = 1; i < size; i++) {
                    PointF pointF2 = (PointF) arrayList.get(i);
                    path.lineTo(pointF2.x, pointF2.y);
                }
                path.close();
                path.setFillType(Path.FillType.WINDING);
            } else {
                float f = this.A06 * 0.5f;
                RectF rectF = this.A0Z;
                float f2 = this.A0A;
                float f3 = f / 2.0f;
                rectF.set(f2 - f3, this.A09, f2 + f3, this.A08);
                path.reset();
                path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                path.close();
            }
            canvas.drawPath(path, this.A0V);
            canvas.drawPath(path, this.A0X);
        }
        int i2 = this.A0C;
        if (i2 > 0 && this.A0B == 1) {
            float f4 = ((this.A0T * 5.0f) / 2.0f) * 0.9f;
            if (i2 > 1) {
                float f5 = this.A0A;
                float f6 = this.A09 + f4;
                Paint paint = this.A0W;
                canvas.drawCircle(f5, f6, f4, paint);
                canvas.drawCircle(this.A0A, this.A08 - f4, f4, paint);
            }
            float f7 = (this.A08 - this.A09) / (this.A0C + 1);
            for (int i3 = 0; i3 < this.A0C; i3++) {
                canvas.drawCircle(this.A0A, this.A09 + f7, f4, this.A0W);
                f7 += f7;
            }
        }
        float f8 = this.A07;
        if (f8 > 0.0f) {
            canvas.drawCircle(this.A0A, f8 + this.A05, this.A06, this.A0V);
            canvas.drawCircle(this.A0A, this.A07 + this.A05, this.A06, this.A0W);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.A0R, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public void setProgress(float f) {
        this.A02 = f;
        float f2 = this.A08;
        A03(this, f2 + ((this.A09 - f2) * f));
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(733003340);
        ViewParent parent = getParent();
        parent.getClass();
        parent.requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            if (action == 0) {
                this.A0K = motionEvent.getY();
                this.A0G = AnonymousClass656.FULL;
                this.A0H = true;
                this.A04 = 0.0f;
                this.A03 = this.A00;
                this.A0D = System.currentTimeMillis();
            } else {
                if (action == 2 && this.A0I) {
                    float y = motionEvent.getY();
                    float f = this.A0K - y;
                    this.A0K = y;
                    A03(this, this.A07 - f);
                }
                boolean onTouchEvent = this.A0e.onTouchEvent(motionEvent);
                C0f9.A0C(1688480494, A05);
                return onTouchEvent;
            }
        } else {
            this.A0G = AnonymousClass656.PARTIAL;
            this.A0H = false;
            this.A04 = this.A01;
            this.A03 = this.A00;
            this.A0D = System.currentTimeMillis();
            postDelayed(new RunnableC24492AtB(this), 0L);
            this.A0E.A04();
            this.A0I = false;
            float f2 = this.A07;
            int i = this.A0C;
            if (i > 0) {
                float f3 = this.A08;
                float f4 = this.A09;
                float f5 = f3 - f4;
                float f6 = f5 / 15.0f;
                float f7 = f5 / (i + 1);
                int i2 = 0;
                while (true) {
                    if (Math.abs((f2 - f4) - f7) < f6) {
                        f2 = f4 + f7;
                        break;
                    }
                    f7 += f7;
                    i2++;
                    if (i2 >= i) {
                        break;
                    }
                }
            }
            this.A07 = f2;
        }
        invalidate();
        boolean onTouchEvent2 = this.A0e.onTouchEvent(motionEvent);
        C0f9.A0C(1688480494, A05);
        return onTouchEvent2;
    }

    public void setOnValueChangedListener(C8H3 c8h3) {
        this.A0F = c8h3;
    }

    public EffectSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0Y = new Path();
        this.A0Z = new RectF();
        int i2 = 0;
        this.A0P = false;
        this.A02 = 0.0f;
        this.A09 = 0.0f;
        this.A08 = 0.0f;
        this.A0b = new ArrayList();
        this.A0a = new ArrayList();
        this.A0c = new ArrayList();
        this.A0G = AnonymousClass656.HIDDEN;
        this.A0H = false;
        this.A0Q = null;
        this.A0N = null;
        this.A0M = null;
        C668630d c668630d = new C668630d() { // from class: X.657
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                EffectSlider effectSlider = EffectSlider.this;
                EffectSlider.A01(effectSlider);
                EffectSlider.A02(effectSlider, 0.0f);
                effectSlider.invalidate();
            }
        };
        this.A0f = c668630d;
        C668630d c668630d2 = new C668630d() { // from class: X.658
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                EffectSlider effectSlider = EffectSlider.this;
                EffectSlider.A02(effectSlider, (float) c55982hj.A09.A00);
                effectSlider.invalidate();
            }
        };
        this.A0g = c668630d2;
        try {
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2G);
            try {
                float max = Math.max(0.0f, Math.min(obtainStyledAttributes.getFloat(9, -1.0f), 1.0f));
                this.A0T = obtainStyledAttributes.getDimension(15, 10.0f);
                this.A0U = obtainStyledAttributes.getDimension(16, 60.0f);
                float dimension = obtainStyledAttributes.getDimension(12, 60.0f) / 2.0f;
                this.A0d = dimension;
                int color = obtainStyledAttributes.getColor(14, -1);
                this.A0L = obtainStyledAttributes.getColor(11, -1);
                this.A0S = obtainStyledAttributes.getDimension(13, 0.0f);
                float dimension2 = obtainStyledAttributes.getDimension(10, 0.0f);
                this.A06 = dimension;
                obtainStyledAttributes.recycle();
                this.A0R = (int) (getResources().getDisplayMetrics().widthPixels * max);
                this.A01 = (r0 / 2) - getPaddingLeft();
                Paint paint = new Paint(1);
                this.A0X = paint;
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                paint.setColor(color);
                Paint paint2 = new Paint(1);
                this.A0V = paint2;
                paint2.setStyle(style);
                paint2.setColor(context2.getColor(R.color.black_25_transparent));
                paint2.setMaskFilter(new BlurMaskFilter(dimension2, BlurMaskFilter.Blur.OUTER));
                Paint paint3 = new Paint(1);
                this.A0W = paint3;
                paint3.setStyle(style);
                paint3.setColor(this.A0L);
                setLayerType(1, null);
                C55952hg A00 = AbstractC13560mi.A00();
                C55982hj A02 = A00.A02();
                A02.A06 = true;
                A02.A0A(c668630d);
                this.A0O = A02;
                C55982hj A022 = A00.A02();
                A022.A06 = true;
                A022.A0A(c668630d2);
                this.A0E = A022;
                this.A0e = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.659
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onDown(MotionEvent motionEvent) {
                        float y = motionEvent.getY();
                        EffectSlider effectSlider = EffectSlider.this;
                        if (effectSlider.A0G != AnonymousClass656.HIDDEN && y <= effectSlider.A08 + (effectSlider.A06 * 2.0f) + effectSlider.A0S) {
                            effectSlider.A0I = true;
                            effectSlider.A0E.A03();
                            EffectSlider.A03(effectSlider, y);
                        }
                        return effectSlider.A0I;
                    }
                }, new Handler(Looper.getMainLooper()));
                Rect rect = new Rect();
                getHitRect(rect);
                rect.left -= 4;
                rect.right += 4;
                setTouchDelegate(new TouchDelegate(rect, this));
                do {
                    this.A0a.add(new PointF());
                    this.A0c.add(new PointF());
                    this.A0b.add(new PointF());
                    i2++;
                } while (i2 < 4);
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setVisibility(AnonymousClass656.FULL);
    }

    public EffectSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
