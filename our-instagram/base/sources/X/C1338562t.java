package X;

/* renamed from: X.62t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1338562t extends RuntimeException implements InterfaceC1338662u {
    public final InterfaceC102974kY A00;
    public final C6W5 A01;

    public C1338562t(C6W5 c6w5) {
        super(c6w5);
        this.A00 = null;
        this.A01 = c6w5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r2.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r3.booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r5.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r2 != null) goto L17;
     */
    @Override // X.InterfaceC1338662u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Agc() {
        /*
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.6W5 r0 = r6.A01
            java.lang.String r1 = r0.A00
            r0 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            if (r1 == 0) goto L3e
            java.lang.String r0 = "\n"
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.addAll(r0)
            r0 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L22:
            X.4kY r0 = r6.A00
            if (r0 == 0) goto L5c
            r2 = 0
        L27:
            X.SOW r1 = r0.Agb()
            if (r1 == 0) goto L40
            if (r2 != 0) goto L34
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L34:
            java.lang.String r0 = r1.A01
            r2.add(r0)
            X.4kY r0 = r1.A00
            if (r0 == 0) goto L42
            goto L27
        L3e:
            r3 = r4
            goto L22
        L40:
            if (r2 == 0) goto L5c
        L42:
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L5a
            r5.add(r1)
            goto L46
        L5a:
            r3 = r4
            goto L46
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338562t.Agc():java.util.List");
    }

    @Override // X.InterfaceC1338662u
    public final String B2q() {
        return this.A01.getMessage();
    }

    @Override // X.InterfaceC1338662u
    public final String BOp() {
        InterfaceC102974kY interfaceC102974kY = this.A00;
        if (interfaceC102974kY == null) {
            return null;
        }
        return interfaceC102974kY.BOp();
    }

    @Override // X.InterfaceC1338662u
    public final Throwable BWA() {
        return this.A01.getCause();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1338562t(X.InterfaceC102974kY r2, X.C1338562t r3) {
        /*
            r1 = this;
            X.6W5 r0 = r3.A01
            r1.<init>(r0)
            r1.A00 = r2
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338562t.<init>(X.4kY, X.62t):void");
    }
}
