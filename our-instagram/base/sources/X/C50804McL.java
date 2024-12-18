package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.List;

/* renamed from: X.McL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50804McL extends BaseAdapter {
    public PKC A00;
    public final DataSetObserver A01;
    public final ListAdapter A02;
    public final C50801McI A03;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public final int A00(String str) {
        if (str == null) {
            return 0;
        }
        int count = this.A02.getCount();
        C50801McI c50801McI = this.A03;
        int i = 0;
        while (true) {
            List list = c50801McI.A00;
            if (i < list.size()) {
                String id = AbstractC25225BEi.A0x(list, i).getId();
                id.getClass();
                if (id.equals(str)) {
                    return count + i;
                }
                i++;
            } else {
                throw AbstractC31175DnJ.A0V("Could not find media with id ", str);
            }
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.A00.A02;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.A00;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2;
        PKC pkc = this.A00;
        int A00 = C9KI.A00(pkc, i);
        Adapter adapter = (Adapter) pkc.A03.get(A00);
        if (A00 == 0) {
            i2 = 0;
        } else {
            i2 = pkc.A04[A00 - 1];
        }
        Object item = adapter.getItem(i - i2);
        if (item != null) {
            return item;
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0O("cannot find item at position ", i));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        PKC pkc = this.A00;
        int A00 = C9KI.A00(pkc, i);
        if (A00 == 0) {
            i2 = 0;
        } else {
            i2 = pkc.A05[A00 - 1];
        }
        Adapter adapter = (Adapter) pkc.A03.get(A00);
        if (A00 == 0) {
            i3 = 0;
        } else {
            i3 = pkc.A04[A00 - 1];
        }
        return i2 + adapter.getItemViewType(i - i3);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        PKC pkc = this.A00;
        int A00 = C9KI.A00(pkc, i);
        Adapter adapter = (Adapter) pkc.A03.get(A00);
        if (A00 == 0) {
            i2 = 0;
        } else {
            i2 = pkc.A04[A00 - 1];
        }
        View view2 = adapter.getView(i - i2, view, viewGroup);
        if (view2 != null) {
            return view2;
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0O("cannot get view for position: ", i));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.A00.A01;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        int i2;
        PKC pkc = this.A00;
        int A00 = C9KI.A00(pkc, i);
        ListAdapter listAdapter = (ListAdapter) pkc.A03.get(A00);
        if (A00 == 0) {
            i2 = 0;
        } else {
            i2 = pkc.A04[A00 - 1];
        }
        return listAdapter.isEnabled(i - i2);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.A00.A00();
        super.notifyDataSetChanged();
    }

    public C50804McL(C54378O1k c54378O1k, InterfaceC11380iw interfaceC11380iw, List list) {
        this();
        C50801McI c50801McI = new C50801McI(c54378O1k, interfaceC11380iw, list);
        this.A03 = c50801McI;
        C50800McH c50800McH = new C50800McH(c54378O1k);
        this.A02 = c50800McH;
        ListAdapter[] listAdapterArr = {c50800McH, c50801McI};
        if (this.A00 == null) {
            int i = 0;
            do {
                listAdapterArr[i].registerDataSetObserver(this.A01);
                i++;
            } while (i < 2);
            this.A00 = new PKC(listAdapterArr);
            return;
        }
        throw AbstractC166987dD.A18("Section adapter should only be initialized once.");
    }

    public C50804McL() {
        this.A01 = new U8E(this, 1);
    }
}
