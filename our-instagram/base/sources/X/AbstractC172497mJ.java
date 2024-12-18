package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.facebook.R;
import java.util.regex.Pattern;

/* renamed from: X.7mJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC172497mJ {
    public static final LayerDrawable A00(Context context) {
        C14360o3.A0B(context, 0);
        ShapeDrawable A05 = A05(-1);
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_green);
        Paint paint = C3LQ.A00;
        return new LayerDrawable(new Drawable[]{A05, C3LQ.A05(context, R.drawable.close_friends_star, context.getColor(A0H))});
    }

    public static final LayerDrawable A01(Context context) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A05(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_background))), A02(context, R.drawable.close_friends_star_60)});
        int A01 = C1H4.A01(AbstractC13880nE.A04(context, 3));
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, A01, A01, A01, A01);
        return layerDrawable;
    }

    public static final LayerDrawable A02(Context context, int i) {
        C14360o3.A0B(context, 0);
        ShapeDrawable A05 = A05(-1);
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_green);
        Paint paint = C3LQ.A00;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A05, C3LQ.A05(context, i, context.getColor(A0H))});
        int A01 = C1H4.A01(AbstractC13880nE.A04(context, 1));
        layerDrawable.setLayerInset(0, A01, A01, A01, A01);
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        return layerDrawable;
    }

    public static final LayerDrawable A03(Context context, int i, int i2) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A05(AbstractC53242c7.A0F(context, R.attr.igds_color_primary_background)), A02(context, i)});
        int A01 = C1H4.A01(AbstractC13880nE.A04(context, i2));
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, A01, A01, A01, A01);
        return layerDrawable;
    }

    public static final LayerDrawable A04(Context context, Drawable drawable) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, context.getDrawable(R.drawable.story_shortcut_ring)});
        int A01 = C1H4.A01(AbstractC13880nE.A04(context, 3));
        layerDrawable.setLayerInset(0, A01, A01, A01, A01);
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        return layerDrawable;
    }

    public static final SpannableString A06(Context context, String str) {
        int i;
        String[] strArr = {context.getString(2131956252)};
        SpannableString spannableString = new SpannableString(str);
        String str2 = strArr[0];
        C14360o3.A0A(str2);
        if (AbstractC001900j.A0a(str, str2, false)) {
            StyleSpan styleSpan = new StyleSpan(1);
            int A08 = AbstractC001900j.A08(str, str2, 0, false);
            int A082 = AbstractC001900j.A08(str, str2, 0, false);
            Pattern pattern = AbstractC13670mt.A00;
            if (str2 != null) {
                i = str2.length();
            } else {
                i = 0;
            }
            spannableString.setSpan(styleSpan, A08, A082 + i, 18);
        }
        return spannableString;
    }

    public static final SpannableString A07(Context context, String str, boolean z) {
        C14360o3.A0B(context, 1);
        boolean A02 = AbstractC13620mo.A02(context);
        if (!z ? A02 : !A02) {
            SpannableString A06 = A06(context, AnonymousClass001.A0C(str, ' '));
            LayerDrawable A03 = A03(context, R.drawable.close_friends_star_small, 0);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            A03.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            C85973sR c85973sR = new C85973sR(A03);
            c85973sR.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
            A06.setSpan(c85973sR, A06.length() - 1, A06.length(), 18);
            return A06;
        }
        SpannableString A062 = A06(context, AnonymousClass001.A0D(str, ' '));
        LayerDrawable A032 = A03(context, R.drawable.close_friends_star_small, 0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        A032.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
        C85973sR c85973sR2 = new C85973sR(A032);
        c85973sR2.A01 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        A062.setSpan(c85973sR2, 0, 1, 18);
        return A062;
    }

    public static final ShapeDrawable A05(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return shapeDrawable;
    }
}
