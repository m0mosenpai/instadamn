package X;

/* loaded from: classes8.dex */
public final class MBc extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBc(InterfaceC50390MMs interfaceC50390MMs, C44553Jmz c44553Jmz, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = 0;
        this.A01 = interfaceC50390MMs;
        this.A03 = c44553Jmz;
        this.A05 = str;
        this.A06 = z;
        this.A04 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        String str2;
        boolean z;
        int i;
        switch (this.A02) {
            case 0:
                return new MBc((InterfaceC50390MMs) this.A01, (C44553Jmz) this.A03, this.A05, this.A04, interfaceC23621Ds, this.A06);
            case 1:
                obj2 = this.A03;
                str = this.A05;
                str2 = this.A04;
                z = this.A06;
                i = 1;
                MBc mBc = new MBc(obj2, str, str2, interfaceC23621Ds, i, z);
                mBc.A01 = obj;
                return mBc;
            default:
                obj2 = this.A03;
                str = this.A05;
                z = this.A06;
                str2 = this.A04;
                i = 2;
                MBc mBc2 = new MBc(obj2, str, str2, interfaceC23621Ds, i, z);
                mBc2.A01 = obj;
                return mBc2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0367, code lost:
    
        if (r1 == r7) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03cf, code lost:
    
        if (r27.A06 != false) goto L143;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBc) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBc(Object obj, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = z;
    }
}
