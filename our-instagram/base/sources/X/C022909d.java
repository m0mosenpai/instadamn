package X;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.09d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C022909d<E> extends AbstractC06990Yq<E> implements RandomAccess {
    public int A00;
    public int A01;
    public final List A02;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        C0eC.A02(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    public C022909d(List list) {
        this.A02 = list;
    }
}
