package X;

/* renamed from: X.Pa9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57180Pa9 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57180Pa9(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
        this.A05 = obj2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        int i;
        C57180Pa9 c57180Pa9;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (this.A04) {
            case 0:
                c57180Pa9 = new C57180Pa9(interfaceC23621Ds, (C19L) this.A05);
                c57180Pa9.A02 = obj;
                c57180Pa9.A03 = obj2;
                break;
            case 1:
                obj4 = this.A03;
                obj5 = null;
                i = 1;
                c57180Pa9 = new C57180Pa9(obj4, obj5, interfaceC23621Ds, i);
                c57180Pa9.A01 = obj;
                c57180Pa9.A02 = obj2;
                break;
            default:
                obj4 = this.A03;
                obj5 = this.A05;
                i = 2;
                c57180Pa9 = new C57180Pa9(obj4, obj5, interfaceC23621Ds, i);
                c57180Pa9.A01 = obj;
                c57180Pa9.A02 = obj2;
                break;
        }
        return c57180Pa9.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r1 = r10.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r10.A00
            r6 = 1
            switch(r1) {
                case 0: goto L32;
                case 1: goto L49;
                default: goto La;
            }
        La:
            if (r0 != 0) goto La3
            X.AbstractC09560e7.A00(r11)
            java.lang.Object r3 = r10.A01
            X.0yQ r3 = (X.InterfaceC19960yQ) r3
            java.lang.Object r2 = r10.A02
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 == 0) goto L86
            java.lang.String r1 = "IgDataStore"
            java.lang.String r0 = "IOException thrown when reading from DataStore"
            X.C0K8.A0F(r1, r0, r2)
            X.0sk r1 = X.AbstractC06930Yk.A0E()
            r0 = 0
            r10.A01 = r0
        L29:
            r10.A00 = r6
            java.lang.Object r0 = r3.emit(r1, r10)
        L2f:
            if (r0 != r5) goto La6
            return r5
        L32:
            if (r0 != 0) goto La3
            X.AbstractC09560e7.A00(r11)
            java.lang.Object r3 = r10.A02
            X.0yQ r3 = (X.InterfaceC19960yQ) r3
            java.lang.Object r2 = r10.A03
            X.OTz r2 = (X.C54991OTz) r2
            java.lang.Object r0 = r10.A05
            X.19L r0 = (X.C19L) r0
            X.O9Z r1 = new X.O9Z
            r1.<init>(r2, r0)
            goto L29
        L49:
            if (r0 != 0) goto La3
            X.AbstractC09560e7.A00(r11)
            java.lang.Object r7 = r10.A01
            X.0yQ r7 = (X.InterfaceC19960yQ) r7
            java.lang.Object r9 = r10.A02
            X.O9a r9 = (X.C54574O9a) r9
            java.lang.Object r8 = r10.A03
            androidx.paging.PageFetcher r8 = (androidx.paging.PageFetcher) r8
            androidx.paging.PageFetcherSnapshot r0 = r9.A00
            r3 = 0
            X.0xP r2 = r0.A09
            r1 = 11
            X.MW8 r0 = new X.MW8
            r0.<init>(r1, r3)
            X.0po r4 = X.MSW.A1I(r0, r2)
            X.OVZ r0 = r8.A01
            X.OmL r3 = new X.OmL
            r3.<init>(r0, r8)
            androidx.paging.PageFetcherSnapshot r0 = r9.A00
            X.OmH r2 = new X.OmH
            r2.<init>(r8, r0)
            X.Pbz r1 = X.C57277Pbz.A00
            X.OTz r0 = new X.OTz
            r0.<init>(r2, r3, r1, r4)
            r10.A00 = r6
            java.lang.Object r0 = r7.emit(r0, r10)
            goto L2f
        L86:
            java.lang.Object r0 = r10.A03
            X.MT3 r0 = (X.MT3) r0
            java.lang.String r1 = r0.A01
            r0 = 2
            X.C14360o3.A0B(r2, r0)
            java.lang.String r0 = "Error reading from DataStore: "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)
            X.Ne3 r1 = new X.Ne3
            r1.<init>(r0, r2)
            java.lang.Object r0 = r10.A05
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.C2Ql.A01(r1, r0)
            throw r1
        La3:
            X.AbstractC09560e7.A00(r11)
        La6:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57180Pa9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57180Pa9(InterfaceC23621Ds interfaceC23621Ds, C19L c19l) {
        super(3, interfaceC23621Ds);
        this.A04 = 0;
        this.A05 = c19l;
        this.A01 = null;
    }
}
