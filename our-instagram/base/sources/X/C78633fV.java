package X;

/* renamed from: X.3fV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78633fV {
    public final float A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C78633fV)) {
            return false;
        }
        C78633fV c78633fV = (C78633fV) obj;
        Integer num = this.A01;
        if (num != c78633fV.A01) {
            return false;
        }
        if (num != C05F.A00 && num != C05F.A0N && Float.compare(this.A00, c78633fV.A00) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.A00);
        switch (this.A01.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return "auto";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.A00);
                sb.append("%");
                return sb.toString();
            }
            return Float.toString(this.A00);
        }
        return "undefined";
    }

    public C78633fV(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}
