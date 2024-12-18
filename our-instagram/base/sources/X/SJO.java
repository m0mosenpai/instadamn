package X;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class SJO {
    public final View A00;
    public final View A01;
    public final Button A02;
    public final EditText A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final Toolbar A09;
    public final Group A0A;

    public SJO(View view) {
        this.A09 = (Toolbar) view.requireViewById(R.id.toolbar);
        this.A08 = AbstractC31180DnO.A06(view);
        this.A04 = AbstractC166997dE.A0T(view, R.id.description);
        this.A01 = view.requireViewById(R.id.progress_bar_layout);
        this.A05 = AbstractC166997dE.A0T(view, R.id.error_text_view);
        this.A03 = (EditText) view.requireViewById(R.id.cvv_text_field);
        this.A07 = AbstractC166997dE.A0T(view, R.id.text_field_hint);
        this.A02 = (Button) view.requireViewById(R.id.authorize_button);
        this.A06 = AbstractC166997dE.A0T(view, R.id.fb_payment_terms);
        this.A00 = view.requireViewById(R.id.paypal_login_webview_container);
        this.A0A = (Group) view.requireViewById(R.id.paypal_webview_hide_other_elements);
    }
}
