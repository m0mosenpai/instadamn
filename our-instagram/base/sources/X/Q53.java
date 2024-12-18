package X;

import android.widget.Filter;

/* loaded from: classes10.dex */
public final class Q53 extends Filter {
    public final /* synthetic */ C58723Q4z A00;

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    public Q53(C58723Q4z c58723Q4z) {
        this.A00 = c58723Q4z;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        C58723Q4z c58723Q4z = this.A00;
        filterResults.values = c58723Q4z.A00;
        filterResults.count = c58723Q4z.getCount();
        return filterResults;
    }
}
