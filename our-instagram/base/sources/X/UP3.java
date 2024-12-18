package X;

/* loaded from: classes11.dex */
public final class UP3 extends C0T6 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UP3) {
                UP3 up3 = (UP3) obj;
                if (!C14360o3.A0K(this.A01, up3.A01) || !C14360o3.A0K(this.A00, up3.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public UP3(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
