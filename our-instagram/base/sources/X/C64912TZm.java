package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TZm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64912TZm<K, V> extends LinkedHashMap<K, V> {
    public int A00;

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return AbstractC25230BEn.A1S(size(), this.A00);
    }
}
