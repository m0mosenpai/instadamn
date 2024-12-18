package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoL extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final Paint A02;

    public JoL(int i, int i2) {
        Paint A0R = AbstractC166987dD.A0R();
        this.A02 = A0R;
        A0R.setColor(i);
        A0R.setStrokeWidth(1.0f);
        this.A00 = 1;
        this.A01 = i2;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        rect.set(0, 0, 0, this.A00);
    }

    @Override // X.AbstractC70653Fc
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = this.A01;
        int i2 = paddingLeft + i;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - i;
        int childCount = recyclerView.getChildCount() - 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            float bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
            canvas.drawLine(i2, bottom, width, bottom, this.A02);
        }
    }
}
