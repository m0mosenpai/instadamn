package X;

/* loaded from: classes6.dex */
public final class E6M extends C0T6 {
    public final int A00;
    public final C7Q4 A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public E6M(C7Q4 c7q4, Integer num, String str, String str2, int i) {
        C14360o3.A0B(num, 5);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = c7q4;
        this.A00 = i;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6M) {
                E6M e6m = (E6M) obj;
                if (!C14360o3.A0K(this.A03, e6m.A03) || !C14360o3.A0K(this.A04, e6m.A04) || !C14360o3.A0K(this.A01, e6m.A01) || this.A00 != e6m.A00 || this.A02 != e6m.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31) + this.A00) * 31) + AbstractC53957NtU.A00(this.A02);
    }
}
