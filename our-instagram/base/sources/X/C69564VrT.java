package X;

import com.facebook.maps.ttrc.common.MapboxTTRC;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VrT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69564VrT {
    public int A00;
    public int A01;
    public Map A02;

    public final int A00(String str) {
        Map map = this.A02;
        if (map.get(str) == null) {
            C0K8.A0C("MapboxTTRC", "Trying to get request number for a URL that's never been seen");
            return 999;
        }
        return AbstractC65702TsY.A0E(str, map);
    }

    public C69564VrT() {
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        hashMap.clear();
        this.A00 = 0;
        this.A01 = 0;
        MapboxTTRC.sStyleImageMissingCount = 1;
    }
}
