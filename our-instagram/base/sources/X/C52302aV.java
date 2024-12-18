package X;

/* renamed from: X.2aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52302aV implements InterfaceC16530ry {
    public Object A00;
    public final Object A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16530ry, X.InterfaceC16130rD
    public final Object CES(Object obj, C0YR c0yr) {
        C14360o3.A0B(c0yr, 1);
        Object obj2 = this.A00;
        if (obj2 == null && (obj2 = this.A01) == null) {
            throw new IllegalStateException(AbstractC002300n.A0d("Experiment @propertyName is required and must be set", "@propertyName", ((AbstractC06830Ya) c0yr).name, false));
        }
        return obj2;
    }

    public C52302aV(Object obj) {
        this.A01 = obj;
    }

    @Override // X.InterfaceC16530ry
    public final void Egi(Object obj, Object obj2, C0YR c0yr) {
        this.A00 = obj2;
    }
}
