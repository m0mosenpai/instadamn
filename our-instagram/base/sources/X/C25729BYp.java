package X;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* renamed from: X.BYp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25729BYp extends View.DragShadowBuilder {
    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        boolean A1R = AbstractC167007dF.A1R(0, point, point2);
        point.set(A1R ? 1 : 0, A1R ? 1 : 0);
        point2.set(0, 0);
    }
}
