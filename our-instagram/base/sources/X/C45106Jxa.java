package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jxa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45106Jxa extends C0T6 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final ArrayList A03;
    public final List A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45106Jxa) {
                C45106Jxa c45106Jxa = (C45106Jxa) obj;
                if (!C14360o3.A0K(this.A04, c45106Jxa.A04) || !C14360o3.A0K(this.A02, c45106Jxa.A02) || this.A05 != c45106Jxa.A05 || this.A00 != c45106Jxa.A00 || !C14360o3.A0K(this.A03, c45106Jxa.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00(String str) {
        Iterator it = this.A04.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C14360o3.A0K(((C48310LZj) it.next()).A03, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            return null;
        }
        return valueOf;
    }

    public final List A01() {
        ArrayList arrayList = this.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C48310LZj c48310LZj = (C48310LZj) AbstractC001800i.A0O(this.A04, AbstractC167007dF.A0B(it));
            if (c48310LZj != null) {
                A1E.add(c48310LZj.A03);
            }
        }
        return A1E;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A04))) + this.A00) * 31);
    }

    public C45106Jxa(String str, ArrayList arrayList, List list, int i, boolean z) {
        this.A04 = list;
        this.A02 = str;
        this.A05 = z;
        this.A00 = i;
        this.A03 = arrayList;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int A0H = AbstractC166987dD.A0H(next);
            if (A0H >= 0 && A0H < this.A04.size()) {
                A1E.add(next);
            }
        }
        this.A01 = A1E.size();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45106Jxa() {
        /*
            r6 = this;
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.lang.String r1 = "0"
            r4 = 1
            r0 = 0
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            X.AbstractC166997dE.A1W(r2, r0)
            r0 = r6
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45106Jxa.<init>():void");
    }
}
