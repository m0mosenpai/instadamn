package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.SLv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62682SLv {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C62682SLv(Object key, Object value1, Object value2) {
        this.A00 = key;
        this.A01 = value1;
        this.A02 = value2;
    }

    public final IllegalArgumentException A00() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Multiple entries with same key: ");
        Object obj = this.A00;
        A1C.append(obj);
        A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        A1C.append(this.A01);
        A1C.append(" and ");
        A1C.append(obj);
        A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return AbstractC43594JPz.A0n(this.A02, A1C);
    }
}
