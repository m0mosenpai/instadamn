package X;

/* renamed from: X.62V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62V extends AbstractC119825bg {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final InterfaceC72011XEz A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62V) {
                C62V c62v = (C62V) obj;
                if (this.A01 != c62v.A01 || this.A00 != c62v.A00 || this.A02 != c62v.A02 || this.A03 != c62v.A03 || !C14360o3.A0K(this.A04, c62v.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = ((((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A02) * 31) + this.A03) * 31;
        InterfaceC72011XEz interfaceC72011XEz = this.A04;
        if (interfaceC72011XEz != null) {
            i = interfaceC72011XEz.hashCode();
        } else {
            i = 0;
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Stroke(width=");
        sb.append(this.A01);
        sb.append(", miter=");
        sb.append(this.A00);
        sb.append(", cap=");
        int i = this.A02;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = "Square";
        }
        sb.append((Object) str);
        sb.append(", join=");
        if (this.A03 == 0) {
            str2 = "Miter";
        } else {
            str2 = "Round";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C62V(InterfaceC72011XEz interfaceC72011XEz, float f, float f2, int i, int i2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = interfaceC72011XEz;
    }
}
