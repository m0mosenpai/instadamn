package com.google.common.collect;

import X.AbstractC75163Zh;
import X.C00O;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;

/* loaded from: classes10.dex */
public abstract class EnumMultiset<E extends Enum<E>> extends AbstractC75163Zh<E> implements Serializable {
    public static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream stream) {
        throw C00O.createAndThrow();
    }

    private void writeObject(ObjectOutputStream stream) {
        throw C00O.createAndThrow();
    }
}
