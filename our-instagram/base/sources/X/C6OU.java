package X;

/* renamed from: X.6OU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OU {
    public static final C6OU A03 = new C6OU(new JTC(0.0f, 0.0f), 0.0f, 0);
    public final float A00;
    public final int A01;
    public final InterfaceC58315Pt7 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6OU) {
                C6OU c6ou = (C6OU) obj;
                if (this.A00 != c6ou.A00 || !C14360o3.A0K(this.A02, c6ou.A02) || this.A01 != c6ou.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + this.A02.hashCode()) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProgressBarRangeInfo(current=");
        sb.append(this.A00);
        sb.append(", range=");
        sb.append(this.A02);
        sb.append(", steps=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C6OU(InterfaceC58315Pt7 interfaceC58315Pt7, float f, int i) {
        this.A00 = f;
        this.A02 = interfaceC58315Pt7;
        this.A01 = i;
        if (!Float.isNaN(f)) {
        } else {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }
}
