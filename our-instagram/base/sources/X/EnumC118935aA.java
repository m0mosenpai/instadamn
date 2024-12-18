package X;

/* renamed from: X.5aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC118935aA implements InterfaceC118945aB {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    @Override // X.InterfaceC118945aB
    public final boolean BBj() {
        int ordinal = ordinal();
        if (ordinal == 2 || ordinal == 0 || ordinal == 1) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // X.InterfaceC118945aB
    public final boolean CV1() {
        int ordinal = ordinal();
        if (ordinal == 2 || ordinal == 0) {
            return true;
        }
        if (ordinal != 1 && ordinal != 3) {
            throw new RuntimeException();
        }
        return false;
    }
}
