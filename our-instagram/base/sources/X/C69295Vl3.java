package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Vl3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69295Vl3 {
    public final TextView A00;
    public final TextView A01;
    public final IgdsButton A02;
    public final IgdsButton A03;
    public final View A04;

    public C69295Vl3(View view) {
        C14360o3.A0B(view, 1);
        this.A04 = view;
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.inform_title);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.inform_body);
        this.A02 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.inform_action);
        this.A03 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.see_results_button);
    }
}
