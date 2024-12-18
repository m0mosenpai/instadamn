package com.instagram.igds.components.stepperheader;

import X.AbstractC001800i;
import X.AbstractC009903n;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC43592JPx;
import X.AbstractC43594JPz;
import X.AbstractC44257Jh1;
import X.C0f9;
import X.C14360o3;
import X.C16930sl;
import X.C1H4;
import X.C3VZ;
import X.C55982hj;
import X.InterfaceC021908q;
import X.InterfaceC55932he;
import X.InterfaceC62892tS;
import X.JQ0;
import X.LMA;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class IgdsStepperHeader extends View implements InterfaceC021908q, InterfaceC55932he, InterfaceC62892tS {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final int A0C;
    public final Paint A0D;
    public final C55982hj A0E;
    public final boolean A0F;
    public final int[] A0G;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsStepperHeader(Context context) {
        this(context, null, 0, false);
        C14360o3.A0B(context, 1);
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
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
        int i;
        C14360o3.A0B(c55982hj, 0);
        if (this.A02 > 5) {
            i = C1H4.A00(c55982hj.A09.A00);
        } else {
            i = 0;
        }
        setScrollX(i);
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        if (getPaddingRight() > 0) {
            int paddingLeft2 = getPaddingLeft();
            int i3 = this.A04;
            int i4 = this.A02;
            i = paddingLeft2 + (i3 * i4) + (this.A08 * (i4 - 1));
        } else {
            i = this.A0C;
        }
        canvas.drawLine(paddingLeft, 0.0f, i, 0.0f, this.A0D);
        int paddingLeft3 = getPaddingLeft();
        int i5 = this.A02;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 != 0) {
                if (!this.A0F) {
                    canvas.drawLine(paddingLeft3, 0.0f, this.A08 + paddingLeft3, 0.0f, this.A0A);
                }
                paddingLeft3 += this.A08;
            }
            int i7 = this.A03;
            if ((i6 == i7 && this.A06 && !this.A07) || (i6 == i7 + 1 && this.A06 && this.A07)) {
                float f2 = this.A00;
                i2 = this.A04;
                f = paddingLeft3 + (f2 * i2);
            } else {
                if (i6 > i7) {
                    f = paddingLeft3;
                    i2 = this.A04;
                }
                if (i6 != 0 && this.A0F) {
                    int i8 = this.A08;
                    float f3 = paddingLeft3 - i8;
                    Path path = new Path();
                    float f4 = this.A09;
                    path.addArc(new RectF(f3 - f4, 0.0f, f3, f4), 270.0f, 180.0f);
                    float f5 = i8 + f3;
                    float f6 = f4 / 2.0f;
                    path.lineTo(f5 + f6, f4);
                    path.addArc(new RectF(f5, 0.0f, f5 + f4, f4), 90.0f, 180.0f);
                    path.lineTo(f3 - f6, 0.0f);
                    Paint paint = this.A0A;
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawPath(path, paint);
                }
                paddingLeft3 += this.A04;
            }
            canvas.drawLine(f, 0.0f, i2 + paddingLeft3, 0.0f, this.A0B);
            if (i6 != 0) {
                int i82 = this.A08;
                float f32 = paddingLeft3 - i82;
                Path path2 = new Path();
                float f42 = this.A09;
                path2.addArc(new RectF(f32 - f42, 0.0f, f32, f42), 270.0f, 180.0f);
                float f52 = i82 + f32;
                float f62 = f42 / 2.0f;
                path2.lineTo(f52 + f62, f42);
                path2.addArc(new RectF(f52, 0.0f, f52 + f42, f42), 90.0f, 180.0f);
                path2.lineTo(f32 - f62, 0.0f);
                Paint paint2 = this.A0A;
                paint2.setStyle(Paint.Style.FILL);
                canvas.drawPath(path2, paint2);
            }
            paddingLeft3 += this.A04;
        }
        if (this.A0F) {
            float f7 = paddingLeft3;
            Paint paint3 = this.A0A;
            AbstractC166987dD.A1R(paint3);
            Path A0T = AbstractC166987dD.A0T();
            Path A0T2 = AbstractC166987dD.A0T();
            float f8 = this.A09;
            A0T.addArc(new RectF(paddingLeft, 0.0f, paddingLeft + f8, f8), 90.0f, 180.0f);
            A0T.lineTo(paddingLeft, 0.0f);
            A0T.lineTo(paddingLeft, f8);
            float f9 = f8 / 2.0f;
            A0T.lineTo(paddingLeft + f9, f8);
            canvas.drawPath(A0T, paint3);
            A0T2.addArc(new RectF(f7 - f8, 0.0f, f7, f8), 270.0f, 180.0f);
            A0T2.lineTo(f7, f8);
            A0T2.lineTo(f7, 0.0f);
            A0T2.lineTo(f7 - f9, 0.0f);
            canvas.drawPath(A0T2, paint3);
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
    }

    private final void setCurrentPage(int i) {
        this.A03 = i;
        invalidate();
    }

    public final void A01() {
        if (this.A06) {
            boolean z = this.A07;
            float[] A1b = AbstractC43592JPx.A1b();
            if (z) {
                // fill-array-data instruction
                A1b[0] = 1.0f;
                A1b[1] = 0.0f;
            } else {
                // fill-array-data instruction
                A1b[0] = 0.0f;
                A1b[1] = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
            this.A05 = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(this.A01);
                LMA.A01(ofFloat, this, 31);
                ofFloat.start();
            }
        }
    }

    public final void A02(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = (int) Math.ceil(((this.A0C - (getPaddingLeft() + getPaddingRight())) - (this.A08 * (i2 - 1))) / i2);
        requestLayout();
    }

    public final void A03(int i, int i2, boolean z, boolean z2) {
        A02(i, i2);
        this.A06 = z;
        this.A07 = z2;
        this.A01 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    public final void setAnimationDuration(int i) {
        this.A01 = i;
    }

    public final void setIsAnimationBackward(boolean z) {
        this.A07 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    private final void A00() {
        float f;
        float f2;
        float f3;
        int[] iArr;
        ?? r3;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        boolean z = this.A0F;
        Paint paint = this.A0D;
        if (z) {
            float f4 = this.A0C - paddingLeft;
            f = f4 * 0.0f;
            f2 = f4 * 1.0f;
            f3 = 0.0f;
            int[] iArr2 = this.A0G;
            C14360o3.A0B(iArr2, 0);
            int length = iArr2.length;
            int i = length - 1;
            if (i >= 0 && i != 0) {
                if (i >= length) {
                    r3 = AbstractC009903n.A0G(iArr2);
                } else if (i == 1) {
                    r3 = AbstractC43594JPz.A0z(iArr2[i]);
                } else {
                    r3 = AbstractC25225BEi.A17(i);
                    for (int i2 = length - i; i2 < length; i2++) {
                        r3.add(Integer.valueOf(iArr2[i2]));
                    }
                }
            } else {
                r3 = C16930sl.A00;
            }
            iArr = AbstractC001800i.A0x(r3);
        } else {
            float f5 = this.A0C - paddingLeft;
            f = f5 * (-0.2f);
            f2 = f5 * 1.2f;
            f3 = 0.0f;
            iArr = this.A0G;
        }
        paint.setShader(new LinearGradient(f, f3, f2, f3, iArr, (float[]) null, Shader.TileMode.MIRROR));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1060108848);
        super.onAttachedToWindow();
        this.A0E.A0A(this);
        C0f9.A0D(-708705924, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(979015316);
        super.onDetachedFromWindow();
        C55982hj c55982hj = this.A0E;
        c55982hj.A01();
        c55982hj.A0B(this);
        ValueAnimator valueAnimator = this.A05;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C0f9.A0D(1674515474, A06);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        C14360o3.A07(displayMetrics);
        AbstractC44257Jh1.A00(displayMetrics, iArr, i, i2, this.A0F);
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        A00();
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
        setCurrentPage(i);
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        setCurrentPage(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsStepperHeader(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IgdsStepperHeader(android.content.Context r10, android.util.AttributeSet r11, int r12, boolean r13) {
        /*
            r9 = this;
            r3 = 1
            X.C14360o3.A0B(r10, r3)
            r9.<init>(r10, r11, r12)
            r0 = 2130970234(0x7f04067a, float:1.7549172E38)
            int r8 = X.AbstractC167007dF.A09(r10, r0)
            r4 = 0
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            int r7 = X.AbstractC167007dF.A09(r10, r0)
            r0 = 2130970231(0x7f040677, float:1.7549166E38)
            int r5 = X.AbstractC167007dF.A09(r10, r0)
            r0 = 2130970229(0x7f040675, float:1.7549162E38)
            int r1 = X.AbstractC167007dF.A09(r10, r0)
            r6 = 3
            r0 = 2130970232(0x7f040678, float:1.7549168E38)
            int r0 = X.AbstractC167007dF.A09(r10, r0)
            r2 = 4
            int[] r0 = new int[]{r8, r7, r5, r1, r0}
            r9.A0G = r0
            if (r13 != 0) goto L50
            X.0od r0 = X.C14650od.A03
            if (r0 == 0) goto L51
            com.instagram.common.session.UserSession r7 = X.C14650od.A00(r0)
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36320296450466122(0x81091e0011214a, double:3.032439953145177E-306)
            boolean r1 = X.C18U.A06(r5, r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L51
            if (r1 == 0) goto L51
        L50:
            r4 = 1
        L51:
            r9.A0F = r4
            android.content.res.Resources r0 = r9.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r0 = r1.widthPixels
            r9.A0C = r0
            if (r4 == 0) goto Lc2
            r6 = 4
        L62:
            android.graphics.RectF r0 = X.AbstractC13880nE.A01
            float r0 = (float) r6
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r1)
            int r0 = java.lang.Math.round(r0)
            r9.A08 = r0
            float r0 = (float) r2
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r1)
            int r0 = java.lang.Math.round(r0)
            r9.A09 = r0
            android.graphics.Paint r1 = X.AbstractC166987dD.A0S(r3)
            r9.A0D = r1
            int r0 = r0 * 2
            float r2 = (float) r0
            r1.setStrokeWidth(r2)
            r9.A00()
            r0 = 2130968708(0x7f040084, float:1.7546077E38)
            if (r4 == 0) goto L91
            r0 = 2130968707(0x7f040083, float:1.7546075E38)
        L91:
            android.graphics.Paint r1 = X.AbstractC166987dD.A0S(r3)
            r1.setStrokeWidth(r2)
            int r0 = X.AbstractC53242c7.A0F(r10, r0)
            r1.setColor(r0)
            r9.A0A = r1
            android.graphics.Paint r1 = X.AbstractC166987dD.A0S(r3)
            r1.setStrokeWidth(r2)
            r0 = 2130970333(0x7f0406dd, float:1.7549373E38)
            X.AbstractC43594JPz.A14(r10, r1, r0)
            r9.A0B = r1
            X.2hj r4 = X.AbstractC167007dF.A0R()
            r2 = 4629137466983448576(0x403e000000000000, double:30.0)
            r0 = 4619567317775286272(0x401c000000000000, double:7.0)
            X.2hf r0 = X.C55942hf.A04(r2, r0)
            r4.A09(r0)
            r9.A0E = r4
            return
        Lc2:
            r2 = 2
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.stepperheader.IgdsStepperHeader.<init>(android.content.Context, android.util.AttributeSet, int, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsStepperHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ IgdsStepperHeader(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i), (i2 & 8) != 0 ? false : z);
    }
}
