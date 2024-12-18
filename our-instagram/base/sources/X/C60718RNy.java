package X;

/* renamed from: X.RNy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60718RNy extends RO3 {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ RO3 A02;

    @Override // X.AbstractC64898TYy
    public final Object[] A06() {
        return this.A02.A06();
    }

    @Override // X.AbstractC64898TYy
    public final boolean A07() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    public C60718RNy(RO3 ro3, int i, int i2) {
        this.A02 = ro3;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC64898TYy
    public final int A04() {
        return this.A02.A05() + this.A00 + this.A01;
    }

    @Override // X.AbstractC64898TYy
    public final int A05() {
        return this.A02.A05() + this.A00;
    }

    @Override // X.RO3
    /* renamed from: A0A */
    public final RO3 subList(int i, int i2) {
        AbstractC63313ShL.A03(i, i2, this.A01);
        int i3 = this.A00;
        return this.A02.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63313ShL.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
