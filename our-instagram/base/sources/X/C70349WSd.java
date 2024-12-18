package X;

/* renamed from: X.WSd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70349WSd implements XE2 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C70130W5r A04;
    public XG2 A05;
    public String A06;
    public boolean A07;
    public int A08;
    public final int A09;
    public final WFZ A0A;
    public final String A0B;
    public final WFa A0C;

    @Override // X.XE2
    public final void E3B(boolean z) {
    }

    @Override // X.XE2
    public final void EMb() {
        this.A08 = 0;
        this.A00 = 0;
        this.A07 = false;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x017e, code lost:
    
        r18.A08 = 1;
        r1 = r18.A0C.A02;
        r1[0] = -84;
        r0 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x018a, code lost:
    
        if (r5 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x018c, code lost:
    
        r0 = 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x018e, code lost:
    
        r1[1] = (byte) r0;
        r18.A00 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r5.A04(2) == 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        r5.A04(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        if (r5.A0C() != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        r14 = r5.A04(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r5.A0C() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ad, code lost:
    
        if (r5.A04(3) <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00af, code lost:
    
        r5.A08(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b2, code lost:
    
        r10 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r5.A0C() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        r10 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
    
        r7 = r5.A04(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c8, code lost:
    
        if (r10 != 44100) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cc, code lost:
    
        if (r7 != 13) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        r5 = X.AbstractC70001VzL.A00[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d2, code lost:
    
        r3 = r18.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d6, code lost:
    
        if (r3 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00da, code lost:
    
        if (2 != r3.A06) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00de, code lost:
    
        if (r10 != r3.A0I) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e6, code lost:
    
        if ("audio/ac4".equals(r3.A0Y) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010c, code lost:
    
        r18.A01 = r13;
        r18.A02 = (r5 * 1000000) / r18.A04.A0I;
        r9.A0O(0);
        r18.A05.ELL(r9, 16);
        r18.A08 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e8, code lost:
    
        r3 = new X.C70116W4o();
        r3.A0T = r18.A06;
        r3.A00("audio/ac4");
        r3.A04 = 2;
        r3.A0G = r10;
        r3.A0V = r18.A0B;
        r3.A0E = r18.A09;
        r1 = new X.C70130W5r(r3);
        r18.A04 = r1;
        r18.A05.AWZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0152, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0127, code lost:
    
        if (r10 != 48000) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0129, code lost:
    
        r1 = X.AbstractC70001VzL.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012d, code lost:
    
        if (r7 >= 14) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012f, code lost:
    
        r5 = r1[r7];
        r3 = r14 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
    
        if (r3 == 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
    
        if (r3 == 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013b, code lost:
    
        if (r3 == 3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013d, code lost:
    
        if (r3 != 4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013f, code lost:
    
        if (r7 == 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0141, code lost:
    
        if (r7 == 8) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0143, code lost:
    
        if (r7 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0145, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0148, code lost:
    
        if (r7 == 8) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014a, code lost:
    
        if (r7 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        if (r7 == 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014f, code lost:
    
        if (r7 != 8) goto L39;
     */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r19) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70349WSd.AJY(X.WFa):void");
    }

    public C70349WSd(String str, int i) {
        WFZ wfz = new WFZ(new byte[16]);
        this.A0A = wfz;
        this.A0C = new WFa(wfz.A03);
        this.A08 = 0;
        this.A00 = 0;
        this.A07 = false;
        this.A03 = -9223372036854775807L;
        this.A0B = str;
        this.A09 = i;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A06 = w4q.A01;
        W4Q.A00(w4q);
        this.A05 = interfaceC72026XFo.F87(w4q.A00, 1);
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A03 = j;
    }

    public C70349WSd() {
        this(null, 0);
    }
}
