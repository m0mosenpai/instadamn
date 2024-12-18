package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes10.dex */
public abstract class SSD {
    public static void A00(TextView textView, C59064QVw c59064QVw, String str, int i) {
        int coercedIntField;
        int i2;
        int coercedIntField2;
        int i3 = 0;
        if (c59064QVw != null && !TextUtils.isEmpty(c59064QVw.getOptionalStringField(0, "text"))) {
            SpannableString spannableString = new SpannableString(c59064QVw.getOptionalStringField(0, "text"));
            Context context = textView.getContext();
            C1LC A0a = AbstractC58319PtB.A0a(c59064QVw, C59062QVu.class, "color_ranges", 2, 806081955);
            while (A0a.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(A0a);
                EnumC72379XcF enumC72379XcF = EnumC72379XcF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (A0l.getOptionalEnumField(2, "usage_color_enum", enumC72379XcF) != null) {
                    int ordinal = ((EnumC72379XcF) A0l.getOptionalEnumField(2, "usage_color_enum", enumC72379XcF)).ordinal();
                    if (ordinal != 7) {
                        i2 = R.attr.fbpay_primary_text_color;
                        if (ordinal != 9) {
                            i2 = R.attr.fbpay_secondary_text_color;
                        }
                    } else {
                        i2 = R.attr.fbpay_positive_color;
                    }
                    int A01 = W6b.A01(context, i2);
                    if (A0l.getCoercedIntField(1, "offset") + A0l.getCoercedIntField(0, "length") > spannableString.length()) {
                        coercedIntField2 = spannableString.length();
                    } else {
                        coercedIntField2 = A0l.getCoercedIntField(1, "offset") + A0l.getCoercedIntField(0, "length");
                    }
                    spannableString.setSpan(new ForegroundColorSpan(A01), A0l.getCoercedIntField(1, "offset"), coercedIntField2, 17);
                }
            }
            C1LC A0a2 = AbstractC58319PtB.A0a(c59064QVw, C59063QVv.class, "inline_style_ranges", 1, 101890325);
            while (A0a2.hasNext()) {
                C2JS A0l2 = AbstractC25225BEi.A0l(A0a2);
                EnumC72399Xcm enumC72399Xcm = EnumC72399Xcm.A02;
                if (A0l2.getOptionalEnumField(2, "inline_style", enumC72399Xcm) != null) {
                    A0l2.getOptionalEnumField(2, "inline_style", enumC72399Xcm);
                    if (A0l2.getCoercedIntField(1, "offset") + A0l2.getCoercedIntField(0, "length") > spannableString.length()) {
                        coercedIntField = spannableString.length();
                    } else {
                        coercedIntField = A0l2.getCoercedIntField(1, "offset") + A0l2.getCoercedIntField(0, "length");
                    }
                    spannableString.setSpan(new StrikethroughSpan(), A0l2.getCoercedIntField(1, "offset"), coercedIntField, 17);
                }
            }
            textView.setText(spannableString);
        } else if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else if (i != 0) {
            textView.setText(i);
            textView.setVisibility(0);
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    public static void A01(TextView textView, String str, int i) {
        int i2 = 0;
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else if (i != 0) {
            textView.setText(i);
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }
}
