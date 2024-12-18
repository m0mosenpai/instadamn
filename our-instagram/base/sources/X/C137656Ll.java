package X;

/* renamed from: X.6Ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137656Ll {
    public static final C137656Ll A08 = AbstractC137666Lm.A00(0.0f, 0.0f, 0.0f, 0.0f, AbstractC137646Lk.A00);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137656Ll) {
                C137656Ll c137656Ll = (C137656Ll) obj;
                if (Float.compare(this.A01, c137656Ll.A01) == 0 && Float.compare(this.A03, c137656Ll.A03) == 0 && Float.compare(this.A02, c137656Ll.A02) == 0 && Float.compare(this.A00, c137656Ll.A00) == 0) {
                    long j = this.A06;
                    long j2 = c137656Ll.A06;
                    long j3 = AbstractC137646Lk.A00;
                    if (j != j2 || this.A07 != c137656Ll.A07 || this.A05 != c137656Ll.A05 || this.A04 != c137656Ll.A04) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A00)) * 31;
        long j = this.A06;
        long j2 = AbstractC137646Lk.A00;
        int i = (floatToIntBits + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.A07;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A05;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.A04;
        return i3 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb;
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A05;
        long j4 = this.A04;
        String A15 = AnonymousClass001.A15(AbstractC224319vI.A00(this.A01), ", ", AbstractC224319vI.A00(this.A03), ", ", AbstractC224319vI.A00(this.A02), ", ", AbstractC224319vI.A00(this.A00));
        long j5 = AbstractC137646Lk.A00;
        boolean z = false;
        if (j == j2) {
            z = true;
        }
        if (z && j2 == j3 && j3 == j4) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float A00 = AbstractC137646Lk.A00(j);
            sb = new StringBuilder();
            sb.append("RoundRect(rect=");
            if (intBitsToFloat == A00) {
                sb.append(A15);
                sb.append(", radius=");
            } else {
                sb.append(A15);
                sb.append(", x=");
                sb.append(AbstractC224319vI.A00(intBitsToFloat));
                sb.append(", y=");
                intBitsToFloat = A00;
            }
            sb.append(AbstractC224319vI.A00(intBitsToFloat));
        } else {
            sb = new StringBuilder();
            sb.append("RoundRect(rect=");
            sb.append(A15);
            sb.append(", topLeft=");
            sb.append((Object) AbstractC137646Lk.A01(j));
            sb.append(", topRight=");
            sb.append((Object) AbstractC137646Lk.A01(j2));
            sb.append(AbstractC58317Pt9.A00(422));
            sb.append((Object) AbstractC137646Lk.A01(j3));
            sb.append(AbstractC58317Pt9.A00(421));
            sb.append((Object) AbstractC137646Lk.A01(j4));
        }
        sb.append(')');
        return sb.toString();
    }

    public C137656Ll(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
    }
}
