package X;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

/* loaded from: classes11.dex */
public final class U8E extends DataSetObserver {
    public final int A00;
    public final Object A01;

    public U8E(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.A00) {
            case 0:
                FQW fqw = (FQW) this.A01;
                fqw.A00(fqw.A03, fqw.A04.getItemCount());
                return;
            case 1:
                C0fA.A00((BaseAdapter) this.A01, -1492474824);
                return;
            default:
                UKH ukh = (UKH) this.A01;
                super/*X.08i*/.notifyDataSetChanged();
                ukh.A00.notifyChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        if (2 - this.A00 != 0) {
            super.onInvalidated();
        } else {
            ((UKH) this.A01).A00.notifyInvalidated();
        }
    }
}
