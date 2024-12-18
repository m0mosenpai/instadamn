package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9Qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210109Qz extends C8S8 {
    public final BBz A00;

    @Override // X.C8S8
    public final boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // X.C8S8
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        AbstractC167007dF.A1D(c3oo, 1, c3oo2);
        if (c3oo.mItemViewType != c3oo2.mItemViewType) {
            return false;
        }
        this.A00.DNb(c3oo.getBindingAdapterPosition(), c3oo2.getBindingAdapterPosition());
        return true;
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    @Override // X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        return C8S8.makeMovementFlags(15, 0);
    }

    @Override // X.C8S8
    public final void onSelectedChanged(C3OO c3oo, int i) {
        if (c3oo != null) {
            c3oo.itemView.setAlpha(0.8f);
            c3oo.itemView.setScaleX(1.1f);
            c3oo.itemView.setScaleY(1.1f);
        }
    }

    public C210109Qz(BBz bBz) {
        this.A00 = bBz;
    }

    @Override // X.C8S8
    public final void clearView(RecyclerView recyclerView, C3OO c3oo) {
        AbstractC167017dG.A1N(recyclerView, c3oo);
        c3oo.itemView.setAlpha(1.0f);
        c3oo.itemView.setScaleX(1.0f);
        c3oo.itemView.setScaleY(1.0f);
        super.clearView(recyclerView, c3oo);
    }
}
