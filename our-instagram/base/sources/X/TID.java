package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TID implements Serializable {
    public static final TID A06 = new TID(C16D.A02, -1, -1, -1, -1);
    public final int A00;
    public final int A01;
    public final long A02;
    public final C16D A03;
    public final long A04;
    public transient String A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof TID)) {
                TID tid = (TID) obj;
                if (!this.A03.equals(tid.A03) || this.A01 != tid.A01 || this.A00 != tid.A00 || this.A04 != tid.A04 || this.A02 != tid.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 ^ 2) + this.A00) ^ ((int) this.A04)) + ((int) this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d3, code lost:
    
        if (r7 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004d, code lost:
    
        if (r0 >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TID.toString():java.lang.String");
    }

    public TID(C16D c16d, int i, int i2, long j, long j2) {
        this.A03 = c16d == null ? C16D.A02 : c16d;
        this.A02 = j;
        this.A04 = j2;
        this.A01 = i;
        this.A00 = i2;
    }
}
