package X;

/* loaded from: classes5.dex */
public final class BIQ extends BH1 {
    public final C25290BHi A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIQ) {
                BIQ biq = (BIQ) obj;
                if (!C14360o3.A0K(this.A00, biq.A00) || this.A01 != biq.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public BIQ(C25290BHi c25290BHi, int i) {
        super("ads_manager_item", "content_type_ads_manager_info");
        this.A00 = c25290BHi;
        this.A01 = i;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + this.A01;
    }
}
