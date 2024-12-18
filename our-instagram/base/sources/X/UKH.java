package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public abstract class UKH extends AbstractC021208i {
    public final DataSetObservable A00 = new DataSetObservable();
    public final AbstractC021208i A01;

    @Override // X.AbstractC021208i
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.A01.destroyItem(viewGroup, i, obj);
    }

    @Override // X.AbstractC021208i
    public final void finishUpdate(ViewGroup viewGroup) {
        this.A01.finishUpdate(viewGroup);
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A01.getCount();
    }

    @Override // X.AbstractC021208i
    public final boolean isViewFromObject(View view, Object obj) {
        return this.A01.isViewFromObject(view, obj);
    }

    @Override // X.AbstractC021208i, X.JG3
    public final void notifyDataSetChanged() {
        this.A01.notifyDataSetChanged();
    }

    @Override // X.AbstractC021208i
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.registerObserver(dataSetObserver);
    }

    @Override // X.AbstractC021208i
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.A01.restoreState(parcelable, classLoader);
    }

    @Override // X.AbstractC021208i
    public final Parcelable saveState() {
        return this.A01.saveState();
    }

    @Override // X.AbstractC021208i
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.A01.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // X.AbstractC021208i
    public final void startUpdate(ViewGroup viewGroup) {
        this.A01.startUpdate(viewGroup);
    }

    @Override // X.AbstractC021208i
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.unregisterObserver(dataSetObserver);
    }

    public UKH(AbstractC021208i abstractC021208i) {
        this.A01 = abstractC021208i;
        abstractC021208i.registerDataSetObserver(new U8E(this, 2));
    }
}
