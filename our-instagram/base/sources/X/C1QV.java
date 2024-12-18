package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashSet;

/* renamed from: X.1QV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1QV {
    public static final String A00(int[] iArr) {
        boolean z = false;
        if (iArr.length == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(String.valueOf(i));
        }
        if (hashSet.size() > 5) {
            EnumC12410kj enumC12410kj = EnumC12410kj.A09;
            String A0R = AnonymousClass001.A0R("Error, too many active UserFlows! ", hashSet.toString());
            C14360o3.A07(A0R);
            C0w9.A01(enumC12410kj, "IgSaltUserFlowLoggerUtil", A0R);
            return null;
        }
        return TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, hashSet.toArray(new String[0]));
    }
}
