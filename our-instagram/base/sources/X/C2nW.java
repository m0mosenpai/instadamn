package X;

/* renamed from: X.2nW, reason: invalid class name */
/* loaded from: classes2.dex */
public class C2nW implements InterfaceC16530ry {
    public Object A00 = null;
    public final InterfaceC16660sJ A01;

    public C2nW(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16530ry
    public final void Egi(Object obj, Object obj2, C0YR c0yr) {
        Object obj3 = this.A00;
        if (obj3 != null && obj3 != obj2) {
            this.A01.invoke(obj3);
        }
        this.A00 = obj2;
    }

    @Override // X.InterfaceC16530ry, X.InterfaceC16130rD
    public final Object CES(Object obj, C0YR c0yr) {
        return this.A00;
    }
}
