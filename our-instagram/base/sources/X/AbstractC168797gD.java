package X;

import com.facebook.ui.emoji.model.Emoji;

/* renamed from: X.7gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168797gD {
    public static boolean A02(String str) {
        if (str != null) {
            int length = str.length();
            if (AbstractC168807gF.A00.A01(str, 0, length) == length) {
                return true;
            }
        }
        return false;
    }

    public static int A00(int[] iArr, int i) {
        if (i > 0 && i < 11) {
            if (i > 1) {
                if (iArr[1] == 65039) {
                    i--;
                } else {
                    System.arraycopy(iArr, 1, iArr, 2, i - 1);
                }
            }
            iArr[1] = 127995;
            if (iArr[i] != 65039) {
                i++;
            }
            C46y c46y = AbstractC168807gF.A00;
            int[] iArr2 = c46y.A01;
            int i2 = c46y.A00;
            if (c46y.A03(iArr2, iArr, 0, i2, 0, i) == i) {
                return i;
            }
            if (i >= 6 && i < iArr.length - 1) {
                int i3 = i + 1;
                iArr[i] = 127995;
                if (c46y.A03(iArr2, iArr, 0, i2, 0, i3) == i3) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static boolean A01(String str) {
        int i;
        int[] A02 = Emoji.A02();
        int A00 = Emoji.A00(str, A02);
        if (A00 > 1 && (i = A02[1]) >= 127995 && i <= 127999) {
            Emoji.A01.EE6(A02);
        } else {
            int A002 = A00(A02, A00);
            Emoji.A01.EE6(A02);
            if (A002 < 0) {
                return false;
            }
        }
        return true;
    }
}
