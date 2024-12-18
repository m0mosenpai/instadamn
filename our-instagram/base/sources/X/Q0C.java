package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class Q0C implements Serializable {
    public final long A00;
    public final C64517THk A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q0C) {
                Q0C q0c = (Q0C) obj;
                if (this.A00 != q0c.A00 || !C14360o3.A0K(this.A01, q0c.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC25228BEl.A03(this.A00) * 31) + AbstractC167017dG.A0M(this.A01);
    }

    public Q0C(C64517THk c64517THk, long j) {
        this.A00 = j;
        this.A01 = c64517THk;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DiskCacheMetadata(responseCreatedTimestampMs=");
        A1C.append(this.A00);
        A1C.append(", resources=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
