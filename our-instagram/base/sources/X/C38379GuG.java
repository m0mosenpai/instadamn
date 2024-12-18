package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GuG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38379GuG extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C38379GuG(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        int i2;
        if (3 - this.A00 != 0) {
            super.getItemOffsets(rect, view, recyclerView, c3f5);
            i = this.A01;
            i2 = this.A02;
        } else {
            super.getItemOffsets(rect, view, recyclerView, c3f5);
            if (((C41189ILc) this.A03).A01.getItemViewType(RecyclerView.A02(view)) == 3) {
                return;
            }
            i = this.A02;
            i2 = this.A01;
        }
        boolean A1a = AbstractC167017dG.A1a(rect, view);
        C14360o3.A0B(recyclerView, 2);
        int A02 = RecyclerView.A02(view) % 2;
        int i3 = i / 2;
        int i4 = i3;
        if (A02 == 0) {
            i4 = i2;
        }
        rect.left = i4;
        if (A02 == A1a) {
            i3 = i2;
        }
        rect.right = i3;
        rect.bottom = i2;
    }
}
