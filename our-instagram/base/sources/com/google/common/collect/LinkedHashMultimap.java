package com.google.common.collect;

import X.InterfaceC65548TmR;
import X.RSI;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class LinkedHashMultimap extends LinkedHashMultimapGwtSerializationDependencies {
    public static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    public static final long serialVersionUID = 1;
    public transient ValueEntry A00;
    public transient int valueSetCapacity;

    /* loaded from: classes10.dex */
    public final class ValueEntry extends ImmutableEntry implements InterfaceC65548TmR {
        public ValueEntry nextInValueBucket;
        public ValueEntry predecessorInMultimap;
        public InterfaceC65548TmR predecessorInValueSet;
        public final int smearedValueHash;
        public ValueEntry successorInMultimap;
        public InterfaceC65548TmR successorInValueSet;

        @Override // X.InterfaceC65548TmR
        public final InterfaceC65548TmR C3m() {
            InterfaceC65548TmR interfaceC65548TmR = this.successorInValueSet;
            interfaceC65548TmR.getClass();
            return interfaceC65548TmR;
        }

        public ValueEntry(ValueEntry key, Object value, Object smearedValueHash, int nextInValueBucket) {
            super(value, smearedValueHash);
            this.smearedValueHash = nextInValueBucket;
            this.nextInValueBucket = key;
        }

        @Override // X.InterfaceC65548TmR
        public final void EbF(InterfaceC65548TmR entry) {
            this.predecessorInValueSet = entry;
        }

        @Override // X.InterfaceC65548TmR
        public final void Ef9(InterfaceC65548TmR entry) {
            this.successorInValueSet = entry;
        }
    }

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        ValueEntry valueEntry = new ValueEntry(null, null, null, 0);
        this.A00 = valueEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
        this.valueSetCapacity = 2;
        int readInt = stream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = stream.readObject();
            compactLinkedHashMap.put(readObject, new RSI(this, readObject, this.valueSetCapacity));
        }
        int readInt2 = stream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = stream.readObject();
            Object readObject3 = stream.readObject();
            Collection collection = (Collection) compactLinkedHashMap.get(readObject2);
            collection.getClass();
            collection.add(readObject3);
        }
        A0A(compactLinkedHashMap);
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        stream.writeInt(keySet().size());
        Iterator it = keySet().iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
        stream.writeInt(((AbstractMapBasedMultimap) this).A00);
        for (Map.Entry entry : ASw()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, X.C46g
    public final void clear() {
        super.clear();
        ValueEntry valueEntry = this.A00;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
    }
}
