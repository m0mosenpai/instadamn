package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* loaded from: classes4.dex */
public abstract class A39 {
    public static void A00(C85B c85b, CameraConfiguration cameraConfiguration, C81J c81j, EnumC223179sw enumC223179sw, String str, String str2, String str3, String str4) {
        if (enumC223179sw != null && enumC223179sw != EnumC223179sw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) {
            c81j.A26 = Integer.valueOf(enumC223179sw == EnumC223179sw.BACK ? 0 : 1);
        }
        c81j.A0V = cameraConfiguration;
        if (cameraConfiguration != null) {
            if (cameraConfiguration.A03 == C81S.A00) {
                return;
            }
            java.util.Set set = cameraConfiguration.A04;
            if (set.contains(C81W.A0w) || set.contains(C81W.A0T)) {
                return;
            }
            if (set.contains(C81W.A0B) && str == null) {
                return;
            }
        }
        c81j.A2G = str;
        c81j.A2N = str2;
        c81j.A2f = str3;
        c81j.A2R = str4;
        c81j.A0L = c85b;
    }
}
