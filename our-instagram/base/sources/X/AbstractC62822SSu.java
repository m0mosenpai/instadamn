package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.SSu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62822SSu {
    public static final boolean A01(UserSession userSession) {
        if (Build.VERSION.SDK_INT < 29 || !A00() || ("mediatek".equals(C15G.A00().A01) && C18U.A06(C06090Tz.A06, userSession, 36317697994462684L))) {
            return false;
        }
        if (!S5O.A00("image/vnd.android.heic") && !S5O.A00("video/hevc") && C18U.A06(C06090Tz.A05, userSession, 36317697994790369L)) {
            return false;
        }
        if (S5O.A00("video/hevc") || !C18U.A06(C06090Tz.A06, userSession, 36317697994397147L)) {
            return S5O.A00("image/vnd.android.heic") || C18U.A06(C06090Tz.A05, userSession, 36317697994528221L);
        }
        return false;
    }

    public static final boolean A00() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            C64289T7y c64289T7y = C64289T7y.A00;
            for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Collections.addAll(A1E, codecInfoAt.getSupportedTypes());
                    if (!A1E.contains("video/hevc")) {
                        continue;
                    } else if (c64289T7y.apply(codecInfoAt.getName())) {
                        codecInfoAt.getName();
                    } else {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType("video/hevc");
                        if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                                if (codecProfileLevel.profile == 1 && codecProfileLevel.level >= 1024) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException e) {
            C0w9.A07("hevc_capability_check_err", e);
            return false;
        }
    }
}
