package X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.R;

/* renamed from: X.Fqs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35755Fqs implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C32288EKb A01;

    public C35755Fqs(Resources resources, C32288EKb c32288EKb) {
        this.A01 = c32288EKb;
        this.A00 = resources;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        C32288EKb c32288EKb = this.A01;
        TextView textView = new TextView(c32288EKb.requireContext());
        Resources resources = this.A00;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_facebook_circle_filled_16, 0, 0, 0);
        textView.setCompoundDrawablePadding(AbstractC166997dE.A0N(c32288EKb).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        textView.setGravity(17);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        AbstractC166987dD.A1O(c32288EKb.requireContext(), textView, R.color.design_dark_default_color_on_background);
        textView.setTextSize(0, resources.getDimension(R.dimen.abc_text_size_menu_header_material));
        textView.setTypeface(null, 1);
        C35251Fgk.A02(textView, R.color.design_dark_default_color_on_background);
        return textView;
    }
}
