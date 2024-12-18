package X;

/* renamed from: X.0YT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0YT implements InterfaceC16530ry {
    public Object A00;

    public void A00(Object obj, Object obj2, C0YR c0yr) {
    }

    public boolean A01(Object obj, Object obj2, C0YR c0yr) {
        return true;
    }

    @Override // X.InterfaceC16530ry
    public final void Egi(Object obj, Object obj2, C0YR c0yr) {
        C14360o3.A0B(c0yr, 1);
        Object obj3 = this.A00;
        if (A01(obj3, obj2, c0yr)) {
            this.A00 = obj2;
            A00(obj3, obj2, c0yr);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObservableProperty(value=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C0YT(Object obj) {
        this.A00 = obj;
    }

    @Override // X.InterfaceC16530ry, X.InterfaceC16130rD
    public final Object CES(Object obj, C0YR c0yr) {
        return this.A00;
    }
}
