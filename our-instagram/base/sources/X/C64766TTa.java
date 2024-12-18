package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.TTa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64766TTa implements Map.Entry, Comparable {
    public Object A00;
    public final Comparable A01;
    public final /* synthetic */ TZI A02;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.A01;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.A00;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public C64766TTa(TZI tzi, Comparable comparable, Object obj) {
        this.A02 = tzi;
        this.A01 = comparable;
        this.A00 = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.compareTo(((C64766TTa) obj).A01);
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A01) ^ AbstractC166997dE.A0I(this.A00);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        TZI.A03(this.A02);
        Object obj2 = this.A00;
        this.A00 = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return AbstractC166997dE.A0v(this.A00, A1C);
    }
}
