package X;

/* renamed from: X.0tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17640tz {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final C0JO A04;
    public final C17630ty A05;
    public final C17630ty A06;
    public final C17630ty A07;
    public final C17630ty A08;

    private void A00(long j) {
        C17630ty c17630ty = this.A05;
        long A00 = c17630ty.A00(j);
        c17630ty.A01 = 0L;
        this.A00 = Math.max(A00, this.A00);
        C17630ty c17630ty2 = this.A06;
        long A002 = c17630ty2.A00(j);
        c17630ty2.A01 = 0L;
        this.A01 = Math.max(A002, this.A01);
        C17630ty c17630ty3 = this.A07;
        long A003 = c17630ty3.A00(j);
        c17630ty3.A01 = 0L;
        this.A02 = Math.max(A003, this.A02);
        C17630ty c17630ty4 = this.A08;
        long A004 = c17630ty4.A00(j);
        c17630ty4.A01 = 0L;
        this.A03 = Math.max(A004, this.A03);
    }

    public final long A01() {
        return Math.max(this.A07.A00(this.A04.now()), this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r1 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(float r5, long r6) {
        /*
            r4 = this;
            X.0ty r0 = r4.A05
            boolean r1 = r0.A01(r5, r6)
            X.0ty r0 = r4.A06
            boolean r0 = r0.A01(r5, r6)
            r3 = 0
            if (r0 != 0) goto L12
            r2 = 0
            if (r1 == 0) goto L13
        L12:
            r2 = 1
        L13:
            X.0ty r0 = r4.A07
            boolean r0 = r0.A01(r5, r6)
            if (r0 != 0) goto L1e
            r1 = 0
            if (r2 == 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            X.0ty r0 = r4.A08
            boolean r0 = r0.A01(r5, r6)
            if (r0 != 0) goto L29
            if (r1 == 0) goto L2d
        L29:
            r3 = 1
            r4.A00(r6)
        L2d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17640tz.A02(float, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r1 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(long r5) {
        /*
            r4 = this;
            X.0ty r0 = r4.A05
            boolean r1 = r0.A02(r5)
            X.0ty r0 = r4.A06
            boolean r0 = r0.A02(r5)
            r3 = 0
            if (r0 != 0) goto L12
            r2 = 0
            if (r1 == 0) goto L13
        L12:
            r2 = 1
        L13:
            X.0ty r0 = r4.A07
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L1e
            r1 = 0
            if (r2 == 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            X.0ty r0 = r4.A08
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L29
            if (r1 == 0) goto L2a
        L29:
            r3 = 1
        L2a:
            r4.A00(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17640tz.A03(long):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeenStateTimeInfo{mPhoto10ViewedDuration=");
        sb.append(this.A00);
        sb.append(", mPhoto25ViewedDuration=");
        sb.append(this.A01);
        sb.append(", mPhoto50ViewedDuration=");
        sb.append(this.A02);
        sb.append(", mPhoto75ViewedDuration=");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }

    public C17640tz(C17640tz c17640tz) {
        this.A04 = c17640tz.A04;
        this.A00 = c17640tz.A00;
        this.A01 = c17640tz.A01;
        this.A02 = c17640tz.A02;
        this.A03 = c17640tz.A03;
        this.A05 = new C17630ty(c17640tz.A05);
        this.A06 = new C17630ty(c17640tz.A06);
        this.A07 = new C17630ty(c17640tz.A07);
        this.A08 = new C17630ty(c17640tz.A08);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ty, java.lang.Object] */
    public C17640tz() {
        this.A04 = AbstractC17620tx.A00();
        ?? obj = new Object();
        obj.A02 = -1L;
        obj.A00 = 0.1f;
        this.A05 = obj;
        ?? obj2 = new Object();
        obj2.A02 = -1L;
        obj2.A00 = 0.25f;
        this.A06 = obj2;
        ?? obj3 = new Object();
        obj3.A02 = -1L;
        obj3.A00 = 0.5f;
        this.A07 = obj3;
        ?? obj4 = new Object();
        obj4.A02 = -1L;
        obj4.A00 = 0.75f;
        this.A08 = obj4;
    }
}
