package X;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8CD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8CD extends C2UU implements C8CE {
    public int A01;
    public final List A02 = new ArrayList();
    public final List A04 = new ArrayList();
    public int[] A00 = new int[0];
    public final Map A03 = new HashMap();

    public static void A00(C8CD c8cd) {
        List list = c8cd.A02;
        int size = list.size();
        int[] iArr = c8cd.A00;
        if (size != iArr.length) {
            iArr = new int[size];
            c8cd.A00 = iArr;
        }
        if (size == 0) {
            c8cd.A01 = 0;
            return;
        }
        iArr[0] = ((C2UU) list.get(0)).getItemCount();
        for (int i = 1; i < size; i++) {
            C2UU c2uu = (C2UU) list.get(i);
            int[] iArr2 = c8cd.A00;
            iArr2[i] = iArr2[i - 1] + c2uu.getItemCount();
        }
        c8cd.A01 = c8cd.A00[size - 1];
    }

    public final int A01(C2UU c2uu) {
        C2UU c2uu2;
        Iterator it = this.A02.iterator();
        int i = 0;
        while (it.hasNext() && c2uu != (c2uu2 = (C2UU) it.next())) {
            i += c2uu2.getItemCount();
        }
        return i;
    }

    public final void A02(C2UU c2uu) {
        List list = this.A02;
        int indexOf = list.indexOf(c2uu);
        if (indexOf != -1 && c2uu != null) {
            AbstractC65392xb abstractC65392xb = (AbstractC65392xb) this.A04.remove(indexOf);
            if (abstractC65392xb != null) {
                c2uu.unregisterAdapterDataObserver(abstractC65392xb);
            }
            list.remove(c2uu);
            this.A03.clear();
            A00(this);
            notifyDataSetChanged();
        }
    }

    public final void A03(final C2UU c2uu, int i) {
        List list = this.A02;
        if (!list.contains(c2uu) && i >= 0 && i <= list.size()) {
            AbstractC65392xb abstractC65392xb = new AbstractC65392xb(c2uu, this) { // from class: X.9KG
                public final C2UU A00;
                public final /* synthetic */ C8CD A01;

                {
                    this.A01 = this;
                    this.A00 = c2uu;
                }

                @Override // X.AbstractC65392xb
                public final void onChanged() {
                    C8CD c8cd = this.A01;
                    C8CD.A00(c8cd);
                    c8cd.notifyDataSetChanged();
                }

                @Override // X.AbstractC65392xb
                public final void onItemRangeChanged(int i2, int i3) {
                    C8CD c8cd = this.A01;
                    c8cd.notifyItemRangeChanged(c8cd.A01(this.A00) + i2, i3);
                }

                @Override // X.AbstractC65392xb
                public final void onItemRangeInserted(int i2, int i3) {
                    C8CD c8cd = this.A01;
                    c8cd.notifyItemRangeInserted(c8cd.A01(this.A00) + i2, i3);
                }

                @Override // X.AbstractC65392xb
                public final void onItemRangeRemoved(int i2, int i3) {
                    C8CD c8cd = this.A01;
                    c8cd.notifyItemRangeRemoved(c8cd.A01(this.A00) + i2, i3);
                }
            };
            c2uu.registerAdapterDataObserver(abstractC65392xb);
            if (i == list.size()) {
                list.add(c2uu);
                this.A04.add(abstractC65392xb);
            } else {
                list.add(i, c2uu);
                this.A04.add(i, abstractC65392xb);
            }
            this.A03.clear();
            A00(this);
            notifyDataSetChanged();
        }
    }

    @Override // X.C8CE
    public final int AZZ() {
        return this.A02.size();
    }

    @Override // X.C8CE
    public final int[] Au5() {
        return this.A00;
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C2UU) it.next()).onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Pair pair = (Pair) this.A03.get(Integer.valueOf(i));
        if (pair != null) {
            int intValue = ((Number) pair.first).intValue();
            return ((C2UU) this.A02.get(intValue)).onCreateViewHolder(viewGroup, ((Number) pair.second).intValue());
        }
        throw new IllegalStateException(AnonymousClass001.A0O("cannot find subadapter for view type: ", i));
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C2UU) it.next()).onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // X.C2UU
    public final void setHasStableIds(boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C2UU) it.next()).setHasStableIds(z);
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1260411039);
        int i = this.A01;
        C0f9.A0A(-443039973, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int i2;
        int A03 = C0f9.A03(-834681050);
        int A00 = C9KI.A00(this, i);
        C2UU c2uu = (C2UU) this.A02.get(A00);
        if (A00 == 0) {
            i2 = 0;
        } else {
            i2 = this.A00[A00 - 1];
        }
        long itemId = c2uu.getItemId(i - i2);
        C0f9.A0A(-1714403457, A03);
        return itemId;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(836788717);
        int i2 = 0;
        int i3 = i;
        while (true) {
            List list = this.A02;
            if (i2 < list.size()) {
                C2UU c2uu = (C2UU) list.get(i2);
                if (i3 < c2uu.getItemCount()) {
                    int itemViewType = c2uu.getItemViewType(i3);
                    int hashCode = c2uu.getClass().hashCode() + itemViewType;
                    Map map = this.A03;
                    Integer valueOf = Integer.valueOf(hashCode);
                    if (!map.containsKey(valueOf)) {
                        map.put(valueOf, new Pair(Integer.valueOf(i2), Integer.valueOf(itemViewType)));
                    }
                    C0f9.A0A(1075427456, A03);
                    return hashCode;
                }
                i3 -= c2uu.getItemCount();
                i2++;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AnonymousClass001.A0O("Sub-adapter position is out of range: ", i));
                C0f9.A0A(-910342266, A03);
                throw illegalArgumentException;
            }
        }
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        int A00 = C9KI.A00(this, i);
        C2UU c2uu = (C2UU) this.A02.get(A00);
        if (A00 == 0) {
            i2 = 0;
        } else {
            i2 = this.A00[A00 - 1];
        }
        c2uu.onBindViewHolder(c3oo, i - i2);
    }
}
