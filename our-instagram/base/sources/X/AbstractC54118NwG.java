package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.NwG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54118NwG {
    public static final void A00(Context context, C4NL c4nl, InterfaceC55362gb interfaceC55362gb) {
        C4NJ c4nj = (C4NJ) c4nl;
        if (C14360o3.A0K(c4nj.A09.A00, "instagram_app_rating_dialog")) {
            O70 o70 = new O70(context);
            C4NM c4nm = c4nj.A08;
            String str = c4nm.A09.A00;
            if (str == null) {
                str = "";
            }
            String str2 = c4nm.A03.A00;
            if (str2 == null) {
                str2 = "";
            }
            C55529OlN c55529OlN = new C55529OlN(interfaceC55362gb, c4nj);
            DialogInterfaceOnCancelListenerC55247OfL dialogInterfaceOnCancelListenerC55247OfL = new DialogInterfaceOnCancelListenerC55247OfL(6, interfaceC55362gb, c4nj);
            boolean A1W = AbstractC167007dF.A1W(c4nm.A00);
            Dialog dialog = new Dialog(o70.A01, R.style.IgDialogDeprecated);
            o70.A00 = dialog;
            dialog.setContentView(R.layout.new_appirater);
            Dialog dialog2 = o70.A00;
            C14360o3.A0A(dialog2);
            View requireViewById = dialog2.requireViewById(R.id.rating_bar);
            C14360o3.A0C(requireViewById, "null cannot be cast to non-null type android.widget.RatingBar");
            RatingBar ratingBar = (RatingBar) requireViewById;
            Dialog dialog3 = o70.A00;
            C14360o3.A0A(dialog3);
            View requireViewById2 = dialog3.requireViewById(R.id.appirater_title_area);
            C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type android.widget.TextView");
            Dialog dialog4 = o70.A00;
            C14360o3.A0A(dialog4);
            View requireViewById3 = dialog4.requireViewById(R.id.appirater_message_area);
            C14360o3.A0C(requireViewById3, "null cannot be cast to non-null type android.widget.TextView");
            Dialog dialog5 = o70.A00;
            C14360o3.A0A(dialog5);
            View requireViewById4 = dialog5.requireViewById(R.id.appirater_rate_later_button);
            C14360o3.A0C(requireViewById4, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) requireViewById2).setText(str);
            ((TextView) requireViewById3).setText(str2);
            if (A1W) {
                ViewOnClickListenerC55464OkJ.A01(requireViewById4, 0, o70, dialogInterfaceOnCancelListenerC55247OfL);
                Dialog dialog6 = o70.A00;
                C14360o3.A0A(dialog6);
                dialog6.setCancelable(true);
                Dialog dialog7 = o70.A00;
                C14360o3.A0A(dialog7);
                dialog7.setOnCancelListener(dialogInterfaceOnCancelListenerC55247OfL);
            } else {
                Dialog dialog8 = o70.A00;
                C14360o3.A0A(dialog8);
                View requireViewById5 = dialog8.requireViewById(R.id.appirater_rate_later_divider);
                C14360o3.A07(requireViewById5);
                requireViewById4.setVisibility(8);
                requireViewById5.setVisibility(8);
                Dialog dialog9 = o70.A00;
                C14360o3.A0A(dialog9);
                dialog9.setCancelable(false);
                Dialog dialog10 = o70.A00;
                C14360o3.A0A(dialog10);
                dialog10.setOnCancelListener(null);
            }
            ratingBar.setOnRatingBarChangeListener(new C55528OlM(c55529OlN, o70));
            Dialog dialog11 = o70.A00;
            if (dialog11 != null) {
                C0fJ.A00(dialog11);
                interfaceC55362gb.Dcq(c4nj);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
