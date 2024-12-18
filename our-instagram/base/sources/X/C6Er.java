package X;

/* renamed from: X.6Er, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Er {
    public final C6Ep A00;
    public final C6Ep A01;

    public C6Er(C6Ep c6Ep, C6Ep c6Ep2) {
        C14360o3.A0B(c6Ep, 1);
        this.A00 = c6Ep;
        this.A01 = c6Ep2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6Er) {
                C6Er c6Er = (C6Er) obj;
                if (!C14360o3.A0K(this.A00, c6Er.A00) || !C14360o3.A0K(this.A01, c6Er.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        C6Ep c6Ep = this.A01;
        return hashCode + (c6Ep == null ? 0 : c6Ep.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(sessionCacheSnapshot=");
        sb.append(this.A00);
        sb.append(", sessionlessCacheSnapshot=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
