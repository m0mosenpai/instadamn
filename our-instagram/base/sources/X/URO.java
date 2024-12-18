package X;

/* loaded from: classes11.dex */
public final class URO extends C0T6 implements XFU {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URO) {
                URO uro = (URO) obj;
                if (!C14360o3.A0K(this.A00, uro.A00) || !C14360o3.A0K(this.A01, uro.A01) || !C14360o3.A0K(this.A02, uro.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    public URO(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
