package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Tdx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65122Tdx<K, V> extends AbstractC64938TaE<Map.Entry<K, V>, K, V> {
    public final Pw1 A00;

    @Override // X.AnonymousClass041
    public final int A00() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new TTG(this.A00);
    }

    public C65122Tdx(Pw1 pw1) {
        this.A00 = pw1;
    }

    @Override // X.AnonymousClass041, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
