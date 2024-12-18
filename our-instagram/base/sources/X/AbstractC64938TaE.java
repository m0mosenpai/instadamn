package X;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.TaE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64938TaE<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AnonymousClass041<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        Map map;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C14360o3.A0B(entry, 0);
        if (this instanceof C65123Tdy) {
            map = ((C65123Tdy) this).A00;
        } else {
            map = ((C65122Tdx) this).A00;
        }
        return AbstractC62826SSy.A00(entry, map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C14360o3.A0B(entry, 0);
        if (this instanceof C65123Tdy) {
            return ((C65123Tdy) this).A00.remove(entry.getKey(), entry.getValue());
        }
        return ((C65122Tdx) this).A00.remove(entry.getKey(), entry.getValue());
    }
}
