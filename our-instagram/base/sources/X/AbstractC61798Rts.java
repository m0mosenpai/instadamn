package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.Rts, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61798Rts {
    public static boolean A00(String str, int i, int i2, boolean z, boolean z2) {
        for (int i3 = 0; i3 < MediaCodecList.getCodecCount(); i3++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
            if (codecInfoAt.isEncoder()) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Collections.addAll(A1E, codecInfoAt.getSupportedTypes());
                if (!A1E.contains(str)) {
                    continue;
                } else if ((!z2 && Build.VERSION.SDK_INT >= 29 && !codecInfoAt.isHardwareAccelerated()) || (z && codecInfoAt.getName().toLowerCase().contains(".mtk."))) {
                    codecInfoAt.getName();
                } else {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && capabilitiesForType.profileLevels != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            int i4 = codecProfileLevel.profile;
                            int i5 = codecProfileLevel.level;
                            if (i4 == i && i5 >= i2) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
