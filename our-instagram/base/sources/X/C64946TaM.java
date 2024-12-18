package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TaM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64946TaM<K, V> extends AbstractC06970Yo<Map.Entry<? extends K, ? extends V>> implements InterfaceC65696TsI<Map.Entry<? extends K, ? extends V>> {
    public final C6LT A00;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.size();
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C14360o3.A0B(entry, 0);
        return AbstractC62826SSy.A00(entry, this.A00);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new TT8(this.A00);
    }

    public C64946TaM(C6LT c6lt) {
        this.A00 = c6lt;
    }
}
