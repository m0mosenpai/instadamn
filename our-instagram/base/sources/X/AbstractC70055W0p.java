package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W0p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70055W0p {
    public static final List A00;

    static {
        ArrayList arrayList = new ArrayList();
        A00 = arrayList;
        arrayList.add(new C68556VVj());
        arrayList.add(new C68557VVk());
        arrayList.add(new C68558VVl());
        arrayList.add(new C68559VVm());
        arrayList.add(new C68560VVn());
    }

    public static final void A00(C47Z c47z) {
        if (c47z.A1G == EnumC40111tc.A0a) {
            float f = c47z.A02;
            if (f <= 0.0f) {
                VD5 vd5 = VD5.A06;
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Cannot post media without a valid output aspect ratio. aspect ratio=%s", Float.valueOf(f));
                C14360o3.A07(formatStrLocaleSafe);
                throw new VIE(vd5, formatStrLocaleSafe);
            }
        }
    }
}
