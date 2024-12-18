package com.instagram.creation.capture.quickcapture.cameratoolmenu.ui;

import X.AbstractC13600mm;
import X.AbstractC25227BEk;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C70853WiJ;
import X.C81W;
import X.JQ0;
import X.UE6;
import X.VDM;
import X.VDN;
import X.X8M;
import X.X8N;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class EffectSlider extends View {
    public static final int A0K = Math.round(102.0f);
    public float A00;
    public int A01;
    public int A02;
    public X8N A03;
    public VDN A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public VDM A08;
    public boolean A09;
    public final float A0A;
    public final float A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final VelocityTracker A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Paint paint = new Paint(1);
        this.A0F = paint;
        Paint paint2 = new Paint(1);
        this.A0E = paint2;
        this.A0I = new RectF();
        this.A0H = new RectF();
        this.A0A = 0.083333336f;
        this.A0B = 0.2f;
        this.A0G = new Path();
        this.A0J = VelocityTracker.obtain();
        this.A02 = 10;
        this.A01 = 60;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A14);
        C14360o3.A07(obtainStyledAttributes);
        try {
            int i2 = obtainStyledAttributes.getInt(1, 0);
            for (VDM vdm : VDM.values()) {
                if (vdm.A00 == i2) {
                    this.A08 = vdm;
                    int i3 = obtainStyledAttributes.getInt(2, 0);
                    for (VDN vdn : VDN.values()) {
                        if (vdn.A00 == i3) {
                            this.A04 = vdn;
                            this.A09 = obtainStyledAttributes.getBoolean(0, false);
                            obtainStyledAttributes.recycle();
                            Resources resources = context.getResources();
                            paint2.setColor(resources.getColor(R.color.audio_bar_action_color_enabled));
                            paint.setColor(resources.getColor(R.color.grey_1));
                            paint.setAlpha(A0K);
                            this.A0D = resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
                            this.A0C = resources.getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                            setSeekValue(this.A02);
                            return;
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
            throw new IllegalArgumentException();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        VDM vdm = this.A08;
        VDM vdm2 = VDM.A04;
        int width = getWidth();
        if (vdm == vdm2) {
            width /= 2;
        }
        int height = getHeight();
        RectF rectF = this.A0I;
        float f = width;
        float f2 = height;
        rectF.set(0.0f, 0.0f, f, f2);
        if (this.A09) {
            rectF.inset(this.A0B * f, 0.0f);
            rectF.bottom = this.A07 * f2;
            float f3 = this.A0C;
            canvas.drawRoundRect(rectF, f3, f3, this.A0F);
            rectF.top = this.A07 * f2;
            rectF.bottom = f2;
            Paint paint = this.A0E;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            canvas.drawRect(rectF.left, rectF.top, rectF.right, rectF.bottom - f3, paint);
            RectF rectF2 = this.A0H;
            float f4 = rectF.top;
            rectF2.set(0.0f, f4, f, f4 - (f2 * this.A0A));
            canvas.drawRoundRect(rectF2, f3, f3, paint);
        } else {
            Path path = this.A0G;
            path.reset();
            float f5 = this.A0D;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
            canvas.clipPath(path);
            rectF.bottom = this.A07 * f2;
            canvas.drawRect(rectF, this.A0F);
            rectF.top = this.A07 * f2;
            rectF.bottom = f2;
            canvas.drawRect(rectF, this.A0E);
        }
        super.onDraw(canvas);
    }

    private final void A00(boolean z, float f) {
        X8N x8n;
        String valueOf;
        int i = this.A01;
        float f2 = i;
        int i2 = this.A02;
        float f3 = i - i2;
        int A03 = AbstractC13600mm.A03(Math.round(f2 - (f * f3)), i2, i);
        if ((!z || A03 != AbstractC13600mm.A03(Math.round(f2 - (this.A07 * f3)), i2, i)) && (x8n = this.A03) != null) {
            UE6 ue6 = (UE6) x8n;
            TextView textView = ue6.A05;
            if (ue6.A06 == C81W.A0u) {
                valueOf = AbstractC25227BEk.A0w(String.valueOf(A03 / 100.0d), 0, 3);
            } else {
                valueOf = String.valueOf(A03);
            }
            textView.setText(valueOf);
            X8M x8m = ue6.A00;
            if (x8m != null) {
                C70853WiJ c70853WiJ = (C70853WiJ) x8m;
                c70853WiJ.A01.A08.Dje(c70853WiJ.A00, A03);
            }
        }
        this.A07 = f;
        invalidate();
    }

    public final int getSeekMiddleValue() {
        return (this.A01 + this.A02) / 2;
    }

    public final int getSeekValueRange() {
        return this.A01 - this.A02;
    }

    public final void setSeekValue(int i) {
        int i2 = this.A02;
        int i3 = this.A01;
        A00(false, 1.0f - ((AbstractC13600mm.A03(i, i2, i3) - i2) / (i3 - i2)));
    }

    public final void setSliderHandle(boolean z) {
        this.A09 = z;
        invalidate();
    }

    public final void setSliderThickness(VDM vdm) {
        this.A08 = vdm;
        invalidate();
    }

    public final void setSliderVibrationAction(VDN vdn) {
        this.A04 = vdn;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        if (X.AbstractC13600mm.A03(java.lang.Math.round(r9 - ((r9 - r4) * r6)), r4, r9) == ((r9 + r4) / 2)) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = -2094343255(0xffffffff832adba9, float:-5.0210667E-37)
            int r5 = X.C0f9.A05(r0)
            r4 = 0
            X.C14360o3.A0B(r11, r4)
            android.view.ViewParent r0 = r10.getParent()
            if (r0 == 0) goto Lc5
            r7 = 1
            r0.requestDisallowInterceptTouchEvent(r7)
            int r1 = r11.getAction()
            if (r1 == 0) goto L41
            if (r1 == r7) goto L27
            r0 = 2
            if (r1 == r0) goto L4c
            r0 = -627717901(0xffffffffda95c8f3, float:-2.1080359E16)
            X.C0f9.A0C(r0, r5)
            return r4
        L27:
            boolean r0 = r10.A05
            if (r0 == 0) goto L3c
            X.X8N r0 = r10.A03
            if (r0 == 0) goto L3c
            X.UE6 r0 = (X.UE6) r0
            X.X8M r0 = r0.A00
            if (r0 == 0) goto L3c
            X.WiJ r0 = (X.C70853WiJ) r0
            X.7lx r0 = r0.A01
            r0.A00()
        L3c:
            r0 = 1876064679(0x6fd279a7, float:1.3027784E29)
            goto Lc1
        L41:
            android.view.VelocityTracker r0 = r10.A0J
            r0.clear()
            r10.A06 = r4
            r0 = 96542148(0x5c11dc4, float:1.8160567E-35)
            goto Lc1
        L4c:
            android.view.VelocityTracker r2 = r10.A0J
            r2.addMovement(r11)
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r0)
            float r1 = r11.getY()
            boolean r0 = r10.A06
            if (r0 == 0) goto L6d
            float r0 = r10.A00
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 1096810496(0x41600000, float:14.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lbe
            r10.A06 = r4
        L6d:
            float r0 = r2.getYVelocity()
            float r3 = java.lang.Math.abs(r0)
            float r8 = r11.getY()
            int r0 = r10.getHeight()
            float r0 = (float) r0
            float r2 = r8 / r0
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = X.AbstractC13600mm.A00(r2, r1, r0)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto Lbb
            X.VDN r0 = r10.A04
            if (r0 == 0) goto Lbb
            int r0 = r0.ordinal()
            r2 = 5
            if (r0 == r7) goto Lb2
            if (r0 != r4) goto Lbb
            int r9 = r10.A01
            float r1 = (float) r9
            int r4 = r10.A02
            int r0 = r9 - r4
            float r0 = (float) r0
            float r0 = r0 * r6
            float r1 = r1 - r0
            int r0 = java.lang.Math.round(r1)
            int r1 = X.AbstractC13600mm.A03(r0, r4, r9)
            int r9 = r9 + r4
            int r0 = r9 / 2
            if (r1 != r0) goto Lbb
        Lb2:
            X.2UY r0 = X.C2UY.A01
            r0.A05(r2)
            r10.A00 = r8
            r10.A06 = r7
        Lbb:
            r10.A00(r7, r6)
        Lbe:
            r0 = -756018919(0xffffffffd2f01119, float:-5.155395E11)
        Lc1:
            X.C0f9.A0C(r0, r5)
            return r7
        Lc5:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = -1676111990(0xffffffff9c188f8a, float:-5.04781E-22)
            X.C0f9.A0C(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.cameratoolmenu.ui.EffectSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCloseOnTouchUp(boolean z) {
        this.A05 = z;
    }

    public final void setEffectSliderValueChangeListener(X8N x8n) {
        this.A03 = x8n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EffectSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ EffectSlider(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EffectSlider(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
