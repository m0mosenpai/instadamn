package X;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.5L9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5L9 {
    public static final EnumC172127lh A00(Map map) {
        Object obj = map.get(AbstractC58317Pt9.A00(34));
        EnumC172127lh enumC172127lh = EnumC172127lh.A05;
        if (obj != enumC172127lh) {
            return (EnumC172127lh) map.get(AbstractC58317Pt9.A00(17));
        }
        return enumC172127lh;
    }

    public static final boolean A02(Context context) {
        String A00 = AbstractC58317Pt9.A00(17);
        String A002 = AbstractC58317Pt9.A00(82);
        String A003 = AbstractC58317Pt9.A00(80);
        String[] strArr = (String[]) AbstractC16830sb.A07(A00, A002, A003).toArray(new String[0]);
        if (!AbstractC23451Ch.A08(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            String[] strArr2 = (String[]) AbstractC16830sb.A07(AbstractC58317Pt9.A00(34), A003).toArray(new String[0]);
            if (!AbstractC23451Ch.A08(context, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A03(Context context) {
        String A00 = AbstractC58317Pt9.A00(17);
        String A002 = AbstractC58317Pt9.A00(82);
        String A003 = AbstractC58317Pt9.A00(80);
        String[] strArr = (String[]) AbstractC16830sb.A07(A00, A002, A003).toArray(new String[0]);
        if (!AbstractC23451Ch.A08(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            String[] strArr2 = (String[]) AbstractC16830sb.A07(AbstractC58317Pt9.A00(34), A003).toArray(new String[0]);
            if (AbstractC23451Ch.A08(context, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
                return true;
            }
        }
        return false;
    }

    public static final String[] A04() {
        String A00 = AbstractC58317Pt9.A00(17);
        String A002 = AbstractC58317Pt9.A00(82);
        String A003 = AbstractC58317Pt9.A00(80);
        return (String[]) AbstractC001800i.A0n(AbstractC16830sb.A07(A00, A002, A003), AbstractC16830sb.A07(AbstractC58317Pt9.A00(34), A003)).toArray(new String[0]);
    }

    public static final boolean A01(Activity activity) {
        if (!A02(activity)) {
            for (String str : A04()) {
                if (AbstractC23451Ch.A05(activity, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
