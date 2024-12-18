package X;

/* loaded from: classes10.dex */
public final class RNH extends RNL {
    public final /* synthetic */ RNN A00;

    public RNH(RNN rnn) {
        this.A00 = rnn;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        RNN rnn = this.A00;
        AbstractC63068Sbp.A01(i, rnn.A00);
        int i2 = i + i;
        Object[] objArr = rnn.A01;
        return AbstractC58323PtF.A0x(objArr[i2], objArr, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.A00;
    }
}
