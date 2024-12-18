package X;

/* loaded from: classes10.dex */
public final class SOW {
    public final InterfaceC102974kY A00;
    public final String A01;

    public SOW(InterfaceC102974kY interfaceC102974kY, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = interfaceC102974kY;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SOW) {
                SOW sow = (SOW) obj;
                if (!C14360o3.A0K(this.A01, sow.A01) || !C14360o3.A0K(this.A00, sow.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BloksStackFrame(offset=");
        A1C.append(this.A01);
        A1C.append(", nextFrame=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
