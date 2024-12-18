package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3YB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YB extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final int A02;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        C14360o3.A0B(rect, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(recyclerView, 2);
        int A02 = RecyclerView.A02(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A02 == 0) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        rect.left = i;
        if (recyclerView.A0A != null) {
            if (A02 == r0.getItemCount() - 1) {
                rect.right = this.A02;
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

    public C3YB(int i, int i2) {
        this.A01 = i;
        this.A02 = i;
        this.A00 = i2;
    }
}
