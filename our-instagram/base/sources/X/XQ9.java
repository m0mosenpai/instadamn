package X;

import androidx.media3.common.Timeline;
import java.util.Arrays;

/* loaded from: classes12.dex */
public abstract class XQ9 extends Timeline {
    public final int A00;
    public final YMO A01;

    @Override // androidx.media3.common.Timeline
    public final C72843Xop A0B(C72843Xop c72843Xop, int i, boolean z) {
        XQH xqh = (XQH) this;
        int[] iArr = xqh.A03;
        int i2 = i + 1;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
            xqh.A05[binarySearch].A0B(c72843Xop, i - iArr[binarySearch], true);
            throw null;
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i2);
        xqh.A05[binarySearch].A0B(c72843Xop, i - iArr[binarySearch], true);
        throw null;
    }

    public static int A00(XQ9 xq9, int i, boolean z) {
        if (z) {
            Y95 y95 = (Y95) xq9.A01;
            int i2 = y95.A01[i] + 1;
            int[] iArr = y95.A02;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }
        if (i >= xq9.A00 - 1) {
            return -1;
        }
        return i + 1;
    }

    public XQ9(YMO ymo) {
        this.A01 = ymo;
        this.A00 = ((Y95) ymo).A02.length;
    }
}
