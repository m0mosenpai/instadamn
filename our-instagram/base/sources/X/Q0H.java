package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class Q0H implements Serializable {
    public final long A00;
    public final C64517THk A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q0H) {
                Q0H q0h = (Q0H) obj;
                if (!C14360o3.A0K(this.A02, q0h.A02) || this.A00 != q0h.A00 || !C14360o3.A0K(this.A01, q0h.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A01);
    }

    public Q0H(C64517THk c64517THk, String str, long j) {
        this.A02 = str;
        this.A00 = j;
        this.A01 = c64517THk;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ComponentQueryDiskCacheRecord(payload=");
        A1C.append(this.A02);
        A1C.append(", responseTimestampMs=");
        A1C.append(this.A00);
        A1C.append(", resources=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
