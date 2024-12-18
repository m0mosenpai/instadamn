package X;

/* renamed from: X.5Uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117705Uf implements C5US {
    public final InterfaceC74953Yl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117705Uf) && C14360o3.A0K(this.A00, ((C117705Uf) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DynamicValueHolder(state=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.C5US
    public final Object E8W(C59P c59p) {
        return this.A00.getValue();
    }

    public C117705Uf(InterfaceC74953Yl interfaceC74953Yl) {
        this.A00 = interfaceC74953Yl;
    }
}
