package X;

/* loaded from: classes5.dex */
public final class CU2 {
    public final int A00;
    public final InterfaceC1131459c A01;
    public final C113525Ap A02;
    public final C28268CdD A03;

    public CU2(InterfaceC1131459c interfaceC1131459c, C113525Ap c113525Ap, C28268CdD c28268CdD, int i) {
        this.A02 = c113525Ap;
        this.A00 = i;
        this.A03 = c28268CdD;
        this.A01 = interfaceC1131459c;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ScrollCaptureCandidate(node=");
        A1C.append(this.A02);
        A1C.append(", depth=");
        A1C.append(this.A00);
        A1C.append(", viewportBoundsInWindow=");
        A1C.append(this.A03);
        A1C.append(MSV.A00(620));
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
