package X;

/* loaded from: classes9.dex */
public final class PXE extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXE(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(1, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        Object obj;
        String str;
        int i;
        switch (this.A01) {
            case 0:
                obj = this.A02;
                str = this.A03;
                i = 0;
                return new PXE(obj, str, interfaceC23621Ds, i);
            case 1:
                obj = this.A02;
                str = this.A03;
                i = 1;
                return new PXE(obj, str, interfaceC23621Ds, i);
            case 2:
                obj = this.A02;
                str = this.A03;
                i = 2;
                return new PXE(obj, str, interfaceC23621Ds, i);
            case 3:
                return new PXE(this.A02, this.A03, interfaceC23621Ds, 3);
            case 4:
                obj = this.A02;
                str = this.A03;
                i = 4;
                return new PXE(obj, str, interfaceC23621Ds, i);
            case 5:
                obj = this.A02;
                str = this.A03;
                i = 5;
                return new PXE(obj, str, interfaceC23621Ds, i);
            default:
                obj = this.A02;
                str = this.A03;
                i = 6;
                return new PXE(obj, str, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((PXE) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
    
        if (r1 == 0) goto L77;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXE.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
