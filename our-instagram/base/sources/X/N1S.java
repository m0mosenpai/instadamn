package X;

/* loaded from: classes9.dex */
public final class N1S extends AbstractC53639Nnk {
    public final C51738MtL A00;
    public final boolean A01;

    public N1S() {
        this(new C51738MtL(15, false), false);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Connecting(isStreamingOverWifi=");
        A1C.append(this.A01);
        A1C.append(", statusIndicatorAttributes=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public N1S(C51738MtL c51738MtL, boolean z) {
        this.A01 = z;
        this.A00 = c51738MtL;
    }
}
