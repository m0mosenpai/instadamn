package X;

/* renamed from: X.Vuf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69745Vuf {
    public final W5Q A00;
    public final W5Q A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69745Vuf c69745Vuf = (C69745Vuf) obj;
            if (!this.A00.equals(c69745Vuf.A00) || !this.A01.equals(c69745Vuf.A01)) {
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
        W5Q w5q = this.A00;
        sb.append(w5q);
        W5Q w5q2 = this.A01;
        if (w5q.equals(w5q2)) {
            A0n = "";
        } else {
            A0n = AbstractC167017dG.A0n(w5q2, ", ", new StringBuilder());
        }
        sb.append(A0n);
        return AbstractC166997dE.A0x("]", sb);
    }

    public C69745Vuf(W5Q w5q, W5Q w5q2) {
        this.A00 = w5q;
        this.A01 = w5q2;
    }
}
