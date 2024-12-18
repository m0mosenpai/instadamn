package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class TTX implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!AbstractC62214S2j.A00(getKey(), entry.getKey()) || !AbstractC62214S2j.A00(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this instanceof RNZ) {
            return ((RNZ) this).A00;
        }
        return ((RNY) this).A01;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this instanceof RNZ) {
            return ((RNZ) this).A01;
        }
        RNY rny = (RNY) this;
        TZK tzk = rny.A02;
        Map A02 = tzk.A02();
        if (A02 != null) {
            return A02.get(rny.A01);
        }
        RNY.A00(rny);
        int i = rny.A00;
        if (i == -1) {
            return null;
        }
        Object[] objArr = tzk.A05;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this instanceof RNZ) {
            throw AbstractC43592JPx.A11();
        }
        RNY rny = (RNY) this;
        TZK tzk = rny.A02;
        Map A02 = tzk.A02();
        if (A02 != null) {
            return A02.put(rny.A01, obj);
        }
        RNY.A00(rny);
        int i = rny.A00;
        if (i == -1) {
            tzk.put(rny.A01, obj);
            return null;
        }
        Object[] objArr = tzk.A05;
        objArr.getClass();
        Object obj2 = objArr[i];
        int i2 = rny.A00;
        Object[] objArr2 = tzk.A05;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return AbstractC167017dG.A0M(getKey()) ^ AbstractC166997dE.A0I(getValue());
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder A0r = AbstractC58318PtA.A0r(AbstractC58319PtB.A05(valueOf) + 1, AbstractC58319PtB.A05(valueOf2));
        A0r.append(valueOf);
        return MSZ.A0u(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, valueOf2, A0r);
    }
}
