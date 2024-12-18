package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.PuC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58372PuC<K, V> extends LinkedHashMap<K, V> {
    public static final C58372PuC A01;
    public boolean A00 = true;

    static {
        C58372PuC c58372PuC = new C58372PuC();
        A01 = c58372PuC;
        c58372PuC.A00 = false;
    }

    public static void A00(C58372PuC c58372PuC) {
        if (c58372PuC.A00) {
        } else {
            throw AbstractC43592JPx.A11();
        }
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

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, X.PuC] */
    public final C58372PuC A01() {
        if (isEmpty()) {
            return new C58372PuC();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.A00 = true;
        return linkedHashMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        A00(this);
        super.clear();
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
        int hashCode;
        int hashCode2;
        Iterator A14 = AbstractC166997dE.A14(this);
        int i = 0;
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object key = A1K.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC58376PuG.A03;
                hashCode = bArr.length;
                for (byte b : bArr) {
                    hashCode = (hashCode * 31) + b;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = A1K.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC58376PuG.A03;
                hashCode2 = bArr2.length;
                for (byte b2 : bArr2) {
                    hashCode2 = (hashCode2 * 31) + b2;
                }
                if (hashCode2 == 0) {
                    hashCode2 = 1;
                }
            } else {
                hashCode2 = value.hashCode();
            }
            i += hashCode2 ^ hashCode;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        A00(this);
        Charset charset = AbstractC58376PuG.A03;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        A00(this);
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            Object next = A12.next();
            Charset charset = AbstractC58376PuG.A03;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        A00(this);
        return super.remove(obj);
    }
}
