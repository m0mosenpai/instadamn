package X;

/* renamed from: X.CnJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28787CnJ implements InterfaceC30910DiN {
    public final C27963CUj A00;
    public final C27983CVf A01;
    public final boolean A02;

    @Override // X.InterfaceC30910DiN
    public final Integer AtN() {
        C27963CUj c27963CUj = this.A00;
        int i = c27963CUj.A02;
        int i2 = c27963CUj.A00;
        if (i < i2) {
            return C05F.A01;
        }
        if (i > i2) {
            return C05F.A00;
        }
        return C05F.A0C;
    }

    public C28787CnJ(C27963CUj c27963CUj, C27983CVf c27983CVf, boolean z) {
        this.A02 = z;
        this.A01 = c27983CVf;
        this.A00 = c27963CUj;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SingleSelectionLayout(isStartHandle=");
        A1C.append(this.A02);
        A1C.append(", crossed=");
        switch (AtN().intValue()) {
            case 0:
                str = "CROSSED";
                break;
            case 1:
                str = "NOT_CROSSED";
                break;
            default:
                str = "COLLAPSED";
                break;
        }
        A1C.append(str);
        A1C.append(", info=\n\t");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
