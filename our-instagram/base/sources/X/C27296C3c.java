package X;

/* renamed from: X.C3c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27296C3c extends AbstractC27455C9x {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27296C3c) {
                C27296C3c c27296C3c = (C27296C3c) obj;
                if (this.A01 != c27296C3c.A01 || this.A00 != c27296C3c.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + this.A00;
    }

    public C27296C3c(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EmuFlashMediaRendered(isMemu=");
        A1C.append(this.A01);
        A1C.append(", instanceKey=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
