package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class EZK extends IgLinearLayout {
    public final IgSimpleImageView A00;
    public final IgTextView A01;

    public EZK(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.pinnables_footer_button, (ViewGroup) this, true);
        this.A01 = AbstractC31172DnG.A0Y(this, R.id.pinnables_footer_button_label);
        this.A00 = (IgSimpleImageView) findViewById(R.id.pinnables_footer_button_icon);
    }

    public final void setLabel(Integer num) {
        IgSimpleImageView igSimpleImageView;
        LinearLayout.LayoutParams layoutParams;
        if (num != null) {
            IgTextView igTextView = this.A01;
            AbstractC166987dD.A1P(getContext(), igTextView, num.intValue());
            igTextView.setVisibility(0);
            igSimpleImageView = this.A00;
            layoutParams = new LinearLayout.LayoutParams(igSimpleImageView.getLayoutParams());
            layoutParams.setMargins(AbstractC166997dE.A05(getResources()), 0, 0, 0);
        } else {
            IgTextView igTextView2 = this.A01;
            AbstractC31171DnF.A14(igTextView2);
            igTextView2.setVisibility(8);
            igSimpleImageView = this.A00;
            layoutParams = new LinearLayout.LayoutParams(igSimpleImageView.getLayoutParams());
            Resources resources = getResources();
            layoutParams.setMargins(resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), 0, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), 0);
        }
        igSimpleImageView.setLayoutParams(layoutParams);
    }

    public final void setIcon(int i) {
        this.A00.setImageResource(i);
    }
}
