package X;

/* renamed from: X.SOl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62744SOl {
    public final Q03 A00;
    public final Q0H A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62744SOl) {
                C62744SOl c62744SOl = (C62744SOl) obj;
                if (!C14360o3.A0K(this.A01, c62744SOl.A01) || !C14360o3.A0K(this.A00, c62744SOl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0M(this.A01) * 31);
    }

    public C62744SOl(Q03 q03, Q0H q0h) {
        this.A01 = q0h;
        this.A00 = q03;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ComponentQueryDiskCacheResponse(cacheRecord=");
        A1C.append(this.A01);
        A1C.append(", summary=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
