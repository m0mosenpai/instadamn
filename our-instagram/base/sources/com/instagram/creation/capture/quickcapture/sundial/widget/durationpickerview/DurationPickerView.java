package com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview;

import X.AbstractC13600mm;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC53242c7;
import X.C0f9;
import X.C14360o3;
import X.C1H4;
import X.C210219Rk;
import X.C22836A5f;
import X.C56188Owv;
import X.C8R4;
import X.C8RH;
import X.C8RI;
import X.C8RL;
import X.InterfaceC57819Pkl;
import X.InterfaceC57940Pmk;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview.DurationPickerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DurationPickerView extends View implements InterfaceC57940Pmk {
    public float A00;
    public int A01;
    public long A02;
    public InterfaceC57819Pkl A03;
    public boolean A04;
    public float[] A05;
    public float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final C8RH A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Paint A0H;
    public final Rect A0I;
    public final C8RI A0J;
    public final C8R4 A0K;
    public final C210219Rk A0L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DurationPickerView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C8RI c8ri = this.A0J;
        float A01 = c8ri.A01();
        int i = c8ri.getBounds().top;
        int i2 = c8ri.A0D;
        C8RH c8rh = this.A0D;
        canvas.drawRect(A01, i + i2, c8rh.getLeftInnerEdge(), AbstractC166987dD.A0D(c8ri) - i2, this.A0H);
        c8ri.draw(canvas);
        if (this.A04) {
            float f = this.A00;
            if (f > 0.0f || f < 1.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f2 = ((float) (currentTimeMillis - this.A02)) / 150.0f;
                this.A02 = currentTimeMillis;
                float min = Math.min(1.0f, f + f2);
                this.A00 = min;
                if (min < 1.0f) {
                    invalidate();
                }
                this.A0A.setAlpha(AbstractC166987dD.A0B(255.0f, this.A00));
            }
        }
        canvas.drawRect(this.A0I, this.A0A);
        draw(canvas);
        float top = c8rh.getTop() + AbstractC166987dD.A02(c8rh.getHeight());
        float left = c8rh.getLeft() + this.A07;
        float right = ((c8rh.getRight() - r0) - this.A09) - left;
        float leftTrimmerValue = c8rh.getLeftTrimmerValue();
        for (float f3 : this.A05) {
            if (f3 > leftTrimmerValue) {
                float f4 = (f3 * right) + left;
                float f5 = this.A08;
                canvas.drawCircle(f4, top, f5, this.A0B);
                canvas.drawCircle(f4, top, f5, this.A0C);
            }
        }
        c8rh.draw(canvas);
    }

    private final void A00() {
        if (!Float.isNaN(this.A06)) {
            C8RH c8rh = this.A0D;
            int leftInnerEdge = c8rh.getLeftInnerEdge();
            this.A0I.set(leftInnerEdge, c8rh.getTopInnerEdge(), AbstractC166987dD.A0B(c8rh.getRightInnerEdge() - leftInnerEdge, this.A06) + leftInnerEdge, c8rh.getBottomInnerEdge());
            invalidate();
        }
    }

    @Override // X.InterfaceC57940Pmk
    public void setProgress(float f) {
        if (!this.A04) {
            this.A04 = true;
            this.A02 = System.currentTimeMillis();
            invalidate();
        }
        float A00 = AbstractC13600mm.A00(f, 0.0f, 1.0f);
        if (A00 != this.A06) {
            this.A06 = A00;
            A00();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1456064567);
        super.onSizeChanged(i, i2, i3, i4);
        C8RI c8ri = this.A0J;
        c8ri.setBounds(0, 0, i, i2);
        float f = i2;
        float f2 = f / 2.0f;
        float f3 = this.A0E / 2.0f;
        setBounds(0, C1H4.A01(f2 - f3), c8ri.A02(), C1H4.A01(f2 + f3));
        C8RH c8rh = this.A0D;
        c8rh.layout(0, 0, i, i2);
        A00();
        LinearGradient linearGradient = new LinearGradient(0.0f, f, i, 0.0f, this.A0F, this.A0G, Shader.TileMode.CLAMP);
        c8rh.setShader(linearGradient);
        this.A0A.setShader(linearGradient);
        this.A0B.setShader(linearGradient);
        C0f9.A0D(1689719783, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        ViewParent parent;
        int A05 = C0f9.A05(-974043255);
        C14360o3.A0B(motionEvent, 0);
        int action = motionEvent.getAction();
        if (action == 0 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        C8RH c8rh = this.A0D;
        if (c8rh.onTouchEvent(motionEvent)) {
            i = -44253811;
        } else {
            float x = motionEvent.getX();
            if (action == 0 && c8rh.getLeftInnerEdge() <= x && x <= c8rh.getRight()) {
                C8RH.A02(c8rh, motionEvent.getX());
                c8rh.A0A = true;
                c8rh.A08 = true;
                c8rh.A00 = motionEvent.getX();
                c8rh.A03 = motionEvent.getEventTime();
                C8R4 c8r4 = c8rh.A05;
                if (c8r4 != null) {
                    c8r4.DuK();
                }
                i = -1120700945;
            } else {
                C0f9.A0C(-857072612, A05);
                return false;
            }
        }
        C0f9.A0C(i, A05);
        return true;
    }

    public void setDelegate(InterfaceC57819Pkl interfaceC57819Pkl) {
        this.A03 = interfaceC57819Pkl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.9Rk] */
    public DurationPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C56188Owv c56188Owv = new C56188Owv(this);
        this.A0K = c56188Owv;
        this.A01 = 100;
        this.A05 = new float[0];
        Resources resources = context.getResources();
        int A08 = AbstractC166997dE.A08(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A09 = dimensionPixelSize;
        this.A0E = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A07 = dimensionPixelSize2;
        this.A08 = resources.getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        this.A0F = context.getColor(R.color.clips_progress_bar_gradient_color_0);
        this.A0G = context.getColor(R.color.clips_progress_bar_gradient_color_1);
        int A0F = AbstractC53242c7.A0F(context, R.attr.durationPickerBackgroundTrimmerColor);
        C8RI c8ri = new C8RI(A0F, A08, dimensionPixelSize2, 0);
        if (dimensionPixelSize > 0) {
            C8RL c8rl = new C8RL(dimensionPixelSize, A0F);
            c8rl.A00(null, dimensionPixelSize2);
            c8ri.A09(c8rl);
        }
        c8ri.A06(0);
        this.A0J = c8ri;
        Paint A0R = AbstractC166987dD.A0R();
        this.A0H = A0R;
        A0R.setColor(A0F);
        this.A0I = AbstractC166987dD.A0U();
        this.A0A = AbstractC166987dD.A0S(1);
        final int A0F2 = AbstractC53242c7.A0F(context, R.attr.durationPickerSoundwaveColor);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0B = A0S;
        AbstractC166987dD.A1R(A0S);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0C = A0S2;
        A0S2.setStyle(Paint.Style.STROKE);
        A0S2.setStrokeWidth(AbstractC166997dE.A0B(resources));
        A0S2.setColor(A0F2);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        final C22836A5f c22836A5f = new C22836A5f(this);
        this.A0L = new Drawable(c22836A5f, dimensionPixelSize3, A0F2) { // from class: X.9Rk
            public final float A00;
            public final int A01;
            public final Paint A02;
            public final RectF A03 = AbstractC166987dD.A0X();
            public final C22836A5f A04;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i2) {
                this.A02.setAlpha(i2);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.A02.setColorFilter(colorFilter);
                invalidateSelf();
            }

            {
                this.A01 = dimensionPixelSize3;
                this.A04 = c22836A5f;
                this.A00 = AbstractC166987dD.A02(dimensionPixelSize3);
                Paint A0P = AbstractC166997dE.A0P();
                A0P.setColor(A0F2);
                this.A02 = A0P;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
                AbstractC167017dG.A11(canvas, A0Q);
                int width = A0Q.width();
                int height = A0Q.height();
                DurationPickerView durationPickerView = this.A04.A00;
                int i2 = durationPickerView.A01;
                int i3 = i2 / 15;
                int i4 = 1000;
                if (1000 < i3) {
                    i4 = i3;
                }
                float f = width / i2;
                for (int i5 = 0; i5 < i2; i5 += i4) {
                    if (i5 != 0) {
                        int i6 = durationPickerView.A01 / 15;
                        int i7 = 1000;
                        if (1000 < i6) {
                            i7 = i6;
                        }
                        float f2 = 0.5833333f;
                        if (i5 % (i7 * 2) < i7) {
                            f2 = 1.0f;
                        }
                        float f3 = i5 * f;
                        float f4 = height;
                        float f5 = (f4 / 2.0f) * (1.0f - f2);
                        float f6 = (f4 * f2) + f5;
                        RectF rectF = this.A03;
                        rectF.set(f3, f5, this.A01 + f3, f6);
                        float f7 = this.A00;
                        canvas.drawRoundRect(rectF, f7, f7, this.A02);
                    }
                }
                canvas.restore();
            }
        };
        C8RH c8rh = new C8RH(context);
        this.A0D = c8rh;
        Drawable drawable = context.getDrawable(R.drawable.duration_picker_trim_handle_icon);
        C8RI c8ri2 = new C8RI(-16777216, A08, dimensionPixelSize2, 0);
        if (dimensionPixelSize > 0) {
            C8RL c8rl2 = new C8RL(dimensionPixelSize, -16777216);
            c8rl2.A00(drawable, dimensionPixelSize2);
            c8ri2.A09(c8rl2);
        }
        c8ri2.A06(0);
        c8rh.A04 = c8ri2;
        if (c8rh.getWidth() > 0 && c8rh.getHeight() > 0) {
            C8RI c8ri3 = c8rh.A04;
            C14360o3.A0A(c8ri3);
            c8ri3.setBounds(0, 0, c8rh.getWidth(), c8rh.getHeight());
        }
        c8rh.invalidate();
        c8rh.A05 = c56188Owv;
    }

    public /* synthetic */ DurationPickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DurationPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
