package X;

/* renamed from: X.9DZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DZ extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DZ(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        int i;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                str = this.A03;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                str = this.A03;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                str = this.A03;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                str = this.A03;
                i = 3;
                break;
            case 4:
                obj2 = this.A02;
                str = this.A03;
                i = 4;
                break;
            case 5:
                obj2 = this.A02;
                str = this.A03;
                i = 5;
                break;
            case 6:
                obj2 = this.A02;
                str = this.A03;
                i = 6;
                break;
            case 7:
                obj2 = this.A02;
                str = this.A03;
                i = 7;
                break;
            default:
                return new C9DZ(this.A02, this.A03, interfaceC23621Ds, 8);
        }
        return new C9DZ(obj2, str, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DZ) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
