package X;

import java.util.List;

/* renamed from: X.Bid, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26213Bid extends C0T6 implements MNC {
    public final List A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26213Bid) {
                C26213Bid c26213Bid = (C26213Bid) obj;
                if (this.A01 != c26213Bid.A01 || !C14360o3.A0K(this.A00, c26213Bid.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, this.A01 * 31);
    }

    public C26213Bid(int i, List list) {
        this.A01 = i;
        this.A00 = list;
    }
}
