package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Bd8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25905Bd8 extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        C14360o3.A0B(rect, 0);
        AbstractC167017dG.A1P(view, recyclerView);
        int A02 = RecyclerView.A02(view);
        rect.top = 0;
        rect.bottom = 0;
        boolean z = this.A03;
        int i2 = A02 == 0 ? this.A02 : 0;
        if (z) {
            rect.right = i2;
        } else {
            rect.left = i2;
        }
        if (recyclerView.A0A != null) {
            if (A02 == r0.getItemCount() - 1) {
                i = this.A01;
            } else {
                i = this.A00;
            }
            if (z) {
                rect.left = i;
            } else {
                rect.right = i;
            }
        }
    }

    public C25905Bd8(Context context, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = AbstractC13620mo.A02(context);
        this.A01 = i + i3;
    }
}
