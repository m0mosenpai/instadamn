package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.Ptg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58345Ptg implements Map.Entry {
    public C58345Ptg A00;
    public C58345Ptg A01;
    public final Object A02;
    public final Object A03;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C58345Ptg)) {
            return false;
        }
        C58345Ptg c58345Ptg = (C58345Ptg) obj;
        return this.A02.equals(c58345Ptg.A02) && this.A03.equals(c58345Ptg.A03);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A02;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A03;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.A02.hashCode() ^ this.A03.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw AbstractC166987dD.A1D("An entry modification is not supported");
    }

    public C58345Ptg(Object obj, Object obj2) {
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A02);
        A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return AbstractC166997dE.A0v(this.A03, A1C);
    }
}
