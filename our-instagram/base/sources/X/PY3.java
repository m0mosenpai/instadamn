package X;

/* loaded from: classes9.dex */
public final class PY3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PY3(Object obj, Object obj2, Object obj3, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A01 = i2;
        this.A05 = obj;
        this.A03 = obj2;
        this.A06 = str;
        this.A02 = i;
        this.A08 = str2;
        this.A04 = obj3;
        this.A07 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        int i;
        String str2;
        Object obj3;
        String str3;
        int i2;
        int i3 = this.A01;
        Object obj4 = this.A05;
        if (i3 != 0) {
            str = this.A06;
            str2 = this.A08;
            obj3 = this.A04;
            i = this.A02;
            str3 = this.A07;
            obj2 = this.A03;
            i2 = 1;
        } else {
            obj2 = this.A03;
            str = this.A06;
            i = this.A02;
            str2 = this.A08;
            obj3 = this.A04;
            str3 = this.A07;
            i2 = 0;
        }
        return new PY3(obj4, obj2, obj3, str, str2, str3, interfaceC23621Ds, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PY3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PY3) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
