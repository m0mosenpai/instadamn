package X;

import android.widget.Filter;
import java.util.Collection;

/* loaded from: classes10.dex */
public final class Q54 extends Filter {
    public final /* synthetic */ C58721Q4x A00;

    public Q54(C58721Q4x c58721Q4x) {
        this.A00 = c58721Q4x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r6 != null) goto L6;
     */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r8) {
        /*
            r7 = this;
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r8 == 0) goto L61
            java.lang.String r1 = r8.toString()
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.C14360o3.A07(r0)
            java.lang.String r0 = X.AbstractC31172DnG.A16(r0, r1)
            java.lang.String r6 = X.AbstractC25228BEl.A1A(r0)
            if (r6 == 0) goto L64
        L1c:
            int r0 = r6.length()
            if (r0 == 0) goto L64
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            X.Q4x r0 = r7.A00
            java.util.ArrayList r0 = r0.A01
            java.util.Iterator r3 = X.AbstractC166997dE.A13(r0)
        L2e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r2 = X.AbstractC166997dE.A0l(r3)
            com.instagram.direct.appwidget.DirectThreadWidgetItem r2 = (com.instagram.direct.appwidget.DirectThreadWidgetItem) r2
            java.lang.String r0 = r2.A04
            if (r0 != 0) goto L40
            java.lang.String r0 = ""
        L40:
            java.lang.String r0 = r0.toLowerCase()
            X.C14360o3.A07(r0)
            r1 = 0
            boolean r0 = X.AbstractC001900j.A0a(r0, r6, r1)
            if (r0 != 0) goto L5d
            java.lang.String r0 = r2.A05
            java.lang.String r0 = r0.toLowerCase()
            X.C14360o3.A07(r0)
            boolean r0 = X.AbstractC001900j.A0a(r0, r6, r1)
            if (r0 == 0) goto L2e
        L5d:
            r5.add(r2)
            goto L2e
        L61:
            java.lang.String r6 = ""
            goto L1c
        L64:
            X.Q4x r0 = r7.A00
            java.util.ArrayList r5 = r0.A01
        L68:
            r4.values = r5
            int r0 = r5.size()
            r4.count = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q54.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        if (filterResults != null) {
            obj = filterResults.values;
        } else {
            obj = null;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.appwidget.DirectThreadWidgetItem>");
        C58721Q4x c58721Q4x = this.A00;
        c58721Q4x.clear();
        c58721Q4x.addAll((Collection) obj);
    }
}
