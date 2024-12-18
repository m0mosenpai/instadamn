package X;

/* loaded from: classes5.dex */
public final class C0C extends BH1 {
    public final String A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0C) {
                C0C c0c = (C0C) obj;
                if (!C14360o3.A0K(this.A00, c0c.A00) || this.A01 != c0c.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public C0C(String str, int i) {
        super("banner", "content_banner");
        this.A00 = str;
        this.A01 = i;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + this.A01;
    }
}
