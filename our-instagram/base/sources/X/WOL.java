package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.facebook.litho.LithoView;

/* loaded from: classes11.dex */
public final class WOL implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final LithoView A01;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LithoView lithoView = this.A01;
        if (lithoView.getMeasuredWidth() != 0 && lithoView.getMeasuredHeight() != 0) {
            Drawable mutate = new ColorDrawable(this.A00).mutate();
            C14360o3.A07(mutate);
            mutate.setAlpha(175);
            mutate.setBounds(0, 0, lithoView.getMeasuredWidth(), lithoView.getMeasuredHeight());
            lithoView.getOverlay().add(mutate);
            MSX.A13(lithoView, this);
            return true;
        }
        return true;
    }

    public WOL(LithoView lithoView, int i) {
        this.A01 = lithoView;
        this.A00 = i;
    }
}
