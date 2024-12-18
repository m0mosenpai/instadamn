package X;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Collections;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.WEi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70166WEi {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final Metadata A0A;
    public final C68878Vda A0B;

    public static int A00(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int A01(int i) {
        switch (i) {
            case CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final C70130W5r A02(Metadata metadata, byte[] bArr) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.A04;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.A0A;
        if (metadata2 != null) {
            if (metadata == null) {
                metadata = metadata2;
            } else {
                metadata = metadata2.A00(metadata.A01);
            }
        }
        C70116W4o c70116W4o = new C70116W4o();
        c70116W4o.A00("audio/flac");
        c70116W4o.A0A = i;
        c70116W4o.A04 = this.A02;
        c70116W4o.A0G = this.A07;
        c70116W4o.A0C = Util.A00(this.A00);
        c70116W4o.A0X = Collections.singletonList(bArr);
        c70116W4o.A0P = metadata;
        return new C70130W5r(c70116W4o);
    }

    public final C70166WEi A03(C68878Vda c68878Vda) {
        return new C70166WEi(this.A0A, c68878Vda, this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09);
    }

    public C70166WEi(byte[] bArr, int i) {
        WFZ wfz = new WFZ(bArr);
        wfz.A07(i * 8);
        this.A05 = wfz.A04(16);
        this.A03 = wfz.A04(16);
        this.A06 = wfz.A04(24);
        this.A04 = wfz.A04(24);
        int A04 = wfz.A04(20);
        this.A07 = A04;
        this.A08 = A01(A04);
        this.A02 = wfz.A04(3) + 1;
        int A042 = wfz.A04(5) + 1;
        this.A00 = A042;
        this.A01 = A00(A042);
        this.A09 = (wfz.A04(32) & 4294967295L) | ((wfz.A04(4) & 4294967295L) << 32);
        this.A0B = null;
        this.A0A = null;
    }

    public C70166WEi(Metadata metadata, C68878Vda c68878Vda, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        this.A05 = i;
        this.A03 = i2;
        this.A06 = i3;
        this.A04 = i4;
        this.A07 = i5;
        this.A08 = A01(i5);
        this.A02 = i6;
        this.A00 = i7;
        this.A01 = A00(i7);
        this.A09 = j;
        this.A0B = c68878Vda;
        this.A0A = metadata;
    }
}
