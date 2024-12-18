package X;

/* renamed from: X.3Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72053Ld extends C0T6 {
    public final EnumC58122lU A00;
    public final EnumC58162lY A01;
    public final InterfaceC54232eZ A02;
    public final java.util.Set A03;

    public C72053Ld(EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, InterfaceC54232eZ interfaceC54232eZ, java.util.Set set) {
        this.A01 = enumC58162lY;
        this.A00 = enumC58122lU;
        this.A03 = set;
        this.A02 = interfaceC54232eZ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72053Ld) {
                C72053Ld c72053Ld = (C72053Ld) obj;
                if (this.A01 != c72053Ld.A01 || this.A00 != c72053Ld.A00 || !C14360o3.A0K(this.A03, c72053Ld.A03) || !C14360o3.A0K(this.A02, c72053Ld.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31;
        java.util.Set set = this.A03;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        InterfaceC54232eZ interfaceC54232eZ = this.A02;
        return hashCode2 + (interfaceC54232eZ != null ? interfaceC54232eZ.hashCode() : 0);
    }
}
