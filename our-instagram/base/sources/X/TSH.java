package X;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final class TSH implements Comparator {
    public final /* synthetic */ T4F A00;
    public final /* synthetic */ String A01;

    public TSH(T4F t4f, String str) {
        this.A00 = t4f;
        this.A01 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r1.equals("meta.dav1d.av1.decoder") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(X.C2IG r7) {
        /*
            r6 = this;
            X.T4F r3 = r6.A00
            boolean r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r0 = r7.A07
            if (r0 == 0) goto Lc
            r1 = 1
        Lc:
            java.lang.String r2 = r6.A01
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L45
            boolean r5 = r3.A02
            boolean r2 = r3.A00
            java.lang.String r1 = r7.A03
            r4 = 0
            r0 = 4049(0xfd1, float:5.674E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.equals(r0)
            boolean r3 = X.AbstractC167007dF.A1M(r0)
            if (r2 == 0) goto L37
            java.lang.String r0 = "meta.dav1d.av1.decoder"
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L38
        L37:
            r2 = 0
        L38:
            boolean r0 = r7.A07
            r1 = 3
            if (r0 == 0) goto L3e
            r1 = 0
        L3e:
            if (r5 == r3) goto L41
            r4 = 2
        L41:
            int r1 = r1 + r4
            r0 = r2 ^ 1
            int r1 = r1 + r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TSH.A00(X.2IG):int");
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((C2IG) obj) - A00((C2IG) obj2);
    }
}
