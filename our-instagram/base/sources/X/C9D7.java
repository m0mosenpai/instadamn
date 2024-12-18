package X;

/* renamed from: X.9D7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9D7 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D7(C6GY c6gy, C5E0 c5e0, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A03 = 0;
        this.A02 = c6gy;
        this.A01 = j;
        this.A04 = c5e0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        long j;
        int i;
        switch (this.A03) {
            case 0:
                return new C9D7((C6GY) this.A02, (C5E0) this.A04, interfaceC23621Ds, this.A01);
            case 1:
                return new C9D7((EnumC190238bh) this.A02, (C190288bm) this.A04, interfaceC23621Ds);
            case 2:
                obj2 = this.A04;
                j = this.A01;
                i = 2;
                C9D7 c9d7 = new C9D7(obj2, interfaceC23621Ds, i, j);
                c9d7.A02 = obj;
                return c9d7;
            default:
                j = this.A01;
                obj2 = this.A04;
                i = 3;
                C9D7 c9d72 = new C9D7(obj2, interfaceC23621Ds, i, j);
                c9d72.A02 = obj;
                return c9d72;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9D7) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9D7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D7(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = j;
        this.A04 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D7(EnumC190238bh enumC190238bh, C190288bm c190288bm, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = 1;
        this.A04 = c190288bm;
        this.A02 = enumC190238bh;
    }
}
