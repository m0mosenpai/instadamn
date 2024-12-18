package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes7.dex */
public abstract class I8B {
    public static final void A00(String str, boolean z) {
        if (z && str != null) {
            String[] strArr = (String[]) AbstractC31178DnM.A1b("90010135660647,196868763,877655318,9460276,375908588,13936153,535288535,204511127,23418612,1051778973,409035188", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            int length = strArr.length;
            for (int i = 0; i < length && !C14360o3.A0K(strArr[i], str); i++) {
            }
        }
    }
}
