package X;

/* loaded from: classes9.dex */
public final class NKT extends AbstractC53468Nkv {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NKT) && this.A00 == ((NKT) obj).A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public NKT(boolean z) {
        this.A00 = z;
    }
}
