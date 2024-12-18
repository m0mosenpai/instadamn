package X;

/* loaded from: classes5.dex */
public final class C5B extends CA7 {
    public final String A00;

    public C5B(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5B) && C14360o3.A0K(this.A00, ((C5B) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("PlaceholderItem(id=", this.A00);
    }
}
