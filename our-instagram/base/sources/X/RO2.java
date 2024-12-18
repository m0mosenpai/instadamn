package X;

/* loaded from: classes10.dex */
public final class RO2 extends RO3 {
    public static final RO3 A02 = new RO2(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    @Override // X.AbstractC64898TYy
    public final int A04() {
        return this.A01;
    }

    @Override // X.AbstractC64898TYy
    public final int A05() {
        return 0;
    }

    @Override // X.AbstractC64898TYy
    public final Object[] A06() {
        return this.A00;
    }

    @Override // X.AbstractC64898TYy
    public final boolean A07() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    @Override // X.RO3, X.AbstractC64898TYy
    public final int A08(Object[] objArr, int i) {
        Object[] objArr2 = this.A00;
        int i2 = this.A01;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63313ShL.A01(i, this.A01);
        Object obj = this.A00[i];
        obj.getClass();
        return obj;
    }

    public RO2(Object[] objArr, int i) {
        this.A00 = objArr;
        this.A01 = i;
    }
}
