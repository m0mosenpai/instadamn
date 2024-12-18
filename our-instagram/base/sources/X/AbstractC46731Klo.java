package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Klo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46731Klo {
    public static final void A00(View view, AbstractC46509Ki8 abstractC46509Ki8, MQZ mqz) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C14360o3.A0B(view, 0);
        int[] iArr = AbstractC47154Ksp.A00;
        int i = 0;
        do {
            AbstractC13880nE.A0P(view.findViewById(iArr[i]));
            i++;
        } while (i < 4);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.megaphone_content);
        TextView A0C2 = AbstractC31178DnM.A0C(view);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.message);
        ViewGroup A0C3 = AbstractC31176DnK.A0C(view, R.id.button_placeholder);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.dismiss_button);
        ImageView A0D2 = AbstractC31176DnK.A0D(view, R.id.megaphone_icon);
        View A0S = AbstractC166997dE.A0S(view, R.id.megaphone_inner);
        A0C2.setText((CharSequence) mqz.BUI().A01);
        A0N.setText((CharSequence) mqz.BUI().A04);
        A0D2.setImageResource(mqz.BUI().A03);
        ViewGroup.LayoutParams layoutParams = A0D2.getLayoutParams();
        Resources resources = view.getResources();
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
        AbstractC31172DnG.A1F(resources, layoutParams, R.dimen.action_button_settings_height);
        A0D2.setLayoutParams(layoutParams);
        ColorStateList A02 = JQ1.A02(view);
        C14360o3.A07(A02);
        A0D.setImageTintList(A02);
        A0D.setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = A0S.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin));
        }
        ViewOnClickListenerC48066LPr.A00(A0D, 43, abstractC46509Ki8, mqz);
        VVS.A00(A0C, A0C3, null, null, VE7.A06);
        TextView A0N2 = AbstractC167007dF.A0N(A0C, R.id.primary_button);
        A0N2.setText((CharSequence) mqz.BUI().A00);
        ViewOnClickListenerC48066LPr.A00(A0N2, 44, abstractC46509Ki8, mqz);
        A0C3.setVisibility(0);
    }
}
