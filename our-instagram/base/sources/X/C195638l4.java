package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.8l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C195638l4 extends AbstractC70653Fc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    @Override // X.AbstractC70653Fc
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        int i2;
        int i3;
        Integer valueOf;
        C14360o3.A0B(rect, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(recyclerView, 2);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe instanceof GridLayoutManager) {
            i = ((GridLayoutManager) abstractC70663Fe).A00;
        } else if (!(abstractC70663Fe instanceof StaggeredGridLayoutManager)) {
            return;
        } else {
            i = ((StaggeredGridLayoutManager) abstractC70663Fe).A06;
        }
        if (i >= 1) {
            int A03 = RecyclerView.A03(view) - this.A02;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof AnonymousClass807) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                C14360o3.A0C(layoutParams2, AbstractC43591JPw.A00(1200));
                C9GM c9gm = ((AnonymousClass807) layoutParams2).A00;
                if (c9gm != null) {
                    i2 = c9gm.A04;
                    if (i2 != -1 && (valueOf = Integer.valueOf(i2)) != null) {
                        i3 = valueOf.intValue();
                    }
                }
                i3 = A03 % i;
            } else {
                if (layoutParams instanceof C154496wz) {
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
                    i2 = ((C154496wz) layoutParams3).A00;
                    if (i2 != -1) {
                        i3 = valueOf.intValue();
                    }
                }
                i3 = A03 % i;
            }
            int i4 = this.A01;
            int i5 = (i4 * 2) - this.A00;
            rect.left = i4 - ((i5 * i3) / i);
            rect.right = i4 - ((((i - i3) - 1) * i5) / i);
            if (this.A04 && A03 < i) {
                rect.top = this.A03;
            }
            rect.bottom = this.A03;
        }
    }

    public C195638l4(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A04 = z;
        this.A02 = i4;
    }

    public C195638l4(int i, boolean z) {
        this(z, i, i, i, 0);
    }
}
