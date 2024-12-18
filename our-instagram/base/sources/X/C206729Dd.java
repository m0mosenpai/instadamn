package X;

/* renamed from: X.9Dd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206729Dd extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206729Dd(Object obj, Object obj2, Object obj3, Object obj4, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A06 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        int i;
        switch (this.A01) {
            case 0:
                obj4 = this.A05;
                str = this.A06;
                obj2 = this.A04;
                obj5 = this.A03;
                obj3 = this.A02;
                i = 0;
                break;
            case 1:
                obj2 = this.A04;
                obj3 = this.A02;
                obj4 = this.A05;
                obj5 = this.A03;
                str = this.A06;
                i = 1;
                break;
            default:
                obj2 = this.A04;
                obj5 = this.A03;
                obj4 = this.A05;
                obj3 = this.A02;
                str = this.A06;
                i = 2;
                break;
        }
        return new C206729Dd(obj2, obj3, obj4, obj5, str, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206729Dd) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206729Dd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
