package X;

import java.util.Map;

/* renamed from: X.0Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06890Yg implements Map.Entry, InterfaceC16550s0 {
    public final int A00;
    public final C06860Yd A01;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (C14360o3.A0K(entry.getKey(), getKey()) && C14360o3.A0K(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        C06860Yd c06860Yd = this.A01;
        C06860Yd c06860Yd2 = C06860Yd.A0D;
        return c06860Yd.A0B[this.A00];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C06860Yd c06860Yd = this.A01;
        C06860Yd c06860Yd2 = C06860Yd.A0D;
        Object[] objArr = c06860Yd.A0C;
        C14360o3.A0A(objArr);
        return objArr[this.A00];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C06860Yd c06860Yd = this.A01;
        c06860Yd.A05();
        Object[] objArr = c06860Yd.A0C;
        if (objArr == null) {
            objArr = new Object[c06860Yd.A0B.length];
            c06860Yd.A0C = objArr;
        }
        int i = this.A00;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    public C06890Yg(C06860Yd c06860Yd, int i) {
        this.A01 = c06860Yd;
        this.A00 = i;
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
