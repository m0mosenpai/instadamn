package X;

import com.facebook.R;

/* loaded from: classes4.dex */
public abstract class AEI {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return R.style.RainbowGradientPatternStyle;
            case 2:
                return R.style.BlackGradientPatternStyle;
            case 3:
                return R.style.YellowOrangeGradientPatternStyle;
            default:
                return R.style.OrangePatternStyle;
        }
    }

    public static final Integer A01(Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        int length = (i + 1) % C05F.A00(4).length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    return C05F.A00;
                }
                return C05F.A0N;
            }
            return C05F.A0C;
        }
        return C05F.A01;
    }
}
