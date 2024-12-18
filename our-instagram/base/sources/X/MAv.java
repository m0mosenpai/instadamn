package X;

/* loaded from: classes8.dex */
public final class MAv extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAv(Object obj, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = str4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                str3 = this.A04;
                str4 = this.A05;
                str2 = this.A06;
                str = this.A03;
                i = 0;
                break;
            case 1:
                str = this.A03;
                str2 = this.A06;
                str3 = this.A04;
                str4 = this.A05;
                i = 1;
                break;
            default:
                str = this.A03;
                str3 = this.A04;
                str2 = this.A06;
                str4 = this.A05;
                i = 2;
                break;
        }
        return new MAv(obj2, str3, str4, str2, str, interfaceC23621Ds, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d2, code lost:
    
        if (r0 != r1) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MAv) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
