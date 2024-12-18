package X;

/* loaded from: classes11.dex */
public final class WSI implements InterfaceC71965XCv {
    public final int A00;
    public final int A01;
    public final WFa A02;

    @Override // X.InterfaceC71965XCv
    public final int B6w() {
        return this.A00;
    }

    @Override // X.InterfaceC71965XCv
    public final int Bq5() {
        return this.A01;
    }

    @Override // X.InterfaceC71965XCv
    public final int E8G() {
        int i = this.A00;
        if (i == -1) {
            return this.A02.A07();
        }
        return i;
    }

    public WSI(C70130W5r c70130W5r, C66408UFt c66408UFt) {
        WFa wFa = c66408UFt.A00;
        this.A02 = wFa;
        wFa.A0O(12);
        int A07 = wFa.A07();
        if ("audio/raw".equals(c70130W5r.A0Y)) {
            int i = c70130W5r.A0E;
            int i2 = c70130W5r.A06;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 21) {
                            if (i != 22) {
                                if (i != 268435456) {
                                    if (i != 1342177280) {
                                        if (i != 1610612736) {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                }
                            }
                        }
                        i2 *= 3;
                    }
                    i2 *= 4;
                }
                if (A07 != 0 || A07 % i2 != 0) {
                    AbstractC63374Sil.A04("AtomParsers", AnonymousClass001.A02(i2, A07, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                    A07 = i2;
                }
                this.A00 = A07;
                this.A01 = wFa.A07();
            }
            i2 *= 2;
            if (A07 != 0) {
            }
            AbstractC63374Sil.A04("AtomParsers", AnonymousClass001.A02(i2, A07, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
            A07 = i2;
        }
        if (A07 == 0) {
            A07 = -1;
        }
        this.A00 = A07;
        this.A01 = wFa.A07();
    }
}
