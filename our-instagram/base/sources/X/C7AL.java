package X;

/* renamed from: X.7AL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AL extends C0T6 {
    public final float A00;
    public final C9BW A01;
    public final C7AK A02;
    public final Integer A03;
    public final Integer A04;

    public C7AL(C9BW c9bw, C7AK c7ak, Integer num, Integer num2, float f) {
        C14360o3.A0B(c7ak, 1);
        this.A02 = c7ak;
        this.A01 = c9bw;
        this.A00 = f;
        this.A03 = num;
        this.A04 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7AL) {
                C7AL c7al = (C7AL) obj;
                if (this.A02 != c7al.A02 || !C14360o3.A0K(this.A01, c7al.A01) || Float.compare(this.A00, c7al.A00) != 0 || !C14360o3.A0K(this.A03, c7al.A03) || this.A04 != c7al.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A02.hashCode() * 31;
        C9BW c9bw = this.A01;
        int i = 0;
        if (c9bw == null) {
            hashCode = 0;
        } else {
            hashCode = c9bw.hashCode();
        }
        int floatToIntBits = (((hashCode3 + hashCode) * 31) + Float.floatToIntBits(this.A00)) * 31;
        Integer num = this.A03;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = (floatToIntBits + hashCode2) * 31;
        Integer num2 = this.A04;
        if (num2 != null) {
            i = AbstractC58462m5.A01(num2).hashCode() + num2.intValue();
        }
        return i2 + i;
    }
}
