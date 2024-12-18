package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Sod, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnLayoutChangeListenerC63510Sod implements View.OnLayoutChangeListener {
    public final Q4W A00;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Q4W q4w = this.A00;
        if (q4w.A07 && q4w.getParent() != null) {
            AbstractC05810Sj.A00(q4w.A01);
            AbstractC05810Sj.A00(q4w.A08);
            Rect rect = Q4W.A0E;
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (q4w.A01.intersects(rect.left, rect.top, rect.right, rect.bottom) != AbstractC167007dF.A1W(view.getParent())) {
                int i9 = 0;
                for (int i10 = 0; i10 < q4w.A00; i10++) {
                    View view2 = q4w.A08[i10];
                    if (view2 == view) {
                        Q4W.A02(q4w.A01, q4w, i10, i9);
                        return;
                    } else {
                        if (view2.getParent() == null) {
                            i9++;
                        }
                    }
                }
            }
        }
    }

    public ViewOnLayoutChangeListenerC63510Sod(Q4W q4w) {
        this.A00 = q4w;
    }
}
