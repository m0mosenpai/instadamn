package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public abstract class FC4 {
    public static void A00(InterfaceC11380iw interfaceC11380iw, FMV fmv, InterfaceC37287Gbo interfaceC37287Gbo, boolean z) {
        View view = fmv.A00;
        Context context = view.getContext();
        AbstractC166997dE.A18(context, view, 2131962720);
        AbstractC56952jT.A01(view);
        String Bho = interfaceC37287Gbo.Bho();
        CircularImageView circularImageView = fmv.A03;
        if (Bho == null) {
            AbstractC166997dE.A19(context, circularImageView, R.drawable.empty_state_follow_avatar);
        } else {
            AbstractC25235BEs.A1I(interfaceC11380iw, circularImageView, interfaceC37287Gbo.Bho());
        }
        if (z) {
            int A02 = (AbstractC31171DnF.A02(context.getResources(), R.dimen.abc_list_item_height_material) - AbstractC31171DnF.A02(context.getResources(), R.dimen.action_button_settings_height)) / 2;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) circularImageView.getLayoutParams();
            marginLayoutParams.setMargins(A02, 0, 0, 0);
            ((ViewGroup.LayoutParams) marginLayoutParams).width = (int) AbstractC31173DnH.A00(context, R.dimen.action_button_settings_height);
            ((ViewGroup.LayoutParams) marginLayoutParams).height = (int) AbstractC31173DnH.A00(context, R.dimen.action_button_settings_height);
            circularImageView.setLayoutParams(marginLayoutParams);
        }
        circularImageView.setVisibility(0);
        AbstractC166987dD.A1P(context, fmv.A02, 2131963384);
        int Bo4 = interfaceC37287Gbo.Bo4();
        TextView textView = fmv.A01;
        if (Bo4 > 0) {
            F9O.A00(textView, Integer.toString(interfaceC37287Gbo.Bo4()));
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            marginLayoutParams2.setMarginStart(55);
            marginLayoutParams2.setMargins(0, 0, 0, 33);
            textView.setLayoutParams(marginLayoutParams2);
        }
    }
}
