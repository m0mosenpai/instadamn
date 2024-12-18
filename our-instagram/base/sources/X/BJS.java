package X;

/* loaded from: classes5.dex */
public final class BJS extends BH1 {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BJS) && this.A00 == ((BJS) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public BJS(int i) {
        super("su_loading", "content_type_loading");
        this.A00 = i;
    }
}
