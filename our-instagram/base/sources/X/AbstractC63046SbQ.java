package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.List;

/* renamed from: X.SbQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63046SbQ {
    public static void A00(Activity activity, Bundle bundle, View view, TextView textView, C5G6 c5g6, SZO szo, int i, int i2, int i3, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C60979Rd7 c60979Rd7 = new C60979Rd7(activity, bundle, c5g6, szo, AbstractC31174DnI.A0q(view.getContext(), R.color.igds_link), z);
        String string = activity.getString(i3);
        String obj = spannableStringBuilder.append((CharSequence) activity.getString(i)).append(' ').append((CharSequence) string).append(' ').toString();
        if (textView == null) {
            textView = (TextView) AbstractC167017dG.A0U(view, i2);
        }
        AnonymousClass773.A07(c60979Rd7, textView, string, obj);
    }

    public static void A01(View view, boolean z) {
        if (z) {
            IgdsBanner igdsBanner = (IgdsBanner) view.requireViewById(R.id.fbpay_disclosure);
            igdsBanner.setBody(Html.fromHtml(view.getResources().getString(2131966643)), false);
            igdsBanner.setVisibility(0);
        }
    }

    public static void A02(C0SG c0sg, IgRadioGroup igRadioGroup, List list, java.util.Set set, boolean z) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                AutofillData autofillData = (AutofillData) list.get(i);
                if (set != null) {
                    autofillData = AbstractC63229Sfh.A00(autofillData, set);
                }
                Context requireContext = c0sg.requireContext();
                autofillData.getClass();
                View A00 = OR0.A00(requireContext, autofillData, z);
                View requireViewById = A00.requireViewById(R.id.extra_btn);
                if (z) {
                    requireViewById.setVisibility(8);
                    AbstractC31180DnO.A06(A00).setTextSize(0, AbstractC166997dE.A0N(c0sg).getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
                } else {
                    C0fQ.A00(new OkD(i, 0, list, c0sg), requireViewById);
                }
                A00.setTag(autofillData);
                igRadioGroup.addView(A00);
            }
            C50813Mcj c50813Mcj = (C50813Mcj) igRadioGroup.getChildAt(0);
            c50813Mcj.setChecked(true);
            if (list.size() == 1) {
                AbstractC31176DnK.A1D(c50813Mcj, R.id.radio_icon);
            }
        }
    }
}
