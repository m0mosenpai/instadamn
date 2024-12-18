package X;

import android.graphics.RectF;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: X.7AQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AQ extends OvalShape {
    public final float A00;

    public C7AQ(float f) {
        this.A00 = f;
    }

    @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public final void onResize(float f, float f2) {
        RectF rect = rect();
        float f3 = this.A00;
        rect.set(f3, f3, f - f3, f2 - f3);
    }
}
