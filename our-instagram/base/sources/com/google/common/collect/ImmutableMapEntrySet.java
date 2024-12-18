package com.google.common.collect;

import X.AbstractC58320PtC;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    /* loaded from: classes10.dex */
    public class EntrySetSerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableMap map;

        public Object readResolve() {
            return this.map.entrySet();
        }

        public EntrySetSerializedForm(ImmutableMap map) {
            this.map = map;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0B() {
        return ImmutableSortedMap.this.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return ImmutableSortedMap.this.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ImmutableSortedMap.this.size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new EntrySetSerializedForm(ImmutableSortedMap.this);
    }

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        Object obj = ImmutableSortedMap.this.get(entry.getKey());
        if (obj == null) {
            return false;
        }
        return AbstractC58320PtC.A1X(obj, entry.getValue());
    }
}
