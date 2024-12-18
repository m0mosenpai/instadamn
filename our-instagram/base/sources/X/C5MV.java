package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.5MV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MV implements Map.Entry {
    public int A00;
    public C5MV A01;
    public C5MV A02;
    public C5MV A03;
    public C5MV A04;
    public C5MV A05;
    public Object A06;
    public final Object A07;
    public final boolean A08;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.A07;
        Object key = entry.getKey();
        if (obj2 == null) {
            if (key != null) {
                return false;
            }
        } else if (!obj2.equals(key)) {
            return false;
        }
        Object obj3 = this.A06;
        Object value = entry.getValue();
        if (obj3 == null) {
            if (value != null) {
                return false;
            }
        } else if (!obj3.equals(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A07;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A06;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object obj = this.A07;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.A06;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.A08) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.A06;
        this.A06 = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A07);
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(this.A06);
        return sb.toString();
    }

    public C5MV(boolean z) {
        this.A07 = null;
        this.A08 = z;
        this.A04 = this;
        this.A02 = this;
    }

    public C5MV(C5MV c5mv, C5MV c5mv2, C5MV c5mv3, Object obj, boolean z) {
        this.A03 = c5mv;
        this.A07 = obj;
        this.A08 = z;
        this.A00 = 1;
        this.A02 = c5mv2;
        this.A04 = c5mv3;
        c5mv3.A02 = this;
        c5mv2.A04 = this;
    }
}
