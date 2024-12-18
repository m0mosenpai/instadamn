package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import java.util.HashMap;

/* renamed from: X.Vyi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69967Vyi {
    public static final int A00(String str, int i) {
        StringBuilder sb;
        if (str != null && !AbstractC001900j.A0T(str)) {
            String A0d = AbstractC002300n.A0d(str, "#", "", false);
            int length = A0d.length();
            if (length == 6) {
                sb = new StringBuilder();
                sb.append('#');
                sb.append(A0d);
            } else {
                if (length != 8) {
                    return i;
                }
                String A0w = AbstractC25227BEk.A0w(A0d, 0, 2);
                String A0w2 = AbstractC25227BEk.A0w(A0d, 2, 4);
                String A0w3 = AbstractC25227BEk.A0w(A0d, 4, 6);
                String A0w4 = AbstractC25227BEk.A0w(A0d, 6, 8);
                sb = new StringBuilder();
                sb.append('#');
                AbstractC58320PtC.A1N(A0w4, A0w, A0w2, sb);
                sb.append(A0w3);
            }
            return Color.parseColor(sb.toString());
        }
        return i;
    }

    public static final SpannableStringBuilder A01(Context context, XGA xga, EnumC68124VCi enumC68124VCi) {
        Object obj;
        Object obj2;
        Object obj3;
        float f;
        Object obj4;
        VDX vdx;
        Drawable drawable;
        Object obj5;
        Integer num;
        int i;
        int i2;
        boolean A1Y = AbstractC25229BEm.A1Y(xga);
        Object obj6 = VZT.A02.get(enumC68124VCi);
        if (obj6 != null) {
            C69239Vk7 c69239Vk7 = (C69239Vk7) obj6;
            try {
                obj = AbstractC68382VOq.A00(xga).get("text");
            } catch (Exception unused) {
                obj = null;
            }
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((String) obj);
            try {
                obj2 = AbstractC68382VOq.A00(xga).get("text_color");
            } catch (Exception unused2) {
                obj2 = null;
            }
            int A00 = A00((String) obj2, -1);
            try {
                obj3 = AbstractC68382VOq.A00(xga).get("text_font_size");
            } catch (Exception unused3) {
                obj3 = null;
            }
            Number number = (Number) obj3;
            if (number != null) {
                f = number.floatValue();
            } else {
                f = c69239Vk7.A01;
            }
            int applyDimension = (int) TypedValue.applyDimension(2, f, AbstractC167007dF.A0K(context));
            int i3 = 0;
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(applyDimension), A1Y ? 1 : 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), A1Y ? 1 : 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(A00), A1Y ? 1 : 0, spannableStringBuilder.length(), 33);
            HashMap hashMap = VZT.A01;
            Integer num2 = C05F.A01;
            try {
                obj4 = AbstractC68382VOq.A00(xga).get("icon_type");
            } catch (Exception unused4) {
                obj4 = null;
            }
            int A0K = AbstractC167017dG.A0K((Number) obj4);
            VDX[] values = VDX.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    vdx = values[i4];
                    if (vdx.A00 == A0K) {
                        break;
                    }
                    i4++;
                } else {
                    vdx = null;
                    break;
                }
            }
            Number number2 = (Number) hashMap.get(vdx);
            if (number2 != null && (drawable = context.getDrawable(number2.intValue())) != null) {
                AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, drawable, A00);
                int i5 = c69239Vk7.A02;
                int i6 = c69239Vk7.A03;
                int i7 = (int) (c69239Vk7.A00 * applyDimension);
                drawable.setBounds(i5, i6, i7, i7);
                try {
                    obj5 = AbstractC68382VOq.A00(xga).get("icon_location");
                } catch (Exception unused5) {
                    obj5 = null;
                }
                Number number3 = (Number) obj5;
                Integer[] A002 = C05F.A00(2);
                int length2 = A002.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length2) {
                        num = A002[i8];
                        if (1 - num.intValue() != 0) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        if (number3 != null && i2 == number3.intValue()) {
                            break;
                        }
                        i8++;
                    } else {
                        num = null;
                        break;
                    }
                }
                int i9 = 1;
                if (num == num2) {
                    i3 = spannableStringBuilder.length();
                    i = spannableStringBuilder.length() + 1;
                    i9 = spannableStringBuilder.length() + 2;
                } else {
                    i = 0;
                }
                spannableStringBuilder.insert(i3, (CharSequence) "  ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 2), i, i9, 17);
            }
            return spannableStringBuilder;
        }
        throw AbstractC166997dE.A0g();
    }
}
