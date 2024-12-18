package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jim, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44347Jim extends Drawable {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final C55982hj A03;

    public C44347Jim(Drawable drawable) {
        this.A02 = drawable;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A0A(new C45339K4s(this));
        A0R.A09(C55942hf.A04(1.0d, 0.1d));
        this.A03 = A0R;
        this.A01 = 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Rect A0W = AbstractC166987dD.A0W(this);
        canvas.save();
        canvas.rotate(-((float) this.A03.A09.A00), A0W.exactCenterX(), A0W.top);
        this.A02.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A02.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.A02.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.A00 < this.A01) {
            if (z) {
                C55982hj c55982hj = this.A03;
                if (c55982hj.A0C()) {
                    if (c55982hj.A01 == 0.0d) {
                        c55982hj.A08(90.0d, true);
                    }
                    c55982hj.A06(0.0d);
                }
            }
            C55982hj c55982hj2 = this.A03;
            if (!c55982hj2.A0C() && !z) {
                c55982hj2.A08(0.0d, true);
            }
        }
        return super.setVisible(z, z2);
    }
}
