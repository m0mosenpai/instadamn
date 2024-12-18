package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jix, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44358Jix extends Drawable {
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public final float A04;
    public final Animator.AnimatorListener A05;
    public final C55942hf A06;
    public final C55942hf A07;
    public final C63148Sdu A08;
    public final Integer A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final float A0K;
    public final PathMeasure A0L = new PathMeasure();
    public final Integer A0M;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        InterfaceC09390do interfaceC09390do = this.A0E;
        ((Paint) interfaceC09390do.getValue()).setAlpha(this.A02);
        Path A0T = AbstractC166987dD.A0T();
        PathMeasure pathMeasure = this.A0L;
        pathMeasure.getSegment(0.0f, pathMeasure.getLength() * ((float) this.A00), A0T, true);
        if (this.A00 != 0.0d) {
            canvas.drawPath(A0T, (Paint) interfaceC09390do.getValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static final void A00(C44358Jix c44358Jix) {
        AbstractC43593JPy.A1V(c44358Jix.A0A);
        AbstractC43593JPy.A1V(c44358Jix.A0B);
        AbstractC43593JPy.A1V(c44358Jix.A0G);
        AbstractC43593JPy.A1V(c44358Jix.A0D);
        AbstractC43593JPy.A1V(c44358Jix.A0C);
    }

    public final void A01() {
        InterfaceC09390do interfaceC09390do;
        int i = this.A02;
        if (i == 255) {
            A00(this);
            interfaceC09390do = this.A0A;
        } else {
            if (i <= 0) {
                return;
            }
            A00(this);
            interfaceC09390do = this.A0B;
        }
        ((Animator) interfaceC09390do.getValue()).start();
    }

    public final void A02(double d) {
        if (this.A01 != d) {
            this.A01 = d;
            ((C55982hj) this.A0F.getValue()).A06(d);
        }
    }

    public C44358Jix(Context context, Integer num, Integer num2, float f, float f2, boolean z, boolean z2, boolean z3) {
        this.A0K = f;
        this.A09 = num;
        this.A0M = num2;
        this.A04 = f2;
        this.A0H = z;
        this.A0I = z2;
        this.A0J = z3;
        C63148Sdu c63148Sdu = new C63148Sdu(context);
        this.A08 = c63148Sdu;
        this.A07 = C55942hf.A04(15.0d, 18.0d);
        this.A06 = C55942hf.A04(18.0d, 8.0d);
        this.A05 = new LLs(this, 2);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0E = MHO.A00(this, enumC09460dv, 27);
        this.A0A = MHO.A00(this, enumC09460dv, 23);
        this.A0B = MHO.A00(this, enumC09460dv, 24);
        this.A0G = MHO.A00(this, enumC09460dv, 29);
        this.A0D = MHO.A00(this, enumC09460dv, 26);
        this.A0C = MHO.A00(this, enumC09460dv, 25);
        this.A0F = MHO.A00(this, enumC09460dv, 28);
        this.A02 = 255;
        this.A03 = c63148Sdu.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Paint paint;
        SweepGradient sweepGradient;
        super.setBounds(i, i2, i3, i4);
        RectF rectF = new RectF(i, i2, i3, i4);
        float f = this.A04 / 2.0f;
        rectF.inset(f, f);
        float f2 = this.A0K;
        this.A0L.setPath(LH1.A00(rectF, this.A0M, f2, f2), false);
        A02(this.A00);
        int intValue = this.A09.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                paint = (Paint) this.A0E.getValue();
                sweepGradient = null;
            } else {
                throw B4Z.A00();
            }
        } else {
            paint = (Paint) this.A0E.getValue();
            C63148Sdu c63148Sdu = this.A08;
            float width = rectF.width() / 2.0f;
            float height = rectF.height() / 2.0f;
            sweepGradient = new SweepGradient(width, height, c63148Sdu.A04, c63148Sdu.A03);
            Matrix A0Q = AbstractC166987dD.A0Q();
            A0Q.postRotate(90.0f, width, height);
            sweepGradient.setLocalMatrix(A0Q);
        }
        paint.setShader(sweepGradient);
    }
}
