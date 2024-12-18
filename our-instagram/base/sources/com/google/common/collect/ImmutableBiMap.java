package com.google.common.collect;

import X.AbstractC58318PtA;
import X.C00O;
import X.InterfaceC65694TsG;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* loaded from: classes10.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements InterfaceC65694TsG<K, V> {
    public static final long serialVersionUID = 912559;

    /* loaded from: classes10.dex */
    public class SerializedForm extends ImmutableMap.SerializedForm {
        public static final long serialVersionUID = 0;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ ImmutableCollection values() {
        return ((RegularImmutableBiMap) this).A00.keySet();
    }

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final /* bridge */ /* synthetic */ ImmutableCollection createValues() {
        throw AbstractC58318PtA.A0W("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        throw C00O.createAndThrow();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return ((RegularImmutableBiMap) this).A00.keySet();
    }
}
