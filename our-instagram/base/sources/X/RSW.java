package X;

/* loaded from: classes10.dex */
public final class RSW extends RSX {
    public final char[] A00;

    public RSW(C63018Sai alphabet) {
        super(alphabet, null);
        this.A00 = new char[512];
        char[] cArr = alphabet.A07;
        int i = 0;
        C18C.A0E(AbstractC167007dF.A1P(cArr.length, 16));
        do {
            char[] cArr2 = this.A00;
            cArr2[i] = cArr[i >>> 4];
            AbstractC58318PtA.A1Z(cArr, cArr2, i, i | 256);
            i++;
        } while (i < 256);
    }
}
