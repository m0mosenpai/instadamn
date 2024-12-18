package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DxV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31772DxV extends Filter {
    public final C33302Enx A00 = new C2EN();
    public final EQH A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Enx, X.2EN] */
    public C31772DxV(EQH eqh) {
        this.A01 = eqh;
        Iterator A0i = AbstractC31177DnL.A0i(eqh.A04);
        while (A0i.hasNext()) {
            this.A00.A02(A0i.next());
        }
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList A1E;
        int length;
        String A01 = AbstractC13670mt.A01(charSequence);
        if (TextUtils.isEmpty(A01)) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            List A19 = AbstractC31172DnG.A19(this.A01.A04);
            filterResults.count = A19.size();
            filterResults.values = A19;
            return filterResults;
        }
        if (A01 != null && (length = A01.length()) != 0) {
            C18C.A0E(AbstractC167007dF.A1O(length));
            HashSet A1H = AbstractC166987dD.A1H();
            java.util.Set set = (java.util.Set) this.A00.A01[Character.toLowerCase(A01.charAt(0)) % 30];
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                    String str = A0m.A0I;
                    String str2 = str;
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() != 0) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (AbstractC13670mt.A0I(str2, A01, 0)) {
                            A1H.add(A0m);
                        }
                    }
                    String str3 = A0m.A0J;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (str3.length() != 0 && AbstractC13670mt.A0H(str3, A01)) {
                        A1H.add(A0m);
                    }
                }
            }
            A1E = AbstractC166987dD.A1F(A1H);
        } else {
            A1E = AbstractC166987dD.A1E();
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = A1E;
        filterResults2.count = A1E.size();
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (!TextUtils.isEmpty(AbstractC13670mt.A01(charSequence)) && filterResults != null) {
            this.A01.A01((List) filterResults.values);
        }
    }
}
