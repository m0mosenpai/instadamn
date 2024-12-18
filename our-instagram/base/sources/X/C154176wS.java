package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6wS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154176wS extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final boolean A02;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        GridLayoutManager gridLayoutManager;
        C14360o3.A0B(rect, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(recyclerView, 2);
        int A02 = RecyclerView.A02(view) - this.A01;
        if (A02 >= 0) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if ((abstractC70663Fe instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) abstractC70663Fe) != null) {
                i = gridLayoutManager.A00;
            } else {
                i = 1;
            }
            int i2 = A02 % i;
            int i3 = this.A00;
            int i4 = i3 / i;
            rect.left = i2 * i4;
            rect.right = i4 - ((i2 + 1) * i4);
            if (this.A02 || A02 >= i) {
                rect.top = i3;
            }
        }
    }

    public C154176wS(int i, boolean z, int i2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = i2;
    }
}
