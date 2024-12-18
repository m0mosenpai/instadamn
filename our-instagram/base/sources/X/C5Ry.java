package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.5Ry, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Ry {
    public static final Integer A05 = -1;
    public String A03;
    public String A04;
    public Integer A02 = 0;
    public Integer A01 = 0;
    public ImageUrl A00 = new SimpleImageUrl("", -1, -1);

    public final void A00() {
        int intValue;
        String str = this.A03;
        if (str == null) {
            str = "";
        }
        Integer num = A05;
        Integer num2 = this.A02;
        if (num2 == null) {
            num2 = num;
            C14360o3.A08(num);
        }
        int i = -1;
        if (-1 == num2.intValue()) {
            intValue = -1;
        } else {
            Integer num3 = this.A02;
            if (num3 == null) {
                num3 = num;
                C14360o3.A08(num);
            }
            intValue = num3.intValue();
        }
        Integer num4 = this.A01;
        if (num4 == null) {
            num4 = num;
            C14360o3.A08(num);
        }
        if (-1 != num4.intValue()) {
            Integer num5 = this.A01;
            if (num5 == null) {
                num5 = num;
                C14360o3.A08(num);
            }
            i = num5.intValue();
        }
        this.A00 = new SimpleImageUrl(str, intValue, i);
    }
}
