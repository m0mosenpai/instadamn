package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MjT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51185MjT extends AbstractC70653Fc {
    public final int A00;
    public final int A01;

    public C51185MjT(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        AbstractC167027dH.A12(rect, view, recyclerView);
        int A02 = RecyclerView.A02(view);
        int i2 = this.A00;
        if (A02 != 0) {
            i2 /= 2;
        }
        rect.left = i2;
        int A022 = RecyclerView.A02(view);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            i = c2uu.getItemCount();
        } else {
            i = 0;
        }
        int i3 = i - 1;
        int i4 = this.A01;
        if (A022 != i3) {
            i4 /= 2;
        }
        rect.right = i4;
    }
}
