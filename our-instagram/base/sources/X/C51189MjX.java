package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MjX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51189MjX extends AbstractC70653Fc {
    public final int A00 = 1;
    public final int A01;
    public final Paint A02;

    public C51189MjX(int i, int i2) {
        this.A01 = i2;
        Paint A0R = AbstractC166987dD.A0R();
        this.A02 = A0R;
        A0R.setColor(i);
        A0R.setStrokeWidth(1.0f);
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        rect.set(0, 0, 0, this.A00);
    }

    @Override // X.AbstractC70653Fc
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        AbstractC167027dH.A12(canvas, recyclerView, c3f5);
        int paddingLeft = recyclerView.getPaddingLeft() + this.A01;
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            C14360o3.A07(childAt);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(17));
            float bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            canvas.drawLine(paddingLeft, bottom, width, bottom, this.A02);
        }
    }
}
