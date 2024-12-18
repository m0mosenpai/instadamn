package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MjY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51190MjY extends AbstractC70653Fc {
    public Paint A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        C14360o3.A0B(rect, 0);
        AbstractC167017dG.A1P(view, recyclerView);
        int A02 = RecyclerView.A02(view);
        rect.left = 0;
        rect.right = 0;
        if (A02 == 0) {
            i = this.A02;
        } else {
            i = this.A01;
        }
        rect.top = i;
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null && A02 == c2uu.getItemCount()) {
            rect.bottom = this.A02;
        } else {
            rect.bottom = 0;
        }
    }

    @Override // X.AbstractC70653Fc
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        AbstractC167027dH.A12(canvas, recyclerView, c3f5);
        if (this.A03) {
            int width = recyclerView.getWidth();
            int childCount = recyclerView.getChildCount() - 1;
            for (int i = 0; i < childCount; i++) {
                int bottom = recyclerView.getChildAt(i).getBottom() + this.A01;
                Paint paint = this.A00;
                if (paint != null) {
                    float f = bottom;
                    canvas.drawLine(0.0f, f, width, f, paint);
                }
            }
        }
    }

    public C51190MjY(int i, int i2, int i3, boolean z) {
        Paint paint;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = z;
        if (z) {
            paint = AbstractC166987dD.A0R();
            paint.setColor(i3);
            paint.setStrokeWidth(i2);
        } else {
            paint = null;
        }
        this.A00 = paint;
    }
}
