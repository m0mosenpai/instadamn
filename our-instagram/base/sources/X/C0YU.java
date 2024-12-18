package X;

/* renamed from: X.0YU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YU implements InterfaceC16530ry {
    public Object A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16530ry, X.InterfaceC16130rD
    public final Object CES(Object obj, C0YR c0yr) {
        C14360o3.A0B(c0yr, 1);
        Object obj2 = this.A00;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Property ", ((AbstractC06830Ya) c0yr).name, " should be initialized before get."));
    }

    @Override // X.InterfaceC16530ry
    public final void Egi(Object obj, Object obj2, C0YR c0yr) {
        C14360o3.A0B(obj2, 2);
        this.A00 = obj2;
    }

    public final String toString() {
        String str;
        Object obj = this.A00;
        if (obj != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("value=");
            sb.append(obj);
            str = sb.toString();
        } else {
            str = "value not initialized yet";
        }
        return AnonymousClass001.A0S("NotNullProperty(", str, ')');
    }
}
