package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public class BIL extends ViewGroup {
    public boolean A00;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.A00) {
            return super.getChildCount();
        }
        return 0;
    }

    public final void A00(View view, AnonymousClass585 anonymousClass585, long j) {
        super.drawChild(AnonymousClass597.A00(anonymousClass585), view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C14360o3.A0C(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((C119455b2) childAt).A00) {
                this.A00 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.A00 = false;
                }
            }
        }
    }
}
