package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.ViewPropertyAnimator;
import android.widget.ProgressBar;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UCn extends ProgressBar {
    public Drawable A00;
    public GradientDrawable A01;
    public RotateDrawable A02;
    public ViewPropertyAnimator A03;

    public final void setIcon(VET vet) {
        C14360o3.A0B(vet, 0);
        setIconFromDrawable(C2FP.A0A().A04(AbstractC166997dE.A0L(this), vet.A00, vet.A01));
    }

    public final void A00(int i) {
        RotateDrawable rotateDrawable = this.A02;
        if (rotateDrawable == null) {
            C14360o3.A0F("layerSpinnerRingDrawable");
            throw C00O.createAndThrow();
        }
        Drawable drawable = rotateDrawable.getDrawable();
        if (drawable != null) {
            drawable.setTint(C2FP.A0A().A02(AbstractC166997dE.A0L(this), i));
        }
    }

    public final void setCircleColor(int i) {
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable == null) {
            C14360o3.A0F("layerCircleDrawable");
            throw C00O.createAndThrow();
        }
        gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), C2FP.A0A().A02(AbstractC166997dE.A0L(this), i));
    }

    public final void setCircleColorRaw(int i) {
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable == null) {
            C14360o3.A0F("layerCircleDrawable");
            throw C00O.createAndThrow();
        }
        gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), i);
    }

    private final void setIconFromDrawable(Drawable drawable) {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        C14360o3.A0C(indeterminateDrawable, AbstractC111324zv.A00(28));
        ((LayerDrawable) indeterminateDrawable).setDrawableByLayerId(R.id.layer_item_icon, drawable);
        if (drawable instanceof Animatable) {
            getViewTreeObserver().addOnGlobalLayoutListener(new WOE(this, 9));
        }
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        ViewPropertyAnimator animate = super.animate();
        this.A03 = animate;
        C14360o3.A0A(animate);
        return animate;
    }

    public final void setIcon(int i) {
        Drawable drawable = getResources().getDrawable(i, getContext().getTheme());
        C14360o3.A07(drawable);
        setIconFromDrawable(drawable);
    }
}
