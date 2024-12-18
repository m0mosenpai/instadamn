package X;

/* loaded from: classes11.dex */
public final class WRG implements InterfaceC71938XBn {
    public final int A00;
    public final C68651VZj A01 = new Object();
    public final C70166WEi A02;

    @Override // X.InterfaceC71938XBn
    public final /* synthetic */ void Djt() {
    }

    private long A00(XGj xGj) {
        long length;
        long j;
        while (true) {
            long Bc8 = xGj.Bc8();
            length = xGj.getLength();
            j = length - 6;
            if (Bc8 >= j) {
                break;
            }
            C70166WEi c70166WEi = this.A02;
            int i = this.A00;
            C68651VZj c68651VZj = this.A01;
            byte[] bArr = new byte[2];
            xGj.E3s(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                xGj.EJn();
                xGj.AB0((int) (Bc8 - xGj.BeZ()));
            } else {
                WFa wFa = new WFa(16);
                System.arraycopy(bArr, 0, wFa.A02, 0, 2);
                byte[] bArr2 = wFa.A02;
                int i2 = 0;
                do {
                    int E3p = xGj.E3p(bArr2, i2 + 2, 14 - i2);
                    if (E3p == -1) {
                        break;
                    }
                    i2 += E3p;
                } while (i2 < 14);
                wFa.A0N(i2);
                xGj.EJn();
                xGj.AB0((int) (Bc8 - xGj.BeZ()));
                if (AbstractC69807Vvt.A01(wFa, c68651VZj, c70166WEi, i)) {
                    break;
                }
            }
            xGj.AB0(1);
        }
        long Bc82 = xGj.Bc8();
        if (Bc82 >= j) {
            xGj.AB0((int) (length - Bc82));
            return this.A02.A09;
        }
        return this.A01.A00;
    }

    @Override // X.InterfaceC71938XBn
    public final W2N EMY(XGj xGj, long j) {
        long BeZ = xGj.BeZ();
        long A00 = A00(xGj);
        long Bc8 = xGj.Bc8();
        xGj.AB0(Math.max(6, this.A02.A06));
        long A002 = A00(xGj);
        long Bc82 = xGj.Bc8();
        if (A00 <= j && A002 > j) {
            return new W2N(-9223372036854775807L, Bc8, 0);
        }
        if (A002 <= j) {
            return new W2N(A002, Bc82, -2);
        }
        return new W2N(A00, BeZ, -1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.VZj] */
    public WRG(C70166WEi c70166WEi, int i) {
        this.A02 = c70166WEi;
        this.A00 = i;
    }
}
