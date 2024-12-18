package X;

/* renamed from: X.69c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1350369c extends AbstractC119845bi {
    public final InterfaceC1350269b A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1350369c) && C14360o3.A0K(this.A00, ((C1350369c) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadedFontFamily(typeface=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C1350369c(InterfaceC1350269b interfaceC1350269b) {
        this.A00 = interfaceC1350269b;
    }
}
