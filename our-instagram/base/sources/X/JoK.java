package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoK extends AbstractC70653Fc {
    public final AbstractC154146wP A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public JoK(AbstractC154146wP abstractC154146wP, int i) {
        this.A00 = abstractC154146wP;
        this.A02 = i;
        int i2 = i / 3;
        this.A03 = i2;
        this.A01 = i2 * 2;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        AbstractC167017dG.A1N(rect, view);
        C14360o3.A0B(recyclerView, 2);
        int A02 = RecyclerView.A02(view);
        AbstractC154146wP abstractC154146wP = this.A00;
        if (abstractC154146wP.A03(A02) != 3) {
            int i2 = 0;
            for (int i3 = 0; i3 < A02; i3++) {
                if (abstractC154146wP.A03(i3) == 3) {
                    i2++;
                }
            }
            int i4 = (A02 - i2) % 3;
            int i5 = 0;
            if (i4 != 0) {
                if (i4 != 2) {
                    i = this.A03;
                } else {
                    i = this.A01;
                }
            } else {
                i = 0;
            }
            rect.left = i;
            if (i4 != 0) {
                if (i4 != 2) {
                    i5 = this.A03;
                }
            } else {
                i5 = this.A01;
            }
            rect.right = i5;
        }
        rect.bottom = this.A02;
    }
}
