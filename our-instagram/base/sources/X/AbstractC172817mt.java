package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC172817mt {
    public static final List A01(UserSession userSession, C81W c81w) {
        ArrayList A1N;
        ArrayList arrayList;
        int i;
        EnumC172837mv[] enumC172837mvArr;
        switch (c81w.ordinal()) {
            case 5:
            case 31:
                ArrayList arrayList2 = new ArrayList();
                EnumC172837mv[] enumC172837mvArr2 = AbstractC172827mu.A00;
                ArrayList arrayList3 = new ArrayList();
                if (c81w == C81W.A0U) {
                    enumC172837mvArr = AbstractC172827mu.A00;
                } else {
                    enumC172837mvArr = AbstractC172827mu.A03;
                }
                AnonymousClass016.A18(arrayList3, enumC172837mvArr);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    EnumC172837mv enumC172837mv = (EnumC172837mv) it.next();
                    arrayList2.add(new C172867my(enumC172837mv, enumC172837mv.A02, enumC172837mv.A01));
                }
                return arrayList2;
            case 8:
                if (C18U.A06(C06090Tz.A05, userSession, 36320846205297596L)) {
                    A1N = AnonymousClass827.A01(userSession);
                } else {
                    A1N = AbstractC16960so.A1N(AnonymousClass826.A05, AnonymousClass826.A07, AnonymousClass826.A09, AnonymousClass826.A0A);
                }
                arrayList = new ArrayList(AbstractC06950Ym.A1E(A1N, 10));
                Iterator it2 = A1N.iterator();
                while (it2.hasNext()) {
                    AnonymousClass826 anonymousClass826 = (AnonymousClass826) it2.next();
                    arrayList.add(new C172867my(Integer.valueOf(anonymousClass826.A01), anonymousClass826.A02, anonymousClass826.A00));
                }
                break;
            case 10:
                List<EnumC1828489f> A01 = AbstractC171697kz.A01();
                arrayList = new ArrayList(AbstractC06950Ym.A1E(A01, 10));
                for (EnumC1828489f enumC1828489f : A01) {
                    Float valueOf = Float.valueOf(enumC1828489f.A00);
                    Integer num = enumC1828489f.A02;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = R.drawable.instagram_speed_1_outline_44;
                    }
                    arrayList.add(new C172867my(valueOf, i, enumC1828489f.A01));
                }
                break;
            case 32:
                return AbstractC16960so.A1Q(new C172867my("SCALE_MODE_FIT", R.drawable.instagram_fill_outline_44, 0), new C172867my("SCALE_MODE_FILL", R.drawable.instagram_fit_outline_44, 0));
            case 33:
            case 34:
                ArrayList arrayList4 = new ArrayList();
                AbstractC172157lk[] abstractC172157lkArr = AbstractC171717l1.A01;
                arrayList4.add(new C172867my(abstractC172157lkArr[0], R.drawable.instagram_layout_remix3_outline_44, 2131954667));
                arrayList4.add(new C172867my(abstractC172157lkArr[1], R.drawable.instagram_layout_remix2_outline_44, 2131954668));
                arrayList4.add(new C172867my(abstractC172157lkArr[2], R.drawable.instagram_layout_remix1_outline_44, 2131954666));
                arrayList4.add(new C172867my(abstractC172157lkArr[3], R.drawable.instagram_green_screen_outline_44, 2131954665));
                return arrayList4;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown camera tool: ");
                sb.append(c81w);
                AbstractC12120kG.A00("SecondaryPickerOptionsHelper", sb.toString());
                return C16930sl.A00;
        }
        return AbstractC001800i.A0a(arrayList);
    }

    public static final Drawable A00(Context context, int i, int i2, boolean z) {
        Drawable bitmapDrawable;
        float f;
        float f2;
        if (!z) {
            bitmapDrawable = context.getDrawable(i);
        } else {
            Resources resources = context.getResources();
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
            C14360o3.A07(decodeResource);
            bitmapDrawable = new BitmapDrawable(resources, C50L.A00(context, decodeResource));
        }
        float f3 = i2;
        if (bitmapDrawable != null) {
            f = bitmapDrawable.getIntrinsicWidth();
        } else {
            f = 0.0f;
        }
        float f4 = (f3 - f) / 2.0f;
        if (bitmapDrawable != null) {
            f2 = bitmapDrawable.getIntrinsicHeight();
        } else {
            f2 = 0.0f;
        }
        float f5 = (f3 - f2) / 2.0f;
        float f6 = 0.0f;
        if (0.0f < f4) {
            f6 = f4;
        }
        float f7 = 0.0f;
        if (0.0f < f5) {
            f7 = f5;
        }
        if (bitmapDrawable != null) {
            int i3 = (int) f6;
            int i4 = (int) f7;
            bitmapDrawable.setBounds(i3, i4, Math.min(bitmapDrawable.getIntrinsicWidth(), i2) + i3, Math.min(bitmapDrawable.getIntrinsicHeight(), i2) + i4);
        }
        return bitmapDrawable;
    }
}
