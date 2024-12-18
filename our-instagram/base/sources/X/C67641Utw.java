package X;

/* renamed from: X.Utw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67641Utw extends VIP {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67641Utw) {
                C67641Utw c67641Utw = (C67641Utw) obj;
                if (!C14360o3.A0K(this.A02, c67641Utw.A02) || !C14360o3.A0K(this.A00, c67641Utw.A00) || !C14360o3.A0K(this.A01, c67641Utw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public C67641Utw(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public C67641Utw() {
        this(null, null, null);
    }
}
