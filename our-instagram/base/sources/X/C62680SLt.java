package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.SLt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62680SLt {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C62680SLt(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final IllegalArgumentException A00() {
        Object obj = this.A02;
        Object obj2 = this.A01;
        Object obj3 = this.A00;
        return AbstractC166987dD.A12(AnonymousClass001.A16("Multiple entries with same key: ", String.valueOf(obj3), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(obj2), " and ", String.valueOf(obj3), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(obj)));
    }
}
