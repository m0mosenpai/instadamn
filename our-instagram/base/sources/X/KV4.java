package X;

/* loaded from: classes8.dex */
public final class KV4 extends AbstractC46452KhC {
    public final C40971v4 A00;
    public final C3x9 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KV4) {
                KV4 kv4 = (KV4) obj;
                if (!C14360o3.A0K(this.A00, kv4.A00) || !C14360o3.A0K(this.A01, kv4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public KV4(C3x9 c3x9, C40971v4 c40971v4) {
        this.A00 = c40971v4;
        this.A01 = c3x9;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Clips(ad=");
        A1C.append(this.A00);
        A1C.append(", metadata=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
