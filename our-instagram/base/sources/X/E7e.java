package X;

/* loaded from: classes6.dex */
public final class E7e extends C0T6 implements InterfaceC31088DlW {
    public final String A00;
    public final int A01;
    public final Integer A02;
    public final Long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7e) {
                E7e e7e = (E7e) obj;
                if (!C14360o3.A0K(this.A02, e7e.A02) || this.A01 != e7e.A01 || !C14360o3.A0K(this.A00, e7e.A00) || !C14360o3.A0K(this.A03, e7e.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A02) * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public E7e(Integer num, Long l, String str, int i) {
        this.A02 = num;
        this.A01 = i;
        this.A00 = str;
        this.A03 = l;
    }
}
