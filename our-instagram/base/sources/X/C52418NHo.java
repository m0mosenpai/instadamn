package X;

/* renamed from: X.NHo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52418NHo extends O28 {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52418NHo) {
                C52418NHo c52418NHo = (C52418NHo) obj;
                if (this.A00 != c52418NHo.A00 || this.A01 != c52418NHo.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public C52418NHo() {
        this(10, false);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, this.A00 * 31);
    }

    public C52418NHo(int i, boolean z) {
        super(C05F.A01);
        this.A00 = i;
        this.A01 = z;
    }
}
