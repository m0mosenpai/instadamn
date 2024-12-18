package X;

/* renamed from: X.5be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119805be extends AbstractC119735bX {
    public final InterfaceC118225Wj A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C119805be) && C14360o3.A0K(this.A00, ((C119805be) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerticalCrossAxisAlignment(vertical=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C119805be(InterfaceC118225Wj interfaceC118225Wj) {
        this.A00 = interfaceC118225Wj;
    }
}
