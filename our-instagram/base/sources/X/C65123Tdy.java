package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Tdy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65123Tdy<K, V> extends AbstractC64938TaE<Map.Entry<K, V>, K, V> {
    public final C58476Pw2 A00;

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
        return new TTH(this.A00);
    }

    public C65123Tdy(C58476Pw2 c58476Pw2) {
        this.A00 = c58476Pw2;
    }

    @Override // X.AnonymousClass041, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }
}
