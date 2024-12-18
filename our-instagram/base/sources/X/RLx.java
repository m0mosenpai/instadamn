package X;

/* loaded from: classes10.dex */
public final class RLx extends RLz {
    public final transient RLz A00;

    @Override // X.RLz, X.AbstractC64897TYx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        RLz rLz = this.A00;
        AbstractC63065Sbm.A01(i, rLz.size());
        return rLz.get(AbstractC58318PtA.A08(rLz) - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public RLx(RLz rLz) {
        this.A00 = rLz;
    }
}
