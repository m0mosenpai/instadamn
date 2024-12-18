package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

/* renamed from: X.41O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41O implements C41P {
    public final Adapter A00;

    @Override // X.C41P
    public final void EDg(C3VX c3vx) {
        C14360o3.A0B(c3vx, 0);
        this.A00.registerDataSetObserver(c3vx);
    }

    @Override // X.C41P
    public final void F9h(C3VX c3vx) {
        C14360o3.A0B(c3vx, 0);
        this.A00.unregisterDataSetObserver(c3vx);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        View view2 = this.A00.getView(i, view, viewGroup);
        C14360o3.A07(view2);
        return view2;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        C14360o3.A0B(dataSetObserver, 0);
        this.A00.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        C14360o3.A0B(dataSetObserver, 0);
        this.A00.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.Adapter
    public final CharSequence[] getAutofillOptions() {
        return this.A00.getAutofillOptions();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A00.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.A00.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.A00.getItemViewType(i);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return this.A00.getViewTypeCount();
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.A00.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public C41O(Adapter adapter) {
        this.A00 = adapter;
    }
}
