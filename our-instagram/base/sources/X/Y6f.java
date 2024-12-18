package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Y6f {
    public final Integer A00;
    public final Map A01 = AbstractC166987dD.A1G();

    public static void A01(Y49 y49, C72723Xlv c72723Xlv) {
        int i;
        byte b = c72723Xlv.A00;
        short s = c72723Xlv.A01;
        if (b == 2) {
            y49.A00 = Short.valueOf(s);
            return;
        }
        byte b2 = Y49.A05[b];
        short s2 = y49.A02;
        if (s > s2 && (i = s - s2) <= 15) {
            y49.A03.write((byte) ((i << 4) | b2));
        } else {
            y49.A03.write(b2);
            Y49.A00(y49, (s >> 31) ^ (s << 1));
        }
        y49.A02 = s;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.Y49 r8) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y6f.A06(X.Y49):void");
    }

    public Y6f(Integer num) {
        this.A00 = num;
    }

    public static Iterator A00(Y49 y49, C72723Xlv c72723Xlv, Map map, byte b) {
        A01(y49, c72723Xlv);
        List list = (List) map.get(c72723Xlv);
        y49.A02(list.size(), b);
        return list.iterator();
    }

    public static void A02(Y49 y49, C72723Xlv c72723Xlv, Map map) {
        if (map.containsKey(c72723Xlv) && map.get(c72723Xlv) != null) {
            A01(y49, c72723Xlv);
            int intValue = ((Number) map.get(c72723Xlv)).intValue();
            Y49.A00(y49, (intValue >> 31) ^ (intValue << 1));
        }
    }

    public static void A03(Y49 y49, C72723Xlv c72723Xlv, Map map) {
        if (map.containsKey(c72723Xlv) && map.get(c72723Xlv) != null) {
            A01(y49, c72723Xlv);
            y49.A04((String) map.get(c72723Xlv));
        }
    }

    public static void A04(Y49 y49, C72723Xlv c72723Xlv, Map map) {
        int i;
        if (map.containsKey(c72723Xlv) && map.get(c72723Xlv) != null) {
            A01(y49, c72723Xlv);
            boolean booleanValue = ((Boolean) map.get(c72723Xlv)).booleanValue();
            Short sh = y49.A00;
            int i2 = 1;
            if (sh != null) {
                short shortValue = sh.shortValue();
                if (!booleanValue) {
                    i2 = 2;
                }
                short s = y49.A02;
                if (shortValue > s && (i = shortValue - s) <= 15) {
                    y49.A03.write((byte) ((i << 4) | i2));
                } else {
                    y49.A03.write(i2);
                    Y49.A00(y49, (shortValue >> 31) ^ (shortValue << 1));
                }
                y49.A02 = shortValue;
                y49.A00 = null;
                return;
            }
            if (!booleanValue) {
                i2 = 2;
            }
            y49.A03.write(i2);
        }
    }

    public static void A05(Y49 y49, C72723Xlv c72723Xlv, Map map) {
        if (map.containsKey(c72723Xlv) && map.get(c72723Xlv) != null) {
            A01(y49, c72723Xlv);
            y49.A03(((Number) map.get(c72723Xlv)).longValue());
        }
    }
}
