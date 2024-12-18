package com.instagram.ui.inlinegallerysendbutton;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC43592JPx;
import X.AbstractC55922hc;
import X.AbstractC70163Da;
import X.C0f9;
import X.C14360o3;
import X.C3DY;
import X.C55942hf;
import X.C55982hj;
import X.InterfaceC50402MNe;
import X.InterfaceC55932he;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class InlineGallerySendButton extends View implements InterfaceC55932he {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Bitmap A0C;
    public InterfaceC50402MNe A0D;
    public final C55982hj A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Path A0K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InlineGallerySendButton(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        this.A07 = f;
        this.A06 = 1.0f;
        int A04 = (int) AbstractC70163Da.A04(f, 1.0d, this.A00, 0.0d, 255.0d);
        this.A08 = A04;
        this.A08 = (int) Math.min(Math.max(A04, 0.0d), 255.0d);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float min = Math.min(getWidth(), getHeight()) / 2.0f;
        float f = this.A07 * min;
        float f2 = (min - this.A05) * this.A06;
        if (this.A0C == null) {
            Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ALPHA_8);
            this.A0C = createBitmap;
            C14360o3.A0A(createBitmap);
            AbstractC43592JPx.A06(createBitmap).drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, (float) Math.floor(f2), this.A0J);
        }
        Bitmap bitmap = this.A0C;
        C14360o3.A0A(bitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A0F);
        if (f != f2) {
            canvas.drawCircle(AbstractC166987dD.A07(this) / 2.0f, AbstractC166987dD.A08(this) / 2.0f, f, this.A0H);
        }
        canvas.drawCircle(AbstractC166987dD.A07(this) / 2.0f, AbstractC166987dD.A08(this) / 2.0f, f2, this.A0G);
        float A07 = AbstractC166987dD.A07(this) / 2.0f;
        float A08 = AbstractC166987dD.A08(this) / 2.0f;
        float f3 = this.A03;
        float f4 = A07 - (f3 / 2.0f);
        float f5 = f4 + f3;
        float f6 = this.A01;
        canvas.rotate(f6, A07, A08);
        canvas.save();
        canvas.translate(0.0f, -(A08 - f4));
        canvas.rotate(45.0f, A07, A08);
        Path path = this.A0K;
        float f7 = this.A02;
        path.moveTo(f7 + A07, A08);
        path.lineTo(A07, A08);
        path.lineTo(A07, f7 + A08);
        Paint paint = this.A0I;
        paint.setAlpha(this.A08);
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.drawLine(A07, f4 + this.A04, A07, f5, paint);
        canvas.rotate(-f6, A07, A08);
    }

    private final void setPressedAlpha(boolean z) {
        Paint paint = this.A0G;
        int i = this.A0A;
        if (z) {
            paint.setAlpha((int) (Color.alpha(i) * 0.6f));
            this.A0H.setAlpha((int) (Color.alpha(this.A0B) * 0.6f));
        } else {
            paint.setColor(i);
            this.A0H.setColor(this.A0B);
        }
        invalidate();
    }

    public final void setListener(InterfaceC50402MNe interfaceC50402MNe) {
        this.A0D = interfaceC50402MNe;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-2076428331);
        super.onAttachedToWindow();
        this.A0E.A0A(this);
        C0f9.A0D(1414504619, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1356301481);
        super.onDetachedFromWindow();
        this.A0E.A0B(this);
        C0f9.A0D(1723865941, A06);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1721702696);
        float A02 = AbstractC166987dD.A02(Math.min(getWidth(), getHeight()));
        this.A00 = (A02 - this.A05) / A02;
        C0f9.A0D(-1354363551, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r7 != 6) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = 1223254815(0x48e9631f, float:477976.97)
            int r3 = X.C0f9.A05(r0)
            r4 = 0
            X.C14360o3.A0B(r9, r4)
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L2c
            int r7 = r9.getActionMasked()
            int r0 = r9.getActionIndex()
            int r6 = r9.getPointerId(r0)
            r5 = -1
            r2 = 1
            if (r7 == 0) goto L33
            r1 = 6
            if (r7 == r2) goto L5d
            r0 = 3
            if (r7 == r0) goto L5d
            r0 = 5
            if (r7 == r0) goto L33
            if (r7 == r1) goto L5d
        L2c:
            r0 = 648130266(0x26a1aeda, float:1.1219013E-15)
        L2f:
            X.C0f9.A0C(r0, r3)
            return r4
        L33:
            int r0 = r8.A09
            if (r0 != r5) goto L40
            r8.A09 = r6
            r8.setPressedAlpha(r2)
            r0 = -811670847(0xffffffffcf9ee2c1, float:-5.3313213E9)
            goto L6b
        L40:
            if (r0 != r6) goto L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = X.AbstractC25228BEl.A1Z(r0, r6)
            java.lang.String r1 = "InlineGallerySendButton"
            r0 = 3781(0xec5, float:5.298E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C0K8.A0P(r1, r0, r2)
            r0 = 1214000182(0x485c2c36, float:225456.84)
            goto L2f
        L59:
            r0 = -1683737073(0xffffffff9ba4360f, float:-2.7166459E-22)
            goto L2f
        L5d:
            int r0 = r8.A09
            if (r6 != r0) goto L64
            r8.setPressedAlpha(r4)
        L64:
            if (r7 == r1) goto L68
            r8.A09 = r5
        L68:
            r0 = -1623944975(0xffffffff9f3490f1, float:-3.8236375E-20)
        L6b:
            X.C0f9.A0C(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.inlinegallerysendbutton.InlineGallerySendButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineGallerySendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0K = AbstractC166987dD.A0T();
        this.A07 = 1.0f;
        this.A06 = 1.0f;
        this.A08 = 255;
        this.A09 = -1;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1d, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        try {
            this.A0A = obtainStyledAttributes.getColor(5, -7829368);
            this.A0B = obtainStyledAttributes.getColor(7, -1);
            this.A05 = obtainStyledAttributes.getDimension(6, 10.0f);
            int color = obtainStyledAttributes.getColor(1, -16777216);
            this.A02 = obtainStyledAttributes.getDimension(2, 0.0f);
            this.A03 = obtainStyledAttributes.getDimension(3, 0.0f);
            this.A04 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A01 = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
            Paint A0S = AbstractC166987dD.A0S(1);
            this.A0G = A0S;
            A0S.setColor(this.A0A);
            AbstractC166987dD.A1R(A0S);
            Paint paint = new Paint(A0S);
            this.A0H = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setColor(this.A0B);
            paint.setStrokeWidth(this.A05);
            Paint A0S2 = AbstractC166987dD.A0S(1);
            this.A0I = A0S2;
            A0S2.setColor(color);
            A0S2.setStrokeCap(Paint.Cap.ROUND);
            A0S2.setStrokeJoin(Paint.Join.MITER);
            A0S2.setStrokeWidth(this.A04);
            A0S2.setStyle(style);
            int color2 = context.getColor(R.color.black_40_transparent);
            Paint A0S3 = AbstractC166987dD.A0S(1);
            this.A0J = A0S3;
            A0S3.setShadowLayer(AbstractC13880nE.A04(context, 4), 0.0f, 0.0f, color2);
            Paint A0S4 = AbstractC166987dD.A0S(1);
            this.A0F = A0S4;
            A0S4.setColorFilter(C3DY.A00(-16777216));
            C55982hj A0R = AbstractC167007dF.A0R();
            A0R.A09(C55942hf.A04(80.0d, 7.0d));
            this.A0E = A0R;
            setClickable(false);
            setFocusable(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ InlineGallerySendButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InlineGallerySendButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
