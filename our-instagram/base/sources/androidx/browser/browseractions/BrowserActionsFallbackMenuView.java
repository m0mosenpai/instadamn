package androidx.browser.browseractions;

import X.AbstractC63123SdR;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;

@Deprecated
/* loaded from: classes11.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int A00;
    public final int A01;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.A01 = resources.getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material);
        this.A00 = resources.getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.A01 * 2), this.A00), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), i2);
    }
}
