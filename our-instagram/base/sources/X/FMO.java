package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FMO {
    public final InterfaceC56392iX A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;

    public FMO(View view) {
        this.A01 = AbstractC166997dE.A0S(view, R.id.row_fb_user_container);
        this.A02 = AbstractC167007dF.A0N(view, R.id.fb_label);
        this.A03 = AbstractC167007dF.A0N(view, R.id.options_label);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.requireViewById(R.id.selectable_user_row_checkbox_view_stub), false, false);
        this.A00 = A01;
        A01.EZv(G0T.A00);
        A01.setVisibility(0);
    }
}
