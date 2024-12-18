package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class A2C {
    public static final int A00(String str) {
        List A0m = AbstractC167007dF.A0m(str, ":", 0);
        int i = -1;
        if (A0m.size() == 3) {
            try {
                int A0C = AbstractC167007dF.A0C(A0m, 0);
                int A0C2 = AbstractC167007dF.A0C(A0m, 1);
                int A0C3 = AbstractC167007dF.A0C(AbstractC001900j.A0R((CharSequence) A0m.get(2), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0), 0);
                i = (((A0C * ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS) + (A0C2 * 60) + A0C3) * 1000) + AbstractC167007dF.A0C(AbstractC001900j.A0R((CharSequence) A0m.get(2), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0), 1);
                return i;
            } catch (Exception e) {
                C0K8.A0F("KaraokeStickerUtil", "Error parsing time string from SRT file", e);
            }
        }
        return i;
    }
}
