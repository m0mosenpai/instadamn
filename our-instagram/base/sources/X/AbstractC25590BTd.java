package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.BTd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25590BTd {
    public static void A01(Context context, UserSession userSession, C25591BTe c25591BTe, User user) {
        TextView textView;
        String A0f;
        Integer BQb = user.A03.BQb();
        if (user.A0M() == C05F.A0C) {
            ImageView imageView = c25591BTe.A00;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36329620823359936L);
            int i = R.drawable.empty_state_lock;
            if (A06) {
                i = R.drawable.instagram_lock_pano_outline_24;
            }
            AbstractC166997dE.A19(context, imageView, i);
            AbstractC166987dD.A1P(context, c25591BTe.A03, 2131975479);
            textView = c25591BTe.A02;
            A0f = context.getString(2131962734);
        } else {
            if (BQb == null || BQb.intValue() != 0) {
                return;
            }
            AbstractC166997dE.A19(context, c25591BTe.A00, R.drawable.empty_state_camera);
            AbstractC166987dD.A1P(context, c25591BTe.A03, 2131968586);
            textView = c25591BTe.A02;
            A0f = AbstractC167007dF.A0f(context, user.getUsername(), 2131968587);
        }
        textView.setText(A0f);
    }

    public static View A00(Context context, ViewGroup viewGroup, UserSession userSession) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_profile_header_empty_profile_notice, viewGroup, false);
        C25591BTe c25591BTe = new C25591BTe(inflate, userSession);
        ImageView imageView = c25591BTe.A00;
        imageView.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A08(context))));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329620823687620L)) {
            c25591BTe.A01.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius), 0, AbstractC167017dG.A03(context));
        }
        if (C18U.A06(c06090Tz, userSession, 36329620823359936L)) {
            TextView textView = c25591BTe.A03;
            textView.setLetterSpacing(-0.0107f);
            TextView textView2 = c25591BTe.A02;
            textView2.setLetterSpacing(-0.0107f);
            AbstractC166987dD.A1O(context, textView2, AbstractC53242c7.A07(context));
            int A0E = AbstractC167017dG.A0E(context);
            c25591BTe.A01.setPadding(0, A0E, 0, A0E);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            textView.setLayoutParams(marginLayoutParams);
            int A0E2 = AbstractC167017dG.A0E(context);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams2.setMarginEnd(A0E2);
            imageView.setLayoutParams(marginLayoutParams2);
            if (AbstractC25589BTc.A00(userSession)) {
                textView.setTextSize(0, context.getResources().getDimension(R.dimen.account_group_management_row_text_size));
                textView.setLineHeight(AbstractC167017dG.A0B(context));
                textView.setLetterSpacing(-0.02f);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                marginLayoutParams3.bottomMargin = AbstractC167017dG.A04(context);
                marginLayoutParams3.topMargin = context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                textView.setLayoutParams(marginLayoutParams3);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                marginLayoutParams4.bottomMargin = AbstractC166997dE.A04(context, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                textView2.setLayoutParams(marginLayoutParams4);
                int A0D = AbstractC167017dG.A0D(context);
                imageView.setPadding(0, A0D, 0, A0D);
            }
        }
        if (AbstractC25589BTc.A00(userSession)) {
            int A03 = AbstractC167017dG.A03(context);
            c25591BTe.A01.setPadding(0, A03, 0, A03);
        }
        inflate.setTag(c25591BTe);
        return inflate;
    }
}
