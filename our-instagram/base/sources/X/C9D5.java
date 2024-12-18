package X;

/* renamed from: X.9D5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9D5 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D5(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A03 = i;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (this.A03) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            default:
                i = 6;
                break;
        }
        C9D5 c9d5 = new C9D5(i, interfaceC23621Ds);
        c9d5.A01 = obj;
        c9d5.A02 = obj2;
        return c9d5.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x018d, code lost:
    
        if (r3 != false) goto L65;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0290 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9D5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
