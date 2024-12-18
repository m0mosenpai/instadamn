package X;

/* renamed from: X.BeV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25981BeV extends C0T6 {
    public final InterfaceC1333460b A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25981BeV) {
                C25981BeV c25981BeV = (C25981BeV) obj;
                if (this.A01 != c25981BeV.A01 || !C14360o3.A0K(this.A00, c25981BeV.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    public C25981BeV(InterfaceC1333460b interfaceC1333460b, boolean z) {
        this.A01 = z;
        this.A00 = interfaceC1333460b;
    }
}
