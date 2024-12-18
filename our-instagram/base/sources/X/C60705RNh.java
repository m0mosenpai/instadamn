package X;

/* renamed from: X.RNh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60705RNh extends AbstractC60708RNk {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AbstractC60708RNk A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    public C60705RNh(AbstractC60708RNk abstractC60708RNk, int i, int i2) {
        this.A02 = abstractC60708RNk;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC63069Sbq.A01(i, this.A01);
        return this.A02.get(i + this.A00);
    }
}
