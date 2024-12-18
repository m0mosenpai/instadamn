package X;

/* renamed from: X.SaH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62993SaH {
    public static final C62993SaH A02 = new C62993SaH("UNKNOWN", null);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62993SaH) {
                C62993SaH c62993SaH = (C62993SaH) obj;
                if (!C14360o3.A0K(this.A01, c62993SaH.A01) || !C14360o3.A0K(this.A00, c62993SaH.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A00);
    }

    public final String toString() {
        return this.A01;
    }

    public C62993SaH(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
