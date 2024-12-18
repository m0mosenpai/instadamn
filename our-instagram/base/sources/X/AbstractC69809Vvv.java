package X;

/* renamed from: X.Vvv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69809Vvv {
    public static boolean A01(XGj xGj) {
        WFa wFa = new WFa(8);
        int i = W1j.A00(wFa, xGj).A00;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        xGj.E3s(wFa.A02, 0, 4);
        wFa.A0O(0);
        int A01 = wFa.A01();
        if (A01 != 1463899717) {
            AbstractC63374Sil.A03("WavHeaderReader", AnonymousClass001.A0O("Unsupported form type: ", A01));
            return false;
        }
        return true;
    }

    public static W1j A00(WFa wFa, XGj xGj, int i) {
        while (true) {
            W1j A00 = W1j.A00(wFa, xGj);
            int i2 = A00.A00;
            if (i2 != i) {
                AbstractC63374Sil.A04("WavHeaderReader", AnonymousClass001.A0O("Ignoring unknown WAV chunk: ", i2));
                long j = A00.A01;
                long j2 = j + 8;
                if (j % 2 != 0) {
                    j2++;
                }
                if (j2 <= 2147483647L) {
                    xGj.Em8((int) j2);
                } else {
                    throw new VCM(AnonymousClass001.A0O("Chunk is too large (~2GB+) to skip; id: ", i2), null, 1, false);
                }
            } else {
                return A00;
            }
        }
    }
}
