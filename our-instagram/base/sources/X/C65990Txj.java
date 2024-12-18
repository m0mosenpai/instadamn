package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;

/* renamed from: X.Txj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65990Txj implements SpinnerAdapter {
    public final SpinnerAdapter A00;
    public final /* synthetic */ TriangleSpinner A01;

    public C65990Txj(SpinnerAdapter spinnerAdapter, TriangleSpinner triangleSpinner) {
        this.A01 = triangleSpinner;
        this.A00 = spinnerAdapter;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.A00.getDropDownView(i, view, viewGroup);
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
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TriangleSpinner triangleSpinner = this.A01;
        if (triangleSpinner.A00 != null || triangleSpinner.A01 != null) {
            i = triangleSpinner.getSelectedItemPosition();
        }
        return this.A00.getView(i, view, viewGroup);
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

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.unregisterDataSetObserver(dataSetObserver);
    }
}
