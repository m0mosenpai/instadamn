package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes5.dex */
public final class BZ1 extends ViewOutlineProvider {
    public final float A00;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC167007dF.A1K(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }

    public BZ1(float f) {
        this.A00 = f;
    }
}
