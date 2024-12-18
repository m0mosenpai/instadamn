package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class ALj {
    public static final ALj A00 = new Object();

    public static final C194808jg A00(Context context, UserSession userSession, C217839kG c217839kG) {
        C14360o3.A0B(c217839kG, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = c217839kG.A00;
        if (c217839kG.A01) {
            A01(context, A1E, 0, 0, i);
            A01(context, A1E, 0, 1, i);
        }
        if (c217839kG.A02) {
            A01(context, A1E, 1, 0, i);
            A01(context, A1E, 1, 1, i);
        }
        C194808jg c194808jg = new C194808jg(context, userSession, A1E);
        c194808jg.A03 = c217839kG;
        return c194808jg;
    }

    public static final void A01(Context context, List list, int i, int i2, int i3) {
        Drawable mutate;
        int[] iArr;
        int A0F = AbstractC167017dG.A0F(context);
        float A0E = AbstractC166997dE.A0E(context.getResources());
        boolean z = true;
        if (i2 != 0) {
            z = false;
        }
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.append((CharSequence) resources.getString(2131964615));
        int i4 = R.drawable.ig_logo;
        if (i != 0) {
            i4 = R.drawable.company_brand_meta_symbol_primary_24;
        }
        if (z) {
            if (i != 0) {
                iArr = C6QG.A0B;
            } else {
                iArr = C6QG.A0H;
            }
            AMr.A0A(resources, spannableStringBuilder, iArr, A0F);
            if (i == 0) {
                int[] iArr2 = C6QG.A0H;
                int i5 = iArr2[0];
                int i6 = iArr2[1];
                Paint paint = C3LQ.A00;
                Drawable drawable = context.getDrawable(i4);
                if (drawable != null) {
                    mutate = C3LQ.A02(context, drawable, i5, i6);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                mutate = context.getDrawable(i4);
                if (mutate == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        } else {
            AMr.A04(context, spannableStringBuilder, A0F);
            if (i == 0) {
                Paint paint2 = C3LQ.A00;
                mutate = C3LQ.A05(context, i4, context.getColor(R.color.design_dark_default_color_on_background));
            } else {
                Drawable drawable2 = context.getDrawable(i4);
                if (drawable2 != null) {
                    mutate = drawable2.mutate();
                    AbstractC166997dE.A1F(mutate, -1);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
        C4GL.A01(resources, mutate, R.dimen.abc_dropdownitem_icon_width);
        C4GL.A03(mutate, spannableStringBuilder, C05F.A00, 0, 0, 0);
        C6RB c6rb = new C6RB(context, i3);
        float f = A0F;
        AMr.A08(context, c6rb, A0E, f, f);
        c6rb.A0L(spannableStringBuilder);
        list.add(c6rb);
    }
}
