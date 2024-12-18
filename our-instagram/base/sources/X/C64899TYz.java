package X;

import java.lang.reflect.Array;
import java.util.AbstractList;

/* renamed from: X.TYz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64899TYz extends AbstractList {
    public final /* synthetic */ Object A00;

    public C64899TYz(Object obj) {
        this.A00 = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Array.get(this.A00, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return Array.getLength(this.A00);
    }
}
