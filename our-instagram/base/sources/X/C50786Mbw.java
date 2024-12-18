package X;

import android.graphics.Point;
import android.view.View;

/* renamed from: X.Mbw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50786Mbw extends View.DragShadowBuilder {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ OFW A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50786Mbw(View view, View view2, OFW ofw, int i, int i2) {
        super(view2);
        this.A02 = view;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = ofw;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        if (point != null) {
            View view = this.A02;
            point.set(view.getWidth(), view.getHeight());
        }
        if (point2 != null) {
            int i = this.A00;
            if (i < 0) {
                i = 0;
            }
            int i2 = this.A01;
            if (i2 < 0) {
                i2 = 0;
            }
            point2.set(i, i2);
        }
        this.A03.A00 = this.A01;
    }
}
