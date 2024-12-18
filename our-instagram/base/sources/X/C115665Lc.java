package X;

/* renamed from: X.5Lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115665Lc extends AbstractC115675Ld implements C17w {
    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable B1t() {
        return Long.valueOf(this.A01);
    }

    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable BzZ() {
        return Long.valueOf(this.A00);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C115665Lc) {
            if (!isEmpty() || !((C115665Lc) obj).isEmpty()) {
                AbstractC115675Ld abstractC115675Ld = (AbstractC115675Ld) obj;
                if (this.A00 == abstractC115675Ld.A00 && this.A01 == abstractC115675Ld.A01) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.C17w
    public final boolean isEmpty() {
        if (this.A00 <= this.A01) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append("..");
        sb.append(this.A01);
        return sb.toString();
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.A00;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.A01;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public C115665Lc(long j, long j2) {
        super(j, j2);
    }
}
