package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3tY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86603tY {
    public static final C86603tY A00 = new Object();

    public final void A00(C9BS c9bs, C3W4 c3w4, C75113Zb c75113Zb) {
        EnumC92614Cv enumC92614Cv;
        String str;
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        Integer num2;
        C14360o3.A0B(c75113Zb, 2);
        SlideInAndOutIconView A01 = c3w4.A01();
        C4ZF c4zf = c75113Zb.A0s;
        if (c4zf != null) {
            enumC92614Cv = c4zf.A05;
            C14360o3.A0A(enumC92614Cv);
        } else {
            enumC92614Cv = EnumC92614Cv.STOPPED;
        }
        int i = c75113Zb.A0O;
        C5QE c5qe = c75113Zb.A0h;
        if (c5qe != null) {
            Resources resources = c3w4.A01().getResources();
            C14360o3.A07(resources);
            str = c5qe.A01(resources).toString();
        } else {
            str = null;
        }
        if (enumC92614Cv != EnumC92614Cv.STOPPED) {
            A01.setVisibility(0);
            A01.setText(str);
            A01.setIcon(A01.getContext().getDrawable(i));
            A01.setBackgroundAlpha(1.0f);
        }
        if (enumC92614Cv == EnumC92614Cv.FULLTEXT && !TextUtils.isEmpty(str)) {
            A01.A0C.setVisibility(0);
        } else if (enumC92614Cv == EnumC92614Cv.ICON) {
            A01.A0C.setVisibility(8);
        }
        c75113Zb.A0R(c3w4.A01());
        if (c9bs != null && (layoutParams = c3w4.A01().getLayoutParams()) != null) {
            Number number = (Number) c9bs.A00;
            if (number != null) {
                int intValue = number.intValue();
                Context context = c3w4.A01().getContext();
                C14360o3.A07(context);
                num = Integer.valueOf(AbstractC13690mv.A01(context, intValue));
            } else {
                num = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginEnd = marginLayoutParams.getMarginEnd();
                int i2 = 0;
                if (num == null) {
                    num2 = 0;
                } else {
                    num2 = num;
                }
                if (marginEnd != num2.intValue()) {
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    marginLayoutParams.setMarginEnd(i2);
                    c3w4.A01().setLayoutParams(layoutParams);
                }
            }
        }
    }
}
