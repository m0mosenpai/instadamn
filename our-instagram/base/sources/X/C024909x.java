package X;

import java.util.RandomAccess;

/* renamed from: X.09x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C024909x<E> extends AbstractC06990Yq<E> implements RandomAccess {
    public int A00;
    public final int A01;
    public final AbstractC06990Yq A02;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        C0eC.A02(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    public C024909x(AbstractC06990Yq abstractC06990Yq, int i, int i2) {
        this.A02 = abstractC06990Yq;
        this.A01 = i;
        C0eC.A04(i, i2, abstractC06990Yq.size());
        this.A00 = i2 - i;
    }
}
