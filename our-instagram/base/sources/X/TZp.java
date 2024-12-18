package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TZp<K, V> extends LinkedHashMap<K, V> {
    public static final TZp A01;
    public boolean A00 = true;

    static {
        TZp tZp = new TZp();
        A01 = tZp;
        tZp.A00 = false;
    }

    public static int A00(Object a) {
        if (a instanceof byte[]) {
            byte[] bArr = (byte[]) a;
            Charset charset = AbstractC62398S9x.A04;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        }
        if (!(a instanceof InterfaceC65279ThC)) {
            return a.hashCode();
        }
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.A00) {
            super.clear();
            return;
        }
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object object) {
        boolean equals;
        if (object instanceof Map) {
            Map map = (Map) object;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator A14 = AbstractC166997dE.A14(this);
                    while (A14.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A14);
                        if (AbstractC58319PtB.A1V(A1K, map)) {
                            Object value = A1K.getValue();
                            Object obj = map.get(A1K.getKey());
                            if ((value instanceof byte[]) && (obj instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj);
                            } else {
                                equals = value.equals(obj);
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object key, Object value) {
        if (this.A00) {
            Charset charset = AbstractC62398S9x.A04;
            key.getClass();
            value.getClass();
            return super.put(key, value);
        }
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map m) {
        if (this.A00) {
            Iterator A12 = AbstractC43593JPy.A12(m);
            while (A12.hasNext()) {
                Object next = A12.next();
                Charset charset = AbstractC62398S9x.A04;
                next.getClass();
                m.get(next).getClass();
            }
            super.putAll(m);
            return;
        }
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object key) {
        if (this.A00) {
            return super.remove(key);
        }
        throw AbstractC43592JPx.A11();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, X.TZp] */
    public final TZp A01() {
        if (isEmpty()) {
            return new TZp();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.A00 = true;
        return linkedHashMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator A14 = AbstractC166997dE.A14(this);
        int i = 0;
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            i += A00(A1K.getValue()) ^ A00(A1K.getKey());
        }
        return i;
    }
}
