package X;

import java.util.AbstractMap;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class RLv extends RLz {
    public final /* synthetic */ RM2 A00;

    public RLv(RM2 rm2) {
        this.A00 = rm2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        RM0 rm0 = this.A00.A00;
        Comparator comparator = RM0.A03;
        return new AbstractMap.SimpleImmutableEntry(rm0.A01.A01.get(i), rm0.A00.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.A00.size();
    }
}
