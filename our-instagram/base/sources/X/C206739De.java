package X;

/* renamed from: X.9De, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206739De extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206739De(Object obj, Object obj2, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        String str2;
        int i;
        int i2 = this.A01;
        Object obj3 = this.A03;
        if (i2 != 0) {
            str2 = this.A05;
            obj2 = this.A02;
            str = this.A04;
            i = 1;
        } else {
            obj2 = this.A02;
            str = this.A04;
            str2 = this.A05;
            i = 0;
        }
        return new C206739De(obj3, obj2, str, str2, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206739De) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[EDGE_INSN: B:28:0x006b->B:25:0x006b BREAK  A[LOOP:0: B:9:0x002d->B:13:0x007d], SYNTHETIC] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206739De.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
