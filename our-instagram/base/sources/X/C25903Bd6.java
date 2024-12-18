package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Bd6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25903Bd6 extends AbstractC70653Fc {
    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        try {
            i = AbstractC167017dG.A06(view.getContext());
        } catch (Resources.NotFoundException unused) {
            i = 0;
        }
        int A02 = RecyclerView.A02(view);
        rect.right = i;
        if (A02 == 0) {
            rect.left = i * 2;
        }
    }
}
