package X;

/* loaded from: classes8.dex */
public final class K5Z extends AbstractC46362Kfk {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K5Z) && this.A00 == ((K5Z) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("NearEnd(seconds=", ')', this.A00);
    }

    public K5Z(int i) {
        this.A00 = i;
    }
}
