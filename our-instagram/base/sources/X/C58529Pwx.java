package X;

/* renamed from: X.Pwx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58529Pwx extends RT7 {
    public final int A01;
    public final SXz A03;
    public final int A00 = 12;
    public final int A02 = 16;

    public C58529Pwx(SXz sXz, int i) {
        this.A01 = i;
        this.A03 = sXz;
    }

    public final boolean equals(Object o) {
        if (!(o instanceof C58529Pwx)) {
            return false;
        }
        C58529Pwx c58529Pwx = (C58529Pwx) o;
        if (c58529Pwx.A01 != this.A01 || c58529Pwx.A00 != this.A00 || c58529Pwx.A02 != this.A02 || c58529Pwx.A03 != this.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(C58529Pwx.class, Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AesGcm Parameters (variant: ");
        AbstractC58322PtE.A1R(A1C, this.A03);
        A1C.append(this.A00);
        A1C.append("-byte IV, ");
        A1C.append(this.A02);
        A1C.append("-byte tag, and ");
        A1C.append(this.A01);
        return AbstractC166997dE.A0x("-byte key)", A1C);
    }
}
