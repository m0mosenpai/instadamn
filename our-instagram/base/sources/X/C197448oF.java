package X;

/* renamed from: X.8oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197448oF extends AbstractC172157lk {
    public float A01 = 0.0f;
    public float A00 = 0.0f;
    public boolean A02 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C197448oF) {
                C197448oF c197448oF = (C197448oF) obj;
                if (Float.compare(this.A01, c197448oF.A01) != 0 || Float.compare(this.A00, c197448oF.A00) != 0 || this.A02 != c197448oF.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "REMIX";
    }

    public final int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return floatToIntBits + i;
    }
}
