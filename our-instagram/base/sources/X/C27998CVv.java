package X;

/* renamed from: X.CVv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27998CVv {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (obj instanceof C27998CVv) {
            C27998CVv c27998CVv = (C27998CVv) obj;
            if (c27998CVv.A01 == this.A01 && c27998CVv.A00 == this.A00 && c27998CVv.A03 == this.A03 && c27998CVv.A02 == this.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC167007dF.A07(this.A03, AbstractC166997dE.A00(Float.floatToIntBits(this.A01) * 31, this.A00)) + this.A02;
    }

    public C27998CVv(float f, float f2, int i, long j) {
        this.A01 = f;
        this.A00 = f2;
        this.A03 = j;
        this.A02 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RotaryScrollEvent(verticalScrollPixels=");
        A1C.append(this.A01);
        A1C.append(",horizontalScrollPixels=");
        A1C.append(this.A00);
        A1C.append(",uptimeMillis=");
        A1C.append(this.A03);
        A1C.append(",deviceId=");
        A1C.append(this.A02);
        return AbstractC167017dG.A0p(A1C);
    }
}
