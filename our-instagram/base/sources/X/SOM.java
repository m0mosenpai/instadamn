package X;

/* loaded from: classes10.dex */
public final class SOM {
    public final String A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SOM)) {
            return false;
        }
        return this.A00.equals(((SOM) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AnonymousClass001.A0g("Encoding{name=\"", this.A00, "\"}");
    }

    public SOM(String str) {
        this.A00 = str;
    }
}
