package X;

/* loaded from: classes5.dex */
public final class BID extends BH1 {
    public final BIC A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BID) {
                BID bid = (BID) obj;
                if (!C14360o3.A0K(this.A00, bid.A00) || this.A01 != bid.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public BID(BIC bic, int i) {
        super("branded_content_info", "content_type_branded_content_info");
        this.A00 = bic;
        this.A01 = i;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + this.A01;
    }
}
