package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TTY implements Map.Entry {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ ConcurrentMapC200188tN A02;

    public TTY(final ConcurrentMapC200188tN this$0, Object key, Object value) {
        this.A02 = this$0;
        this.A01 = key;
        this.A00 = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        if (!this.A01.equals(entry.getKey())) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.A00, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object newValue) {
        V put = this.A02.put(this.A01, newValue);
        this.A00 = newValue;
        return put;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(getKey());
        A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return AbstractC166997dE.A0v(getValue(), A1C);
    }
}
