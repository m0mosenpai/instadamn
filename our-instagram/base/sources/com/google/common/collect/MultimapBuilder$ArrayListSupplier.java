package com.google.common.collect;

import X.InterfaceC216113n;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class MultimapBuilder$ArrayListSupplier implements InterfaceC216113n, Serializable {
    public final int expectedValuesPerKey = 2;

    @Override // X.InterfaceC216113n
    public final /* bridge */ /* synthetic */ Object get() {
        return new ArrayList(this.expectedValuesPerKey);
    }
}
