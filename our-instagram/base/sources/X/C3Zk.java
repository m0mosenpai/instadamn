package X;

/* renamed from: X.3Zk, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Zk implements InterfaceC16530ry {
    public Object A00;
    public final int A01;

    public final void A00(C75113Zb c75113Zb, Object obj) {
        C14360o3.A0B(c75113Zb, 0);
        if (!C14360o3.A0K(this.A00, obj)) {
            this.A00 = obj;
            C75113Zb.A00(c75113Zb, this.A01);
        }
    }

    @Override // X.InterfaceC16530ry
    public final /* bridge */ /* synthetic */ void Egi(Object obj, Object obj2, C0YR c0yr) {
        A00((C75113Zb) obj, obj2);
    }

    public C3Zk(InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A01 = i;
        this.A00 = interfaceC16820sZ.invoke();
    }

    @Override // X.InterfaceC16530ry, X.InterfaceC16130rD
    public final /* bridge */ /* synthetic */ Object CES(Object obj, C0YR c0yr) {
        return this.A00;
    }
}
