package X;

/* loaded from: classes11.dex */
public final class URD extends C0T6 implements XFN {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URD) {
                URD urd = (URD) obj;
                if (!C14360o3.A0K(this.A00, urd.A00) || !C14360o3.A0K(this.A01, urd.A01) || !C14360o3.A0K(this.A02, urd.A02) || !C14360o3.A0K(this.A03, urd.A03) || !C14360o3.A0K(this.A04, urd.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public URD(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
