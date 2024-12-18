package X;

import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PZ2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ2(C51372MmX c51372MmX, User user, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = 1;
        this.A03 = c51372MmX;
        this.A00 = user;
        this.A04 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        boolean z;
        int i;
        boolean z2;
        Object obj4;
        Object obj5;
        Object obj6;
        int i2;
        switch (this.A02) {
            case 0:
                obj2 = this.A01;
                obj3 = this.A03;
                z = this.A04;
                i = 0;
                break;
            case 1:
                PZ2 pz2 = new PZ2((C51372MmX) this.A03, (User) this.A00, interfaceC23621Ds, this.A04);
                pz2.A01 = obj;
                return pz2;
            case 2:
                obj2 = this.A01;
                obj3 = this.A03;
                z = this.A04;
                i = 2;
                break;
            case 3:
                obj6 = this.A00;
                z2 = this.A04;
                obj4 = this.A03;
                obj5 = this.A01;
                i2 = 3;
                return new PZ2(obj6, obj4, obj5, interfaceC23621Ds, i2, z2);
            case 4:
                obj5 = this.A01;
                obj6 = this.A00;
                obj4 = this.A03;
                z2 = this.A04;
                i2 = 4;
                return new PZ2(obj6, obj4, obj5, interfaceC23621Ds, i2, z2);
            case 5:
                z2 = this.A04;
                obj4 = this.A03;
                obj5 = this.A01;
                obj6 = this.A00;
                i2 = 5;
                return new PZ2(obj6, obj4, obj5, interfaceC23621Ds, i2, z2);
            default:
                obj5 = this.A01;
                obj4 = this.A03;
                z2 = this.A04;
                obj6 = this.A00;
                i2 = 6;
                return new PZ2(obj6, obj4, obj5, interfaceC23621Ds, i2, z2);
        }
        PZ2 pz22 = new PZ2(obj2, obj3, interfaceC23621Ds, i, z);
        pz22.A00 = obj;
        return pz22;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Type inference failed for: r0v48, types: [X.OVe, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZ2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZ2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ2(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ2(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A00 = obj;
        this.A04 = z;
        this.A03 = obj2;
        this.A01 = obj3;
    }
}
