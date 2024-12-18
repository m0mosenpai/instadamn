package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;

/* renamed from: X.MSh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50528MSh extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50528MSh(C51027Mga c51027Mga, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = 4;
        this.A05 = c51027Mga;
        this.A06 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        Object obj5;
        int i;
        switch (this.A04) {
            case 0:
                obj3 = this.A03;
                obj4 = this.A02;
                obj2 = this.A05;
                z = this.A06;
                obj5 = this.A01;
                i = 0;
                return new C50528MSh(obj3, obj4, obj2, obj5, interfaceC23621Ds, i, z);
            case 1:
                z = this.A06;
                obj2 = this.A05;
                obj5 = this.A01;
                obj3 = this.A03;
                obj4 = this.A02;
                i = 1;
                return new C50528MSh(obj3, obj4, obj2, obj5, interfaceC23621Ds, i, z);
            case 2:
                return new C50528MSh((C1X7) this.A01, (FeedCacheCoordinator) this.A05, interfaceC23621Ds, this.A06);
            case 3:
                obj3 = this.A03;
                obj5 = this.A01;
                obj2 = this.A05;
                z = this.A06;
                obj4 = this.A02;
                i = 3;
                return new C50528MSh(obj3, obj4, obj2, obj5, interfaceC23621Ds, i, z);
            case 4:
                C50528MSh c50528MSh = new C50528MSh((C51027Mga) this.A05, interfaceC23621Ds, this.A06);
                c50528MSh.A01 = obj;
                return c50528MSh;
            case 5:
                obj2 = this.A05;
                obj3 = this.A03;
                obj4 = this.A02;
                z = this.A06;
                obj5 = this.A01;
                i = 5;
                return new C50528MSh(obj3, obj4, obj2, obj5, interfaceC23621Ds, i, z);
            default:
                obj2 = this.A05;
                z = this.A06;
                obj4 = this.A02;
                obj5 = this.A01;
                obj3 = this.A03;
                i = 6;
                return new C50528MSh(obj3, obj4, obj2, obj5, interfaceC23621Ds, i, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0219, code lost:
    
        if (r1 == r0) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50528MSh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50528MSh) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50528MSh(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A06 = z;
        this.A01 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50528MSh(C1X7 c1x7, FeedCacheCoordinator feedCacheCoordinator, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = 2;
        this.A05 = feedCacheCoordinator;
        this.A01 = c1x7;
        this.A06 = z;
    }
}
