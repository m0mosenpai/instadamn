package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WFb {
    public static MediaCodecInfo.CodecCapabilities A00() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        return mediaCodecInfo.getCapabilitiesForType(str);
                    }
                }
            }
        }
        return null;
    }

    public static void A04(WDI wdi, float f, int i) {
        int i2;
        if (f > 1.0f) {
            wdi.A0C = i;
            i2 = (int) (i / f);
            wdi.A0A = i2;
        } else {
            wdi.A0A = i;
            i2 = i;
            i = (int) (i * f);
            wdi.A0C = i;
        }
        int i3 = i;
        int i4 = i % 16;
        if (i4 != 0) {
            i3 = i + (16 - i4);
        }
        int i5 = (int) (i2 * (i3 / i));
        wdi.A0A = i5;
        wdi.A0C = i3;
        int i6 = i5 % 16;
        if (i6 != 0) {
            i5 += 16 - i6;
        }
        wdi.A0A = i5;
    }

    public static Range A01(int i) {
        MediaCodecInfo.CodecCapabilities A00 = A00();
        if (A00 != null && A00.getVideoCapabilities() != null) {
            return A00.getVideoCapabilities().getSupportedWidthsFor(i);
        }
        return Range.create(32, 720);
    }

    public static WDI A03(MYB myb, W94 w94, List list) {
        int i;
        WDI A00 = WDI.A00(myb, w94, list);
        int max = Math.max(myb.A05, myb.A03);
        int i2 = w94.A01;
        int min = Math.min(max, i2);
        A04(A00, A00.A0C / A00.A0A, min);
        if (min >= i2) {
            i = w94.A00;
        } else {
            i = ((int) (((((A00.A0C * A00.A0A) * A00.A02) * 1.3f) * 0.07d) / 1000.0d)) * 1024;
        }
        A00.A01 = i;
        return A00;
    }

    public static boolean A05(int i, int i2) {
        MediaCodecInfo.CodecCapabilities A00 = A00();
        if (A00 != null && A00.getVideoCapabilities() != null) {
            return A00.getVideoCapabilities().isSizeSupported(i, i2);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0416, code lost:
    
        if (r22 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0048, code lost:
    
        if (r0.isEmpty() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.WDI A02(X.MYB r26, X.WDI r27, X.W94 r28, com.facebook.videolite.transcoder.base.composition.MediaComposition r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFb.A02(X.MYB, X.WDI, X.W94, com.facebook.videolite.transcoder.base.composition.MediaComposition, boolean, boolean, boolean, boolean, boolean):X.WDI");
    }
}
