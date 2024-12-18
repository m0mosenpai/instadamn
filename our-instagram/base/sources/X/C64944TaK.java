package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TaK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64944TaK<K, V> extends AbstractC06970Yo<Map.Entry<? extends K, ? extends V>> implements InterfaceC65696TsI<Map.Entry<? extends K, ? extends V>> {
    public final C6LV A00;

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
        C6LW c6lw = this.A00.A00;
        C14360o3.A0B(c6lw, 1);
        TT7[] tt7Arr = new TT7[8];
        int i = 0;
        do {
            tt7Arr[i] = new TT7();
            i++;
        } while (i < 8);
        return new TTE(c6lw, tt7Arr);
    }

    public C64944TaK(C6LV c6lv) {
        this.A00 = c6lv;
    }
}
