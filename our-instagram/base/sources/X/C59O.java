package X;

/* renamed from: X.59O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59O extends C57M<C5UQ<Object>, C5US<Object>> implements C59P {
    public static final C59O A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.57M, X.59O] */
    static {
        C57O c57o = C57O.A04;
        C14360o3.A0C(c57o, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        A00 = new C57M(c57o, 0);
    }

    @Override // X.C57M, X.AbstractC17010st, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C5UQ)) {
            return false;
        }
        return super.containsKey(obj);
    }

    @Override // X.AbstractC17010st, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C5US)) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // X.C57M, X.AbstractC17010st, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C5UQ)) {
            return null;
        }
        return super.get(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof C5UQ)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }
}
