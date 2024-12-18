package X;

/* renamed from: X.RNx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60717RNx extends RO3 {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    @Override // X.AbstractC64898TYy
    public final boolean A07() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63313ShL.A01(i, this.A01);
        Object obj = this.A02[i + i + this.A00];
        obj.getClass();
        return obj;
    }

    public C60717RNx(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
