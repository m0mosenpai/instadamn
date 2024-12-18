package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public abstract class S5O {
    public static boolean A00(String str) {
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            ArrayList A1E = AbstractC166987dD.A1E();
            Collections.addAll(A1E, codecInfoAt.getSupportedTypes());
            if (A1E.contains(str) && (encoderCapabilities = codecInfoAt.getCapabilitiesForType(str).getEncoderCapabilities()) != null && encoderCapabilities.isBitrateModeSupported(0)) {
                return true;
            }
        }
        return false;
    }
}
