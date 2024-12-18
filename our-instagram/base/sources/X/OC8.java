package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OC8 {
    public final int A00;
    public final int A01;
    public final LinearLayout A02;
    public final String A03;

    public OC8(View view) {
        View A0U = AbstractC167017dG.A0U(AbstractC43594JPz.A0E(view), C143726eF.A0B(AbstractC166997dE.A0L(view)) ? R.id.reel_type_selector_stub_above_toolbar : R.id.reel_type_selector_stub);
        C14360o3.A0C(A0U, AbstractC111324zv.A00(4));
        LinearLayout linearLayout = (LinearLayout) A0U;
        this.A02 = linearLayout;
        Resources resources = linearLayout.getResources();
        Context context = linearLayout.getContext();
        this.A01 = context.getColor(R.color.bright_foreground_disabled_material_dark);
        this.A00 = context.getColor(R.color.design_dark_default_color_on_background);
        this.A03 = resources.getString(2131974549);
    }
}
