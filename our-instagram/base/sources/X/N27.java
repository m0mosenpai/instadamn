package X;

/* loaded from: classes9.dex */
public final class N27 extends AbstractC53437NkQ {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC53437NkQ) {
            return this.A00.equals(((N27) ((AbstractC53437NkQ) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AnonymousClass001.A0g("IntegrityTokenResponse{token=", this.A00, "}");
    }
}
