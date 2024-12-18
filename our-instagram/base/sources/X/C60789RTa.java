package X;

/* renamed from: X.RTa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60789RTa extends AbstractC60791RTc {
    public final RTX A00;
    public final RTY A01;
    public final RTZ A02;
    public final SY6 A03;

    public final boolean equals(Object o) {
        if (!(o instanceof C60789RTa)) {
            return false;
        }
        C60789RTa c60789RTa = (C60789RTa) o;
        if (this.A02 != c60789RTa.A02 || this.A01 != c60789RTa.A01 || this.A00 != c60789RTa.A00 || this.A03 != c60789RTa.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(C60789RTa.class, this.A02, this.A01, this.A00, this.A03);
    }

    public C60789RTa(RTX kem, RTY kdf, RTZ aead, SY6 variant) {
        this.A02 = aead;
        this.A01 = kdf;
        this.A00 = kem;
        this.A03 = variant;
    }
}
