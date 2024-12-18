package X;

/* renamed from: X.8NG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NG extends C0T6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;

    public C8NG(Integer num, float f, int i, int i2) {
        C14360o3.A0B(num, 4);
        this.A01 = i;
        this.A02 = i2;
        this.A00 = f;
        this.A03 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8NG) {
                C8NG c8ng = (C8NG) obj;
                if (this.A01 != c8ng.A01 || this.A02 != c8ng.A02 || Float.compare(this.A00, c8ng.A00) != 0 || this.A03 != c8ng.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int floatToIntBits = ((((this.A01 * 31) + this.A02) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "RIGHT";
                break;
            case 2:
                str = "END_NEXT";
                break;
            case 3:
                str = "END_CURRENT";
                break;
            default:
                str = "LEFT";
                break;
        }
        return floatToIntBits + str.hashCode() + intValue;
    }

    public C8NG() {
        this(C05F.A0N, 0.0f, 0, 0);
    }
}
