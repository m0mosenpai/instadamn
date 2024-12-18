package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Locale;

/* renamed from: X.SLs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62679SLs {
    public final String A00;
    public final String A01;
    public final C62442SBv A02;

    public C62679SLs(String str, String... strArr) {
        String A0x;
        if (strArr.length == 0) {
            A0x = "";
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append('[');
            String str2 = strArr[0];
            if (A1C.length() > 1) {
                A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            A1C.append(str2);
            A0x = AbstractC166997dE.A0x("] ", A1C);
        }
        this.A01 = A0x;
        this.A00 = str;
        this.A02 = new C62442SBv(str, null);
        int i = 2;
        while (!android.util.Log.isLoggable(this.A00, i) && (i = i + 1) <= 7) {
        }
    }

    public final void A00(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        android.util.Log.w("Auth", this.A01.concat(str));
    }
}
