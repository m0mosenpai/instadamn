package X;

/* loaded from: classes6.dex */
public final class E69 extends C0T6 {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E69) {
                E69 e69 = (E69) obj;
                if (this.A00 != e69.A00 || !C14360o3.A0K(this.A01, e69.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC167017dG.A0O(this.A01);
    }

    public E69(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
