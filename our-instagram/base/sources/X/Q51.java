package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.facebook.R;

/* loaded from: classes10.dex */
public abstract class Q51 extends BaseAdapter implements InterfaceC65464Tkg, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02;
    public DataSetObserver A03;
    public Q24 A04;
    public boolean A05;
    public boolean A06;
    public Q52 A07;

    @Override // X.InterfaceC65464Tkg
    public final CharSequence AKA(Cursor cursor) {
        Q7G q7g = (Q7G) this;
        if (cursor != null) {
            String A01 = Q7G.A01(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (A01 == null) {
                SearchableInfo searchableInfo = q7g.A09;
                if ((!searchableInfo.shouldRewriteQueryFromData() || (A01 = Q7G.A01(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) && (!searchableInfo.shouldRewriteQueryFromText() || (A01 = Q7G.A01(cursor, cursor.getColumnIndex("suggest_text_1"))) == null)) {
                }
            }
            return A01;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0127, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.database.Cursor r25, android.view.View r26) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q51.A02(android.database.Cursor, android.view.View):void");
    }

    @Override // X.InterfaceC65464Tkg
    public void AGs(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor != cursor2) {
            if (cursor2 != null) {
                Q24 q24 = this.A04;
                if (q24 != null) {
                    cursor2.unregisterContentObserver(q24);
                }
                DataSetObserver dataSetObserver = this.A03;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.A02 = cursor;
            if (cursor != null) {
                Q24 q242 = this.A04;
                if (q242 != null) {
                    cursor.registerContentObserver(q242);
                }
                DataSetObserver dataSetObserver2 = this.A03;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.A00 = cursor.getColumnIndexOrThrow("_id");
                this.A06 = true;
                C0fA.A00(this, 561553197);
            } else {
                this.A00 = -1;
                this.A06 = false;
                C0fA.A01(this, 1995949606);
            }
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.A06 && (cursor = this.A02) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.A06) {
            this.A02.moveToPosition(i);
            if (view == null) {
                Q7H q7h = (Q7H) this;
                view = AbstractC31172DnG.A0A(q7h.A02, viewGroup, q7h.A00);
            }
            A02(this.A02, view);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Q52, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        Q52 q52 = this.A07;
        if (q52 == null) {
            ?? filter = new Filter();
            filter.A00 = this;
            this.A07 = filter;
            return filter;
        }
        return q52;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.A06 && (cursor = this.A02) != null) {
            cursor.moveToPosition(i);
            return this.A02;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.A06 || (cursor = this.A02) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.A02.getLong(this.A00);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.A06) {
            if (this.A02.moveToPosition(i)) {
                if (view == null) {
                    Q7G q7g = (Q7G) this;
                    view = AbstractC31172DnG.A0A(((Q7H) q7g).A02, viewGroup, ((Q7H) q7g).A01);
                    view.setTag(new SI0(view));
                    AbstractC31171DnF.A08(view, R.id.edit_query).setImageResource(q7g.A08);
                }
                A02(this.A02, view);
                return view;
            }
            throw AbstractC31175DnJ.A0U("couldn't move cursor to position ", i);
        }
        throw AbstractC166987dD.A14("this should only be called when the cursor is valid");
    }
}
