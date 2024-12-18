package com.google.common.collect;

import X.C00O;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;

/* loaded from: classes10.dex */
public abstract class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    public static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream stream) {
        throw C00O.createAndThrow();
    }

    private void writeObject(ObjectOutputStream stream) {
        throw C00O.createAndThrow();
    }
}
