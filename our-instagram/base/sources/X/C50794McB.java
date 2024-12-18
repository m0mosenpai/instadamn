package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.McB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50794McB extends ViewOutlineProvider {
    public final float A00;
    public final int A01;

    public C50794McB(float f, int i) {
        this.A01 = i;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        if (this.A01 != 0) {
            i = 0;
            AbstractC167007dF.A1K(view, outline);
        } else if (view == null || outline == null) {
            return;
        } else {
            i = 0;
        }
        outline.setRoundRect(i, i, view.getWidth(), view.getHeight(), this.A00);
    }
}
