package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class W8P {
    public static final W8P A00 = new Object();

    public static HashSet A00(VE8 ve8, int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        int[] iArr;
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < MediaCodecList.getCodecCount(); i4++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i4);
            if (codecInfoAt.isEncoder()) {
                String str = ve8.A00;
                ArrayList arrayList = new ArrayList();
                Collections.addAll(arrayList, codecInfoAt.getSupportedTypes());
                if (arrayList.contains(str)) {
                    if (z && codecInfoAt.getName().toLowerCase().contains(".mtk.")) {
                        codecInfoAt.getName();
                    } else {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                        if (capabilitiesForType != null && capabilitiesForType.profileLevels != null) {
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                if (codecProfileLevel.profile == i && (codecProfileLevel.level >= i2 || i2 == -1)) {
                                    int i5 = codecProfileLevel.profile;
                                    if (i2 != -1) {
                                        i3 = i2;
                                    } else {
                                        i3 = codecProfileLevel.level;
                                    }
                                    if (z2 && Build.VERSION.SDK_INT >= 33 && (iArr = capabilitiesForType.colorFormats) != null) {
                                        for (int i6 : iArr) {
                                            if (i6 == 54) {
                                                z3 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z3 = false;
                                    hashSet.add(new C70124W5f(ve8, i5, i3, false, z3));
                                }
                            }
                        }
                    }
                }
            }
        }
        return hashSet;
    }
}
