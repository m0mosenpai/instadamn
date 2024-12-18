package X;

/* loaded from: classes6.dex */
public final class GJX implements GX8 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GJX) && C14360o3.A0K(this.A00, ((GJX) obj).A00));
    }

    public final String toString() {
        return AnonymousClass001.A0S("OpenBrowser(uri=", this.A00, ')');
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public GJX(String str) {
        this.A00 = str;
    }
}
