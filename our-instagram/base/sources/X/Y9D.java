package X;

import java.util.List;

/* loaded from: classes12.dex */
public final class Y9D implements YNU {
    public final List A00 = AbstractC166987dD.A1E();
    public final int A01;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r3.hasNext() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (((X.YNU) r3.next()).CYd(0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000b, code lost:
    
        if (r5 == 2) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r3.hasNext() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((X.YNU) r3.next()).CYd(0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        return true;
     */
    @Override // X.YNU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CYd(long r7) {
        /*
            r6 = this;
            r1 = 0
            int r5 = r6.A01
            r4 = 2
            java.util.List r0 = r6.A00
            java.util.Iterator r3 = r0.iterator()
            if (r5 != r4) goto L21
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            X.YNU r0 = (X.YNU) r0
            boolean r0 = r0.CYd(r1)
            if (r0 == 0) goto Ld
        L1f:
            r0 = 1
            return r0
        L21:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.next()
            X.YNU r0 = (X.YNU) r0
            boolean r0 = r0.CYd(r1)
            if (r0 != 0) goto L21
        L33:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y9D.CYd(long):boolean");
    }

    public Y9D(int i) {
        this.A01 = i;
    }
}
