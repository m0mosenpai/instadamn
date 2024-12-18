package X;

/* loaded from: classes8.dex */
public final class L9T {
    public final Long A00;
    public final Long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof L9T) {
                L9T l9t = (L9T) obj;
                if (!C14360o3.A0K(this.A00, l9t.A00) || !C14360o3.A0K(this.A01, l9t.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public L9T(Long l, Long l2) {
        this.A00 = l;
        this.A01 = l2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BackupMetadata(creationTimeMillis=");
        A1C.append(this.A00);
        A1C.append(", lastSyncTimeMillis=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
