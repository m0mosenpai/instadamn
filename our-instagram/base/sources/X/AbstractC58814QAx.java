package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.QAx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58814QAx extends AbstractC44331JiW {
    public final ValueAnimator.AnimatorUpdateListener animatorListener;
    public final Context context;

    public AbstractC58814QAx(Context context) {
        C14360o3.A0B(context, 1);
        this.context = context;
        this.animatorListener = C63412Sjq.A00;
    }

    private final Rect getBoundsForBrandingDrawable(int i, int i2) {
        return new Rect(0, 0, i, (int) (i2 * 0.35f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C09530e4 displayMetrics = getDisplayMetrics();
        int A0H = AbstractC166987dD.A0H(displayMetrics.A00);
        int A0H2 = AbstractC166987dD.A0H(displayMetrics.A01);
        Drawable brandingDrawable = getBrandingDrawable();
        brandingDrawable.setBounds(getBoundsForBrandingDrawable(A0H, A0H2));
        Drawable iconDrawable = getIconDrawable();
        if (iconDrawable != null) {
            iconDrawable.setBounds(getBoundsForAppLogo(A0H, A0H2));
        }
        new LayerDrawable(new Drawable[]{brandingDrawable, iconDrawable}).draw(canvas);
    }

    public abstract Drawable getBrandingDrawable();

    public abstract Drawable getIconDrawable();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public final float getRatioForBranding() {
        return 0.35f;
    }

    @Override // X.AbstractC44331JiW
    public void initializeUnderlay(Context context, C6FH c6fh) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.AbstractC44331JiW
    public ValueAnimator.AnimatorUpdateListener getAnimatorListener() {
        return this.animatorListener;
    }

    public final C09530e4 getDisplayMetrics() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 30) {
            Object systemService = context.getSystemService("window");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Rect bounds = ((WindowManager) systemService).getCurrentWindowMetrics().getBounds();
            C14360o3.A07(bounds);
            return AbstractC167007dF.A0o(Integer.valueOf(bounds.width()), bounds.height());
        }
        Object systemService2 = context.getSystemService("display");
        C14360o3.A0C(systemService2, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService2).getDisplay(0);
        C14360o3.A07(display);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return AbstractC167007dF.A0o(Integer.valueOf(displayMetrics.widthPixels), displayMetrics.heightPixels);
    }

    public C09530e4 getIconSize() {
        return AbstractC167007dF.A0o(Integer.valueOf(((int) AbstractC167007dF.A0K(this.context).density) * 60), ((int) AbstractC167007dF.A0K(this.context).density) * 60);
    }

    private final Rect getBoundsForAppLogo(int i, int i2) {
        C09530e4 iconSize = getIconSize();
        int i3 = i / 2;
        int A0H = AbstractC166987dD.A0H(iconSize.A00) / 2;
        int i4 = (int) (i2 * (0.35f / 2.33f));
        int A0H2 = AbstractC166987dD.A0H(iconSize.A01) / 2;
        return new Rect(i3 - A0H, i4 - A0H2, i3 + A0H, i4 + A0H2);
    }
}
