package X;

import android.os.Build;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.7gC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168787gC {
    public static final StringBuilder A00 = new StringBuilder();

    public static final SimpleImageUrl A00(UserSession userSession, C148336m3 c148336m3, int i) {
        int i2;
        SimpleImageUrl simpleImageUrl;
        C14360o3.A0B(userSession, 2);
        int i3 = c148336m3.A00;
        if (i3 < 0) {
            i2 = -1;
        } else {
            i2 = i3 / 6;
        }
        if (i2 >= 0) {
            int i4 = i2 * 6;
            C168157fA c168157fA = C148336m3.A04;
            int min = Math.min(i4 + 6, c168157fA.A07(userSession).length) - i4;
            if (min >= 0) {
                String[] strArr = new String[min];
                for (int i5 = 0; i5 < min; i5++) {
                    strArr[i5] = c168157fA.A07(userSession)[i4 + i5].A02;
                }
                String A07 = AbstractC009903n.A07(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", null, strArr);
                StringBuilder sb = A00;
                synchronized (sb) {
                    sb.setLength(0);
                    sb.append("emoji-sprite-sheet:/");
                    sb.append("emoji-sprite-sheet-api");
                    sb.append(Build.VERSION.SDK_INT);
                    sb.append("-");
                    sb.append(A07.hashCode());
                    sb.append("-dpi-");
                    sb.append(i);
                    sb.append("//");
                    sb.append(6);
                    sb.append("//");
                    sb.append(A07);
                    simpleImageUrl = new SimpleImageUrl(sb.toString());
                }
                return simpleImageUrl;
            }
        }
        return null;
    }
}
