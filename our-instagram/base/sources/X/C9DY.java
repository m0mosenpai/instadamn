package X;

/* renamed from: X.9DY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DY extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DY(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        int i;
        switch (this.A00) {
            case 0:
                obj2 = this.A01;
                str = this.A02;
                i = 0;
                return new C9DY(obj2, str, interfaceC23621Ds, i);
            case 1:
                obj2 = this.A01;
                str = this.A02;
                i = 1;
                return new C9DY(obj2, str, interfaceC23621Ds, i);
            case 2:
                return new C9DY(this.A01, this.A02, interfaceC23621Ds, 2);
            default:
                obj2 = this.A01;
                str = this.A02;
                i = 3;
                return new C9DY(obj2, str, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DY) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r8 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ab, code lost:
    
        if (r3 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r10 > X.C18U.A01(r2, r3, 36598073459477612L)) goto L10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DY.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
