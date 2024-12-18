package X;

/* loaded from: classes6.dex */
public final class E8E extends C0T6 implements InterfaceC37254Gb7 {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8E) {
                E8E e8e = (E8E) obj;
                if (!C14360o3.A0K(this.A01, e8e.A01) || !C14360o3.A0K(this.A00, e8e.A00) || !C14360o3.A0K(this.A02, e8e.A02) || !C14360o3.A0K(this.A04, e8e.A04) || !C14360o3.A0K(this.A03, e8e.A03) || !C14360o3.A0K(this.A05, e8e.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public E8E(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A05 = str5;
    }
}
