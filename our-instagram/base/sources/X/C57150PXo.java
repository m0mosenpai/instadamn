package X;

/* renamed from: X.PXo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57150PXo extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57150PXo(Object obj, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A06 = z;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z;
        String str;
        String str2;
        String str3;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        if (i2 != 0) {
            str = this.A03;
            str2 = this.A04;
            str3 = this.A05;
            z = this.A06;
            i = 1;
        } else {
            z = this.A06;
            str = this.A03;
            str2 = this.A04;
            str3 = this.A05;
            i = 0;
        }
        return new C57150PXo(obj2, str, str2, str3, interfaceC23621Ds, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57150PXo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57150PXo) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
