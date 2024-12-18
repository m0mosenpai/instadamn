package X;

import java.nio.ByteBuffer;

/* renamed from: X.68r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1349368r extends C56562ip implements C68Y {
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        int i2;
        C68g c68g;
        C1349468s[] c1349468sArr = (C1349468s[]) AbstractC1348468a.A06(C1349468s.class, byteBuffer, i, 0);
        if (c1349468sArr != null) {
            int length = c1349468sArr.length;
            this.A00 = length;
            byte[] bArr = new byte[length];
            this.A02 = bArr;
            this.A01 = 0;
            int i3 = 0;
            for (C1349468s c1349468s : c1349468sArr) {
                byte b = c1349468s.A00;
                if (b != 0 && b != 1) {
                    if (b != 2) {
                        if (b == 3) {
                            i3 += 6;
                        }
                    } else {
                        i3 += 4;
                    }
                } else {
                    i3 += 2;
                }
                this.A01 = i3;
            }
            float[] fArr = new float[i3];
            this.A03 = fArr;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                byte b2 = c1349468sArr[i5].A00;
                bArr[i5] = b2;
                if (b2 != 0 && b2 != 1) {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            int i6 = i4 + 1;
                            C1349468s c1349468s2 = c1349468sArr[i5];
                            C68g c68g2 = c1349468s2.A03;
                            fArr[i4] = c68g2.A00;
                            int i7 = i6 + 1;
                            fArr[i6] = c68g2.A01;
                            int i8 = i7 + 1;
                            C68g c68g3 = c1349468s2.A01;
                            fArr[i7] = c68g3.A00;
                            i4 = i8 + 1;
                            fArr[i8] = c68g3.A01;
                            i2 = i4 + 1;
                            c68g = c1349468s2.A02;
                        }
                    } else {
                        int i9 = i4 + 1;
                        C1349468s c1349468s3 = c1349468sArr[i5];
                        C68g c68g4 = c1349468s3.A03;
                        fArr[i4] = c68g4.A00;
                        i4 = i9 + 1;
                        fArr[i9] = c68g4.A01;
                        i2 = i4 + 1;
                        c68g = c1349468s3.A01;
                    }
                } else {
                    i2 = i4 + 1;
                    c68g = c1349468sArr[i5].A03;
                }
                fArr[i4] = c68g.A00;
                i4 = i2 + 1;
                fArr[i2] = c68g.A01;
            }
        }
    }
}
