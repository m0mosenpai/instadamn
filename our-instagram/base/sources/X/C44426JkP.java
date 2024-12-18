package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.JkP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44426JkP extends FrameLayout {
    public final float A00;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        float measuredWidth = getMeasuredWidth();
        float f = this.A00;
        setMeasuredDimension((int) (measuredWidth * f), (int) (getMeasuredHeight() * f));
    }

    public C44426JkP(Context context) {
        super(context, null);
        this.A00 = 0.75f;
        setClipChildren(false);
    }

    public final float getScaleFactor() {
        return this.A00;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        if (view != null) {
            float f = this.A00;
            view.setScaleX(f);
            view.setScaleY(f);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
        }
    }
}
