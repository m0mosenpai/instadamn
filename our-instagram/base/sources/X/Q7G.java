package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.facebook.R;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class Q7G extends Q7H implements View.OnClickListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public final int A08;
    public final SearchableInfo A09;
    public final Context A0A;
    public final SearchView A0B;
    public final WeakHashMap A0C;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Drawable A00(X.Q7G r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q7G.A00(X.Q7G, java.lang.String):android.graphics.drawable.Drawable");
    }

    public static String A01(Cursor cursor, int i) {
        String str = null;
        if (i == -1) {
            return null;
        }
        try {
            str = cursor.getString(i);
            return str;
        } catch (Exception e) {
            android.util.Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return str;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public Q7G(SearchableInfo searchableInfo, Context context, SearchView searchView, WeakHashMap weakHashMap) {
        int i = searchView.A0T;
        super.A05 = true;
        ((Q51) this).A02 = null;
        super.A06 = false;
        ((Q51) this).A01 = context;
        ((Q51) this).A00 = -1;
        super.A04 = new Q24(this);
        super.A03 = new Q25(this);
        ((Q7H) this).A00 = i;
        ((Q7H) this).A01 = i;
        ((Q7H) this).A02 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.A03 = 1;
        this.A04 = -1;
        this.A05 = -1;
        this.A06 = -1;
        this.A01 = -1;
        this.A02 = -1;
        this.A00 = -1;
        this.A0B = searchView;
        this.A09 = searchableInfo;
        this.A08 = searchView.A0S;
        this.A0A = context;
        this.A0C = weakHashMap;
    }

    @Override // X.Q51, X.InterfaceC65464Tkg
    public final void AGs(Cursor cursor) {
        try {
            super.AGs(cursor);
            if (cursor != null) {
                this.A04 = cursor.getColumnIndex("suggest_text_1");
                this.A05 = cursor.getColumnIndex("suggest_text_2");
                this.A06 = cursor.getColumnIndex("suggest_text_2_url");
                this.A01 = cursor.getColumnIndex("suggest_icon_1");
                this.A02 = cursor.getColumnIndex("suggest_icon_2");
                this.A00 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            android.util.Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // X.Q51, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A0A = AbstractC31172DnG.A0A(((Q7H) this).A02, viewGroup, ((Q7H) this).A00);
            if (A0A != null) {
                ((SI0) A0A.getTag()).A03.setText(e.toString());
            }
            return A0A;
        }
    }

    @Override // X.Q51, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            Q7G q7g = this;
            View A0A = AbstractC31172DnG.A0A(((Q7H) q7g).A02, viewGroup, ((Q7H) q7g).A01);
            A0A.setTag(new SI0(A0A));
            AbstractC31171DnF.A08(A0A, R.id.edit_query).setImageResource(q7g.A08);
            ((SI0) A0A.getTag()).A03.setText(e.toString());
            return A0A;
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = ((Q51) this).A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = ((Q51) this).A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1438073736);
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0B.A0F((CharSequence) tag);
        }
        C0f9.A0C(553628035, A05);
    }
}
