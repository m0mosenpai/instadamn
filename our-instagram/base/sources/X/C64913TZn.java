package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TZn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64913TZn extends LinkedHashMap {
    public C64913TZn() {
        super(1, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return AbstractC25230BEn.A1S(size(), 10);
    }
}
