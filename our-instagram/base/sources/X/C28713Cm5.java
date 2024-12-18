package X;

/* renamed from: X.Cm5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28713Cm5 implements InterfaceC31030DkT {
    public final Object A00;
    public final Object A01;

    @Override // X.InterfaceC31030DkT
    public final /* synthetic */ boolean Cek(Object obj, Object obj2) {
        if (C14360o3.A0K(obj, this.A00) && C14360o3.A0K(obj2, this.A01)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC31030DkT) {
            InterfaceC31030DkT interfaceC31030DkT = (InterfaceC31030DkT) obj;
            if (C14360o3.A0K(this.A00, interfaceC31030DkT.BHg()) && C14360o3.A0K(this.A01, interfaceC31030DkT.C5W())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int A06 = AbstractC25235BEs.A06(this.A00) * 31;
        Object obj = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        }
        return A06 + i;
    }

    public C28713Cm5(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC31030DkT
    public final Object BHg() {
        return this.A00;
    }

    @Override // X.InterfaceC31030DkT
    public final Object C5W() {
        return this.A01;
    }
}
