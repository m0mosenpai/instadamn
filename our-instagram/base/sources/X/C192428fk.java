package X;

/* renamed from: X.8fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192428fk implements Comparable {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C14360o3.A00(this.A00 ^ Integer.MIN_VALUE, ((C192428fk) obj).A00 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C192428fk) || i != ((C192428fk) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.A00 & 4294967295L);
    }
}
