package X;

import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2XZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XZ {
    public static final int A01(EnumC78643fW enumC78643fW, float f) {
        int A00;
        int i;
        int ordinal = enumC78643fW.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    A00 = C2WL.A00(f);
                    i = Integer.MIN_VALUE;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected YogaMeasureMode: ");
                    sb.append(enumC78643fW);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        } else {
            A00 = C2WL.A00(f);
            i = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        }
        return View.MeasureSpec.makeMeasureSpec(A00, i);
    }

    public static final String A02(int i) {
        String str;
        if (i == -1) {
            return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        StringBuilder sb = new StringBuilder();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    sb.append(mode);
                    str = " ";
                } else {
                    str = "EXACTLY ";
                }
            } else {
                str = "UNSPECIFIED ";
            }
        } else {
            str = "AT_MOST ";
        }
        sb.append(str);
        sb.append(size);
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final int A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return View.MeasureSpec.getSize(i);
                }
                throw new IllegalStateException(AnonymousClass001.A0O("Unexpected size mode: ", View.MeasureSpec.getMode(i)));
            }
            return i2;
        }
        return Math.min(View.MeasureSpec.getSize(i), i2);
    }
}
