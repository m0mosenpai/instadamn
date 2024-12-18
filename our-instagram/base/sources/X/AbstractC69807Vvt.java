package X;

import androidx.media3.common.util.Util;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Vvt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69807Vvt {
    public static boolean A01(WFa wFa, C68651VZj c68651VZj, C70166WEi c70166WEi, int i) {
        int i2;
        int A08;
        long A0C = wFa.A0C();
        long j = A0C >>> 16;
        if (j != i) {
            return false;
        }
        boolean A1N = AbstractC167007dF.A1N(((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)));
        int i3 = (int) ((A0C >> 12) & 15);
        int i4 = (int) ((A0C >> 8) & 15);
        int i5 = (int) (15 & (A0C >> 4));
        int i6 = (int) ((A0C >> 1) & 7);
        boolean A1N2 = AbstractC167007dF.A1N(((A0C & 1) > 1L ? 1 : ((A0C & 1) == 1L ? 0 : -1)));
        if (i5 <= 7) {
            i2 = c70166WEi.A02 - 1;
        } else {
            if (i5 > 10) {
                return false;
            }
            i5 = c70166WEi.A02;
            i2 = 2;
        }
        if (i5 != i2) {
            return false;
        }
        if ((i6 != 0 && i6 != c70166WEi.A01) || A1N2) {
            return false;
        }
        try {
            long A0E = wFa.A0E();
            if (!A1N) {
                A0E *= c70166WEi.A03;
            }
            c68651VZj.A00 = A0E;
            int A00 = A00(wFa, i3);
            if (A00 == -1 || A00 > c70166WEi.A03) {
                return false;
            }
            int i7 = c70166WEi.A07;
            if (i4 != 0) {
                if (i4 <= 11) {
                    if (i4 != c70166WEi.A08) {
                        return false;
                    }
                } else {
                    if (i4 == 12) {
                        A08 = wFa.A05() * 1000;
                    } else {
                        if (i4 > 14) {
                            return false;
                        }
                        A08 = wFa.A08();
                        if (i4 == 14) {
                            A08 *= 10;
                        }
                    }
                    if (A08 != i7) {
                        return false;
                    }
                }
            }
            int A05 = wFa.A05();
            int i8 = wFa.A01;
            byte[] bArr = wFa.A02;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = wFa.A01; i11 < i9; i11++) {
                i10 = Util.A0A[i10 ^ (bArr[i11] & 255)];
            }
            if (A05 != i10) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    public static int A00(WFa wFa, int i) {
        int i2;
        int i3;
        int A05;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = 576;
                i3 = i - 2;
                return i2 << i3;
            case 6:
                A05 = wFa.A05();
                return A05 + 1;
            case 7:
                A05 = wFa.A08();
                return A05 + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
                i2 = 256;
                i3 = i - 8;
                return i2 << i3;
            default:
                return -1;
        }
    }
}
