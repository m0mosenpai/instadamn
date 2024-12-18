package X;

/* renamed from: X.RNi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60706RNi extends AbstractC60708RNk {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63069Sbq.A01(i, this.A01);
        Object obj = this.A02[i + i + this.A00];
        obj.getClass();
        return obj;
    }

    public C60706RNi(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
