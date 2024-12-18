package X;

/* renamed from: X.5kG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124545kG extends C0T6 implements InterfaceC124555kH {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C124545kG) {
                C124545kG c124545kG = (C124545kG) obj;
                if (this.A00 != c124545kG.A00 || this.A01 != c124545kG.A01 || this.A02 != c124545kG.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public C124545kG(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
