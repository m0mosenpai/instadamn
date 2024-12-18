package X;

/* renamed from: X.0Pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05240Pv extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05240Pv(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A04;
        if (i != 0) {
            return ((C14960pB) obj2).emit(null, this);
        }
        return ((C11200ib) obj2).collect(null, this);
    }
}
