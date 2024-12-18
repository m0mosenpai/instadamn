package X;

/* renamed from: X.Ta9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64933Ta9<E> extends AbstractC06990Yq<E> implements C5Hc<E> {
    public int A00;
    public final int A01;
    public final C5Hc A02;

    public C64933Ta9(C5Hc c5Hc, int i, int i2) {
        C14360o3.A0B(c5Hc, 1);
        this.A02 = c5Hc;
        this.A01 = i;
        C6C4.A02(i, i2, c5Hc.size());
        this.A00 = i2 - i;
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    /* renamed from: Ep2, reason: merged with bridge method [inline-methods] */
    public final C64933Ta9 subList(int i, int i2) {
        C6C4.A02(i, i2, this.A00);
        C5Hc c5Hc = this.A02;
        int i3 = this.A01;
        return new C64933Ta9(c5Hc, i + i3, i3 + i2);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        C6C4.A00(i, this.A00);
        return this.A02.get(this.A01 + i);
    }
}
