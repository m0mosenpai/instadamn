package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5qU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128005qU {
    public final int A00;
    public final C130505uv A01;
    public final List A02;
    public final Map A03;

    public C128005qU(C130505uv c130505uv, List list, Map map, int i) {
        this.A02 = list;
        this.A03 = map;
        this.A00 = i;
        this.A01 = c130505uv;
        if (!list.isEmpty()) {
            if (list.size() == map.size()) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }
}
