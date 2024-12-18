package X;

import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class WFI {
    public long A00;
    public VJY A01;
    public VJY A02;
    public VJY A03;
    public final WFa A04 = new WFa(32);
    public final InterfaceC71875X8i A05;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.VJY, java.lang.Object] */
    public static int A00(WFI wfi, int i) {
        C68650VZi c68650VZi;
        VJY vjy = wfi.A03;
        VJY vjy2 = vjy;
        if (vjy.A03 == null) {
            WRB wrb = (WRB) wfi.A05;
            synchronized (wrb) {
                int i2 = wrb.A00 + 1;
                wrb.A00 = i2;
                int i3 = wrb.A01;
                if (i3 > 0) {
                    C68650VZi[] c68650VZiArr = wrb.A02;
                    int i4 = i3 - 1;
                    wrb.A01 = i4;
                    c68650VZi = c68650VZiArr[i4];
                    c68650VZi.getClass();
                    wrb.A02[wrb.A01] = null;
                } else {
                    c68650VZi = new C68650VZi(new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED]);
                    C68650VZi[] c68650VZiArr2 = wrb.A02;
                    int length = c68650VZiArr2.length;
                    if (i2 > length) {
                        wrb.A02 = (C68650VZi[]) Arrays.copyOf(c68650VZiArr2, length * 2);
                    }
                }
            }
            vjy2 = wfi.A03;
            long j = vjy2.A00;
            ?? obj = new Object();
            WDn.A02(AbstractC25229BEm.A1Z(obj.A03));
            obj.A01 = j;
            obj.A00 = j + OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
            vjy.A03 = c68650VZi;
            vjy.A02 = obj;
        }
        return Math.min(i, (int) (vjy2.A00 - wfi.A00));
    }

    public static VJY A01(WFa wFa, C66397UFi c66397UFi, VJY vjy, C69033Vga c69033Vga) {
        long j;
        ByteBuffer byteBuffer;
        int i;
        if ((((AbstractC68228VIo) c66397UFi).A00 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            long j2 = c69033Vga.A01;
            wFa.A0M(1);
            VJY A03 = A03(vjy, wFa.A02, 1, j2);
            long j3 = j2 + 1;
            byte b = wFa.A02[0];
            boolean A1M = AbstractC167007dF.A1M(b & 128);
            int i2 = b & Byte.MAX_VALUE;
            C69315VlN c69315VlN = c66397UFi.A04;
            byte[] bArr = c69315VlN.A00;
            if (bArr == null) {
                c69315VlN.A00 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            vjy = A03(A03, c69315VlN.A00, i2, j3);
            long j4 = j3 + i2;
            if (A1M) {
                wFa.A0M(2);
                vjy = A03(vjy, wFa.A02, 2, j4);
                j4 += 2;
                i = wFa.A08();
            } else {
                i = 1;
            }
            int[] iArr = c69315VlN.A02;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = c69315VlN.A03;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (A1M) {
                int i3 = i * 6;
                wFa.A0M(i3);
                vjy = A03(vjy, wFa.A02, i3, j4);
                j4 += i3;
                wFa.A0O(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = wFa.A08();
                    iArr2[i4] = wFa.A07();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c69033Vga.A00 - ((int) (j4 - c69033Vga.A01));
            }
            C69702Vtx c69702Vtx = c69033Vga.A02;
            byte[] bArr2 = c69702Vtx.A03;
            byte[] bArr3 = c69315VlN.A00;
            int i5 = c69702Vtx.A01;
            int i6 = c69702Vtx.A02;
            int i7 = c69702Vtx.A00;
            c69315VlN.A02 = iArr;
            c69315VlN.A03 = iArr2;
            c69315VlN.A01 = bArr2;
            c69315VlN.A00 = bArr3;
            MediaCodec.CryptoInfo cryptoInfo = c69315VlN.A04;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            C68876VdY c68876VdY = c69315VlN.A05;
            c68876VdY.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = c68876VdY.A00;
            pattern.set(i6, i7);
            c68876VdY.A01.setPattern(pattern);
            long j5 = c69033Vga.A01;
            int i8 = (int) (j4 - j5);
            c69033Vga.A01 = j5 + i8;
            c69033Vga.A00 -= i8;
        }
        if ((((AbstractC68228VIo) c66397UFi).A00 & 268435456) == 268435456) {
            wFa.A0M(4);
            VJY A032 = A03(vjy, wFa.A02, 4, c69033Vga.A01);
            int A07 = wFa.A07();
            c69033Vga.A01 += 4;
            c69033Vga.A00 -= 4;
            c66397UFi.A01(A07);
            vjy = A02(A032, c66397UFi.A01, A07, c69033Vga.A01);
            c69033Vga.A01 += A07;
            int i9 = c69033Vga.A00 - A07;
            c69033Vga.A00 = i9;
            ByteBuffer byteBuffer2 = c66397UFi.A02;
            if (byteBuffer2 != null && byteBuffer2.capacity() >= i9) {
                c66397UFi.A02.clear();
            } else {
                c66397UFi.A02 = ByteBuffer.allocate(i9);
            }
            j = c69033Vga.A01;
            byteBuffer = c66397UFi.A02;
        } else {
            c66397UFi.A01(c69033Vga.A00);
            j = c69033Vga.A01;
            byteBuffer = c66397UFi.A01;
        }
        return A02(vjy, byteBuffer, c69033Vga.A00, j);
    }

    public static VJY A02(VJY vjy, ByteBuffer byteBuffer, int i, long j) {
        while (j >= vjy.A00) {
            vjy = vjy.A02;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (vjy.A00 - j));
            byteBuffer.put(vjy.A03.A00, (int) (j - vjy.A01), min);
            i -= min;
            j += min;
            if (j == vjy.A00) {
                vjy = vjy.A02;
            }
        }
        return vjy;
    }

    public static VJY A03(VJY vjy, byte[] bArr, int i, long j) {
        while (j >= vjy.A00) {
            vjy = vjy.A02;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (vjy.A00 - j));
            System.arraycopy(vjy.A03.A00, (int) (j - vjy.A01), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == vjy.A00) {
                vjy = vjy.A02;
            }
        }
        return vjy;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.VJY, java.lang.Object] */
    public WFI(InterfaceC71875X8i interfaceC71875X8i) {
        this.A05 = interfaceC71875X8i;
        ?? obj = new Object();
        WDn.A02(AbstractC25229BEm.A1Z(obj.A03));
        obj.A01 = 0L;
        obj.A00 = OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
        this.A01 = obj;
        this.A02 = obj;
        this.A03 = obj;
    }
}
