package X;

/* renamed from: X.BSy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25585BSy extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final long A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25585BSy(Object obj, Object obj2, long j, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
        this.A05 = obj2;
        this.A04 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        long j;
        int i;
        long j2;
        Object obj4;
        Object obj5;
        Object obj6;
        int i2;
        switch (this.A03) {
            case 0:
                obj2 = this.A02;
                j = this.A04;
                obj3 = this.A05;
                i = 0;
                break;
            case 1:
                C25585BSy c25585BSy = new C25585BSy(this.A01, this.A05, interfaceC23621Ds, 1, this.A04);
                c25585BSy.A02 = obj;
                return c25585BSy;
            case 2:
                obj2 = this.A02;
                obj3 = this.A05;
                j = this.A04;
                i = 2;
                break;
            case 3:
                return new C25585BSy(this.A01, this.A05, interfaceC23621Ds, 3, this.A04);
            case 4:
                j2 = this.A04;
                obj4 = this.A05;
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 4;
                return new C25585BSy(obj4, obj5, obj6, interfaceC23621Ds, i2, j2);
            case 5:
                C25585BSy c25585BSy2 = new C25585BSy(this.A02, this.A05, this.A04, interfaceC23621Ds, 5);
                c25585BSy2.A01 = obj;
                return c25585BSy2;
            default:
                obj5 = this.A01;
                obj6 = this.A02;
                j2 = this.A04;
                obj4 = this.A05;
                i2 = 6;
                return new C25585BSy(obj4, obj5, obj6, interfaceC23621Ds, i2, j2);
        }
        return new C25585BSy(obj2, obj3, j, interfaceC23621Ds, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x024d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0203 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.5XO] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.5XO] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.Dg2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v27, types: [X.Dg2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.58J] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x010d -> B:38:0x00c8). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25585BSy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C25585BSy) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25585BSy(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = j;
        this.A05 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25585BSy(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
        this.A04 = j;
        this.A05 = obj2;
    }
}
