package X;

/* renamed from: X.5Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116465Pb {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C116465Pb)) {
            return false;
        }
        C116465Pb c116465Pb = (C116465Pb) obj;
        return this.A01 == c116465Pb.A01 && this.A00 == c116465Pb.A00;
    }

    public final int hashCode() {
        return ((16337 + this.A01) * 31) + this.A00;
    }

    public C116465Pb(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
