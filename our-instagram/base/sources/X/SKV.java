package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* loaded from: classes10.dex */
public final class SKV {
    public final List A00;

    public final String toString() {
        return TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, this.A00.toArray());
    }

    public SKV(List list) {
        this.A00 = AbstractC58322PtE.A10(list);
    }
}
