package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.MjP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51181MjP extends AbstractC70653Fc {
    public final List A00;

    public C51181MjP(List list) {
        this.A00 = list;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        O7N o7n;
        AbstractC167027dH.A12(rect, view, recyclerView);
        int A02 = RecyclerView.A02(view);
        if (A02 != -1) {
            List list = this.A00;
            if (A02 < list.size()) {
                o7n = (O7N) list.get(A02);
            } else {
                o7n = null;
            }
            if (o7n instanceof C52422NHs) {
                C52422NHs c52422NHs = (C52422NHs) o7n;
                rect.left = c52422NHs.A02;
                rect.right = c52422NHs.A03;
            }
        }
    }
}
