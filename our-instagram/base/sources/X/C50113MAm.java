package X;

/* renamed from: X.MAm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50113MAm extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50113MAm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50113MAm(Object obj, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A05 = str;
        this.A02 = j;
        this.A04 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        long j;
        String str;
        String str2;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A03;
        switch (i2) {
            case 0:
                str2 = this.A05;
                j = this.A02;
                str = this.A04;
                i = 0;
                break;
            case 1:
                j = this.A02;
                str = this.A04;
                str2 = this.A05;
                i = 1;
                break;
            default:
                j = this.A02;
                str = this.A04;
                str2 = this.A05;
                i = 2;
                break;
        }
        return new C50113MAm(obj2, str2, str, interfaceC23621Ds, i, j);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50113MAm) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
