package X;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.SeX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63172SeX {
    public static final Bitmap.Config[] A03;
    public static final Bitmap.Config[] A04;
    public static final Bitmap.Config[] A05;
    public static final Bitmap.Config[] A06;
    public static final Bitmap.Config[] A07;
    public final QBF A01 = new SAV();
    public final SPZ A00 = new SPZ();
    public final Map A02 = AbstractC166987dD.A1G();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        A05 = configArr;
        A06 = configArr;
        A07 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        A04 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        A03 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static void A00(Bitmap bitmap, C63172SeX c63172SeX, Integer num) {
        Bitmap.Config config = bitmap.getConfig();
        Map map = c63172SeX.A02;
        Map map2 = (Map) map.get(config);
        if (map2 == null) {
            map2 = new TreeMap();
            map.put(config, map2);
        }
        Number A0Q = AbstractC37300Gc1.A0Q(num, map2);
        if (A0Q != null) {
            int intValue = A0Q.intValue();
            if (intValue == 1) {
                map2.remove(num);
                return;
            } else {
                AbstractC37301Gc2.A1T(num, map2, intValue - 1);
                return;
            }
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Tried to decrement empty size, size: ");
        A1C.append(num);
        A1C.append(", removed: ");
        int A01 = C63375Sim.A01(bitmap);
        Bitmap.Config config2 = bitmap.getConfig();
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("[");
        A1C2.append(A01);
        A1C2.append("](");
        A1C.append(AbstractC58323PtF.A0q(config2, A1C2));
        throw AbstractC166987dD.A15(AbstractC167017dG.A0n(c63172SeX, ", this: ", A1C));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SizeConfigStrategy{groupedMap=");
        A1C.append(this.A00);
        A1C.append(", sortedSizes=(");
        Map map = this.A02;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            A1C.append(A1K.getKey());
            A1C.append('[');
            A1C.append(A1K.getValue());
            A1C.append("], ");
        }
        if (!map.isEmpty()) {
            A1C.replace(A1C.length() - 2, A1C.length(), "");
        }
        return AbstractC166997dE.A0x(")}", A1C);
    }
}
