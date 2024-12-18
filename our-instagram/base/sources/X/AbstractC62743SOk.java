package X;

/* renamed from: X.SOk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62743SOk {
    public final int A00;
    public final int A01;

    public final byte[] A00() {
        if (this instanceof RaP) {
            RaP raP = (RaP) this;
            int i = ((AbstractC62743SOk) raP).A01;
            int i2 = ((AbstractC62743SOk) raP).A00;
            int i3 = raP.A01;
            if (i == i3 && i2 == raP.A00) {
                return raP.A02;
            }
            int i4 = i * i2;
            byte[] bArr = new byte[i4];
            int i5 = 0;
            if (i == i3) {
                System.arraycopy(raP.A02, 0, bArr, 0, i4);
                return bArr;
            }
            for (int i6 = 0; i6 < i2; i6++) {
                System.arraycopy(raP.A02, i5, bArr, i6 * i, i);
                i5 += i3;
            }
            return bArr;
        }
        if (this instanceof RaO) {
            RaO raO = (RaO) this;
            int i7 = ((AbstractC62743SOk) raO).A01;
            int i8 = ((AbstractC62743SOk) raO).A00;
            int i9 = raO.A01;
            if (i7 == i9 && i8 == raO.A00) {
                return raO.A02;
            }
            int i10 = i7 * i8;
            byte[] bArr2 = new byte[i10];
            int i11 = 0;
            if (i7 == i9) {
                System.arraycopy(raO.A02, 0, bArr2, 0, i10);
                return bArr2;
            }
            for (int i12 = 0; i12 < i8; i12++) {
                System.arraycopy(raO.A02, i11, bArr2, i12 * i7, i7);
                i11 += i9;
            }
            return bArr2;
        }
        RaN raN = (RaN) this;
        byte[] A00 = raN.A00.A00();
        int i13 = raN.A01 * ((AbstractC62743SOk) raN).A00;
        byte[] bArr3 = new byte[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            bArr3[i14] = (byte) (255 - (A00[i14] & 255));
        }
        return bArr3;
    }

    public final byte[] A01(byte[] bArr, int i) {
        int i2;
        int i3;
        byte[] bArr2;
        if (this instanceof RaP) {
            RaP raP = (RaP) this;
            if (i >= 0 && i < ((AbstractC62743SOk) raP).A00) {
                i2 = ((AbstractC62743SOk) raP).A01;
                if (bArr == null || bArr.length < i2) {
                    bArr = new byte[i2];
                }
                i3 = i * raP.A01;
                bArr2 = raP.A02;
            } else {
                throw AbstractC25230BEn.A0n("Requested row is outside the image: ", i);
            }
        } else if (this instanceof RaO) {
            RaO raO = (RaO) this;
            if (i >= 0 && i < ((AbstractC62743SOk) raO).A00) {
                i2 = ((AbstractC62743SOk) raO).A01;
                if (bArr == null || bArr.length < i2) {
                    bArr = new byte[i2];
                }
                i3 = i * raO.A01;
                bArr2 = raO.A02;
            } else {
                throw AbstractC25230BEn.A0n("Requested row is outside the image: ", i);
            }
        } else {
            RaN raN = (RaN) this;
            byte[] A01 = raN.A00.A01(bArr, i);
            int i4 = raN.A01;
            for (int i5 = 0; i5 < i4; i5++) {
                A01[i5] = (byte) (255 - (A01[i5] & 255));
            }
            return A01;
        }
        System.arraycopy(bArr2, i3, bArr, 0, i2);
        return bArr;
    }

    public final String toString() {
        char c;
        int i = this.A01;
        byte[] bArr = new byte[i];
        int i2 = this.A00;
        StringBuilder A0q = AbstractC58318PtA.A0q((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = A01(bArr, i3);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                if (i5 < 64) {
                    c = '#';
                } else if (i5 < 128) {
                    c = '+';
                } else {
                    c = ' ';
                    if (i5 < 192) {
                        c = '.';
                    }
                }
                A0q.append(c);
            }
            A0q.append('\n');
        }
        return A0q.toString();
    }

    public AbstractC62743SOk(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
