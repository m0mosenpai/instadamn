package X;

/* loaded from: classes6.dex */
public final class E8L extends C0T6 implements InterfaceC103594lb {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public E8L(String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str5, 5);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8L) {
                E8L e8l = (E8L) obj;
                if (!C14360o3.A0K(this.A00, e8l.A00) || !C14360o3.A0K(this.A01, e8l.A01) || !C14360o3.A0K(this.A02, e8l.A02) || !C14360o3.A0K(this.A03, e8l.A03) || !C14360o3.A0K(this.A04, e8l.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, ((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31);
    }
}
