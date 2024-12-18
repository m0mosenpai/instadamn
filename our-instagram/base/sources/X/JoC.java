package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoC extends AbstractC70653Fc {
    public final int A00;

    public JoC(Context context, int i) {
        this.A00 = i + (AbstractC167017dG.A06(context) * 2);
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        boolean A1b = AbstractC25233BEq.A1b(rect, view, recyclerView);
        int A02 = RecyclerView.A02(view);
        int measuredWidth = view.getMeasuredWidth();
        Integer valueOf = Integer.valueOf(measuredWidth);
        int i2 = 0;
        if (measuredWidth <= 0 || valueOf == null) {
            measuredWidth = this.A00;
        }
        int measuredWidth2 = recyclerView.getMeasuredWidth();
        if (measuredWidth2 > 0) {
            i = (measuredWidth2 - measuredWidth) / 2;
        } else {
            i = 0;
        }
        int i3 = 0;
        if (A02 == 0) {
            i3 = i;
        }
        rect.left = i3;
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null && A02 == c2uu.getItemCount() - (A1b ? 1 : 0)) {
            i2 = i;
        }
        rect.right = i2;
    }
}
