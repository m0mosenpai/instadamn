package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes11.dex */
public final class UAz extends Animation implements InterfaceC65229TgL {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public final View A08;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public static void A00(UAz uAz, int i, int i2, int i3, int i4) {
        View view = uAz.A08;
        uAz.A02 = view.getX() - view.getTranslationX();
        uAz.A03 = view.getY() - view.getTranslationY();
        uAz.A07 = view.getWidth();
        int height = view.getHeight();
        uAz.A06 = height;
        uAz.A00 = i - uAz.A02;
        uAz.A01 = i2 - uAz.A03;
        uAz.A05 = i3 - uAz.A07;
        uAz.A04 = i4 - height;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.A02 + (this.A00 * f);
        float f3 = this.A03 + (this.A01 * f);
        this.A08.layout(Math.round(f2), Math.round(f3), Math.round(f2 + this.A07 + (this.A05 * f)), Math.round(f3 + this.A06 + (this.A04 * f)));
    }

    public UAz(View view, int i, int i2, int i3, int i4) {
        this.A08 = view;
        A00(this, i, i2, i3, i4);
    }
}
