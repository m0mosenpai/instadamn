package X;

/* loaded from: classes7.dex */
public final class H7V extends C0T6 implements JJ8 {
    public final Boolean A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7V) {
                H7V h7v = (H7V) obj;
                if (!C14360o3.A0K(this.A00, h7v.A00) || !C14360o3.A0K(this.A01, h7v.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public H7V(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }
}
