package X;

/* renamed from: X.60c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1333560c implements InterfaceC1333460b {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1333560c)) {
            return false;
        }
        C1333560c c1333560c = (C1333560c) obj;
        if (!C119145aW.A01(this.A02, c1333560c.A02) || !C119145aW.A01(this.A03, c1333560c.A03) || !C119145aW.A01(this.A01, c1333560c.A01) || !C119145aW.A01(this.A00, c1333560c.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A02) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaddingValues(start=");
        sb.append((Object) C119145aW.A00(this.A02));
        sb.append(", top=");
        sb.append((Object) C119145aW.A00(this.A03));
        sb.append(", end=");
        sb.append((Object) C119145aW.A00(this.A01));
        sb.append(", bottom=");
        sb.append((Object) C119145aW.A00(this.A00));
        sb.append(')');
        return sb.toString();
    }

    public C1333560c(float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        if (f >= 0.0f) {
            if (f2 >= 0.0f) {
                if (f3 >= 0.0f) {
                    if (f4 >= 0.0f) {
                        return;
                    } else {
                        throw new IllegalArgumentException("Bottom padding must be non-negative");
                    }
                }
                throw new IllegalArgumentException("End padding must be non-negative");
            }
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        throw new IllegalArgumentException("Start padding must be non-negative");
    }
}
