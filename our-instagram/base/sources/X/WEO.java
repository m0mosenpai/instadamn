package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;

/* loaded from: classes11.dex */
public final class WEO {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final boolean A02;

    public WEO(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C1XM.A00(new C50159MDm(this, 38));
        this.A02 = C18U.A06(C06090Tz.A06, userSession, 36315636409896399L);
    }

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, WEO weo, MediaMapPin mediaMapPin) {
        Integer num;
        int intValue;
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        if (locationPageInformation != null && (num = locationPageInformation.A03) != null && (intValue = num.intValue()) > 0) {
            UserSession userSession = weo.A00;
            A00(spannableStringBuilder, WFD.A00(context, userSession, intValue), " • ");
            StringBuilder sb = new StringBuilder();
            String symbol = WFD.A03(userSession).getSymbol();
            int i = 0;
            do {
                sb.append(symbol);
                i++;
            } while (i < intValue);
            A00(spannableStringBuilder2, sb.toString(), " • ");
        }
    }

    public static final SpannableStringBuilder A00(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str) {
        if (spannableStringBuilder.length() > 0 && charSequence != null) {
            spannableStringBuilder = spannableStringBuilder.append((CharSequence) str).append(charSequence);
        } else if (charSequence != null) {
            spannableStringBuilder = spannableStringBuilder.append(charSequence);
        }
        C14360o3.A09(spannableStringBuilder);
        return spannableStringBuilder;
    }

    public static final void A02(TextView textView, C69443VnS c69443VnS, WEO weo, CharSequence charSequence, CharSequence charSequence2) {
        View findViewById;
        if (charSequence.length() > 0) {
            textView.setMaxLines(2);
            textView.setText(charSequence);
            textView.setContentDescription(charSequence2);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        if (!weo.A02 || (findViewById = c69443VnS.A09.getRootView().findViewById(R.id.location_information_wrapper)) == null) {
            return;
        }
        findViewById.post(new Wv6(findViewById, c69443VnS));
    }
}
