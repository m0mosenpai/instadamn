package X;

import android.graphics.Rect;

/* renamed from: X.LBe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47840LBe {
    public static void A00(Rect rect, String str, StringBuilder sb) {
        sb.append(rect.width());
        sb.append('x');
        sb.append(rect.height());
        sb.append(str);
    }

    public static boolean A01(Rect rect, Rect rect2, int i) {
        boolean z;
        if (!LHK.A01(rect2.width() / rect2.height(), i)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Invalid preview aspect ratio. Preview: ");
            A00(rect2, ", Fullsize: ", A1C);
            A00(rect, ", exif: ", A1C);
            A1C.append(i);
            AbstractC12120kG.A0C("CropUtil", AbstractC166997dE.A0x("\")\n", A1C), null);
            z = false;
        } else {
            z = true;
        }
        if (!LHK.A01(rect.width() / rect.height(), i)) {
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("Invalid full size aspect ratio. Preview: ");
            A00(rect2, ", Fullsize: ", A1C2);
            A00(rect, ", exif: ", A1C2);
            A1C2.append(i);
            AbstractC12120kG.A0C("CropUtil", A1C2.toString(), null);
            return false;
        }
        return z;
    }
}
