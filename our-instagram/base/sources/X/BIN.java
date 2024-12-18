package X;

/* loaded from: classes5.dex */
public final class BIN extends BH1 {
    public final int A00;
    public final MUW A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIN) {
                BIN bin = (BIN) obj;
                if (!C14360o3.A0K(this.A01, bin.A01) || this.A00 != bin.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public BIN(MUW muw, int i) {
        super("story_mentions_info", "content_type_story_mentions_info");
        this.A01 = muw;
        this.A00 = i;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }
}
