package X;

/* loaded from: classes10.dex */
public final class SxM implements InterfaceC04680Mk {
    public final /* synthetic */ C63912Svn A00;

    @Override // X.InterfaceC04680Mk
    public final byte AjS(int i) {
        if (i == 4) {
            return this.A00.A05;
        }
        if (i == 6) {
            return (byte) 0;
        }
        throw AbstractC25230BEn.A0n("Not a byte field:", i);
    }

    @Override // X.InterfaceC04680Mk
    public final long BP8(int i) {
        if (i == 3) {
            return this.A00.A0A;
        }
        if (i == 5) {
            return -1L;
        }
        throw AbstractC25230BEn.A0n("Not a long field: ", i);
    }

    @Override // X.InterfaceC04680Mk
    public final int BYD() {
        return 7;
    }

    public SxM(C63912Svn c63912Svn) {
        this.A00 = c63912Svn;
    }

    @Override // X.InterfaceC04680Mk
    public final int BIh(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.A00.A07;
                }
                throw AbstractC25230BEn.A0n("Not an int field: ", i);
            }
            return this.A00.A09;
        }
        return this.A00.A06;
    }

    @Override // X.InterfaceC04680Mk
    public final short Bus(int i) {
        throw AbstractC166987dD.A12("No short field");
    }

    @Override // X.InterfaceC04680Mk
    public final int Bxh(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return 4;
            case 3:
            case 5:
                return 8;
            case 4:
            case 6:
                return 1;
            default:
                throw AbstractC25230BEn.A0n("Invalid field id ", i);
        }
    }
}
