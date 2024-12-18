package X;

import java.util.AbstractList;

/* loaded from: classes10.dex */
public final class TZ0 extends AbstractList<Object> {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object[] A02;

    public TZ0(final Object val$rest, final Object val$first, final Object[] val$second) {
        this.A02 = val$second;
        this.A00 = val$rest;
        this.A01 = val$first;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int index) {
        if (index != 0) {
            if (index != 1) {
                return this.A02[index - 2];
            }
            return this.A01;
        }
        return this.A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 2;
    }
}
