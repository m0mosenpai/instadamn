package X;

/* renamed from: X.5Dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114205Dh {
    public static final C114205Dh A04 = new C114205Dh(0.0f, 0.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114205Dh) {
                C114205Dh c114205Dh = (C114205Dh) obj;
                if (Float.compare(this.A01, c114205Dh.A01) != 0 || Float.compare(this.A03, c114205Dh.A03) != 0 || Float.compare(this.A02, c114205Dh.A02) != 0 || Float.compare(this.A00, c114205Dh.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A00);
    }

    public final long A00() {
        float f = this.A01;
        float f2 = f + ((this.A02 - f) / 2.0f);
        float f3 = this.A03;
        return AbstractC119395aw.A00(f2, f3 + ((this.A00 - f3) / 2.0f));
    }

    public final long A01() {
        return C5YB.A00(this.A02 - this.A01, this.A00 - this.A03);
    }

    public final C114205Dh A02(float f, float f2) {
        return new C114205Dh(this.A01 + f, this.A03 + f2, this.A02 + f, this.A00 + f2);
    }

    public final C114205Dh A03(long j) {
        float f = this.A01;
        float A01 = C119365at.A01(j);
        float f2 = this.A03;
        float A02 = C119365at.A02(j);
        return new C114205Dh(f + A01, f2 + A02, this.A02 + A01, this.A00 + A02);
    }

    public final C114205Dh A04(C114205Dh c114205Dh) {
        return new C114205Dh(Math.max(this.A01, c114205Dh.A01), Math.max(this.A03, c114205Dh.A03), Math.min(this.A02, c114205Dh.A02), Math.min(this.A00, c114205Dh.A00));
    }

    public final boolean A05(C114205Dh c114205Dh) {
        if (this.A02 <= c114205Dh.A01 || c114205Dh.A02 <= this.A01 || this.A00 <= c114205Dh.A03 || c114205Dh.A00 <= this.A03) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A17("Rect.fromLTRB(", AbstractC224319vI.A00(this.A01), ", ", AbstractC224319vI.A00(this.A03), ", ", AbstractC224319vI.A00(this.A02), ", ", AbstractC224319vI.A00(this.A00), ')');
    }

    public C114205Dh(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }
}
