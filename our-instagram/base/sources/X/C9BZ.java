package X;

/* renamed from: X.9BZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BZ extends C0T6 implements InterfaceC166427cB {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C9BZ(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C9BZ) {
            C9BZ c9bz = (C9BZ) obj;
            if (c9bz.A00 != i || this.A01 != c9bz.A01 || !C14360o3.A0K(this.A02, c9bz.A02) || !C14360o3.A0K(this.A03, c9bz.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }
}
