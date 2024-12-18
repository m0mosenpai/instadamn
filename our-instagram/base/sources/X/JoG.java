package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoG extends AbstractC70653Fc {
    public int A00;
    public int A01 = 0;
    public final int A02;

    public JoG(int i, int i2) {
        this.A00 = i;
        this.A02 = i2;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        C14360o3.A0B(rect, 0);
        AbstractC167017dG.A1P(view, recyclerView);
        int A02 = RecyclerView.A02(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A02 == 0) {
            i = this.A00;
        } else {
            i = this.A02;
        }
        rect.left = i;
        if (recyclerView.A0A != null) {
            if (A02 == r0.getItemCount() - 1) {
                rect.right = this.A01;
            } else {
                rect.right = 0;
            }
        }
        if (AbstractC13620mo.A02(view.getContext())) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
    }
}
