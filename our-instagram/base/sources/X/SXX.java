package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.fbpay.w3c.CardDetails;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class SXX {
    public static final SXX A00 = new Object();

    public final void A00(Context context, View view, CardDetails cardDetails) {
        int length;
        String str;
        String str2;
        C14360o3.A0B(cardDetails, 2);
        if (context != null) {
            ImageView imageView = (ImageView) AbstractC166997dE.A0R(view, R.id.autofill_incomplete_payment_data_entry_card_icon);
            String str3 = cardDetails.A05;
            imageView.setImageResource(C63156Se5.A01(str3).A00());
            StringBuilder A1C = AbstractC166987dD.A1C();
            String str4 = cardDetails.A0A;
            String str5 = cardDetails.A07;
            if ((str4 == null || str4.length() != 4) && str5 != null && (length = str5.length()) > 4) {
                str4 = AbstractC43592JPx.A0z(str5, length - 4);
            }
            if (str3 != null && str3.length() != 0) {
                str = C63156Se5.A01(str3).A03;
            } else {
                str = "";
            }
            A1C.append(str);
            if (A1C.length() > 0 && str4 != null && str4.length() != 0) {
                A1C.append(" • ");
            }
            String A0x = AbstractC166997dE.A0x(str4, A1C);
            C14360o3.A07(A0x);
            AbstractC167007dF.A0N(view, R.id.autofill_incomplete_payment_data_entry_card_number).setText(A0x);
            TextView A0N = AbstractC167007dF.A0N(view, R.id.autofill_incomplete_payment_data_entry_card_expiry_date);
            Integer num = cardDetails.A03;
            Integer num2 = cardDetails.A04;
            if (num != null && num2 != null) {
                String string = context.getString(R.string.res_0x7f13008c_name_removed);
                Locale locale = AbstractC58319PtB.A08(context).locale;
                C14360o3.A09(locale);
                String A0o = AbstractC58318PtA.A0o(locale, "%02d", AbstractC166997dE.A1b(num, 1));
                Locale locale2 = AbstractC58319PtB.A08(context).locale;
                C14360o3.A09(locale2);
                str2 = AnonymousClass001.A0j(string, A0o, AbstractC58318PtA.A0o(locale2, "%02d", Arrays.copyOf(AbstractC25228BEl.A1Y(num2.intValue() % 100), 1)), ' ', '/');
                C14360o3.A07(str2);
            } else {
                str2 = "";
            }
            if (str2.length() == 0) {
                A0N.setVisibility(8);
            } else {
                A0N.setText(str2);
            }
        }
    }
}
