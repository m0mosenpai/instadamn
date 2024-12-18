package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;

/* renamed from: X.78W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78W {
    public final int A00;
    public final String A01;
    public final AnonymousClass793 A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78W)) {
            return false;
        }
        C78W c78w = (C78W) obj;
        return this.A01.equals(c78w.A01) && this.A00 == c78w.A00 && this.A02.equals(c78w.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01, this.A02});
    }

    public final String toString() {
        int i = this.A00;
        String str = this.A01;
        return AnonymousClass001.A0x("PhoneNumberMatch [", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, ") ", str, i, i + str.length());
    }

    public C78W(AnonymousClass793 anonymousClass793, String str, int i) {
        if (i >= 0) {
            if (str != null) {
                this.A00 = i;
                this.A01 = str;
                this.A02 = anonymousClass793;
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("Start index must be >= 0.");
    }
}
