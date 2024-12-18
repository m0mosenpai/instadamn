package X;

/* loaded from: classes11.dex */
public final class UP5 extends C0T6 {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UP5) {
                UP5 up5 = (UP5) obj;
                if (!C14360o3.A0K(this.A01, up5.A01) || !C14360o3.A0K(this.A00, up5.A00) || !C14360o3.A0K(this.A02, up5.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public UP5(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
    }
}
