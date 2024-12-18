package X;

/* renamed from: X.RNw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60716RNw extends RO3 {
    public final /* synthetic */ RO0 A00;

    @Override // X.AbstractC64898TYy
    public final boolean A07() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.A00.A00;
        return i;
    }

    public C60716RNw(RO0 ro0) {
        this.A00 = ro0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        RO0 ro0 = this.A00;
        i2 = ro0.A00;
        AbstractC63313ShL.A01(i, i2);
        objArr = ro0.A02;
        int i3 = i + i;
        return AbstractC58323PtF.A0x(objArr[i3], objArr, i3);
    }
}
