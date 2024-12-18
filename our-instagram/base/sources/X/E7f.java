package X;

/* loaded from: classes6.dex */
public final class E7f extends C0T6 implements XFD {
    public final C32049E6b A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7f) {
                E7f e7f = (E7f) obj;
                if (!C14360o3.A0K(this.A01, e7f.A01) || !C14360o3.A0K(this.A00, e7f.A00) || !C14360o3.A0K(this.A02, e7f.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public E7f(C32049E6b c32049E6b, String str, String str2) {
        this.A01 = str;
        this.A00 = c32049E6b;
        this.A02 = str2;
    }
}
