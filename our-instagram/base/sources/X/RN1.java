package X;

/* loaded from: classes10.dex */
public final class RN1 extends RN5 {
    public final /* synthetic */ RN7 A00;

    public RN1(RN7 rn7) {
        this.A00 = rn7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        RN7 rn7 = this.A00;
        AbstractC63067Sbo.A01(i, rn7.A00);
        int i2 = i + i;
        Object[] objArr = rn7.A01;
        return AbstractC58323PtF.A0x(objArr[i2], objArr, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.A00;
    }
}
