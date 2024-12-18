package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51492Xw {
    public final Map A01 = new LinkedHashMap();
    public final Map A03 = new LinkedHashMap();
    public final Map A00 = new LinkedHashMap();
    public final Map A02 = new HashMap();

    public final void A00(C51272Xa c51272Xa) {
        Map map;
        if (this.A02.remove(c51272Xa) != null) {
            int i = c51272Xa.A00;
            if (i != 1) {
                if (i != 2) {
                    map = this.A00;
                } else {
                    String str = c51272Xa.A01;
                    Map map2 = this.A03;
                    Map map3 = (Map) map2.get(str);
                    map3.remove(c51272Xa.A02);
                    if (!map3.isEmpty()) {
                        return;
                    }
                    map2.remove(str);
                    return;
                }
            } else {
                map = this.A01;
            }
            map.remove(c51272Xa.A02);
        }
    }
}
