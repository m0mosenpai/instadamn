package X;

import android.util.Pair;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.5qZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128055qZ implements InterfaceC41211vV {
    public Pair A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C128055qZ)) {
            return false;
        }
        C128055qZ c128055qZ = (C128055qZ) obj;
        if (!C14360o3.A0K(c128055qZ.A00, this.A00) || c128055qZ.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((527 + this.A00.hashCode()) * 31) + (this.A01 ? 1 : 0)) * 31;
    }

    public final String toString() {
        Pair pair = this.A00;
        Object obj = pair.first;
        C14360o3.A06(obj);
        int intValue = ((Number) obj).intValue();
        Object obj2 = pair.second;
        C14360o3.A06(obj2);
        String A0n = AnonymousClass001.A0n("[", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "] ", intValue, ((Number) obj2).intValue());
        C14360o3.A07(A0n);
        return A0n;
    }
}
