package X;

import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VVB {
    public static final VEB A00(String str) {
        Map map = VEB.A01;
        if (map == null) {
            C14360o3.A0F("reverseMap");
            throw C00O.createAndThrow();
        }
        VEB veb = (VEB) map.get(str);
        if (veb == null) {
            return VEB.A0H;
        }
        return veb;
    }
}
