package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.07d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C018307d {
    public final Map A00 = new LinkedHashMap();

    public final void A00() {
        Map map = this.A00;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((AbstractC52922bZ) it.next()).clear$lifecycle_viewmodel_release();
        }
        map.clear();
    }
}
