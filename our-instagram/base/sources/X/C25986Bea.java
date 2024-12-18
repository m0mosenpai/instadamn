package X;

/* renamed from: X.Bea, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25986Bea extends C0T6 {
    public final long A00;
    public final long A01;
    public final InterfaceC65696TsI A02;

    public C25986Bea(InterfaceC65696TsI interfaceC65696TsI, long j, long j2) {
        C14360o3.A0B(interfaceC65696TsI, 3);
        this.A01 = j;
        this.A00 = j2;
        this.A02 = interfaceC65696TsI;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25986Bea) {
                C25986Bea c25986Bea = (C25986Bea) obj;
                if (this.A01 != c25986Bea.A01 || this.A00 != c25986Bea.A00 || !C14360o3.A0K(this.A02, c25986Bea.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A07(this.A00, AbstractC25227BEk.A03(this.A01)));
    }
}
