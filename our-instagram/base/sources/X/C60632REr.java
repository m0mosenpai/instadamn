package X;

import java.util.List;

/* renamed from: X.REr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60632REr extends S29 {
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof S29) {
            return this.A00.equals(((C60632REr) ((S29) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public C60632REr(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BatchedLogRequest{logRequests=");
        return JQ0.A0l(this.A00, A1C);
    }
}
