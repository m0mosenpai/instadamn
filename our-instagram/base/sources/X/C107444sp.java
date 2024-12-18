package X;

/* renamed from: X.4sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107444sp {
    public final float A00;
    public final C107434so A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C107444sp c107444sp = (C107444sp) obj;
            if (Float.compare(c107444sp.A00, this.A00) != 0 || !this.A01.equals(c107444sp.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A01.hashCode() * 31;
        float f = this.A00;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PropertyAnimation{ PropertyHandle=");
        sb.append(this.A01);
        sb.append(", TargetValue=");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    public C107444sp(C107434so c107434so, float f) {
        this.A01 = c107434so;
        this.A00 = f;
    }
}
