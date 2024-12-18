package X;

/* renamed from: X.80v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1809380v implements InterfaceC179087xK, InterfaceC1809480w {
    public int A00;
    public InterfaceC180227zC A01;
    public C178907x2 A02;
    public AbstractC179397xp A03;
    public C195878lX A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public final C178747wm A09;
    public final InterfaceC179467xw A0A;
    public final InterfaceC179447xu A0B;
    public final C1809580x A0C;

    public C1809380v(C178747wm c178747wm, InterfaceC179447xu interfaceC179447xu, boolean z) {
        this(c178747wm, null, interfaceC179447xu, z, false);
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        this.A01 = null;
        InterfaceC179447xu interfaceC179447xu = this.A0B;
        if (interfaceC179447xu instanceof InterfaceC179087xK) {
            ((InterfaceC179087xK) interfaceC179447xu).detach();
        }
        C195878lX c195878lX = this.A04;
        if (c195878lX != null) {
            c195878lX.detach();
            ((C81E) this.A04).A01 = null;
            this.A04 = null;
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        this.A02 = null;
        InterfaceC179447xu interfaceC179447xu = this.A0B;
        if (interfaceC179447xu instanceof InterfaceC179087xK) {
            ((InterfaceC179087xK) interfaceC179447xu).release();
        }
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        this.A01 = interfaceC180227zC;
        InterfaceC179447xu interfaceC179447xu = this.A0B;
        if (interfaceC179447xu instanceof InterfaceC179087xK) {
            ((InterfaceC179087xK) interfaceC179447xu).ACv(interfaceC180227zC);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0226, code lost:
    
        if (r1.A00() != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0230, code lost:
    
        if (r8.A00() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x032b, code lost:
    
        if (r6 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0322, code lost:
    
        if (r7 != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0319, code lost:
    
        if (r8 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00b1, code lost:
    
        if (r2.A00 == r5.intValue()) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r0.A01 == 3553) goto L26;
     */
    @Override // X.InterfaceC1809480w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object BHx() {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1809380v.BHx():java.lang.Object");
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        this.A02 = c178907x2;
        InterfaceC179447xu interfaceC179447xu = this.A0B;
        if (interfaceC179447xu instanceof InterfaceC179087xK) {
            ((InterfaceC179087xK) interfaceC179447xu).CNk(c178907x2);
        }
    }

    public final void A00(AbstractC179397xp abstractC179397xp, int i, int i2) {
        this.A06 = Integer.valueOf(i);
        this.A05 = Integer.valueOf(i2);
        this.A03 = abstractC179397xp;
        this.A08 = true;
    }

    public C1809380v(C178747wm c178747wm, InterfaceC179447xu interfaceC179447xu) {
        this(c178747wm, null, interfaceC179447xu, true, false);
    }

    public C1809380v(C178747wm c178747wm, InterfaceC179467xw interfaceC179467xw, InterfaceC179447xu interfaceC179447xu, boolean z, boolean z2) {
        this.A09 = c178747wm;
        this.A0C = new C1809580x(c178747wm, z2);
        this.A0B = interfaceC179447xu;
        this.A0A = interfaceC179467xw;
        this.A07 = z;
        this.A00 = 0;
    }
}
