package com.google.common.collect;

import X.AbstractC63247Sg2;
import X.C18C;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes3.dex */
public final class ArrayListMultimap extends ArrayListMultimapGwtSerializationDependencies {
    public static final long serialVersionUID = 0;
    public transient int expectedValuesPerKey;

    public ArrayListMultimap() {
        CompactHashMap compactHashMap = new CompactHashMap(12);
        C18C.A0E(compactHashMap.isEmpty());
        ((AbstractMapBasedMultimap) this).A01 = compactHashMap;
        this.expectedValuesPerKey = 3;
    }

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int readInt = stream.readInt();
        A0A(new CompactHashMap());
        AbstractC63247Sg2.A01(this, stream, readInt);
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        AbstractC63247Sg2.A02(this, stream);
    }
}
