package X;

import java.util.Iterator;

/* renamed from: X.57J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57J<E> extends AbstractC06970Yo<E> implements C57K<E> {
    public static final C57J A03;
    public final C57M A00;
    public final Object A01;
    public final Object A02;

    static {
        C57L c57l = C57L.A00;
        C57M c57m = C57M.A02;
        C14360o3.A0C(c57m, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        A03 = new C57J(c57m, c57l, c57l);
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.size();
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new TTB(this.A01, this.A00);
    }

    public C57J(C57M c57m, Object obj, Object obj2) {
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = c57m;
    }
}
