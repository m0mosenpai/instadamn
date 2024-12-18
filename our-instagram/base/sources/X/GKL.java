package X;

/* loaded from: classes6.dex */
public final class GKL implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;

    public GKL(HDJ hdj, int i) {
        this.A00 = i;
        this.A01 = hdj;
    }

    public static HEI A00(InterfaceC132965zL interfaceC132965zL, HDJ hdj) {
        hdj.A04.A01 = (C41030IEz) AbstractC132975zM.A01(interfaceC132965zL);
        return hdj.A04;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC42241xE
    public final void accept(Object obj) {
        HEI A00;
        int i;
        int i2 = this.A00;
        HDJ hdj = (HDJ) this.A01;
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        boolean z = interfaceC132965zL instanceof C132955zK;
        switch (i2) {
            case 0:
                if (!z) {
                    return;
                }
                A00 = A00(interfaceC132965zL, hdj);
                i = -1754603867;
                C0fA.A00(A00, i);
                return;
            case 1:
                if (!z) {
                    return;
                }
                A00 = A00(interfaceC132965zL, hdj);
                i = -443005557;
                C0fA.A00(A00, i);
                return;
            case 2:
                if (!z) {
                    return;
                }
                A00 = A00(interfaceC132965zL, hdj);
                i = 2025869831;
                C0fA.A00(A00, i);
                return;
            case 3:
                if (!z) {
                    return;
                }
                A00 = A00(interfaceC132965zL, hdj);
                i = -1269356279;
                C0fA.A00(A00, i);
                return;
            default:
                if (z) {
                    A00 = A00(interfaceC132965zL, hdj);
                    i = -750569954;
                    C0fA.A00(A00, i);
                    return;
                }
                return;
        }
    }
}
