package X;

/* renamed from: X.9DD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DD extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DD(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        int i2;
        switch (this.A01) {
            case 0:
                obj5 = this.A03;
                obj6 = this.A02;
                i2 = 0;
                C9DD c9dd = new C9DD(obj5, obj6, interfaceC23621Ds, i2);
                c9dd.A00 = obj;
                return c9dd;
            case 1:
                obj5 = this.A03;
                obj6 = this.A02;
                i2 = 1;
                C9DD c9dd2 = new C9DD(obj5, obj6, interfaceC23621Ds, i2);
                c9dd2.A00 = obj;
                return c9dd2;
            case 2:
                obj5 = this.A03;
                obj6 = this.A02;
                i2 = 2;
                C9DD c9dd22 = new C9DD(obj5, obj6, interfaceC23621Ds, i2);
                c9dd22.A00 = obj;
                return c9dd22;
            case 3:
                obj2 = this.A03;
                obj3 = this.A00;
                obj4 = this.A02;
                i = 3;
                break;
            case 4:
                obj2 = this.A03;
                obj3 = this.A00;
                obj4 = this.A02;
                i = 4;
                break;
            default:
                obj5 = this.A03;
                obj6 = this.A02;
                i2 = 5;
                C9DD c9dd222 = new C9DD(obj5, obj6, interfaceC23621Ds, i2);
                c9dd222.A00 = obj;
                return c9dd222;
        }
        return new C9DD(obj2, obj3, obj4, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DD) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ec, code lost:
    
        if (r0 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x065e, code lost:
    
        if (r6 != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d5, code lost:
    
        if ((r1 instanceof X.NZF) != false) goto L78;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.42m, X.7ox] */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.3Fc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DD(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
    }
}
