package X;

/* renamed from: X.MAj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50111MAj extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50111MAj(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = j;
        this.A04 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        long j;
        String str;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A03;
        switch (i2) {
            case 0:
                str = this.A04;
                j = this.A02;
                i = 0;
                break;
            case 1:
                j = this.A02;
                str = this.A04;
                i = 1;
                break;
            case 2:
                j = this.A02;
                str = this.A04;
                i = 2;
                break;
            case 3:
                j = this.A02;
                str = this.A04;
                i = 3;
                break;
            default:
                str = this.A04;
                j = this.A02;
                i = 4;
                break;
        }
        return new C50111MAj(obj2, str, interfaceC23621Ds, i, j);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50111MAj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50111MAj) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
