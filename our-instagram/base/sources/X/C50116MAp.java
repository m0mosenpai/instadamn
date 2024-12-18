package X;

/* renamed from: X.MAp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50116MAp extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50116MAp(Object obj, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        String str2;
        String str3;
        Object obj2;
        int i;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                str3 = this.A05;
                str = this.A03;
                str2 = this.A04;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                str = this.A03;
                str3 = this.A05;
                str2 = this.A04;
                i = 1;
                break;
            case 2:
                str = this.A03;
                str2 = this.A04;
                str3 = this.A05;
                obj2 = this.A02;
                i = 2;
                break;
            default:
                obj2 = this.A02;
                str2 = this.A04;
                str3 = this.A05;
                str = this.A03;
                i = 3;
                break;
        }
        return new C50116MAp(obj2, str3, str, str2, interfaceC23621Ds, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50116MAp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50116MAp) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
