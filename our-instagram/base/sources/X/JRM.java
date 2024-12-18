package X;

import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class JRM extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JRM(C1YP c1yp, Callable callable, InterfaceC23621Ds interfaceC23621Ds, InterfaceC19960yQ interfaceC19960yQ, String[] strArr, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = 0;
        this.A07 = z;
        this.A05 = c1yp;
        this.A03 = interfaceC19960yQ;
        this.A06 = strArr;
        this.A04 = callable;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        boolean z;
        int i;
        switch (this.A02) {
            case 0:
                boolean z2 = this.A07;
                JRM jrm = new JRM((C1YP) this.A05, (Callable) this.A04, interfaceC23621Ds, (InterfaceC19960yQ) this.A03, (String[]) this.A06, z2);
                jrm.A01 = obj;
                return jrm;
            case 1:
                obj6 = this.A01;
                obj2 = this.A03;
                obj3 = this.A05;
                z = this.A07;
                obj4 = this.A06;
                obj5 = this.A04;
                i = 1;
                return new JRM(obj6, obj2, obj3, obj4, obj5, interfaceC23621Ds, i, z);
            case 2:
                obj2 = this.A03;
                obj3 = this.A05;
                obj4 = this.A06;
                obj5 = this.A04;
                obj6 = this.A01;
                z = this.A07;
                i = 2;
                return new JRM(obj6, obj2, obj3, obj4, obj5, interfaceC23621Ds, i, z);
            default:
                obj6 = this.A01;
                obj3 = this.A05;
                obj2 = this.A03;
                z = this.A07;
                obj5 = this.A04;
                obj4 = this.A06;
                i = 3;
                return new JRM(obj6, obj2, obj3, obj4, obj5, interfaceC23621Ds, i, z);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024a A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JRM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JRM) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JRM(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A07 = z;
        this.A06 = obj4;
        this.A04 = obj5;
    }
}
