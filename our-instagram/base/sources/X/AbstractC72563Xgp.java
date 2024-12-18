package X;

import android.graphics.ImageFormat;
import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.Xgp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72563Xgp {
    public static final C72816Xnf A00(C72816Xnf c72816Xnf) {
        int i;
        InterfaceC73581YMa[] interfaceC73581YMaArr = c72816Xnf.A0C;
        int i2 = c72816Xnf.A01;
        if (i2 == 35 && interfaceC73581YMaArr != null) {
            ByteBuffer byteBuffer = ((Y9Y) interfaceC73581YMaArr[0]).A02;
            ByteBuffer byteBuffer2 = ((Y9Y) interfaceC73581YMaArr[2]).A02;
            int remaining = byteBuffer.remaining();
            int remaining2 = byteBuffer2.remaining();
            byte[] bArr = new byte[remaining + remaining2];
            byteBuffer.get(bArr, 0, remaining);
            byteBuffer2.get(bArr, remaining, remaining2);
            float[] fArr = c72816Xnf.A0B;
            Pair pair = c72816Xnf.A05;
            Long l = c72816Xnf.A08;
            return new C72816Xnf(pair, c72816Xnf.A06, l, c72816Xnf.A07, bArr, fArr, interfaceC73581YMaArr, 17, c72816Xnf.A03, c72816Xnf.A00, c72816Xnf.A02, c72816Xnf.A04, c72816Xnf.A09);
        }
        byte[] bArr2 = c72816Xnf.A0A;
        if (bArr2 == null) {
            if (interfaceC73581YMaArr != null && interfaceC73581YMaArr.length == 3) {
                int i3 = c72816Xnf.A03;
                int i4 = c72816Xnf.A00;
                InterfaceC73581YMa interfaceC73581YMa = interfaceC73581YMaArr[0];
                InterfaceC73581YMa interfaceC73581YMa2 = interfaceC73581YMaArr[1];
                InterfaceC73581YMa interfaceC73581YMa3 = interfaceC73581YMaArr[2];
                C14360o3.A0A(interfaceC73581YMa);
                C14360o3.A0A(interfaceC73581YMa2);
                C14360o3.A0A(interfaceC73581YMa3);
                Y9Y y9y = (Y9Y) interfaceC73581YMa;
                ByteBuffer byteBuffer3 = y9y.A02;
                Y9Y y9y2 = (Y9Y) interfaceC73581YMa2;
                ByteBuffer byteBuffer4 = y9y2.A02;
                Y9Y y9y3 = (Y9Y) interfaceC73581YMa3;
                ByteBuffer byteBuffer5 = y9y3.A02;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(i2);
                int i5 = bitsPerPixel / 8;
                int i6 = i3 * i4;
                bArr2 = new byte[(bitsPerPixel * i6) / 8];
                int i7 = y9y2.A01;
                byte[] bArr3 = new byte[i7];
                byte[] bArr4 = new byte[y9y3.A01];
                int i8 = i6 * i5;
                int i9 = i8 / 4;
                int i10 = 0;
                for (int i11 = 0; i11 < i4; i11++) {
                    int i12 = i5 * i3;
                    byteBuffer3.get(bArr2, i10, i12);
                    if (i4 - i11 != 1) {
                        byteBuffer3.position((byteBuffer3.position() + y9y.A01) - i12);
                    }
                    i10 += i12;
                    int i13 = i4 / 2;
                    if (i11 < i13) {
                        if (i13 - i11 == 1) {
                            i = ((i3 / 2) - y9y2.A00) + 1;
                        } else {
                            i = i7;
                        }
                        byteBuffer4.get(bArr3, 0, i);
                        byteBuffer5.get(bArr4, 0, i);
                        int i14 = i3 / 2;
                        for (int i15 = 0; i15 < i14; i15++) {
                            int i16 = (i11 * i3) / 2;
                            bArr2[i8 + i16 + i15] = bArr3[y9y2.A00 * i15];
                            bArr2[i8 + i9 + i16 + i15] = bArr4[y9y3.A00 * i15];
                        }
                    }
                }
            } else {
                bArr2 = null;
            }
        }
        float[] fArr2 = c72816Xnf.A0B;
        Pair pair2 = c72816Xnf.A05;
        Long l2 = c72816Xnf.A08;
        return new C72816Xnf(pair2, c72816Xnf.A06, l2, c72816Xnf.A07, bArr2, fArr2, interfaceC73581YMaArr, i2, c72816Xnf.A03, c72816Xnf.A00, c72816Xnf.A02, c72816Xnf.A04, c72816Xnf.A09);
    }
}
