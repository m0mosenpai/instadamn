package X;

import android.app.SearchableInfo;
import android.database.Cursor;
import android.net.Uri;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes10.dex */
public final class Q52 extends Filter {
    public InterfaceC65464Tkg A00;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.A00.AKA((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        String suggestAuthority;
        Q7G q7g = (Q7G) this.A00;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = q7g.A0B;
        Cursor cursor2 = null;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = q7g.A09;
                String[] strArr = null;
                if (searchableInfo != null && (suggestAuthority = searchableInfo.getSuggestAuthority()) != null) {
                    Uri.Builder fragment = AbstractC58320PtC.A0D().authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new String[]{charSequence2};
                    } else {
                        fragment.appendPath(charSequence2);
                    }
                    fragment.appendQueryParameter("limit", String.valueOf(50));
                    cursor = C0fI.A01(q7g.A0A.getContentResolver(), fragment.build(), suggestSelection, null, null, strArr, 1825540651);
                } else {
                    cursor = null;
                }
                if (cursor != null) {
                    cursor.getCount();
                    cursor2 = cursor;
                }
            } catch (RuntimeException e) {
                android.util.Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursor2 != null) {
            filterResults.count = cursor2.getCount();
        } else {
            filterResults.count = 0;
            cursor2 = null;
        }
        filterResults.values = cursor2;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        InterfaceC65464Tkg interfaceC65464Tkg = this.A00;
        Cursor cursor = ((Q51) interfaceC65464Tkg).A02;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            interfaceC65464Tkg.AGs((Cursor) obj);
        }
    }
}
