package X;

/* renamed from: X.VuW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69736VuW {
    public final W5N A00;
    public final W5N A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69736VuW c69736VuW = (C69736VuW) obj;
            if (!this.A00.equals(c69736VuW.A00) || !this.A01.equals(c69736VuW.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String A0n;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        W5N w5n = this.A00;
        sb.append(w5n);
        W5N w5n2 = this.A01;
        if (w5n.equals(w5n2)) {
            A0n = "";
        } else {
            A0n = AbstractC167017dG.A0n(w5n2, ", ", new StringBuilder());
        }
        sb.append(A0n);
        return AbstractC166997dE.A0x("]", sb);
    }

    public C69736VuW(W5N w5n, W5N w5n2) {
        this.A00 = w5n;
        this.A01 = w5n2;
    }
}
