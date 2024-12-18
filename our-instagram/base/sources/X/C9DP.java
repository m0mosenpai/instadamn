package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.9DP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DP extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DP(C46892Dd c46892Dd, List list, List list2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = c46892Dd;
        this.A06 = z;
        this.A05 = list;
        this.A04 = list2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            C9DP c9dp = new C9DP((C46892Dd) this.A02, (List) this.A05, (List) this.A04, interfaceC23621Ds, this.A06);
            c9dp.A01 = obj;
            return c9dp;
        }
        boolean z = this.A06;
        C9DP c9dp2 = new C9DP((C1YP) this.A05, (Callable) this.A04, interfaceC23621Ds, (String[]) this.A01, z);
        c9dp2.A02 = obj;
        return c9dp2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DP) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r6 != 5) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DP(C1YP c1yp, Callable callable, InterfaceC23621Ds interfaceC23621Ds, String[] strArr, boolean z) {
        super(2, interfaceC23621Ds);
        this.A06 = z;
        this.A05 = c1yp;
        this.A01 = strArr;
        this.A04 = callable;
    }
}
