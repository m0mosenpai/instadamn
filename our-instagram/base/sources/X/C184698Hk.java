package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.facebook.R;

/* renamed from: X.8Hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184698Hk extends AnonymousClass834 {
    public final float A00;
    public final float A01;
    public final View A02;
    public final View A03;

    public C184698Hk(View view, float f, float f2, float f3) {
        super(view);
        this.A03 = view;
        View requireViewById = view.requireViewById(R.id.circle);
        C14360o3.A07(requireViewById);
        this.A02 = requireViewById;
        this.A00 = f2;
        this.A01 = f;
        float f4 = f + (2.0f * f3);
        int i = (int) f4;
        requireViewById.getLayoutParams().width = i;
        requireViewById.getLayoutParams().height = i;
        Drawable background = requireViewById.getBackground();
        if (background != null) {
            LayerDrawable layerDrawable = (LayerDrawable) background;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.shadow);
            if (findDrawableByLayerId != null) {
                ((GradientDrawable) findDrawableByLayerId).setGradientRadius(f4 / 2.0f);
                int i2 = (int) f3;
                layerDrawable.setLayerInset(1, i2, i2, i2, i2);
                int i3 = (int) (f3 + f2);
                layerDrawable.setLayerInset(2, i3, i3, i3, i3);
                layerDrawable.invalidateSelf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02(GradientDrawable.Orientation orientation, int[] iArr, int i) {
        Drawable background = this.A02.getBackground();
        if (background != null) {
            LayerDrawable layerDrawable = (LayerDrawable) background;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setShape(1);
            gradientDrawable.setGradientType(i);
            layerDrawable.setDrawableByLayerId(R.id.fill, gradientDrawable);
            layerDrawable.invalidateSelf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Drawable A01() {
        Drawable background = this.A02.getBackground();
        if (background != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(2);
            C14360o3.A07(drawable);
            return drawable;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
