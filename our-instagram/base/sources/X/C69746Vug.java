package X;

/* renamed from: X.Vug, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69746Vug {
    public final Q08 A00;
    public final U5Y A01;

    public C69746Vug(Q08 q08, U5Y u5y) {
        C14360o3.A0B(q08, 2);
        this.A01 = u5y;
        this.A00 = q08;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69746Vug) {
                C69746Vug c69746Vug = (C69746Vug) obj;
                if (!C14360o3.A0K(this.A01, c69746Vug.A01) || !C14360o3.A0K(this.A00, c69746Vug.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PendingResponse(queryDefinition=");
        sb.append(this.A01);
        sb.append(", response=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
