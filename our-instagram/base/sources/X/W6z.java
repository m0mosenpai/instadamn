package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes11.dex */
public abstract class W6z {
    public static final Handler A00 = new U97(Looper.getMainLooper(), 0);

    public static GradientDrawable A00(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof GradientDrawable) {
            return (GradientDrawable) drawable;
        }
        if (drawable instanceof ScaleDrawable) {
            return A00(((DrawableWrapper) drawable).getDrawable());
        }
        if (!(drawable instanceof StateListDrawable) || drawable.getConstantState() == null) {
            return null;
        }
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) drawable.getConstantState();
        for (int i = 0; i < drawableContainerState.getChildCount(); i++) {
            GradientDrawable A002 = A00(drawableContainerState.getChild(i));
            if (A002 != null) {
                return A002;
            }
        }
        return null;
    }

    public static void A01(C69473Vnw c69473Vnw, int i) {
        GradientDrawable gradientDrawable = c69473Vnw.A09;
        if (gradientDrawable != null && c69473Vnw.A0A != null && c69473Vnw.A0B != null) {
            gradientDrawable.setSize(-1, i);
            c69473Vnw.A0A.setSize(-1, i);
            c69473Vnw.A0B.setSize(-1, i);
        }
    }
}
