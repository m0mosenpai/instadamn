package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.7kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC171677kx {
    public static final void A00(View view, float f) {
        Drawable mutate;
        Drawable background = view.getBackground();
        if (background != null && (mutate = background.mutate()) != null) {
            mutate.setAlpha((int) (255.0f * f));
        }
    }
}
