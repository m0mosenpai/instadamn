package X;

import java.lang.ref.Reference;

/* loaded from: classes12.dex */
public final class YJN implements InterfaceC16130rD, InterfaceC16530ry {
    public Object A00 = AbstractC25225BEi.A16(null);
    public final int A01;

    public YJN(int i) {
        this.A01 = i;
    }

    @Override // X.InterfaceC16130rD
    public final Object CES(Object obj, C0YR c0yr) {
        return ((Reference) this.A00).get();
    }

    @Override // X.InterfaceC16530ry
    public final void Egi(Object obj, Object obj2, C0YR c0yr) {
        this.A00 = AbstractC25225BEi.A16(obj2);
    }
}
