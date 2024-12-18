package X;

/* renamed from: X.TTm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64778TTm<K, V, E> implements java.util.Set<E>, InterfaceC019007k {
    public final C64770TTe A00;

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC13370mN.A01(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public AbstractC64778TTm(C64770TTe c64770TTe) {
        this.A00 = c64770TTe;
    }
}
