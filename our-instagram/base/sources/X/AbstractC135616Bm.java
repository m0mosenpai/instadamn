package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.6Bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC135616Bm {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001f. Please report as an issue. */
    public static int A00(List list, int i) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            for (Object obj : list) {
                String obj2 = obj.toString();
                switch (obj2.hashCode()) {
                    case -1699597560:
                        if (!obj2.equals("bottom_right")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Can't parse corner: ");
                            sb.append(obj);
                            throw new IOException(sb.toString());
                        }
                        i2 |= 4;
                    case -966253391:
                        if (!obj2.equals("top_left")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Can't parse corner: ");
                            sb2.append(obj);
                            throw new IOException(sb2.toString());
                        }
                        i2 |= 1;
                    case -609197669:
                        if (!obj2.equals("bottom_left")) {
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("Can't parse corner: ");
                            sb22.append(obj);
                            throw new IOException(sb22.toString());
                        }
                        i2 |= 8;
                    case 116576946:
                        if (!obj2.equals("top_right")) {
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append("Can't parse corner: ");
                            sb222.append(obj);
                            throw new IOException(sb222.toString());
                        }
                        i2 |= 2;
                    default:
                        StringBuilder sb2222 = new StringBuilder();
                        sb2222.append("Can't parse corner: ");
                        sb2222.append(obj);
                        throw new IOException(sb2222.toString());
                }
            }
            return i2;
        }
        return i;
    }

    public static void A01(float[] fArr, float f, int i) {
        float f2 = 0.0f;
        if ((i & 1) != 0) {
            f2 = f;
        }
        float f3 = 0.0f;
        if ((i & 2) != 0) {
            f3 = f;
        }
        float f4 = 0.0f;
        if ((i & 4) != 0) {
            f4 = f;
        }
        if ((i & 8) == 0) {
            f = 0.0f;
        }
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f;
        fArr[6] = f;
    }

    public static boolean A02(int i) {
        if (i != 0) {
            if ((i & 1) != 0 && (i & 2) != 0 && (i & 4) != 0 && (i & 8) != 0) {
                return true;
            }
            return false;
        }
        return true;
    }
}
