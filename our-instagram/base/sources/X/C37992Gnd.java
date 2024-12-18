package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gnd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37992Gnd {
    public final void A00(Context context, InterfaceC38371qR interfaceC38371qR, C37991Gnc c37991Gnc, int i) {
        int color;
        C14360o3.A0B(interfaceC38371qR, 3);
        Integer A04 = AbstractC75103Za.A04(interfaceC38371qR, i);
        if (A04 != null) {
            color = A04.intValue();
        } else {
            color = context.getColor(R.color.default_cta_dominant_color);
        }
        int color2 = context.getColor(AbstractC53242c7.A0A(context));
        c37991Gnc.A02.setBackgroundColor(color);
        c37991Gnc.A05.setTextColor(color2);
        c37991Gnc.A07.setTextColor(color2);
        c37991Gnc.A04.setColorFilter(color2);
        TextView textView = c37991Gnc.A06;
        textView.setTextColor(color2);
        c37991Gnc.A09.setBackgroundColor(color);
        int A042 = (int) AbstractC13880nE.A04(context, 12);
        int A043 = (int) AbstractC13880nE.A04(context, 7);
        textView.setPadding(A042, A043, A042, A043);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(R.dimen.afi_segmented_pill_border_width), color2);
        gradientDrawable.setColor(ColorStateList.valueOf(color));
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
        textView.setBackground(gradientDrawable);
    }
}
