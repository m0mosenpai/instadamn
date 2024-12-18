package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.BYz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25738BYz extends ViewOutlineProvider {
    public final float A00;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC167007dF.A1K(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }

    public C25738BYz(float f) {
        this.A00 = f;
    }
}
