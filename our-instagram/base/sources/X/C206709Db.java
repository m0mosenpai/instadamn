package X;

/* renamed from: X.9Db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206709Db extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206709Db(C188848Ya c188848Ya, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 6;
        this.A03 = c188848Ya;
        this.A04 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        Object obj3;
        int i;
        switch (this.A02) {
            case 0:
                str = this.A04;
                obj3 = this.A01;
                obj2 = this.A03;
                i = 0;
                return new C206709Db(obj2, obj3, str, interfaceC23621Ds, i);
            case 1:
                obj2 = this.A03;
                str = this.A04;
                obj3 = this.A01;
                i = 1;
                return new C206709Db(obj2, obj3, str, interfaceC23621Ds, i);
            case 2:
                obj2 = this.A03;
                str = this.A04;
                obj3 = this.A01;
                i = 2;
                return new C206709Db(obj2, obj3, str, interfaceC23621Ds, i);
            case 3:
                obj2 = this.A03;
                str = this.A04;
                obj3 = this.A01;
                i = 3;
                return new C206709Db(obj2, obj3, str, interfaceC23621Ds, i);
            case 4:
                obj2 = this.A03;
                obj3 = this.A01;
                str = this.A04;
                i = 4;
                return new C206709Db(obj2, obj3, str, interfaceC23621Ds, i);
            case 5:
                obj2 = this.A03;
                str = this.A04;
                obj3 = this.A01;
                i = 5;
                return new C206709Db(obj2, obj3, str, interfaceC23621Ds, i);
            case 6:
                C206709Db c206709Db = new C206709Db((C188848Ya) this.A03, this.A04, interfaceC23621Ds);
                c206709Db.A01 = obj;
                return c206709Db;
            default:
                str = this.A04;
                obj3 = this.A01;
                obj2 = this.A03;
                i = 7;
                return new C206709Db(obj2, obj3, str, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206709Db) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r7 != null) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:77:0x048a A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206709Db.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206709Db(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A01 = obj2;
    }
}
