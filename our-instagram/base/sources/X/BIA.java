package X;

/* loaded from: classes5.dex */
public final class BIA extends BH1 {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BIA) && this.A00 == ((BIA) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public BIA(int i) {
        super("see_all_suggested_users", "content_type_header");
        this.A00 = i;
    }
}
