package X;

import java.util.List;

/* renamed from: X.Ta8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64932Ta8<E> extends AbstractC06990Yq<E> implements C6MO<E> {
    public int A00;
    public final int A01;
    public final C6MO A02;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        AbstractC63038SbD.A00(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        AbstractC63038SbD.A02(i, i2, this.A00);
        C6MO c6mo = this.A02;
        int i3 = this.A01;
        return new C64932Ta8(c6mo, i + i3, i3 + i2);
    }

    public C64932Ta8(C6MO c6mo, int i, int i2) {
        this.A02 = c6mo;
        this.A01 = i;
        AbstractC63038SbD.A02(i, i2, c6mo.size());
        this.A00 = i2 - i;
    }
}
