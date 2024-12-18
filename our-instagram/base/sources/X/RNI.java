package X;

/* loaded from: classes10.dex */
public final class RNI extends RNL {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ RNL A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    public RNI(RNL rnl, int i, int i2) {
        this.A02 = rnl;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63068Sbp.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
