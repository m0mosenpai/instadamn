package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;

/* renamed from: X.VWj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68582VWj {
    public static void A00(Context context, C189478aR c189478aR, L5A l5a, UJ6 uj6, MixedAttributionModel mixedAttributionModel) {
        Drawable drawable = mixedAttributionModel.A00;
        if (drawable != null) {
            String str = mixedAttributionModel.A04;
            C14360o3.A0B(context, 0);
            Resources resources = context.getResources();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, drawable, context.getColor(AbstractC53242c7.A07(context)));
            drawable.setBounds(0, 0, resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material), resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
            C4GL.A03(drawable, spannableStringBuilder, C05F.A00, 0, 0, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
            spannableStringBuilder.append((CharSequence) str);
            String A06 = AbstractC13670mt.A06(context.getResources().getString(2131953236), mixedAttributionModel.A05);
            uj6.A01.setText(spannableStringBuilder);
            uj6.A00.setText(A06);
            C0fQ.A00(new ViewOnClickListenerC48068LPt(37, mixedAttributionModel, c189478aR, l5a), uj6.itemView);
            uj6.A02.A00.setImportantForAccessibility(2);
            AbstractC56952jT.A01(uj6.itemView);
            return;
        }
        C14360o3.A0F("attributionTextDrawable");
        throw C00O.createAndThrow();
    }
}
