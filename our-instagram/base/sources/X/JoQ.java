package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes8.dex */
public final class JoQ extends C1I4 {
    public boolean A00;
    public final int A01;
    public final AbstractC70663Fe A02;
    public final MPM A03;

    public JoQ(AbstractC70663Fe abstractC70663Fe, MPM mpm, int i) {
        this.A02 = abstractC70663Fe;
        this.A01 = i;
        this.A03 = mpm;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0N = AbstractC167017dG.A0N(recyclerView, 603089439);
        super.onScrollStateChanged(recyclerView, i);
        C0f9.A0A(-1011640206, A0N);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A1b;
        int i3;
        int A04;
        int A03 = C0f9.A03(-639366420);
        AbstractC70663Fe abstractC70663Fe = this.A02;
        int A0U = abstractC70663Fe.A0U();
        if (!(abstractC70663Fe instanceof LinearLayoutManager) && !(abstractC70663Fe instanceof GridLayoutManager)) {
            if (abstractC70663Fe instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC70663Fe;
                int[] iArr = new int[staggeredGridLayoutManager.A06];
                for (int i4 = 0; i4 < staggeredGridLayoutManager.A06; i4++) {
                    C9GM c9gm = staggeredGridLayoutManager.A0H[i4];
                    boolean z = c9gm.A05.A0D;
                    int size = c9gm.A03.size();
                    if (z) {
                        A04 = c9gm.A04(0, size);
                    } else {
                        A04 = c9gm.A04(size - 1, -1);
                    }
                    iArr[i4] = A04;
                }
                A1b = 0;
                for (int i5 : iArr) {
                    if (i5 > A1b) {
                        A1b = i5;
                    }
                }
            } else {
                C0w9.A03("RecyclerViewPaginationScrollListener", "Unsupported layout manager");
                i3 = 1686701446;
                C0f9.A0A(i3, A03);
            }
        } else {
            A1b = ((LinearLayoutManager) abstractC70663Fe).A1b();
        }
        if (!this.A00 && A1b + this.A01 > A0U) {
            this.A00 = true;
            this.A03.Chd();
        }
        i3 = -1985980458;
        C0f9.A0A(i3, A03);
    }
}
