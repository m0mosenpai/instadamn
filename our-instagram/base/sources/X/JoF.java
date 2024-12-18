package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoF extends AbstractC70653Fc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC167017dG.A1P(view, recyclerView);
        if (recyclerView.A0A != null) {
            int A02 = RecyclerView.A02(view);
            if (A02 == 0) {
                int i = this.A00;
                int i2 = this.A01;
                rect.set(i, i2, 0, i2);
                return;
            }
            C2UU c2uu = recyclerView.A0A;
            C14360o3.A0A(c2uu);
            int itemCount = c2uu.getItemCount() - 1;
            int i3 = this.A01;
            if (A02 == itemCount) {
                rect.set(0, i3, this.A00, i3);
            } else {
                rect.set(0, i3, 0, i3);
            }
        }
    }

    public JoF(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
