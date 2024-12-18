package X;

/* renamed from: X.3Lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72263Lz extends C0T6 implements InterfaceC41141vN {
    public final C38321qM A00;
    public final EnumC75183Zl A01;
    public final InterfaceC30945Dj2 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72263Lz) {
                C72263Lz c72263Lz = (C72263Lz) obj;
                if (!C14360o3.A0K(this.A00, c72263Lz.A00) || this.A01 != c72263Lz.A01 || !C14360o3.A0K(this.A02, c72263Lz.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        EnumC75183Zl enumC75183Zl = this.A01;
        int hashCode2 = (hashCode + (enumC75183Zl == null ? 0 : enumC75183Zl.hashCode())) * 31 * 31;
        InterfaceC30945Dj2 interfaceC30945Dj2 = this.A02;
        return hashCode2 + (interfaceC30945Dj2 != null ? interfaceC30945Dj2.hashCode() : 0);
    }

    public C72263Lz(C38321qM c38321qM, EnumC75183Zl enumC75183Zl, InterfaceC30945Dj2 interfaceC30945Dj2) {
        this.A00 = c38321qM;
        this.A01 = enumC75183Zl;
        this.A02 = interfaceC30945Dj2;
    }
}
