package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2X4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2X4 {
    public int A00;
    public final Map A01;

    public C2X4(C2X4 c2x4) {
        int i;
        Map map;
        if (c2x4 != null) {
            i = c2x4.A00;
        } else {
            i = -1;
        }
        this.A00 = i;
        if (c2x4 != null) {
            map = c2x4.A01;
        } else {
            map = C16920sk.A00;
            C14360o3.A0C(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        this.A01 = new HashMap(map);
    }

    public C2X4() {
        this(null);
    }
}
