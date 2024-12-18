package X;

/* renamed from: X.3cK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76723cK extends C0T6 {
    public final long A00;
    public final InterfaceC16820sZ A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76723cK) {
                C76723cK c76723cK = (C76723cK) obj;
                if (this.A02 != c76723cK.A02 || this.A00 != c76723cK.A00 || !C14360o3.A0K(this.A01, c76723cK.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        long j = this.A00;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A01.hashCode();
    }

    public C76723cK(InterfaceC16820sZ interfaceC16820sZ, long j, boolean z) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = interfaceC16820sZ;
    }
}
