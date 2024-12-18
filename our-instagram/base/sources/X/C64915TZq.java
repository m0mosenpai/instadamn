package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TZq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64915TZq<K, V> extends LinkedHashMap<K, V> {
    public static final C64915TZq A01;
    public boolean A00 = true;

    static {
        C64915TZq c64915TZq = new C64915TZq();
        A01 = c64915TZq;
        c64915TZq.A00 = false;
    }

    public static int A00(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = SVB.A04;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        }
        if (!(obj instanceof InterfaceC65443TkF)) {
            return obj.hashCode();
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
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator A14 = AbstractC166997dE.A14(this);
                    while (A14.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A14);
                        if (AbstractC58319PtB.A1V(A1K, map)) {
                            Object value = A1K.getValue();
                            Object obj2 = map.get(A1K.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
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
    public final Object put(Object obj, Object obj2) {
        if (this.A00) {
            Charset charset = SVB.A04;
            obj.getClass();
            obj2.getClass();
            return super.put(obj, obj2);
        }
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (this.A00) {
            Iterator A12 = AbstractC43593JPy.A12(map);
            while (A12.hasNext()) {
                Object next = A12.next();
                Charset charset = SVB.A04;
                next.getClass();
                map.get(next).getClass();
            }
            super.putAll(map);
            return;
        }
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.A00) {
            return super.remove(obj);
        }
        throw AbstractC43592JPx.A11();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, X.TZq] */
    public final C64915TZq A01() {
        if (isEmpty()) {
            return new C64915TZq();
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
