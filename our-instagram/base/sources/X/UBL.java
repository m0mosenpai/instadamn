package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UBL extends Filter {
    public final /* synthetic */ C67917V2h A00;

    public UBL(C67917V2h c67917V2h) {
        this.A00 = c67917V2h;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(2);
        if (!TextUtils.isEmpty(charSequence)) {
            C67917V2h c67917V2h = this.A00;
            synchronized (c67917V2h) {
                for (Hashtag hashtag : c67917V2h.A03) {
                    if (hashtag.getName() != null && hashtag.getName().contains(charSequence)) {
                        arrayList.add(hashtag);
                    }
                }
                for (Hashtag hashtag2 : c67917V2h.A04) {
                    if (hashtag2.getName() != null && hashtag2.getName().contains(charSequence)) {
                        arrayList2.add(hashtag2);
                    }
                }
            }
        }
        arrayList3.add(0, arrayList);
        arrayList3.add(1, arrayList2);
        filterResults.count = arrayList.size() + arrayList2.size();
        filterResults.values = arrayList3;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C67917V2h c67917V2h = this.A00;
        c67917V2h.A00 = charSequence;
        c67917V2h.A01 = (List) AbstractC166987dD.A16((List) filterResults.values);
        c67917V2h.A02 = (List) ((List) filterResults.values).get(1);
        List list = c67917V2h.A01;
        if (list != null) {
            if (list.isEmpty() && TextUtils.isEmpty(charSequence)) {
                C67917V2h.A00(c67917V2h);
                return;
            }
            List list2 = c67917V2h.A01;
            List list3 = c67917V2h.A02;
            c67917V2h.A07 = true;
            List list4 = c67917V2h.A03;
            ArrayList arrayList = new ArrayList();
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                AbstractC58318PtA.A1W(arrayList, it);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            List list5 = c67917V2h.A04;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                AbstractC58318PtA.A1W(arrayList3, it2);
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            c67917V2h.A06();
            c67917V2h.A03.clear();
            c67917V2h.A03.addAll(list2);
            c67917V2h.A04.clear();
            c67917V2h.A04.addAll(list3);
            C67917V2h.A00(c67917V2h);
            c67917V2h.A03 = arrayList2;
            c67917V2h.A04 = arrayList4;
        }
    }
}
