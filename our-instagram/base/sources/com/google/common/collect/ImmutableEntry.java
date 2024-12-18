package com.google.common.collect;

import X.AbstractC43592JPx;
import X.AbstractC918149h;
import java.io.Serializable;

/* loaded from: classes10.dex */
public class ImmutableEntry extends AbstractC918149h implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object key;
    public final Object value;

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object getKey() {
        return this.key;
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    public ImmutableEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object setValue(Object value) {
        throw AbstractC43592JPx.A11();
    }
}
