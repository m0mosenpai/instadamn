package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.CompactHashMap;
import java.util.Map;

/* renamed from: X.49h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC918149h implements Map.Entry {
    @Override // java.util.Map.Entry
    public Object getKey() {
        return ((C918049g) this).A01;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        C918049g c918049g = (C918049g) this;
        CompactHashMap compactHashMap = c918049g.A02;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(c918049g.A01);
        }
        C918049g.A00(c918049g);
        int i = c918049g.A00;
        if (i == -1) {
            return null;
        }
        Object[] objArr = compactHashMap.values;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object value) {
        C918049g c918049g = (C918049g) this;
        CompactHashMap compactHashMap = c918049g.A02;
        Map delegateOrNull = compactHashMap.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(c918049g.A01, value);
        }
        C918049g.A00(c918049g);
        int i = c918049g.A00;
        if (i == -1) {
            compactHashMap.put(c918049g.A01, value);
            return null;
        }
        Object[] objArr = compactHashMap.values;
        objArr.getClass();
        Object obj = objArr[i];
        int i2 = c918049g.A00;
        Object[] objArr2 = compactHashMap.values;
        objArr2.getClass();
        objArr2[i2] = value;
        return obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        if (!AbstractC50102Ry.A00(getKey(), entry.getKey()) || !AbstractC50102Ry.A00(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(getValue());
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }
}
