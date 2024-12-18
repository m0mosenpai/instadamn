package X;

/* loaded from: classes10.dex */
public final class RNJ extends RNL {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63068Sbp.A01(i, this.A01);
        Object obj = this.A02[i + i + this.A00];
        obj.getClass();
        return obj;
    }

    public RNJ(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
