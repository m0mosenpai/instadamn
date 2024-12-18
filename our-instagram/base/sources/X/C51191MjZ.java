package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MjZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51191MjZ extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        return true;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        if (RecyclerView.A02(view) == 0) {
            rect.left = this.A02;
            rect.right = this.A01;
            return;
        }
        if (RecyclerView.A02(view) == c3f5.A00() - 1) {
            rect.right = this.A00;
            i = this.A01;
        } else {
            i = this.A01;
            rect.right = i;
        }
        rect.left = i;
    }

    public final int hashCode() {
        return 0;
    }

    public C51191MjZ(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }
}
