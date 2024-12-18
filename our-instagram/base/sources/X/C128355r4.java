package X;

import java.util.Map;

/* renamed from: X.5r4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C128355r4 implements Map.Entry, InterfaceC15590qF {
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
        if (this instanceof C128365r5) {
            return ((C128365r5) this).A00;
        }
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        if (this instanceof C128365r5) {
            C128365r5 c128365r5 = (C128365r5) this;
            Object value = c128365r5.getValue();
            c128365r5.A00 = obj;
            TTF ttf = c128365r5.A01;
            Object key = c128365r5.getKey();
            C58729Q5u c58729Q5u = ttf.A00;
            C5VS c5vs = c58729Q5u.A03;
            if (c5vs.containsKey(key)) {
                if (c58729Q5u.hasNext()) {
                    Object A02 = c58729Q5u.A02();
                    c5vs.put(key, obj);
                    if (A02 != null) {
                        i = A02.hashCode();
                    } else {
                        i = 0;
                    }
                    C58729Q5u.A00(c58729Q5u, c5vs.A01, A02, i, 0);
                } else {
                    c5vs.put(key, obj);
                }
                c58729Q5u.A00 = c5vs.A00;
            }
            return value;
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    public C128355r4(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i;
        Object key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }
}
