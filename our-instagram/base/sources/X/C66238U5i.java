package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.U5i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66238U5i extends ImageView {
    public Animatable A00;
    public boolean A01;

    public final void A00() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.start();
        }
        this.A01 = true;
    }

    public final void A01(Drawable drawable) {
        Object obj = null;
        if (drawable instanceof Animatable) {
            obj = drawable;
        }
        this.A00 = (Animatable) obj;
        setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        Animatable animatable;
        int A06 = C0f9.A06(1442231565);
        super.onAttachedToWindow();
        if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            Animatable animatable2 = this.A00;
            C14360o3.A0A(animatable2);
            animatable2.start();
        }
        C0f9.A0D(356321390, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-609705827);
        super.onDetachedFromWindow();
        Animatable animatable = this.A00;
        if (animatable != null && animatable.isRunning()) {
            Animatable animatable2 = this.A00;
            C14360o3.A0A(animatable2);
            animatable2.stop();
        }
        C0f9.A0D(2135029554, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        Animatable animatable;
        super.setVisibility(i);
        if (getVisibility() != 0) {
            Animatable animatable2 = this.A00;
            if (animatable2 != null && animatable2.isRunning()) {
                Animatable animatable3 = this.A00;
                C14360o3.A0A(animatable3);
                animatable3.stop();
                return;
            }
            return;
        }
        if (!this.A01 || (animatable = this.A00) == null || animatable.isRunning()) {
            return;
        }
        Animatable animatable4 = this.A00;
        C14360o3.A0A(animatable4);
        animatable4.start();
    }
}
