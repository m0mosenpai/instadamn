package X;

import com.facebook.smartcapture.flow.IdCaptureConfig;

/* loaded from: classes10.dex */
public abstract class S1P {
    public static final String A00(EnumC61101RfG enumC61101RfG, IdCaptureConfig idCaptureConfig) {
        String str;
        if (enumC61101RfG != null) {
            int ordinal = enumC61101RfG.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = idCaptureConfig.A0B;
                }
            } else {
                str = idCaptureConfig.A0C;
            }
            if (str != null) {
                return str;
            }
            throw AbstractC166987dD.A14("Required path not passed to IdCaptureConfig");
        }
        throw AbstractC166987dD.A1D("Unsupported CaptureStage");
    }
}
