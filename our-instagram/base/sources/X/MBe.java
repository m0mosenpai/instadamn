package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class MBe extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBe(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A00 = obj2;
        this.A06 = str;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A05 = str2;
        this.A07 = str3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        Object obj3;
        String str2;
        String str3;
        Object obj4;
        Object obj5;
        int i;
        switch (this.A01) {
            case 0:
                Ld1 ld1 = (Ld1) this.A04;
                List list = (List) this.A03;
                MBe mBe = new MBe((C45125Jxu) this.A02, ld1, this.A06, this.A07, this.A05, list, interfaceC23621Ds);
                mBe.A00 = obj;
                return mBe;
            case 1:
                obj2 = this.A04;
                str = this.A05;
                obj3 = this.A02;
                str2 = this.A07;
                str3 = this.A06;
                obj4 = this.A00;
                obj5 = this.A03;
                i = 1;
                return new MBe(obj5, obj4, obj2, obj3, str3, str, str2, interfaceC23621Ds, i);
            default:
                obj5 = this.A03;
                obj4 = this.A00;
                str3 = this.A06;
                obj2 = this.A04;
                obj3 = this.A02;
                str = this.A05;
                str2 = this.A07;
                i = 2;
                return new MBe(obj5, obj4, obj2, obj3, str3, str, str2, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d1, code lost:
    
        if (r2 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cd, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBe) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBe(C45125Jxu c45125Jxu, Ld1 ld1, String str, String str2, String str3, List list, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = 0;
        this.A04 = ld1;
        this.A03 = list;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A02 = c45125Jxu;
    }
}
