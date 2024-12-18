package X;

/* loaded from: classes5.dex */
public final class D42 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D42(ELF elf, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A02 = 6;
        this.A03 = elf;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        Object obj;
        Object obj2;
        int i;
        switch (this.A02) {
            case 0:
                obj = this.A03;
                obj2 = this.A01;
                i = 0;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            case 1:
                obj = this.A03;
                obj2 = this.A01;
                i = 1;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            case 2:
                obj = this.A03;
                obj2 = this.A01;
                i = 2;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            case 3:
                return new D42(this.A03, this.A01, interfaceC23621Ds, 3);
            case 4:
                obj = this.A03;
                obj2 = this.A01;
                i = 4;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            case 5:
                obj = this.A03;
                obj2 = this.A01;
                i = 5;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            case 6:
                return new D42((ELF) this.A03, interfaceC23621Ds);
            case 7:
                obj = this.A03;
                obj2 = this.A01;
                i = 7;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            case 8:
                obj = this.A03;
                obj2 = this.A01;
                i = 8;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            case 9:
                obj = this.A03;
                obj2 = this.A01;
                i = 9;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            case 10:
                obj = this.A03;
                obj2 = this.A01;
                i = 10;
                return new D42(obj, obj2, interfaceC23621Ds, i);
            default:
                obj = this.A03;
                obj2 = this.A01;
                i = 11;
                return new D42(obj, obj2, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((D42) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036e A[LOOP:3: B:102:0x0368->B:104:0x036e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x024f A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D42.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D42(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(1, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = obj2;
    }
}
