package X;

/* loaded from: classes10.dex */
public final class RMG extends RMH {
    public final char[] A00;

    public RMG(C63004SaS c63004SaS) {
        super(c63004SaS, null);
        char[] cArr = new char[512];
        this.A00 = cArr;
        char[] cArr2 = c63004SaS.A07;
        int i = 0;
        if (cArr2.length != 16) {
            throw AbstractC58318PtA.A0Y();
        }
        do {
            cArr[i] = cArr2[i >>> 4];
            AbstractC58318PtA.A1Z(cArr2, cArr, i, i | 256);
            i++;
        } while (i < 256);
    }
}
