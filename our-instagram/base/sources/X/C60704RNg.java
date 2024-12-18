package X;

/* renamed from: X.RNg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60704RNg extends AbstractC60708RNk {
    public final /* synthetic */ C60710RNm A00;

    public C60704RNg(C60710RNm c60710RNm) {
        this.A00 = c60710RNm;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C60710RNm c60710RNm = this.A00;
        AbstractC63069Sbq.A01(i, c60710RNm.A00);
        int i2 = i + i;
        Object[] objArr = c60710RNm.A01;
        return AbstractC58323PtF.A0x(objArr[i2], objArr, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.A00;
    }
}
