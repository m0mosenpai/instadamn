package X;

/* renamed from: X.9DJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DJ extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DJ(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        int i;
        switch (this.A01) {
            case 0:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                z = this.A05;
                i = 0;
                break;
            case 1:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                z = this.A05;
                i = 1;
                break;
            case 2:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                z = this.A05;
                i = 2;
                break;
            case 3:
                obj3 = this.A03;
                obj4 = this.A04;
                obj2 = this.A02;
                z = this.A05;
                i = 3;
                break;
            case 4:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                z = this.A05;
                i = 4;
                break;
            case 5:
                obj2 = this.A02;
                obj3 = this.A03;
                z = this.A05;
                obj4 = this.A04;
                i = 5;
                break;
            default:
                obj4 = this.A04;
                z = this.A05;
                obj2 = this.A02;
                obj3 = this.A03;
                i = 6;
                break;
        }
        return new C9DJ(obj4, obj3, obj2, interfaceC23621Ds, i, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DJ) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0120, code lost:
    
        r0 = ((X.C65890Tvu) r3.get(r12)).A05;
        r12 = r12 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
