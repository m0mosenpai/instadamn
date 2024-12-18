package X;

/* renamed from: X.Gxk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38581Gxk extends C0T6 {
    public final long A00 = 86400000;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C38581Gxk) || this.A00 != ((C38581Gxk) obj).A00) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }
}
