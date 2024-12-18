package X;

import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.4al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98064al {
    public long A00;
    public C98074am A01;
    public C98074am A02;
    public C98074am A03;
    public final InterfaceC96344Us A04;
    public final C97974ac A05 = new C97974ac(32);

    public static int A00(C98064al c98064al, int i) {
        C96354Ut c96354Ut;
        C98074am c98074am = c98064al.A03;
        C98074am c98074am2 = c98074am;
        if (c98074am.A03 == null) {
            C96334Ur c96334Ur = (C96334Ur) c98064al.A04;
            synchronized (c96334Ur) {
                int i2 = c96334Ur.A00 + 1;
                c96334Ur.A00 = i2;
                int i3 = c96334Ur.A01;
                if (i3 > 0) {
                    C96354Ut[] c96354UtArr = c96334Ur.A02;
                    int i4 = i3 - 1;
                    c96334Ur.A01 = i4;
                    c96354Ut = c96354UtArr[i4];
                    c96354Ut.getClass();
                    c96334Ur.A02[c96334Ur.A01] = null;
                } else {
                    c96354Ut = new C96354Ut(new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED]);
                    C96354Ut[] c96354UtArr2 = c96334Ur.A02;
                    int length = c96354UtArr2.length;
                    if (i2 > length) {
                        c96334Ur.A02 = (C96354Ut[]) Arrays.copyOf(c96354UtArr2, length * 2);
                    }
                }
            }
            c98074am2 = c98064al.A03;
            C98074am c98074am3 = new C98074am(c98074am2.A00);
            c98074am.A03 = c96354Ut;
            c98074am.A02 = c98074am3;
        }
        return Math.min(i, (int) (c98074am2.A00 - c98064al.A00));
    }

    public static C98074am A01(C96094Ts c96094Ts, C98074am c98074am, C98084an c98084an, C97974ac c97974ac) {
        long j;
        ByteBuffer byteBuffer;
        int i;
        if ((((AbstractC96104Tt) c96094Ts).A00 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            long j2 = c98084an.A01;
            c97974ac.A0E(1);
            C98074am A03 = A03(c98074am, c97974ac.A02, 1, j2);
            long j3 = j2 + 1;
            byte b = c97974ac.A02[0];
            boolean z = false;
            if ((b & 128) != 0) {
                z = true;
            }
            int i2 = b & Byte.MAX_VALUE;
            C96114Tu c96114Tu = c96094Ts.A06;
            byte[] bArr = c96114Tu.A00;
            if (bArr == null) {
                c96114Tu.A00 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c98074am = A03(A03, c96114Tu.A00, i2, j3);
            long j4 = j3 + i2;
            if (z) {
                c97974ac.A0E(2);
                c98074am = A03(c98074am, c97974ac.A02, 2, j4);
                j4 += 2;
                i = c97974ac.A05();
            } else {
                i = 1;
            }
            int[] iArr = c96114Tu.A02;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = c96114Tu.A03;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                c97974ac.A0E(i3);
                c98074am = A03(c98074am, c97974ac.A02, i3, j4);
                j4 += i3;
                c97974ac.A0G(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = c97974ac.A05();
                    iArr2[i4] = c97974ac.A04();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c98084an.A00 - ((int) (j4 - c98084an.A01));
            }
            C98094ao c98094ao = c98084an.A02;
            byte[] bArr2 = c98094ao.A03;
            byte[] bArr3 = c96114Tu.A00;
            int i5 = c98094ao.A01;
            int i6 = c98094ao.A02;
            int i7 = c98094ao.A00;
            c96114Tu.A02 = iArr;
            c96114Tu.A03 = iArr2;
            c96114Tu.A01 = bArr2;
            c96114Tu.A00 = bArr3;
            MediaCodec.CryptoInfo cryptoInfo = c96114Tu.A04;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            C96124Tv c96124Tv = c96114Tu.A05;
            c96124Tv.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = c96124Tv.A00;
            pattern.set(i6, i7);
            c96124Tv.A01.setPattern(pattern);
            long j5 = c98084an.A01;
            int i8 = (int) (j4 - j5);
            c98084an.A01 = j5 + i8;
            c98084an.A00 -= i8;
        }
        if ((((AbstractC96104Tt) c96094Ts).A00 & 268435456) == 268435456) {
            c97974ac.A0E(4);
            C98074am A032 = A03(c98074am, c97974ac.A02, 4, c98084an.A01);
            int A04 = c97974ac.A04();
            c98084an.A01 += 4;
            c98084an.A00 -= 4;
            c96094Ts.A01(A04);
            c98074am = A02(A032, c96094Ts.A02, A04, c98084an.A01);
            c98084an.A01 += A04;
            int i9 = c98084an.A00 - A04;
            c98084an.A00 = i9;
            ByteBuffer byteBuffer2 = c96094Ts.A03;
            if (byteBuffer2 != null && byteBuffer2.capacity() >= i9) {
                c96094Ts.A03.clear();
            } else {
                c96094Ts.A03 = ByteBuffer.allocate(i9);
            }
            j = c98084an.A01;
            byteBuffer = c96094Ts.A03;
        } else {
            c96094Ts.A01(c98084an.A00);
            j = c98084an.A01;
            byteBuffer = c96094Ts.A02;
        }
        return A02(c98074am, byteBuffer, c98084an.A00, j);
    }

    public static C98074am A02(C98074am c98074am, ByteBuffer byteBuffer, int i, long j) {
        while (j >= c98074am.A00) {
            c98074am = c98074am.A02;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (c98074am.A00 - j));
            byteBuffer.put(c98074am.A03.A00, (int) (j - c98074am.A01), min);
            i -= min;
            j += min;
            if (j == c98074am.A00) {
                c98074am = c98074am.A02;
            }
        }
        return c98074am;
    }

    public static C98074am A03(C98074am c98074am, byte[] bArr, int i, long j) {
        while (j >= c98074am.A00) {
            c98074am = c98074am.A02;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c98074am.A00 - j));
            System.arraycopy(c98074am.A03.A00, (int) (j - c98074am.A01), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c98074am.A00) {
                c98074am = c98074am.A02;
            }
        }
        return c98074am;
    }

    public static void A04(C98074am c98074am, C98064al c98064al) {
        if (c98074am.A03 != null) {
            C98074am c98074am2 = c98074am;
            C96334Ur c96334Ur = (C96334Ur) c98064al.A04;
            synchronized (c96334Ur) {
                do {
                    C96354Ut[] c96354UtArr = c96334Ur.A02;
                    int i = c96334Ur.A01;
                    c96334Ur.A01 = i + 1;
                    C96354Ut c96354Ut = c98074am2.A03;
                    c96354Ut.getClass();
                    c96354UtArr[i] = c96354Ut;
                    c96334Ur.A00--;
                    c98074am2 = c98074am2.A02;
                    if (c98074am2 == null) {
                        break;
                    }
                } while (c98074am2.A03 != null);
                c96334Ur.notifyAll();
            }
            c98074am.A03 = null;
            c98074am.A02 = null;
        }
    }

    public final void A05(long j) {
        C98074am c98074am;
        if (j == -1) {
            return;
        }
        while (true) {
            c98074am = this.A01;
            if (j < c98074am.A00) {
                break;
            }
            InterfaceC96344Us interfaceC96344Us = this.A04;
            C96354Ut c96354Ut = c98074am.A03;
            C96334Ur c96334Ur = (C96334Ur) interfaceC96344Us;
            synchronized (c96334Ur) {
                C96354Ut[] c96354UtArr = c96334Ur.A02;
                int i = c96334Ur.A01;
                c96334Ur.A01 = i + 1;
                c96354UtArr[i] = c96354Ut;
                c96334Ur.A00--;
                c96334Ur.notifyAll();
            }
            C98074am c98074am2 = this.A01;
            c98074am2.A03 = null;
            C98074am c98074am3 = c98074am2.A02;
            c98074am2.A02 = null;
            this.A01 = c98074am3;
        }
        if (this.A02.A01 >= c98074am.A01) {
            return;
        }
        this.A02 = c98074am;
    }

    public C98064al(InterfaceC96344Us interfaceC96344Us) {
        this.A04 = interfaceC96344Us;
        C98074am c98074am = new C98074am(0L);
        this.A01 = c98074am;
        this.A02 = c98074am;
        this.A03 = c98074am;
    }
}
