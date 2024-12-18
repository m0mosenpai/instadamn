package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteAdsManagerActionType;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes11.dex */
public final class WEF {
    public static final WEF A00 = new Object();

    public static final void A01(Context context, InterfaceC71976XDj interfaceC71976XDj, C69460Vnj c69460Vnj, InterfaceC72003XEr interfaceC72003XEr, InterfaceC11380iw interfaceC11380iw) {
        int i;
        int i2;
        RoundedCornerImageView roundedCornerImageView;
        RoundedCornerImageView roundedCornerImageView2;
        String formatStrLocaleSafe;
        String str;
        C69508Vpg c69508Vpg = PromoteAdsManagerActionType.A00;
        int ordinal = c69508Vpg.A00(interfaceC72003XEr).ordinal();
        TextView textView = c69460Vnj.A0A;
        switch (ordinal) {
            case 0:
                i = 2131970878;
                textView.setText(i);
                break;
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
            default:
                textView.setText(((C70654Wea) interfaceC72003XEr).A0I);
                break;
            case 3:
                i = 2131970348;
                textView.setText(i);
                break;
            case 5:
                i = 2131970343;
                textView.setText(i);
                break;
            case 8:
                i = 2131970350;
                textView.setText(i);
                break;
            case 9:
                i = 2131970347;
                textView.setText(i);
                break;
            case 10:
                i = 2131970349;
                textView.setText(i);
                break;
            case 11:
                i = 2131970351;
                textView.setText(i);
                break;
        }
        PromoteAdsManagerActionType A002 = c69508Vpg.A00(interfaceC72003XEr);
        int ordinal2 = A002.ordinal();
        TextView textView2 = c69460Vnj.A03;
        switch (ordinal2) {
            case 1:
                i2 = 2131970292;
                break;
            case 2:
            case 3:
            case 8:
            default:
                i2 = 2131970293;
                break;
            case 4:
                i2 = 2131970294;
                break;
            case 5:
                i2 = 2131970724;
                break;
            case 6:
                i2 = 2131970290;
                break;
            case 7:
                i2 = 2131970295;
                break;
            case 9:
                i2 = 2131970296;
                break;
            case 10:
                i2 = 2131962624;
                break;
        }
        textView2.setText(i2);
        WNX.A00(textView2, A002, interfaceC72003XEr, interfaceC71976XDj, 12);
        if (interfaceC72003XEr.BIP() == InstagramMediaProductType.A0K) {
            roundedCornerImageView = c69460Vnj.A0C;
            roundedCornerImageView.setVisibility(0);
            roundedCornerImageView2 = c69460Vnj.A0D;
        } else {
            roundedCornerImageView = c69460Vnj.A0D;
            roundedCornerImageView.setVisibility(0);
            roundedCornerImageView2 = c69460Vnj.A0C;
        }
        roundedCornerImageView2.setVisibility(8);
        roundedCornerImageView.setUrl(interfaceC72003XEr.C89(), interfaceC11380iw);
        roundedCornerImageView.setOnTouchListener(WO1.A00);
        WNV.A00(roundedCornerImageView, 50, interfaceC71976XDj, interfaceC72003XEr);
        TextView textView3 = c69460Vnj.A08;
        String str2 = interfaceC72003XEr.BTb().A01;
        if (str2 != null) {
            textView3.setText(str2);
            Integer num = interfaceC72003XEr.BTb().A00;
            TextView textView4 = c69460Vnj.A09;
            if (num == null) {
                formatStrLocaleSafe = "--";
            } else {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s", interfaceC72003XEr.BTb().A00);
            }
            textView4.setText(formatStrLocaleSafe);
            c69460Vnj.A06.setText(2131970345);
            String B8I = interfaceC72003XEr.B8I();
            String B8A = interfaceC72003XEr.B8A();
            if (B8I != null && B8A != null) {
                str = AbstractC31174DnI.A0t(context, B8I, B8A, 2131970346);
            } else {
                str = "";
            }
            C14360o3.A0A(str);
            c69460Vnj.A07.setText(str);
            c69460Vnj.A04.setText(2131970344);
            c69460Vnj.A05.setText(interfaceC72003XEr.AdV());
            c69460Vnj.A02.setVisibility(0);
            c69460Vnj.A00.setVisibility(0);
            return;
        }
        C14360o3.A0F("metricName");
        throw C00O.createAndThrow();
    }

    public static final C69460Vnj A00(View view, View view2) {
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0S(view, R.id.promotion_thumbnail);
        View A0S = AbstractC166997dE.A0S(view, R.id.thumbnail_circular_text_container_view);
        TextView A0H = AbstractC65702TsY.A0H(view, R.id.thumbnail_circular_text_view);
        RoundedCornerImageView roundedCornerImageView2 = (RoundedCornerImageView) AbstractC166997dE.A0S(view, R.id.story_promotion_thumbnail);
        return new C69460Vnj(view, view2, A0S, AbstractC65702TsY.A0H(view2, R.id.boost_status), AbstractC65702TsY.A0H(view2, R.id.boost_action_button), A0H, AbstractC65702TsY.A0H(view, R.id.promotion_metric_label), AbstractC65702TsY.A0H(view, R.id.promotion_metric_value), AbstractC65702TsY.A0H(view, R.id.promotion_budget_label), AbstractC65702TsY.A0H(view, R.id.promotion_budget_value), AbstractC65702TsY.A0H(view, R.id.promotion_audience_label), AbstractC65702TsY.A0H(view, R.id.promotion_audience_value), roundedCornerImageView, roundedCornerImageView2);
    }
}
