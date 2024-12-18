package X;

/* renamed from: X.5mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125785mT extends C3ZN implements InterfaceC41211vV {
    public EnumC125765mR A00;
    public Integer A01;
    public String A02;

    @Override // X.C3ZN
    public final boolean equals(Object obj) {
        if (!(obj instanceof C125785mT) || !super.equals(obj)) {
            return false;
        }
        C125785mT c125785mT = (C125785mT) obj;
        if (c125785mT.A01 != this.A01 || c125785mT.A00 != this.A00 || !C14360o3.A0K(c125785mT.A02, this.A02)) {
            return false;
        }
        return true;
    }

    @Override // X.C3ZN
    public final int hashCode() {
        String str;
        int hashCode = super.hashCode() * 31;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "GRID";
                break;
            case 2:
                str = "GRID_CELL";
                break;
            default:
                str = "FEED";
                break;
        }
        return ((((hashCode + str.hashCode() + intValue) * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }
}
