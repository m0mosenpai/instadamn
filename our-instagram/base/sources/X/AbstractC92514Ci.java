package X;

import android.animation.ArgbEvaluator;
import android.content.Context;
import com.facebook.R;

/* renamed from: X.4Ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92514Ci {
    public static final ArgbEvaluator A00 = new ArgbEvaluator();

    public static final int A00(C38321qM c38321qM, Integer num, int i) {
        String str;
        if (c38321qM != null && (!c38321qM.A5M() || num == null || (c38321qM = c38321qM.A1e(num.intValue())) != null)) {
            str = c38321qM.A0C.getDominantColor();
        } else {
            str = null;
        }
        Integer A0D = AbstractC13950nL.A0D(str);
        if (A0D != null) {
            return A0D.intValue();
        }
        return i;
    }

    public static final void A02(C92524Cj c92524Cj, C38321qM c38321qM, InterfaceC16660sJ interfaceC16660sJ, float f, int i, int i2) {
        int i3 = c92524Cj.A00;
        Object evaluate = A00.evaluate(f, Integer.valueOf(A00(c38321qM, Integer.valueOf(i), i3)), Integer.valueOf(A00(c38321qM, Integer.valueOf(i2), i3)));
        C14360o3.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
        interfaceC16660sJ.invoke(evaluate);
    }

    public static final C92524Cj A01(Context context) {
        return new C92524Cj(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon)), context.getColor(R.color.badge_color), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_color)), AbstractC53242c7.A0F(context, R.attr.ctaMetadataTextNormal), context.getColor(R.color.grey_1), AbstractC53242c7.A0F(context, R.attr.ctaPressedColorNormal), context.getColor(R.color.track_background_color), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_separator)));
    }
}
