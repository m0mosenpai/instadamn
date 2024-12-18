package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TZG extends AbstractMap {
    public transient Collection A00;
    public transient java.util.Set A01;
    public final transient Map A02;
    public final /* synthetic */ AbstractC60698RNa A03;

    public TZG(AbstractC60698RNa abstractC60698RNa, Map map) {
        this.A03 = abstractC60698RNa;
        this.A02 = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.A02;
        AbstractC60698RNa abstractC60698RNa = this.A03;
        Map map2 = abstractC60698RNa.A01;
        if (map == map2) {
            Iterator A16 = AbstractC166997dE.A16(map2);
            while (A16.hasNext()) {
                ((Collection) A16.next()).clear();
            }
            map2.clear();
            abstractC60698RNa.A00 = 0;
            return;
        }
        C64746TSf c64746TSf = new C64746TSf(this);
        while (c64746TSf.hasNext()) {
            c64746TSf.next();
            c64746TSf.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.A02;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.A01;
        if (set == null) {
            C60712RNo c60712RNo = new C60712RNo(this);
            this.A01 = c60712RNo;
            return c60712RNo;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.A02.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Object obj2;
        Map map = this.A02;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.A03.A00(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.A02.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        AbstractC60698RNa abstractC60698RNa = this.A03;
        java.util.Set set = ((T6D) abstractC60698RNa).A01;
        if (set == null) {
            C60711RNn c60711RNn = new C60711RNn(abstractC60698RNa, abstractC60698RNa.A01);
            ((T6D) abstractC60698RNa).A01 = c60711RNn;
            return c60711RNn;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.A02.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC60698RNa abstractC60698RNa = this.A03;
        ArrayList A17 = AbstractC25225BEi.A17(3);
        A17.addAll(collection);
        abstractC60698RNa.A00 -= collection.size();
        collection.clear();
        return A17;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A02.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.A02.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.A00;
        if (collection == null) {
            C64889TYp c64889TYp = new C64889TYp(this);
            this.A00 = c64889TYp;
            return c64889TYp;
        }
        return collection;
    }

    public TZG() {
    }
}
