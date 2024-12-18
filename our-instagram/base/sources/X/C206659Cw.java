package X;

/* renamed from: X.9Cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206659Cw extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206659Cw(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = j;
        this.A03 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        long j;
        Object obj2;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                j = this.A01;
                i = 0;
                return new C206659Cw(obj2, interfaceC23621Ds, i, j);
            case 1:
                C206659Cw c206659Cw = new C206659Cw((C6NT) this.A03, interfaceC23621Ds);
                c206659Cw.A01 = ((C119365at) obj).A00;
                return c206659Cw;
            case 2:
                j = this.A01;
                obj2 = this.A03;
                i = 2;
                return new C206659Cw(obj2, interfaceC23621Ds, i, j);
            default:
                obj2 = this.A03;
                j = this.A01;
                i = 3;
                return new C206659Cw(obj2, interfaceC23621Ds, i, j);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds create;
        if (1 - this.A02 != 0) {
            create = create(obj, (InterfaceC23621Ds) obj2);
        } else {
            create = create(new C119365at(((C119365at) obj).A00), (InterfaceC23621Ds) obj2);
        }
        return ((C206659Cw) create).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206659Cw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206659Cw(C6NT c6nt, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 1;
        this.A03 = c6nt;
    }
}
