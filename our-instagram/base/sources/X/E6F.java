package X;

/* loaded from: classes6.dex */
public final class E6F extends C0T6 {
    public String A02 = null;
    public String A00 = null;
    public String A01 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6F) {
                E6F e6f = (E6F) obj;
                if (!C14360o3.A0K(this.A02, e6f.A02) || !C14360o3.A0K(this.A00, e6f.A00) || !C14360o3.A0K(this.A01, e6f.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
