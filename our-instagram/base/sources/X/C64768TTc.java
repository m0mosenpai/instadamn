package X;

import java.util.Map;

/* renamed from: X.TTc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C64768TTc implements Map.Entry, InterfaceC15590qF {
    public final Object A00;
    public final Object A01;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !C14360o3.A0K(entry.getKey(), getKey()) || !C14360o3.A0K(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this instanceof C65125Te0) {
            return ((C65125Te0) this).A00.A02;
        }
        if (this instanceof C65124Tdz) {
            return ((C65124Tdz) this).A00;
        }
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this instanceof C65125Te0) {
            C65125Te0 c65125Te0 = (C65125Te0) this;
            C58477Pw3 c58477Pw3 = c65125Te0.A00;
            Object obj2 = c58477Pw3.A02;
            C58477Pw3 c58477Pw32 = new C58477Pw3(obj, c58477Pw3.A01, c58477Pw3.A00);
            c65125Te0.A00 = c58477Pw32;
            c65125Te0.A01.put(c65125Te0.getKey(), c58477Pw32);
            return obj2;
        }
        if (this instanceof C65124Tdz) {
            C65124Tdz c65124Tdz = (C65124Tdz) this;
            Object value = c65124Tdz.getValue();
            c65124Tdz.A00 = obj;
            TTG ttg = c65124Tdz.A01;
            Object key = c65124Tdz.getKey();
            C65131Te6 c65131Te6 = ttg.A00;
            Pw1 pw1 = c65131Te6.A03;
            if (!pw1.containsKey(key)) {
                return value;
            }
            if (c65131Te6.hasNext()) {
                Object A02 = c65131Te6.A02();
                pw1.put(key, obj);
                C65131Te6.A00(A02, c65131Te6, pw1.A04, AbstractC25235BEs.A06(A02), 0);
            } else {
                pw1.put(key, obj);
            }
            c65131Te6.A00 = pw1.A00;
            return value;
        }
        throw AbstractC58321PtD.A10();
    }

    public C64768TTc(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = 0;
        int A06 = AbstractC25235BEs.A06(getKey());
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return A06 ^ i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(getKey());
        A1C.append('=');
        return AbstractC166997dE.A0v(getValue(), A1C);
    }
}
