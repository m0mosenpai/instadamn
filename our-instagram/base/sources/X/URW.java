package X;

/* loaded from: classes11.dex */
public final class URW extends C0T6 implements XFX {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URW) {
                URW urw = (URW) obj;
                if (this.A00 != urw.A00 || !C14360o3.A0K(this.A01, urw.A01) || !C14360o3.A0K(this.A02, urw.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, this.A00 * 31) + this.A02.hashCode();
    }

    public URW(int i, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
