package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8rO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199218rO extends AbstractC70653Fc {
    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(recyclerView, 2);
        if (RecyclerView.A02(view) == 0) {
            rect.top = 0;
        }
        rect.left = 0;
        rect.right = 0;
        rect.bottom = 0;
    }
}
