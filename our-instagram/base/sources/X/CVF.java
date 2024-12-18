package X;

/* loaded from: classes5.dex */
public final class CVF {
    public final C5C8 A00;
    public final InterfaceC31114Dlw A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVF) {
                CVF cvf = (CVF) obj;
                if (!C14360o3.A0K(this.A00, cvf.A00) || !C14360o3.A0K(this.A01, cvf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public CVF(C5C8 c5c8, InterfaceC31114Dlw interfaceC31114Dlw) {
        this.A00 = c5c8;
        this.A01 = interfaceC31114Dlw;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TransformedText(text=");
        A1C.append((Object) this.A00);
        A1C.append(", offsetMapping=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
