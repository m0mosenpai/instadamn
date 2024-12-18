package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoJ extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        int A02 = RecyclerView.A02(view);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            i = c2uu.getItemCount();
        } else {
            i = 0;
        }
        int i7 = this.A03;
        int i8 = i % i7;
        int i9 = i / i7;
        if (i8 != 0) {
            i9++;
        }
        int i10 = this.A01;
        if (i10 == 0) {
            i2 = A02 / i7;
            i3 = A02 % i7;
        } else {
            i2 = A02 % i7;
            i3 = A02 / i7;
        }
        int i11 = 0;
        boolean A1N = AbstractC167007dF.A1N(i2);
        boolean A1N2 = AbstractC167007dF.A1N(i3);
        int i12 = i7 - 1;
        if (i10 == 0) {
            i12 = i9 - 1;
        }
        boolean A1P = AbstractC167007dF.A1P(i2, i12);
        int i13 = i9 - 1;
        if (i10 == 0) {
            i13 = i12;
        }
        boolean A1P2 = AbstractC167007dF.A1P(i3, i13);
        if (A1N) {
            i4 = 0;
        } else {
            i4 = this.A00 / 2;
        }
        if (!A1P) {
            i5 = this.A00 / 2;
        } else {
            i5 = 0;
        }
        if (A1N2) {
            i6 = this.A02 / 2;
        } else {
            i6 = 0;
        }
        if (!A1P2) {
            i11 = this.A02 / 2;
        }
        if (i10 != 0) {
            int i14 = this.A00;
            rect.left = (i14 * i2) / i7;
            rect.top = i6;
            rect.right = (i14 * (i7 - (i2 + 1))) / i7;
        } else {
            rect.left = i4;
            int i15 = this.A02;
            rect.top = (i15 * i3) / i7;
            rect.right = i5;
            i11 = (i15 * (i7 - (i3 + 1))) / i7;
        }
        rect.bottom = i11;
    }

    public JoJ(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
