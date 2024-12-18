package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* loaded from: classes7.dex */
public abstract class IQN {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.feed_fundraiser_banner_cta, false);
        A0D.setTag(new C38496GwH(A0D, AbstractC166997dE.A0R(A0D, R.id.fundraiser_banner_container), AbstractC25231BEo.A0d(A0D, R.id.fundraiser_title), AbstractC25231BEo.A0d(A0D, R.id.fundraiser_progress_text)));
        return A0D;
    }

    public static final void A01(FragmentActivity fragmentActivity, C62862tP c62862tP, C41127IIs c41127IIs, JFT jft, C38496GwH c38496GwH) {
        CharSequence spannedString;
        String str;
        Hd1 hd1;
        int i;
        String[] strArr;
        String str2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AbstractC167017dG.A1R(jft, c41127IIs);
        if (c38496GwH != null) {
            if (jft instanceof C42465Ir6) {
                c38496GwH.A01.setVisibility(8);
                return;
            }
            if (jft instanceof H7L) {
                View view = c38496GwH.A01;
                view.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                H7L h7l = (H7L) jft;
                C14360o3.A0A(layoutParams);
                int i2 = 0;
                c38496GwH.A06.setVisibility(0);
                Resources resources = view.getResources();
                if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMargins(resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material));
                }
                IgTextView igTextView = c38496GwH.A04;
                Resources A0M = AbstractC25228BEl.A0M(view);
                C14360o3.A07(A0M);
                FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = h7l.A00;
                if (fundraiserCampaignTypeEnum != null) {
                    int ordinal = fundraiserCampaignTypeEnum.ordinal();
                    if (ordinal != 11) {
                        if (ordinal == 9) {
                            i = 2131962459;
                            strArr = new String[1];
                            str2 = h7l.A02;
                        }
                    } else {
                        i = 2131962476;
                        if (AbstractC166997dE.A1Z(h7l.A01, true)) {
                            i = 2131962525;
                        }
                        strArr = new String[1];
                        str2 = h7l.A05;
                    }
                    strArr[0] = str2;
                    spannedString = AbstractC07900bA.A01(A0M, strArr, i);
                    C14360o3.A0A(spannedString);
                    igTextView.setText(spannedString);
                    IgTextView igTextView2 = c38496GwH.A02;
                    str = h7l.A04;
                    igTextView2.setText(str);
                    igTextView2.setTextSize(0, resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
                    igTextView2.setPadding(0, 0, 0, 0);
                    c38496GwH.A03.setVisibility(8);
                    c38496GwH.A00.setVisibility(0);
                    c38496GwH.A05.setVisibility(0);
                    if (str != null || str.length() == 0) {
                        i2 = 8;
                    }
                    igTextView2.setVisibility(i2);
                    if (c62862tP == null && fragmentActivity != null) {
                        InterfaceC11380iw interfaceC11380iw = c62862tP.A04;
                        C14360o3.A07(interfaceC11380iw);
                        String str3 = h7l.A06;
                        if (str3 != null) {
                            UserSession userSession = c41127IIs.A03;
                            String str4 = h7l.A03;
                            AbstractC37303Gc4.A0p(AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, str4, 1), "ig_cg_feed_show_fundraser_metatext"), str4, str3);
                        }
                        ViewOnClickListenerC42029Ijy.A00(view, c41127IIs, c62862tP, jft, 12);
                        if (fundraiserCampaignTypeEnum == FundraiserCampaignTypeEnum.A0C) {
                            hd1 = Hd1.A02;
                        } else {
                            hd1 = Hd1.A03;
                        }
                        InterfaceC16600sD interfaceC16600sD = c41127IIs.A02;
                        if (interfaceC16600sD == null) {
                            return;
                        }
                        interfaceC16600sD.invoke(h7l.A03, str3, h7l.A08, hd1);
                        return;
                    }
                    view.setOnClickListener(null);
                    return;
                }
                spannedString = new SpannedString("");
                igTextView.setText(spannedString);
                IgTextView igTextView22 = c38496GwH.A02;
                str = h7l.A04;
                igTextView22.setText(str);
                igTextView22.setTextSize(0, resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
                igTextView22.setPadding(0, 0, 0, 0);
                c38496GwH.A03.setVisibility(8);
                c38496GwH.A00.setVisibility(0);
                c38496GwH.A05.setVisibility(0);
                if (str != null) {
                }
                i2 = 8;
                igTextView22.setVisibility(i2);
                if (c62862tP == null) {
                }
                view.setOnClickListener(null);
                return;
            }
            throw B4Z.A00();
        }
    }
}
