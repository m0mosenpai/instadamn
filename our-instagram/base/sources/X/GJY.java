package X;

/* loaded from: classes6.dex */
public final class GJY implements GX8 {
    public final String A00;

    public GJY(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GJY) && C14360o3.A0K(this.A00, ((GJY) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("ShowSearchLinkSources(sourcesUrl=", this.A00, ')');
    }
}
