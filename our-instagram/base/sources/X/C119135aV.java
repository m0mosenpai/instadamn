package X;

/* renamed from: X.5aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119135aV {
    public float A00;
    public AbstractC119735bX A01;
    public boolean A02;

    public C119135aV(AbstractC119735bX abstractC119735bX, C95 c95, float f, boolean z) {
        this.A00 = 0.0f;
        this.A02 = true;
        this.A01 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C119135aV) {
                C119135aV c119135aV = (C119135aV) obj;
                if (Float.compare(this.A00, c119135aV.A00) != 0 || this.A02 != c119135aV.A02 || !C14360o3.A0K(this.A01, c119135aV.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RowColumnParentData(weight=");
        sb.append(this.A00);
        sb.append(", fill=");
        sb.append(this.A02);
        sb.append(", crossAxisAlignment=");
        sb.append(this.A01);
        sb.append(", flowLayoutData=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.A00) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (floatToIntBits + i) * 31;
        AbstractC119735bX abstractC119735bX = this.A01;
        if (abstractC119735bX == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC119735bX.hashCode();
        }
        return (i2 + hashCode) * 31;
    }

    public C119135aV() {
        this(null, null, 0.0f, true);
    }
}
