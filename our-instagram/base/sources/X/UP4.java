package X;

/* loaded from: classes11.dex */
public final class UP4 extends C0T6 {
    public final android.net.Uri A00;
    public final Float A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UP4) {
                UP4 up4 = (UP4) obj;
                if (!C14360o3.A0K(this.A00, up4.A00) || !C14360o3.A0K(this.A01, up4.A01) || !C14360o3.A0K(this.A02, up4.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A02.hashCode();
    }

    public UP4(android.net.Uri uri, Float f, String str) {
        this.A00 = uri;
        this.A01 = f;
        this.A02 = str;
    }
}
