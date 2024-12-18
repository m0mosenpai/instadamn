package X;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1Yf, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Yf {
    public final Map A00 = new LinkedHashMap();

    public final void A00(C1Ym... c1YmArr) {
        C14360o3.A0B(c1YmArr, 0);
        for (C1Ym c1Ym : c1YmArr) {
            int i = c1Ym.startVersion;
            int i2 = c1Ym.endVersion;
            Map map = this.A00;
            Integer valueOf = Integer.valueOf(i);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            AbstractMap abstractMap = (AbstractMap) obj;
            Integer valueOf2 = Integer.valueOf(i2);
            if (abstractMap.containsKey(valueOf2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(abstractMap.get(valueOf2));
                sb.append(" with ");
                sb.append(c1Ym);
                android.util.Log.w("ROOM", sb.toString());
            }
            abstractMap.put(valueOf2, c1Ym);
        }
    }
}
