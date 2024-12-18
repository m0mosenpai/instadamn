package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.V5o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67998V5o extends IgLinearLayout {
    public C67998V5o(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, int i) {
        super(context);
        Drawable drawable;
        int i2;
        LayoutInflater.from(context).inflate(R.layout.checklist_status_row_with_text, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.primary_text);
        if (textView != null) {
            if (charSequence2 != null) {
                textView.setText(charSequence2);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.secondary_text);
        if (textView2 != null) {
            if (charSequence3 != null) {
                textView2.setText(charSequence3);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        }
        TextView textView3 = (TextView) findViewById(R.id.circle_text_icon);
        if (textView3 != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    drawable = context.getDrawable(R.drawable.circle_check_in_primary_button_color_filled_24);
                    textView3.setBackgroundDrawable(drawable);
                    textView3.setVisibility(0);
                } else {
                    drawable = context.getDrawable(R.drawable.circle_in_primary_button_color_filled_24);
                    textView3.setText(charSequence);
                    i2 = R.attr.igds_color_text_on_color;
                }
            } else {
                drawable = context.getDrawable(R.drawable.circle_in_tertiary_icon_color_filled_24);
                textView3.setText(charSequence);
                i2 = R.attr.igds_color_primary_text;
            }
            AbstractC166987dD.A1O(context, textView3, AbstractC53242c7.A0H(context, i2));
            textView3.setBackgroundDrawable(drawable);
            textView3.setVisibility(0);
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        if (progressBar != null) {
            if (i == -1) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setProgress(i);
                progressBar.setVisibility(0);
            }
        }
    }
}
