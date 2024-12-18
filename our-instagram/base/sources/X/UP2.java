package X;

/* loaded from: classes11.dex */
public final class UP2 extends C0T6 {
    public final UPF A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UP2) {
                UP2 up2 = (UP2) obj;
                if (!C14360o3.A0K(this.A01, up2.A01) || !C14360o3.A0K(this.A00, up2.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = AbstractC167017dG.A0O(this.A01) * 31;
        UPF upf = this.A00;
        if (upf != null) {
            i = upf.hashCode();
        }
        return A0O + i;
    }

    public UP2(UPF upf, String str) {
        this.A01 = str;
        this.A00 = upf;
    }
}
