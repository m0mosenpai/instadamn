package X;

/* renamed from: X.PXa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57148PXa extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57148PXa(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        int i;
        int i2 = this.A01;
        Object obj3 = this.A03;
        switch (i2) {
            case 0:
                obj2 = this.A02;
                str = this.A04;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                str = this.A04;
                i = 1;
                break;
            case 2:
                str = this.A04;
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                str = this.A04;
                obj2 = this.A02;
                i = 3;
                break;
            case 4:
                str = this.A04;
                obj2 = this.A02;
                i = 4;
                break;
            case 5:
                str = this.A04;
                obj2 = this.A02;
                i = 5;
                break;
            case 6:
                obj2 = this.A02;
                str = this.A04;
                i = 6;
                break;
            default:
                str = this.A04;
                obj2 = this.A02;
                i = 7;
                break;
        }
        return new C57148PXa(obj3, obj2, str, interfaceC23621Ds, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c9 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57148PXa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57148PXa) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
