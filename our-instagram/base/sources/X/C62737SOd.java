package X;

/* renamed from: X.SOd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62737SOd {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62737SOd) {
                C62737SOd c62737SOd = (C62737SOd) obj;
                if (!C14360o3.A0K(this.A01, c62737SOd.A01) || this.A00 != c62737SOd.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0l("AuthTicketCapabilities(name=", this.A01, ", ttl=", ')', this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }

    public C62737SOd(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
