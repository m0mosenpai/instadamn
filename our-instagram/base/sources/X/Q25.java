package X;

import android.database.DataSetObserver;

/* loaded from: classes10.dex */
public final class Q25 extends DataSetObserver {
    public final /* synthetic */ Q51 A00;

    public Q25(Q51 q51) {
        this.A00 = q51;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        Q51 q51 = this.A00;
        q51.A06 = true;
        C0fA.A00(q51, -1597326437);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        Q51 q51 = this.A00;
        q51.A06 = false;
        C0fA.A01(q51, -1287184389);
    }
}
