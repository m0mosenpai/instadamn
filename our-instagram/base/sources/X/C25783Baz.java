package X;

/* renamed from: X.Baz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25783Baz extends AbstractC28843CoD {
    public static C25783Baz A00;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r6 < r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r2 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r2 >= r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r2 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (A02().charAt(r2 - 1) == '\n') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r2 == X.AbstractC28843CoD.A01(r5)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (A02().charAt(r2) != '\n') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        return A03(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x000c, code lost:
    
        if (r6 >= r3) goto L14;
     */
    @Override // X.InterfaceC30987Djj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] AWL(int r6) {
        /*
            r5 = this;
            int r3 = X.AbstractC28843CoD.A01(r5)
            r4 = 0
            if (r3 <= 0) goto L33
            if (r6 >= r3) goto L33
            if (r6 >= 0) goto L36
            r6 = 0
        Lc:
            java.lang.String r0 = r5.A02()
            char r0 = r0.charAt(r6)
            r2 = 10
            if (r0 != r2) goto L31
            java.lang.String r0 = r5.A02()
            char r1 = r0.charAt(r6)
            r0 = 1
            if (r1 == r2) goto L34
            if (r6 == 0) goto L39
            java.lang.String r1 = r5.A02()
            int r0 = r6 - r0
            char r0 = r1.charAt(r0)
            if (r0 != r2) goto L34
        L31:
            if (r6 < r3) goto L39
        L33:
            return r4
        L34:
            int r6 = r6 + 1
        L36:
            if (r6 >= r3) goto L31
            goto Lc
        L39:
            int r2 = r6 + 1
        L3b:
            if (r2 >= r3) goto L5d
            if (r2 <= 0) goto L62
            java.lang.String r1 = r5.A02()
            int r0 = r2 + (-1)
            char r0 = r1.charAt(r0)
            r1 = 10
            if (r0 == r1) goto L62
            int r0 = X.AbstractC28843CoD.A01(r5)
            if (r2 == r0) goto L5d
            java.lang.String r0 = r5.A02()
            char r0 = r0.charAt(r2)
            if (r0 != r1) goto L62
        L5d:
            int[] r0 = r5.A03(r6, r2)
            return r0
        L62:
            int r2 = r2 + 1
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25783Baz.AWL(int):int[]");
    }

    @Override // X.InterfaceC30987Djj
    public final int[] E56(int i) {
        int i2;
        int A01 = AbstractC28843CoD.A01(this);
        if (A01 > 0 && i > 0) {
            if (i > A01) {
                i = A01;
            }
            do {
                i2 = i - 1;
                if (A02().charAt(i2) != '\n' || (i > 0 && A02().charAt(i2) != '\n' && (i == AbstractC28843CoD.A01(this) || A02().charAt(i) == '\n'))) {
                    while (i2 > 0 && (A02().charAt(i2) == '\n' || A02().charAt(i2 - 1) != '\n')) {
                        i2--;
                    }
                    return A03(i2, i);
                }
                i = i2;
            } while (i2 > 0);
        }
        return null;
    }
}
