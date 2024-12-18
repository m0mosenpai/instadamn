package X;

/* loaded from: classes11.dex */
public final class WSJ implements InterfaceC71965XCv {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final WFa A04;

    @Override // X.InterfaceC71965XCv
    public final int B6w() {
        return -1;
    }

    @Override // X.InterfaceC71965XCv
    public final int Bq5() {
        return this.A03;
    }

    @Override // X.InterfaceC71965XCv
    public final int E8G() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A05();
        }
        if (i == 16) {
            return this.A04.A08();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 == 0) {
            int A05 = this.A04.A05();
            this.A00 = A05;
            return (A05 & 240) >> 4;
        }
        return this.A00 & 15;
    }

    public WSJ(C66408UFt c66408UFt) {
        WFa wFa = c66408UFt.A00;
        this.A04 = wFa;
        wFa.A0O(12);
        this.A02 = wFa.A07() & 255;
        this.A03 = wFa.A07();
    }
}
