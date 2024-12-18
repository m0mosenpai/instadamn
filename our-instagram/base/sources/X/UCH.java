package X;

import android.text.Html;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UCH extends LinearLayout {
    public boolean A00;

    public final void A00(int i) {
        View findViewById = findViewById(R.id.special_requirement_warning_layout);
        TextView textView = (TextView) findViewById(R.id.special_requirement_warning_text);
        if (findViewById != null && textView != null) {
            findViewById.setVisibility(0);
            textView.setText(Html.fromHtml(AbstractC25228BEl.A0M(this).getString(i)));
        }
    }

    public final boolean getCheckBoxCheckState() {
        return ((CompoundButton) AbstractC166987dD.A0c(this, R.id.promote_row_checkbox)).isChecked();
    }

    public final void setCheckBox(boolean z) {
        ((CompoundButton) AbstractC166987dD.A0c(this, R.id.promote_row_checkbox)).setChecked(z);
    }

    public final void setPrimaryText(int i) {
        TextView textView = (TextView) findViewById(R.id.primary_text);
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void setSecondaryText(int i) {
        TextView textView = (TextView) findViewById(R.id.secondary_text);
        if (textView != null) {
            textView.setText(i);
        }
    }
}
