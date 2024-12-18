package X;

/* renamed from: X.8fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192498fr implements Comparable {
    public final short A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C14360o3.A00(this.A00 & 65535, ((C192498fr) obj).A00 & 65535);
    }

    public final boolean equals(Object obj) {
        short s = this.A00;
        if (!(obj instanceof C192498fr) || s != ((C192498fr) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return String.valueOf(this.A00 & 65535);
    }
}
