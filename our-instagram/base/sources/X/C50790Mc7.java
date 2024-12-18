package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Mc7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50790Mc7 extends ViewOutlineProvider {
    public final float A00;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC167007dF.A1K(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }

    public C50790Mc7(float f) {
        this.A00 = f;
    }
}
