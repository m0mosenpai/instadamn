package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JgV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44225JgV extends AbstractC65392xb {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44225JgV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeInserted(int i, int i2) {
        RecyclerView recyclerView;
        Runnable runnableC44223JgT;
        switch (this.A00) {
            case 0:
                if (i != 0 || i2 <= 0 || (recyclerView = ((JXJ) this.A02).A01) == null) {
                    return;
                }
                runnableC44223JgT = new RunnableC44223JgT((Fragment) this.A01);
                break;
                break;
            case 1:
                recyclerView = ((C49524Lud) this.A02).A02;
                if (recyclerView == null) {
                    return;
                }
                runnableC44223JgT = new M29((Fragment) this.A01);
                break;
            default:
                if (i == 0) {
                    ((AbstractC70663Fe) this.A02).A1O(0);
                    return;
                }
                return;
        }
        recyclerView.post(runnableC44223JgT);
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeMoved(int i, int i2, int i3) {
        if (2 - this.A00 != 0) {
            super.onItemRangeMoved(i, i2, i3);
        } else {
            if (i != 0 && i2 != 0) {
                return;
            }
            ((AbstractC70663Fe) this.A02).A1O(0);
        }
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeRemoved(int i, int i2) {
        if (2 - this.A00 != 0) {
            super.onItemRangeRemoved(i, i2);
        } else {
            if (i != 0) {
                return;
            }
            ((AbstractC70663Fe) this.A02).A1O(0);
        }
    }
}
