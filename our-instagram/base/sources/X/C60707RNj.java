package X;

/* renamed from: X.RNj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60707RNj extends AbstractC60708RNk {
    public static final AbstractC60708RNk A02 = new C60707RNj(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] A01;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63069Sbq.A01(i, this.A00);
        Object obj = this.A01[i];
        obj.getClass();
        return obj;
    }

    public C60707RNj(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }
}
