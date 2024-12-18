package X;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.DxX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31774DxX extends Filter {
    public final FH0 A00;
    public final /* synthetic */ C31771DxS A01;

    public static String A00(InterfaceC37225Gaa interfaceC37225Gaa, String str) {
        if (str != null) {
            try {
                String A01 = A01(interfaceC37225Gaa.Bck());
                int length = str.length();
                boolean z = false;
                if (length <= A01.length()) {
                    if (length >= 3) {
                        AbstractC13670mt.A0F(A01, str);
                    }
                    z = AbstractC13670mt.A0F(A01, str);
                }
                if (z) {
                    return interfaceC37225Gaa.Bck();
                }
                String A012 = A01(interfaceC37225Gaa.B1C());
                boolean z2 = false;
                if (length <= A012.length()) {
                    if (length >= 3) {
                        AbstractC13670mt.A0F(A012, str);
                    }
                    z2 = AbstractC13670mt.A0F(A012, str);
                }
                if (z2) {
                    return interfaceC37225Gaa.B1C();
                }
                String A013 = A01(interfaceC37225Gaa.getUsername());
                boolean z3 = false;
                if (length <= A013.length()) {
                    if (length >= 3) {
                        AbstractC13670mt.A0F(A013, str);
                    }
                    z3 = AbstractC13670mt.A0F(A013, str);
                }
                if (z3) {
                    if (interfaceC37225Gaa.EJP()) {
                        return interfaceC37225Gaa.getFullName();
                    }
                    return interfaceC37225Gaa.getUsername();
                }
            } catch (RuntimeException e) {
                C0w9.A03("Auto Complete User Adapter Subsequence Match", e.toString());
            }
        }
        return null;
    }

    public C31774DxX(FH0 fh0, C31771DxS c31771DxS) {
        this.A01 = c31771DxS;
        this.A00 = fh0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r7.A07.CPH(r2.getUserId()) != false) goto L23;
     */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r9) {
        /*
            r8 = this;
            android.widget.Filter$FilterResults r6 = new android.widget.Filter$FilterResults
            r6.<init>()
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L1c
            X.DxS r7 = r8.A01
            monitor-enter(r7)
            java.util.List r0 = r7.A09     // Catch: java.lang.Throwable -> L19
            r5.addAll(r0)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L19
            goto L58
        L19:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L19
            throw r0
        L1c:
            java.lang.String r0 = r9.toString()
            java.lang.String r4 = A01(r0)
            X.DxS r7 = r8.A01
            monitor-enter(r7)
            java.util.List r0 = r7.A09     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L66
        L2d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L57
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L66
            X.Gaa r2 = (X.InterfaceC37225Gaa) r2     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = A00(r2, r4)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L50
            boolean r0 = r7.A02     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L50
            X.0Bo r1 = r7.A07     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r2.getUserId()     // Catch: java.lang.Throwable -> L66
            boolean r1 = r1.CPH(r0)     // Catch: java.lang.Throwable -> L66
            r0 = 1
            if (r1 == 0) goto L51
        L50:
            r0 = 0
        L51:
            if (r0 == 0) goto L2d
            r5.add(r2)     // Catch: java.lang.Throwable -> L66
            goto L2d
        L57:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
        L58:
            java.util.Comparator r0 = r7.A08
            java.util.Collections.sort(r5, r0)
            int r0 = r5.size()
            r6.count = r0
            r6.values = r5
            return r6
        L66:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31774DxX.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        C31771DxS c31771DxS = this.A01;
        Object obj = filterResults.values;
        if (obj == null) {
            list = Collections.emptyList();
        } else {
            list = (List) obj;
        }
        c31771DxS.A01 = list;
        if (charSequence == null) {
            charSequence = "";
        }
        c31771DxS.A00 = charSequence;
        if (!list.isEmpty()) {
            C0fA.A00(c31771DxS, -748582001);
        } else {
            C0fA.A01(c31771DxS, -308373175);
        }
    }

    public static String A01(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        return charSequence.toString().toLowerCase(Locale.US);
    }
}
