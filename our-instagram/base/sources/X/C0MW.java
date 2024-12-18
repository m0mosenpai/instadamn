package X;

/* renamed from: X.0MW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MW extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MW(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A05;
        switch (i) {
            case 0:
                return ((C11950ju) obj2).collect(null, this);
            case 1:
                return ((C14960pB) obj2).emit(null, this);
            case 2:
                return ((C15630qJ) obj2).emit(null, this);
            default:
                return ((C14930p8) obj2).emit(this, null);
        }
    }
}
