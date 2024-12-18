package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.widget.ListAdapter;

/* renamed from: X.2UT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2UT extends C2UU implements ListAdapter {
    public final C65372xZ mDataSetObservable = new DataSetObservable();
    public final AbstractC65392xb mAdapterDataObserver = new AbstractC65392xb() { // from class: X.2xa
        @Override // X.AbstractC65392xb
        public final void onChanged() {
            C2UT.this.mDataSetObservable.notifyChanged();
        }

        @Override // X.AbstractC65392xb
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // X.AbstractC65392xb
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // X.AbstractC65392xb
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // X.AbstractC65392xb
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // X.AbstractC65392xb
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    };

    @Override // android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.mDataSetObservable.A00() == 0) {
            registerAdapterDataObserver(this.mAdapterDataObserver);
        }
        this.mDataSetObservable.registerObserver(dataSetObserver);
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mDataSetObservable.unregisterObserver(dataSetObserver);
        if (this.mDataSetObservable.A00() == 0) {
            unregisterAdapterDataObserver(this.mAdapterDataObserver);
        }
    }

    public void updateListView() {
        this.mAdapterDataObserver.onChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return getItemCount();
    }

    @Override // X.C2UU, android.widget.Adapter
    public long getItemId(int i) {
        long j = i;
        C0f9.A0A(1293229607, C0f9.A03(67189162));
        return j;
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        if (getItemCount() != 0) {
            return false;
        }
        return true;
    }
}
