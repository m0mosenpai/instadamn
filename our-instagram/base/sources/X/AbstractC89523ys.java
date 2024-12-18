package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89523ys {
    public static C89553yv A00(Context context, Drawable drawable, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Integer num7;
        int i9;
        int intValue;
        int i10;
        int color;
        int intValue2;
        float A04;
        int intValue3;
        int i11;
        int i12;
        int intValue4;
        int color2;
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        Integer valueOf3 = Integer.valueOf(i4);
        int intValue5 = valueOf3 == null ? 3 : valueOf3.intValue();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < Math.min(intValue5, list.size()); i13++) {
            if (i13 == (z ? 0 : list.size() - 1) && num4 != null) {
                i12 = num4.intValue();
            } else {
                i12 = i;
            }
            if (valueOf == null) {
                intValue4 = (int) AbstractC13880nE.A04(context, 2);
            } else {
                intValue4 = valueOf.intValue();
            }
            if (valueOf2 != null) {
                color2 = valueOf2.intValue();
            } else {
                color2 = context.getColor(AbstractC53242c7.A0D(context));
            }
            ImageUrl imageUrl = (ImageUrl) list.get(i13);
            arrayList.add(z2 ? new C89533yt(imageUrl, str, i12, z3 ? 1 : 0, AbstractC53242c7.A0F(context, R.attr.avatarInnerStroke), intValue4, color2, 0, z4) : new C89533yt(imageUrl, str, i12, intValue4, 0, 0));
        }
        if (i5 > 0) {
            if (z6) {
                String valueOf4 = String.valueOf(i5);
                if (valueOf4 != null) {
                    i11 = valueOf4.length();
                } else {
                    i11 = 0;
                }
                num7 = Integer.valueOf(i + (i11 * 13));
            } else {
                num7 = null;
            }
            int i14 = i3;
            if (i7 != 0) {
                i14 = i7;
            }
            ColorStateList valueOf5 = ColorStateList.valueOf(i14);
            if (valueOf == null) {
                intValue2 = (int) AbstractC13880nE.A04(context, 2);
            } else {
                intValue2 = valueOf.intValue();
            }
            float f2 = i - intValue2;
            if (num5 != null) {
                A04 = AbstractC13880nE.A04(context, num5.intValue());
            } else {
                A04 = AbstractC13880nE.A04(context, 15);
            }
            if (valueOf == null) {
                intValue3 = (int) AbstractC13880nE.A04(context, 2);
            } else {
                intValue3 = valueOf.intValue();
            }
            arrayList.add(new C44357Jiw(context, valueOf5, z5 ? null : "+", f2, A04, i5, i6, intValue3, z7));
        } else {
            num7 = null;
        }
        if (drawable != null) {
            if (z8) {
                if (num2 != null) {
                    i3 = num2.intValue();
                }
                ColorStateList valueOf6 = ColorStateList.valueOf(i3);
                if (num3 != null) {
                    if (valueOf == null) {
                        i9 = (int) AbstractC13880nE.A04(context, 2);
                    } else {
                        i9 = valueOf.intValue();
                    }
                } else {
                    i9 = 0;
                }
                if (valueOf == null) {
                    intValue = (int) AbstractC13880nE.A04(context, 2);
                } else {
                    intValue = valueOf.intValue();
                }
                float f3 = (i - intValue) / 2.0f;
                if (num3 != null) {
                    if (valueOf == null) {
                        i10 = (int) AbstractC13880nE.A04(context, 2);
                    } else {
                        i10 = valueOf.intValue();
                    }
                } else {
                    i10 = 0;
                }
                if (num6 != null) {
                    color = num6.intValue();
                } else {
                    color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background));
                }
                U8K u8k = new U8K(valueOf6, drawable, f3, i9, i8, i10, color);
                if (num3 != null) {
                    arrayList.add(num3.intValue(), u8k);
                } else {
                    arrayList.add(u8k);
                }
            } else if (num3 != null) {
                arrayList.add(num3.intValue(), drawable);
            } else {
                arrayList.add(drawable);
            }
        }
        if (num4 == null) {
            return new C89553yv(context, num7, num, arrayList, f, i, i, z ? 0 : arrayList.size() - 1);
        }
        return new C89553yv(context, num7, num, arrayList, f, num4.intValue(), i, z ? 0 : list.size() - 1);
    }
}
