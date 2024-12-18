package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.Ffk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35192Ffk {
    public static byte[] A00 = {88, 90, 90, 86, 76, 87, 77, 74, 22, 93, 80, 74, 88, 91, 85, 92, 102, 77, 86, 77, 73, 102, 77, 78, 86, 102, 95, 88, 90, 77, 86, 75, 22, 22, 20, 20, 24, 2, 25, 3, 4, 88, 16, 18, 25, 18, 5, 22, 3, 18, 40, 3, 0, 24, 40, 17, 22, 20, 3, 24, 5, 40, 3, 24, 3, 7, 40, 28, 18, 14, 88, 9, 8, 27, 4, 14, 8, 50, 4, 9, 118, 110, 105, 104, 99, 89, 104, 115, 107, 100, 99, 116, 109, 110, 118, 70, Byte.MAX_VALUE, 120, 122, 109, 118, 107, 54, 106, 124, 119, 125, 70, 109, 110, 118, 70, Byte.MAX_VALUE, 120, 122, 109, 118, 107, 70, 124, 119, 120, 123, 117, 124, 70, 110, 113, 120, 109, 106, 120, 105, 105, 54};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static final C1ON A00(AbstractC12990ll abstractC12990ll, String str, String str2) {
        C25621Ms A0C = AbstractC31179DnN.A0C(abstractC12990ll);
        A0C.A0B(A01(92, 43, 74));
        A0C.A0R(ECV.class, C34820FVw.class);
        A0C.A9s(A01(71, 9, 62), str2);
        return AbstractC31172DnG.A0T(A0C, A01(80, 12, 85), str);
    }

    public static final void A02(Context context, C1P1 c1p1, AbstractC12990ll abstractC12990ll) {
        C25621Ms A0C = AbstractC31179DnN.A0C(abstractC12990ll);
        A0C.A0B(A01(33, 38, 36));
        A0C.A9s(A01(71, 9, 62), C16030qx.A00(context));
        A0C.A0R(EAZ.class, FSL.class);
        AbstractC31175DnJ.A1K(A0C, c1p1);
    }
}
