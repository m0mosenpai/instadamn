package X;

/* renamed from: X.8fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192568fy implements Comparable {
    public final byte A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C14360o3.A00(this.A00 & 255, ((C192568fy) obj).A00 & 255);
    }

    public final boolean equals(Object obj) {
        byte b = this.A00;
        if (!(obj instanceof C192568fy) || b != ((C192568fy) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return String.valueOf(this.A00 & 255);
    }
}
