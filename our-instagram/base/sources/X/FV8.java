package X;

import com.instagram.common.typedurl.SimpleImageUrl;

/* loaded from: classes6.dex */
public abstract class FV8 {
    public static final SimpleImageUrl A00(C32057E6j c32057E6j) {
        int i;
        C14360o3.A0B(c32057E6j, 0);
        android.net.Uri A00 = LHB.A00(c32057E6j.A0A, null, c32057E6j.A01);
        Integer num = c32057E6j.A05;
        int i2 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        Integer num2 = c32057E6j.A04;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return AbstractC81033jX.A00(A00, i, i2);
    }

    public static final EnumC40111tc A01(C32057E6j c32057E6j) {
        switch (c32057E6j.A00) {
            case 1:
            case 2:
            case 3:
            case 8:
            case 10:
                return EnumC40111tc.A0Q;
            case 4:
            case 9:
                return EnumC40111tc.A0a;
            case 5:
                return EnumC40111tc.A07;
            case 6:
            case 7:
            default:
                return null;
        }
    }
}
