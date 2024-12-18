package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.7tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176987tu {
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

    public static boolean A01(InterfaceC178337w7 interfaceC178337w7, C23014ACo c23014ACo) {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        boolean equals = MSV.A00(513).equals(new C03880Jd().A01);
        if (equals && interfaceC178337w7.CUZ(128)) {
            z = true;
        }
        if (c23014ACo.A01 == 6 && c23014ACo.A02 == 7) {
            return AbstractC61798Rts.A00("video/hevc", 2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, !equals, false);
        }
        return AbstractC61798Rts.A00("video/hevc", 1, 1024, !z, !interfaceC178337w7.CUZ(129));
    }

    public static boolean A02(C23014ACo c23014ACo, boolean z) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        if (c23014ACo.A01 == 6 && c23014ACo.A02 == 7) {
            return AbstractC61798Rts.A00("video/av01", 2, 512, true, false);
        }
        return AbstractC61798Rts.A00("video/av01", 1, 512, true, z);
    }
}
