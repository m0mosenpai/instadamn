package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.DxW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31773DxW extends Filter {
    public final C195248kQ A00 = new C2EN();
    public final FIY A01;
    public final InterfaceC169497hP A02;

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int length;
        C14360o3.A0B(charSequence, 0);
        String A01 = AbstractC13670mt.A01(charSequence);
        if (A01 != null && (length = A01.length()) != 0) {
            LinkedHashSet A0l = AbstractC31171DnF.A0l();
            C195248kQ c195248kQ = this.A00;
            if (length > 0) {
                Collection collection = c195248kQ.A01[Character.toLowerCase(A01.charAt(0)) % 30];
                if (collection != null) {
                    AbstractC169147gn.A00(null, A01, collection, A0l);
                }
            }
            ArrayList A1F = AbstractC166987dD.A1F(A0l);
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = A1F;
            filterResults.count = A1F.size();
            return filterResults;
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        ArrayList A00 = this.A01.A00.A00();
        filterResults2.count = A00.size();
        filterResults2.values = A00;
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        C14360o3.A0B(charSequence, 0);
        String A01 = AbstractC13670mt.A01(charSequence);
        if (A01 != null) {
            if (A01.length() != 0 && filterResults != null && (obj = filterResults.values) != null) {
                FIY fiy = this.A01;
                C14360o3.A0C(obj, MSV.A00(1455));
                List list = (List) obj;
                C14360o3.A0B(list, 0);
                C35783FrL c35783FrL = fiy.A00;
                String str = fiy.A01;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC31178DnM.A1V(A0q, it);
                }
                c35783FrL.A01();
                c35783FrL.A04(str, A0q);
            }
            List list2 = this.A02.BjP(A01).A06;
            if (list2 != null) {
                FIY fiy2 = this.A01;
                C35783FrL c35783FrL2 = fiy2.A00;
                Integer num = C05F.A01;
                C14360o3.A0B(num, 0);
                c35783FrL2.A00 = num;
                String str2 = fiy2.A01;
                ArrayList A0q2 = AbstractC167017dG.A0q(list2);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC31178DnM.A1V(A0q2, it2);
                }
                c35783FrL2.A04(str2, A0q2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8kQ, X.2EN] */
    public C31773DxW(FIY fiy, InterfaceC169497hP interfaceC169497hP) {
        this.A02 = interfaceC169497hP;
        this.A01 = fiy;
    }
}
