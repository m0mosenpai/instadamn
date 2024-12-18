package com.google.common.collect;

import X.C00O;
import X.C1LC;
import X.C49a;
import X.RSU;
import com.google.common.collect.ImmutableSetMultimap;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ImmutableMultimap extends C49a implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient int A00;
    public final transient ImmutableMap A01;

    /* loaded from: classes10.dex */
    public class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        public static final long serialVersionUID = 0;
        public final ImmutableMultimap multimap;

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;
                return this.multimap.AJj(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final C1LC iterator() {
            return new RSU(this.multimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.multimap.A00;
        }

        public EntryCollection(ImmutableMultimap multimap) {
            this.multimap = multimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0B() {
            throw C00O.createAndThrow();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return new RSU(this.multimap);
        }
    }

    @Override // X.AbstractC917849c, X.C46g
    public /* bridge */ /* synthetic */ Collection ASw() {
        if (this instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap immutableSetMultimap = (ImmutableSetMultimap) this;
            ImmutableSet immutableSet = immutableSetMultimap.A00;
            if (immutableSet == null) {
                ImmutableSetMultimap.EntrySet entrySet = new ImmutableSetMultimap.EntrySet(immutableSetMultimap);
                immutableSetMultimap.A00 = entrySet;
                return entrySet;
            }
            return immutableSet;
        }
        return (ImmutableCollection) super.ASw();
    }

    @Override // X.C46g
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C46g
    public final boolean containsKey(Object key) {
        return this.A01.containsKey(key);
    }

    @Override // X.C46g
    public final int size() {
        return this.A00;
    }

    public ImmutableMultimap(ImmutableMap map, int size) {
        this.A01 = map;
        this.A00 = size;
    }
}
