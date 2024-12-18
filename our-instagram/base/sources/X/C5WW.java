package X;

/* renamed from: X.5WW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WW implements C5W2 {
    public final C62Y A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5WW) {
                C5WW c5ww = (C5WW) obj;
                if (!C14360o3.A0K(this.A00, c5ww.A00) || Float.compare(this.A01, c5ww.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BrushStyle(value=");
        sb.append(this.A00);
        sb.append(", alpha=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.C5W2
    public final float AbP() {
        return this.A01;
    }

    @Override // X.C5W2
    public final C6L5 AiZ() {
        return this.A00;
    }

    @Override // X.C5W2
    public final long ApK() {
        return C1132359l.A08;
    }

    public C5WW(C62Y c62y, float f) {
        this.A00 = c62y;
        this.A01 = f;
    }
}
