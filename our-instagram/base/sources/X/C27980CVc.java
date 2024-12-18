package X;

/* renamed from: X.CVc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27980CVc {
    public final String A00;
    public final String A01;

    public C27980CVc(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27980CVc) {
                C27980CVc c27980CVc = (C27980CVc) obj;
                if (!C14360o3.A0K(this.A01, c27980CVc.A01) || !C14360o3.A0K(this.A00, c27980CVc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("WriteSuggestion(text=", this.A01, MSV.A00(640), this.A00, ')');
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A00);
    }
}
