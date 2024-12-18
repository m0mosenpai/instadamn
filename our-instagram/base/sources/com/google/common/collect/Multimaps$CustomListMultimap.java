package com.google.common.collect;

import X.InterfaceC216113n;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/* loaded from: classes3.dex */
public class Multimaps$CustomListMultimap extends AbstractListMultimap {
    public static final long serialVersionUID = 0;
    public transient InterfaceC216113n A00;

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        Object readObject = stream.readObject();
        readObject.getClass();
        this.A00 = (InterfaceC216113n) readObject;
        Object readObject2 = stream.readObject();
        readObject2.getClass();
        A0A((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        stream.writeObject(this.A00);
        stream.writeObject(((AbstractMapBasedMultimap) this).A01);
    }
}
