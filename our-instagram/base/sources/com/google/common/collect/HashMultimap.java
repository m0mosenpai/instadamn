package com.google.common.collect;

import X.AbstractC63247Sg2;
import X.C18C;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* loaded from: classes10.dex */
public final class HashMultimap extends HashMultimapGwtSerializationDependencies {
    public static final long serialVersionUID = 0;
    public transient int expectedValuesPerKey;

    public HashMultimap() {
        CompactHashMap compactHashMap = new CompactHashMap(12);
        C18C.A0E(compactHashMap.isEmpty());
        ((AbstractMapBasedMultimap) this).A01 = compactHashMap;
        this.expectedValuesPerKey = 2;
        this.expectedValuesPerKey = 2;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final /* bridge */ /* synthetic */ Collection A08() {
        return new CompactHashSet(this.expectedValuesPerKey);
    }

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int readInt = stream.readInt();
        A0A(new CompactHashMap(12));
        AbstractC63247Sg2.A01(this, stream, readInt);
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        AbstractC63247Sg2.A02(this, stream);
    }
}
