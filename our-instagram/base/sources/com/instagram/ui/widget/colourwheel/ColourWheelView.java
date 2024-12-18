package com.instagram.ui.widget.colourwheel;

import X.AbstractC13560mi;
import X.AbstractC13600mm;
import X.AbstractC13620mo;
import X.AbstractC55922hc;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C55982hj;
import X.C668630d;
import X.C8LE;
import X.C8QG;
import X.C8QI;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import com.instagram.ui.widget.drawing.FloatingIndicator;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ColourWheelView extends FrameLayout {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public View A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public Drawable A0F;
    public C8QI A0G;
    public boolean A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final C55982hj A0K;
    public final C8QG A0L;
    public final FloatingIndicator A0M;
    public final Set A0N;
    public final boolean A0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColourWheelView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A0A) {
            A02();
            C8QG c8qg = this.A0L;
            c8qg.setAlpha(AbstractC13600mm.A03((int) (255.0f * this.A00), 0, 255));
            canvas.drawCircle(c8qg.A00, c8qg.A01, c8qg.A02 + this.A04 + 2.0f, this.A0I);
            canvas.drawCircle(c8qg.A00, c8qg.A01, c8qg.A02 + this.A04, this.A0J);
            Drawable drawable = this.A0F;
            if (drawable == null) {
                C14360o3.A0F("baseDrawable");
                throw C00O.createAndThrow();
            }
            drawable.draw(canvas);
            c8qg.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (!this.A0H) {
            return false;
        }
        if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
            if (this.A0H) {
                return true;
            }
        } else {
            this.A0H = false;
            setMode(C8QI.A03);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBaseDrawable(Drawable drawable) {
        Drawable newDrawable;
        C14360o3.A0B(drawable, 0);
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
            this.A0F = newDrawable;
        }
    }

    private final void A00() {
        View view = this.A09;
        if (view != null) {
            int x = (int) view.getX();
            View view2 = this.A09;
            if (view2 != null) {
                this.A07 = x + (view2.getWidth() / 2);
                View view3 = this.A09;
                if (view3 != null) {
                    float y = view3.getY();
                    if (this.A09 != null) {
                        this.A08 = (int) ((y + (r0.getHeight() / 2)) - getCursorOffset());
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("childButtonView");
        throw C00O.createAndThrow();
    }

    private final void A01() {
        int i = this.A07;
        int i2 = this.A08;
        float f = this.A02;
        float f2 = i - f;
        float f3 = this.A03;
        float f4 = i2 - f3;
        float f5 = (f2 * f2) + (f4 * f4);
        float f6 = this.A05;
        if (f5 >= f6 * f6) {
            double atan2 = Math.atan2(f4, f2);
            double d = f6;
            i = (int) (f + (d * Math.cos(atan2)));
            this.A07 = i;
            i2 = (int) (f3 + (d * Math.sin(atan2)));
            this.A08 = i2;
        }
        this.A0M.A01(i, i2 + getCursorOffset(), this.A07, this.A08 - (r2.getHeight() / 2), this.A0D, getColourAtCursor(), 1, 0L, false);
    }

    private final void A02() {
        float f;
        float f2 = this.A00;
        float f3 = this.A01;
        int i = (int) (f3 + ((this.A05 - f3) * f2));
        View view = this.A09;
        String str = "childButtonView";
        if (view != null) {
            float x = view.getX();
            if (this.A09 != null) {
                float width = x + (r0.getWidth() / 2);
                View view2 = this.A09;
                if (view2 != null) {
                    float y = view2.getY();
                    if (this.A09 != null) {
                        float height = y + (r0.getHeight() / 2);
                        boolean z = this.A0O;
                        float f4 = this.A0B;
                        if (z) {
                            f = width - f4;
                        } else {
                            f = f4 + width;
                        }
                        this.A02 = f;
                        float f5 = this.A0C + height;
                        this.A03 = f5;
                        float f6 = this.A00;
                        int i2 = (int) (width + ((f - width) * f6));
                        int i3 = (int) (height + ((f5 - height) * f6));
                        C8QG c8qg = this.A0L;
                        Rect rect = c8qg.A05;
                        rect.set(i2 - i, i3 - i, i2 + i, i3 + i);
                        c8qg.setBounds(rect);
                        Drawable drawable = this.A0F;
                        if (drawable == null) {
                            str = "baseDrawable";
                        } else {
                            drawable.setBounds(c8qg.getBounds());
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(ColourWheelView colourWheelView, Integer num) {
        for (C8LE c8le : colourWheelView.A0N) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 1) {
                            if (intValue == 4) {
                                c8le.D60(colourWheelView.getColourAtCursor());
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            c8le.D64();
                        }
                    } else {
                        c8le.D62();
                    }
                } else {
                    c8le.D63();
                }
            } else {
                c8le.D61(colourWheelView.A06);
            }
        }
    }

    private final int getColourAtCursor() {
        int i = this.A07 - ((int) this.A02);
        int i2 = this.A08 - ((int) this.A03);
        double sqrt = Math.sqrt((i * i) + (i2 * i2));
        float[] fArr = {0.0f, 0.0f, 1.0f};
        fArr[0] = ((float) ((Math.atan2(i2, -i) / 3.141592653589793d) * 180.0d)) + 180.0f;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, (float) (sqrt / this.A05)));
        return Color.HSVToColor(fArr);
    }

    private final float getCursorOffset() {
        return this.A0E - (this.A0M.getHeight() / 2);
    }

    private final void setMode(C8QI c8qi) {
        C55982hj c55982hj;
        double d;
        if (c8qi != this.A0G) {
            this.A0G = c8qi;
            int ordinal = c8qi.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    this.A0M.A00();
                    c55982hj = this.A0K;
                    d = 0.0d;
                } else {
                    throw new RuntimeException();
                }
            } else {
                A01();
                c55982hj = this.A0K;
                d = 1.0d;
            }
            c55982hj.A06(d);
            invalidate();
        }
    }

    public final void setColourWheelStrokeWidth(float f) {
        this.A04 = f;
        this.A0I.setMaskFilter(new BlurMaskFilter(f + 2.0f, BlurMaskFilter.Blur.OUTER));
    }

    public final void A04() {
        A02();
        A00();
        setMode(C8QI.A02);
        this.A0H = true;
        View view = this.A09;
        if (view == null) {
            C14360o3.A0F("childButtonView");
            throw C00O.createAndThrow();
        }
        view.setVisibility(4);
        this.A0A = true;
        A03(this, C05F.A01);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(549040525);
        super.onFinishInflate();
        if (getChildCount() == 2) {
            this.A09 = getChildAt(1);
            A00();
            C0f9.A0D(-1577259635, A06);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Check failed.");
            C0f9.A0D(-253341821, A06);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 400456560(0x17de7b70, float:1.4377574E-24)
            int r2 = X.C0f9.A05(r0)
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L54
            r0 = 2
            if (r1 == r3) goto L21
            if (r1 == r0) goto L54
            r0 = 3
            if (r1 == r0) goto L21
        L1a:
            r0 = -1720092406(0xffffffff9979790a, float:-1.2897442E-23)
        L1d:
            X.C0f9.A0C(r0, r2)
            return r3
        L21:
            r5.A0H = r4
            X.8QI r0 = r5.A0G
            if (r0 == 0) goto L1a
            int r0 = r0.ordinal()
            if (r0 == r4) goto L36
            if (r0 != r3) goto L1a
            r0 = 487866055(0x1d143ec7, float:1.9620092E-21)
            X.C0f9.A0C(r0, r2)
            return r4
        L36:
            X.2hj r0 = r5.A0K
            boolean r0 = r0.A0C()
            r0 = r0 ^ 1
            if (r0 != 0) goto L4b
            int r0 = r5.getColourAtCursor()
            r5.A06 = r0
            java.lang.Integer r0 = X.C05F.A00
            A03(r5, r0)
        L4b:
            X.8QI r0 = X.C8QI.A03
            r5.setMode(r0)
            r0 = -512509594(0xffffffffe173b966, float:-2.8099489E20)
            goto L1d
        L54:
            X.8QI r1 = r5.A0G
            X.8QI r0 = X.C8QI.A02
            if (r1 != r0) goto L1a
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.A07 = r0
            float r1 = r6.getY()
            float r0 = r5.getCursorOffset()
            float r1 = r1 - r0
            int r0 = (int) r1
            r5.A08 = r0
            r5.A01()
            X.2hj r0 = r5.A0K
            boolean r0 = r0.A0C()
            r0 = r0 ^ 1
            if (r0 != 0) goto L1a
            java.lang.Integer r0 = X.C05F.A0Y
            A03(r5, r0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.colourwheel.ColourWheelView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setButtonRadius(float f) {
        this.A01 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColourWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Paint paint = new Paint(1);
        this.A0J = paint;
        Paint paint2 = new Paint(1);
        this.A0I = paint2;
        this.A0O = AbstractC13620mo.A02(context);
        setWillNotDraw(false);
        setClipChildren(false);
        FloatingIndicator floatingIndicator = new FloatingIndicator(context);
        this.A0M = floatingIndicator;
        floatingIndicator.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(floatingIndicator);
        TypedArray typedArray = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0J);
            this.A05 = typedArray.getDimensionPixelSize(2, 140) / 2;
            this.A0E = typedArray.getDimension(1, 80.0f);
            this.A0B = typedArray.getDimension(3, 0.0f);
            this.A0C = typedArray.getDimension(4, 92.0f);
            this.A04 = typedArray.getDimension(5, 2.0f);
            this.A0D = typedArray.getDimension(0, 40.0f);
            typedArray.recycle();
            this.A0L = new C8QG((int) this.A04);
            paint.setColor(-1);
            this.A0N = new HashSet();
            this.A06 = getColourAtCursor();
            this.A01 = 32.0f;
            paint2.setColor(context.getColor(R.color.black_15_transparent));
            paint2.setMaskFilter(new BlurMaskFilter(this.A04 + 2.0f, BlurMaskFilter.Blur.OUTER));
            C668630d c668630d = new C668630d() { // from class: X.8QH
                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnk(C55982hj c55982hj) {
                    C14360o3.A0B(c55982hj, 0);
                    if (c55982hj.A01 == 0.0d) {
                        ColourWheelView colourWheelView = ColourWheelView.this;
                        ColourWheelView.A03(colourWheelView, C05F.A0N);
                        colourWheelView.A0M.A00();
                        View view = colourWheelView.A09;
                        if (view == null) {
                            C14360o3.A0F("childButtonView");
                            throw C00O.createAndThrow();
                        }
                        view.setVisibility(0);
                        colourWheelView.A0A = false;
                    }
                }

                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnl(C55982hj c55982hj) {
                    C14360o3.A0B(c55982hj, 0);
                    if (c55982hj.A01 == 0.0d) {
                        c55982hj.A06 = true;
                        ColourWheelView colourWheelView = ColourWheelView.this;
                        ColourWheelView.A03(colourWheelView, C05F.A0C);
                        if (c55982hj.A09.A00 == 0.0d) {
                            ColourWheelView.A03(colourWheelView, C05F.A0N);
                            colourWheelView.A0M.A00();
                            View view = colourWheelView.A09;
                            if (view == null) {
                                C14360o3.A0F("childButtonView");
                                throw C00O.createAndThrow();
                            }
                            view.setVisibility(0);
                            colourWheelView.A0A = false;
                            return;
                        }
                        return;
                    }
                    c55982hj.A06 = false;
                }

                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnm(C55982hj c55982hj) {
                    C14360o3.A0B(c55982hj, 0);
                    ColourWheelView colourWheelView = ColourWheelView.this;
                    colourWheelView.A00 = (float) c55982hj.A09.A00;
                    colourWheelView.invalidate();
                }
            };
            C55982hj A02 = AbstractC13560mi.A00().A02();
            A02.A06(0.0d);
            A02.A01();
            A02.A0A(c668630d);
            this.A0K = A02;
            setMode(C8QI.A03);
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public /* synthetic */ ColourWheelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColourWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
