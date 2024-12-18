package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gp4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38075Gp4 {
    public static final void A01(C41059IGc c41059IGc, String str, String str2, String str3, boolean z, boolean z2) {
        Drawable drawable;
        C14360o3.A0B(c41059IGc, 0);
        C14360o3.A0B(str, 1);
        boolean z3 = false;
        if (str.length() == 0) {
            z3 = true;
        }
        if (z3) {
            TextView textView = c41059IGc.A00;
            textView.setText("");
            textView.setCompoundDrawables(null, null, null, null);
            return;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) str);
        C14360o3.A0A(append);
        if (str2 != null) {
            append.append((CharSequence) " ").append((CharSequence) "•").append((CharSequence) " ").append((CharSequence) str2);
        }
        if (str3 != null) {
            append.append((CharSequence) " ").append((CharSequence) "•").append((CharSequence) " ").append((CharSequence) str3);
        }
        TextView textView2 = c41059IGc.A00;
        textView2.setText(append);
        if (z2) {
            textView2.setTextAppearance(R.style.PrivacyTextStyle);
        }
        if (z) {
            drawable = (Drawable) c41059IGc.A01.getValue();
        } else {
            drawable = null;
        }
        textView2.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public static final Drawable A00(Context context, int i) {
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.autocomplete_dropdown_header_text_size);
            drawable.setColorFilter(AbstractC167007dF.A09(context, R.attr.textColorSecondary), PorterDuff.Mode.SRC_IN);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            return drawable;
        }
        return null;
    }
}
