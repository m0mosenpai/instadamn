package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.McC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50795McC extends ViewOutlineProvider {
    public final int A00;
    public final int A01;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC167007dF.A1K(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A01);
    }

    public C50795McC(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }
}
