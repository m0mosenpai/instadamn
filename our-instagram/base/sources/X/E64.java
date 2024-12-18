package X;

/* loaded from: classes6.dex */
public final class E64 extends C0T6 {
    public final String A00;
    public final String A01;

    public E64(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E64) {
                E64 e64 = (E64) obj;
                if (!C14360o3.A0K(this.A00, e64.A00) || !C14360o3.A0K(this.A01, e64.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
