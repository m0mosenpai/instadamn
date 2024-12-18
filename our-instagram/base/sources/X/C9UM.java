package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9UM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9UM extends AbstractC70653Fc {
    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        boolean A1a = AbstractC167017dG.A1a(rect, view);
        AbstractC167017dG.A1R(recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        try {
            i = AbstractC167017dG.A04(view.getContext());
        } catch (Resources.NotFoundException unused) {
            i = 0;
        }
        int A02 = RecyclerView.A02(view);
        if (A02 == 0) {
            rect.left = AbstractC167017dG.A03(view.getContext());
        } else {
            C2UU c2uu = recyclerView.A0A;
            if (c2uu != null && A02 == c2uu.getItemCount() - (A1a ? 1 : 0)) {
                i = AbstractC167017dG.A03(view.getContext());
            }
        }
        rect.right = i;
    }
}
