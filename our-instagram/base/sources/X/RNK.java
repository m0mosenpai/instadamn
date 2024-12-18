package X;

/* loaded from: classes10.dex */
public final class RNK extends RNL {
    public static final RNL A02 = new RNK(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] A01;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63068Sbp.A01(i, this.A00);
        Object obj = this.A01[i];
        obj.getClass();
        return obj;
    }

    public RNK(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }
}
