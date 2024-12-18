package X;

/* renamed from: X.6FO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FO {
    public final C6Er A00;

    public final boolean equals(Object obj) {
        C6Er c6Er = this.A00;
        if (!(obj instanceof C6FO) || !C14360o3.A0K(c6Er, ((C6FO) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        C6Er c6Er = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(cacheStoreSnapshot=");
        sb.append(c6Er);
        sb.append(')');
        return sb.toString();
    }
}
