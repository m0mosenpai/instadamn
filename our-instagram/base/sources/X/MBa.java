package X;

/* loaded from: classes8.dex */
public final class MBa extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBa(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A05 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        String str;
        boolean z;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                obj3 = this.A01;
                str = this.A04;
                z = this.A05;
                i = 0;
                break;
            case 1:
                obj2 = this.A03;
                str = this.A04;
                z = this.A05;
                obj3 = this.A01;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                str = this.A04;
                z = this.A05;
                obj3 = this.A01;
                i = 2;
                break;
            case 3:
                obj2 = this.A03;
                str = this.A04;
                obj3 = this.A01;
                z = this.A05;
                i = 3;
                break;
            case 4:
                obj2 = this.A03;
                obj3 = this.A01;
                str = this.A04;
                z = this.A05;
                i = 4;
                break;
            case 5:
                obj3 = this.A01;
                obj2 = this.A03;
                str = this.A04;
                z = this.A05;
                i = 5;
                break;
            case 6:
                obj2 = this.A03;
                obj3 = this.A01;
                str = this.A04;
                z = this.A05;
                i = 6;
                break;
            default:
                MBa mBa = new MBa((O6J) this.A03, this.A04, interfaceC23621Ds, this.A05);
                mBa.A01 = obj;
                return mBa;
        }
        return new MBa(obj2, obj3, str, interfaceC23621Ds, i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x025a, code lost:
    
        if (r0 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025c, code lost:
    
        r3 = r4.getValue();
        r0 = (X.C38688GzT) r3;
        r2 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0275, code lost:
    
        if (r4.AIi(r3, X.C38688GzT.A02((X.C7IM) r0.A03, (java.lang.Integer) r0.A00, r2, r5)) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x027a, code lost:
    
        r3 = r4.getValue();
        r0 = (X.C38688GzT) r3;
        r2 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0293, code lost:
    
        if (r4.AIi(r3, X.C38688GzT.A02((X.C7IM) r0.A03, (java.lang.Integer) r0.A00, r2, r5)) == false) goto L157;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020b A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBa) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBa(O6J o6j, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = 7;
        this.A03 = o6j;
        this.A04 = str;
        this.A05 = z;
    }
}
