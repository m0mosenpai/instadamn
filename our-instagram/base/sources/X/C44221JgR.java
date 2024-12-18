package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JgR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44221JgR extends AbstractC70653Fc {
    public final float A00;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        if (RecyclerView.A02(view) == 0) {
            rect.left = (int) this.A00;
        } else {
            if (RecyclerView.A02(view) != c3f5.A00() - 1) {
                return;
            }
            rect.right = (int) this.A00;
        }
    }

    public C44221JgR(float f) {
        this.A00 = f;
    }
}
