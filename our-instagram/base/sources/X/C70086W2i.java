package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.W2i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70086W2i {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public static C70086W2i A00(String str) {
        WDn.A01(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = split.length;
            if (i < length) {
                String A00 = C4B2.A00(split[i].trim());
                switch (A00.hashCode()) {
                    case 100571:
                        if (!A00.equals("end")) {
                            break;
                        } else {
                            i3 = i;
                            break;
                        }
                    case 3556653:
                        if (!A00.equals("text")) {
                            break;
                        } else {
                            i5 = i;
                            break;
                        }
                    case 109757538:
                        if (!A00.equals("start")) {
                            break;
                        } else {
                            i2 = i;
                            break;
                        }
                    case 109780401:
                        if (!A00.equals("style")) {
                            break;
                        } else {
                            i4 = i;
                            break;
                        }
                }
                i++;
            } else {
                if (i2 != -1 && i3 != -1 && i5 != -1) {
                    return new C70086W2i(i2, i3, i4, i5, length);
                }
                return null;
            }
        }
    }

    public C70086W2i(int i, int i2, int i3, int i4, int i5) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A01 = i5;
    }
}
