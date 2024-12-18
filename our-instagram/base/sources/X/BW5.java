package X;

/* loaded from: classes5.dex */
public final class BW5 extends C5UP {
    public final C117725Uh A00;

    @Override // X.C5UP
    public final C117685Ud A02(Object obj) {
        return new C117685Ud(this, null, obj, AbstractC25229BEm.A1Z(obj), true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.5Uh] */
    public BW5(InterfaceC16660sJ interfaceC16660sJ) {
        super(BWJ.A00);
        this.A00 = new C5US(interfaceC16660sJ) { // from class: X.5Uh
            public final InterfaceC16660sJ A00;

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C117725Uh) && C14360o3.A0K(this.A00, ((C117725Uh) obj).A00));
            }

            public final int hashCode() {
                return this.A00.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ComputedValueHolder(compute=");
                sb.append(this.A00);
                sb.append(')');
                return sb.toString();
            }

            @Override // X.C5US
            public final Object E8W(C59P c59p) {
                return this.A00.invoke(c59p);
            }

            {
                this.A00 = interfaceC16660sJ;
            }
        };
    }

    @Override // X.C5UQ
    public final /* bridge */ /* synthetic */ C5US A00() {
        return this.A00;
    }
}
