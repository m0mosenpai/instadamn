package X;

/* renamed from: X.BoQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26567BoQ extends AbstractC51572Yf {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C51722Yv A03;
    public final C93E A04;
    public final C88 A05;
    public final CharSequence A06;
    public final Integer A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C26567BoQ(X.C51722Yv r13, X.C93E r14, X.C88 r15, java.lang.CharSequence r16, java.lang.Integer r17, int r18, int r19) {
        /*
            r12 = this;
            r1 = r19
            r2 = r13
            r3 = r14
            r7 = r18
            r0 = r19 & 8
            if (r0 == 0) goto Lb
            r7 = 0
        Lb:
            r0 = r19 & 16
            if (r0 == 0) goto L11
            X.93E r3 = X.C93E.TEXT_START
        L11:
            r0 = r19 & 32
            if (r0 == 0) goto L33
            long r8 = X.AbstractC25230BEn.A0M()
        L19:
            r0 = r19 & 64
            if (r0 == 0) goto L30
            long r10 = X.AbstractC25230BEn.A0M()
        L21:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L26
            r2 = 0
        L26:
            r1 = r12
            r4 = r15
            r5 = r16
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
            return
        L30:
            r10 = 0
            goto L21
        L33:
            r8 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26567BoQ.<init>(X.2Yv, X.93E, X.C88, java.lang.CharSequence, java.lang.Integer, int, int):void");
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        CharSequence charSequence = this.A06;
        C29473Cyn c29473Cyn = new C29473Cyn(this.A05, this.A07);
        int i = this.A00;
        return new C26471Bms(this.A03, this.A04, C93G.TOP, c29473Cyn, new C3F(this.A02, this.A01), charSequence, i);
    }

    public C26567BoQ(C51722Yv c51722Yv, C93E c93e, C88 c88, CharSequence charSequence, Integer num, int i, long j, long j2) {
        AbstractC167027dH.A13(charSequence, num, c88);
        C14360o3.A0B(c93e, 5);
        this.A06 = charSequence;
        this.A07 = num;
        this.A05 = c88;
        this.A00 = i;
        this.A04 = c93e;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = c51722Yv;
    }
}
