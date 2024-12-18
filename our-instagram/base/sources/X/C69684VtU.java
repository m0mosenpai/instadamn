package X;

/* renamed from: X.VtU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69684VtU {
    public long A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C69684VtU c69684VtU = (C69684VtU) obj;
            if (this.A00 != c69684VtU.A00 || this.A01 != c69684VtU.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(Long.valueOf(this.A00), Long.valueOf(this.A01));
    }
}
