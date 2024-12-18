package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89513yr {
    public static final Drawable A00(Context context, Drawable drawable, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 2);
        return A04(context, drawable, f, num, num2, num3, num4, null, null, num5, str, list, i, z, z2, z3, z4, z5);
    }

    public static final Drawable A01(Context context, Float f, Integer num, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        return A00(context, null, f, C05F.A00, num, null, null, null, str, list, i, z, z2, z3, true, false);
    }

    public static final Drawable A02(Context context, String str, List list, int i) {
        return A00(context, null, null, C05F.A00, null, null, null, null, str, list, i, false, false, false, true, false);
    }

    public static final C89553yv A04(Context context, Drawable drawable, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 2);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass173) it.next()).Bhu());
        }
        return A03(context, drawable, f, num, num2, num3, null, num4, num5, num6, num7, str, arrayList, i, z, z2, z3, z4, z5);
    }

    public static final C89553yv A06(Context context, Float f, Integer num, Integer num2, String str, List list, int i) {
        return A04(context, null, f, C05F.A01, null, num, null, num2, null, null, str, list, i, false, true, false, true, false);
    }

    public static final C89553yv A07(Context context, String str, List list, int i) {
        return A05(context, null, C05F.A00, null, null, null, str, list, i, false, false);
    }

    public static final C89553yv A05(Context context, Float f, Integer num, Integer num2, Integer num3, Integer num4, String str, List list, int i, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 2);
        return A03(context, null, f, num, num2, num3, num4, null, null, null, null, str, list, i, z, z2, false, true, false);
    }

    public static final C89553yv A03(Context context, Drawable drawable, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 2);
        Integer num9 = null;
        Drawable drawable2 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        float f2 = 0.4f;
        int i3 = 3;
        boolean z6 = true;
        if (drawable != null) {
            drawable2 = drawable;
            if (!z && !z5) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            num12 = Integer.valueOf(i2);
            z6 = z4;
            if (num8 != null) {
                num11 = Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_color)));
                num10 = Integer.valueOf(num8.intValue());
            }
            if (num7 != null) {
                num11 = Integer.valueOf(num7.intValue());
            }
        }
        if (f != null) {
            f2 = f.floatValue();
        }
        if (num2 != null) {
            i3 = num2.intValue();
        }
        Integer valueOf = num3 != null ? Integer.valueOf(num3.intValue()) : null;
        Integer valueOf2 = num5 != null ? Integer.valueOf(num5.intValue()) : null;
        Integer valueOf3 = num6 != null ? Integer.valueOf(num6.intValue()) : null;
        if (num4 != null) {
            num9 = Integer.valueOf(num4.intValue());
        }
        if (valueOf == null) {
            valueOf = Integer.valueOf((int) AbstractC13880nE.A04(context, 2));
        }
        if (valueOf3 == null) {
            try {
                valueOf3 = Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)));
            } catch (Resources.NotFoundException e) {
                AbstractC53172bz.A03(context, e);
                context.getTheme().applyStyle(AbstractC53172bz.A00(), true);
                valueOf3 = Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)));
            }
        }
        int color = context.getColor(R.color.grey_5);
        if (num11 == null) {
            num11 = Integer.valueOf(context.getColor(R.color.grey_5));
        }
        int intValue = valueOf.intValue();
        int intValue2 = valueOf3.intValue();
        return AbstractC89523ys.A00(context, drawable2, num, num10, num12, valueOf2, null, num9, str, list, f2, i, intValue, intValue2, i3, 0, color, intValue2, num11.intValue(), z, z2, true, z3, false, false, false, z6);
    }
}
