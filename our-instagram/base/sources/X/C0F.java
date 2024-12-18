package X;

/* loaded from: classes5.dex */
public final class C0F extends AbstractC27441C9j {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0F) {
                C0F c0f = (C0F) obj;
                if (!C14360o3.A0K(this.A01, c0f.A01) || this.A00 != c0f.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }

    public C0F(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
