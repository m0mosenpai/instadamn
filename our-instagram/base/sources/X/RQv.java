package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class RQv<K, V> extends AbstractC451425u implements Map<K, V> {
    public final Map A01() {
        if (this instanceof AbstractConcurrentMapC60760RQo) {
            AbstractConcurrentMapC60760RQo abstractConcurrentMapC60760RQo = (AbstractConcurrentMapC60760RQo) this;
            if (abstractConcurrentMapC60760RQo instanceof MapMakerInternalMap.AbstractSerializationProxy) {
                return ((MapMakerInternalMap.AbstractSerializationProxy) abstractConcurrentMapC60760RQo).A00;
            }
            throw C00O.createAndThrow();
        }
        return ((C60759RQm) this).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        if (r2.hasNext() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r4.equals(r2.next()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r4 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r2.hasNext() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r2.next() != null) goto L22;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C60759RQm
            if (r0 == 0) goto L31
            java.util.Iterator r1 = X.AbstractC166997dE.A15(r3)
            r0 = 1
            X.RSL r2 = new X.RSL
            r2.<init>(r1, r0)
            r1 = 1
            if (r4 != 0) goto L1e
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            if (r0 != 0) goto L11
            return r1
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1e
            return r1
        L2f:
            r1 = 0
            return r1
        L31:
            java.util.Map r0 = r3.A01()
            boolean r1 = r0.containsValue(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RQv.containsValue(java.lang.Object):boolean");
    }

    public boolean equals(Object object) {
        if (object != this && !A01().equals(object)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        A01().clear();
    }

    public boolean containsKey(Object key) {
        return A01().containsKey(key);
    }

    public java.util.Set entrySet() {
        return A01().entrySet();
    }

    public Object get(Object key) {
        return A01().get(key);
    }

    public int hashCode() {
        return A01().hashCode();
    }

    public boolean isEmpty() {
        return A01().isEmpty();
    }

    public java.util.Set keySet() {
        return A01().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object key, Object value) {
        return A01().put(key, value);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        A01().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object key) {
        return A01().remove(key);
    }

    public int size() {
        return A01().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return A01().values();
    }
}
