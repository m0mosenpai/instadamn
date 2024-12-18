package X;

/* loaded from: classes10.dex */
public final class RN2 extends RN5 {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ RN5 A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    public RN2(RN5 rn5, int i, int i2) {
        this.A02 = rn5;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63067Sbo.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
