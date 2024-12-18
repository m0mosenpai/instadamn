package com.google.common.collect;

import X.AbstractC917849c;
import X.C18C;
import X.C64750TSj;
import X.InterfaceC917949d;
import X.RQ5;
import X.RQ6;
import X.RQ7;
import X.RQ8;
import X.RQ9;
import X.RQB;
import X.RQC;
import X.RRs;
import X.RRy;
import X.RRz;
import X.RSI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class AbstractMapBasedMultimap extends AbstractC917849c implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient Map A01;

    @Override // X.AbstractC917849c
    public final Collection A04() {
        if (this instanceof InterfaceC917949d) {
            return new RRz(this);
        }
        return new RRz(this);
    }

    @Override // X.AbstractC917849c
    public final Iterator A05() {
        if (this instanceof LinkedHashMultimap) {
            return new C64750TSj((LinkedHashMultimap) this);
        }
        return new RQ6(this);
    }

    @Override // X.AbstractC917849c
    public final Map A06() {
        boolean z = this instanceof Multimaps$CustomListMultimap;
        Map map = this.A01;
        if (z) {
            if (map instanceof NavigableMap) {
                return new RQ9(this, (NavigableMap) map);
            }
            if (map instanceof SortedMap) {
                return new RQ5(this, (SortedMap) map);
            }
            return new RRy(this, map);
        }
        return new RRy(this, map);
    }

    @Override // X.AbstractC917849c
    public final Set A07() {
        boolean z = this instanceof Multimaps$CustomListMultimap;
        Map map = this.A01;
        if (z) {
            if (map instanceof NavigableMap) {
                return new RQ7(this, (NavigableMap) map);
            }
            if (map instanceof SortedMap) {
                return new RQ8(this, (SortedMap) map);
            }
            return new RRs(this, map);
        }
        return new RRs(this, map);
    }

    public Collection A08() {
        if (this instanceof ArrayListMultimap) {
            return new ArrayList(((ArrayListMultimap) this).expectedValuesPerKey);
        }
        if (this instanceof LinkedHashMultimap) {
            return new CompactHashSet(((LinkedHashMultimap) this).valueSetCapacity);
        }
        return (Collection) ((Multimaps$CustomListMultimap) this).A00.get();
    }

    public final Collection A09(Object key, Collection collection) {
        if (this instanceof AbstractSetMultimap) {
            return new RQC(this, key, (Set) collection);
        }
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new RQB(null, this, key, list);
        }
        return new RQB(null, this, key, list);
    }

    public final void A0A(Map map) {
        this.A01 = map;
        this.A00 = 0;
        for (Collection collection : map.values()) {
            C18C.A0E(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    @Override // X.C46g
    public Collection AXV(Object key) {
        Collection collection = (Collection) this.A01.get(key);
        if (collection == null) {
            if (this instanceof LinkedHashMultimap) {
                LinkedHashMultimap linkedHashMultimap = (LinkedHashMultimap) this;
                collection = new RSI(linkedHashMultimap, key, linkedHashMultimap.valueSetCapacity);
            } else {
                collection = A08();
            }
        }
        return A09(key, collection);
    }

    @Override // X.AbstractC917849c, X.C46g
    public final boolean E6z(Object key, Object value) {
        Collection A08;
        Collection collection = (Collection) this.A01.get(key);
        if (collection == null) {
            if (this instanceof LinkedHashMultimap) {
                LinkedHashMultimap linkedHashMultimap = (LinkedHashMultimap) this;
                A08 = new RSI(linkedHashMultimap, key, linkedHashMultimap.valueSetCapacity);
            } else {
                A08 = A08();
            }
            if (A08.add(value)) {
                this.A00++;
                this.A01.put(key, A08);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(value)) {
            this.A00++;
            return true;
        }
        return false;
    }

    @Override // X.C46g
    public Collection EEs(Object key) {
        Collection collection = (Collection) this.A01.remove(key);
        if (collection == null) {
            if (this instanceof AbstractSetMultimap) {
                return Collections.emptySet();
            }
            return Collections.emptyList();
        }
        Collection A08 = A08();
        A08.addAll(collection);
        this.A00 -= collection.size();
        collection.clear();
        if (this instanceof AbstractSetMultimap) {
            return Collections.unmodifiableSet((Set) A08);
        }
        return Collections.unmodifiableList((List) A08);
    }

    @Override // X.C46g
    public void clear() {
        Iterator it = this.A01.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    @Override // X.C46g
    public final boolean containsKey(Object key) {
        return this.A01.containsKey(key);
    }

    @Override // X.C46g
    public final int size() {
        return this.A00;
    }
}
