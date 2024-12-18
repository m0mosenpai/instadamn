package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes11.dex */
public final class UAQ extends View {
    public final C66309U8i A00;
    public final W2X A01;

    public UAQ(Context context, C66309U8i c66309U8i) {
        super(context, null, 0);
        this.A00 = c66309U8i;
        this.A01 = new W2X(this, new X2o(this, 2));
        c66309U8i.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A00.draw(canvas);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        W2X.A00(this.A01);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        if (!drawable.equals(this.A00) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final int getCornerRadiusPx() {
        return this.A00.A00;
    }

    public final void setCornerRadiusPx(int i) {
        C66309U8i c66309U8i = this.A00;
        if (c66309U8i.A00 != i) {
            c66309U8i.A00 = i;
            c66309U8i.A01 = true;
            c66309U8i.invalidateSelf();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C66309U8i c66309U8i = this.A00;
        c66309U8i.setBounds(getPaddingLeft(), getPaddingTop(), AbstractC65702TsY.A08(this), AbstractC65702TsY.A07(this));
        c66309U8i.A01(AbstractC58319PtB.A1P(AbstractC166997dE.A0G(c66309U8i), AbstractC69815Vw1.A00(AbstractC166997dE.A0L(this), 50.0f)));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(1408776365);
        super.onWindowVisibilityChanged(i);
        W2X w2x = this.A01;
        w2x.A00 = i;
        W2X.A00(w2x);
        C0f9.A0D(-1712521601, A06);
    }
}
