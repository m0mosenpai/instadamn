package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public final class FKU {
    public View A00;
    public final Context A01;
    public final C31290DpC A02;

    public FKU(Context context, C31290DpC c31290DpC) {
        this.A01 = context;
        this.A02 = c31290DpC;
        View inflate = View.inflate(context, R.layout.layout_igds_banner_with_cta, null);
        C14360o3.A07(inflate);
        this.A00 = inflate;
        AbstractC31176DnK.A0D(inflate, R.id.icon).setImageResource(R.drawable.instagram_alert_check_pano_outline_24);
        View view = this.A00;
        TextView A0C = AbstractC31178DnM.A0C(view);
        Context context2 = this.A01;
        AbstractC166987dD.A1P(context2, A0C, 2131963938);
        AbstractC166987dD.A1P(context2, AbstractC167007dF.A0N(view, R.id.body), 2131963936);
        View view2 = this.A00;
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(view2, R.id.cta_button);
        igdsButton.setText(this.A01.getString(2131963937));
        ViewOnClickListenerC35691FpR.A01(igdsButton, 55, this);
        ViewOnClickListenerC35691FpR.A01(AbstractC166997dE.A0S(view2, R.id.dismiss_button), 56, this);
    }
}
